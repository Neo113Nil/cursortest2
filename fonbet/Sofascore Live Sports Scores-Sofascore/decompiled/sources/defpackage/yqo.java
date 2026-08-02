package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.ironsource.InterfaceC4060ee;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.fantasy.BasicTeam;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yqo {
    public static final Object a = new Object();
    public static final tc3 b = new tc3(1387500687, new ed3(27), false);
    public static final tc3 c = new tc3(-2034542403, new ed3(28), false);
    public static final tc3 d = new tc3(731916844, new pd3(26), false);
    public static final hz7 e = new hz7(0);
    public static final TrustManager[] f = {new x3g(1)};
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;

    public static final k7d A(Fragment fragment) {
        Dialog dialog;
        Window window;
        fragment.getClass();
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).j();
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().A;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).j();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return g7a.t(view);
        }
        DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
        View decorView = (dialogFragment == null || (dialog = dialogFragment.l) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return g7a.t(decorView);
        }
        a70.r(fc6.m("Fragment ", fragment, " does not have a NavController set"));
        return null;
    }

    public static final th2 B(z88 z88Var, g6b g6bVar, e6b e6bVar) {
        z88Var.getClass();
        g6bVar.getClass();
        return yso.q(new u1(g6bVar, e6bVar, z88Var, (rq3) null, 26));
    }

    public static final String C(long j2, String str, Locale locale, LinkedHashMap linkedHashMap) {
        StringBuilder r = mz1.r("S:", str);
        r.append(locale.toLanguageTag());
        String sb = r.toString();
        Object obj = linkedHashMap.get(sb);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(sb, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j2));
    }

    public static final Paint D(gtj gtjVar) {
        if (gtjVar == null) {
            q3a.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + duf.a.getOrCreateKotlinClass(gtjVar.getClass()).getQualifiedName());
        }
        return (Paint) gtjVar.d;
    }

    public static final void E(l9j l9jVar, int i2, int i3) {
        pej pejVar = l9jVar.f;
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        l9jVar.c(min, max, "");
        if (pejVar != null) {
            long o = cga.o(min, max, 0, pejVar.a);
            if (pej.d(o)) {
                l9jVar.e(null);
            } else {
                l9jVar.d(pej.g(o), pej.f(o), null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r8 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        r6.e(null);
        r6.h = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void F(l9j l9jVar, int i2, int i3, CharSequence charSequence) {
        mo2 mo2Var = l9jVar.c;
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        int i4 = 0;
        int i5 = min;
        while (i5 < max && i4 < charSequence.length() && charSequence.charAt(i4) == mo2Var.charAt(i5)) {
            i4++;
            i5++;
        }
        int length = charSequence.length();
        while (max > i5 && length > i4 && charSequence.charAt(length - 1) == mo2Var.charAt(max - 1)) {
            length--;
            max--;
        }
        l9jVar.c(i5, max, charSequence.subSequence(i4, length));
        int length2 = charSequence.length() + min;
        l9jVar.f(t6a.g(length2, length2));
    }

    public static up3 G(String str) {
        int i2;
        Pair pair;
        str.getClass();
        if (StringsKt.R(str)) {
            return up3.e;
        }
        joa a2 = ypa.a(ysa.c, new fc9(8));
        for (int i3 = 0; i3 <= str.length() - 1; i3 = i2) {
            joa a3 = ypa.a(ysa.c, new fc9(9));
            Integer num = null;
            i2 = i3;
            while (true) {
                if (i2 <= str.length() - 1) {
                    char charAt = str.charAt(i2);
                    if (charAt == ',') {
                        ((ArrayList) a2.getValue()).add(new g89(StringsKt.l0(str.substring(i3, num != null ? num.intValue() : i2)).toString(), a3.isInitialized() ? (List) a3.getValue() : km5.a));
                        i2++;
                    } else if (charAt != ';') {
                        i2++;
                    } else {
                        if (num == null) {
                            num = Integer.valueOf(i2);
                        }
                        int i4 = i2 + 1;
                        int i5 = i4;
                        while (i5 <= StringsKt.N(str)) {
                            char charAt2 = str.charAt(i5);
                            if (charAt2 == ',' || charAt2 == ';') {
                                ok3.I(a3, str, i4, i5, "");
                                break;
                            }
                            if (charAt2 != '=') {
                                i5++;
                            } else {
                                int i6 = i5 + 1;
                                if (str.length() == i6) {
                                    pair = new Pair(Integer.valueOf(i6), "");
                                } else {
                                    char c2 = '\"';
                                    if (str.charAt(i6) == '\"') {
                                        int i7 = i5 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (i7 <= str.length() - 1) {
                                            char charAt3 = str.charAt(i7);
                                            if (charAt3 == c2) {
                                                int i8 = i7 + 1;
                                                int i9 = i8;
                                                while (i9 < str.length() && str.charAt(i9) == ' ') {
                                                    i9++;
                                                }
                                                if (i9 == str.length() || str.charAt(i9) == ';' || str.charAt(i9) == ',') {
                                                    pair = new Pair(Integer.valueOf(i8), sb.toString());
                                                    break;
                                                }
                                            }
                                            if (charAt3 != '\\' || i7 >= str.length() - 3) {
                                                sb.append(charAt3);
                                                i7++;
                                            } else {
                                                sb.append(str.charAt(i7 + 1));
                                                i7 += 2;
                                            }
                                            c2 = '\"';
                                        }
                                        pair = new Pair(Integer.valueOf(i7), "\"".concat(sb.toString()));
                                    } else {
                                        int i10 = i6;
                                        while (i10 <= str.length() - 1) {
                                            char charAt4 = str.charAt(i10);
                                            if (charAt4 == ',' || charAt4 == ';') {
                                                pair = new Pair(Integer.valueOf(i10), StringsKt.l0(str.substring(i6, i10)).toString());
                                                break;
                                            }
                                            i10++;
                                        }
                                        pair = new Pair(Integer.valueOf(i10), StringsKt.l0(str.substring(i6, i10)).toString());
                                    }
                                }
                                int intValue = ((Number) pair.a).intValue();
                                ok3.I(a3, str, i4, i5, (String) pair.b);
                                i2 = intValue;
                            }
                        }
                        ok3.I(a3, str, i4, i5, "");
                        i2 = i5;
                    }
                } else {
                    ((ArrayList) a2.getValue()).add(new g89(StringsKt.l0(str.substring(i3, num != null ? num.intValue() : i2)).toString(), a3.isInitialized() ? (List) a3.getValue() : km5.a));
                }
            }
        }
        g89 g89Var = (g89) CollectionsKt.h0(a2.isInitialized() ? (List) a2.getValue() : km5.a);
        String str2 = g89Var.a;
        List list = g89Var.b;
        int O = StringsKt.O(str2, '/', 0, 6);
        if (O == -1) {
            if (Intrinsics.c(StringsKt.l0(str2).toString(), "*")) {
                return up3.e;
            }
            throw new wo0(str);
        }
        String obj = StringsKt.l0(str2.substring(0, O)).toString();
        if (obj.length() == 0) {
            throw new wo0(str);
        }
        String obj2 = StringsKt.l0(str2.substring(O + 1)).toString();
        if (StringsKt.K(obj, ' ') || StringsKt.K(obj2, ' ')) {
            throw new wo0(str);
        }
        if (obj2.length() == 0 || StringsKt.K(obj2, '/')) {
            throw new wo0(str);
        }
        return new up3(obj, obj2, list);
    }

    public static final tc3 H(int i2, of3 of3Var, dt8 dt8Var) {
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = new tc3(i2, dt8Var, true);
            av8Var.n0(O);
        }
        tc3 tc3Var = (tc3) O;
        tc3Var.k(dt8Var);
        return tc3Var;
    }

    public static final int I(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final long J(long j2) {
        return ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    public static final xtc K(xtc xtcVar, mzg mzgVar, float f2, av8 av8Var) {
        View view = (View) av8Var.k(nz.f);
        boolean g2 = av8Var.g(mzgVar);
        Object O = av8Var.O();
        int i2 = 0;
        a99 a99Var = nf3.a;
        if (g2 || O == a99Var) {
            O = new lu5(mzgVar, i2);
            av8Var.n0(O);
        }
        Function0 function0 = (Function0) O;
        boolean g3 = av8Var.g(mzgVar) | av8Var.d(f2);
        Object O2 = av8Var.O();
        if (g3 || O2 == a99Var) {
            O2 = new zeh(mzgVar, f2, 2);
            av8Var.n0(O2);
        }
        Function0 function02 = (Function0) O2;
        boolean g4 = av8Var.g(mzgVar);
        Object O3 = av8Var.O();
        if (g4 || O3 == a99Var) {
            O3 = new qu5(mzgVar, i2);
            av8Var.n0(O3);
        }
        return i9a.v(xtcVar, view, function0, function02, (Function1) O3, av8Var, 0);
    }

    public static final String L(byte b2) {
        char[] cArr = hkg.k;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String M(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = hkg.k;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        return c.i(cArr2, i3, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, xtc xtcVar, Function2 function2, Function2 function22, final String str, String str2, String str3, String str4, boolean z2, boolean z3, final boolean z4, long j2, Function0 function0, long j3, boolean z5, boolean z6, long j4, final tc3 tc3Var, of3 of3Var, final int i2, final int i3, final int i4) {
        int i5;
        xtc xtcVar2;
        int i6;
        Function2 function23;
        int i7;
        String str5;
        int i8;
        String str6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Function2 function24;
        av8 av8Var;
        final String str7;
        final long j5;
        final boolean z7;
        final boolean z8;
        final long j6;
        final String str8;
        final Function2 function25;
        final String str9;
        final xtc xtcVar3;
        final boolean z9;
        final boolean z10;
        final Function0 function02;
        final long j7;
        eqf u;
        boolean z11;
        long j8;
        int i22;
        long j9;
        String str10;
        long j10;
        boolean z12;
        String str11;
        Function2 function26;
        boolean z13;
        xtc xtcVar4;
        Function0 function03;
        boolean z14;
        int i23;
        long j11;
        int i24;
        long j12;
        String str12;
        Function2 function27;
        Function0 function04;
        float f2;
        long j13;
        boolean z15;
        long j14;
        int i25;
        float f3;
        Function2 function28;
        boolean z16;
        boolean z17;
        Function2 function29;
        Function0 function05;
        f50 f50Var;
        int i26;
        zg3 zg3Var;
        long j15;
        f50 f50Var2;
        ff3 ff3Var;
        ry ryVar;
        boolean z18;
        String str13;
        long j16;
        av8 av8Var2;
        boolean z19;
        int i27;
        int i28;
        int i29;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1645219935);
        if ((i2 & 6) == 0) {
            i5 = (av8Var3.h(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i30 = i4 & 2;
        if (i30 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var3.g(xtcVar2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                function23 = function2;
                i5 |= av8Var3.i(function23) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                int i31 = 1024;
                if ((i2 & 3072) == 0) {
                    i5 |= av8Var3.i(function22) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    i5 |= av8Var3.g(str) ? 16384 : 8192;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= 196608;
                    str5 = str2;
                } else {
                    str5 = str2;
                    if ((i2 & 196608) == 0) {
                        i5 |= av8Var3.g(str5) ? 131072 : 65536;
                    }
                }
                i8 = i4 & 64;
                int i32 = 524288;
                if (i8 != 0) {
                    i5 |= 1572864;
                    str6 = str3;
                } else {
                    str6 = str3;
                    if ((i2 & 1572864) == 0) {
                        i5 |= av8Var3.g(str6) ? 1048576 : 524288;
                    }
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i10 = i9;
                    i5 |= av8Var3.g(str4) ? 8388608 : 4194304;
                    i11 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i12 = i11;
                        i5 |= av8Var3.h(z2) ? 67108864 : 33554432;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i14 = i13;
                            i15 = i5 | 805306368;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= av8Var3.h(z3) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        if ((i3 & 6) == 0) {
                            i16 = i3 | (av8Var3.h(z4) ? 4 : 2);
                        } else {
                            i16 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            if ((i4 & a.o) == 0 && av8Var3.f(j2)) {
                                i29 = 32;
                                i16 |= i29;
                            }
                            i29 = 16;
                            i16 |= i29;
                        }
                        i17 = i4 & 4096;
                        if (i17 != 0) {
                            i16 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i16 |= av8Var3.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                            if ((i3 & 3072) == 0) {
                                if ((i4 & 8192) == 0 && av8Var3.f(j3)) {
                                    i31 = 2048;
                                }
                                i16 |= i31;
                            }
                            i18 = i4 & 16384;
                            if (i18 == 0) {
                                i16 |= 24576;
                            } else if ((i3 & 24576) == 0) {
                                i16 |= av8Var3.h(z5) ? 16384 : 8192;
                                i19 = i4 & 32768;
                                if (i19 != 0) {
                                    i16 |= 196608;
                                } else if ((i3 & 196608) == 0) {
                                    i20 = i18;
                                    i16 |= av8Var3.h(z6) ? 131072 : 65536;
                                    if ((i3 & 1572864) == 0) {
                                        if ((i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0 && av8Var3.f(j4)) {
                                            i32 = 1048576;
                                        }
                                        i16 |= i32;
                                    }
                                    if ((i3 & 12582912) == 0) {
                                        i16 |= av8Var3.i(tc3Var) ? 8388608 : 4194304;
                                    }
                                    i21 = i16;
                                    if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                                        function24 = function22;
                                        av8Var = av8Var3;
                                        av8Var.W();
                                        str7 = str4;
                                        j5 = j2;
                                        z7 = z5;
                                        z8 = z6;
                                        j6 = j4;
                                        str8 = str6;
                                        function25 = function23;
                                        str9 = str5;
                                        xtcVar3 = xtcVar2;
                                        z9 = z2;
                                        z10 = z3;
                                        function02 = function0;
                                        j7 = j3;
                                    } else {
                                        av8Var3.Y();
                                        int i33 = i2 & 1;
                                        utc utcVar = utc.a;
                                        if (i33 == 0 || av8Var3.B()) {
                                            if (i30 != 0) {
                                                xtcVar2 = utcVar;
                                            }
                                            if (i6 != 0) {
                                                function23 = null;
                                            }
                                            if (i7 != 0) {
                                                str5 = null;
                                            }
                                            if (i8 != 0) {
                                                str6 = null;
                                            }
                                            String str14 = i10 != 0 ? null : str4;
                                            z11 = i12 != 0 ? false : z2;
                                            boolean z20 = i14 != 0 ? true : z3;
                                            if ((i4 & a.o) != 0) {
                                                j8 = lz.D(R.color.primary_default, av8Var3);
                                                i22 = i21 & (-113);
                                            } else {
                                                j8 = j2;
                                                i22 = i21;
                                            }
                                            Function0 function06 = i17 != 0 ? null : function0;
                                            if ((i4 & 8192) != 0) {
                                                j9 = lz.D(R.color.surface_2, av8Var3);
                                                i22 &= -7169;
                                            } else {
                                                j9 = j3;
                                            }
                                            boolean z21 = i20 != 0 ? true : z5;
                                            boolean z22 = i19 != 0 ? true : z6;
                                            String str15 = str14;
                                            if ((i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
                                                j10 = lz.D(R.color.n_lv_3, av8Var3);
                                                str10 = str15;
                                                z12 = z21;
                                                str11 = str6;
                                                function26 = function23;
                                                z13 = z20;
                                                function03 = function06;
                                                z14 = z22;
                                                j11 = j9;
                                                i23 = i22 & (-3670017);
                                                xtcVar4 = xtcVar2;
                                            } else {
                                                str10 = str15;
                                                j10 = j4;
                                                z12 = z21;
                                                str11 = str6;
                                                function26 = function23;
                                                z13 = z20;
                                                xtcVar4 = xtcVar2;
                                                function03 = function06;
                                                z14 = z22;
                                                i23 = i22;
                                                j11 = j9;
                                            }
                                        } else {
                                            av8Var3.W();
                                            int i34 = (i4 & a.o) != 0 ? i21 & (-113) : i21;
                                            if ((i4 & 8192) != 0) {
                                                i34 &= -7169;
                                            }
                                            if ((i4 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
                                                i34 &= -3670017;
                                            }
                                            str10 = str4;
                                            z11 = z2;
                                            z13 = z3;
                                            j8 = j2;
                                            z12 = z5;
                                            z14 = z6;
                                            j10 = j4;
                                            i23 = i34;
                                            str11 = str6;
                                            function26 = function23;
                                            xtcVar4 = xtcVar2;
                                            function03 = function0;
                                            j11 = j3;
                                        }
                                        av8Var3.t();
                                        boolean z23 = z11;
                                        i4k h0 = s02.h0(200, 0, null, 6);
                                        int i35 = R.color.error;
                                        if (z23) {
                                            i24 = 508418633;
                                        } else if (z4) {
                                            av8Var3.d0(508419787);
                                            av8Var3.s(false);
                                            j12 = j8;
                                            cdi a2 = wih.a(j12, h0, null, av8Var3, 48, 12);
                                            kv1 kv1Var = uxf.o;
                                            xtc Y = fz8.Y(bkh.b(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 1), n9a.a);
                                            p4h p4hVar = ww9.d;
                                            u23 a3 = t23.a(p4hVar, kv1Var, av8Var3, 48);
                                            int i36 = i23;
                                            int hashCode = Long.hashCode(av8Var3.T);
                                            aee m = av8Var3.m();
                                            xtc C = fqj.C(av8Var3, Y);
                                            if3.k7.getClass();
                                            zg3 zg3Var2 = hf3.b;
                                            av8Var3.h0();
                                            xtc xtcVar5 = xtcVar4;
                                            if (av8Var3.S) {
                                                av8Var3.q0();
                                            } else {
                                                av8Var3.l(zg3Var2);
                                            }
                                            f50 f50Var3 = hf3.g;
                                            waa.K(av8Var3, a3, f50Var3);
                                            ff3 ff3Var2 = hf3.f;
                                            waa.K(av8Var3, m, ff3Var2);
                                            Integer valueOf = Integer.valueOf(hashCode);
                                            str12 = str5;
                                            f50 f50Var4 = hf3.j;
                                            waa.K(av8Var3, valueOf, f50Var4);
                                            ry ryVar2 = hf3.k;
                                            waa.J(av8Var3, ryVar2);
                                            f50 f50Var5 = hf3.d;
                                            waa.K(av8Var3, C, f50Var5);
                                            lv1 lv1Var = uxf.m;
                                            av8Var3.d0(1294533858);
                                            xtc A = wnn.A(utcVar, o7g.a(8.0f));
                                            if (function03 == null && z13) {
                                                function27 = function26;
                                                boolean z24 = (i36 & 896) == 256;
                                                Object O = av8Var3.O();
                                                if (z24 || O == nf3.a) {
                                                    O = new v61(0, function03);
                                                    av8Var3.n0(O);
                                                }
                                                xtc w = oyn.w(utcVar, false, null, null, (Function0) O, 15);
                                                utcVar = utcVar;
                                                A = A.z(w);
                                            } else {
                                                function27 = function26;
                                            }
                                            av8Var3.s(false);
                                            if (!z13 || z23) {
                                                function04 = function03;
                                                f2 = 1.0f;
                                            } else {
                                                function04 = function03;
                                                f2 = 0.7f;
                                            }
                                            xtc q = n9e.q(bkh.b(fn0.e(1.0f, u6h.C(A, f2), true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 1), j11, oyn.e);
                                            if (z14) {
                                                j13 = j11;
                                            } else {
                                                j13 = j11;
                                                qz1 H = fcp.H(((r13) a2.getValue()).a, 1.0f);
                                                q = q.z(yso.p(utcVar, H.a, H.b, o7g.a(8.0f)));
                                            }
                                            xtc d0 = l98.d0(q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, !z ? 12.0f : 4.0f, 1);
                                            wxf wxfVar = ww9.b;
                                            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var3, 48);
                                            int hashCode2 = Long.hashCode(av8Var3.T);
                                            aee m2 = av8Var3.m();
                                            xtc C2 = fqj.C(av8Var3, d0);
                                            av8Var3.h0();
                                            if (av8Var3.S) {
                                                av8Var3.q0();
                                            } else {
                                                av8Var3.l(zg3Var2);
                                            }
                                            waa.K(av8Var3, a4, f50Var3);
                                            waa.K(av8Var3, m2, ff3Var2);
                                            bf3.s(hashCode2, av8Var3, f50Var4, av8Var3, ryVar2);
                                            waa.K(av8Var3, C2, f50Var5);
                                            utc utcVar2 = utcVar;
                                            xtc f0 = l98.f0(utcVar2, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                                            if (1.0f <= 0.0d) {
                                                p3a.a("invalid weight; must be greater than zero");
                                            }
                                            xtc z25 = f0.z(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                                            u23 a5 = t23.a(p4hVar, kv1Var, av8Var3, 0);
                                            int hashCode3 = Long.hashCode(av8Var3.T);
                                            aee m3 = av8Var3.m();
                                            xtc C3 = fqj.C(av8Var3, z25);
                                            av8Var3.h0();
                                            if (av8Var3.S) {
                                                av8Var3.q0();
                                            } else {
                                                av8Var3.l(zg3Var2);
                                            }
                                            waa.K(av8Var3, a5, f50Var3);
                                            waa.K(av8Var3, m3, ff3Var2);
                                            bf3.s(hashCode3, av8Var3, f50Var4, av8Var3, ryVar2);
                                            waa.K(av8Var3, C3, f50Var5);
                                            if (str != null) {
                                                av8Var3.d0(-1519155578);
                                                i25 = 0;
                                                av8Var3.s(false);
                                                z15 = z23;
                                                j14 = j8;
                                            } else {
                                                av8Var3.d0(-1519155577);
                                                long j17 = j8;
                                                o(str, z, z23, z4, null, j17, av8Var3, ((i15 >> 12) & 14) | ((i15 << 3) & 112) | ((i15 >> 18) & 896) | ((i36 << 9) & 7168) | ((i36 << 12) & 458752));
                                                z15 = z23;
                                                j14 = j17;
                                                Unit unit = Unit.a;
                                                i25 = 0;
                                                av8Var3.s(false);
                                            }
                                            l8g a6 = k8g.a(wxfVar, uxf.l, av8Var3, i25);
                                            int hashCode4 = Long.hashCode(av8Var3.T);
                                            aee m4 = av8Var3.m();
                                            xtc C4 = fqj.C(av8Var3, utcVar2);
                                            av8Var3.h0();
                                            if (av8Var3.S) {
                                                av8Var3.q0();
                                            } else {
                                                av8Var3.l(zg3Var2);
                                            }
                                            waa.K(av8Var3, a6, f50Var3);
                                            waa.K(av8Var3, m4, ff3Var2);
                                            bf3.s(hashCode4, av8Var3, f50Var4, av8Var3, ryVar2);
                                            waa.K(av8Var3, C4, f50Var5);
                                            if (function27 != null) {
                                                av8Var3.d0(-101262067);
                                                z16 = false;
                                                av8Var3.s(false);
                                                f3 = 12.0f;
                                                function28 = function27;
                                            } else {
                                                av8Var3.d0(-101262066);
                                                xtc f02 = l98.f0(new nok(lv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                                                f3 = 12.0f;
                                                k1c c2 = e12.c(uxf.c, false);
                                                int hashCode5 = Long.hashCode(av8Var3.T);
                                                aee m5 = av8Var3.m();
                                                xtc C5 = fqj.C(av8Var3, f02);
                                                av8Var3.h0();
                                                if (av8Var3.S) {
                                                    av8Var3.l(zg3Var2);
                                                } else {
                                                    av8Var3.q0();
                                                }
                                                waa.K(av8Var3, c2, f50Var3);
                                                waa.K(av8Var3, m5, ff3Var2);
                                                bf3.s(hashCode5, av8Var3, f50Var4, av8Var3, ryVar2);
                                                waa.K(av8Var3, C5, f50Var5);
                                                function28 = function27;
                                                me4.l((i15 >> 6) & 14, function28, av8Var3, true);
                                                Unit unit2 = Unit.a;
                                                z16 = false;
                                                av8Var3.s(false);
                                            }
                                            mv1 mv1Var = uxf.c;
                                            k1c c3 = e12.c(mv1Var, z16);
                                            int hashCode6 = Long.hashCode(av8Var3.T);
                                            aee m6 = av8Var3.m();
                                            xtc C6 = fqj.C(av8Var3, utcVar2);
                                            av8Var3.h0();
                                            z17 = z15;
                                            if (av8Var3.S) {
                                                av8Var3.q0();
                                            } else {
                                                av8Var3.l(zg3Var2);
                                            }
                                            waa.K(av8Var3, c3, f50Var3);
                                            waa.K(av8Var3, m6, ff3Var2);
                                            bf3.s(hashCode6, av8Var3, f50Var4, av8Var3, ryVar2);
                                            waa.K(av8Var3, C6, f50Var5);
                                            if (str12 != null) {
                                                av8Var3.d0(-1103398449);
                                                av8Var3.s(false);
                                                f50Var2 = f50Var5;
                                                function29 = function28;
                                                z18 = false;
                                                zg3Var = zg3Var2;
                                                ryVar = ryVar2;
                                                f50Var = f50Var4;
                                                i26 = i36;
                                                str13 = str12;
                                                function05 = function04;
                                                j16 = j10;
                                                j15 = j13;
                                                av8Var2 = av8Var3;
                                                ff3Var = ff3Var2;
                                            } else {
                                                av8Var3.d0(-1103398448);
                                                yf8 yf8Var = xth.a;
                                                long j18 = j10;
                                                function29 = function28;
                                                function05 = function04;
                                                f50Var = f50Var4;
                                                i26 = i36;
                                                zg3Var = zg3Var2;
                                                j15 = j13;
                                                f50Var2 = f50Var5;
                                                ff3Var = ff3Var2;
                                                ryVar = ryVar2;
                                                z18 = false;
                                                udj.c(str12, null, j18, null, 0L, null, 0L, null, null, 0L, 2, false, z12 ? 1 : Integer.MAX_VALUE, 0, null, xth.d(), av8Var3, ((i15 >> 15) & 14) | ((i36 >> 12) & 896), 384, 110586);
                                                str13 = str12;
                                                j16 = j18;
                                                av8Var2 = av8Var3;
                                                Unit unit3 = Unit.a;
                                                av8Var2.s(false);
                                            }
                                            tc3Var.invoke(utcVar2, av8Var2, Integer.valueOf(((i26 >> 18) & 112) | 6));
                                            av8Var2.s(true);
                                            av8Var2.s(true);
                                            av8Var2.s(true);
                                            if (function22 != null) {
                                                av8Var2.d0(-575229722);
                                                av8Var2.s(z18);
                                                function24 = function22;
                                                z19 = true;
                                            } else {
                                                av8Var2.d0(-575229721);
                                                xtc f03 = l98.f0(new nok(lv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                                                k1c c4 = e12.c(mv1Var, z18);
                                                int hashCode7 = Long.hashCode(av8Var2.T);
                                                aee m7 = av8Var2.m();
                                                xtc C7 = fqj.C(av8Var2, f03);
                                                av8Var2.h0();
                                                if (av8Var2.S) {
                                                    av8Var2.l(zg3Var);
                                                } else {
                                                    av8Var2.q0();
                                                }
                                                waa.K(av8Var2, c4, f50Var3);
                                                waa.K(av8Var2, m7, ff3Var);
                                                bf3.s(hashCode7, av8Var2, f50Var, av8Var2, ryVar);
                                                waa.K(av8Var2, C7, f50Var2);
                                                function24 = function22;
                                                z19 = true;
                                                me4.l((i15 >> 9) & 14, function24, av8Var2, true);
                                                Unit unit4 = Unit.a;
                                                av8Var2.s(z18);
                                            }
                                            av8Var2.s(z19);
                                            if (str11 == null || (str10 != null && z17)) {
                                                av8Var2.d0(1478169401);
                                                String str16 = "";
                                                if (z17) {
                                                    if (str11 != null) {
                                                        str16 = str11;
                                                    }
                                                } else if (str10 != null) {
                                                    str16 = str10;
                                                }
                                                yf8 yf8Var2 = xth.a;
                                                dfj b2 = xth.b();
                                                if (z17) {
                                                    i27 = 1294615070;
                                                    i28 = R.color.n_lv_3;
                                                } else {
                                                    i27 = 1294614559;
                                                    i28 = R.color.error;
                                                }
                                                av8 av8Var4 = av8Var2;
                                                udj.c(str16, l98.c0(utcVar2, 16.0f, 4.0f), ljg.f(av8Var2, i27, i28, av8Var2, z18), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, av8Var4, 48, 0, 131064);
                                                av8Var = av8Var4;
                                                av8Var.s(z18);
                                            } else {
                                                av8Var2.d0(1478475309);
                                                av8Var2.s(z18);
                                                av8Var = av8Var2;
                                            }
                                            av8Var.s(true);
                                            z9 = z17;
                                            str8 = str11;
                                            str7 = str10;
                                            z10 = z13;
                                            z7 = z12;
                                            z8 = z14;
                                            xtcVar3 = xtcVar5;
                                            j5 = j14;
                                            function25 = function29;
                                            function02 = function05;
                                            j7 = j15;
                                            str9 = str13;
                                            j6 = j16;
                                        } else {
                                            i24 = 508420840;
                                            i35 = R.color.n_lv_4;
                                        }
                                        j12 = ljg.f(av8Var3, i24, i35, av8Var3, false);
                                        cdi a22 = wih.a(j12, h0, null, av8Var3, 48, 12);
                                        kv1 kv1Var2 = uxf.o;
                                        xtc Y2 = fz8.Y(bkh.b(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 1), n9a.a);
                                        p4h p4hVar2 = ww9.d;
                                        u23 a32 = t23.a(p4hVar2, kv1Var2, av8Var3, 48);
                                        int i362 = i23;
                                        int hashCode8 = Long.hashCode(av8Var3.T);
                                        aee m8 = av8Var3.m();
                                        xtc C8 = fqj.C(av8Var3, Y2);
                                        if3.k7.getClass();
                                        zg3 zg3Var22 = hf3.b;
                                        av8Var3.h0();
                                        xtc xtcVar52 = xtcVar4;
                                        if (av8Var3.S) {
                                        }
                                        f50 f50Var32 = hf3.g;
                                        waa.K(av8Var3, a32, f50Var32);
                                        ff3 ff3Var22 = hf3.f;
                                        waa.K(av8Var3, m8, ff3Var22);
                                        Integer valueOf2 = Integer.valueOf(hashCode8);
                                        str12 = str5;
                                        f50 f50Var42 = hf3.j;
                                        waa.K(av8Var3, valueOf2, f50Var42);
                                        ry ryVar22 = hf3.k;
                                        waa.J(av8Var3, ryVar22);
                                        f50 f50Var52 = hf3.d;
                                        waa.K(av8Var3, C8, f50Var52);
                                        lv1 lv1Var2 = uxf.m;
                                        av8Var3.d0(1294533858);
                                        xtc A2 = wnn.A(utcVar, o7g.a(8.0f));
                                        if (function03 == null) {
                                        }
                                        function27 = function26;
                                        av8Var3.s(false);
                                        if (z13) {
                                        }
                                        function04 = function03;
                                        f2 = 1.0f;
                                        xtc q2 = n9e.q(bkh.b(fn0.e(1.0f, u6h.C(A2, f2), true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 1), j11, oyn.e);
                                        if (z14) {
                                        }
                                        xtc d02 = l98.d0(q2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, !z ? 12.0f : 4.0f, 1);
                                        wxf wxfVar2 = ww9.b;
                                        l8g a42 = k8g.a(wxfVar2, lv1Var2, av8Var3, 48);
                                        int hashCode22 = Long.hashCode(av8Var3.T);
                                        aee m22 = av8Var3.m();
                                        xtc C22 = fqj.C(av8Var3, d02);
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                        }
                                        waa.K(av8Var3, a42, f50Var32);
                                        waa.K(av8Var3, m22, ff3Var22);
                                        bf3.s(hashCode22, av8Var3, f50Var42, av8Var3, ryVar22);
                                        waa.K(av8Var3, C22, f50Var52);
                                        utc utcVar22 = utcVar;
                                        xtc f04 = l98.f0(utcVar22, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                                        if (1.0f <= 0.0d) {
                                        }
                                        xtc z252 = f04.z(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                                        u23 a52 = t23.a(p4hVar2, kv1Var2, av8Var3, 0);
                                        int hashCode32 = Long.hashCode(av8Var3.T);
                                        aee m32 = av8Var3.m();
                                        xtc C32 = fqj.C(av8Var3, z252);
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                        }
                                        waa.K(av8Var3, a52, f50Var32);
                                        waa.K(av8Var3, m32, ff3Var22);
                                        bf3.s(hashCode32, av8Var3, f50Var42, av8Var3, ryVar22);
                                        waa.K(av8Var3, C32, f50Var52);
                                        if (str != null) {
                                        }
                                        l8g a62 = k8g.a(wxfVar2, uxf.l, av8Var3, i25);
                                        int hashCode42 = Long.hashCode(av8Var3.T);
                                        aee m42 = av8Var3.m();
                                        xtc C42 = fqj.C(av8Var3, utcVar22);
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                        }
                                        waa.K(av8Var3, a62, f50Var32);
                                        waa.K(av8Var3, m42, ff3Var22);
                                        bf3.s(hashCode42, av8Var3, f50Var42, av8Var3, ryVar22);
                                        waa.K(av8Var3, C42, f50Var52);
                                        if (function27 != null) {
                                        }
                                        mv1 mv1Var2 = uxf.c;
                                        k1c c32 = e12.c(mv1Var2, z16);
                                        int hashCode62 = Long.hashCode(av8Var3.T);
                                        aee m62 = av8Var3.m();
                                        xtc C62 = fqj.C(av8Var3, utcVar22);
                                        av8Var3.h0();
                                        z17 = z15;
                                        if (av8Var3.S) {
                                        }
                                        waa.K(av8Var3, c32, f50Var32);
                                        waa.K(av8Var3, m62, ff3Var22);
                                        bf3.s(hashCode62, av8Var3, f50Var42, av8Var3, ryVar22);
                                        waa.K(av8Var3, C62, f50Var52);
                                        if (str12 != null) {
                                        }
                                        tc3Var.invoke(utcVar22, av8Var2, Integer.valueOf(((i26 >> 18) & 112) | 6));
                                        av8Var2.s(true);
                                        av8Var2.s(true);
                                        av8Var2.s(true);
                                        if (function22 != null) {
                                        }
                                        av8Var2.s(z19);
                                        if (str11 == null) {
                                        }
                                        av8Var2.d0(1478169401);
                                        String str162 = "";
                                        if (z17) {
                                        }
                                        yf8 yf8Var22 = xth.a;
                                        dfj b22 = xth.b();
                                        if (z17) {
                                        }
                                        av8 av8Var42 = av8Var2;
                                        udj.c(str162, l98.c0(utcVar22, 16.0f, 4.0f), ljg.f(av8Var2, i27, i28, av8Var2, z18), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b22, av8Var42, 48, 0, 131064);
                                        av8Var = av8Var42;
                                        av8Var.s(z18);
                                        av8Var.s(true);
                                        z9 = z17;
                                        str8 = str11;
                                        str7 = str10;
                                        z10 = z13;
                                        z7 = z12;
                                        z8 = z14;
                                        xtcVar3 = xtcVar52;
                                        j5 = j14;
                                        function25 = function29;
                                        function02 = function05;
                                        j7 = j15;
                                        str9 = str13;
                                        j6 = j16;
                                    }
                                    u = av8Var.u();
                                    if (u == null) {
                                        final Function2 function210 = function24;
                                        u.d = new Function2() { // from class: w61
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                int K = aba.K(i2 | 1);
                                                int K2 = aba.K(i3);
                                                yqo.a(z, xtcVar3, function25, function210, str, str9, str8, str7, z9, z10, z4, j5, function02, j7, z7, z8, j6, tc3Var, (of3) obj, K, K2, i4);
                                                return Unit.a;
                                            }
                                        };
                                        return;
                                    }
                                    return;
                                }
                                i20 = i18;
                                if ((i3 & 1572864) == 0) {
                                }
                                if ((i3 & 12582912) == 0) {
                                }
                                i21 = i16;
                                if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                                }
                                u = av8Var.u();
                                if (u == null) {
                                }
                            }
                            i19 = i4 & 32768;
                            if (i19 != 0) {
                            }
                            i20 = i18;
                            if ((i3 & 1572864) == 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            i21 = i16;
                            if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                            }
                            u = av8Var.u();
                            if (u == null) {
                            }
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        i18 = i4 & 16384;
                        if (i18 == 0) {
                        }
                        i19 = i4 & 32768;
                        if (i19 != 0) {
                        }
                        i20 = i18;
                        if ((i3 & 1572864) == 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        i21 = i16;
                        if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                        }
                        u = av8Var.u();
                        if (u == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    if ((i3 & 6) == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    i17 = i4 & 4096;
                    if (i17 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    i18 = i4 & 16384;
                    if (i18 == 0) {
                    }
                    i19 = i4 & 32768;
                    if (i19 != 0) {
                    }
                    i20 = i18;
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i21 = i16;
                    if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                    }
                    u = av8Var.u();
                    if (u == null) {
                    }
                }
                i10 = i9;
                i11 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                if ((i3 & 6) == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i17 = i4 & 4096;
                if (i17 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                i18 = i4 & 16384;
                if (i18 == 0) {
                }
                i19 = i4 & 32768;
                if (i19 != 0) {
                }
                i20 = i18;
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i21 = i16;
                if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
                }
                u = av8Var.u();
                if (u == null) {
                }
            }
            function23 = function2;
            int i312 = 1024;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            i8 = i4 & 64;
            int i322 = 524288;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            if ((i3 & 6) == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i17 = i4 & 4096;
            if (i17 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            i18 = i4 & 16384;
            if (i18 == 0) {
            }
            i19 = i4 & 32768;
            if (i19 != 0) {
            }
            i20 = i18;
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i21 = i16;
            if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
            }
            u = av8Var.u();
            if (u == null) {
            }
        }
        xtcVar2 = xtcVar;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        function23 = function2;
        int i3122 = 1024;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        i8 = i4 & 64;
        int i3222 = 524288;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        if ((i3 & 6) == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i17 = i4 & 4096;
        if (i17 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i18 = i4 & 16384;
        if (i18 == 0) {
        }
        i19 = i4 & 32768;
        if (i19 != 0) {
        }
        i20 = i18;
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i21 = i16;
        if (av8Var3.T(i15 & 1, (i15 & 306783379) == 306783378 || (i21 & 4793491) != 4793490)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        xtc xtcVar2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2130746622);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.r(bkh.d(utcVar, 1.0f), null, 3), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            boolean z = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new v61(8, function0);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(oyn.w(q, false, null, null, (Function0) O, 15), 16.0f, 12.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.crowdsourcing_how_can_i_contribute_button, av8Var);
            long D = lz.D(R.color.n_lv_1, av8Var);
            goa goaVar = new goa(1.0f, true);
            yf8 yf8Var = xth.a;
            udj.c(v, goaVar, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            xtcVar2 = utcVar;
            kq9.a(haa.t(R.drawable.ic_chevron_right, 0, av8Var), null, bkh.l(xtcVar2, 24.0f), lz.D(R.color.crowdsourcing, av8Var), av8Var, 440, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zk1(xtcVar2, function0, i2);
        }
    }

    public static nx4 c() {
        return new nx4(1.0f, 1.0f);
    }

    public static final void d(vnb vnbVar, Function1 function1, boolean z, ct8 ct8Var, Function2 function2, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-110805289);
        int i3 = i2 | (av8Var.g(vnbVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(ct8Var) ? a.o : 1024) | (av8Var.i(function2) ? 16384 : 8192) | 196608;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new is5(i4, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, H(-1857175883, av8Var, new d67(function1, ct8Var, function2)), av8Var, (i3 & 14) | 100663296 | (i3 & 896), 248);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x64(vnbVar, function1, z, ct8Var, function2, xtcVar2, i2, 1);
        }
    }

    public static final void e(ov5 ov5Var, of3 of3Var, int i2) {
        av8 av8Var;
        ov5 ov5Var2;
        Object k43Var;
        ov5 ov5Var3;
        ov5Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1271880764);
        int i3 = (av8Var2.i(ov5Var) ? 4 : 2) | i2;
        int i4 = 0;
        int i5 = 15;
        if (av8Var2.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var2.k(nz.b);
            e1d x = rfo.x(ov5Var.f, av8Var2, 0);
            e1d x2 = rfo.x(ov5Var.j, av8Var2, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean i6 = av8Var2.i(ov5Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i6 || O == a99Var) {
                k43Var = new k43(1, ov5Var, ov5.class, "onAction", "onAction(Lcom/sofascore/results/event/boxscoreAnimation/EventBoxScoreAction;)V", 0, 18);
                ov5Var3 = ov5Var;
                av8Var2.n0(k43Var);
            } else {
                k43Var = O;
                ov5Var3 = ov5Var;
            }
            Function1 function1 = (Function1) ((KFunction) k43Var);
            boolean booleanValue = ((Boolean) x2.getValue()).booleanValue();
            boolean i7 = av8Var2.i(context);
            Object O2 = av8Var2.O();
            if (i7 || O2 == a99Var) {
                O2 = new tu5(context, i4);
                av8Var2.n0(O2);
            }
            ct8 ct8Var = (ct8) O2;
            boolean i8 = av8Var2.i(ov5Var3) | av8Var2.i(context);
            Object O3 = av8Var2.O();
            if (i8 || O3 == a99Var) {
                O3 = new ns4(i5, ov5Var3, context);
                av8Var2.n0(O3);
            }
            av8Var = av8Var2;
            ov5Var2 = ov5Var3;
            d(vnbVar, function1, booleanValue, ct8Var, (Function2) O3, null, av8Var, 0);
        } else {
            av8Var = av8Var2;
            ov5Var2 = ov5Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fv2(ov5Var2, i2, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if ((r39 & 4) != 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Function0 function0, xtc xtcVar, long j2, of3 of3Var, int i2, int i3) {
        long j3;
        int i4;
        int i5;
        av8 av8Var;
        eqf u;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1259400139);
        int i6 = i2 | (av8Var2.i(function0) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i6 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            j3 = j2;
            if (av8Var2.f(j3)) {
                i4 = NotificationCompat.FLAG_LOCAL_ONLY;
                i5 = i6 | i4;
                if (av8Var2.T(i5 & 1, (i5 & 147) == 146)) {
                    av8Var = av8Var2;
                    av8Var.W();
                } else {
                    av8Var2.Y();
                    if ((i2 & 1) == 0 || av8Var2.B()) {
                        if ((i3 & 4) != 0) {
                            j3 = lz.D(R.color.surface_1, av8Var2);
                            i5 &= -897;
                        }
                        long j4 = j3;
                        av8Var2.t();
                        kv1 kv1Var = uxf.p;
                        xtc h2 = ljg.h(16.0f, bkh.d(xtcVar, 1.0f), j4, 8.0f);
                        u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                        int hashCode = Long.hashCode(av8Var2.T);
                        aee m = av8Var2.m();
                        xtc C = fqj.C(av8Var2, h2);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a2, hf3.g);
                        waa.K(av8Var2, m, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        waa.K(av8Var2, C, hf3.d);
                        utc utcVar = utc.a;
                        nq8.h(av8Var2, bkh.e(utcVar, 16.0f));
                        kq9.b(s6a.N(R.drawable.check_back_later, 6, av8Var2), null, bkh.l(utcVar, 96.0f), r13.i, av8Var2, V2.b.f, 0);
                        String g2 = bf3.g(16.0f, R.string.fantasy_unknown_error_title, av8Var2, av8Var2, utcVar);
                        yf8 yf8Var = xth.a;
                        udj.c(g2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 130042);
                        udj.c(bf3.g(16.0f, R.string.fantasy_unknown_error_text, av8Var2, av8Var2, utcVar), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 0, 0, 130042);
                        String upperCase = bf3.g(24.0f, R.string.refresh_button, av8Var2, av8Var2, utcVar).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        mha.h(upperCase, function0, bkh.d(utcVar, 1.0f), oqh.a, null, false, false, false, 0L, 0, 0, av8Var2, ((i5 << 3) & 112) | 3456, 0, 2032);
                        av8Var = av8Var2;
                        av8Var.s(true);
                        j3 = j4;
                    } else {
                        av8Var2.W();
                    }
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new mx6(function0, xtcVar, j3, i2, i3, 0);
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i4 = 128;
        i5 = i6 | i4;
        if (av8Var2.T(i5 & 1, (i5 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void g(int i2, int i3, of3 of3Var, xtc xtcVar) {
        av8 av8Var;
        xtc xtcVar2;
        int i4;
        int i5;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(367778172);
        int i6 = (av8Var2.e(i2) ? 4 : 2) | i3 | 48;
        int i7 = 6;
        if (av8Var2.T(i6 & 1, (i6 & 19) != 18)) {
            if (i2 < 0) {
                i4 = 1247509158;
                i5 = R.color.error;
            } else {
                i4 = 1247509672;
                i5 = R.color.success;
            }
            long f2 = ljg.f(av8Var2, i4, i5, av8Var2, false);
            int i8 = i2 < 0 ? R.drawable.ic_position_arrow_down_8 : R.drawable.ic_position_arrow_up_8;
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var2, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            goa g2 = ljg.g(av8Var2, C, hf3.d, 1.0f, false);
            String valueOf = String.valueOf(Math.abs(i2));
            yf8 yf8Var = xth.a;
            fqj.a(valueOf, xth.g(), f2, g2, null, av8Var2, 0, 16);
            kq9.b(s6a.N(i8, 6, av8Var2), null, ljg.i(utcVar, 2.0f, av8Var2, utcVar, 8.0f), f2, av8Var2, 432, 0);
            av8Var = av8Var2;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar2, i3, i7);
        }
    }

    public static final void h(r9 r9Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        r9Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(141171418);
        int i3 = i2 | (av8Var.g(r9Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(n9e.q(wnn.A(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.a(16.0f)), lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String a3 = ((q9k) r9Var.a).a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            kq9.b(s6a.N(R.drawable.ic_warning, 6, av8Var), null, bkh.l(l98.d0(new we9(uxf.p), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 1), 32.0f), lz.D(R.color.error, av8Var), av8Var, 48, 0);
            udj.c(((q9k) r9Var.b).a(av8Var), l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            mha.h(oea.v(R.string.got_it_button, av8Var), function0, new we9(uxf.q), gqh.a, null, false, false, false, 0L, 0, 0, av8Var, (i3 & 112) | 3072, 0, 2032);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(r9Var, function0, xtcVar2, i2, 10);
        }
    }

    public static final void i(int i2, BasicTeam basicTeam, BasicTeam basicTeam2, long j2, xtc xtcVar, of3 of3Var, int i3) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1110397441);
        int i4 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.i(basicTeam) ? 32 : 16) | (av8Var.i(basicTeam2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j2) ? a.o : 1024);
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            kv1 kv1Var = uxf.p;
            xtc q = n9e.q(wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(16.0f)), lz.D(R.color.darken_overlay_1, av8Var), oyn.e);
            boolean i6 = ((i4 & 14) == 4) | av8Var.i(context);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                O = new xi7(context, i2, i5);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String j3 = rik.j(context, j2, bi4.PATTERN_DM, " • ");
            long D = lz.D(R.color.on_color_secondary, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(j3, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            utc utcVar = utc.a;
            xtc f2 = vxd.f(utcVar, 4.0f, av8Var, utcVar, 1.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String shortName = basicTeam.getShortName();
            if (shortName == null) {
                shortName = basicTeam.getName();
            }
            String str = shortName;
            long D2 = lz.D(R.color.on_color_primary, av8Var);
            dfj g2 = xth.g();
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            udj.c(str, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), D2, null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, g2, av8Var, 0, 24960, 109560);
            td4.G(basicTeam.getId(), ljg.i(utcVar, 8.0f, av8Var, utcVar, 24.0f), false, 0L, av8Var, 48, 12);
            udj.c(fc6.f(16.0f, R.string.versus, av8Var, av8Var, utcVar), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            td4.G(basicTeam2.getId(), ljg.i(utcVar, 16.0f, av8Var, utcVar, 24.0f), false, 0L, av8Var, 48, 12);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String shortName2 = basicTeam2.getShortName();
            if (shortName2 == null) {
                shortName2 = basicTeam2.getName();
            }
            String str2 = shortName2;
            long D3 = lz.D(R.color.on_color_primary, av8Var);
            dfj g3 = xth.g();
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            udj.c(str2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), D3, null, 0L, null, 0L, null, new p7j(5), 0L, 2, false, 1, 0, null, g3, av8Var, 0, 24960, 109560);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dv6(i2, basicTeam, basicTeam2, j2, xtcVar, i3);
        }
    }

    public static final void j(int i2, of3 of3Var, xtc xtcVar, String str, boolean z) {
        Pair pair;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-515477716);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtc O = kda.O(l98.c0(n9e.q(l98.b0(xtcVar, 8.0f), lz.D(R.color.darken_overlay_3, av8Var), o7g.a(4.0f)), 8.0f, 4.0f), "highlights_label", av8Var);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z) {
                pair = new Pair(Integer.valueOf(R.drawable.ic_web_stories), Integer.valueOf(R.string.media_match_deck));
            } else {
                pair = new Pair(Integer.valueOf(R.drawable.ic_play_16), Integer.valueOf(wyh.x.contains(str) ? R.string.tennis_media_match_story : R.string.media_match_story));
            }
            int intValue = ((Number) pair.a).intValue();
            int intValue2 = ((Number) pair.b).intValue();
            utc utcVar = utc.a;
            kq9.b(s6a.N(intValue, 6, av8Var), null, bkh.l(utcVar, 14.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            long D = lz.D(R.color.on_color_primary, av8Var);
            xtc O2 = kda.O(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "highlights_label_text", av8Var);
            String v = oea.v(intValue2, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, O2, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(z, (Serializable) str, xtcVar, i2, 16);
        }
    }

    public static final void k(fvc fvcVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        int i5;
        Iterator it;
        lmk lmkVar;
        r13 e2;
        int i6;
        String str;
        Double valueOf = Double.valueOf(10.0d);
        Double valueOf2 = Double.valueOf(8.0d);
        Double valueOf3 = Double.valueOf(7.0d);
        Double valueOf4 = Double.valueOf(6.5d);
        Double valueOf5 = Double.valueOf(6.0d);
        Double valueOf6 = Double.valueOf(3.5d);
        av8 av8Var = (av8) of3Var;
        av8Var.f0(442258056);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(fvcVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                b7 K = l6g.K(valueOf6, valueOf5, valueOf4, valueOf3, valueOf2, Double.valueOf(9.0d), valueOf);
                av8Var.n0(K);
                a99Var = a99Var;
                O = K;
            }
            b7 b7Var = (b7) O;
            Object O2 = av8Var.O();
            int i7 = 10;
            if (O2 == a99Var) {
                IntRange intRange = new IntRange(1, 11, 1);
                ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
                v6a it2 = intRange.iterator();
                while (it2.c) {
                    int nextInt = it2.nextInt();
                    if (nextInt % 2 != 0) {
                        i6 = i7;
                        str = Month.of(nextInt).getDisplayName(TextStyle.SHORT, Locale.getDefault());
                        str.getClass();
                        if (str.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            char charAt = str.charAt(0);
                            sb.append((Object) (Character.isLowerCase(charAt) ? tz9.Q(charAt) : String.valueOf(charAt)));
                            sb.append(str.substring(1));
                            str = sb.toString();
                        }
                    } else {
                        i6 = i7;
                        str = "";
                    }
                    arrayList.add(str);
                    i7 = i6;
                }
                i5 = i7;
                O2 = l6g.W(arrayList);
                av8Var.n0(O2);
            } else {
                i5 = 10;
            }
            gv9 gv9Var = (gv9) O2;
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            sf8 sf8Var = (sf8) av8Var.k(dh3.k);
            b7 K2 = l6g.K(new Pair(valueOf, new r13(lz.D(R.color.rating_90, av8Var))), new Pair(valueOf2, new r13(lz.D(R.color.rating_80, av8Var))), new Pair(valueOf3, new r13(lz.D(R.color.rating_70, av8Var))), new Pair(valueOf4, new r13(lz.D(R.color.rating_65, av8Var))), new Pair(valueOf5, new r13(lz.D(R.color.rating_60, av8Var))), new Pair(valueOf6, new r13(lz.D(R.color.rating_10, av8Var))));
            yf8 yf8Var = xth.a;
            dfj c2 = xth.c();
            boolean g2 = av8Var.g(sf8Var) | av8Var.g(c2);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                pwh pwhVar = c2.a;
                tf8 tf8Var = pwhVar.f;
                wg8 wg8Var = pwhVar.c;
                if (wg8Var == null) {
                    wg8Var = wg8.g;
                }
                Object value = sf8.a(sf8Var, tf8Var, wg8Var, 0, 12).getValue();
                value.getClass();
                O3 = (Typeface) value;
                av8Var.n0(O3);
            }
            Typeface typeface = (Typeface) O3;
            long D = lz.D(R.color.on_color_secondary, av8Var);
            a99 a99Var2 = a99Var;
            boolean g3 = av8Var.g(typeface) | av8Var.f(c2.a.b);
            Object O4 = av8Var.O();
            Object obj = O4;
            if (g3 || O4 == a99Var2) {
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(hkg.s0(D));
                textPaint.setTextSize(kx4Var.h0(c2.a.b));
                textPaint.setTextAlign(Paint.Align.CENTER);
                textPaint.setTypeface(typeface);
                textPaint.setAntiAlias(true);
                av8Var.n0(textPaint);
                obj = textPaint;
            }
            TextPaint textPaint2 = (TextPaint) obj;
            Object O5 = av8Var.O();
            if (O5 == a99Var2) {
                O5 = new dfj(0L, v8a.v(i5), wg8.j, xth.b, 0L, 0, 0, 0L, 16777177);
                av8Var.n0(O5);
            }
            dfj dfjVar = (dfj) O5;
            boolean g4 = av8Var.g(sf8Var);
            Object O6 = av8Var.O();
            if (g4 || O6 == a99Var2) {
                pwh pwhVar2 = dfjVar.a;
                tf8 tf8Var2 = pwhVar2.f;
                wg8 wg8Var2 = pwhVar2.c;
                if (wg8Var2 == null) {
                    wg8Var2 = wg8.j;
                }
                Object value2 = sf8.a(sf8Var, tf8Var2, wg8Var2, 0, 12).getValue();
                value2.getClass();
                O6 = (Typeface) value2;
                av8Var.n0(O6);
            }
            Typeface typeface2 = (Typeface) O6;
            int s0 = hkg.s0(lz.D(R.color.rating_00, av8Var));
            Object O7 = av8Var.O();
            Object obj2 = O7;
            if (O7 == a99Var2) {
                TextPaint textPaint3 = new TextPaint();
                textPaint3.setColor(s0);
                textPaint3.setTextSize(kx4Var.h0(dfjVar.a.b));
                textPaint3.setTextAlign(Paint.Align.CENTER);
                textPaint3.setTypeface(typeface2);
                textPaint3.setAntiAlias(true);
                av8Var.n0(textPaint3);
                obj2 = textPaint3;
            }
            TextPaint textPaint4 = (TextPaint) obj2;
            boolean z = av8Var.k(dh3.n) == ema.b;
            dfj n = xth.n();
            boolean g5 = av8Var.g(sf8Var) | av8Var.g(n);
            Object O8 = av8Var.O();
            if (g5 || O8 == a99Var2) {
                pwh pwhVar3 = n.a;
                tf8 tf8Var3 = pwhVar3.f;
                wg8 wg8Var3 = pwhVar3.c;
                if (wg8Var3 == null) {
                    wg8Var3 = wg8.g;
                }
                Object value3 = sf8.a(sf8Var, tf8Var3, wg8Var3, 0, 12).getValue();
                value3.getClass();
                O8 = (Typeface) value3;
                av8Var.n0(O8);
            }
            Typeface typeface3 = (Typeface) O8;
            boolean g6 = av8Var.g(typeface3) | av8Var.f(n.a.b);
            Object O9 = av8Var.O();
            Object obj3 = O9;
            if (g6 || O9 == a99Var2) {
                TextPaint textPaint5 = new TextPaint();
                textPaint5.setTextSize(kx4Var.h0(n.a.b));
                textPaint5.setTextAlign(z ? Paint.Align.RIGHT : Paint.Align.LEFT);
                textPaint5.setTypeface(typeface3);
                textPaint5.setAntiAlias(true);
                av8Var.n0(textPaint5);
                obj3 = textPaint5;
            }
            TextPaint textPaint6 = (TextPaint) obj3;
            long D2 = lz.D(R.color.rating_00, av8Var);
            yp2 yp2Var = fvcVar.a;
            lmk J = o6a.J(s6a.N(R.drawable.ic_transfer_in, 6, av8Var), av8Var);
            long D3 = lz.D(R.color.on_color_primary, av8Var);
            av8Var.d0(-191656780);
            gv9 gv9Var2 = yp2Var.a;
            ArrayList arrayList2 = new ArrayList(k13.r(gv9Var2, i5));
            Iterator it3 = gv9Var2.iterator();
            while (it3.hasNext()) {
                yz0 yz0Var = (yz0) it3.next();
                if (yz0Var == null) {
                    av8Var.d0(685704844);
                    av8Var.s(false);
                    e2 = null;
                    it = it3;
                    lmkVar = J;
                } else {
                    it = it3;
                    av8Var.d0(685704845);
                    lmkVar = J;
                    e2 = vxd.e(av8Var, false, lz.D(yz0Var.b, av8Var));
                }
                arrayList2.add(e2);
                it3 = it;
                J = lmkVar;
            }
            lmk lmkVar2 = J;
            av8Var.s(false);
            xtc f0 = l98.f0(l98.d0(n9e.q(xtcVar, lz.D(R.color.darken_overlay_1, av8Var), o7g.a(8.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
            k1c c3 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            g28 g28Var = bkh.c;
            boolean h2 = av8Var.h(z) | av8Var.g(K2) | av8Var.i(textPaint6) | av8Var.i(textPaint2) | av8Var.g(yp2Var) | av8Var.i(arrayList2) | av8Var.i(textPaint4) | av8Var.f(D2) | av8Var.f(D3) | av8Var.i(lmkVar2);
            Object O10 = av8Var.O();
            if (h2 || O10 == a99Var2) {
                O10 = new gvc(z, K2, yp2Var, D3, textPaint6, gv9Var, textPaint2, arrayList2, textPaint4, D2, b7Var, lmkVar2);
                av8Var.n0(O10);
            }
            i4 = 6;
            lz.d(6, av8Var, g28Var, (Function1) O10);
            av8Var.s(true);
        } else {
            i4 = 6;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(fvcVar, xtcVar, i2, i4);
        }
    }

    public static final void l(e9i e9iVar, fvc fvcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1680558653);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(fvcVar) ? 32 : 16;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            x23 x23Var = x23.a;
            utc utcVar = utc.a;
            nq8.h(av8Var, x23Var.a(1.0f, utcVar, true));
            String a3 = fvcVar.b.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.i(), av8Var, 0, 24960, 109562);
            nq8.h(av8Var, x23Var.a(0.5f, utcVar, true));
            float a4 = e9iVar.a(1000, 1000);
            float f2 = (a4 * 0.1f) + 0.9f;
            xtc a5 = x23Var.a(2.0f, bkh.d(bkh.b(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 300.0f, 1), 1.0f), true);
            boolean d2 = av8Var.d(a4) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d2 || O == a99Var) {
                O = new n28(2, a4, f2);
                av8Var.n0(O);
            }
            int i5 = 3;
            k(fvcVar, s02.M(a5, (Function1) O), av8Var, (i4 >> 3) & 14);
            nq8.h(av8Var, x23Var.a(0.5f, utcVar, true));
            float a6 = e9iVar.a(3500, 500);
            float f3 = (0.1f * a6) + 0.9f;
            String a7 = fvcVar.c.a(av8Var);
            dfj f4 = xth.f();
            long D = lz.D(R.color.on_color_primary, av8Var);
            boolean d3 = av8Var.d(a6) | av8Var.d(f3);
            Object O2 = av8Var.O();
            if (d3 || O2 == a99Var) {
                O2 = new n28(i5, a6, f3);
                av8Var.n0(O2);
            }
            udj.c(a7, s02.M(utcVar, (Function1) O2), D, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, f4, av8Var, 0, 24960, 109560);
            av8Var = av8Var;
            nq8.h(av8Var, x23Var.a(1.0f, utcVar, true));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(e9iVar, fvcVar, i2, 4);
        }
    }

    public static final void m(v23 v23Var, fvc fvcVar, of3 of3Var, int i2) {
        int i3;
        fvc fvcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2130382292);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(fvcVar) ? 32 : 16;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(1.0f, utcVar, true));
            String a2 = fvcVar.f.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(0.5f, utcVar, true));
            fvcVar2 = fvcVar;
            k(fvcVar2, v23Var.a(2.0f, bkh.d(bkh.b(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 300.0f, 1), 1.0f), true), av8Var, (i4 >> 3) & 14);
            nq8.h(av8Var, v23Var.a(0.5f, utcVar, true));
        } else {
            fvcVar2 = fvcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(v23Var, fvcVar2, i2, 5);
        }
    }

    public static final gtj n() {
        return new gtj(new Paint(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final String str, final boolean z, final boolean z2, final boolean z3, xtc xtcVar, final long j2, of3 of3Var, final int i2) {
        int i3;
        final xtc xtcVar2;
        int i4;
        int i5;
        long j3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(878894637);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.h(z3) ? a.o : 1024;
        }
        int i6 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i6 |= av8Var.f(j2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var.T(i6 & 1, (74899 & i6) != 74898)) {
            av8Var.Y();
            int i7 = i2 & 1;
            utc utcVar = utc.a;
            if (i7 == 0 || av8Var.B()) {
                xtcVar2 = utcVar;
            } else {
                av8Var.W();
                xtcVar2 = xtcVar;
            }
            av8Var.t();
            yf8 yf8Var = xth.a;
            dfj d2 = z ? xth.d() : xth.b();
            int i8 = i6;
            i4k h0 = s02.h0(200, 0, null, 6);
            dfj dfjVar = d2;
            cdi b2 = a60.b(lfj.c(d2.a.b), h0, null, av8Var, 48, 28);
            cdi b3 = a60.b(lfj.c(dfjVar.b.c), h0, null, av8Var, 48, 28);
            wg8 wg8Var = dfjVar.a.c;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            cdi b4 = a60.b(wg8Var != null ? wg8Var.a : 0.0f, h0, null, av8Var, 48, 28);
            if (!z) {
                f2 = 4.0f;
            }
            cdi a2 = a60.a(f2, s02.h0(200, 0, null, 6), null, null, av8Var, 48, 12);
            i4k h02 = s02.h0(200, 0, null, 6);
            if (z2) {
                i4 = -1490782409;
                i5 = R.color.error;
            } else if (z3) {
                av8Var.d0(-1490780967);
                av8Var.s(false);
                j3 = j2;
                cdi a3 = wih.a(j3, h02, null, av8Var, 48, 12);
                xtc d3 = bkh.d(xtcVar2, 1.0f);
                u23 a4 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, d3);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.q0();
                } else {
                    av8Var.l(zg3Var);
                }
                waa.K(av8Var, a4, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                udj.c(str, null, ((r13) a3.getValue()).a, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, new dfj(0L, v8a.E(4294967296L, ((Number) b2.getValue()).floatValue()), new wg8(wzb.b(((Number) b4.getValue()).floatValue())), xth.a, 0L, 0, 0, v8a.E(4294967296L, ((Number) b3.getValue()).floatValue()), 16646105), av8Var, i8 & 14, 24960, 110586);
                av8Var = av8Var;
                w1l.s(utcVar, ((p75) a2.getValue()).a, av8Var, true);
            } else {
                i4 = -1490779914;
                i5 = R.color.n_lv_3;
            }
            j3 = ljg.f(av8Var, i4, i5, av8Var, false);
            cdi a32 = wih.a(j3, h02, null, av8Var, 48, 12);
            xtc d32 = bkh.d(xtcVar2, 1.0f);
            u23 a42 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d32);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a42, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C2, hf3.d);
            udj.c(str, null, ((r13) a32.getValue()).a, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, new dfj(0L, v8a.E(4294967296L, ((Number) b2.getValue()).floatValue()), new wg8(wzb.b(((Number) b4.getValue()).floatValue())), xth.a, 0L, 0, 0, v8a.E(4294967296L, ((Number) b3.getValue()).floatValue()), 16646105), av8Var, i8 & 14, 24960, 110586);
            av8Var = av8Var;
            w1l.s(utcVar, ((p75) a2.getValue()).a, av8Var, true);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: x61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yqo.o(str, z, z2, z3, xtcVar2, j2, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void p(e9i e9iVar, nqj nqjVar, of3 of3Var, int i2) {
        int i3;
        zg3 zg3Var;
        nqj nqjVar2 = nqjVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(814200397);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(nqjVar2) ? 32 : 16;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            p4h p4hVar = ww9.d;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            d7e t = haa.t(R.drawable.ic_torneo_medal, 0, av8Var);
            utc utcVar = utc.a;
            wkn.k(t, null, bkh.d(utcVar, 0.65f), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            x23 x23Var = x23.a;
            nq8.h(av8Var, x23Var.a(48.0f, utcVar, true));
            String a3 = nqjVar2.a.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, x23Var.a(24.0f, utcVar, true));
            float a4 = e9iVar.a(InterfaceC4060ee.c.d, 1000);
            float f2 = (a4 * 0.1f) + 0.9f;
            boolean d2 = av8Var.d(a4) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d2 || O == a99Var) {
                O = new roj(i4, a4, f2);
                av8Var.n0(O);
            }
            xtc M = s02.M(utcVar, (Function1) O);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, M);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            zg3 zg3Var3 = zg3Var;
            udj.c(oea.v(R.string.season_25_bonus_torneo_match, av8Var), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            q(nqjVar.c, av8Var, 0);
            av8Var.s(true);
            av8Var.s(true);
            nq8.h(av8Var, x23Var.a(36.0f, utcVar, true));
            float a6 = e9iVar.a(2850, 1000);
            float f3 = (0.1f * a6) + 0.9f;
            boolean d3 = av8Var.d(a6) | av8Var.d(f3);
            Object O2 = av8Var.O();
            if (d3 || O2 == a99Var) {
                O2 = new roj(2, a6, f3);
                av8Var.n0(O2);
            }
            xtc M2 = s02.M(utcVar, (Function1) O2);
            u23 a7 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, M2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a7, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            String upperCase = oea.v(R.string.season_25_bonus_torneo_views, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            nqjVar2 = nqjVar;
            udj.c(upperCase, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            List list = dla.a;
            udj.c(dla.i(Integer.valueOf(nqjVar2.d)), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            nq8.h(av8Var, x23Var.a(100.0f, utcVar, true));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(e9iVar, nqjVar2, i2, 17);
        }
    }

    public static final void q(Event event, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1352633456);
        int i3 = (av8Var.i(event) ? 4 : 2) | i2;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) av8Var.k(nz.b);
            boolean z = av8Var.k(dh3.n) == ema.b;
            xtc c0 = l98.c0(n9e.q(bkh.d(utc.a, 1.0f), lz.D(R.color.darken_overlay_1, av8Var), o7g.a(8.0f)), 8.0f, 4.0f);
            av8Var.d0(-1003410150);
            av8Var.d0(212064437);
            av8Var.s(false);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new t1c(kx4Var);
                av8Var.n0(O);
            }
            t1c t1cVar = (t1c) O;
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = new am3();
                av8Var.n0(O2);
            }
            am3 am3Var = (am3) O2;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = e.f(Boolean.FALSE);
                av8Var.n0(O3);
            }
            e1d e1dVar = (e1d) O3;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = new pm3(am3Var);
                av8Var.n0(O4);
            }
            pm3 pm3Var = (pm3) O4;
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = e.e(Unit.a, f7a.k);
                av8Var.n0(O5);
            }
            e1d e1dVar2 = (e1d) O5;
            boolean i5 = av8Var.i(t1cVar) | av8Var.e(257);
            Object O6 = av8Var.O();
            if (i5 || O6 == obj) {
                Object kd3Var = new kd3(e1dVar2, t1cVar, pm3Var, e1dVar, 13);
                av8Var.n0(kd3Var);
                O6 = kd3Var;
            }
            k1c k1cVar = (k1c) O6;
            Object O7 = av8Var.O();
            int i6 = 13;
            if (O7 == obj) {
                O7 = new ld3(e1dVar, pm3Var, i6);
                av8Var.n0(O7);
            }
            Function0 function0 = (Function0) O7;
            boolean i7 = av8Var.i(t1cVar);
            Object O8 = av8Var.O();
            if (i7 || O8 == obj) {
                O8 = new md3(t1cVar, i6);
                av8Var.n0(O8);
            }
            s6a.h(o3h.a(c0, false, (Function1) O8), H(1200550679, av8Var, new mqj(e1dVar2, am3Var, function0, event, z, context)), k1cVar, av8Var, 48);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(event, i2, i4);
        }
    }

    public static final void r(v23 v23Var, nqj nqjVar, of3 of3Var, int i2) {
        int i3;
        nqj nqjVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1017933376);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(nqjVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            d7e t = haa.t(R.drawable.ic_torneo_medal, 0, av8Var);
            utc utcVar = utc.a;
            wkn.k(t, null, bkh.d(utcVar, 0.65f), null, mp3.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 25016, 104);
            nq8.h(av8Var, v23Var.a(24.0f, utcVar, true));
            String a2 = nqjVar.g.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(56.0f, utcVar, true));
            udj.c(nqjVar.h.a(av8Var), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.f(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(16.0f, utcVar, true));
            q(nqjVar.c, av8Var, 0);
            nq8.h(av8Var, v23Var.a(24.0f, utcVar, true));
            String upperCase = oea.v(R.string.season_25_bonus_torneo_views, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            nqjVar2 = nqjVar;
            udj.c(upperCase, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            udj.c(String.valueOf(nqjVar2.d), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(73.0f, utcVar, true));
        } else {
            nqjVar2 = nqjVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(v23Var, nqjVar2, i2, 16);
        }
    }

    public static final boolean s(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final int t(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final xtc u(xtc xtcVar, float f2, float f3, jf9 jf9Var) {
        boolean z;
        int i2;
        if (jf9Var != null) {
            i2 = 0;
            z = true;
        } else {
            z = false;
            i2 = 3;
        }
        return ((p75.a(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= 0 || p75.a(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= 0) && !z) ? xtcVar : s02.M(xtcVar, new sy1(f2, f3, i2, jf9Var, z));
    }

    public static void v(Object obj, Object obj2) {
        if (obj == null) {
            yhk.s(mz1.m(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            yhk.s(lnb.m(obj, "null value in entry: ", "=null"));
        }
    }

    public static void w(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        a70.p(mz1.j(i2, str, " cannot be negative but was: "));
    }

    public static final void x(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder o = ljg.o("size=", j2, " offset=");
            o.append(j3);
            hc5.h(x5n.m(j4, " byteCount=", o));
        }
    }

    public static final tc3 y(int i2, of3 of3Var, dt8 dt8Var) {
        tc3 tc3Var;
        av8 av8Var = (av8) of3Var;
        av8Var.a0(Integer.rotateLeft(i2, 1), a);
        Object O = av8Var.O();
        if (O == nf3.a) {
            tc3Var = new tc3(i2, dt8Var, true);
            av8Var.n0(tc3Var);
        } else {
            O.getClass();
            tc3Var = (tc3) O;
            tc3Var.k(dt8Var);
        }
        av8Var.s(false);
        return tc3Var;
    }

    public static final void z(Canvas canvas, String str, float f2, float f3, Paint paint, boolean z) {
        if (!z) {
            canvas.drawText(str, f2, f3, paint);
            return;
        }
        int save = canvas.save();
        try {
            canvas.scale(-1.0f, 1.0f, f2, f3);
            canvas.drawText(str, f2, f3, paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
