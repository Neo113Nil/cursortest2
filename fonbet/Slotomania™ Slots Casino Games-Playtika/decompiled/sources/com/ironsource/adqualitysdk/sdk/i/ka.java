package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.ktor.util.date.GMTDateParser;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ka {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2958 = 6;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2959 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2960 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2961 = {'l', 'c', 't', GMTDateParser.SECONDS, 'o', 'p', 'a', AbstractJsonLexerKt.UNICODE_ESC, 'i', GMTDateParser.DAY_OF_MONTH, GMTDateParser.MINUTES, 'e', 'n', 'r', 'w', 'v', 'q', '_', 'b', 'A', 'Q', 'y', 'R', 'G', 'E', ' ', 'g', 'j', 'x', GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~', Ascii.MAX, 128};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f2962 = 5266008854105235194L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Context f2963;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f2964;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private as f2965;

    public ka(Context context, as asVar, long j) {
        this.f2963 = context;
        this.f2965 = asVar;
        this.f2964 = j;
        new ha(context);
    }

    /* renamed from: ﾇ */
    public JSONObject mo5900(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        int i = 2 % 2;
        int i2 = f2959 + 47;
        f2960 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONObject == null) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
            int i4 = f2960 + 107;
            f2959 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        }
        JSONObject m8417 = kj.m8417(jSONObject);
        m8417.put(m8331("\u0c65ఄ\uedc6\uf34cᡖ첅矨睝◒造", TextUtils.indexOf("", "", 0, 0)).intern(), this.f2965.m6118());
        String m6116 = this.f2965.m6116();
        if (!TextUtils.isEmpty(m6116)) {
            int i6 = f2959 + 71;
            f2960 = i6 % 128;
            m8417.put(m8331("筝笴쭰헹ᣓ犄╕⸉", i6 % 2 != 0 ? ImageFormat.getBitsPerPixel(1) : ImageFormat.getBitsPerPixel(0) + 1).intern(), m6116);
        }
        if (z2) {
            int i7 = f2959 + 19;
            f2960 = i7 % 128;
            if (i7 % 2 == 0 ? this.f2964 > 0 : this.f2964 > 1) {
                m8417.put(m8330(View.resolveSize(0, 0) + 4, "\u0001\u0002\u0003\u0004", (byte) (15 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), this.f2964);
            }
            m8417.put(m8330(5 - (Process.myPid() >> 22), "\u0002\u0005¡¡\u0092", (byte) (AndroidCharacter.getMirror('0') + 1)).intern(), this.f2965.m6123());
            m8417.put(m8331("ᐉᑭ墾䘭Ћ㦋몸", TextUtils.indexOf("", "")).intern(), this.f2965.m6114());
            m8417.put(m8330((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, "\b\tv", (byte) (18 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), this.f2965.m6120());
            m8417.put(m8330(View.MeasureSpec.getMode(0) + 2, "\r\u0007", (byte) (120 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), this.f2965.m6127());
            m8417.put(m8331("潳漇㎖ⴖ碠\ue03c", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), Calendar.getInstance().getTimeZone().getRawOffset() / 3600000.0d);
            m8417.put(m8331("\uec62\uec16弬䆦辣䪮韸눁ᘥ", View.MeasureSpec.getSize(0)).intern(), IronSourceAdQuality.getSDKVersion());
            m8417.put(m8331("⭷⬃弨必ᘥ", View.getDefaultSize(0, 0)).intern(), kh.m8389());
            m8417.put(m8330(5 - (Process.myPid() >> 22), "\u0010\n\n\u0006\u008a", (byte) (Color.green(0) + 30)).intern(), Build.MODEL);
            m8417.put(m8331("\udf08\udf65♣㣸\ueb75☔ꒆ볠훯潐ꈭ⢭ホ窏\ue34e⹃", MotionEvent.axisFromString("") + 1).intern(), Build.MANUFACTURER);
            m8417.put(m8331("\uef39\uef49﹈\ue0de\udda7屒钷擅\ue032妜\ud873È", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m8330(7 - View.resolveSize(0, 0), "\f\u0012\u0007\u000f\u0002\ni", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 5)).intern());
            m8417.put(m8331("ꄕꅺ\ueb95\uf51c툨\uefaa暨", Color.alpha(0)).intern(), kf.m8368());
            kh.m8388(this.f2963, m8417);
            kf.m8379(this.f2963, m8417);
            kf.m8366(this.f2963, m8417, z3);
            kf.m8380(m8417);
            kf.m8372(m8417);
            m8417.put(m8330(4 - View.MeasureSpec.getSize(0), "\r\u000f\t\f", (byte) (52 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), z);
            kf.m8370(this.f2963, m8417);
            kf.m8377(m8417);
            try {
                JSONObject jSONObject2 = new JSONObject(this.f2965.m6113());
                jSONObject2.remove(m8330(Color.red(0) + 13, "\u0007\n\u0011\f\u0006\u000e\u000e\b\f\u0017\u0001\u0005\u0093", (byte) (48 - TextUtils.lastIndexOf("", '0', 0))).intern());
                if (jSONObject2.length() > 0) {
                    int i8 = f2959 + 29;
                    f2960 = i8 % 128;
                    m8417.putOpt(i8 % 2 != 0 ? m8331("䀦䁋\ud8ed왣朗ᨳ윂䚩", Color.green(0)).intern() : m8331("䀦䁋\ud8ed왣朗ᨳ윂䚩", Color.green(0)).intern(), jSONObject2);
                    return m8417;
                }
            } catch (Exception e) {
                m.m8535(m8330((ViewConfiguration.getJumpTapTimeout() >> 16) + 25, "\u0015\u0007\u0013\b\f\u0006\u000e\b\u0016\u0017\n\u0011\b\u0006\u0004\u0003\u001d\u0011\u0011\u0006\f\u0007\u0003\u0005\u009b", (byte) (41 - TextUtils.getCapsMode("", 0, 0))).intern(), m8330(36 - ExpandableListView.getPackedPositionGroup(0L), "\u0019\f\u0010\u0001\u0013\u001f\u0007\n\n\t\u000e\u0018\u001c\u0007\b\u0005\u0007\u0018\n\u0007\u0000\b\u001a\u001c\u0004\u0005\r\u0018\u0003\u0005\u001d\u0007\u0011\t\u000e\u0000", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45)).intern(), e);
            }
        }
        return m8417;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final as m8332() {
        int i = 2 % 2;
        int i2 = f2960 + 33;
        f2959 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2965;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8331(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (g.f2155) {
            char[] m7785 = g.m7785(f2962, cArr2, i);
            g.f2157 = 4;
            while (g.f2157 < m7785.length) {
                g.f2156 = g.f2157 - 4;
                m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f2962));
                g.f2157++;
            }
            str2 = new String(m7785, 4, m7785.length - 4);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8330(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f2961;
            char c = f2958;
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
