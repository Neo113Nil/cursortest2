package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import xsna.zcl;

/* compiled from: MediationInitBlobMetadataReader.kt */
/* loaded from: classes14.dex */
public final class MediationInitBlobMetadataReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion(null);
    public static final String MEDIATION_UADS_INIT_BLOB = "mediation.uads_init_blob.value";

    /* compiled from: MediationInitBlobMetadataReader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MediationInitBlobMetadataReader(JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_UADS_INIT_BLOB);
    }
}
