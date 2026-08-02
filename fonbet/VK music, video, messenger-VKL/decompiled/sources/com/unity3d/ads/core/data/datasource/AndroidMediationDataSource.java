package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.misc.JsonStorage;
import xsna.zcl;

/* compiled from: AndroidMediationDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidMediationDataSource implements MediationDataSource {
    public static final Companion Companion = new Companion(null);
    private static final String MEDIATION_NAME = "name";
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    private static final String MEDIATION_VALUE = "value";
    private static final String MEDIATION_VERSION = "version";
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    private final JsonStorage storage;

    /* compiled from: AndroidMediationDataSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidMediationDataSource(JsonStorage jsonStorage) {
        this.storage = jsonStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getName() {
        return (String) this.storage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    public String getVersion() {
        return (String) this.storage.get(MEDIATION_VERSION_KEY);
    }
}
