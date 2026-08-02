package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vrf extends RecyclerView.OnScrollListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function1 b;

    public vrf(float f, Function1 function1) {
        this.a = f;
        this.b = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float f = this.a;
        float f2 = (computeVerticalScrollOffset * f) / 100.0f;
        if (f2 <= f) {
            f = f2;
        }
        if (f < 0.01f) {
            f = 0.01f;
        }
        this.b.invoke(Float.valueOf(f));
    }
}
