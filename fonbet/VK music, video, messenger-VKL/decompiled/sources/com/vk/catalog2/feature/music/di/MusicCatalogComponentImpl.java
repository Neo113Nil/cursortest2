package com.vk.catalog2.feature.music.di;

import com.vk.catalog2.feature.music.holders.di.MusicCatalogComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.rfc;

/* compiled from: MusicCatalogComponentImpl.kt */
/* loaded from: classes16.dex */
public final class MusicCatalogComponentImpl implements MusicCatalogComponent {

    /* compiled from: MusicCatalogComponentImpl.kt */
    public static final class a implements b7m<MusicCatalogComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MusicCatalogComponentImpl();
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.di.MusicCatalogComponent
    public final rfc Jd() {
        return fpf0.a(MusicCatalogRootVh.class);
    }
}
