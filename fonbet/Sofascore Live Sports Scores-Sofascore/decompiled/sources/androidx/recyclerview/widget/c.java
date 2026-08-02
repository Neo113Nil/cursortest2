package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c extends RecyclerView.OnScrollListener {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        d dVar = this.a;
        int i3 = dVar.a;
        int computeVerticalScrollRange = dVar.s.computeVerticalScrollRange();
        int i4 = dVar.r;
        dVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int computeHorizontalScrollRange = dVar.s.computeHorizontalScrollRange();
        int i5 = dVar.q;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        dVar.u = z;
        boolean z2 = dVar.t;
        if (!z2 && !z) {
            if (dVar.v != 0) {
                dVar.i(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            dVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            dVar.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (dVar.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            dVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            dVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = dVar.v;
        if (i6 == 0 || i6 == 1) {
            dVar.i(1);
        }
    }
}
