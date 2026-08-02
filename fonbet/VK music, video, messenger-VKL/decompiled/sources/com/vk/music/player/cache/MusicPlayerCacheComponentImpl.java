package com.vk.music.player.cache;

import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.c;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ag20;
import xsna.c8m;
import xsna.ep;
import xsna.f5x;
import xsna.fn4;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: MusicPlayerCacheComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicPlayerCacheComponentImpl implements MusicPlayerCacheComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new f5x(this, 15));
    public final nwy b = new nwy(new ag20(this, 6));
    public final nwy c = new nwy(new fn4(24));

    /* compiled from: MusicPlayerCacheComponentImpl.kt */
    public static final class a implements c8m<MusicPlayerCacheComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicPlayerCacheComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicPlayerCacheComponentImpl.class, "cacheEvictor", "getCacheEvictor()Lcom/vk/music/player/cache/ResizableLeastRecentlyUsedCacheEvictor;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, MusicPlayerCacheComponentImpl.class, "cache", "getCache()Landroidx/media3/datasource/cache/SimpleCache;", hpf0Var), ep.a(0, MusicPlayerCacheComponentImpl.class, "contentPrefetchConfig", "getContentPrefetchConfig()Lcom/vk/music/player/cache/PrefetchConfig;", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.music.player.cache.MusicPlayerCacheComponent
    public final Cache getCache() {
        qcy<Object> qcyVar = d[1];
        return (c) this.b.c();
    }

    @Override // com.vk.music.player.cache.MusicPlayerCacheComponent
    public final com.vk.music.player.cache.a v0() {
        qcy<Object> qcyVar = d[2];
        return (com.vk.music.player.cache.a) this.c.c();
    }
}
