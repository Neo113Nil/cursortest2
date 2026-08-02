package com.braze.requests;

import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class l extends b {
    public final com.braze.models.outgoing.event.b k;
    public final n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b3 serverConfigStorageProvider, String urlBase, com.braze.models.outgoing.event.b geofenceEvent) {
        super(new com.braze.requests.util.d(urlBase + "geofence/report"), (String) null, serverConfigStorageProvider, 10);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
        this.k = geofenceEvent;
        this.l = n.j;
    }

    public static final String l() {
        return "Experienced JSONException while creating geofence report request.Returning null.";
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
            b.put("geofence_event", this.k.getJsonKey());
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.l$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.l();
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
