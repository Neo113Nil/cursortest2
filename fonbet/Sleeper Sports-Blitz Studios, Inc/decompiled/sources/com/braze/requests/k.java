package com.braze.requests;

import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class k extends b {
    public final com.braze.models.k k;
    public final n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b3 serverConfigStorageProvider, String urlBase, com.braze.models.k locationEvent, String str) {
        super(new com.braze.requests.util.d(urlBase + "geofence/request"), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(locationEvent, "locationEvent");
        this.k = locationEvent;
        this.l = n.i;
    }

    public static final String l() {
        return "Experienced JSONException while creating geofence refresh request. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject b = super.b();
        if (b == null) {
            return null;
        }
        try {
            b.put("location_event", ((com.braze.models.outgoing.event.b) this.k).getJsonKey());
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.k$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.l;
    }
}
