package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.c;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.n0;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.b9s0;
import xsna.bij0;
import xsna.bjc;
import xsna.bwt0;
import xsna.drm0;
import xsna.fpf0;
import xsna.izs;
import xsna.kfv;
import xsna.nev;
import xsna.pgn;
import xsna.qcy;
import xsna.s3q0;
import xsna.u4a;
import xsna.uzp;
import xsna.y1a;

/* compiled from: HorizontalListShowFiltersVh.kt */
/* loaded from: classes16.dex */
public final class HorizontalListShowFiltersVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] j;
    public final u4a b;
    public final HorizontalListVh c;
    public UIBlockFilter2D d;
    public View e;
    public View f;
    public CheckedTextView g;
    public final pgn h = new pgn();
    public final nev i = new nev(this);

    /* compiled from: View.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ UIBlock b;
        public final /* synthetic */ HorizontalListShowFiltersVh c;

        public a(UIBlock uIBlock, HorizontalListShowFiltersVh horizontalListShowFiltersVh) {
            this.b = uIBlock;
            this.c = horizontalListShowFiltersVh;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((UIBlockFilter2D) this.b).y.j == null) {
                return;
            }
            HorizontalListShowFiltersVh horizontalListShowFiltersVh = this.c;
            if (horizontalListShowFiltersVh.g != null) {
                horizontalListShowFiltersVh.b.b.r.getClass();
            }
        }
    }

    /* compiled from: HorizontalListShowFiltersVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            Context context;
            UIBlockFilter2D uIBlockFilter2D;
            UIBlockList uIBlockList;
            View view2 = view;
            HorizontalListShowFiltersVh horizontalListShowFiltersVh = (HorizontalListShowFiltersVh) this.receiver;
            qcy<Object>[] qcyVarArr = HorizontalListShowFiltersVh.j;
            horizontalListShowFiltersVh.getClass();
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new n0(), 2)).q();
            if (view2 != null && (context = view2.getContext()) != null && (uIBlockFilter2D = horizontalListShowFiltersVh.d) != null && (uIBlockList = uIBlockFilter2D.y) != null) {
                u4a.a aVar = horizontalListShowFiltersVh.b.b;
                new bij0.a(context, new bij0.a.C2610a(uIBlockList, aVar.f, aVar.e)).I0(null);
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(HorizontalListShowFiltersVh.class, "iconDisposable", "getIconDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        j = new qcy[]{mutablePropertyReference1Impl};
    }

    public HorizontalListShowFiltersVh(b9s0 b9s0Var, c.h hVar, y1a y1aVar, u4a u4aVar) {
        this.b = u4aVar;
        this.c = new HorizontalListVh(b9s0Var, hVar, y1aVar, u4aVar, null, b9s0Var.A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c.getClass();
        this.g = null;
        this.d = null;
        qcy<Object>[] qcyVarArr = j;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.h;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlock uIBlock2;
        if (uIBlock instanceof UIBlockFilter2D) {
            UIBlockFilter2D uIBlockFilter2D = (UIBlockFilter2D) uIBlock;
            this.d = uIBlockFilter2D;
            this.c.N6(uIBlockFilter2D.z);
            Iterator<UIBlock> it = uIBlockFilter2D.y.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uIBlock2 = null;
                    break;
                }
                uIBlock2 = it.next();
                if ((uIBlock2 instanceof UIBlockActionFilter) && ((UIBlockActionFilter) uIBlock2).z.e) {
                    break;
                }
            }
            UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) uIBlock2;
            CheckedTextView checkedTextView = this.g;
            if (uIBlockActionFilter != null && checkedTextView != null) {
                CatalogFilterData catalogFilterData = uIBlockActionFilter.z;
                String str = catalogFilterData.i;
                checkedTextView.setText((str == null || drm0.N(str)) ? catalogFilterData.c : catalogFilterData.i);
                if (checkedTextView.getCompoundDrawables().length == 0 || checkedTextView.getCompoundDrawables()[0] == null) {
                    io.reactivex.rxjava3.disposables.c c = uzp.c(checkedTextView, uIBlockActionFilter);
                    qcy<Object> qcyVar = j[0];
                    this.h.b(c);
                }
            }
            CheckedTextView checkedTextView2 = this.g;
            if (checkedTextView2 != null) {
                checkedTextView2.postDelayed(new a(uIBlock, this), 300L);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.catalog_horizontal_list_show_filters, viewGroup, false);
        View k5 = this.c.k5(layoutInflater, constraintLayout, bundle);
        this.f = constraintLayout.findViewById(R.id.horizontal_filters_gradient);
        View findViewById = constraintLayout.findViewById(R.id.horizontal_filters_separator);
        this.e = findViewById;
        k5.setId(View.generateViewId());
        k5.getLayoutParams().width = 0;
        constraintLayout.addView(k5, 0);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.l(k5.getId(), 3, constraintLayout.getId(), 3, 0);
        bVar.l(k5.getId(), 4, constraintLayout.getId(), 4, 0);
        bVar.l(k5.getId(), 7, constraintLayout.getId(), 7, 0);
        bVar.l(k5.getId(), 6, findViewById.getId(), 7, 0);
        bVar.b(constraintLayout);
        kfv kfvVar = k5 instanceof kfv ? (kfv) k5 : null;
        RecyclerView recyclerView = kfvVar != null ? kfvVar.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.i);
        }
        CheckedTextView checkedTextView = (CheckedTextView) constraintLayout.findViewById(R.id.horizontal_filters_show_btn);
        this.g = checkedTextView;
        if (checkedTextView != null) {
            bwt0.i0(checkedTextView, new b(1, this, HorizontalListShowFiltersVh.class, "onShowFilterClicked", "onShowFilterClicked(Landroid/view/View;)V", 0));
        }
        return constraintLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
