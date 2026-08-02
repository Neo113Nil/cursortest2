package com.vk.photogallery;

import androidx.annotation.Keep;
import com.vungle.ads.internal.protos.Sdk;
import xsna.izs;
import xsna.q4t;
import xsna.svz;
import xsna.zcl;

/* compiled from: LocalGalleryProvider.kt */
@Keep
/* loaded from: classes4.dex */
public final class LocalPhotoGalleryProvider extends LocalGalleryProvider {
    /* JADX WARN: Multi-variable type inference failed */
    public LocalPhotoGalleryProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(q4t q4tVar) {
        return true;
    }

    public /* synthetic */ LocalPhotoGalleryProvider(izs izsVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? new svz(0) : izsVar);
    }

    public LocalPhotoGalleryProvider(izs<? super q4t, Boolean> izsVar) {
        super(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, izsVar);
    }
}
