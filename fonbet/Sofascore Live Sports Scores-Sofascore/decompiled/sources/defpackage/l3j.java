package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class l3j {
    public static final void a(vnb vnbVar, Function1 function1, String str, n52 n52Var, boolean z, String str2, of3 of3Var, int i) {
        int i2;
        String str3;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2098729604);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(vnbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(n52Var) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str3 = str2;
            i2 |= av8Var2.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            str3 = str2;
        }
        int i3 = i2;
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var2.O();
            if (z2 || O == nf3.a) {
                O = new vbc(28, function1);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            ktm.s(vnbVar, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(1993530885, av8Var2, new er6(26, n52Var, str3, str, function1)), av8Var, (i3 & 14) | 100663296 | ((i3 >> 6) & 896), 248);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(vnbVar, function1, str, n52Var, z, str2, i);
        }
    }

    public static final void b(String str, n3j n3jVar, n52 n52Var, String str2, of3 of3Var, int i) {
        str.getClass();
        n3jVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1243756330);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.i(n3jVar) ? 32 : 16) | (av8Var.g(n52Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str2) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x = rfo.x(n3jVar.f, av8Var, 0);
            e1d x2 = rfo.x(n3jVar.j, av8Var, 0);
            vnb vnbVar = (vnb) x.getValue();
            boolean i3 = av8Var.i(context) | av8Var.i(n3jVar);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new dvi(8, context, n3jVar);
                av8Var.n0(O);
            }
            int i4 = i2 << 6;
            a(vnbVar, (Function1) O, str, n52Var, ((Boolean) x2.getValue()).booleanValue(), str2, av8Var, ((i2 << 3) & 7168) | (i4 & 896) | (i4 & 458752));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mp9(i, 16, str, n3jVar, n52Var, str2);
        }
    }

    public static final void c(Serializable serializable, gv9 gv9Var, ksa ksaVar, Context context, ku3 ku3Var) {
        int i;
        Iterator<E> it = gv9Var.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            Object next = it.next();
            if (i3 < 0) {
                b.q();
                throw null;
            }
            TopStatsCategory topStatsCategory = (TopStatsCategory) next;
            topStatsCategory.getClass();
            if (Intrinsics.c(topStatsCategory.getA(), serializable)) {
                break;
            } else {
                i3++;
            }
        }
        Integer valueOf = Integer.valueOf(i3);
        if (i3 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (intValue < 0 || intValue >= 5) {
                if (4 <= intValue && intValue < 10) {
                    i2 = 1;
                } else {
                    if (9 > intValue || intValue >= 15) {
                        i = 3;
                        xw3.L(ku3Var, null, null, new gz6(ksaVar, i, intValue, context, (rq3) null, 10), 3);
                    }
                    i2 = 2;
                }
            }
            i = i2;
            xw3.L(ku3Var, null, null, new gz6(ksaVar, i, intValue, context, (rq3) null, 10), 3);
        }
    }
}
