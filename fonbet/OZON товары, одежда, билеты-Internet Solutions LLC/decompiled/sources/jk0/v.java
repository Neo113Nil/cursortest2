package jk0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import java.lang.ref.WeakReference;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private final M10.a f70192a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f70193b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakHashMap f70194c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f70195d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private WeakReference<RecyclerView> f70196e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final s f70197f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final t f70198g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private b f70199h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final u f70200i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final a f70201j;

    public static final class a implements RecyclerView.q {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void onChildViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            v vVar = v.this;
            RecyclerView f7 = vVar.f();
            if (f7 != null && (f7.getChildViewHolder(view) instanceof n)) {
                vVar.b(view);
                vVar.d(f7);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void onChildViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            v.this.i(view);
        }
    }

    public static final class b extends RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            v vVar = v.this;
            M10.a g10 = vVar.g();
            if (g10 != null) {
                g10.c(i12);
            }
            vVar.d(recyclerView);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [jk0.s] */
    /* JADX WARN: Type inference failed for: r4v5, types: [jk0.t] */
    public v(@NotNull RecyclerView recyclerView, M10.a aVar) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f70192a = aVar;
        this.f70193b = new Handler(Looper.getMainLooper());
        this.f70194c = new WeakHashMap();
        this.f70196e = new WeakReference<>(recyclerView);
        this.f70197f = new Runnable() { // from class: jk0.s
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = v.this;
                RecyclerView f7 = vVar.f();
                if (f7 != null) {
                    vVar.d(f7);
                }
            }
        };
        this.f70198g = new Runnable() { // from class: jk0.t
            @Override // java.lang.Runnable
            public final void run() {
                v.a(v.this);
            }
        };
        b bVar = new b();
        this.f70199h = bVar;
        u uVar = new u(this, recyclerView);
        this.f70200i = uVar;
        a aVar2 = new a();
        this.f70201j = aVar2;
        recyclerView.addOnScrollListener(bVar);
        recyclerView.addOnChildAttachStateChangeListener(aVar2);
        Object layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof jk0.b)) {
            throw new IllegalArgumentException("LayoutManager must be AdvancedViewHolderLifecycleLayoutManager");
        }
        ((jk0.b) layoutManager).setOnLayoutCompletedListener(uVar);
    }

    public static void a(v vVar) {
        RecyclerView f7 = vVar.f();
        if (f7 == null || f7.isComputingLayout()) {
            return;
        }
        RecyclerView.l itemAnimator = f7.getItemAnimator();
        if (itemAnimator instanceof androidx.recyclerview.widget.h) {
            androidx.recyclerview.widget.h hVar = (androidx.recyclerview.widget.h) itemAnimator;
            Iterator<T> it = y.a(hVar).iterator();
            while (it.hasNext()) {
                View itemView = ((RecyclerView.C) it.next()).itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                vVar.c(itemView, f7);
            }
            if (hVar.isRunning()) {
                Handler handler = vVar.f70193b;
                t tVar = vVar.f70198g;
                if (androidx.core.os.h.b(handler, tVar)) {
                    return;
                }
                handler.post(tVar);
            }
        }
    }

    public final void b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WeakHashMap weakHashMap = this.f70194c;
        if (weakHashMap.get(view) == null) {
            weakHashMap.put(view, null);
        }
    }

    protected abstract void c(@NotNull View view, @NotNull RecyclerView recyclerView);

    protected final void d(@NotNull RecyclerView recyclerView) {
        boolean hasCallbacks;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        boolean isComputingLayout = recyclerView.isComputingLayout();
        Handler handler = this.f70193b;
        s sVar = this.f70197f;
        if (isComputingLayout) {
            if (Build.VERSION.SDK_INT < 29) {
                handler.removeCallbacks(sVar);
            } else {
                hasCallbacks = handler.hasCallbacks(sVar);
                if (hasCallbacks) {
                    return;
                }
            }
            handler.post(sVar);
            return;
        }
        handler.removeCallbacks(sVar);
        try {
            Iterator it = this.f70194c.entrySet().iterator();
            while (it.hasNext()) {
                c((View) ((Map.Entry) it.next()).getKey(), recyclerView);
            }
        } catch (ConcurrentModificationException unused) {
            handler.post(sVar);
        }
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.isRunning()) {
            return;
        }
        t tVar = this.f70198g;
        if (androidx.core.os.h.b(handler, tVar)) {
            return;
        }
        handler.post(tVar);
    }

    public final void e() {
        this.f70194c.clear();
        RecyclerView f7 = f();
        if (f7 != null) {
            f7.removeOnScrollListener(this.f70199h);
            f7.removeOnChildAttachStateChangeListener(this.f70201j);
            Object layoutManager = f7.getLayoutManager();
            jk0.b bVar = layoutManager instanceof jk0.b ? (jk0.b) layoutManager : null;
            if (bVar != null) {
                bVar.setOnLayoutCompletedListener(this.f70200i);
            }
        }
        this.f70196e.clear();
    }

    protected final RecyclerView f() {
        return this.f70196e.get();
    }

    protected final M10.a g() {
        return this.f70192a;
    }

    protected final boolean h() {
        return this.f70195d;
    }

    public final void i(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f70194c.remove(view);
    }

    public final void j(boolean z11) {
        this.f70195d = z11;
        RecyclerView f7 = f();
        if (f7 != null) {
            d(f7);
        }
    }

    protected final void k(@NotNull n nVar, @NotNull View view) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (nVar instanceof kk0.a) {
            M10.a aVar = this.f70192a;
            Long valueOf = aVar != null ? Long.valueOf(aVar.a()) : null;
            if (valueOf != null) {
                view.getLocationInWindow(new int[2]);
                ((kk0.a) nVar).updateVerticalOffset(valueOf.longValue() + r1[1]);
            }
        }
    }
}
