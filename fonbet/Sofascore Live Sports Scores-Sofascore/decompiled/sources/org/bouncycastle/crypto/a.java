package org.bouncycastle.crypto;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.aii;
import defpackage.fef;
import defpackage.flg;
import defpackage.j4d;
import defpackage.k4d;
import defpackage.vp2;
import defpackage.w99;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.jar.JarException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public abstract class a {
    public static final Logger a = Logger.getLogger(a.class.getName());
    public static String b = "Driver load not attempted";
    public static String c = null;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    static {
        c();
    }

    public static File a(File file, String str, String str2) {
        InputStream resourceAsStream = a.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new JarException(str.concat(" lib not found in jar"));
        }
        File file2 = new File(file, str2);
        if (file2.exists()) {
            Level level = Level.FINE;
            Logger logger = a;
            if (logger.isLoggable(level)) {
                logger.fine("installation target exists: " + file2.getAbsolutePath());
            }
            FileInputStream fileInputStream = new FileInputStream(file2);
            byte[] d2 = d(fileInputStream);
            fileInputStream.close();
            if (logger.isLoggable(level)) {
                logger.fine("existing file digest: ".concat(w99.b(d2)));
            }
            byte[] d3 = d(resourceAsStream);
            resourceAsStream.close();
            if (logger.isLoggable(level)) {
                logger.fine("new file digest: ".concat(w99.b(d3)));
            }
            if (d2 != d3) {
                int i = 0;
                for (int i2 = 0; i2 != 32; i2++) {
                    i |= d2[i2] ^ d3[i2];
                }
                if (i != 0) {
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine("existing file is different and will be replaced");
                    }
                    resourceAsStream = a.class.getResourceAsStream(str);
                }
            }
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("existing file already exists and is the same");
            }
            return file2;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = resourceAsStream.read(bArr, 0, 4096);
            if (read < 0) {
                fileOutputStream.flush();
                fileOutputStream.close();
                resourceAsStream.close();
                return file2;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    public static File b(String str, String str2, String str3, File file, HashSet hashSet) {
        String str4;
        List<String> unmodifiableList;
        String mapLibraryName = System.mapLibraryName(str);
        Level level = Level.FINE;
        Logger logger = a;
        if (logger.isLoggable(level)) {
            logger.fine("attempting to install: " + mapLibraryName);
        }
        try {
            InputStream resourceAsStream = a.class.getResourceAsStream(str3.concat("/deps.list"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = resourceAsStream.read(bArr, 0, 4096);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i = aii.a;
            int length = byteArray.length;
            char[] cArr = new char[length];
            for (int i2 = 0; i2 != length; i2++) {
                cArr[i2] = (char) (byteArray[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            }
            str4 = new String(cArr);
            resourceAsStream.close();
        } catch (Exception unused) {
            str4 = null;
        }
        if (str4 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str5 : str4.split("\n")) {
                String[] split = str5.trim().split(":");
                if (split[0].trim().equals(mapLibraryName)) {
                    arrayList.add(split[1].trim());
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        for (String str6 : unmodifiableList) {
            hashSet.remove(a(file, str3 + "/" + str6, str6));
        }
        File a2 = a(file, str2 + "/" + mapLibraryName, mapLibraryName);
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("installed " + a2);
        }
        hashSet.remove(a2);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0124 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0019, B:6:0x002b, B:10:0x0035, B:14:0x0049, B:16:0x0050, B:18:0x0058, B:21:0x006f, B:23:0x0075, B:24:0x007a, B:27:0x0086, B:30:0x0096, B:32:0x00a0, B:33:0x00ae, B:37:0x00d1, B:40:0x00f7, B:42:0x0100, B:44:0x0108, B:47:0x0111, B:51:0x0124, B:54:0x014a, B:56:0x0150, B:57:0x015e, B:59:0x0164, B:60:0x0169, B:64:0x0178, B:66:0x017e, B:67:0x0191, B:69:0x019e, B:71:0x01a6, B:73:0x01b0, B:75:0x01b6, B:76:0x01ba, B:78:0x01c0, B:80:0x01e3, B:82:0x0206, B:83:0x021a, B:85:0x023e, B:87:0x0254, B:90:0x0281, B:92:0x02a1, B:96:0x02d9, B:98:0x02dc, B:102:0x02ee, B:104:0x02f6, B:108:0x0316, B:109:0x0318, B:111:0x033b, B:113:0x0358, B:114:0x0361, B:116:0x0367, B:118:0x0373, B:120:0x037c, B:123:0x0384, B:126:0x03c1, B:127:0x03ca, B:129:0x03d6, B:132:0x0411, B:134:0x041f, B:139:0x042b, B:146:0x048f, B:143:0x045d, B:150:0x0263, B:156:0x00ba, B:158:0x00c2, B:101:0x02e8), top: B:3:0x0019, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0019, B:6:0x002b, B:10:0x0035, B:14:0x0049, B:16:0x0050, B:18:0x0058, B:21:0x006f, B:23:0x0075, B:24:0x007a, B:27:0x0086, B:30:0x0096, B:32:0x00a0, B:33:0x00ae, B:37:0x00d1, B:40:0x00f7, B:42:0x0100, B:44:0x0108, B:47:0x0111, B:51:0x0124, B:54:0x014a, B:56:0x0150, B:57:0x015e, B:59:0x0164, B:60:0x0169, B:64:0x0178, B:66:0x017e, B:67:0x0191, B:69:0x019e, B:71:0x01a6, B:73:0x01b0, B:75:0x01b6, B:76:0x01ba, B:78:0x01c0, B:80:0x01e3, B:82:0x0206, B:83:0x021a, B:85:0x023e, B:87:0x0254, B:90:0x0281, B:92:0x02a1, B:96:0x02d9, B:98:0x02dc, B:102:0x02ee, B:104:0x02f6, B:108:0x0316, B:109:0x0318, B:111:0x033b, B:113:0x0358, B:114:0x0361, B:116:0x0367, B:118:0x0373, B:120:0x037c, B:123:0x0384, B:126:0x03c1, B:127:0x03ca, B:129:0x03d6, B:132:0x0411, B:134:0x041f, B:139:0x042b, B:146:0x048f, B:143:0x045d, B:150:0x0263, B:156:0x00ba, B:158:0x00c2, B:101:0x02e8), top: B:3:0x0019, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void c() {
        String str;
        boolean z;
        String str2;
        synchronized (a.class) {
            Logger logger = a;
            Level level = Level.FINE;
            logger.log(level, "native loader start");
            if (d.getAndSet(true)) {
                logger.log(level, "native loader already attempted load");
                return;
            }
            String a2 = fef.a("org.bouncycastle.native.cpu_variant");
            if (logger.isLoggable(level)) {
                logger.fine("forced variant is: ".concat(a2 != null ? a2 : " not defined"));
            }
            if ("java".equals(a2)) {
                b = "java support only";
                logger.fine("exited with " + b);
                return;
            }
            if (logger.isLoggable(level)) {
                logger.log(level, "examining properties to determine platform and architecture");
            }
            String str3 = "";
            String a3 = fef.a("os.arch");
            if (a3 != null) {
                str3 = a3;
            }
            String a4 = aii.a(str3);
            String str4 = "";
            String a5 = fef.a("os.name");
            if (a5 != null) {
                str4 = a5;
            }
            String a6 = aii.a(str4);
            if (logger.isLoggable(level)) {
                logger.log(level, "host ARCH: ".concat(a4));
                logger.log(level, "host OS: ".concat(a6));
            }
            String str5 = null;
            if (a6.contains("linux")) {
                str = "linux";
            } else {
                if (!a6.contains("mac") && !a6.contains("darwin")) {
                    str = null;
                }
                str = "darwin";
            }
            if (str == null) {
                b = "OS '" + a6 + "' is not supported.";
                StringBuilder sb = new StringBuilder("exited with ");
                sb.append(b);
                logger.fine(sb.toString());
                return;
            }
            if (!a4.contains("x86") && (!a4.contains("amd") || !a4.contains("64"))) {
                if (a4.contains("aarch64")) {
                    str5 = "arm64";
                    z = true;
                    if (str5 == null) {
                        b = "architecture '" + a4 + "' is not supported";
                        StringBuilder sb2 = new StringBuilder("exited with ");
                        sb2.append(b);
                        logger.fine(sb2.toString());
                        return;
                    }
                    if (logger.isLoggable(level)) {
                        logger.log(level, "derived native platform: ".concat(str));
                        logger.log(level, "derived native architecture: ".concat(str5));
                    }
                    if (logger.isLoggable(level)) {
                        logger.log(level, "begin determining path to install native libraries");
                    }
                    File file = (File) AccessController.doPrivileged(new j4d(0));
                    if (file == null) {
                        return;
                    }
                    if (logger.isLoggable(level)) {
                        logger.log(level, "native library install location: " + file.getAbsolutePath());
                    }
                    HashSet hashSet = new HashSet();
                    for (File file2 : file.listFiles()) {
                        hashSet.add(file2);
                    }
                    if (a.isLoggable(Level.FINE) && !hashSet.isEmpty()) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            a.log(Level.FINE, "found in install location: " + ((File) it.next()).getAbsolutePath());
                        }
                    }
                    String str6 = "/native/" + str + "/" + str5;
                    Logger logger2 = a;
                    Level level2 = Level.FINE;
                    if (logger2.isLoggable(level2)) {
                        logger2.log(level2, "library path within LTS jar: " + str6);
                    }
                    String str7 = "/native/" + str + "/" + str5 + "/probe";
                    if (logger2.isLoggable(level2)) {
                        logger2.log(level2, "begin install probe library from: " + str7);
                    }
                    if (!z) {
                        str2 = "bc-probe";
                    } else {
                        if (!ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                            b = "ARM big-endian is not supported";
                            logger2.fine("exited with " + b);
                            return;
                        }
                        str2 = "bc-probe-le";
                    }
                    InputStream resourceAsStream = a.class.getResourceAsStream(str7 + "/" + System.mapLibraryName(str2));
                    if (resourceAsStream == null) {
                        b = "platform '" + str + "' and architecture '" + str5 + "' are not supported";
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("exited with ");
                        sb3.append(b);
                        logger2.fine(sb3.toString());
                        return;
                    }
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        AccessController.doPrivileged(new k4d(0, b(str2, str7, str6, file, hashSet)));
                        try {
                            String bestVariantName = VariantSelector.getBestVariantName();
                            c = bestVariantName;
                            if ("none".equals(bestVariantName)) {
                                b = "probe returned no suitable CPU features, java support only";
                                a.fine("exited with " + b);
                                return;
                            }
                            if (a2 != null) {
                                c = a2;
                            }
                            try {
                                File b2 = b("bc-lts-" + c, "/native/" + str + "/" + str5 + "/" + c, str6, file, hashSet);
                                if (!hashSet.isEmpty()) {
                                    StringBuilder sb4 = new StringBuilder();
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        File file3 = (File) it2.next();
                                        if (sb4.length() != 0) {
                                            sb4.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                        }
                                        sb4.append(file3.getName());
                                    }
                                    b = "unexpected files in " + file.toString() + ": " + sb4.toString();
                                    Logger logger3 = a;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("exited with ");
                                    sb5.append(b);
                                    logger3.fine(sb5.toString());
                                    return;
                                }
                                AccessController.doPrivileged(new k4d(1, b2));
                                if (c.equals(NativeLibIdentity.a())) {
                                    b = "successfully loaded";
                                    Logger logger4 = a;
                                    Level level3 = Level.FINE;
                                    if (logger4.isLoggable(level3)) {
                                        logger4.log(level3, b);
                                        logger4.fine("native loader has finished");
                                    }
                                    return;
                                }
                                b = "loaded native library variant is " + NativeLibIdentity.a() + " but the requested library variant is " + c;
                                Logger logger5 = a;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("exited with ");
                                sb6.append(b);
                                logger5.fine(sb6.toString());
                                return;
                            } catch (Exception e) {
                                b = "native capabilities lib failed to load " + e.getMessage();
                                a.fine("exited with " + b);
                                return;
                            }
                        } catch (Throwable th) {
                            b = "probe lib failed return a variant " + th.getMessage();
                            a.fine("exited with " + b);
                            return;
                        }
                    } catch (Exception e2) {
                        b = "probe lib failed to load " + e2.getMessage();
                        a.fine("exited with " + b);
                        return;
                    }
                }
                z = false;
                if (str5 == null) {
                }
            }
            str5 = "x86_64";
            z = false;
            if (str5 == null) {
            }
        }
    }

    public static byte[] d(InputStream inputStream) {
        try {
            byte[] bArr = new byte[65535];
            flg flgVar = new flg();
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    byte[] bArr2 = new byte[32];
                    flgVar.e(bArr2);
                    return bArr2;
                }
                flgVar.j(0, read, bArr);
            }
        } catch (IOException e) {
            vp2.e(e.getMessage(), e);
            return null;
        }
    }
}
