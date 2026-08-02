package com.vk.im.ui.components.msg_search.vc;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.components.msg_search.vc.d;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.b0i0;
import xsna.drm0;
import xsna.hy30;
import xsna.j5g;
import xsna.mkr0;
import xsna.msy;
import xsna.rwh0;
import xsna.uw30;
import xsna.ux30;
import xsna.ye80;

/* compiled from: SingleTabMsgSearchPagerAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends ux30 {
    public final Object f;
    public uw30 g;
    public hy30 h;
    public Object i;

    public c(List<rwh0> list, mkr0 mkr0Var, LayoutInflater layoutInflater) {
        super(list, mkr0Var, layoutInflater);
        this.f = msy.a(LazyThreadSafetyMode.NONE, new ye80(layoutInflater, 17));
        this.h = new hy30(null, null, null, false, false, null, null, null, null, 16383);
        this.i = EmptyList.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // xsna.ux30
    public final void c(hy30 hy30Var) {
        this.h = hy30Var;
        this.i = ((d) this.f.getValue()).a(hy30Var, hy30Var.h, new d.a(2));
        b0i0 b0i0Var = (b0i0) this.e.get(0);
        if (b0i0Var != null) {
            d(b0i0Var, hy30Var, this.i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void d(b0i0 b0i0Var, hy30 hy30Var, List<? extends a> list) {
        if (b0i0Var == null) {
            return;
        }
        rwh0 rwh0Var = (rwh0) j5g.Y(this.b);
        if (hy30Var.h == SearchMode.MESSAGES) {
            uw30 uw30Var = this.g;
            uw30 uw30Var2 = uw30Var;
            if (uw30Var == null) {
                uw30Var2 = 0;
            }
            uw30Var2.o(this.i);
        }
        rwh0Var.f.setItems(list);
        rwh0Var.g = hy30Var.d;
        if (rwh0Var.a() || drm0.N(rwh0Var.g)) {
            b0i0Var.a();
        } else {
            b0i0Var.b();
        }
    }

    @Override // xsna.ux30, androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // xsna.ux30, androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        b0i0 b = b(0);
        if (this.b.get(0).c == SearchMode.MESSAGES) {
            uw30 uw30Var = new uw30(viewGroup.getContext());
            this.g = uw30Var;
            b.d.addItemDecoration(uw30Var);
        }
        d(b, this.h, this.i);
        return instantiateItem;
    }
}
