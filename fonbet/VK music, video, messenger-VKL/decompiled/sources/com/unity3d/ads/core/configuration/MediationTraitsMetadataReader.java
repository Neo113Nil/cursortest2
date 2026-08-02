package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: MediationTraitsMetadataReader.kt */
/* loaded from: classes14.dex */
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";
    public static final Companion Companion = new Companion(null);
    public static final String MEDIATION_TRAITS = "mediation.traits.value";
    public static final String USE_HTTP_CLIENT = "useHttpClient";

    /* compiled from: MediationTraitsMetadataReader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MediationTraitsMetadataReader(JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean getBooleanTrait(String str) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(str)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Boolean.valueOf(jSONObject.optBoolean(str));
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getStringTrait(String str) {
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(str)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return jSONObject.optString(str);
            }
        }
        return null;
    }
}
