package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k4 extends orf {
    public final /* synthetic */ l4 a;

    public k4(l4 l4Var) {
        this.a = l4Var;
    }

    @Override // defpackage.krf
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        l4 l4Var = this.a;
        return !l4Var.d && motionEvent.getY() <= ((float) l4Var.h().getRoot().getMeasuredHeight()) && !l4Var.e && l4Var.f;
    }
}
