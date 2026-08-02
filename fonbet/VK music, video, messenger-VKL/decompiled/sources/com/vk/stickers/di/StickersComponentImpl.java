package com.vk.stickers.di;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.stickers.api.di.StickersComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.g9l0;
import xsna.lva0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s5m0;
import xsna.w2l0;

/* compiled from: StickersComponentImpl.kt */
/* loaded from: classes6.dex */
public final class StickersComponentImpl implements StickersComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(StickersComponentImpl.class, "linkStickerInfoFactory", "getLinkStickerInfoFactory()Lcom/vk/stickers/api/models/link/StoryLinkStickerInfoFactory;", 0), fp.c(0, StickersComponentImpl.class, "stickerColorsFactory", "getStickerColorsFactory()Lcom/vk/stickers/api/styles/StickerColorsFactory;", fpf0.a)};
    public final Context a;
    public final BridgeComponent b;
    public final nwy c = new nwy(new lva0(this, 20));
    public final nwy d = new nwy(new g9l0(0));

    /* compiled from: StickersComponentImpl.kt */
    public static final class a implements c8m<StickersComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StickersComponentImpl(this.a, (BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class)));
        }
    }

    public StickersComponentImpl(Context context, BridgeComponent bridgeComponent) {
        this.a = context;
        this.b = bridgeComponent;
    }

    @Override // com.vk.stickers.api.di.StickersComponent
    public final w2l0 bc() {
        qcy<Object> qcyVar = e[1];
        return (w2l0) this.d.c();
    }

    @Override // com.vk.stickers.api.di.StickersComponent
    public final s5m0 zc() {
        qcy<Object> qcyVar = e[0];
        return (s5m0) this.c.c();
    }
}
