package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import xsna.zcl;

/* compiled from: UniversalRequestWorkerData.kt */
/* loaded from: classes14.dex */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    /* compiled from: UniversalRequestWorkerData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public UniversalRequestWorkerData(String str) {
        this.universalRequestId = str;
    }

    public final Data invoke() {
        Data.a aVar = new Data.a();
        aVar.a.put(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId);
        return aVar.a();
    }
}
