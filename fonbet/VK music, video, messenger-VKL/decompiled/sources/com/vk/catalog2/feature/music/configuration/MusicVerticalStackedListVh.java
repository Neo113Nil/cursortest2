package com.vk.catalog2.feature.music.configuration;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard;
import com.vk.catalog2.feature.music.holders.view.MusicCatalogRecyclerPaginatedView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.e3m;
import xsna.g750;
import xsna.gzs;
import xsna.j5g;
import xsna.k840;
import xsna.mzp0;
import xsna.n9;
import xsna.o2k0;
import xsna.p2k0;
import xsna.qni0;
import xsna.rs0;
import xsna.s3q0;
import xsna.swe0;
import xsna.tba;
import xsna.u4a;
import xsna.zr80;

/* compiled from: MusicVerticalStackedListVh.kt */
/* loaded from: classes16.dex */
public final class MusicVerticalStackedListVh extends VerticalListVh implements o2k0 {
    public final com.vk.catalog2.common.ui.mvp.util.a G;
    public final g750 H;
    public final p2k0 I;
    public zr80 J;
    public RecyclerPaginatedView K;
    public UIBlock L;

    /* compiled from: MusicVerticalStackedListVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((tba) this.receiver).o();
            return s3q0.a;
        }
    }

    /* compiled from: MusicVerticalStackedListVh.kt */
    public static final class b extends GridLayoutManager.c {
        public final /* synthetic */ int e;

        public b(int i) {
            this.e = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            MusicVerticalStackedListVh musicVerticalStackedListVh = MusicVerticalStackedListVh.this;
            UIBlock uIBlock = (UIBlock) j5g.b0(i, musicVerticalStackedListVh.h.d);
            int i2 = this.e;
            if (uIBlock == null) {
                return i2;
            }
            musicVerticalStackedListVh.H.getClass();
            return swe0.g(1, 1, i2);
        }
    }

    public MusicVerticalStackedListVh(com.vk.catalog2.common.ui.mvp.util.a aVar, com.vk.catalog2.feature.music.configuration.b bVar, c.h hVar, tba tbaVar, u4a u4aVar, g750 g750Var, p2k0 p2k0Var) {
        super(bVar, hVar, tbaVar, u4aVar, null, true, false, R.layout.catalog_music_list_vertical, bVar.A(CatalogConfiguration$Companion$ContainerType.VERTICAL, u4aVar), new VerticalListVh.a(null, null, null, 63));
        this.G = aVar;
        this.H = g750Var;
        this.I = p2k0Var;
    }

    @Override // xsna.o2k0
    public final void G(Integer num) {
        Context context;
        bpn0 bpn0Var = k840.a.a;
        if (k840.a.i.b() || num == null) {
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.K;
        Integer valueOf = (recyclerPaginatedView == null || (context = recyclerPaginatedView.getContext()) == null) ? null : Integer.valueOf(e3m.a(R.dimen.music_banner_ad_max_height, context));
        RecyclerPaginatedView recyclerPaginatedView2 = this.K;
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = recyclerPaginatedView2 instanceof CatalogRecyclerPaginatedView ? (CatalogRecyclerPaginatedView) recyclerPaginatedView2 : null;
        if (catalogRecyclerPaginatedView == null || valueOf == null) {
            return;
        }
        catalogRecyclerPaginatedView.setBottomInsetForScrollableContent(valueOf.intValue());
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.K = null;
        this.I.d(this);
        super.L();
        zr80 zr80Var = this.J;
        if (zr80Var != null) {
            zr80Var.setVisibility(8);
        }
        this.J = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var;
        super.N6(uIBlock);
        this.L = uIBlock;
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            UIBlock uIBlock2 = (UIBlock) j5g.a0(uIBlockList.y);
            if ((uIBlock2 != null ? uIBlock2.e : null) == CatalogDataType.DATA_TYPE_AUDIO_CONTENT_CARDS && uIBlock.d == CatalogViewType.LIST) {
                Object Y = j5g.Y(uIBlockList.y);
                UIBlockAudioContentCard uIBlockAudioContentCard = Y instanceof UIBlockAudioContentCard ? (UIBlockAudioContentCard) Y : null;
                if (uIBlockAudioContentCard != null) {
                    zr80 zr80Var = this.J;
                    if (zr80Var != null) {
                        UIBlockActionOpenUrl Pb = uIBlockAudioContentCard.Pb();
                        zr80Var.d = Pb;
                        ((TextView) zr80Var.findViewById(R.id.name)).setText(Pb != null ? Pb.z : null);
                        if (Pb != null) {
                            zr80Var.setVisibility(0);
                        }
                    }
                    zr80 zr80Var2 = this.J;
                    if (zr80Var2 != null) {
                        if (zr80Var2.getParent() != null) {
                            zr80Var2.setVisibility(0);
                        } else {
                            View view = zr80Var2.b;
                            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                            if (viewGroup != null) {
                                viewGroup.addView(zr80Var2, -1, -1);
                            }
                        }
                    }
                }
                mzp0Var = this.p.b;
                if (mzp0Var == null) {
                    mzp0Var.d(l());
                    return;
                }
                return;
            }
        }
        zr80 zr80Var3 = this.J;
        if (zr80Var3 != null) {
            zr80Var3.setVisibility(8);
        }
        mzp0Var = this.p.b;
        if (mzp0Var == null) {
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView;
        if (viewGroup != null && (rootView = viewGroup.getRootView()) != null) {
            this.J = new zr80(rootView, new n9(18, this, viewGroup));
        }
        this.I.M(this, this);
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) k5.findViewById(R.id.paginated_list);
        this.K = recyclerPaginatedView;
        if (recyclerPaginatedView instanceof MusicCatalogRecyclerPaginatedView) {
            MusicCatalogRecyclerPaginatedView musicCatalogRecyclerPaginatedView = (MusicCatalogRecyclerPaginatedView) recyclerPaginatedView;
            musicCatalogRecyclerPaginatedView.setOnRetryClick(new a(0, this.p, tba.class, "reload", "reload()V", 0));
            musicCatalogRecyclerPaginatedView.setOnActionClick(new rs0(11, this, k5));
            musicCatalogRecyclerPaginatedView.U = e3m.a(R.dimen.catalog_tab_2_layout_height, k5.getContext()) + e3m.a(R.dimen.catalog_music_search_query_height, k5.getContext());
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        mzp0 mzp0Var;
        super.onResume();
        RecyclerPaginatedView l = l();
        if (l == null || (mzp0Var = this.p.b) == null) {
            return;
        }
        mzp0Var.e(l);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh
    public final void p(UIBlockList uIBlockList) {
        if (this.H.S(uIBlockList)) {
            RecyclerPaginatedView recyclerPaginatedView = this.n;
            if (recyclerPaginatedView == null) {
                recyclerPaginatedView = null;
            }
            q(recyclerPaginatedView);
        }
        super.p(uIBlockList);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh
    public final void q(AbstractPaginatedView abstractPaginatedView) {
        int spanCount = this.H.getSpanCount();
        if (spanCount < 2) {
            super.q(abstractPaginatedView);
            return;
        }
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, abstractPaginatedView);
        dVar.f = 1;
        dVar.c(spanCount);
        dVar.e = new b(spanCount);
        dVar.a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        String str;
        super.y(uiTrackingScreen);
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.AUDIO_CATALOG;
        long a2 = qni0.a();
        UIBlock uIBlock = this.L;
        String str2 = uIBlock != null ? uIBlock.c : null;
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        if (str2 == null) {
            UIBlock uIBlock2 = this.L;
            String str3 = uIBlock2 != null ? uIBlock2.b : null;
            if (str3 != null) {
                str = str3;
                uiTrackingScreen.a(new CommonAudioStat$TypeAudioDomainEventItem(a2, new CommonStat$TypeCommonEventItem(null, null, null, str, 7, null), null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED, null));
            }
            str2 = this.p.f();
        }
        str = str2;
        uiTrackingScreen.a(new CommonAudioStat$TypeAudioDomainEventItem(a2, new CommonStat$TypeCommonEventItem(null, null, null, str, 7, null), null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED, null));
    }
}
