package com.vk.music.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.music.api.di.MusicCatalogSectionIdProviderComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.md40;
import xsna.nd40;
import xsna.od40;

/* compiled from: MusicCatalogSectionIdProviderComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicCatalogSectionIdProviderComponentImpl implements MusicCatalogSectionIdProviderComponent {

    /* compiled from: MusicCatalogSectionIdProviderComponentImpl.kt */
    public static final class a implements b7m<MusicCatalogSectionIdProviderComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MusicCatalogSectionIdProviderComponentImpl();
        }
    }

    @Override // com.vk.music.api.di.MusicCatalogSectionIdProviderComponent
    public final md40 A9() {
        return nd40.a;
    }

    @Override // com.vk.music.api.di.MusicCatalogSectionIdProviderComponent
    public final od40 dd() {
        return nd40.a;
    }
}
