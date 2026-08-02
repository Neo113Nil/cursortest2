package io.agora.mediaplayer;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class ContentFileReader {
    private static final String TAG = "ContentFileReader";
    private FileInputStream fileInputStream = null;
    private FileChannel fileChannel = null;
    private ParcelFileDescriptor pfd = null;

    @CalledByNative
    public ContentFileReader() {
        Logging.v(TAG, "constructor");
    }

    @CalledByNative
    public void closeFile() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e10) {
                e10.printStackTrace();
                Logging.e(TAG, "closeFile Step1 error: " + e10.getMessage());
            }
            this.fileChannel = null;
        }
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
                Logging.e(TAG, "ContentFileReader closeFile Step2 error: " + e11.getMessage());
            }
            this.fileInputStream = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.pfd;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e12) {
                e12.printStackTrace();
                Logging.e(TAG, "ContentFileReader closeFile Step3 error: " + e12.getMessage());
            }
            this.pfd = null;
        }
    }

    @CalledByNative
    public long getCurrentPosition() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            return fileChannel.position();
        } catch (Exception e10) {
            e10.printStackTrace();
            Logging.e(TAG, "AssetsFileReader read error: " + e10.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public long getFileSize() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            return fileChannel.size();
        } catch (Exception e10) {
            e10.printStackTrace();
            Logging.e(TAG, "getFileSize error:" + e10.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public int open(String str) {
        Uri parse = Uri.parse(str);
        if (this.fileInputStream != null) {
            Logging.e(TAG, "has opened file ");
            return -2;
        }
        try {
            this.pfd = ContextUtils.getApplicationContext().getContentResolver().openFileDescriptor(parse, "r");
            FileInputStream fileInputStream = new FileInputStream(this.pfd.getFileDescriptor());
            this.fileInputStream = fileInputStream;
            this.fileChannel = fileInputStream.getChannel();
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            Logging.e(TAG, "open error:" + e10.getMessage());
            closeFile();
            return -3;
        }
    }

    @CalledByNative
    public int read(ByteBuffer byteBuffer) {
        if (this.fileChannel == null) {
            return -2;
        }
        byteBuffer.clear();
        try {
            return this.fileChannel.read(byteBuffer);
        } catch (IOException e10) {
            e10.printStackTrace();
            Logging.e(TAG, "ContentFileReader read error: " + e10.getMessage());
            return -2;
        }
    }

    @CalledByNative
    public long seek(long j10) {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            fileChannel.position(j10);
            return j10;
        } catch (Exception e10) {
            e10.printStackTrace();
            Logging.e(TAG, "seek error: " + e10.getMessage());
            return -2L;
        }
    }
}
