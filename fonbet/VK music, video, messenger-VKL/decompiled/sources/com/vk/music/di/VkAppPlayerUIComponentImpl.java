package com.vk.music.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c550;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.k55;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u94;
import xsna.zza0;

/* compiled from: VkAppPlayerUIComponentImpl.kt */
/* loaded from: classes.dex */
public final class VkAppPlayerUIComponentImpl extends DefaultPlayerUIComponentImpl {
    public static final /* synthetic */ qcy<Object>[] k = {new PropertyReference1Impl(VkAppPlayerUIComponentImpl.class, "playerConfig", "getPlayerConfig()Lcom/vk/music/player/api/PlayerConfig;", 0), fp.c(0, VkAppPlayerUIComponentImpl.class, "musicScreenController", "getMusicScreenController()Lcom/vk/music/player/informer/MusicScreenController;", fpf0.a)};
    public final nwy i = new nwy(new k55(16));
    public final nwy j = new nwy(new u94(16));

    /* compiled from: VkAppPlayerUIComponentImpl.kt */
    public static final class a implements c8m<PlayerUIComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkAppPlayerUIComponentImpl();
        }
    }

    @Override // com.vk.music.di.DefaultPlayerUIComponentImpl, com.vk.music.player.api.di.PlayerUIComponent
    public final c550 Ne() {
        qcy<Object> qcyVar = k[1];
        return (c550) this.j.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.music.di.DefaultPlayerUIComponentImpl, com.vk.music.player.api.di.PlayerUIComponent
    public final zza0 Ra() {
        qcy<Object> qcyVar = k[0];
        return (zza0) this.i.c();
    }
}
