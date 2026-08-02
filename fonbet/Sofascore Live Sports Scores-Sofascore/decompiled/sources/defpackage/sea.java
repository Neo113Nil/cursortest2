package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.zzdc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class sea {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final int h = 9;
    public static final int i = 6;
    public static final int j = 10;
    public static final int k = 5;
    public static final int l = 15;
    public static int m = 50;
    public static int n = 10;
    public static int o = 10;
    public static int p = 10;
    public static lwm q = null;
    public static boolean r = false;
    public static int s = 1;
    public static int t = 8192;

    public static final ltk A(KClass kClass, ttk ttkVar, qtk qtkVar, ly3 ly3Var, of3 of3Var) {
        if (qtkVar == null) {
            qtkVar = ufa.s(ttkVar);
        }
        qtkVar.getClass();
        ly3Var.getClass();
        stk viewModelStore = ttkVar.getViewModelStore();
        viewModelStore.getClass();
        g7h g7hVar = new g7h(viewModelStore, qtkVar, ly3Var);
        kClass.getClass();
        String t2 = kik.t(kClass);
        if (t2 != null) {
            return g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t2), kClass);
        }
        a70.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static void B(zzjs zzjsVar, BillingResult billingResult, lyn lynVar, int i2, int i3) {
        int i4 = zzdc.zza;
        ((c0l) lynVar).s(zzdc.zzb(zzjsVar, i2, billingResult, null, zzjz.BROADCAST_ACTION_UNSPECIFIED), i3);
    }

    public static boolean C(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = s4p.a;
            }
        } else {
            if (!(collection instanceof g4p)) {
                return false;
            }
            obj = ((g4p) collection).d;
        }
        return comparator.equals(obj);
    }

    public static void D(zzjs zzjsVar, BillingResult billingResult, lyn lynVar, int i2, int i3, String str) {
        int i4 = zzdc.zza;
        ((c0l) lynVar).s(zzdc.zzb(zzjsVar, i2, billingResult, str, zzjz.BROADCAST_ACTION_UNSPECIFIED), i3);
    }

    public static final void a(Function0 function0, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1965449992);
        int i3 = (av8Var.i(function0) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new ve7(14, function0);
                av8Var.n0(O);
            }
            oyn.b((Function0) O, new z15(true, true), yqo.H(-251563361, av8Var, new f91(7, function0)), av8Var, 432);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f91(i2, 8, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, String str2, fo foVar, of3 of3Var, int i2, int i3) {
        int i4;
        fo foVar2;
        av8 av8Var;
        fo foVar3;
        eqf u;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(999087451);
        int i5 = i2 & 6;
        p8g p8gVar = p8g.a;
        if (i5 == 0) {
            i4 = (av8Var2.g(p8gVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            foVar2 = foVar;
            i4 |= av8Var2.g(foVar2) ? a.o : 1024;
            if (av8Var2.T(i4 & 1, (i4 & 1171) == 1170)) {
                av8Var = av8Var2;
                av8Var.W();
                foVar3 = foVar2;
            } else {
                fo foVar4 = i6 != 0 ? uxf.o : foVar2;
                xtc a2 = p8gVar.a(1.0f, utc.a, true);
                u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), foVar4, av8Var2, (((((i4 >> 3) & 896) | 48) >> 3) & 112) | 6);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                xtc C = fqj.C(av8Var2, a2);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a3, hf3.g);
                waa.K(av8Var2, m2, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                yf8 yf8Var = xth.a;
                udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, (i4 >> 6) & 14, 0, 131066);
                av8Var = av8Var2;
                av8Var.s(true);
                foVar3 = foVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r22(i2, i3, 13, str, str2, foVar3);
                return;
            }
            return;
        }
        foVar2 = foVar;
        if (av8Var2.T(i4 & 1, (i4 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(final u8b u8bVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        tc3 tc3Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-819049499);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(u8bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i7 = u8bVar.g;
            x43 x43Var = u8bVar.m;
            String str = u8bVar.h;
            String str2 = u8bVar.i;
            boolean z = u8bVar.e;
            tc3 H = yqo.H(675899135, av8Var2, new ct8() { // from class: s8b
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i5;
                    u8b u8bVar2 = u8bVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = u8bVar2.k;
                                bx7 bx7Var = u8bVar2.l;
                                l98.r(str3, bx7Var.c, bx7Var.b, bx7Var.d, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                String str4 = u8bVar2.k;
                                bx7 bx7Var2 = u8bVar2.l;
                                fy7 fy7Var = u8bVar2.p;
                                fy7 fy7Var2 = u8bVar2.q;
                                String str5 = bx7Var2.j;
                                String str6 = str5 == null ? "" : str5;
                                Long l2 = bx7Var2.l;
                                long longValue = l2 != null ? l2.longValue() : 0L;
                                String str7 = bx7Var2.k;
                                gz8.d(str4, str6, longValue, str7 == null ? "" : str7, fy7Var, fy7Var2, u8bVar2.r, av8Var4, 0);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H2 = yqo.H(-971980795, av8Var2, new ct8() { // from class: s8b
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i6;
                    u8b u8bVar2 = u8bVar;
                    switch (i8) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                String str3 = u8bVar2.k;
                                bx7 bx7Var = u8bVar2.l;
                                l98.r(str3, bx7Var.c, bx7Var.b, bx7Var.d, av8Var3, 0);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                String str4 = u8bVar2.k;
                                bx7 bx7Var2 = u8bVar2.l;
                                fy7 fy7Var = u8bVar2.p;
                                fy7 fy7Var2 = u8bVar2.q;
                                String str5 = bx7Var2.j;
                                String str6 = str5 == null ? "" : str5;
                                Long l2 = bx7Var2.l;
                                long longValue = l2 != null ? l2.longValue() : 0L;
                                String str7 = bx7Var2.k;
                                gz8.d(str4, str6, longValue, str7 == null ? "" : str7, fy7Var, fy7Var2, u8bVar2.r, av8Var4, 0);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H3 = yqo.H(-401708989, av8Var2, new yya(i4, (Object) u8bVar, function1));
            int i8 = i3 & 112;
            int i9 = i3 & 14;
            boolean z2 = (i8 == 32) | (i9 == 4);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                tc3Var = H;
                O = new t8b(function1, u8bVar, 0);
                av8Var2.n0(O);
            } else {
                tc3Var = H;
            }
            Function0 function0 = (Function0) O;
            boolean z3 = (i8 == 32) | (i9 == 4);
            Object O2 = av8Var2.O();
            if (z3 || O2 == a99Var) {
                O2 = new t8b(function1, u8bVar, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar, tc3Var, H2, null, H3, null, str, str2, true, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i3 & 896) | 1600512, ((i3 << 15) & 3670016) | 3078, 53408);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(u8bVar, function1, xtcVar, i2, 16);
        }
    }

    public static final void d(InvitedUser invitedUser, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, of3 of3Var, int i2) {
        boolean z4;
        Function0 function03;
        InvitedUser invitedUser2;
        Function0 function04;
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1604318909);
        int i3 = (av8Var.i(invitedUser) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z3) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192) | (av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (!av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            z4 = z;
            function03 = function02;
            invitedUser2 = invitedUser;
            function04 = function0;
            av8Var.W();
        } else if (z3 || z) {
            av8Var.d0(142797819);
            int i4 = i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            int i5 = i3 >> 6;
            z4 = z;
            mha.f(invitedUser, z4, function0, function02, av8Var, i4 | (i5 & 896) | (i5 & 7168));
            invitedUser2 = invitedUser;
            function04 = function0;
            function03 = function02;
            av8Var.s(false);
        } else {
            if (z2) {
                av8Var.d0(142807156);
                e(function02, av8Var, (i3 >> 15) & 14);
                av8Var.s(false);
            } else {
                av8Var.d0(132138335);
                av8Var.s(false);
            }
            z4 = z;
            function03 = function02;
            invitedUser2 = invitedUser;
            function04 = function0;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new z8b(invitedUser2, z4, z2, z3, function04, function03, i2);
        }
    }

    public static final void e(Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-461185830);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            un0.a(bkh.d(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-401208244, av8Var, new r64(6, function0)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nj6(i2, i4, function0);
        }
    }

    public static final void f(mxi mxiVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        kv1 kv1Var;
        Function0 function0;
        f50 f50Var;
        ry ryVar;
        ff3 ff3Var;
        f50 f50Var2;
        f50 f50Var3;
        boolean z;
        lxi lxiVar;
        kv1 kv1Var2;
        boolean z2;
        boolean z3;
        kv1 kv1Var3 = uxf.p;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1706386302);
        int i4 = i2 | (av8Var.g(mxiVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtc d0 = l98.d0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            jxi jxiVar = mxiVar.c;
            a99 a99Var = nf3.a;
            if (jxiVar == null) {
                av8Var.d0(-42079176);
                av8Var.s(false);
                i3 = i4;
                f50Var3 = f50Var6;
                kv1Var = kv1Var3;
                ff3Var = ff3Var2;
                f50Var = f50Var4;
                f50Var2 = f50Var5;
                z = false;
                ryVar = ryVar2;
            } else {
                av8Var.d0(-42079175);
                String v = oea.v(R.string.coach, av8Var);
                String str = jxiVar.b;
                Integer num = jxiVar.a;
                if (num == null) {
                    av8Var.d0(1762634941);
                    av8Var.s(false);
                    i3 = i4;
                    kv1Var = kv1Var3;
                    function0 = null;
                } else {
                    i3 = i4;
                    av8Var.d0(1762634942);
                    int intValue = num.intValue();
                    kv1Var = kv1Var3;
                    boolean e2 = ((i3 & 112) == 32) | av8Var.e(intValue);
                    Object O = av8Var.O();
                    if (e2 || O == a99Var) {
                        O = new kj4(intValue, 3, function1);
                        av8Var.n0(O);
                    }
                    function0 = (Function0) O;
                    av8Var.s(false);
                }
                f50Var = f50Var4;
                Function0 function02 = function0;
                ryVar = ryVar2;
                ff3Var = ff3Var2;
                f50Var2 = f50Var5;
                f50Var3 = f50Var6;
                g(v, str, function02, yqo.H(1076789318, av8Var, new q8i(jxiVar, 7)), av8Var, 3072, 0);
                z = false;
                av8Var.s(false);
            }
            ixi ixiVar = mxiVar.e;
            if (ixiVar == null) {
                av8Var.d0(-41687460);
                av8Var.s(z);
            } else {
                av8Var.d0(-41687459);
                g(oea.v(R.string.country, av8Var), ixiVar.a, null, yqo.H(732814915, av8Var, new q8i(ixiVar, 8)), av8Var, 3072, 4);
                z = false;
                av8Var.s(false);
            }
            Long l2 = mxiVar.d;
            if (l2 == null) {
                av8Var.d0(-41329720);
                av8Var.s(z);
            } else {
                av8Var.d0(-41329719);
                long longValue = l2.longValue();
                String v2 = oea.v(mxiVar.b ? R.string.established_date : R.string.foundation_date, av8Var);
                bi4 bi4Var = bi4.PATTERN_DMMY;
                Locale d2 = dla.d();
                ZoneId of = ZoneId.of("GMT");
                of.getClass();
                g(v2, fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var.d(), d2).withZone(of).withDecimalStyle(DecimalStyle.of(d2))), null, tgj.b, av8Var, 3072, 4);
                Unit unit = Unit.a;
                z = false;
                av8Var.s(false);
            }
            kxi kxiVar = mxiVar.g;
            if (kxiVar == null) {
                av8Var.d0(-40512746);
                av8Var.s(z);
            } else {
                av8Var.d0(-40512745);
                int ordinal = kxiVar.c.ordinal();
                String v3 = oea.v(ordinal != 2 ? ordinal != 4 ? R.string.ranking : R.string.fifa_ranking : R.string.uefa_ranking, av8Var);
                String p2 = yid.p(kxiVar.a);
                String format = new DecimalFormat("#.###", DecimalFormatSymbols.getInstance(dla.d())).format(kxiVar.b);
                format.getClass();
                String w = oea.w(R.string.ranking_number_and_points_short, new Object[]{p2, format}, av8Var);
                boolean g2 = ((i3 & 112) == 32) | av8Var.g(kxiVar);
                Object O2 = av8Var.O();
                if (g2 || O2 == a99Var) {
                    O2 = new deh(17, function1, kxiVar);
                    av8Var.n0(O2);
                }
                g(v3, w, (Function0) O2, tgj.c, av8Var, 3072, 0);
                z = false;
                av8Var.s(false);
            }
            Integer num2 = mxiVar.f;
            if (num2 == null) {
                av8Var.d0(-39862273);
                av8Var.s(z);
            } else {
                av8Var.d0(-39862272);
                g(oea.v(R.string.am_football_super_bowl_wins, av8Var), String.valueOf(num2.intValue()), null, tgj.d, av8Var, 3072, 4);
                Unit unit2 = Unit.a;
                z = false;
                av8Var.s(false);
            }
            lxi lxiVar2 = mxiVar.h;
            if (lxiVar2 == null) {
                av8Var.d0(-39343457);
                av8Var.s(z);
                z3 = true;
            } else {
                String str2 = lxiVar2.c;
                Integer num3 = lxiVar2.d;
                av8Var.d0(-39343456);
                String v4 = oea.v(R.string.venue, av8Var);
                String str3 = lxiVar2.b;
                boolean g3 = ((i3 & 112) == 32) | av8Var.g(lxiVar2);
                Object O3 = av8Var.O();
                if (g3 || O3 == a99Var) {
                    O3 = new deh(18, function1, lxiVar2);
                    av8Var.n0(O3);
                }
                g(v4, str3, lxiVar2.e ? (Function0) O3 : null, tgj.e, av8Var, 3072, 0);
                if (num3 == null && str2 == null) {
                    av8Var.d0(-798967517);
                    av8Var.s(false);
                    z2 = false;
                    z3 = true;
                } else {
                    av8Var.d0(-800057291);
                    xtc c0 = l98.c0(fz8.Y(bkh.d(utc.a, 1.0f), n9a.a), 16.0f, 8.0f);
                    l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, c0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    if (num3 != null) {
                        av8Var.d0(-611884064);
                        lxiVar = lxiVar2;
                        kv1Var2 = kv1Var;
                        b(oea.v(R.string.capacity, av8Var), String.valueOf(num3.intValue()), kv1Var2, av8Var, 3078, 0);
                        if (str2 != null) {
                            av8Var.d0(-611572421);
                            z2 = false;
                            tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var, null);
                            av8Var = av8Var;
                            av8Var.s(false);
                        } else {
                            z2 = false;
                            av8Var.d0(-611502268);
                            av8Var.s(false);
                        }
                        av8Var.s(z2);
                    } else {
                        lxiVar = lxiVar2;
                        kv1Var2 = kv1Var;
                        z2 = false;
                        av8Var.d0(-611480444);
                        av8Var.s(false);
                    }
                    if (str2 != null) {
                        av8Var.d0(-611431960);
                        b(oea.v(R.string.city, av8Var), lxiVar.c, kv1Var2, av8Var, 3078, 0);
                        av8Var.s(z2);
                    } else {
                        av8Var.d0(-611159036);
                        av8Var.s(z2);
                    }
                    z3 = true;
                    av8Var.s(true);
                    av8Var.s(z2);
                }
                av8Var.s(z2);
            }
            av8Var.s(z3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(mxiVar, function1, xtcVar, i2, 7);
        }
    }

    public static final void g(String str, String str2, Function0 function0, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        Function0 function02;
        int i4;
        Function2 function2;
        av8 av8Var;
        Function0 function03;
        utc utcVar;
        av8 av8Var2;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-157494498);
        int i5 = i2 | (av8Var3.g(str) ? 4 : 2) | (av8Var3.g(str2) ? 32 : 16);
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            function02 = function0;
        } else {
            function02 = function0;
            i4 = i5 | (av8Var3.i(function02) ? 256 : 128);
        }
        int i7 = i4;
        if (av8Var3.T(i7 & 1, (i7 & 1171) != 1170)) {
            Function0 function04 = i6 != 0 ? null : function02;
            av8Var3.d0(-1028350932);
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            if (function04 != null) {
                boolean z = (i7 & 896) == 256;
                Object O = av8Var3.O();
                if (z || O == nf3.a) {
                    O = new rsd(12, function04);
                    av8Var3.n0(O);
                }
                utcVar = utcVar2;
                av8Var2 = av8Var3;
                d2 = d2.z(tol.y(utcVar2, false, false, false, 0L, null, (Function0) O, av8Var3, 31));
            } else {
                utcVar = utcVar2;
                av8Var2 = av8Var3;
            }
            av8Var2.s(false);
            xtc c0 = l98.c0(d2, 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            function2 = tc3Var;
            function2.invoke(av8Var2, 6);
            int i8 = i7 << 3;
            av8 av8Var4 = av8Var2;
            b(str, str2, null, av8Var4, (i8 & 112) | 6 | (i8 & 896), 4);
            av8Var = av8Var4;
            if (function04 != null) {
                av8Var.d0(1439161431);
                kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(1439402952);
                av8Var.s(false);
            }
            av8Var.s(true);
            function03 = function04;
        } else {
            function2 = tc3Var;
            av8Var = av8Var3;
            av8Var.W();
            function03 = function02;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(str, str2, function03, function2, i2, i3, 29);
        }
    }

    public static final void h(gv9 gv9Var, long j2, dfj dfjVar, xtc xtcVar, String str, of3 of3Var, int i2) {
        int i3;
        long j3;
        dfj dfjVar2;
        xtc xtcVar2;
        av8 av8Var;
        gv9Var.getClass();
        dfjVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(98584678);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j2;
            i3 |= av8Var2.f(j3) ? 32 : 16;
        } else {
            j3 = j2;
        }
        if ((i2 & 384) == 0) {
            dfjVar2 = dfjVar;
            i3 |= av8Var2.g(dfjVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            dfjVar2 = dfjVar;
        }
        if ((i2 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? a.o : 1024;
        } else {
            xtcVar2 = xtcVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.g(str) ? 16384 : 8192;
        }
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) av8Var2.k(nz.b);
            boolean i4 = av8Var2.i(context);
            Object O = av8Var2.O();
            if (i4 || O == nf3.a) {
                O = new vt(context, 17);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            udj.c(CollectionsKt.f0(gv9Var, str, null, null, (Function1) O, 30), xtcVar2, j3, null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, dfjVar2, av8Var, ((i3 >> 6) & 112) | ((i3 << 3) & 896), ((i3 << 15) & 29360128) | 384, 126968);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ftc(gv9Var, j2, dfjVar, xtcVar, str, i2, 1);
        }
    }

    public static final void i(js8 js8Var, long j2, dfj dfjVar, xtc xtcVar, gv9 gv9Var, String str, of3 of3Var, int i2) {
        xtc xtcVar2;
        gv9 gv9Var2;
        String str2;
        int i3;
        xtc xtcVar3;
        gv9<vij> gv9Var3;
        wij wijVar;
        js8Var.getClass();
        int i4 = js8Var.d;
        dfjVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2029403494);
        int i5 = 2;
        int i6 = i2 | (av8Var.g(js8Var) ? 4 : 2) | (av8Var.f(j2) ? 32 : 16) | (av8Var.g(dfjVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 207872;
        if (av8Var.T(i6 & 1, (74899 & i6) != 74898)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                vij.b.getClass();
                gv9 W = l6g.W(i4 > 0 ? b.j(vij.DAYS, vij.HOURS, vij.MINUTES) : b.j(vij.HOURS, vij.MINUTES, vij.SECONDS));
                i3 = i6 & (-57345);
                xtcVar3 = utc.a;
                gv9Var3 = W;
                str2 = " : ";
            } else {
                av8Var.W();
                i3 = i6 & (-57345);
                xtcVar3 = xtcVar;
                gv9Var3 = gv9Var;
                str2 = str;
            }
            av8Var.t();
            gv9Var3.getClass();
            ArrayList arrayList = new ArrayList(k13.r(gv9Var3, 10));
            for (vij vijVar : gv9Var3) {
                vijVar.getClass();
                int ordinal = vijVar.ordinal();
                if (ordinal == 0) {
                    wijVar = new wij(i4, vijVar);
                } else if (ordinal == 1) {
                    wijVar = new wij(js8Var.e, vijVar);
                } else if (ordinal == i5) {
                    wijVar = new wij(js8Var.f, vijVar);
                } else {
                    if (ordinal != 3) {
                        zzl.b();
                        return;
                    }
                    wijVar = new wij(js8Var.g, vijVar);
                }
                arrayList.add(wijVar);
                i5 = 2;
            }
            xtc xtcVar4 = xtcVar3;
            h(l6g.W(arrayList), j2, dfjVar, xtcVar4, str2, av8Var, (i3 & 8176) | 24576);
            xtcVar2 = xtcVar4;
            gv9Var2 = gv9Var3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            gv9Var2 = gv9Var;
            str2 = str;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vka(js8Var, j2, dfjVar, xtcVar2, gv9Var2, str2, i2);
        }
    }

    public static final void j(yhi yhiVar, yhi yhiVar2) {
        for (Map.Entry entry : yhiVar2.c()) {
            yhiVar.r((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final e1d k(z88 z88Var, Object obj, CoroutineContext coroutineContext, of3 of3Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            coroutineContext = g.a;
        }
        av8 av8Var = (av8) of3Var;
        boolean i4 = av8Var.i(coroutineContext) | av8Var.i(z88Var);
        Object O = av8Var.O();
        rq3 rq3Var = null;
        a99 a99Var = nf3.a;
        if (i4 || O == a99Var) {
            O = new v1f(coroutineContext, z88Var, rq3Var, 24);
            av8Var.n0(O);
        }
        Function2 function2 = (Function2) O;
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = e.f(obj);
            av8Var.n0(O2);
        }
        e1d e1dVar = (e1d) O2;
        boolean i5 = av8Var.i(function2);
        Object O3 = av8Var.O();
        if (i5 || O3 == a99Var) {
            O3 = new hoh(function2, e1dVar, rq3Var, 1);
            av8Var.n0(O3);
        }
        hz8.q(z88Var, coroutineContext, (Function2) O3, av8Var);
        return e1dVar;
    }

    public static final e1d l(ddi ddiVar, of3 of3Var, int i2) {
        return k(ddiVar, ddiVar.getValue(), g.a, of3Var, (i2 & 14) | ((i2 << 3) & 896), 0);
    }

    public static ffg m(jag jagVar) {
        Integer num;
        int intValue;
        String str;
        Integer valueOf;
        jagVar.getClass();
        Integer num2 = jagVar.E;
        Integer num3 = jagVar.p;
        Integer num4 = null;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (intValue2 <= 0) {
                valueOf = null;
            } else {
                if (intValue2 > 25) {
                    intValue2 = 25;
                }
                valueOf = Integer.valueOf(intValue2);
            }
            num = valueOf;
        } else {
            num = null;
        }
        String str2 = jagVar.H;
        if (str2 != null) {
            try {
                num4 = Integer.valueOf(Color.parseColor("#".concat(str2)));
            } catch (Exception unused) {
            }
            if (num4 != null) {
                intValue = num4.intValue();
                int i2 = intValue;
                str = jagVar.v;
                if (str != null || str.length() == 0) {
                    throw new wo0("Invalid native video ad: missing video url");
                }
                Integer num5 = jagVar.o;
                if (num5 == null || num3 == null) {
                    throw new wo0("Invalid native video ad: missing creative size");
                }
                String str3 = jagVar.v;
                Integer num6 = jagVar.K;
                int intValue3 = num6 != null ? num6.intValue() : num5.intValue();
                Integer num7 = jagVar.L;
                int intValue4 = num7 != null ? num7.intValue() : num3.intValue();
                String str4 = jagVar.l;
                List list = jagVar.z;
                List list2 = jagVar.y;
                String str5 = jagVar.x;
                w9f w9fVar = ubg.a;
                Integer num8 = jagVar.D;
                w9fVar.getClass();
                return new ffg(str3, intValue3, intValue4, i2, num, str4, list, list2, str5, (num8 != null && num8.intValue() == 1) ? ubg.c : (num8 != null && num8.intValue() == 2) ? ubg.d : ubg.b);
            }
        }
        intValue = -16777216;
        int i22 = intValue;
        str = jagVar.v;
        if (str != null) {
        }
        throw new wo0("Invalid native video ad: missing video url");
    }

    public static String n(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static final ev o(gta gtaVar) {
        gtaVar.getClass();
        int ordinal = gtaVar.ordinal();
        if (ordinal == 0) {
            return ev.TOP_PREDICTORS;
        }
        if (ordinal == 1) {
            return ev.TOP_CONTRIBUTORS;
        }
        if (ordinal == 2) {
            return ev.TOP_EDITORS;
        }
        zzl.b();
        return null;
    }

    public static final void p(p3h p3hVar) {
        c6o.c0(p3hVar).F();
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean r(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }

    public static boolean s(byte b2) {
        return b2 > -65;
    }

    public static boolean t(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final void u(View view, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, pv5 pv5Var) {
        Integer num;
        float u;
        BrandColors brandColors;
        int parseColor;
        BrandColors brandColors2;
        int parseColor2;
        Integer[] numArr;
        Integer[] numArr2;
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer num2 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            Context context = view.getContext();
            context.getClass();
            int s2 = ao2.s(8, context);
            Context context2 = view.getContext();
            context2.getClass();
            int s3 = ao2.s(i3, context2);
            boolean z4 = z2 || z3;
            if (z && z4) {
                numArr2 = new Integer[]{Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s2), Integer.valueOf(s3)};
            } else {
                if (z) {
                    numArr = new Integer[]{Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s2), 0};
                } else if (z4) {
                    numArr2 = new Integer[]{Integer.valueOf(s2), 0, Integer.valueOf(s2), Integer.valueOf(z3 ? s3 : 0)};
                } else {
                    numArr = new Integer[]{Integer.valueOf(s2), 0, Integer.valueOf(s2), 0};
                }
                numArr2 = numArr;
            }
            int intValue = numArr2[0].intValue();
            int intValue2 = numArr2[1].intValue();
            int intValue3 = numArr2[2].intValue();
            int intValue4 = numArr2[3].intValue();
            if (marginLayoutParams.getMarginStart() != intValue || marginLayoutParams.topMargin != intValue2 || marginLayoutParams.getMarginEnd() != intValue3 || marginLayoutParams.bottomMargin != intValue4) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z && z4) {
                    marginLayoutParams2.setMarginStart(s2);
                    marginLayoutParams2.topMargin = s3;
                    marginLayoutParams2.setMarginEnd(s2);
                    marginLayoutParams2.bottomMargin = s3;
                } else if (z) {
                    marginLayoutParams2.setMarginStart(s2);
                    marginLayoutParams2.topMargin = s3;
                    marginLayoutParams2.setMarginEnd(s2);
                    marginLayoutParams2.bottomMargin = 0;
                } else if (z4) {
                    if (!z3) {
                        s3 = 0;
                    }
                    marginLayoutParams2.setMarginStart(s2);
                    marginLayoutParams2.topMargin = 0;
                    marginLayoutParams2.setMarginEnd(s2);
                    marginLayoutParams2.bottomMargin = s3;
                } else {
                    marginLayoutParams2.setMarginStart(s2);
                    marginLayoutParams2.topMargin = 0;
                    marginLayoutParams2.setMarginEnd(s2);
                    marginLayoutParams2.bottomMargin = 0;
                }
                view.setLayoutParams(marginLayoutParams2);
            }
        }
        Context context3 = view.getContext();
        context3.getClass();
        float u2 = ao2.u(i2, context3);
        Drawable background = view.getBackground();
        RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
        Drawable findDrawableByLayerId = rippleDrawable != null ? rippleDrawable.findDrawableByLayerId(android.R.id.content) : null;
        jxd jxdVar = findDrawableByLayerId instanceof jxd ? (jxd) findDrawableByLayerId : null;
        if (jxdVar == null) {
            jxdVar = new jxd();
        }
        if (pv5Var == null || (brandColors2 = pv5Var.b) == null) {
            num = null;
        } else {
            Context context4 = view.getContext();
            context4.getClass();
            String E = tz9.E(brandColors2, context4);
            if (E != null) {
                try {
                    parseColor2 = Color.parseColor(E);
                } catch (Exception unused) {
                }
                num = Integer.valueOf(parseColor2);
            }
            parseColor2 = 0;
            num = Integer.valueOf(parseColor2);
        }
        if (pv5Var != null && (brandColors = pv5Var.a) != null) {
            Context context5 = view.getContext();
            context5.getClass();
            String E2 = tz9.E(brandColors, context5);
            if (E2 != null) {
                try {
                    parseColor = Color.parseColor(E2);
                } catch (Exception unused2) {
                }
                num2 = Integer.valueOf(parseColor);
            }
            parseColor = 0;
            num2 = Integer.valueOf(parseColor);
        }
        boolean z5 = z2 || z3;
        if (num != null && num.intValue() == 0) {
            u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            Context context6 = view.getContext();
            context6.getClass();
            u = ao2.u(2, context6);
        }
        jxdVar.h.setStrokeWidth(u);
        jxdVar.a = u;
        jxdVar.c((z && z5) ? ug5.c : z ? hxd.a : z5 ? fxd.a : gxd.a, u2 + u);
        jxdVar.d = z3;
        jxdVar.b(i4, num, num2);
        jxdVar.invalidateSelf();
        view.setBackground(jxdVar);
        if (view.getClipToOutline()) {
            return;
        }
        view.setClipToOutline(true);
    }

    public static void v(View view, boolean z, boolean z2, int i2, int i3, int i4, pv5 pv5Var, int i5) {
        if ((i5 & 4) != 0) {
            i2 = 16;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = 4;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = view.getContext().getColor(R.color.surface_1);
        }
        int i8 = i4;
        if ((i5 & 64) != 0) {
            pv5Var = null;
        }
        view.getClass();
        u(view, z, z2, z2, i6, i7, i8, pv5Var);
    }

    public static xtc w(xtc xtcVar, k20 k20Var) {
        return xtcVar.z(new ize(k20Var));
    }

    public static yic x(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            is8.e("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j4 + j2));
                    yic yicVar = new yic();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    yicVar.d = duplicate;
                    yicVar.a = position;
                    int i7 = position - duplicate.getInt(position);
                    yicVar.b = i7;
                    yicVar.c = ((ByteBuffer) yicVar.d).getShort(i7);
                    return yicVar;
                }
            }
        }
        is8.e("Cannot read metadata.");
        return null;
    }

    public static final pog y(Function0 function0) {
        return new pog(new h10(function0, null, 26));
    }

    public static final void z(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
