package ru.ozon.composer.ui.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.h;
import di0.C6201a;
import di0.C6203c;
import k10.EnumC7467b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lk0.c;
import lk0.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/composer/ui/recycler/MetricsRecyclerView;", "Landroidx/recyclerview/widget/g;", "Llk0/c;", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricsRecyclerView extends g implements c {

    /* renamed from: d, reason: collision with root package name */
    private String f94828d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f94829e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private E10.a f94830f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final A10.g f94831g;

    final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> f7 = MetricsRecyclerView.this.getF44873b().f();
            if (f7 != null) {
                f7.invoke();
            }
            return Unit.f71690a;
        }
    }

    final class b extends AbstractC7737t implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> e11 = MetricsRecyclerView.this.getF44873b().e();
            if (e11 != null) {
                e11.invoke();
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricsRecyclerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        E10.a aVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        aVar = E10.a.f7340c;
        this.f94830f = aVar;
        this.f94831g = new A10.g(new a(), new b());
        RecyclerView.l itemAnimator = getItemAnimator();
        if (itemAnimator instanceof h) {
            ((h) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    @Override // lk0.c
    public final d b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object childViewHolder = getChildViewHolder(view);
        if (childViewHolder instanceof d) {
            return (d) childViewHolder;
        }
        return null;
    }

    public final void h() {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof E10.b) {
            E10.b bVar = (E10.b) layoutManager;
            bVar.b(0.0f);
            bVar.c(0.0f);
        }
        this.f94829e = false;
    }

    public final void i(String str) {
        this.f94828d = str;
    }

    public final void j(@NotNull E10.a depth) {
        Intrinsics.checkNotNullParameter(depth, "depth");
        this.f94830f = depth;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r11 != null) goto L35;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        String str;
        try {
            super.onLayout(z11, i11, i12, i13, i14);
            String str2 = this.f94828d;
            if (str2 != null) {
                C6201a beginTrace = C6203c.f61631a.beginTrace(str2);
                C6201a.f(beginTrace, EnumC7467b.LAYOUT_TIME_END, 0L, false, 6);
                C6201a.f(beginTrace, EnumC7467b.TOTAL_TIME_END, 0L, false, 6);
                Function1<String, Unit> b11 = getF44873b().b();
                if (b11 != null) {
                    b11.invoke(str2);
                }
                this.f94828d = null;
            }
            if (this.f94829e) {
                return;
            }
            if (this.f94830f.c() > 0.0f || this.f94830f.b() > 0.0f) {
                float c11 = this.f94830f.c();
                float b12 = this.f94830f.b();
                Object layoutManager = getLayoutManager();
                if (layoutManager instanceof E10.b) {
                    E10.b bVar = (E10.b) layoutManager;
                    bVar.b(c11);
                    bVar.c(b12);
                }
                this.f94829e = true;
            }
        } catch (Exception e11) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null) {
                RecyclerView.C childViewHolder = getChildViewHolder(childAt);
                Class<?> cls = childViewHolder.getClass();
                str = cls.isAnonymousClass() ? childViewHolder.toString() : cls.getName();
            }
            str = "undefined";
            getF44873b().c().invoke(this.f94828d, new A10.a(str, e11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        String str = this.f94828d;
        if (str != null) {
            C6201a beginTrace = C6203c.f61631a.beginTrace(str);
            C6201a.f(beginTrace, EnumC7467b.PREPARE_PRESENTATION_DATA_TIME_END, 0L, false, 2);
            C6201a.f(beginTrace, EnumC7467b.LAYOUT_TIME_START, 0L, false, 2);
            Function1<String, Unit> d11 = getF44873b().d();
            if (d11 != null) {
                d11.invoke(str);
            }
        }
        super.onMeasure(i11, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrollStateChanged(int i11) {
        super.onScrollStateChanged(i11);
        this.f94831g.a(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void removeItemDecoration(@NotNull RecyclerView.n decor) {
        Intrinsics.checkNotNullParameter(decor, "decor");
        try {
            super.removeItemDecoration(decor);
        } catch (IllegalStateException e11) {
            throw new A10.b(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(RecyclerView.l lVar) {
        if (!(lVar == null ? true : lVar instanceof h)) {
            throw new IllegalArgumentException("Only DefaultItemAnimator inheritors are supported");
        }
        h hVar = (h) lVar;
        if (hVar != null) {
            hVar.setSupportsChangeAnimations(false);
        }
        super.setItemAnimator(lVar);
    }
}
