package com.facebook.soloader;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import xsna.t33;

/* loaded from: classes12.dex */
public class SoFileLoaderImpl implements SoFileLoader {
    private static final String TAG = "SoFileLoaderImpl";
    private final Runtime mRuntime = null;
    private final Method mNativeLoadRuntimeMethod = null;
    private final String mLocalLdLibraryPath = null;
    private final String mLocalLdLibraryPathNoZips = null;

    private String getLibHash(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return format;
                    }
                    messageDigest.update(bArr, 0, read);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            return e.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r3 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r1 = xsna.t33.a("Error when loading library: ", r3, ", library hash is ");
        r1.append(getLibHash(r7));
        r1.append(", LD_LIBRARY_PATH is ");
        r1.append(r8);
        com.facebook.soloader.LogUtil.e(com.facebook.soloader.SoFileLoaderImpl.TAG, r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    @Override // com.facebook.soloader.SoFileLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void load(String str, int i) {
        if (this.mNativeLoadRuntimeMethod == null) {
            System.load(str);
            return;
        }
        String str2 = (i & 4) == 4 ? this.mLocalLdLibraryPath : this.mLocalLdLibraryPathNoZips;
        try {
            try {
                synchronized (this.mRuntime) {
                    try {
                        String str3 = (String) this.mNativeLoadRuntimeMethod.invoke(this.mRuntime, str, SoLoader.class.getClassLoader(), str2);
                        try {
                            if (str3 != null) {
                                throw new SoLoaderULError(str, "nativeLoad() returned error for " + str + ": " + str3);
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                if (0 != 0) {
                    StringBuilder a = t33.a("Error when loading library: ", null, ", library hash is ");
                    a.append(getLibHash(str));
                    a.append(", LD_LIBRARY_PATH is ");
                    a.append(str2);
                    LogUtil.e(TAG, a.toString());
                }
                throw th3;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException("nativeLoad() error during invocation for " + str + ": " + e);
        }
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i) {
        throw new UnsupportedOperationException();
    }
}
