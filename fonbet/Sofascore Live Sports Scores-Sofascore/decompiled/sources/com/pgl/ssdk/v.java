package com.pgl.ssdk;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.pgl.ssdk.g;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class v {
    private static String a = null;
    private static String b = null;
    private static Boolean c = null;
    private static String d = null;
    private static String e = null;
    private static String f = null;
    private static int g = -1;
    private static long h;
    private static long i;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0023, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0026, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x001f, code lost:
    
        if (r1 == null) goto L14;
     */
    @DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static e a(File file) {
        RandomAccessFile randomAccessFile;
        List<e> list;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                q a2 = r.a(randomAccessFile, 0L, randomAccessFile.length());
                list = l.a(a2, c.a(a2));
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
            } catch (g.a unused2) {
            } catch (Throwable unused3) {
            }
        } catch (g.a unused4) {
            randomAccessFile = null;
        } catch (Throwable unused5) {
            randomAccessFile = null;
        }
        if (list != null || list.isEmpty()) {
            list = k.a(file);
        }
        if (list != null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
        list = null;
        if (list != null) {
        }
        list = k.a(file);
        if (list != null) {
        }
        return null;
    }

    private static String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put("sign", a);
            }
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("subject", d);
            }
            if (!TextUtils.isEmpty(e)) {
                jSONObject.put("md5", e);
            }
            if (!TextUtils.isEmpty(f)) {
                jSONObject.put("path", f);
            }
            long j = h;
            if (j != 0) {
                jSONObject.put("apkSize", j);
            }
            long j2 = i;
            if (j2 != 0) {
                jSONObject.put("dexSize", j2);
            }
            int i2 = g;
            if (i2 != -1) {
                jSONObject.put("code", i2);
            }
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("signpm", b);
            }
            jSONObject.put("rebud", a());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c(File file) {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                byte[] bArr = new byte[ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES];
                while (true) {
                    int read = randomAccessFile2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                while (bigInteger.length() < 32) {
                    bigInteger = "0".concat(bigInteger);
                }
                try {
                    randomAccessFile2.close();
                } catch (IOException unused) {
                }
                return bigInteger;
            } catch (IOException | NoSuchAlgorithmException unused2) {
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile == null) {
                    return "";
                }
                try {
                    randomAccessFile.close();
                    return "";
                } catch (IOException unused3) {
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException | NoSuchAlgorithmException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void d() {
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
            f();
        }
        String e2 = e();
        if (TextUtils.isEmpty(e2)) {
            return;
        }
        File file = new File(e2);
        if (file.exists() && file.canRead()) {
            h = file.length();
            i = b(file);
            e = c(file);
            if (g == -1 || TextUtils.isEmpty(f)) {
                Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), e2);
                Integer num = (Integer) objArr[0];
                String str = (String) objArr[1];
                if (str != null) {
                    f = str;
                }
                if (num != null) {
                    g = num.intValue();
                }
            }
        }
    }

    public static String e() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void f() {
        String e2 = e();
        if (TextUtils.isEmpty(e2)) {
            return;
        }
        File file = new File(e2);
        if (file.exists() && file.canRead()) {
            e a2 = a(file);
            if (a2 != null) {
                a = a(a2.a());
                d = a2.b();
            }
            b = g();
        }
    }

    public static String g() {
        try {
            return a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean h() {
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
            f();
        }
        return a();
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static boolean a() {
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(a)) {
            return false;
        }
        boolean z = !b.equals(a);
        c = Boolean.valueOf(z);
        return z;
    }

    public static String c() {
        if (TextUtils.isEmpty(e) || TextUtils.isEmpty(a) || TextUtils.isEmpty(f) || TextUtils.isEmpty(b)) {
            d();
        }
        return b();
    }

    public static long b(File file) {
        String format;
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            int i2 = 1;
            long j = 0;
            while (true) {
                if (i2 == 1) {
                    format = "classes.dex";
                } else {
                    format = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i2));
                }
                ZipEntry entry = zipFile2.getEntry(format);
                if (entry != null) {
                    try {
                        j += entry.getSize();
                        i2++;
                    } catch (IOException unused) {
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return 0L;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    try {
                        break;
                    } catch (IOException unused4) {
                    }
                }
            }
            zipFile2.close();
            return j;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
