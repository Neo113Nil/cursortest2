package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class jf {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2690 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2693;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2695 = {777529049, -445050213, 1051987069, -210384315, -1520647526, -923434848, -388811378, 70463851, 1971679432, 589646508, 348072701, -360958552, -965884002, -922189606, 471650386, 235305070, -1341288195, 1121399519};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2692 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2691 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2694 = 27295;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r3 >= 400) goto L9;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jd m8138(JSONObject jSONObject, String str) {
        HttpURLConnection m8134;
        long m8359;
        String m8140;
        int httpUrlConnectionGetResponseCode;
        String responseMessage;
        int i = 2 % 2;
        int i2 = f2693 + 35;
        f2690 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m8134 = m8134(str);
                byte[] m8137 = m8137(m8134, jSONObject);
                m8359 = ke.m8359();
                m8145(m8134, m8137);
                m8140 = m8140(m8134);
                httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(m8134);
                responseMessage = m8134.getResponseMessage();
                if (httpUrlConnectionGetResponseCode >= 5376) {
                    IronSourceNetworkBridge.httpUrlConnectionDisconnect(m8134);
                }
                jd jdVar = new jd(m8140, httpUrlConnectionGetResponseCode, responseMessage, ke.m8359() - m8359);
                int i3 = f2693 + 109;
                f2690 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 78 / 0;
                }
                return jdVar;
            }
            m8134 = m8134(str);
            byte[] m81372 = m8137(m8134, jSONObject);
            m8359 = ke.m8359();
            m8145(m8134, m81372);
            m8140 = m8140(m8134);
            httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(m8134);
            responseMessage = m8134.getResponseMessage();
        } catch (Throwable th) {
            m.m8535(m8143(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new StringBuilder().append(m8142((char) (44816 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "溿䖲ྙ綯", "\ue688긫뙴樥醴瓲폡㻆칱徯꾀\ue773낽䤖휎쓢讝弹Ύⶫ萻\uf391㠢\ue0fe龄ᾝ\uf664\udf37", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).append(th.getLocalizedMessage()).toString(), th);
            return null;
        }
        m.m8535(m8143(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new StringBuilder().append(m8142((char) (44816 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "溿䖲ྙ綯", "\ue688긫뙴樥醴瓲폡㻆칱徯꾀\ue773낽䤖휎쓢讝弹Ύⶫ萻\uf391㠢\ue0fe龄ᾝ\uf664\udf37", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).append(th.getLocalizedMessage()).toString(), th);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r5 >= 400) goto L10;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jd m8141(String str) {
        HttpURLConnection m8136;
        long m8359;
        String m8140;
        int httpUrlConnectionGetResponseCode;
        String responseMessage;
        int i = 2 % 2;
        int i2 = f2690 + 65;
        f2693 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8136 = m8136(str);
                m8359 = ke.m8359();
                m8140 = m8140(m8136);
                httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(m8136);
                responseMessage = m8136.getResponseMessage();
                if (httpUrlConnectionGetResponseCode >= 30118) {
                    int i3 = f2690 + 59;
                    f2693 = i3 % 128;
                    if (i3 % 2 == 0) {
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(m8136);
                        int i4 = f2690 + 47;
                        f2693 = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        IronSourceNetworkBridge.httpUrlConnectionDisconnect(m8136);
                        throw null;
                    }
                }
                return new jd(m8140, httpUrlConnectionGetResponseCode, responseMessage, ke.m8359() - m8359);
            }
            m8136 = m8136(str);
            m8359 = ke.m8359();
            m8140 = m8140(m8136);
            httpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(m8136);
            responseMessage = m8136.getResponseMessage();
        } catch (Throwable th) {
            m.m8535(m8143(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, 7 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new StringBuilder().append(m8143(new int[]{927225483, 637520133, 1187850471, -1745922011, 1424555418, 188892864, -732652938, -2020350892, -1372508385, 1902585592, -709570317, -1390816468, 562056447, -590956699}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26).intern()).append(th.getLocalizedMessage()).toString(), th);
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8145(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        int i = 2 % 2;
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(IronSourceNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m8144(dataOutputStream);
        int i2 = f2693 + 67;
        f2690 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (m8147(r10) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003e, code lost:
    
        if (m8147(r10) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0065, code lost:
    
        r9.setRequestProperty(m8142((char) (15436 - android.graphics.Color.blue(0)), "\u0000\u0000\u0000\u0000", "玓윺䳺︼", "撎鏾⾋\uf473铲\uf2f0문楁\u0004گ抚푏杌ｩ뻷랳", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16).intern(), m8142((char) (24621 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), "\u0000\u0000\u0000\u0000", "ڌﶮⶖ덠", "촲⛒ࡅ昘", android.graphics.Color.green(0)).intern());
        r1 = m8135(r1);
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] m8137(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws JSONException, UnsupportedEncodingException {
        byte[] bytes;
        int i = 2 % 2;
        int i2 = f2693 + 51;
        f2690 = i2 % 128;
        if (i2 % 2 == 0) {
            String m8146 = m8146(jSONObject);
            bytes = m8146.getBytes(m8142((char) (18594 % KeyEvent.getDeadChar(1, 0)), "\u0000\u0000\u0000\u0000", "\udc70Ά嶷Ď", "\uf2ca㜓ꌡ섋揔", (-1222657060) % (ViewConfiguration.getEdgeSlop() >> 93)).intern());
        } else {
            String m81462 = m8146(jSONObject);
            bytes = m81462.getBytes(m8142((char) (3677 - KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", "\udc70Ά嶷Ď", "\uf2ca㜓ꌡ섋揔", (-1222657060) - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        }
        int i3 = f2693 + 61;
        f2690 = i3 % 128;
        if (i3 % 2 != 0) {
            return bytes;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m8134(String str) throws IOException {
        int i = 2 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m8142((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44597), "\u0000\u0000\u0000\u0000", "쌎\udbc3㖩鶮", "்㪉㲜섊", (-1) - TextUtils.lastIndexOf("", '0', 0)).intern());
        httpURLConnection.setRequestProperty(m8143(new int[]{-77275737, -1398504272, -1427219234, -1813192374, 1592349327, -442647392}, 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m8143(new int[]{1446984398, 1074853980, 1807664080, 671645330, 2113965368, 1584918440, -2146721375, -731787300, 1360842251, 1420397865, 92204963, 863076686, 1146677413, 531049206, -1784590993, 1052142629}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i2 = f2693 + 17;
        f2690 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return httpURLConnection;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m8136(String str) throws IOException {
        int i = 2 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m8142((char) (16279 - ((Process.getThreadPriority(0) + 20) >> 6)), "\u0000\u0000\u0000\u0000", "软潄靬\uee3f", "暡駯稐", 1819231375 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
        int i2 = f2690 + 17;
        f2693 = i2 % 128;
        if (i2 % 2 == 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8140(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        int i = 2 % 2;
        try {
            inputStream = IronSourceNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    int i2 = f2690 + 35;
                    f2693 = i2 % 128;
                    int i3 = i2 % 2;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            if (stringBuffer.length() > 0) {
                                int i4 = f2693 + 13;
                                f2690 = i4 % 128;
                                if (i4 % 2 == 0) {
                                    stringBuffer.append('7');
                                } else {
                                    stringBuffer.append('\r');
                                }
                            }
                            stringBuffer.append(readLine);
                        } else {
                            return stringBuffer.toString();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        m.m8535(m8143(new int[]{-468829707, 1674144323, 1237166167, 1758083325}, Color.blue(0) + 8).intern(), m8142((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", "\ued56沶ﮎ鯜", "煫≤뢺ㅷ鷧譨魱캙梟ⷂ䶊闖敯㐈➧\ufafa쐁缅㷝륑懍雵", TextUtils.getCapsMode("", 0, 0)).intern(), th);
                        return null;
                    } finally {
                        m8144(inputStream);
                        m8144(bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            bufferedReader = null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8144(Closeable closeable) {
        int i = 2 % 2;
        int i2 = f2690 + 45;
        int i3 = i2 % 128;
        f2693 = i3;
        int i4 = i2 % 2;
        if (closeable != null) {
            int i5 = i3 + 79;
            f2690 = i5 % 128;
            int i6 = i5 % 2;
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8147(String str) {
        int i = 2 % 2;
        if (str.length() <= 256) {
            return false;
        }
        int i2 = f2693 + 17;
        int i3 = i2 % 128;
        f2690 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        f2693 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m8135(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        int i = 2 % 2;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i2 = f2693 + 43;
            f2690 = i2 % 128;
            if (i2 % 2 != 0) {
                return byteArray;
            }
            super.hashCode();
            throw null;
        } catch (Exception e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != null) {
                try {
                    gZIPOutputStream2.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8146(JSONObject jSONObject) {
        int i = 2 % 2;
        String jSONObject2 = jSONObject.toString();
        String obj = new StringBuilder().append(jSONObject2.substring(0, jSONObject2.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE))).append(m8143(new int[]{-843653862, 1631784646, -52937495, 1598305464}, 7 - Color.green(0)).intern()).append(kg.m8386(jSONObject2)).append(m8142((char) (Color.blue(0) + 54264), "\u0000\u0000\u0000\u0000", "켅뷍\uf885㟓", "辳艷", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern()).toString();
        int i2 = f2690 + 87;
        f2693 = i2 % 128;
        int i3 = i2 % 2;
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m8139(jd jdVar) {
        int i = 2 % 2;
        int i2 = f2690;
        int i3 = i2 + 11;
        f2693 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (jdVar == null) {
            int i4 = i2 + 105;
            f2693 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        String m8130 = jdVar.m8130();
        int i6 = f2690 + 65;
        f2693 = i6 % 128;
        int i7 = i6 % 2;
        return m8130;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8143(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2695.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8142(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2692) ^ f2691) ^ f2694);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }
}
