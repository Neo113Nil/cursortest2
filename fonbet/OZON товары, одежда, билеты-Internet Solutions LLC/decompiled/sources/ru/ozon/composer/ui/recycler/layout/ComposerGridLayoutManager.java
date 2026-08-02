package ru.ozon.composer.ui.recycler.layout;

import E10.d;
import E10.e;
import O10.a;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.FixedGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import jk0.b;
import jk0.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.scrollable.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u000fB+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/composer/ui/recycler/layout/ComposerGridLayoutManager;", "Landroidx/recyclerview/widget/FixedGridLayoutManager;", "Ljk0/b;", "LE10/b;", "LE10/d;", "LF10/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "a", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerGridLayoutManager extends FixedGridLayoutManager implements b, E10.b, d, F10.a {

    /* renamed from: i, reason: collision with root package name */
    private float f94834i;

    /* renamed from: j, reason: collision with root package name */
    private float f94835j;

    /* renamed from: k, reason: collision with root package name */
    private i f94836k;

    /* renamed from: l, reason: collision with root package name */
    private a.C0392a f94837l;

    /* renamed from: m, reason: collision with root package name */
    private Parcelable f94838m;

    /* renamed from: n, reason: collision with root package name */
    private RecyclerView f94839n;

    /* renamed from: o, reason: collision with root package name */
    private u f94840o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Object f94841p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private ArrayList f94842q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f94843r;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    final class a implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        private RecyclerView.o.c f94844a;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public final void a(int i11, int i12) {
            Iterator it = ComposerGridLayoutManager.this.f94842q.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(i11);
            }
            RecyclerView.o.c cVar = this.f94844a;
            if (cVar != null) {
                cVar.a(i11, i12);
            }
        }

        public final void b(RecyclerView.o.c cVar) {
            this.f94844a = cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerGridLayoutManager(@NotNull Context context) {
        super(context, m.f94768d, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f94841p = k.a(n.NONE, new ru.ozon.composer.ui.recycler.layout.a(this));
        this.f94842q = new ArrayList();
        this.f94843r = true;
    }

    @Override // E10.d
    public final void a(@NotNull e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f94842q.add(listener);
    }

    @Override // E10.b
    public final void b(float f7) {
        this.f94835j = Math.max(f7, 0.0f);
    }

    @Override // E10.b
    public final void c(float f7) {
        this.f94834i = Math.max(f7, 0.0f);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    protected final void calculateExtraLayoutSpace(@NotNull RecyclerView.A state, @NotNull int[] extraLayoutSpace) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
        if (this.f94835j <= 0.0f && this.f94834i <= 0.0f) {
            super.calculateExtraLayoutSpace(state, extraLayoutSpace);
            return;
        }
        RecyclerView recyclerView = this.f94839n;
        if (recyclerView == null) {
            super.calculateExtraLayoutSpace(state, extraLayoutSpace);
            return;
        }
        int height = getOrientation() == 1 ? recyclerView.getHeight() : recyclerView.getWidth();
        if (height <= 0 || state.c()) {
            super.calculateExtraLayoutSpace(state, extraLayoutSpace);
            return;
        }
        float f7 = height;
        extraLayoutSpace[0] = (int) (this.f94835j * f7);
        extraLayoutSpace[1] = (int) (f7 * this.f94834i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return this.f94843r && super.canScrollVertically();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void collectAdjacentPrefetchPositions(int i11, int i12, RecyclerView.A a11, RecyclerView.o.c cVar) {
        ?? r02 = this.f94841p;
        ((a) r02.getValue()).b(cVar);
        super.collectAdjacentPrefetchPositions(i11, i12, a11, (a) r02.getValue());
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int getColumnCountForAccessibility(@NotNull RecyclerView.v recycler, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        if (getOrientation() == 1) {
            return 1;
        }
        return super.getColumnCountForAccessibility(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void layoutDecoratedWithMargins(@NotNull View child, int i11, int i12, int i13, int i14) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(child, "child");
        if (U4.a.b() && (recyclerView = this.f94839n) != null) {
            recyclerView.getChildViewHolder(child);
        }
        super.layoutDecoratedWithMargins(child, i11, i12, i13, i14);
        Unit unit = Unit.f71690a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        this.f94839n = recyclerView;
        super.onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        if (getRecycleChildrenOnDetach()) {
            this.f94838m = super.onSaveInstanceState();
        }
        super.onDetachedFromWindow(recyclerView, vVar);
        this.f94839n = null;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a11) {
        super.onLayoutChildren(vVar, a11);
        a.C0392a c0392a = this.f94837l;
        if (c0392a != null) {
            c0392a.a();
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.A a11) {
        Function0<Unit> O11;
        super.onLayoutCompleted(a11);
        i iVar = this.f94836k;
        if (iVar != null && (O11 = iVar.O()) != null) {
            O11.invoke();
        }
        u uVar = this.f94840o;
        if (uVar != null) {
            uVar.a();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable = this.f94838m;
        this.f94838m = null;
        return parcelable == null ? super.onSaveInstanceState() : parcelable;
    }

    public final void r(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f94836k = container;
    }

    public final void s(@NotNull a.C0392a updater) {
        Intrinsics.checkNotNullParameter(updater, "updater");
        this.f94837l = updater;
    }

    @Override // F10.a
    public final void scrollEnable(boolean z11) {
        this.f94843r = z11;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        int scrollVerticallyBy = super.scrollVerticallyBy(i11, vVar, a11);
        a.C0392a c0392a = this.f94837l;
        if (c0392a != null) {
            c0392a.b(scrollVerticallyBy);
        }
        return scrollVerticallyBy;
    }

    @Override // jk0.b
    public final void setOnLayoutCompletedListener(jk0.k kVar) {
        this.f94840o = (u) kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerGridLayoutManager(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f94841p = k.a(n.NONE, new ru.ozon.composer.ui.recycler.layout.a(this));
        this.f94842q = new ArrayList();
        this.f94843r = true;
    }
}
