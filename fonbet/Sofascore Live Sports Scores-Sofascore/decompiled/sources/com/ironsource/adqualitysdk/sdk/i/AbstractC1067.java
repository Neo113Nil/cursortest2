package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import defpackage.is8;
import defpackage.vp2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯨ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC1067 {
    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m632(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance(StringFog.decrypt("vxCcPobKKA==\n", "7FjdE7T/HgY=\n")).digest(str.getBytes(StringFog.decrypt("Yzuvvts=\n", "Nm/pk+PByuI=\n")));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(String.format(StringFog.decrypt("bzqMWQ==\n", "Sgq+ITfXNyQ=\n"), Integer.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            is8.h(e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            vp2.e(StringFog.decrypt("encuG9kVHSBHUBsWilZKaUVeDVqO\n", "KT9vNusgKwA=\n"), e2);
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m633(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    break;
                }
            } else {
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    arrayList.add(matcher.group(i));
                    if (z) {
                        break loop0;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int m635(String str, String str2) {
        String[] split = str.replaceAll(StringFog.decrypt("bK/7yjI5Xg==\n", "N/HL5wsXA7c=\n"), "").split(StringFog.decrypt("VBk=\n", "CDeg2oa7Egg=\n"));
        String[] split2 = str2.replaceAll(StringFog.decrypt("L6iPFVY+ew==\n", "dPa/OG8QJls=\n"), "").split(StringFog.decrypt("lUg=\n", "yWaiTDr2CaY=\n"));
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        return (i >= split.length || i >= split2.length) ? Integer.signum(split.length - split2.length) : Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m634(String str) {
        Handler handler = AbstractC1008.f3252;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m638(String str, int i) {
        return !TextUtils.isEmpty(str) && str.length() >= 1 && str.length() <= i;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m637(String str, String str2, boolean z) {
        if (z && !TextUtils.isEmpty(str2)) {
            if (!str2.startsWith(StringFog.decrypt("ig==\n", "1NHM8YOFle0=\n"))) {
                str2 = ceo.e("hjZTAKfjidU=\n", "2G0Pc/uw1P8=\n", str2);
            }
            if (!str2.endsWith(StringFog.decrypt("jw==\n", "q2J9KD/NWbU=\n"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                str2 = AbstractC1133.m662("8Gxz34braA==\n", "qzAAg9W2Qkg=\n", sb);
            }
        }
        ArrayList m633 = m633(str, str2, true);
        if (m633.size() > 0) {
            return (String) m633.get(0);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m636(String str) {
        if (str != null) {
            Handler handler = AbstractC1008.f3252;
            if (Looper.myLooper() != Looper.getMainLooper() && m634(str)) {
                int i = 0;
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = gZIPInputStream.read(bArr, i, 8192 - i);
                        if (read == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, StringFog.decrypt("d7hKBIQ=\n", "IuwMKbxfGFU=\n"));
                        }
                        i += read;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
