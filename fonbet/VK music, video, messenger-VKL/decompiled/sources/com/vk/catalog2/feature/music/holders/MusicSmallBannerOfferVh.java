package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.design.view.subscription.MusicSubscriptionBannerView;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.maz;
import xsna.xwk;

/* compiled from: MusicSmallBannerOfferVh.kt */
/* loaded from: classes16.dex */
public final class MusicSmallBannerOfferVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public MusicSubscriptionBannerView c;
    public UIBlockLink d;

    public MusicSmallBannerOfferVh(b5a b5aVar) {
        this.b = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockLink uIBlockLink = uIBlock instanceof UIBlockLink ? (UIBlockLink) uIBlock : null;
        if (uIBlockLink == null) {
            return;
        }
        CatalogLink catalogLink = uIBlockLink.y;
        MusicSubscriptionBannerView musicSubscriptionBannerView = this.c;
        if (musicSubscriptionBannerView == null) {
            musicSubscriptionBannerView = null;
        }
        musicSubscriptionBannerView.setTitle(catalogLink.c);
        MusicSubscriptionBannerView musicSubscriptionBannerView2 = this.c;
        if (musicSubscriptionBannerView2 == null) {
            musicSubscriptionBannerView2 = null;
        }
        musicSubscriptionBannerView2.setSubtitle(catalogLink.d);
        MusicSubscriptionBannerView musicSubscriptionBannerView3 = this.c;
        (musicSubscriptionBannerView3 != null ? musicSubscriptionBannerView3 : null).setAnimationUrl(catalogLink.k);
        this.d = uIBlockLink;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MusicSubscriptionBannerView musicSubscriptionBannerView = new MusicSubscriptionBannerView(layoutInflater.getContext(), null, 0, 14, 0);
        this.c = musicSubscriptionBannerView;
        musicSubscriptionBannerView.setOnClickListener(new c98(this, 1));
        if (!musicSubscriptionBannerView.isAttachedToWindow()) {
            musicSubscriptionBannerView.addOnAttachStateChangeListener(new a(musicSubscriptionBannerView, musicSubscriptionBannerView));
            return musicSubscriptionBannerView;
        }
        ViewParent parent = musicSubscriptionBannerView.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return musicSubscriptionBannerView;
        }
        viewGroup2.setClipChildren(false);
        return musicSubscriptionBannerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        UIBlockLink uIBlockLink = this.d;
        CatalogLink catalogLink = uIBlockLink != null ? uIBlockLink.y : null;
        if (uIBlockLink == null || catalogLink == null) {
            return;
        }
        this.b.a(new cfp0(uIBlockLink, null));
        maz.c(xwk.d().e(), view.getContext(), catalogLink.e, LaunchContext.A, null, null, 24);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    /* compiled from: View.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ MusicSubscriptionBannerView b;
        public final /* synthetic */ MusicSubscriptionBannerView c;

        public a(MusicSubscriptionBannerView musicSubscriptionBannerView, MusicSubscriptionBannerView musicSubscriptionBannerView2) {
            this.b = musicSubscriptionBannerView;
            this.c = musicSubscriptionBannerView2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            ViewParent parent = this.c.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setClipChildren(false);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
