package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class q97 {
    public static final void a(pb7 pb7Var, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        Function1 function13;
        Function1 function14;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1617785050);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(pb7Var) : av8Var.i(pb7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function13 = function1;
            i2 |= av8Var.i(function13) ? 32 : 16;
        } else {
            function13 = function1;
        }
        if ((i & 384) == 0) {
            function14 = function12;
            i2 |= av8Var.i(function14) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            function14 = function12;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            wkn.a(pb7Var.a, n9e.q(xtcVar, lz.D(R.color.surface_1, av8Var), oyn.e), null, null, yqo.H(1137874783, av8Var, new er6(function14, (Object) pb7Var, function13, av8Var.k(nz.b), 3)), av8Var, 24576, 12);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(pb7Var, function1, function12, xtcVar, i, 14);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void b(defpackage.wb7 r24, defpackage.t97 r25, kotlin.jvm.functions.Function1 r26, defpackage.et8 r27, kotlin.jvm.functions.Function1 r28, defpackage.xtc r29, defpackage.of3 r30, int r31) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.b(wb7, t97, kotlin.jvm.functions.Function1, et8, kotlin.jvm.functions.Function1, xtc, of3, int):void");
    }
}
