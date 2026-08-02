package com.vk.catalog2.feature.music.holders.podcast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastItem;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.Podcast;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.c5g;
import xsna.cfp0;
import xsna.e3m;
import xsna.fc1;
import xsna.gzs;
import xsna.ijb0;
import xsna.jai;
import xsna.jjc;
import xsna.mut0;
import xsna.qdz;
import xsna.qow;
import xsna.s3q0;

/* compiled from: ComposePodcastSliderVh.kt */
/* loaded from: classes16.dex */
public final class ComposePodcastSliderVh implements CatalogViewHolder {
    public final qdz b;
    public final b5a c;
    public final boolean d;
    public ComposeView e;
    public UIBlockPodcastItem f;

    /* compiled from: ComposePodcastSliderVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ComposeView composeView;
            Context context;
            Activity h;
            UIBlockPodcastItem uIBlockPodcastItem;
            ComposePodcastSliderVh composePodcastSliderVh = (ComposePodcastSliderVh) this.receiver;
            composePodcastSliderVh.getClass();
            if (!jjc.c(400L) && (composeView = composePodcastSliderVh.e) != null && (context = composeView.getContext()) != null && (h = e3m.h(context)) != null && (uIBlockPodcastItem = composePodcastSliderVh.f) != null) {
                LaunchContext launchContext = new LaunchContext(false, false, false, uIBlockPodcastItem.f, uIBlockPodcastItem.p.h(), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108839);
                composePodcastSliderVh.c.a(new cfp0(uIBlockPodcastItem, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
                composePodcastSliderVh.b.e().d(h, Uri.parse(uIBlockPodcastItem.y.d()), launchContext, null);
            }
            return s3q0.a;
        }
    }

    public ComposePodcastSliderVh(qdz qdzVar, b5a b5aVar, boolean z) {
        this.b = qdzVar;
        this.c = b5aVar;
        this.d = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.e = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPodcastItem) {
            UIBlockPodcastItem uIBlockPodcastItem = (UIBlockPodcastItem) uIBlock;
            this.f = uIBlockPodcastItem;
            Podcast podcast = uIBlockPodcastItem.y;
            boolean z = podcast.h;
            String str = podcast.d;
            if (str == null) {
                str = "";
            }
            String str2 = podcast.i;
            if (str2 == null) {
                str2 = "";
            }
            Iterable iterable = podcast.f;
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(new qow((Thumb) it.next()));
            }
            ijb0 ijb0Var = new ijb0(str, str2, arrayList, z, this.d);
            ComposeView composeView = this.e;
            if (composeView != null) {
                composeView.setContent(new jai(-185281776, new fc1(3, ijb0Var, this), true));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setViewCompositionStrategy(mut0.c.a);
        this.e = composeView;
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
