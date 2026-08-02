package androidx.recyclerview.widget;

import com.sports.insider.ui.news.fragment.NewsFragment;
import com.sports.insider.ui.strip.PredictionListFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2594b;

    public /* synthetic */ z(int i5, Object obj) {
        this.f2593a = i5;
        this.f2594b = obj;
    }

    @Override // androidx.recyclerview.widget.p1
    public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
        switch (this.f2593a) {
            case 2:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (i5 == 0) {
                    x0 adapter = recyclerView.getAdapter();
                    qe.e eVar = adapter instanceof qe.e ? (qe.e) adapter : null;
                    if (eVar != null) {
                        androidx.lifecycle.e0 viewLifecycleOwner = ((PredictionListFragment) this.f2594b).getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        qe.e.c(eVar, recyclerView, androidx.lifecycle.d1.g(viewLifecycleOwner));
                        break;
                    }
                }
                break;
            default:
                super.onScrollStateChanged(recyclerView, i5);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.p1
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        Object[] objArr = 0;
        switch (this.f2593a) {
            case 0:
                c0 c0Var = (c0) this.f2594b;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i11 = c0Var.f2331a;
                int computeVerticalScrollRange = c0Var.f2347s.computeVerticalScrollRange();
                int i12 = c0Var.f2346r;
                c0Var.f2348t = computeVerticalScrollRange - i12 > 0 && i12 >= i11;
                int computeHorizontalScrollRange = c0Var.f2347s.computeHorizontalScrollRange();
                int i13 = c0Var.q;
                boolean z5 = computeHorizontalScrollRange - i13 > 0 && i13 >= i11;
                c0Var.f2349u = z5;
                boolean z7 = c0Var.f2348t;
                if (!z7 && !z5) {
                    if (c0Var.f2350v != 0) {
                        c0Var.d(0);
                        break;
                    }
                } else {
                    if (z7) {
                        float f6 = i12;
                        c0Var.f2341l = (int) ((((f6 / 2.0f) + computeVerticalScrollOffset) * f6) / computeVerticalScrollRange);
                        c0Var.f2340k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
                    }
                    if (c0Var.f2349u) {
                        float f10 = computeHorizontalScrollOffset;
                        float f11 = i13;
                        c0Var.f2344o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
                        c0Var.f2343n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
                    }
                    int i14 = c0Var.f2350v;
                    if (i14 == 0 || i14 == 1) {
                        c0Var.d(1);
                        break;
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                k1 layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    je.b G = ((NewsFragment) this.f2594b).G();
                    int itemCount = linearLayoutManager.getItemCount();
                    G.getClass();
                    if (!fd.d.f9575a && itemCount >= 20 && i10 > 0 && !G.f18465b.get() && itemCount - findFirstVisibleItemPosition < 5) {
                        G.f18465b.set(true);
                        u1.a i15 = androidx.lifecycle.d1.i(G);
                        lg.e eVar = eg.m0.f9201a;
                        eg.c0.t(i15, jg.q.f18523a, null, new androidx.lifecycle.b((Object) G, (Continuation) (objArr == true ? 1 : 0), 9), 2);
                        break;
                    }
                }
                break;
            default:
                PredictionListFragment predictionListFragment = (PredictionListFragment) this.f2594b;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                k1 layoutManager2 = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager2 != null) {
                    int findFirstVisibleItemPosition2 = linearLayoutManager2.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                    pe.s H = predictionListFragment.H();
                    int itemCount2 = linearLayoutManager2.getItemCount();
                    H.getClass();
                    if (itemCount2 - findLastVisibleItemPosition < 5 && i10 > 0) {
                        H.j(androidx.lifecycle.d1.i(H), new k2.v(2, H, pe.s.class, "downloadPreviewWork", "downloadPreviewWork(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), true);
                    }
                    hg.d1 d1Var = H.f21870i;
                    Integer valueOf = Integer.valueOf(findFirstVisibleItemPosition2 == 0 ? 8 : 0);
                    d1Var.getClass();
                    d1Var.k(null, valueOf);
                    x0 adapter = recyclerView.getAdapter();
                    qe.e eVar2 = adapter instanceof qe.e ? (qe.e) adapter : null;
                    if (eVar2 != null) {
                        androidx.lifecycle.e0 viewLifecycleOwner = predictionListFragment.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        qe.e.c(eVar2, recyclerView, androidx.lifecycle.d1.g(viewLifecycleOwner));
                        break;
                    }
                }
                break;
        }
    }
}
