package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicOwner;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.e3;
import xsna.fl4;
import xsna.gzs;
import xsna.jai;
import xsna.k7a;
import xsna.maz;
import xsna.mut0;
import xsna.qdz;
import xsna.s3q0;

/* compiled from: ComposeMusicOwnerVh.kt */
/* loaded from: classes16.dex */
public final class ComposeMusicOwnerVh implements CatalogViewHolder {
    public final b5a b;
    public final k7a c;
    public final fl4 d;
    public final qdz e;
    public ComposeView f;
    public UIBlockMusicOwner g;

    /* compiled from: ComposeMusicOwnerVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ComposeMusicOwnerVh.a((ComposeMusicOwnerVh) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: ComposeMusicOwnerVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ComposeView composeView;
            Context context;
            UIBlockMusicOwner uIBlockMusicOwner;
            ComposeMusicOwnerVh composeMusicOwnerVh = (ComposeMusicOwnerVh) this.receiver;
            composeMusicOwnerVh.getClass();
            if (!bwt0.c(400L) && (composeView = composeMusicOwnerVh.f) != null && (context = composeView.getContext()) != null && (uIBlockMusicOwner = composeMusicOwnerVh.g) != null) {
                composeMusicOwnerVh.d.l(context, String.valueOf(uIBlockMusicOwner.y.g));
            }
            return s3q0.a;
        }
    }

    /* compiled from: ComposeMusicOwnerVh.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ComposeMusicOwnerVh.a((ComposeMusicOwnerVh) this.receiver);
            return s3q0.a;
        }
    }

    public ComposeMusicOwnerVh(b5a b5aVar, k7a k7aVar, fl4 fl4Var, qdz qdzVar) {
        this.b = b5aVar;
        this.c = k7aVar;
        this.d = fl4Var;
        this.e = qdzVar;
    }

    public static final void a(ComposeMusicOwnerVh composeMusicOwnerVh) {
        ComposeView composeView;
        Context context;
        UIBlockMusicOwner uIBlockMusicOwner;
        composeMusicOwnerVh.getClass();
        if (bwt0.c(400L) || (composeView = composeMusicOwnerVh.f) == null || (context = composeView.getContext()) == null || (uIBlockMusicOwner = composeMusicOwnerVh.g) == null) {
            return;
        }
        composeMusicOwnerVh.b.a(new cfp0(uIBlockMusicOwner, null));
        maz e = composeMusicOwnerVh.e.e();
        String str = uIBlockMusicOwner.y.e;
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = uIBlockMusicOwner.f;
        maz.c(e, context, str, aVar.a(), null, null, 24);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockMusicOwner uIBlockMusicOwner = uIBlock instanceof UIBlockMusicOwner ? (UIBlockMusicOwner) uIBlock : null;
        if (uIBlockMusicOwner == null) {
            return;
        }
        this.g = uIBlockMusicOwner;
        ComposeView composeView = this.f;
        if (composeView != null) {
            composeView.setContent(new jai(-757792850, new e3(7, uIBlockMusicOwner, this), true));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = (ComposeView) layoutInflater.inflate(R.layout.catalog_music_owner_cell, viewGroup, false);
        composeView.setViewCompositionStrategy(mut0.c.a);
        this.f = composeView;
        return composeView;
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
