package io.agora.mediaplayer;

import android.content.res.AssetFileDescriptor;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class AssetsFileReader {
    public static final String PREFIX_ASSETS = "/assets/";
    private static final String TAG = "AssetsFileReader";
    private FileInputStream fileInputStream = null;
    private FileChannel fileChannel = null;
    private AssetFileDescriptor afd = null;
    private long startOffset_ = 0;
    private long length_ = 0;

    @CalledByNative
    public AssetsFileReader() {
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
                Logging.e(TAG, "AssetsFileReader closeFile Step1 error: " + e10.getMessage());
            }
            this.fileChannel = null;
        }
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step2 error: " + e11.getMessage());
            }
            this.fileInputStream = null;
        }
        AssetFileDescriptor assetFileDescriptor = this.afd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException e12) {
                e12.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step3 error: " + e12.getMessage());
            }
            this.afd = null;
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
            Logging.e(TAG, " read error: " + e10.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public long getFileSize() {
        if (this.fileChannel == null) {
            return -2L;
        }
        try {
            return this.length_;
        } catch (Exception e10) {
            e10.printStackTrace();
            Logging.e(TAG, "getFileSize error:" + e10.getMessage());
            return -2L;
        }
    }

    @CalledByNative
    public int open(String str) {
        if (this.fileInputStream != null) {
            Logging.e(TAG, "has opened file ");
            return -2;
        }
        try {
            AssetFileDescriptor openFd = ContextUtils.getApplicationContext().getAssets().openFd(str.substring(str.indexOf("/assets/") + 8));
            this.afd = openFd;
            this.startOffset_ = openFd.getStartOffset();
            this.length_ = this.afd.getLength();
            FileInputStream createInputStream = this.afd.createInputStream();
            this.fileInputStream = createInputStream;
            this.fileChannel = createInputStream.getChannel();
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
            long position = this.fileChannel.position();
            if (position - this.startOffset_ > this.length_) {
                return -1;
            }
            long read = this.fileChannel.read(byteBuffer);
            long j10 = (position + read) - this.startOffset_;
            long j11 = this.length_;
            if (j10 > j11) {
                read -= j10 - j11;
            }
            return (int) read;
        } catch (IOException e10) {
            e10.printStackTrace();
            Logging.e(TAG, "AssetsFileReader read error: " + e10.getMessage());
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
            fileChannel.position(this.startOffset_ + j10);
            return j10;
        } catch (Exception e10) {
            e10.printStackTrace();
            Logging.e(TAG, "AssetsFileReader seek error: " + e10.getMessage());
            return -2L;
        }
    }
}
