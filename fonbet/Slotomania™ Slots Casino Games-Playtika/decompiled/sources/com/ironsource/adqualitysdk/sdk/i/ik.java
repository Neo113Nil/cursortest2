package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ik<T> extends cw implements ch, Cif<T> {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f2524 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2525 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Cif f2531;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Object f2532;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Collection f2533;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Field f2534;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map f2535;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f2530 = {44253, 17349, 29434, 24994, 4275, 1876, 13907, 9577, GMTDateParser.SECONDS, 61311, 56896, 52504, 48137, 44014, 39657, 35283, 'i', 61289, 56946, 52519, 48141, 44014, 39672, 'g', 61311, 56896, 52488, 48129, 44007, 39664, 35282, 'g', 61311, 56896, 52493, 48135, 44014, 39664, 35283, 30899, 26526, 22381, 18033, 13654, 'g', 61311, 56896, 52510, 48137, 44016, 39673, 35288, 30884, 17245, 44138, 40268, 36409, 65305, 59620, 55752, 51917, 15271, 9364, 5234, 1349, 30279, 26416, 20498, 43668, 17849, 29847, 26608, 5835, 371, 12346, 8975, 53864, 52567, 64944, 60655, 40844, 36603, 47576, 43060, 23300, 18975, 25964, 5201, 1214, 14291, 9890, 53733, 49355, 62270, 57878, 40219, 35919, 48970, 44984, 24219, 18933, 30914, 27592, 6703, 13589, 9267, 55139, 50758, 63157, 57746, 37091, 33770, 45705, 44334, 23576, 20323, 32345, 26948, 6561, 2271, 15294};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f2529 = 8312691144628039450L;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2526 = 56503;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2527 = 54626;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f2523 = 58328;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f2528 = 10647;

    ik(Field field, Object obj, Cif cif) {
        this.f2534 = field;
        this.f2532 = obj;
        this.f2531 = cif;
    }

    ik(Collection collection, Object obj, Cif cif) {
        this.f2533 = collection;
        this.f2532 = obj;
        this.f2531 = cif;
    }

    ik(Map map, Object obj, Cif cif) {
        this.f2535 = map;
        this.f2532 = obj;
        this.f2531 = cif;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Cif
    /* renamed from: ｋ */
    public final T mo7966() {
        T t;
        int i;
        int i2 = 2 % 2;
        if (m8065()) {
            try {
                t = (T) this.f2534.get(this.f2532);
                int i3 = f2525 + 49;
                f2524 = i3 % 128;
                i = i3 % 2 != 0 ? 53 : 23;
                return t;
            } catch (Exception unused) {
                return null;
            }
        }
        if ((!m8070()) && !m8066()) {
            return null;
        }
        t = (T) this.f2532;
        int i4 = f2524 + 55;
        f2525 = i4 % 128;
        if (i4 % 2 != 0) {
            return t;
        }
        int i5 = i / 0;
        return t;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m8069(T t) {
        int i = 2 % 2;
        if (m8065()) {
            int i2 = f2524 + 7;
            f2525 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.f2534.set(this.f2532, t);
                    throw null;
                }
                this.f2534.set(this.f2532, t);
                int i3 = f2524 + 87;
                f2525 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Cif
    /* renamed from: ﾒ */
    public final Field mo7967() {
        int i = 2 % 2;
        int i2 = f2525;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2524 = i3 % 128;
        int i4 = i3 % 2;
        Field field = this.f2534;
        int i5 = i2 + 7;
        f2524 = i5 % 128;
        if (i5 % 2 == 0) {
            return field;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean m8065() {
        int i = 2 % 2;
        int i2 = f2524 + 113;
        int i3 = i2 % 128;
        f2525 = i3;
        int i4 = i2 % 2;
        if (this.f2534 == null) {
            return false;
        }
        int i5 = i3 + 91;
        f2524 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean m8070() {
        int i = 2 % 2;
        int i2 = f2525;
        int i3 = i2 + 63;
        f2524 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f2533 == null) {
            return false;
        }
        int i5 = i2 + 105;
        f2524 = i5 % 128;
        return true ^ (i5 % 2 != 0);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m8066() {
        int i = 2 % 2;
        if (this.f2535 != null) {
            int i2 = f2524 + 81;
            f2525 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f2525 + 85;
        f2524 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return false;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Collection m8062() {
        int i = 2 % 2;
        int i2 = f2525;
        int i3 = i2 + 25;
        f2524 = i3 % 128;
        int i4 = i3 % 2;
        Collection collection = this.f2533;
        int i5 = i2 + 99;
        f2524 = i5 % 128;
        int i6 = i5 % 2;
        return collection;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Map m8064() {
        int i = 2 % 2;
        int i2 = f2524 + 77;
        f2525 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2535;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Cif m8063() {
        int i = 2 % 2;
        int i2 = f2524 + 23;
        int i3 = i2 % 128;
        f2525 = i3;
        int i4 = i2 % 2;
        Cif cif = this.f2531;
        int i5 = i3 + 57;
        f2524 = i5 % 128;
        int i6 = i5 % 2;
        return cif;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Object m8061() {
        int i = 2 % 2;
        int i2 = f2525 + 43;
        int i3 = i2 % 128;
        f2524 = i3;
        int i4 = i2 % 2;
        Object obj = this.f2532;
        int i5 = i3 + 115;
        f2525 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (r17.equals(m8068("\u09d0鏵ᯧ㱢榱坞써Ⲵᙆ代ݧɺ", 12 - android.view.View.MeasureSpec.getSize(0)).intern()) != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        cl clVar2;
        char c;
        int i = 2 % 2;
        try {
            c = '\t';
            switch (str.hashCode()) {
                case -2039060844:
                    if (str.equals(m8067((char) (Process.myPid() >> 22), 31 - (KeyEvent.getMaxKeyCode() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SO).intern())) {
                        int i2 = f2525 + 23;
                        f2524 = i2 % 128;
                        int i3 = i2 % 2;
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1661939189:
                    if (str.equals(m8068("ﷂ퓼唖₰陶ꊕ똃졆곎ꤧ豖䕕", KeyEvent.getDeadChar(0, 0) + 11).intern())) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1249356250:
                    if (str.equals(m8068("ﷂ퓼萝몏뼺礯", 6 - View.getDefaultSize(0, 0)).intern())) {
                        int i4 = f2525 + 37;
                        f2524 = i4 % 128;
                        int i5 = i4 % 2;
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 100472786:
                    if (str.equals(m8068("\u09d0鏵\ueac2쥥몪빕", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4).intern())) {
                        int i6 = f2524 + 107;
                        f2525 = i6 % 128;
                        int i7 = i6 % 2;
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 429960040:
                    break;
                case 700591008:
                    if (str.equals(m8067((char) View.combineMeasuredStates(0, 0), (-16777172) - Color.rgb(0, 0, 0), 9 - Color.red(0)).intern())) {
                        int i8 = f2524 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                        f2525 = i8 % 128;
                        if (i8 % 2 != 0) {
                            c = '\b';
                            break;
                        } else {
                            c = 'I';
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case 1406685743:
                    if (str.equals(m8067((char) KeyEvent.normalizeMetaState(0), 8 - TextUtils.getTrimmedLength(""), Color.alpha(0) + 8).intern())) {
                        int i9 = f2524 + 83;
                        f2525 = i9 % 128;
                        int i10 = i9 % 2;
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953253188:
                    if (str.equals(m8067((char) View.getDefaultSize(0, 0), 23 - Color.argb(0, 0, 0, 0), 8 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1967798203:
                    if (str.equals(m8067((char) (KeyEvent.keyCodeFromString("") + 44218), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 8).intern())) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058833392:
                    if (str.equals(m8067((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 15 - ((byte) KeyEvent.getModifierMetaStateMask()), 6 - Process.getGidForName("")).intern())) {
                        int i11 = f2525 + 45;
                        f2524 = i11 % 128;
                        if (i11 % 2 == 0) {
                            c = 2;
                            break;
                        }
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        switch (c) {
            case 0:
                return mo7966();
            case 1:
                m8069(m7365(list, 0, Object.class));
                return null;
            case 2:
                return Boolean.valueOf(m8065());
            case 3:
                Field mo7967 = mo7967();
                int i12 = f2525 + 89;
                f2524 = i12 % 128;
                int i13 = i12 % 2;
                return mo7967;
            case 4:
                return Boolean.valueOf(m8070());
            case 5:
                return m8062();
            case 6:
                return Boolean.valueOf(m8066());
            case 7:
                Map m8064 = m8064();
                int i14 = f2525 + 87;
                f2524 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 84 / 0;
                }
                return m8064;
            case '\b':
                return m8063();
            case '\t':
                return m8061();
            default:
                clVar2 = clVar;
                try {
                    new ds(clVar2, eeVar, m8067((char) (17170 - (ViewConfiguration.getEdgeSlop() >> 16)), 54 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 15 - Gravity.getAbsoluteGravity(0, 0)).intern(), str).m7593(clVar2.m7203());
                } catch (Exception e2) {
                    e = e2;
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m8067((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43729), 69 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 53).intern()).append(str).append(m8068("棵溵", 1 - Drawable.resolveOpacity(0, 0)).intern()).toString(), e);
                    return null;
                }
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8067(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2530[c.f1198 + i] ^ (c.f1198 * f2529)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8068(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2526)) ^ ((c2 >>> 5) + f2523)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2527) ^ ((c3 + i2) ^ ((c3 << 4) + f2528))));
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
