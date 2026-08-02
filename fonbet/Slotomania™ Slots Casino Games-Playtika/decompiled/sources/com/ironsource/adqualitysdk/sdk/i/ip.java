package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class ip {

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2547 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2548;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2549;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f2550;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2551;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2552;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final byte[] f2553;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2554;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Cipher f2555;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Cipher f2556;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private SecretKey f2557;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m8086() {
        f2554 = 0L;
        f2549 = 0;
        f2550 = (char) 47364;
        f2551 = (char) 7;
        f2548 = new char[]{'K', 'E', 'V', 'A', ' ', 'S', 'O', 'b', 'f', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.SECONDS, 'c', 'a', 't', 'o', 'r', 'P', 'l', 'y', 'n', 'i', GMTDateParser.MINUTES, 'p', 'e', GMTDateParser.DAY_OF_MONTH, 'v', '.', 'T', 'g', GMTDateParser.HOURS, 'I', '2', '-', '1', '|', 'U', 'F', '8', 'H', '(', 'k', ')', AbstractJsonLexerKt.COLON, 'L', GMTDateParser.MONTH, 'N', 'Q', 'R', 'W'};
    }

    static {
        m8086();
        f2553 = new byte[]{Ascii.DLE, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i = f2552 + 37;
        f2547 = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    public ip(byte[] bArr, String str, String str2, String str3) {
        byte[] digest;
        try {
            digest = SecretKeyFactory.getInstance(m8088((char) (25355 - KeyEvent.normalizeMetaState(0)), "\u0000\u0000\u0000\u0000", "ꁶ瘞\u0bbc끣", "梚㡭ꗼဩ㊼\ue37d숈왳\udd9b쥚⸳蒮ꠥ凟數힠Ⳮ⻓ꮧᘷ彉ꚥ\ue62d㟸錀\uaa38䳁뮘뭵", (-1133109600) - ExpandableListView.getPackedPositionType(0L)).intern()).generateSecret(new PBEKeySpec(new StringBuilder().append(str).append(str2).append(str3).toString().toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            iq.m8095(m8089(19 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0001\u0002\u0002\u0003\u0004\u0005\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014±", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 63)).intern(), m8089((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59, "\u0011\u0010\u0015\u000e\r\b\u0012\u0013\u0005\u000b\u0012\u0005\u000e\u0014\u0007\u0012\u0016\u0017\r\u0007\u000e\r\u0010\u0018\u0003\u0019\u0018\u001a\u0012\r\u0018\u001b\u0006\u0019\u0010\u0013\u000e\u0014 \u0000\u001b\u0011½½\u0016\u0010\u001a\u0010\u000b\u0006\b\u001a\u001d\u0016\u0013\u0007\b \u0085", (byte) (86 - ExpandableListView.getPackedPositionChild(0L))).intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m8088((char) (Process.getGidForName("") + 5841), "\u0000\u0000\u0000\u0000", "랚货킾ﴖ", "亁ੴ䪑", Color.argb(0, 0, 0, 0) - 1098045513).intern());
                char[] charArray = new StringBuilder().append(str).append(str2).append(str3).toString().toCharArray();
                for (char c : charArray) {
                    messageDigest.update((byte) c);
                }
                digest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(m8088((char) (47286 - View.resolveSize(0, 0)), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", 354353735 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e);
            }
        }
        this.f2557 = new SecretKeySpec(digest, m8089(TextUtils.indexOf((CharSequence) "", '0', 0) + 4, "\u0004\u0002¨", (byte) (85 - (ViewConfiguration.getScrollBarSize() >> 8))).intern());
        m8087();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m8087() {
        int i = 2 % 2;
        try {
            Cipher cipher = Cipher.getInstance(m8088((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", "㢽⼽ᥐ啶", "㸬ㄔ踁톆襞⤨㿏\uf7eaﾵ귒㓽럌Ꮐʛหf迿嫳⾜\uf2d9", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            this.f2556 = cipher;
            SecretKey secretKey = this.f2557;
            byte[] bArr = f2553;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m8088((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "㢽⼽ᥐ啶", "㸬ㄔ踁톆襞⤨㿏\uf7eaﾵ귒㓽럌Ꮐʛหf迿嫳⾜\uf2d9", View.MeasureSpec.getSize(0)).intern());
            this.f2555 = cipher2;
            cipher2.init(2, this.f2557, new IvParameterSpec(bArr));
            int i2 = f2552 + 51;
            f2547 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(m8089(Color.green(0) + 21, "!\u0010\u001a\u000b\u0012\u000e\u0019\u0003\u001a\u0010\u001b\u0012\u0010\u000f\u000e\u001a\u001a\u0010\u000b\u0006\u009c", (byte) (TextUtils.lastIndexOf("", '0') + 107)).intern(), e);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized String m8091(String str) {
        int i = 2 % 2;
        int i2 = f2552 + 67;
        f2547 = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return il.m8079(this.f2556.doFinal(new StringBuilder().append(m8089(40 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0007\u0012\u0016\u001b\u0007\u0011\u0015\u001c\u0013\n\u0015\f\u000e\u0012\u0012\u000e\u000e!\u0017\f\u0014\u001b\u0013\u0018\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014\u0012\u001d\"\u001c", (byte) (109 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern()).append(str).toString().getBytes(m8089(View.MeasureSpec.getMode(0) + 5, ")\u0015'\u001d\u008d", (byte) (85 - Color.blue(0))).intern())));
            } catch (UnsupportedEncodingException e) {
                m8087();
                throw new RuntimeException(m8088((char) (Gravity.getAbsoluteGravity(0, 0) + 47286), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", 354353736 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), e);
            } catch (GeneralSecurityException e2) {
                m8087();
                throw new RuntimeException(m8088((char) (Color.red(0) + 47286), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 354353734).intern(), e2);
            }
        }
        int i3 = f2552;
        int i4 = i3 + 97;
        f2547 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 3;
        f2547 = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized String m8090(String str) throws d {
        int i = 2 % 2;
        int i2 = f2547 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2552 = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = f2547 + 85;
            f2552 = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
        try {
            try {
                String str2 = new String(this.f2555.doFinal(il.m8072(str)), m8089(4 - ExpandableListView.getPackedPositionChild(0L), ")\u0015'\u001d\u008d", (byte) (View.combineMeasuredStates(0, 0) + 85)).intern());
                if (str2.indexOf(m8089((Process.myPid() >> 22) + 40, "\u0007\u0012\u0016\u001b\u0007\u0011\u0015\u001c\u0013\n\u0015\f\u000e\u0012\u0012\u000e\u000e!\u0017\f\u0014\u001b\u0013\u0018\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014\u0012\u001d\"\u001c", (byte) (109 - TextUtils.getTrimmedLength(""))).intern()) != 0) {
                    throw new d(new StringBuilder().append(m8089(39 - (Process.myTid() >> 22), "%\u0018\n\u001a\u0016\u0010\u0005\u0012\u0014\u0007\u0001\u000b\u0010\u0007\u0011\u001a\u000b.\u000e\u0014\u001a\u000b\u0012\u000e\u0019\u0003\u001a\n\u0007\r\u0000\u0012\u0012\u0001%\u001a\u0014'O", (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 21)).intern()).append(str).toString());
                }
                return str2.substring(m8089(39 - TextUtils.indexOf((CharSequence) "", '0'), "\u0007\u0012\u0016\u001b\u0007\u0011\u0015\u001c\u0013\n\u0015\f\u000e\u0012\u0012\u000e\u000e!\u0017\f\u0014\u001b\u0013\u0018\u0004\u0002\u0006\u0000\b\t\n\u000b\f\r\u0007\u0014\u0012\u001d\"\u001c", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 109)).intern().length(), str2.length());
            } catch (in e) {
                m8087();
                throw new d(new StringBuilder().append(e.getMessage()).append(m8088((char) (51086 - KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", "泹Ì軔糇", "鷷", (-738145172) - View.MeasureSpec.getMode(0)).intern()).append(str).toString());
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(m8088((char) (47286 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", "䟷ἂ똕辸", "鹉\uf1bd獎㵈簮䇕곰蛬鍘蹋龆\ud9db侜㖵턫\uec6a䩞毵\uef5f", 354353735 - View.resolveSize(0, 0)).intern(), e2);
            }
        } catch (BadPaddingException e3) {
            m8087();
            throw new d(new StringBuilder().append(e3.getMessage()).append(m8088((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51085), "\u0000\u0000\u0000\u0000", "泹Ì軔糇", "鷷", (ViewConfiguration.getFadingEdgeLength() >> 16) - 738145172).intern()).append(str).toString());
        } catch (IllegalBlockSizeException e4) {
            m8087();
            throw new d(new StringBuilder().append(e4.getMessage()).append(m8088((char) (KeyEvent.keyCodeFromString("") + 51086), "\u0000\u0000\u0000\u0000", "泹Ì軔糇", "鷷", (-738145172) - Gravity.getAbsoluteGravity(0, 0)).intern()).append(str).toString());
        }
    }

    public class d extends Exception {
        public d(String str) {
            super(str);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8088(char c, String str, String str2, String str3, int i) {
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
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2554) ^ f2549) ^ f2550);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8089(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2548;
            char c = f2551;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
