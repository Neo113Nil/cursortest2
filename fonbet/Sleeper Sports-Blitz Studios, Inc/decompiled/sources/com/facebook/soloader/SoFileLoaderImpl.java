package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes6.dex */
public class SoFileLoaderImpl implements SoFileLoader {
    private static final String TAG = "SoFileLoaderImpl";

    @Nullable
    private final Runtime mRuntime = null;

    @Nullable
    private final Method mNativeLoadRuntimeMethod = null;

    @Nullable
    private final String mLocalLdLibraryPath = null;

    @Nullable
    private final String mLocalLdLibraryPathNoZips = null;

    @Override // com.facebook.soloader.SoFileLoader
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i) {
        throw new UnsupportedOperationException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x007a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.facebook.soloader.SoFileLoader
    public void load(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.reflect.Method r1 = r7.mNativeLoadRuntimeMethod
            if (r1 != 0) goto La
            java.lang.System.load(r8)
            return
        La:
            r1 = 4
            r9 = r9 & r1
            if (r9 != r1) goto L11
            java.lang.String r9 = r7.mLocalLdLibraryPath
            goto L13
        L11:
            java.lang.String r9 = r7.mLocalLdLibraryPathNoZips
        L13:
            r1 = 0
            java.lang.Runtime r2 = r7.mRuntime     // Catch: java.lang.Throwable -> L7d java.lang.reflect.InvocationTargetException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.IllegalAccessException -> L83
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7d java.lang.reflect.InvocationTargetException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.IllegalAccessException -> L83
            java.lang.reflect.Method r3 = r7.mNativeLoadRuntimeMethod     // Catch: java.lang.Throwable -> L7a
            java.lang.Runtime r4 = r7.mRuntime     // Catch: java.lang.Throwable -> L7a
            java.lang.Class<com.facebook.soloader.SoLoader> r5 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r5 = new java.lang.Object[]{r8, r5, r9}     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L7a
            if (r3 != 0) goto L5b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L57
            java.lang.String r0 = "SoFileLoaderImpl"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error when loading library: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ", library hash is "
            r1.append(r2)
            java.lang.String r8 = r7.getLibHash(r8)
            r1.append(r8)
            java.lang.String r8 = ", LD_LIBRARY_PATH is "
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = r1.toString()
            com.facebook.soloader.LogUtil.e(r0, r8)
        L57:
            return
        L58:
            r0 = move-exception
            r1 = r3
            goto L7b
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L58
            r1.append(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch: java.lang.Throwable -> L58
            r1.append(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L58
            com.facebook.soloader.SoLoaderULError r1 = new com.facebook.soloader.SoLoaderULError     // Catch: java.lang.Throwable -> L75
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L75
            throw r1     // Catch: java.lang.Throwable -> L75
        L75:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L7b
        L7a:
            r0 = move-exception
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7d java.lang.reflect.InvocationTargetException -> L7f java.lang.IllegalArgumentException -> L81 java.lang.IllegalAccessException -> L83
        L7d:
            r0 = move-exception
            goto La3
        L7f:
            r0 = move-exception
            goto L84
        L81:
            r0 = move-exception
            goto L84
        L83:
            r0 = move-exception
        L84:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = "nativeLoad() error during invocation for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7d
            r2.append(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = ": "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7d
            r2.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L7d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7d
            throw r0     // Catch: java.lang.Throwable -> L7d
        La3:
            if (r1 == 0) goto Lcc
            java.lang.String r2 = "SoFileLoaderImpl"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error when loading library: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ", library hash is "
            r3.append(r1)
            java.lang.String r8 = r7.getLibHash(r8)
            r3.append(r8)
            java.lang.String r8 = ", LD_LIBRARY_PATH is "
            r3.append(r8)
            r3.append(r9)
            java.lang.String r8 = r3.toString()
            com.facebook.soloader.LogUtil.e(r2, r8)
        Lcc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoFileLoaderImpl.load(java.lang.String, int):void");
    }

    private String getLibHash(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return format;
                    }
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
}
