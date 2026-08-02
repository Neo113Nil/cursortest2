package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class kl {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3045 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3046 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f3047 = 15535;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static WeakReference<bb> f3048 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3049 = 65328;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f3050 = 45700;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3051 = 22612;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8454(bb bbVar) {
        int i = 2 % 2;
        f3048 = new WeakReference<>(bbVar);
        int i2 = f3045 + 115;
        f3046 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Throwable m8449(Throwable th) {
        int i = 2 % 2;
        while (th.getCause() != null) {
            int i2 = f3045 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f3046 = i2 % 128;
            int i3 = i2 % 2;
            th = th.getCause();
        }
        int i4 = f3046 + 7;
        f3045 = i4 % 128;
        int i5 = i4 % 2;
        return th;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8458(String str, String str2, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f3046 + 63;
        f3045 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8448(str, str2, th, z, true);
            } else {
                m8448(str, str2, th, z, false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8448(String str, String str2, Throwable th, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = f3046 + 69;
        f3045 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8459(str, str2, th, z, z2, false);
            } else {
                m8459(str, str2, th, z, z2, false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8459(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f3046 + 109;
        int i3 = i2 % 128;
        f3045 = i3;
        int i4 = i2 % 2;
        try {
            if (z) {
                int i5 = i3 + 49;
                f3046 = i5 % 128;
                int i6 = i5 % 2;
                m.m8531(str, str2, z3);
                if (th != null) {
                    int i7 = f3045 + 69;
                    f3046 = i7 % 128;
                    m.m8526(str, (i7 % 2 == 0 ? m8455("\u1249麷Ⲃ騬吏⡋稱迂", 78 % (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))) : m8455("\u1249麷Ⲃ騬吏⡋稱迂", 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), th, z3);
                }
            } else {
                m.m8526(str, str2, th, z3);
            }
            m8451(str, str2, new StringBuilder().append(m8455("⅟⸊\ud918戳銟ꎋ\ud918戳°䊂", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()).append(str).toString(), th, null, null, false, z2, z3);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8447(String str, String str2, String str3, Throwable th, dn dnVar, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f3045 + 111;
        f3046 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m8451(str, str2, str3, th, dnVar, jSONObject, true, false, false);
            int i4 = f3046 + 21;
            f3045 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8457(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = f3046 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3045 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8451(str, str2, str3, th, null, jSONObject, true, false, z);
            } else {
                m8451(str, str2, str3, th, null, jSONObject, true, false, z);
            }
            int i3 = f3046 + 5;
            f3045 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8450(String str, String str2, String str3, Throwable th) {
        int i = 2 % 2;
        int i2 = f3045 + 11;
        f3046 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m8452(str, str2, str3, th, false);
            int i4 = f3045 + 21;
            f3046 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m8452(String str, String str2, String str3, Throwable th, boolean z) {
        int i = 2 % 2;
        int i2 = f3046 + 33;
        f3045 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m8451(str, str2, str3, th, null, null, true, false, false);
            } else {
                m8451(str, str2, str3, th, null, null, false, false, false);
            }
            int i3 = f3046 + 71;
            f3045 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 54 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m8451(String str, String str2, String str3, Throwable th, dn dnVar, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = f3045 + 21;
        f3046 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                throw null;
            }
            if (z) {
                str3 = new StringBuilder().append(str3).append(m8455("呌庡", TextUtils.getOffsetAfter("", 0) + 1).intern()).append(str).toString();
                m.m8536(str, new StringBuilder().append(str2).append(m8455("艂ᑞ㨢\ud8feܙ턏䪷\ue66b", 7 - (ViewConfiguration.getScrollBarSize() >> 8)).intern()).append(str3).append(m8455("㘌䲟", TextUtils.getTrimmedLength("") + 1).intern()).toString(), th, dnVar, z3);
            }
            String str4 = str3;
            bb bbVar = f3048.get();
            if (bbVar != null) {
                int i3 = f3045 + 11;
                f3046 = i3 % 128;
                if (i3 % 2 == 0) {
                    bbVar.m6285(str, str2, str4, m8453(th, dnVar), jSONObject, z2);
                    int i4 = 49 / 0;
                } else {
                    bbVar.m6285(str, str2, str4, m8453(th, dnVar), jSONObject, z2);
                }
                int i5 = f3046 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                f3045 = i5 % 128;
                int i6 = i5 % 2;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8453(Throwable th, dn dnVar) {
        int i = 2 % 2;
        int i2 = f3046;
        int i3 = i2 + 71;
        f3045 = i3 % 128;
        int i4 = i3 % 2;
        if (dnVar != null) {
            int i5 = i2 + 27;
            f3045 = i5 % 128;
            int i6 = i5 % 2;
            String obj = dnVar.toString();
            int i7 = f3046 + 83;
            f3045 = i7 % 128;
            if (i7 % 2 == 0) {
                return obj;
            }
            Object obj2 = null;
            super.hashCode();
            throw null;
        }
        if (th instanceof dn) {
            return th.toString();
        }
        return Log.getStackTraceString(th);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m8456(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = f3046 + 99;
        f3045 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m8446(str, str2, str3, str4);
            int i4 = f3045 + 51;
            f3046 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m8446(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            String obj = new StringBuilder().append(str3).append(m8455("呌庡", ExpandableListView.getPackedPositionType(0L) + 1).intern()).append(str).toString();
            m.m8531(str, new StringBuilder().append(m8455("虒礢䋋༻ﾻ㒝勲\ue990枷\uf101䪷\ue66b", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10).intern()).append(obj).append(m8455("ᙉ嘝훟ᬳ\ue244맘ਇ䊶䑁Ⳇ殿뒠䋡Ს", 13 - View.MeasureSpec.getMode(0)).intern()).toString(), false);
            m.m8531(str, new StringBuilder().append(str2).append(str4 != null ? new StringBuilder().append(m8455("\uf1c3\udd63", TextUtils.getOffsetBefore("", 0) + 1).intern()).append(str4).toString() : "").toString(), false);
            bb bbVar = f3048.get();
            if (bbVar != null) {
                int i2 = f3045 + 103;
                f3046 = i2 % 128;
                if (i2 % 2 == 0) {
                    bbVar.m6293(str, str2, obj, str4);
                    Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                bbVar.m6293(str, str2, obj, str4);
            }
            int i3 = f3046 + 113;
            f3045 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 27 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8455(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3049)) ^ ((c2 >>> 5) + f3047)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f3051) ^ ((c3 + i2) ^ ((c3 << 4) + f3050))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }
}
