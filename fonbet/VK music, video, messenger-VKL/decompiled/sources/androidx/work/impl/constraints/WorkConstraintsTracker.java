package androidx.work.impl.constraints;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.c660;
import xsna.d560;
import xsna.iv6;
import xsna.izs;
import xsna.jhl0;
import xsna.l460;
import xsna.mv6;
import xsna.p460;
import xsna.rl3;
import xsna.u260;
import xsna.uhp0;
import xsna.v560;
import xsna.v5j;
import xsna.wux0;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public final class WorkConstraintsTracker {
    public final List<v5j> a;

    /* compiled from: WorkConstraintsTracker.kt */
    /* loaded from: classes12.dex */
    public final class a extends Lambda implements izs<v5j, CharSequence> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final CharSequence invoke(v5j v5jVar) {
            return v5jVar.getClass().getSimpleName();
        }
    }

    public WorkConstraintsTracker(uhp0 uhp0Var) {
        iv6 iv6Var = new iv6(uhp0Var.b);
        mv6 mv6Var = new mv6(uhp0Var.c);
        jhl0 jhl0Var = new jhl0(uhp0Var.e);
        v560 v560Var = uhp0Var.d;
        u260 u260Var = new u260(v560Var);
        c660 c660Var = new c660(v560Var);
        p460 p460Var = new p460(v560Var);
        l460 l460Var = new l460(v560Var);
        Context context = uhp0Var.a;
        int i = wux0.a;
        this.a = rl3.I(new v5j[]{iv6Var, mv6Var, jhl0Var, u260Var, c660Var, p460Var, l460Var, new d560((ConnectivityManager) context.getSystemService("connectivity"))});
    }
}
