package com.vk.music.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.md40;
import xsna.od40;

/* compiled from: MusicCatalogSectionIdProviderComponent.kt */
/* loaded from: classes3.dex */
public interface MusicCatalogSectionIdProviderComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicCatalogSectionIdProviderComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final MusicCatalogSectionIdProviderComponent getSTUB() {
            return new MusicCatalogSectionIdProviderComponent() { // from class: com.vk.music.api.di.MusicCatalogSectionIdProviderComponent$Companion$STUB$1

                /* compiled from: MusicCatalogSectionIdProviderComponent.kt */
                public static final class a implements md40 {
                    @Override // xsna.md40
                    public final String V() {
                        return null;
                    }
                }

                @Override // com.vk.music.api.di.MusicCatalogSectionIdProviderComponent
                public final md40 A9() {
                    return new a();
                }

                @Override // com.vk.music.api.di.MusicCatalogSectionIdProviderComponent
                public final od40 dd() {
                    return new b();
                }

                /* compiled from: MusicCatalogSectionIdProviderComponent.kt */
                public static final class b implements od40 {
                    @Override // xsna.od40
                    public final void a(String str) {
                    }
                }
            };
        }
    }

    md40 A9();

    od40 dd();
}
