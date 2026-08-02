package com.vk.catalog2.feature.music.holders.di;

import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.di.component.DiUnscopedComponent;
import xsna.fpf0;
import xsna.rfc;

/* compiled from: MusicCatalogComponent.kt */
/* loaded from: classes16.dex */
public interface MusicCatalogComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicCatalogComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicCatalogComponent STUB = new MusicCatalogComponent() { // from class: com.vk.catalog2.feature.music.holders.di.MusicCatalogComponent$Companion$STUB$1
            @Override // com.vk.catalog2.feature.music.holders.di.MusicCatalogComponent
            public final rfc Jd() {
                return fpf0.a(CatalogViewHolder.class);
            }
        };

        public final MusicCatalogComponent getSTUB() {
            return STUB;
        }
    }

    rfc Jd();
}
