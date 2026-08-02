package com.vk.music.player.cache;

import androidx.media3.datasource.cache.Cache;
import com.vk.di.component.DiScopedComponent;
import com.vk.music.player.cache.a;
import xsna.pwj0;

/* compiled from: MusicPlayerCacheComponent.kt */
/* loaded from: classes3.dex */
public interface MusicPlayerCacheComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicPlayerCacheComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicPlayerCacheComponent STUB = new MusicPlayerCacheComponent() { // from class: com.vk.music.player.cache.MusicPlayerCacheComponent$Companion$STUB$1
            public final a.b a = a.b.a;

            @Override // com.vk.music.player.cache.MusicPlayerCacheComponent
            public final Cache getCache() {
                return null;
            }

            @Override // com.vk.music.player.cache.MusicPlayerCacheComponent
            public final a v0() {
                return this.a;
            }
        };

        public final MusicPlayerCacheComponent getSTUB() {
            return STUB;
        }
    }

    Cache getCache();

    a v0();
}
