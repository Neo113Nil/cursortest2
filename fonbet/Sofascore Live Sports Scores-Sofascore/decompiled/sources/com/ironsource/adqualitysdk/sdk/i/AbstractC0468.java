package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.vp2;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ء, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0468 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1517 = StringFog.decrypt("oKo7hCAzmL4=\n", "7s9P0VRa9M0=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static C1014 m279(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setRequestMethod(StringFog.decrypt("2len\n", "nRLzKEvbPOo=\n"));
            String str2 = AbstractC0370.f1112;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String m282 = m282(httpURLConnection, (String) null);
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            if (responseCode >= 400) {
                httpURLConnection.disconnect();
            }
            return new C1014(m282, responseCode, responseMessage, SystemClock.elapsedRealtime() - elapsedRealtime);
        } catch (Throwable th) {
            String str3 = f1517;
            AbstractC0420.m252(str3, str3, StringFog.decrypt("gHOqSMeOZ8arZbFJ0o5zxrEhqkLE23HQsTv4\n", "xQHYJ7WuFKM=\n") + th.getLocalizedMessage(), th, null, false);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0388 m280(HttpURLConnection httpURLConnection, JSONObject jSONObject, String str, C0931 c0931, Context context) {
        String str2;
        C0332 c0332;
        C0388 c0388;
        Iterator it;
        String path;
        if (c0931 == null || context == null || TextUtils.isEmpty(c0931.f3119)) {
            return null;
        }
        String str3 = c0931.f3119;
        if (str3 == null || str3.trim().isEmpty()) {
            return null;
        }
        if (str != null && !str.isEmpty()) {
            try {
                path = new URL(str).getPath();
            } catch (MalformedURLException unused) {
            }
            if (path != null && !path.isEmpty()) {
                String replaceFirst = path.replaceFirst(StringFog.decrypt("5J8=\n", "urBJwY0cXMY=\n"), "");
                int lastIndexOf = replaceFirst.lastIndexOf(47);
                if (lastIndexOf >= 0) {
                    replaceFirst = replaceFirst.substring(lastIndexOf + 1);
                }
                if (!replaceFirst.isEmpty()) {
                    str2 = replaceFirst;
                    if (str2 != null || (c0332 = C0750.f2474.f2477) == null) {
                        return null;
                    }
                    String uuid = UUID.randomUUID().toString();
                    byte[] bytes = m284(jSONObject).getBytes(StringFog.decrypt("HzzY/xA=\n", "Smie0ijKJ9Y=\n"));
                    C1112 c1112 = c0332.f815;
                    C0386 c0386 = c0332.f819;
                    c0386.getClass();
                    try {
                        byte[] m278 = c0386.f1134.m278();
                        C0486 m335 = c0386.f1135.m335();
                        byte[] bArr = new byte[12];
                        c0386.f1135.f1703.nextBytes(bArr);
                        long currentTimeMillis = System.currentTimeMillis();
                        byte[] m388 = AbstractC0645.m388(bytes);
                        byte[] m336 = c0386.f1135.m336(m335.f1555, m278);
                        byte[] bArr2 = C0506.f1697;
                        byte[] bArr3 = new byte[bArr2.length + 3];
                        c0388 = null;
                    } catch (Exception e) {
                        e = e;
                        c0388 = null;
                    }
                    try {
                        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                        bArr3[bArr2.length] = 0;
                        bArr3[bArr2.length + 1] = 1;
                        bArr3[bArr2.length + 2] = 2;
                        byte[] m337 = c0386.f1135.m337(m336, bArr, bArr3);
                        byte[] m225 = c0386.m225(str2, uuid, currentTimeMillis, c1112);
                        byte[] m224 = C0386.m224(currentTimeMillis, bArr, m335.f1554, m225, c0386.f1135.m334(m337, bArr, m388, m225).f1569);
                        c0332.f822.getClass();
                        C1075 c1075 = new C1075(uuid, m336, System.currentTimeMillis());
                        C0740 c0740 = c0332.f818;
                        c0740.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        it = c0740.f2455.entrySet().iterator();
                        while (it.hasNext()) {
                            if (currentTimeMillis2 - ((C1075) ((Map.Entry) it.next()).getValue()).f3377 > c0740.f2456) {
                                it.remove();
                            }
                        }
                        c0740.f2455.put(c1075.f3379, c1075);
                        httpURLConnection.setRequestProperty(StringFog.decrypt("WBHugAMPmo9PB/CR\n", "G36A9GZh7qI=\n"), StringFog.decrypt("Du8AbL0lZmIG8B4vuyVzcxuyA3SmI2Z7\n", "b59wANRGBxY=\n"));
                        httpURLConnection.setRequestProperty(StringFog.decrypt("MRZL70pY\n", "cHUoijosNsk=\n"), StringFog.decrypt("gcQeKwMnUdSJ2wBoBSdExZSZHTMYIVHN\n", "4LRuR2pEMKA=\n"));
                        httpURLConnection.setRequestProperty(StringFog.decrypt("1mEifg==\n", "rkxNDUzs0XU=\n"), StringFog.decrypt("IA==\n", "QQvn3jno3m4=\n"));
                        httpURLConnection.setDoOutput(true);
                        return new C0388(m224, uuid);
                    } catch (Exception e2) {
                        e = e2;
                        vp2.e(StringFog.decrypt("qWNWaHIqzMaAIl1xfiKIkopsSWF7IZzX\n", "7wI/BBdO7LI=\n"), e);
                        return c0388;
                    }
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            return null;
        }
        String uuid2 = UUID.randomUUID().toString();
        byte[] bytes2 = m284(jSONObject).getBytes(StringFog.decrypt("HzzY/xA=\n", "Smie0ijKJ9Y=\n"));
        C1112 c11122 = c0332.f815;
        C0386 c03862 = c0332.f819;
        c03862.getClass();
        byte[] m2782 = c03862.f1134.m278();
        C0486 m3352 = c03862.f1135.m335();
        byte[] bArr4 = new byte[12];
        c03862.f1135.f1703.nextBytes(bArr4);
        long currentTimeMillis3 = System.currentTimeMillis();
        byte[] m3882 = AbstractC0645.m388(bytes2);
        byte[] m3362 = c03862.f1135.m336(m3352.f1555, m2782);
        byte[] bArr22 = C0506.f1697;
        byte[] bArr32 = new byte[bArr22.length + 3];
        c0388 = null;
        System.arraycopy(bArr22, 0, bArr32, 0, bArr22.length);
        bArr32[bArr22.length] = 0;
        bArr32[bArr22.length + 1] = 1;
        bArr32[bArr22.length + 2] = 2;
        byte[] m3372 = c03862.f1135.m337(m3362, bArr4, bArr32);
        byte[] m2252 = c03862.m225(str2, uuid2, currentTimeMillis3, c11122);
        byte[] m2242 = C0386.m224(currentTimeMillis3, bArr4, m3352.f1554, m2252, c03862.f1135.m334(m3372, bArr4, m3882, m2252).f1569);
        c0332.f822.getClass();
        C1075 c10752 = new C1075(uuid2, m3362, System.currentTimeMillis());
        C0740 c07402 = c0332.f818;
        c07402.getClass();
        long currentTimeMillis22 = System.currentTimeMillis();
        it = c07402.f2455.entrySet().iterator();
        while (it.hasNext()) {
        }
        c07402.f2455.put(c10752.f3379, c10752);
        httpURLConnection.setRequestProperty(StringFog.decrypt("WBHugAMPmo9PB/CR\n", "G36A9GZh7qI=\n"), StringFog.decrypt("Du8AbL0lZmIG8B4vuyVzcxuyA3SmI2Z7\n", "b59wANRGBxY=\n"));
        httpURLConnection.setRequestProperty(StringFog.decrypt("MRZL70pY\n", "cHUoijosNsk=\n"), StringFog.decrypt("gcQeKwMnUdSJ2wBoBSdExZSZHTMYIVHN\n", "4LRuR2pEMKA=\n"));
        httpURLConnection.setRequestProperty(StringFog.decrypt("1mEifg==\n", "rkxNDUzs0XU=\n"), StringFog.decrypt("IA==\n", "QQvn3jno3m4=\n"));
        httpURLConnection.setDoOutput(true);
        return new C0388(m2242, uuid2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m282(HttpURLConnection httpURLConnection, String str) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        String str2 = null;
        if (str != null) {
            C0332 c0332 = C0750.f2474.f2477;
            if (c0332 == null) {
                AbstractC0420.m245(f1517, StringFog.decrypt("QnP0fIHiF/pyEsVDwPcZ4XtT0kHEuljrdlzeQtWhHO10QMld1aEK7WRC30PS5FjueECQX8TwDe1k\nRvlJnA==\n", "FzKwLaGBeIg=\n") + str);
                return null;
            }
            try {
                if (httpURLConnection.getResponseCode() == 200) {
                    String m283 = m283(httpURLConnection, str, c0332);
                    if (m283 != null) {
                        return m283;
                    }
                    AbstractC0420.m245(f1517, StringFog.decrypt("LUoh8Pc/eiYIZAvSsm17MBt5HNGjJHA7WG0EyLsoe25YeQDSpyJxJh0rB86zND88CysL1LshP30L\nfxfEtiA/NBR5AMCzND82F2UW1Looe3w=\n", "eAtloddNH1U=\n"));
                    return null;
                }
            } catch (IOException e) {
                String str3 = f1517;
                AbstractC0420.m246(str3, str3, StringFog.decrypt("6Dd/iHk1bhKaMWOcc3t+H98xZ9hwOnQb3zYg2GModBndcnyUdzJzV8g3bZwsew==\n", "ulIM+BZbHXc=\n") + e.getMessage(), false);
            }
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append('\r');
                    }
                    stringBuffer.append(readLine);
                }
                str2 = stringBuffer.toString();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    String str4 = f1517;
                    AbstractC0420.m252(str4, str4, StringFog.decrypt("c+S2lxJpzMBC4q2WB2nZwEXmq5YTLA==\n", "NpbE+GBJq6U=\n"), th3, null, false);
                    return str2;
                } finally {
                    m286(inputStream);
                    m286(bufferedReader);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            Throwable th32 = th;
            String str42 = f1517;
            AbstractC0420.m252(str42, str42, StringFog.decrypt("c+S2lxJpzMBC4q2WB2nZwEXmq5YTLA==\n", "NpbE+GBJq6U=\n"), th32, null, false);
            return str2;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:29:0x0007, B:31:0x000d, B:7:0x003e, B:8:0x0042, B:11:0x005a, B:13:0x006d, B:14:0x0070, B:27:0x0087, B:26:0x0084, B:35:0x0019, B:21:0x007e, B:10:0x0054), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:29:0x0007, B:31:0x000d, B:7:0x003e, B:8:0x0042, B:11:0x005a, B:13:0x006d, B:14:0x0070, B:27:0x0087, B:26:0x0084, B:35:0x0019, B:21:0x007e, B:10:0x0054), top: B:2:0x0001, inners: #0, #2, #3 }] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1014 m281(JSONObject jSONObject, String str, C0931 c0931, Context context, boolean z) {
        C0388 m280;
        byte[] bArr;
        String str2;
        int responseCode;
        try {
            HttpURLConnection m285 = m285(str);
            try {
                if (z) {
                    try {
                        m280 = m280(m285, jSONObject, str, c0931, context);
                    } catch (Exception e) {
                        String str3 = f1517;
                        AbstractC0420.m246(str3, str3, StringFog.decrypt("GwEIpo6R0ZYxAUunnIjVjzsLS7uFwcOeNwMOsNvB0Iw3AQz0h43EljBVSw==\n", "Xm9r1Pfhpf8=\n") + e.getMessage(), false);
                    }
                    if (m280 != null) {
                        bArr = m280.f1138;
                        str2 = m280.f1137;
                        if (bArr == null) {
                            bArr = m287(m285, jSONObject);
                        }
                        String str4 = AbstractC0370.f1112;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        m285.connect();
                        DataOutputStream dataOutputStream = new DataOutputStream(m285.getOutputStream());
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        String m282 = m282(m285, str2);
                        responseCode = m285.getResponseCode();
                        String responseMessage = m285.getResponseMessage();
                        if (responseCode >= 400) {
                            m285.disconnect();
                        }
                        return new C1014(m282, responseCode, responseMessage, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }
                }
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                String m2822 = m282(m285, str2);
                responseCode = m285.getResponseCode();
                String responseMessage2 = m285.getResponseMessage();
                if (responseCode >= 400) {
                }
                return new C1014(m2822, responseCode, responseMessage2, SystemClock.elapsedRealtime() - elapsedRealtime);
            } finally {
            }
            str2 = null;
            bArr = null;
            if (bArr == null) {
            }
            String str42 = AbstractC0370.f1112;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            m285.connect();
            DataOutputStream dataOutputStream2 = new DataOutputStream(m285.getOutputStream());
        } catch (Throwable th) {
            String str5 = f1517;
            AbstractC0420.m252(str5, str5, StringFog.decrypt("Jz87tguhK4YMKSC3HqEojBE5aasc8C2GETlz+Q==\n", "Yk1J2XmBWOM=\n") + th.getLocalizedMessage(), th, null, false);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m287(HttpURLConnection httpURLConnection, JSONObject jSONObject) {
        GZIPOutputStream gZIPOutputStream;
        Exception e;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        String m284 = m284(jSONObject);
        byte[] bytes = m284.getBytes(StringFog.decrypt("Tf/DtfA=\n", "GKuFmMhULAk=\n"));
        if (m284.length() <= 256) {
            return bytes;
        }
        httpURLConnection.setRequestProperty(StringFog.decrypt("o+htBpYgdC2l6WAdlyduZw==\n", "4IcDcvNOAAA=\n"), StringFog.decrypt("iPD6oQ==\n", "74qT0XLLrR4=\n"));
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (Exception e2) {
            gZIPOutputStream = null;
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = gZIPOutputStream2;
            th = th;
            if (gZIPOutputStream != null) {
            }
            throw th;
        }
        try {
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e3) {
            e = e3;
            try {
                throw new RuntimeException(e);
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream2 = gZIPOutputStream;
                gZIPOutputStream = gZIPOutputStream2;
                th = th;
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (gZIPOutputStream != null) {
            }
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static HttpURLConnection m285(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod(StringFog.decrypt("LcGdqw==\n", "fY7O/zMssdo=\n"));
        httpURLConnection.setRequestProperty(StringFog.decrypt("aZM/KumT5GJ+hSE7\n", "KvxRXoz9kE8=\n"), StringFog.decrypt("zGzWYbaUPbbEc8gitYQzrJY8xWW+hS+n2SHTebnaZA==\n", "rRymDd/3XMI=\n"));
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        return httpURLConnection;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m283(HttpURLConnection httpURLConnection, String str, C0332 c0332) {
        Throwable th;
        InputStream inputStream;
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength <= 0) {
                    contentLength = 65536;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(contentLength);
                try {
                    byte[] bArr = new byte[com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_BUFFER_SEGMENT_SIZE];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    byte[] m192 = c0332.m192(byteArrayOutputStream2.toByteArray(), str);
                    if (m192 == null) {
                        AbstractC0420.m245(f1517, StringFog.decrypt("m+AfACZ5+Oa82CslVHju9aHPKDQmb/jxu9M1NGI98/CizQ==\n", "zqFbUQYdnYU=\n"));
                        m286(inputStream);
                        m286(byteArrayOutputStream2);
                        return null;
                    }
                    String str2 = new String(m192, StringFog.decrypt("weIFyvg=\n", "lLZD58CUXm0=\n"));
                    m286(inputStream);
                    m286(byteArrayOutputStream2);
                    return str2;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        String str3 = f1517;
                        AbstractC0420.m245(str3, StringFog.decrypt("CGlUCRD8j/UtR34rVa6O4z5aaShE54XofU5xMVzrjrx9\n", "XSgQWDCO6oY=\n") + th2.getMessage());
                        AbstractC0420.m252(str3, str3, StringFog.decrypt("0cMnpSBYaWLgxTykNVdqYvfDLLomEWBgtMMwuSIXYHTx\n", "lLFVylJ4Dgc=\n"), th2, null, false);
                        return null;
                    } finally {
                        m286(inputStream);
                        m286(byteArrayOutputStream);
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                byteArrayOutputStream = null;
                String str32 = f1517;
                AbstractC0420.m245(str32, StringFog.decrypt("CGlUCRD8j/UtR34rVa6O4z5aaShE54XofU5xMVzrjrx9\n", "XSgQWDCO6oY=\n") + th2.getMessage());
                AbstractC0420.m252(str32, str32, StringFog.decrypt("0cMnpSBYaWLgxTykNVdqYvfDLLomEWBgtMMwuSIXYHTx\n", "lLFVylJ4Dgc=\n"), th2, null, false);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m286(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m284(JSONObject jSONObject) {
        String str;
        String jSONObject2 = jSONObject.toString();
        String str2 = AbstractC0577.f1871;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(AbstractC0577.f1870.getBytes(StringFog.decrypt("snQ7+44=\n", "5yB91rZmCX0=\n")), mac.getAlgorithm()));
            str = AbstractC0728.m412(mac.doFinal(jSONObject2.replaceAll(" ", "").replaceAll("\n", "").getBytes(StringFog.decrypt("jSTA1IE=\n", "2HCG+blhfpE=\n"))));
        } catch (Exception e) {
            AbstractC0420.m243(AbstractC0577.f1871, StringFog.decrypt("JLG+AnBaqg==\n", "YcPMbQJginc=\n") + e.getLocalizedMessage());
            str = null;
        }
        String substring = jSONObject2.substring(0, jSONObject2.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        return AbstractC1133.m662("fY0=\n", "X/BZSVVbExY=\n", AbstractC1072.m642("561T22d7KA==\n", "y487qEVBCgc=\n", sb, str));
    }
}
