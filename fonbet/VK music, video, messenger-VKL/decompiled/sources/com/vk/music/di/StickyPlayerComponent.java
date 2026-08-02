package com.vk.music.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.gwd0;
import xsna.nwy;
import xsna.qcy;
import xsna.y84;

/* compiled from: StickyPlayerComponent.kt */
/* loaded from: classes3.dex */
public final class StickyPlayerComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(StickyPlayerComponent.class, "stickerBannerVisibilityListener", "getStickerBannerVisibilityListener()Lcom/vk/music/stickybannerad/StickyBannerVisibilityListener;", 0), fp.c(0, StickyPlayerComponent.class, "musicPlayerRepository", "getMusicPlayerRepository()Lcom/vk/music/player/data/MusicPlayerRepository;", fpf0.a)};
    public final nwy a = new nwy(new y84(27));
    public final nwy b = new nwy(new gwd0(6));

    /* compiled from: StickyPlayerComponent.kt */
    public static final class a implements b7m<StickyPlayerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new StickyPlayerComponent();
        }
    }
}
