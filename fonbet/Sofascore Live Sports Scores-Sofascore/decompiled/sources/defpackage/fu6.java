package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class fu6 {
    public static final void a(hu6 hu6Var, String str, boolean z, boolean z2, il8 il8Var, Function1 function1, of3 of3Var, int i) {
        hu6Var.getClass();
        str.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-697732772);
        int i2 = i | (av8Var.g(hu6Var) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.e(il8Var == null ? -1 : il8Var.ordinal()) ? 16384 : 8192) | (av8Var.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = hu6Var.x.a != null;
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 458752) == 131072);
            Object O = av8Var.O();
            if (z4 || O == nf3.a) {
                O = new st6(hu6Var, function1);
                av8Var.n0(O);
            }
            un0.f(z3, (Function0) O, false, false, yqo.H(1613419467, av8Var, new xt6(hu6Var, z2, z, function1)), av8Var, 24576, 12);
            q5a.p(null, null, yqo.H(-1441727775, av8Var, new ns4(23, hu6Var, function1)), null, null, 0, r13.h, 0L, null, yqo.H(-939587285, av8Var, new er6(hu6Var, function1, str, il8Var, 1)), av8Var, 806879616, 443);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t51(hu6Var, str, z, z2, il8Var, function1, i);
        }
    }

    public static final void b(final pu6 pu6Var, hp6 hp6Var, g9a g9aVar, Function1 function1, Function1 function12, Function0 function0, Function0 function02, of3 of3Var, int i) {
        Object gjVar;
        int i2;
        av8 av8Var;
        nn2 nn2Var;
        int i3;
        hp6 hp6Var2;
        Context context;
        pu6 pu6Var2;
        boolean z;
        String str;
        pu6Var.getClass();
        hp6Var.getClass();
        g9aVar.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-17387166);
        int i4 = i | (av8Var2.i(pu6Var) ? 4 : 2) | (av8Var2.i(hp6Var) ? 32 : 16) | (av8Var2.i(g9aVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | (av8Var2.i(function12) ? 16384 : 8192) | (av8Var2.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function02) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        final int i5 = 0;
        if (av8Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            Context context2 = (Context) av8Var2.k(nz.b);
            Object k = av8Var2.k(ngb.a);
            if (k == null) {
                a70.r("Required value was null.");
                return;
            }
            Activity activity = (Activity) k;
            e1d F = l4a.F(g9aVar.h, av8Var2);
            hof hofVar = hp6Var.o;
            boolean i6 = av8Var2.i(pu6Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i6 || O == a99Var) {
                O = new Function1() { // from class: wt6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i7 = i5;
                        pu6 pu6Var3 = pu6Var;
                        Object obj2 = null;
                        switch (i7) {
                            case 0:
                                dp6 dp6Var = (dp6) obj;
                                dp6Var.getClass();
                                if (dp6Var.equals(dp6.a)) {
                                    pu6.u(pu6Var3, null, 3);
                                    return Unit.a;
                                }
                                zzl.b();
                                return null;
                            default:
                                fp6 fp6Var = (fp6) obj;
                                fp6Var.getClass();
                                gv9 gv9Var = pu6Var3.l().d;
                                if (gv9Var != null) {
                                    Iterator<E> it = gv9Var.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Object next = it.next();
                                            if (((ho7) next).a.a == fp6Var.a) {
                                                obj2 = next;
                                            }
                                        }
                                    }
                                    ho7 ho7Var = (ho7) obj2;
                                    if (ho7Var != null) {
                                        pu6.u(pu6Var3, ho7Var, 1);
                                    }
                                }
                                return Unit.a;
                        }
                    }
                };
                av8Var2.n0(O);
            }
            w1a.c(hofVar, null, (Function1) O, av8Var2, 0, 14);
            nn2 nn2Var2 = hp6Var.s;
            boolean i7 = av8Var2.i(pu6Var);
            Object O2 = av8Var2.O();
            if (i7 || O2 == a99Var) {
                O2 = new Function1() { // from class: wt6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = r2;
                        pu6 pu6Var3 = pu6Var;
                        Object obj2 = null;
                        switch (i72) {
                            case 0:
                                dp6 dp6Var = (dp6) obj;
                                dp6Var.getClass();
                                if (dp6Var.equals(dp6.a)) {
                                    pu6.u(pu6Var3, null, 3);
                                    return Unit.a;
                                }
                                zzl.b();
                                return null;
                            default:
                                fp6 fp6Var = (fp6) obj;
                                fp6Var.getClass();
                                gv9 gv9Var = pu6Var3.l().d;
                                if (gv9Var != null) {
                                    Iterator<E> it = gv9Var.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Object next = it.next();
                                            if (((ho7) next).a.a == fp6Var.a) {
                                                obj2 = next;
                                            }
                                        }
                                    }
                                    ho7 ho7Var = (ho7) obj2;
                                    if (ho7Var != null) {
                                        pu6.u(pu6Var3, ho7Var, 1);
                                    }
                                }
                                return Unit.a;
                        }
                    }
                };
                av8Var2.n0(O2);
            }
            w1a.c(nn2Var2, null, (Function1) O2, av8Var2, 0, 14);
            nn2 nn2Var3 = pu6Var.n;
            boolean i8 = av8Var2.i(hp6Var) | ((3670016 & i4) == 1048576);
            int i9 = 57344 & i4;
            boolean i10 = i8 | (i9 == 16384) | av8Var2.i(context2) | av8Var2.i(pu6Var) | ((458752 & i4) == 131072);
            int i11 = i4 & 7168;
            boolean z2 = i10 | (i11 == 2048);
            Object O3 = av8Var2.O();
            if (z2 || O3 == a99Var) {
                i2 = i9;
                av8Var = av8Var2;
                nn2Var = nn2Var3;
                i3 = i11;
                gjVar = new gj(function02, hp6Var, function12, context2, pu6Var, function0, function1, 2);
                hp6Var2 = hp6Var;
                context = context2;
                pu6Var2 = pu6Var;
                av8Var.n0(gjVar);
            } else {
                av8Var = av8Var2;
                nn2Var = nn2Var3;
                i2 = i9;
                context = context2;
                i3 = i11;
                pu6Var2 = pu6Var;
                gjVar = O3;
                hp6Var2 = hp6Var;
            }
            w1a.c(nn2Var, null, (Function1) gjVar, av8Var, 0, 14);
            hu6 l = pu6Var2.l();
            String str2 = pu6Var2.i;
            boolean z3 = pu6Var2.j;
            boolean z4 = ((pn3) F.getValue()) != null;
            il8 r = pu6Var2.r();
            int i12 = (av8Var.i(pu6Var2) ? 1 : 0) | (av8Var.i(context) ? 1 : 0) | (i3 == 2048 ? 1 : 0) | (av8Var.i(hp6Var2) ? 1 : 0) | (i2 != 16384 ? 0 : 1) | (av8Var.i(g9aVar) ? 1 : 0) | (av8Var.i(activity) ? 1 : 0);
            Object O4 = av8Var.O();
            if (i12 != 0 || O4 == a99Var) {
                z = z3;
                str = str2;
                gj gjVar2 = new gj(pu6Var2, context, function1, hp6Var2, function12, g9aVar, activity, 3);
                av8Var.n0(gjVar2);
                O4 = gjVar2;
            } else {
                str = str2;
                z = z3;
            }
            av8Var2 = av8Var;
            a(l, str, z, z4, r, (Function1) O4, av8Var2, 0);
        } else {
            av8Var2.W();
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new el1(pu6Var, hp6Var, g9aVar, function1, function12, function0, function02, i, 1);
        }
    }
}
