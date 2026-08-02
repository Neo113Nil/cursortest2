package com.vk.catalog2.feature.music.holders.audiobook;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBooksAccessStatus;
import com.vk.music.common.MusicPlaybackLaunchContext;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.cfp0;
import xsna.fc;
import xsna.fl4;
import xsna.gzs;
import xsna.jai;
import xsna.jjc;
import xsna.msy;
import xsna.mut0;
import xsna.s3q0;
import xsna.vj4;
import xsna.xd0;

/* compiled from: ComposeAudioBookSliderVh.kt */
/* loaded from: classes16.dex */
public final class ComposeAudioBookSliderVh implements CatalogViewHolder {
    public final b5a b;
    public final fl4 c;
    public final boolean d;
    public final boolean e;
    public ComposeView f;
    public UIBlockAudioBookItem g;
    public final Object h;

    /* compiled from: ComposeAudioBookSliderVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ComposeAudioBookSliderVh.a((ComposeAudioBookSliderVh) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: ComposeAudioBookSliderVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ComposeAudioBookSliderVh.a((ComposeAudioBookSliderVh) this.receiver);
            return s3q0.a;
        }
    }

    public /* synthetic */ ComposeAudioBookSliderVh(b5a b5aVar, fl4 fl4Var, boolean z) {
        this(b5aVar, fl4Var, z, false);
    }

    public static final void a(ComposeAudioBookSliderVh composeAudioBookSliderVh) {
        ComposeView composeView;
        Context context;
        UIBlockAudioBookItem uIBlockAudioBookItem;
        composeAudioBookSliderVh.getClass();
        if (jjc.c(400L) || (composeView = composeAudioBookSliderVh.f) == null || (context = composeView.getContext()) == null || (uIBlockAudioBookItem = composeAudioBookSliderVh.g) == null) {
            return;
        }
        composeAudioBookSliderVh.b.a(new cfp0(uIBlockAudioBookItem, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
        composeAudioBookSliderVh.c.s(context, uIBlockAudioBookItem.y.b, MusicPlaybackLaunchContext.Fb(uIBlockAudioBookItem.b).Cb(uIBlockAudioBookItem.p.h()));
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockAudioBookItem) {
            UIBlockAudioBookItem uIBlockAudioBookItem = (UIBlockAudioBookItem) uIBlock;
            AudioBook audioBook = uIBlockAudioBookItem.y;
            this.g = uIBlockAudioBookItem;
            vj4 vj4Var = new vj4(audioBook.c, this.e ? null : audioBook.Db(), audioBook.j, audioBook.s == AudioBooksAccessStatus.FREE && !((Boolean) this.h.getValue()).booleanValue(), this.d);
            ComposeView composeView = this.f;
            if (composeView != null) {
                composeView.setContent(new jai(1656253311, new xd0(3, vj4Var, this), true));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
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

    public ComposeAudioBookSliderVh(b5a b5aVar, fl4 fl4Var, boolean z, boolean z2) {
        this.b = b5aVar;
        this.c = fl4Var;
        this.d = z;
        this.e = z2;
        this.h = msy.a(LazyThreadSafetyMode.NONE, new fc(9));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
