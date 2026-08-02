package Df;

import Df.c;
import ag.H;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.livechat.android.utils.MobilistenUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import od.q;
import og.i;
import og.k;
import rd.C6218a;

/* loaded from: classes4.dex */
public final class d extends c.h {

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f2731g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2732h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2733i;

    /* renamed from: j, reason: collision with root package name */
    public View f2734j;

    /* renamed from: k, reason: collision with root package name */
    public View f2735k;

    /* renamed from: l, reason: collision with root package name */
    public View f2736l;

    /* renamed from: m, reason: collision with root package name */
    public final Lazy f2737m;

    /* renamed from: n, reason: collision with root package name */
    public final Lazy f2738n;

    /* renamed from: o, reason: collision with root package name */
    public AppCompatImageView f2739o;

    /* renamed from: p, reason: collision with root package name */
    public final Lazy f2740p;

    /* renamed from: q, reason: collision with root package name */
    public final Lazy f2741q;

    /* renamed from: r, reason: collision with root package name */
    public final Lazy f2742r;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f2743d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(k.b(24));
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f2744d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(MobilistenUtil.m());
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(d.this.I());
        }
    }

    /* renamed from: Df.d$d, reason: collision with other inner class name */
    public static final class C0057d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0057d f2746d = new C0057d();

        public C0057d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(k.b(40));
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f2747d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(k.b(64) + C6218a.U());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, int i11, Function1 onMessageSwiped) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(onMessageSwiped, "onMessageSwiped");
        this.f2731g = onMessageSwiped;
        this.f2737m = LazyKt.lazy(b.f2744d);
        this.f2738n = LazyKt.lazy(a.f2743d);
        this.f2740p = LazyKt.lazy(e.f2747d);
        this.f2741q = LazyKt.lazy(new c());
        this.f2742r = LazyKt.lazy(C0057d.f2746d);
    }

    public final int[] B(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    public final View C(View view) {
        View view2 = this.f2736l;
        if (view2 != null) {
            return view2;
        }
        View findViewWithTag = view.findViewWithTag("swipeable_sender_image_view_for_reply");
        this.f2736l = findViewWithTag;
        return findViewWithTag;
    }

    public final View D(View view) {
        View view2 = this.f2735k;
        if (view2 != null) {
            return view2;
        }
        View findViewWithTag = view.findViewWithTag("swipeable_sender_name_view_for_reply");
        this.f2735k = findViewWithTag;
        return findViewWithTag;
    }

    public final int E() {
        return ((Number) this.f2741q.getValue()).intValue();
    }

    public final float F() {
        return ((Number) this.f2742r.getValue()).floatValue();
    }

    public final AppCompatImageView G(ViewParent viewParent) {
        if (i.g(this.f2739o)) {
            ViewGroup viewGroup = viewParent instanceof ViewGroup ? (ViewGroup) viewParent : null;
            this.f2739o = viewGroup != null ? (AppCompatImageView) viewGroup.findViewById(q.f60686w) : null;
        }
        return this.f2739o;
    }

    public final int H() {
        return ((Number) this.f2740p.getValue()).intValue();
    }

    public final int I() {
        return ((Number) this.f2738n.getValue()).intValue();
    }

    public final boolean J() {
        return ((Boolean) this.f2737m.getValue()).booleanValue();
    }

    public final void K() {
        this.f2734j = null;
        this.f2735k = null;
        this.f2736l = null;
    }

    @Override // Df.c.e
    public void c(RecyclerView recyclerView, RecyclerView.F viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View findViewById = viewHolder.itemView.findViewById(q.f60686w);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (this.f2732h && !this.f2733i) {
            Function1 function1 = this.f2731g;
            H h10 = viewHolder instanceof H ? (H) viewHolder : null;
            function1.invoke(h10 != null ? h10.q0() : null);
        }
        K();
        this.f2732h = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r13.f2732h != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        r13.f2732h = true;
        r0 = com.zoho.livechat.android.provider.MobilistenInitProvider.INSTANCE.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        og.AbstractC5892d.n(r0, new long[]{0, 20, 20, 0});
     */
    @Override // Df.c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(Canvas c10, RecyclerView recyclerView, RecyclerView.F viewHolder, float f10, float f11, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        H h10 = viewHolder instanceof H ? (H) viewHolder : null;
        if (h10 == null || !h10.b0()) {
            return;
        }
        if (this.f2733i != z10) {
            K();
        }
        ViewGroup n02 = ((H) viewHolder).n0();
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        View D10 = D(itemView);
        View itemView2 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        View C10 = C(itemView2);
        if (n02 != null) {
            int[] B10 = B(n02);
            this.f2733i = z10;
            float width = viewHolder.itemView.getWidth() / 4;
            if (MobilistenUtil.m()) {
                width = -width;
            }
            float max = J() ? Math.max(f10, width) : Math.min(f10, width);
            if (z10) {
                if (J()) {
                    this.f2732h = false;
                } else {
                    this.f2732h = false;
                }
            }
            super.q(c10, recyclerView, n02, max, f11, i10, z10);
            if (C10 != null) {
                super.q(c10, recyclerView, C10, max, f11, i10, z10);
            }
            super.q(c10, recyclerView, D10, max, f11, i10, z10);
            ViewParent parent = recyclerView.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            AppCompatImageView G10 = G(parent);
            if (G10 != null) {
                super.q(c10, recyclerView, G10, RangesKt.coerceAtMost(max + (J() ? I() : -I()), F()), ((B10[1] - H()) + (n02.getHeight() / 2)) - (E() / 2), i10, z10);
            }
        }
    }

    @Override // Df.c.e
    public boolean v(RecyclerView recyclerView, RecyclerView.F viewHolder, RecyclerView.F target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }
}
