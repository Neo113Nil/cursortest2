package com.mbridge.msdk.foundation.tools;

import com.vk.dto.common.ImageSizeKey;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: SameFileMD5.java */
/* loaded from: classes13.dex */
public class n0 {
    protected static char[] a = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest b = null;
    private static String c = "SameFileMD5";

    static {
        try {
            b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e) {
            System.err.println(n0.class.getName().concat("初始化失败，MessageDigest不支持MD5Util."));
            e.printStackTrace();
        }
    }

    public static String a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        MessageDigest messageDigest;
        if (file == null || !file.exists()) {
            return "";
        }
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[10485760];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    String a2 = a(messageDigest.digest());
                    try {
                        randomAccessFile.close();
                        return a2;
                    } catch (IOException e) {
                        q0.b(c, e.getMessage());
                        return a2;
                    }
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                q0.b(c, th.getMessage());
                return "";
            } finally {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e2) {
                        q0.b(c, e2.getMessage());
                    }
                }
            }
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static String a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = a;
        char c2 = cArr[(b2 & 240) >> 4];
        char c3 = cArr[b2 & AmfConstants.TYPE_XML_DOCUMENT_MARKER];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }
}
