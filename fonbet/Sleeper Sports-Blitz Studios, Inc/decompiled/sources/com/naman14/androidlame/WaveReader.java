package com.naman14.androidlame;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes8.dex */
public class WaveReader {
    private static final int STREAM_BUFFER_SIZE = 4096;
    private static final int WAV_DATA_CHUNK_ID = 1684108385;
    private static final int WAV_FORMAT = 1463899717;
    private static final int WAV_FORMAT_CHUNK_ID = 1718449184;
    private static final int WAV_HEADER_CHUNK_ID = 1380533830;
    private int mChannels;
    private int mDataSize;
    private int mFileSize;
    private File mInFile;
    private BufferedInputStream mInStream;
    private int mSampleBits;
    private int mSampleRate;

    private static short byteToShortLE(byte b, byte b2) {
        return (short) ((b & 255) | ((b2 & 255) << 8));
    }

    public WaveReader(String str, String str2) {
        this.mInFile = new File(str + File.separator + str2);
    }

    public WaveReader(File file) {
        this.mInFile = file;
    }

    public void openWave() throws FileNotFoundException, InvalidWaveException, IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.mInFile), 4096);
        this.mInStream = bufferedInputStream;
        int readUnsignedInt = readUnsignedInt(bufferedInputStream);
        if (readUnsignedInt != 1380533830) {
            throw new InvalidWaveException(String.format("Invalid WAVE header chunk ID: %d", Integer.valueOf(readUnsignedInt)));
        }
        this.mFileSize = readUnsignedIntLE(this.mInStream);
        if (readUnsignedInt(this.mInStream) != 1463899717) {
            throw new InvalidWaveException("Invalid WAVE format");
        }
        if (readUnsignedInt(this.mInStream) != 1718449184) {
            throw new InvalidWaveException("Invalid WAVE format chunk ID");
        }
        readUnsignedIntLE(this.mInStream);
        if (readUnsignedShortLE(this.mInStream) != 1) {
            throw new InvalidWaveException("Not PCM WAVE format");
        }
        this.mChannels = readUnsignedShortLE(this.mInStream);
        this.mSampleRate = readUnsignedIntLE(this.mInStream);
        readUnsignedIntLE(this.mInStream);
        readUnsignedShortLE(this.mInStream);
        this.mSampleBits = readUnsignedShortLE(this.mInStream);
        if (readUnsignedInt(this.mInStream) != 1684108385) {
            throw new InvalidWaveException("Invalid WAVE data chunk ID");
        }
        this.mDataSize = readUnsignedIntLE(this.mInStream);
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public int getPcmFormat() {
        return this.mSampleBits;
    }

    public int getFileSize() {
        return this.mFileSize + 8;
    }

    public int getDataSize() {
        return this.mDataSize;
    }

    public int getLength() {
        int i;
        int i2 = this.mSampleRate;
        if (i2 == 0 || (i = this.mChannels) == 0) {
            return 0;
        }
        int i3 = this.mSampleBits;
        if ((i3 + 7) / 8 == 0) {
            return 0;
        }
        return this.mDataSize / ((i2 * i) * ((i3 + 7) / 8));
    }

    public int read(short[] sArr, int i) throws IOException {
        if (this.mChannels != 1) {
            return -1;
        }
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        int read = this.mInStream.read(bArr, 0, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < read; i4 += 2) {
            sArr[i3] = byteToShortLE(bArr[i4], bArr[i4 + 1]);
            i3++;
        }
        return i3;
    }

    public int read(short[] sArr, short[] sArr2, int i) throws IOException {
        if (this.mChannels != 2) {
            return -1;
        }
        int i2 = i * 4;
        byte[] bArr = new byte[i2];
        int read = this.mInStream.read(bArr, 0, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < read; i4 += 2) {
            short byteToShortLE = byteToShortLE(bArr[0], bArr[i4 + 1]);
            if (i4 % 4 == 0) {
                sArr[i3] = byteToShortLE;
            } else {
                sArr2[i3] = byteToShortLE;
                i3++;
            }
        }
        return i3;
    }

    public void closeWaveFile() throws IOException {
        BufferedInputStream bufferedInputStream = this.mInStream;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
    }

    private static int readUnsignedInt(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = new byte[4];
        if (bufferedInputStream.read(bArr) == -1) {
            return -1;
        }
        return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    private static int readUnsignedIntLE(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = new byte[4];
        if (bufferedInputStream.read(bArr) == -1) {
            return -1;
        }
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
    }

    private static short readUnsignedShortLE(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = new byte[2];
        if (bufferedInputStream.read(bArr, 0, 2) == -1) {
            return (short) -1;
        }
        return byteToShortLE(bArr[0], bArr[1]);
    }

    public class InvalidWaveException extends IOException {
        private static final long serialVersionUID = -8229742633848759378L;

        public InvalidWaveException() {
        }

        public InvalidWaveException(String str) {
            super(str);
        }
    }
}
