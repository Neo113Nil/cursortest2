package com.vk.catalog2.common.ui.mvp.holder.header;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.search.VkSearchView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.d02;
import xsna.ecm;
import xsna.ekh;
import xsna.fms;
import xsna.gt;
import xsna.jt;
import xsna.k0j;
import xsna.kms;
import xsna.kn9;
import xsna.m20;
import xsna.mxj;
import xsna.n20;
import xsna.o7;
import xsna.orl;
import xsna.tbh;
import xsna.w2o0;
import xsna.wzh;

/* compiled from: FriendsSearchQueryVh.kt */
/* loaded from: classes16.dex */
public final class FriendsSearchQueryVh implements CatalogViewHolder {
    public final wzh b;
    public final ecm c;
    public final ekh d;
    public final fms e;
    public final kms f;
    public io.reactivex.rxjava3.disposables.c g;
    public VkSearchView h;

    public FriendsSearchQueryVh(wzh wzhVar, ecm ecmVar, ekh ekhVar, fms fmsVar, kms kmsVar) {
        this.b = wzhVar;
        this.c = ecmVar;
        this.d = ekhVar;
        this.e = fmsVar;
        this.f = kmsVar;
    }

    public static void b(FriendsSearchQueryVh friendsSearchQueryVh, String str) {
        VkSearchView vkSearchView = friendsSearchQueryVh.h;
        if (vkSearchView == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = friendsSearchQueryVh.g;
        if (cVar != null) {
            cVar.dispose();
        }
        vkSearchView.setQuery(str);
        friendsSearchQueryVh.g = friendsSearchQueryVh.a(vkSearchView);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = null;
    }

    public final io.reactivex.rxjava3.disposables.c a(VkSearchView vkSearchView) {
        return d02.y(vkSearchView, 0L, 3).U(new o7(new gt(23), 16)).y(500L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m20(new k0j(this, 17), 22), new n20(new jt(25), 27));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.friends_anim_search_view, viewGroup, false);
        VkSearchView vkSearchView = null;
        VkSearchView vkSearchView2 = inflate instanceof VkSearchView ? (VkSearchView) inflate : null;
        if (vkSearchView2 != null) {
            vkSearchView2.setOnBackClickListener(new tbh(this, 18));
            this.g = a(vkSearchView2);
            vkSearchView2.setVoiceInputEnabled(true);
            orl.a(vkSearchView2);
            vkSearchView2.setOnVoiceInputListener(this.d);
            vkSearchView2.setOnActionSearchQueryClick(new kn9(this, 3));
            vkSearchView2.U4();
            vkSearchView2.setSecondaryActionListener(new mxj(this, 17));
            vkSearchView2.j5(w2o0.a.a(R.drawable.vk_icon_filter_24, R.string.talkback_ic_search_params));
            vkSearchView2.X4(false);
            vkSearchView2.h5(true, true);
            vkSearchView = vkSearchView2;
        }
        this.h = vkSearchView;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
