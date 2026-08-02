package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.SearchModeActionStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.ModernSearchView;
import com.vk.toggle.features.SearchFeatures;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.List;
import xsna.alj;
import xsna.ayn0;
import xsna.b1z;
import xsna.bpn0;
import xsna.e43;
import xsna.emh0;
import xsna.g3a;
import xsna.gzs;
import xsna.j5g;
import xsna.jw80;
import xsna.ozf0;
import xsna.qda;
import xsna.rl3;
import xsna.s3q0;
import xsna.u4a;
import xsna.x550;

/* compiled from: ShowAllListVh.kt */
/* loaded from: classes16.dex */
public class ShowAllListVh extends SectionWithSearchListVh implements CatalogPaginatedListViewHolder {
    public final u4a i;
    public final TopBarVh j;
    public final CatalogPaginatedListViewHolder k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final CatalogSearchQueryViewHolder o;
    public ayn0 p;
    public final g3a q;
    public final bpn0 r;
    public final SwitchCatalogVh s;
    public final HidingToolbarVh t;
    public io.reactivex.rxjava3.disposables.c u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShowAllListVh(u4a u4aVar, TopBarVh topBarVh, CatalogPaginatedListViewHolder catalogPaginatedListViewHolder, boolean z, boolean z2, boolean z3, CatalogSearchQueryViewHolder catalogSearchQueryViewHolder, int i) {
        super(u4aVar, catalogPaginatedListViewHolder, null, r3);
        boolean z4;
        SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
        boolean z5 = (i & 32) != 0 ? false : z;
        boolean z6 = (i & 64) != 0 ? false : z2;
        if ((i & 128) != 0) {
            SearchFeatures searchFeatures = SearchFeatures.SEARCH_VIDEO_HISTORY;
            searchFeatures.getClass();
            z4 = com.vk.toggle.b.A.a(searchFeatures);
        } else {
            z4 = z3;
        }
        CatalogSearchQueryViewHolder catalogSearchQueryViewHolder2 = (i & 256) != 0 ? null : catalogSearchQueryViewHolder;
        this.i = u4aVar;
        this.j = topBarVh;
        this.k = catalogPaginatedListViewHolder;
        this.l = z5;
        this.m = z6;
        this.n = z4;
        this.o = catalogSearchQueryViewHolder2;
        u4a.a aVar = u4aVar.b;
        this.q = aVar.s.S(u4aVar, null);
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new x550(this, 24));
        this.r = new bpn0(new b1z(this, 28));
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(catalogPaginatedListViewHolder, this.e, errorStateVh, this.f, this, 0, null, null, false, false, u4aVar.c.g, 992);
        this.s = switchCatalogVh;
        this.t = new HidingToolbarVh(aVar.e, rl3.I(new CatalogViewHolder[]{topBarVh, c()}), switchCatalogVh, null);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.s.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final void Bl(boolean z) {
        this.k.Bl(z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final void Cm(Integer num) {
        this.k.Cm(num);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        this.t.L();
        ayn0 ayn0Var = this.p;
        if (ayn0Var != null) {
            ayn0Var.a();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
        this.u = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void N5(UIBlock uIBlock) {
        this.k.N5(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        boolean z;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock2;
        boolean z2 = this.m;
        HidingToolbarVh hidingToolbarVh = this.t;
        if (z2) {
            hidingToolbarVh.N6(uIBlock);
        } else {
            if (!this.l) {
                List l = e43.l(CatalogViewType.DOUBLE_LIST, CatalogViewType.DOUBLE_STACKED_LIST);
                CatalogViewType catalogViewType = null;
                UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                if (uIBlockList != null && (arrayList = uIBlockList.y) != null && (uIBlock2 = (UIBlock) j5g.a0(arrayList)) != null) {
                    catalogViewType = uIBlock2.d;
                }
                if (!j5g.P(l, catalogViewType)) {
                    z = false;
                    hidingToolbarVh.N6(uIBlock);
                    hidingToolbarVh.a(z);
                }
            }
            z = true;
            hidingToolbarVh.N6(uIBlock);
            hidingToolbarVh.a(z);
        }
        if (this.n) {
            d(uIBlock);
        }
        i8(alj.a);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final ayn0 Pa() {
        return this.k.Pa();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final void Pl(qda qdaVar) {
        this.k.Pl(qdaVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final com.vk.lists.c Wi(String str, boolean z, boolean z2, UIBlockList uIBlockList, boolean z3, gzs<s3q0> gzsVar, boolean z4) {
        return this.k.Wi(str, z, z2, uIBlockList, z3, gzsVar, z4);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SectionWithSearchListVh
    public final CatalogStatesViewHolder a() {
        return this.s;
    }

    public final CatalogSearchQueryViewHolder c() {
        return (CatalogSearchQueryViewHolder) this.r.getValue();
    }

    public final void d(UIBlock uIBlock) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        UIBlockActionSearchMode uIBlockActionSearchMode = uIBlockList != null ? uIBlockList.I : null;
        if (uIBlockActionSearchMode == null || uIBlockActionSearchMode.B.b != SearchModeActionStyle.Style.AfterToolbar) {
            CatalogSearchQueryViewHolder c = c();
            if (c != null) {
                c.hide();
                return;
            }
            return;
        }
        CatalogSearchQueryViewHolder c2 = c();
        if (c2 != null) {
            c2.show();
        }
        this.t.a(true);
        this.d.p = uIBlockActionSearchMode.z;
        this.u = ((f) this.i.b.d.b).subscribe(new jw80(new emh0(this, 2), 12));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public void dj(m.d dVar, List<? extends UIBlock> list, List<? extends UIBlock> list2, UIBlockList uIBlockList) {
        this.k.dj(dVar, list, list2, uIBlockList);
    }

    @Override // xsna.wca
    public final void g(int i, int i2) {
        this.k.g(i, i2);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final List<ozf0> gi() {
        return this.k.gi();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        HidingToolbarVh hidingToolbarVh = this.t;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, bundle);
        if (this.m) {
            hidingToolbarVh.j = true;
            hidingToolbarVh.a(hidingToolbarVh.i);
        } else {
            hidingToolbarVh.a(this.l);
            hidingToolbarVh.j = false;
        }
        this.j.R9(this);
        this.p = this.k.Pa();
        CatalogSearchQueryViewHolder c = c();
        if (c != null) {
            ModernSearchView pi = c.pi();
            if (pi != null) {
                pi.setVoiceIsAvailable(false);
            }
            c.hide();
        }
        return k5;
    }

    @Override // xsna.eca
    public final void n(EditorMode editorMode) {
        this.k.n(editorMode);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        ayn0 ayn0Var = this.p;
        if (ayn0Var != null) {
            ayn0Var.b();
        }
        this.t.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onPause() {
        this.k.onPause();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        this.k.onResume();
    }

    @Override // xsna.rda
    public final void s() {
        this.k.s();
    }

    @Override // xsna.rda
    public final void t() {
        this.k.t();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogListViewHolder
    public final qda td() {
        return this.k.td();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder
    public final void um() {
        this.k.um();
    }

    @Override // xsna.rda
    public final void x(int i) {
        this.k.x(i);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.t.getClass();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SectionWithSearchListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        this.k.yh(i, uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.SectionWithSearchListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return this.k.ze(rect);
    }
}
