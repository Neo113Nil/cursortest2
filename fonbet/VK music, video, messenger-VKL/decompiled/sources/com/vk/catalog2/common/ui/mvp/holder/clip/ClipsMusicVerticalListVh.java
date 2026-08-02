package com.vk.catalog2.common.ui.mvp.holder.clip;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.lists.c;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.io1;
import xsna.jwp0;
import xsna.kea;
import xsna.pgn;
import xsna.qcy;
import xsna.u4a;
import xsna.ul1;
import xsna.wia;

/* compiled from: ClipsMusicVerticalListVh.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicVerticalListVh extends VerticalListVh {
    public static final /* synthetic */ qcy<Object>[] I;
    public UIBlock G;
    public final pgn H;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsMusicVerticalListVh.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        I = new qcy[]{mutablePropertyReference1Impl};
    }

    public ClipsMusicVerticalListVh() {
        throw null;
    }

    public ClipsMusicVerticalListVh(CatalogConfiguration catalogConfiguration, c.h hVar, kea keaVar, u4a u4aVar, wia wiaVar) {
        super(catalogConfiguration, hVar, keaVar, u4aVar, wiaVar, false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, 832);
        this.G = null;
        pgn pgnVar = new pgn();
        this.H = pgnVar;
        io.reactivex.rxjava3.disposables.c subscribe = u4aVar.b.e.a().b0(jwp0.class).subscribe(new io1(new ul1(this, 26), 20));
        qcy<Object> qcyVar = I[0];
        pgnVar.b(subscribe);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        qcy<Object> qcyVar = I[0];
        this.H.b(null);
        super.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.G = uIBlock;
        super.N6(uIBlock);
    }
}
