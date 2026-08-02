package com.vk.catalog2.common.ui.mvp.holder.group;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.group.GroupsCollectionHeaderVh;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.feature.music.holders.artist.MusicArtistErrorStateVh;
import com.vk.core.serialize.Serializer;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.bnn0;
import xsna.ef2;
import xsna.f5z;
import xsna.flu;
import xsna.g3a;
import xsna.j5g;
import xsna.ltz;
import xsna.nda;
import xsna.o5a;
import xsna.rda;
import xsna.swp;
import xsna.u4a;

/* compiled from: GroupsCollectionCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class GroupsCollectionCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, rda, CatalogStatesViewHolder {
    public final g3a p;
    public final ViewPagerVh q;
    public final SwitchCatalogVh r;
    public final GroupsCollectionHeaderVh s;

    public GroupsCollectionCatalogRootVh() {
        throw null;
    }

    public GroupsCollectionCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        u4a u4aVar = this.m;
        this.p = u4aVar.b.s.S(u4aVar, null);
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.q = viewPagerVh;
        this.r = new SwitchCatalogVh(viewPagerVh, null, new MusicArtistErrorStateVh(this, new flu(this, 1)), null, null, R.layout.catalog_frame_layout_with_scrolling, null, null, false, false, null, 2010);
        u4a u4aVar2 = this.m;
        this.s = new GroupsCollectionHeaderVh(u4aVar2.c.a, u4aVar2.b.f);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.r.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList<UIBlock> arrayList;
        if (uIBlock instanceof UIBlockCatalog) {
            Object a0 = j5g.a0(((UIBlockCatalog) uIBlock).A);
            UIBlockList uIBlockList = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
            Serializer.StreamParcelableAdapter streamParcelableAdapter = (uIBlockList == null || (arrayList = uIBlockList.y) == null) ? null : (UIBlock) j5g.a0(arrayList);
            UIBlockGroupsCollection uIBlockGroupsCollection = streamParcelableAdapter instanceof UIBlockGroupsCollection ? (UIBlockGroupsCollection) streamParcelableAdapter : null;
            if (uIBlockGroupsCollection != null) {
                this.s.N6(uIBlockGroupsCollection);
            }
            this.r.N6(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_groups_collection_page, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        viewGroup2.addView(this.s.k5(layoutInflater, viewGroup2, null), 0);
        SwitchCatalogVh switchCatalogVh = this.r;
        viewGroup2.addView(switchCatalogVh.k5(layoutInflater, viewGroup2, null), 1);
        switchCatalogVh.i8(ltz.a);
        viewGroup2.post(new ef2(this, 10));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.r.L();
        this.p.b();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.r.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.r.i8(bnn0Var);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.r.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.q.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        this.m.b.b.c(false);
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
