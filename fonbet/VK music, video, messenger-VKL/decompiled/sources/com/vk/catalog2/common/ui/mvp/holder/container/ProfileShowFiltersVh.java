package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.n0;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.bij0;
import xsna.bjc;
import xsna.bwt0;
import xsna.drm0;
import xsna.fpf0;
import xsna.iah0;
import xsna.izs;
import xsna.kfv;
import xsna.pgn;
import xsna.qcy;
import xsna.qzd0;
import xsna.s3q0;
import xsna.u4a;
import xsna.uzp;
import xsna.w110;
import xsna.wd8;
import xsna.y1a;
import xsna.y6t0;
import xsna.y730;
import xsna.zyu;

/* compiled from: ProfileShowFiltersVh.kt */
/* loaded from: classes16.dex */
public final class ProfileShowFiltersVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] j;
    public final u4a b;
    public final HorizontalListVh c;
    public UIBlockFilter2D d;
    public View e;
    public View f;
    public VkSubnavigationButton g;
    public final pgn h = new pgn();
    public final qzd0 i = new qzd0(this);

    /* compiled from: View.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ UIBlock b;
        public final /* synthetic */ ProfileShowFiltersVh c;

        public a(UIBlock uIBlock, ProfileShowFiltersVh profileShowFiltersVh) {
            this.b = uIBlock;
            this.c = profileShowFiltersVh;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((UIBlockFilter2D) this.b).y.j == null) {
                return;
            }
            ProfileShowFiltersVh profileShowFiltersVh = this.c;
            if (profileShowFiltersVh.g != null) {
                profileShowFiltersVh.b.b.r.getClass();
            }
        }
    }

    /* compiled from: ProfileShowFiltersVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            Context context;
            UIBlockFilter2D uIBlockFilter2D;
            UIBlockList uIBlockList;
            View view2 = view;
            ProfileShowFiltersVh profileShowFiltersVh = (ProfileShowFiltersVh) this.receiver;
            qcy<Object>[] qcyVarArr = ProfileShowFiltersVh.j;
            profileShowFiltersVh.getClass();
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new n0(), 2)).q();
            if (view2 != null && (context = view2.getContext()) != null && (uIBlockFilter2D = profileShowFiltersVh.d) != null && (uIBlockList = uIBlockFilter2D.y) != null) {
                u4a.a aVar = profileShowFiltersVh.b.b;
                new bij0.a(context, new bij0.a.C2610a(uIBlockList, aVar.f, aVar.e)).I0(null);
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ProfileShowFiltersVh.class, "iconDisposable", "getIconDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        j = new qcy[]{mutablePropertyReference1Impl};
    }

    public ProfileShowFiltersVh(y6t0 y6t0Var, c.h hVar, y1a y1aVar, u4a u4aVar) {
        this.b = u4aVar;
        this.c = new HorizontalListVh(y6t0Var, hVar, y1aVar, u4aVar, null, y6t0Var.A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c.getClass();
        this.g = null;
        this.d = null;
        qcy<Object> qcyVar = j[0];
        this.h.b(null);
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
            VkSubnavigationButton vkSubnavigationButton = this.g;
            if (uIBlockActionFilter != null) {
                CatalogFilterData catalogFilterData = uIBlockActionFilter.z;
                if (vkSubnavigationButton != null) {
                    String str = catalogFilterData.i;
                    vkSubnavigationButton.setLabel((str == null || drm0.N(str)) ? catalogFilterData.c : catalogFilterData.i);
                    VkSubnavigationButton vkSubnavigationButton2 = this.g;
                    if (vkSubnavigationButton2 != null) {
                        io.reactivex.rxjava3.disposables.c subscribe = uzp.j(vkSubnavigationButton2.getResources(), catalogFilterData.d, catalogFilterData.f, iah0.a(16)).subscribe(new zyu(new w110(vkSubnavigationButton2, 18), 22), new y730(new wd8(L.a, 13), 8));
                        qcy<Object> qcyVar = j[0];
                        this.h.b(subscribe);
                    }
                }
            }
            VkSubnavigationButton vkSubnavigationButton3 = this.g;
            if (vkSubnavigationButton3 != null) {
                vkSubnavigationButton3.postDelayed(new a(uIBlock, this), 300L);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.catalog_profile_show_filters, viewGroup, false);
        View k5 = this.c.k5(layoutInflater, constraintLayout, bundle);
        this.f = constraintLayout.findViewById(R.id.horizontal_filters_gradient);
        View findViewById = constraintLayout.findViewById(R.id.horizontal_filters_separator);
        this.e = findViewById;
        if (findViewById != null) {
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
        }
        kfv kfvVar = k5 instanceof kfv ? (kfv) k5 : null;
        RecyclerView recyclerView = kfvVar != null ? kfvVar.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.i);
        }
        VkSubnavigationButton vkSubnavigationButton = (VkSubnavigationButton) constraintLayout.findViewById(R.id.horizontal_filters_show_btn);
        bwt0.i0(vkSubnavigationButton, new b(1, this, ProfileShowFiltersVh.class, "onShowFilterClicked", "onShowFilterClicked(Landroid/view/View;)V", 0));
        vkSubnavigationButton.setMode(SubnavigationButton.Mode.Outline);
        vkSubnavigationButton.setAppearance(SubnavigationButton.Appearance.Neutral);
        vkSubnavigationButton.setSize(SubnavigationButton.Size.Small);
        this.g = vkSubnavigationButton;
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
