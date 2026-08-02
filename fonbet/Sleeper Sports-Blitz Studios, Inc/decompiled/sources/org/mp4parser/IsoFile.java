package org.mp4parser;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import org.mp4parser.boxes.iso14496.part12.MovieBox;
import org.mp4parser.support.DoNotParseDetail;

@DoNotParseDetail
/* loaded from: classes10.dex */
public class IsoFile extends BasicContainer implements Closeable {
    private FileInputStream fis;
    private final ReadableByteChannel readableByteChannel;

    public IsoFile(String str) throws IOException {
        this(new File(str));
    }

    public IsoFile(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        this.fis = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.readableByteChannel = channel;
        initContainer(channel, -1L, new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(ReadableByteChannel readableByteChannel) throws IOException {
        this(readableByteChannel, new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(ReadableByteChannel readableByteChannel, BoxParser boxParser) throws IOException {
        this.readableByteChannel = readableByteChannel;
        initContainer(readableByteChannel, -1L, boxParser);
    }

    public static byte[] fourCCtoBytes(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    public static String bytesToFourCC(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        }
        return new String(bArr2, StandardCharsets.ISO_8859_1);
    }

    public long getSize() {
        return getContainerSize();
    }

    public MovieBox getMovieBox() {
        for (Box box : getBoxes()) {
            if (box instanceof MovieBox) {
                return (MovieBox) box;
            }
        }
        return null;
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writeContainer(writableByteChannel);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.readableByteChannel.close();
        FileInputStream fileInputStream = this.fis;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        for (Box box : getBoxes()) {
            if (box instanceof Closeable) {
                ((Closeable) box).close();
            }
        }
    }

    @Override // org.mp4parser.BasicContainer
    public String toString() {
        return "model(" + this.readableByteChannel + ")";
    }
}
