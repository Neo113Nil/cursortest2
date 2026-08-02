package com.vk.photogallery;

import androidx.annotation.Keep;
import xsna.izs;
import xsna.q4t;
import xsna.v4v;
import xsna.zcl;

/* compiled from: LocalGalleryProvider.kt */
@Keep
/* loaded from: classes4.dex */
public final class LocalMediaGalleryProvider extends LocalGalleryProvider {
    /* JADX WARN: Multi-variable type inference failed */
    public LocalMediaGalleryProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(q4t q4tVar) {
        return true;
    }

    public /* synthetic */ LocalMediaGalleryProvider(izs izsVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? new v4v(5) : izsVar);
    }

    public LocalMediaGalleryProvider(izs<? super q4t, Boolean> izsVar) {
        super(111, izsVar);
    }
}
