package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.music.clips.MusicClipsCatalogConfiguration$createViewHolderImpl$2$listVh$1;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.el6;
import xsna.fpf0;
import xsna.jwp0;
import xsna.op1;
import xsna.pgn;
import xsna.qcy;
import xsna.u4a;

/* compiled from: ClipsMusicCatalogShowAllListVh.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicCatalogShowAllListVh extends ShowAllListVh {
    public static final /* synthetic */ qcy<Object>[] x;
    public UIBlock v;
    public final pgn w;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsMusicCatalogShowAllListVh.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        x = new qcy[]{mutablePropertyReference1Impl};
    }

    public ClipsMusicCatalogShowAllListVh(u4a u4aVar, ToolbarVh toolbarVh, MusicClipsCatalogConfiguration$createViewHolderImpl$2$listVh$1 musicClipsCatalogConfiguration$createViewHolderImpl$2$listVh$1, UIBlock uIBlock) {
        super(u4aVar, toolbarVh, musicClipsCatalogConfiguration$createViewHolderImpl$2$listVh$1, false, false, false, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        this.v = uIBlock;
        pgn pgnVar = new pgn();
        this.w = pgnVar;
        io.reactivex.rxjava3.disposables.c subscribe = u4aVar.b.e.a().b0(jwp0.class).subscribe(new el6(new op1(this, 26), 11));
        qcy<Object> qcyVar = x[0];
        pgnVar.b(subscribe);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        qcy<Object> qcyVar = x[0];
        this.w.b(null);
        super.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.v = uIBlock;
        super.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        k5.setBackgroundColor(layoutInflater.getContext().getColor(R.color.vk_gray_900));
        return k5;
    }
}
