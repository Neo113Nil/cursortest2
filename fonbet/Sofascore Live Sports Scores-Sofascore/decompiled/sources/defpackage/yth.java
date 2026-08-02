package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yth extends u61 {
    public final hn6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yth(WeakReference weakReference, snl snlVar, Function0 function0) {
        super(weakReference, snlVar, function0);
        snlVar.getClass();
        hn6 hn6Var = new hn6((RelativeLayout) this.c.i);
        this.f = hn6Var;
        ((xnl) snlVar).a(hn6Var);
        ((View) this.c.g).setOnClickListener(new cne(this, 23));
    }

    @Override // defpackage.u61
    public final void a() {
        ((ProgressBar) this.c.h).setVisibility(0);
    }
}
