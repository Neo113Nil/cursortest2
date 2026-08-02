package com.vk.lists;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.by2;
import xsna.d2e0;
import xsna.ee;
import xsna.fe90;
import xsna.gxp;
import xsna.gzs;
import xsna.h6s;
import xsna.hda0;
import xsna.izs;
import xsna.j7;
import xsna.krv0;
import xsna.n6s;
import xsna.ptl;
import xsna.qtl;
import xsna.s3q0;
import xsna.t96;
import xsna.too0;
import xsna.whp;
import xsna.x6s;
import xsna.xa80;

/* loaded from: classes3.dex */
public abstract class AbstractPaginatedView extends FrameLayout implements too0 {
    public static final /* synthetic */ int v = 0;
    public a b;
    public ee c;
    public View d;
    public FrameLayout e;
    public gzs<s3q0> f;
    public gzs<s3q0> g;
    public t96 h;
    public n6s i;
    public x6s j;
    public h6s k;
    public f l;
    public final AnimatorSet m;
    public j n;
    public boolean o;

    @Nullable
    public i p;

    @Nullable
    public ArrayList q;
    public int r;

    @Nullable
    public e s;
    public final b t;
    public final c u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayoutType {
        private static final /* synthetic */ LayoutType[] $VALUES;
        public static final LayoutType GRID;
        public static final LayoutType LINEAR;
        public static final LayoutType STAGGERED_GRID;

        static {
            LayoutType layoutType = new LayoutType("LINEAR", 0);
            LINEAR = layoutType;
            LayoutType layoutType2 = new LayoutType(SignalingProtocol.KEY_GRID, 1);
            GRID = layoutType2;
            LayoutType layoutType3 = new LayoutType("STAGGERED_GRID", 2);
            STAGGERED_GRID = layoutType3;
            $VALUES = new LayoutType[]{layoutType, layoutType2, layoutType3};
        }

        public LayoutType() {
            throw null;
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }

    public class a extends FrameLayout {
        public View b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, AttributeSet attributeSet, Context context2) {
            super(context, attributeSet);
            this.c = context2;
        }

        @Override // android.view.View
        public final void onVisibilityChanged(@NonNull View view, int i) {
            super.onVisibilityChanged(view, i);
            if (view != this) {
                return;
            }
            if (getChildCount() == 0 && i == 0) {
                if (this.b == null) {
                    this.b = AbstractPaginatedView.this.l.l(this.c);
                }
                addView(this.b);
            }
            View view2 = this.b;
            if (view2 != null) {
                view2.setVisibility(i);
            }
        }
    }

    public class b implements xa80 {
        public b() {
        }

        @Override // xsna.xa80
        public final void b() {
            gzs<s3q0> gzsVar;
            AbstractPaginatedView abstractPaginatedView = AbstractPaginatedView.this;
            t96 t96Var = abstractPaginatedView.h;
            if ((t96Var == null || !t96Var.c()) && (gzsVar = abstractPaginatedView.f) != null) {
                gzsVar.invoke();
            }
        }
    }

    public class c implements xa80 {
        public c() {
        }

        @Override // xsna.xa80
        public final void b() {
            gzs<s3q0> gzsVar = AbstractPaginatedView.this.g;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public static class d {
        public final LayoutType a;
        public final AbstractPaginatedView b;
        public int c = 1;
        public g d = null;
        public GridLayoutManager.c e = null;
        public int f = 1;

        public d(LayoutType layoutType, AbstractPaginatedView abstractPaginatedView) {
            this.a = layoutType;
            this.b = abstractPaginatedView;
        }

        public final void a() {
            this.b.setLayoutManagerFromBuilder(this);
        }

        public final void b() {
            this.f = 1;
        }

        public final void c(int i) {
            this.c = i;
            this.d = null;
        }

        public final void d(g gVar) {
            this.c = 0;
            this.d = gVar;
        }

        public final void e(GridLayoutManager.c cVar) {
            this.e = cVar;
        }
    }

    public interface e {
        void b(int i);
    }

    public interface f {
        @NonNull
        View l(Context context);
    }

    public interface g {
        int c(int i);
    }

    public static class j {
        public final int a;
        public final View[] b;

        public j(int i, View... viewArr) {
            this.a = i;
            this.b = viewArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || j.class != obj.getClass()) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && Arrays.equals(this.b, jVar.b);
        }

        public final int hashCode() {
            return (Objects.hash(Integer.valueOf(this.a)) * 31) + Arrays.hashCode(this.b);
        }
    }

    public interface k {
    }

    public class l extends FrameLayout {
        public l(@NonNull Context context) {
            super(context, null);
        }

        @Override // android.view.View
        public final void onVisibilityChanged(@NonNull View view, int i) {
            e eVar;
            if (view != this || (eVar = AbstractPaginatedView.this.s) == null) {
                return;
            }
            eVar.b(i);
        }
    }

    public AbstractPaginatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void Fe() {
        p(1, this.e, this.c, this.b, this.d);
        l();
    }

    @Override // xsna.too0
    public void Ng() {
        if (this.r != 0) {
            this.c.setBackgroundColor(krv0.m(this.r, getContext()));
        }
    }

    public final void b(@NonNull View.OnTouchListener onTouchListener) {
        if (this.q == null) {
            this.q = new ArrayList(1);
        }
        this.q.add(onTouchListener);
    }

    public View c(Context context, AttributeSet attributeSet) {
        DefaultEmptyView defaultEmptyView = new DefaultEmptyView(context, attributeSet);
        defaultEmptyView.a();
        defaultEmptyView.setLayoutParams(e());
        return defaultEmptyView;
    }

    public ee d(Context context, AttributeSet attributeSet) {
        DefaultErrorView defaultErrorView = new DefaultErrorView(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        if (obtainStyledAttributes.hasValue(0)) {
            int g2 = krv0.g("vk_errorBackgroundColor", attributeSet);
            this.r = g2;
            defaultErrorView.setBackgroundColor(krv0.m(g2, context));
        }
        if (obtainStyledAttributes.getBoolean(1, false)) {
            getResources();
            defaultErrorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        } else {
            defaultErrorView.setLayoutParams(e());
        }
        obtainStyledAttributes.recycle();
        return defaultErrorView;
    }

    public FrameLayout.LayoutParams e() {
        return new FrameLayout.LayoutParams(-2, -2, 17);
    }

    public void e0() {
        j();
        p(1, this.b, this.e, this.c, this.d);
    }

    public void f0() {
        j();
        p(1, this.e, this.c, this.b, this.d);
        i iVar = this.p;
        if (iVar != null) {
            iVar.b();
        }
    }

    public void fj(@Nullable Throwable th, @Nullable gxp gxpVar) {
        j();
        if (gxpVar != null) {
            by2 c2 = gxpVar.c(th);
            if (gxpVar instanceof qtl) {
                ((qtl) gxpVar).d(this.c, th, this.f);
            } else {
                ee eeVar = this.c;
                Context context = getContext();
                int i2 = c2.a;
                if (i2 <= 0) {
                    i2 = R.string.vk_common_network_error;
                }
                eeVar.setMessage(context.getString(i2));
                this.c.setRetryBtnVisible(c2.b);
                final izs<Context, s3q0> izsVar = c2.c;
                if (izsVar != null) {
                    this.c.setRetryClickListener(new xa80() { // from class: xsna.cg
                        @Override // xsna.xa80
                        public final void b() {
                            int i3 = AbstractPaginatedView.v;
                            izsVar.invoke(AbstractPaginatedView.this.getContext());
                        }
                    });
                } else {
                    this.c.setRetryClickListener(this.t);
                }
            }
        } else {
            this.c.b();
        }
        t96 t96Var = this.h;
        if (t96Var != null) {
            t96Var.a();
        }
        p(1, this.c, this.b, this.e, this.d);
        i iVar = this.p;
        if (iVar != null) {
            iVar.d(th);
        }
    }

    public FrameLayout.LayoutParams g() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public void g0() {
        fj(null, null);
    }

    public abstract c.i getDataInfoProvider();

    public View getEmptyView() {
        return this.d;
    }

    @Nullable
    public ee getErrorView() {
        return this.c;
    }

    public gzs<s3q0> getLoadNextRetryClickListener() {
        return this.g;
    }

    public gzs<s3q0> getReloadRetryClickListener() {
        return this.f;
    }

    public final void gl() {
        i iVar = this.p;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public View h(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_view_default_loading, (ViewGroup) null);
        l lVar = new l(context);
        lVar.addView(inflate);
        lVar.setLayoutParams(e());
        return lVar;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public void lb() {
        p(1, this.e, this.c, this.b, this.d);
        m();
    }

    public abstract void m();

    public void n(Context context, AttributeSet attributeSet, int i2) {
        View c2 = c(context, attributeSet);
        this.d = c2;
        c2.setVisibility(8);
        addView(this.d);
        ee d2 = d(context, attributeSet);
        this.c = d2;
        d2.setVisibility(8);
        this.c.setRetryClickListener(this.t);
        addView(this.c);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e = frameLayout;
        frameLayout.addView(q(context, attributeSet), g());
        this.e.setVisibility(8);
        addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        a aVar = new a(context, attributeSet, context);
        this.b = aVar;
        aVar.setVisibility(8);
        addView(this.b);
    }

    public final d o(LayoutType layoutType) {
        return new d(layoutType, this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList = this.q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((View.OnTouchListener) arrayList.get(i2)).onTouch(this, motionEvent)) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void p(int i2, View... viewArr) {
        j jVar = this.n;
        j jVar2 = new j(i2, viewArr);
        this.n = jVar2;
        if (jVar == null || !jVar.equals(jVar2)) {
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Iterator it = Arrays.asList(viewArr).subList(0, i2).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(0);
            }
            for (View view : Arrays.asList(viewArr).subList(i2, viewArr.length)) {
                view.setVisibility((this.o && view == this.e) ? 4 : 8);
            }
        }
    }

    public abstract View q(Context context, @Nullable AttributeSet attributeSet);

    /* JADX WARN: Multi-variable type inference failed */
    public void qg(@Nullable whp whpVar) {
        j();
        View view = this.d;
        if (view instanceof fe90) {
            fe90 fe90Var = (fe90) view;
            if (whpVar != null) {
                fe90Var.setText(whpVar.a());
            } else {
                fe90Var.a();
            }
        } else if (whpVar instanceof ptl) {
            ((ptl) whpVar).i(view);
        }
        i iVar = this.p;
        if (iVar == null || iVar.a()) {
            p(1, this.d, this.e, this.c, this.b);
        } else {
            p(1, this.e, this.d, this.c, this.b);
        }
        i iVar2 = this.p;
        if (iVar2 != null) {
            iVar2.c();
        }
    }

    public void r(@Nullable Throwable th) {
        fj(th, null);
    }

    public void setCatalogEventHandler(t96 t96Var) {
        this.h = t96Var;
    }

    public void setFooterEmptyViewProvider(h6s h6sVar) {
        this.k = h6sVar;
    }

    public void setFooterErrorViewProvider(n6s n6sVar) {
        this.i = n6sVar;
    }

    public void setFooterLoadingViewProvider(x6s x6sVar) {
        this.j = x6sVar;
    }

    public abstract void setItemDecoration(RecyclerView.n nVar);

    public abstract void setLayoutManagerFromBuilder(d dVar);

    public void setLoaderVisibilityChangeListener(@Nullable e eVar) {
        this.s = eVar;
    }

    public void setLoadingViewContentProvider(@NonNull f fVar) {
        this.l = fVar;
    }

    public void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
        this.g = gzsVar;
    }

    public void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
        this.f = gzsVar;
    }

    public abstract void setSwipeRefreshEnabled(boolean z);

    public void setUiStateCallbacks(@Nullable i iVar) {
        this.p = iVar;
    }

    public void t() {
        p(1, this.e, this.c, this.b, this.d);
        k();
    }

    public AbstractPaginatedView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = n6s.a;
        this.j = x6s.a;
        this.k = h6s.a;
        this.l = new j7(this, 1);
        this.m = null;
        this.n = null;
        this.o = false;
        this.r = 0;
        this.s = null;
        this.t = new b();
        this.u = new c();
        n(context, attributeSet, i2);
    }

    public static class i {
        public boolean a() {
            return !(this instanceof hda0);
        }

        public void b() {
        }

        public void c() {
        }

        public void d(@Nullable Throwable th) {
        }
    }

    public static abstract class h {
        public void a(@Nullable Integer num) {
        }

        public void b(boolean z) {
        }

        public void c(SwipeDrawableRefreshLayout.g gVar) {
        }

        public void d(d2e0 d2e0Var) {
        }

        public void e(boolean z) {
        }
    }

    public void setVisibilityChangingAnimationProvider(@NonNull k kVar) {
    }
}
