package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.fkq0;
import xsna.g06;
import xsna.gzs;
import xsna.jai;
import xsna.mut0;
import xsna.o0r0;
import xsna.s3q0;

/* compiled from: ComposeMusicCuratorVh.kt */
/* loaded from: classes16.dex */
public final class ComposeMusicCuratorVh implements CatalogViewHolder {
    public final b5a b;
    public final o0r0 c;
    public ComposeView d;
    public UIBlockGroup e;

    /* compiled from: ComposeMusicCuratorVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ComposeView composeView;
            Context context;
            UIBlockGroup uIBlockGroup;
            ComposeMusicCuratorVh composeMusicCuratorVh = (ComposeMusicCuratorVh) this.receiver;
            composeMusicCuratorVh.getClass();
            if (!bwt0.c(400L) && (composeView = composeMusicCuratorVh.d) != null && (context = composeView.getContext()) != null && (uIBlockGroup = composeMusicCuratorVh.e) != null) {
                Group group = uIBlockGroup.y;
                composeMusicCuratorVh.b.a(new cfp0(uIBlockGroup, new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.OpenOwner)));
                composeMusicCuratorVh.c.m(context, fkq0.e(group.c), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            }
            return s3q0.a;
        }
    }

    public ComposeMusicCuratorVh(b5a b5aVar, o0r0 o0r0Var) {
        this.b = b5aVar;
        this.c = o0r0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockGroup uIBlockGroup = uIBlock instanceof UIBlockGroup ? (UIBlockGroup) uIBlock : null;
        if (uIBlockGroup == null) {
            return;
        }
        this.e = uIBlockGroup;
        ComposeView composeView = this.d;
        if (composeView != null) {
            composeView.setContent(new jai(-1914190450, new g06(1, uIBlockGroup, this), true));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = (ComposeView) layoutInflater.inflate(R.layout.catalog_compose_curator, viewGroup, false);
        composeView.setViewCompositionStrategy(mut0.c.a);
        this.d = composeView;
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
