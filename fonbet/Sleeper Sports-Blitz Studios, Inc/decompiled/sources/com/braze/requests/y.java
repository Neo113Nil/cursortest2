package com.braze.requests;

import com.braze.events.internal.g0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class y extends b {
    public final com.braze.triggers.actions.f k;
    public final com.braze.triggers.events.b l;
    public final n m;
    public final String n;
    public final long o;
    public final long p;
    public final com.braze.triggers.actions.f q;
    public final com.braze.models.outgoing.k r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b3 serverConfigStorageProvider, String urlBase, com.braze.triggers.actions.f templatedTriggeredAction, com.braze.triggers.events.b triggerEvent, String str) {
        super(new com.braze.requests.util.d(urlBase + SDKConstants.PARAM_UPDATE_TEMPLATE), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.k = templatedTriggeredAction;
        this.l = triggerEvent;
        this.m = n.g;
        this.n = templatedTriggeredAction.f();
        int i = templatedTriggeredAction.d().e;
        this.o = i == -1 ? TimeUnit.SECONDS.toMillis(r3.d + 30) : i;
        this.p = templatedTriggeredAction.g();
        this.q = templatedTriggeredAction;
        this.r = new com.braze.models.outgoing.j().a(str).a();
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
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
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.n);
            jSONObject.put("trigger_event_type", this.l.a());
            com.braze.models.k kVar = ((com.braze.triggers.events.i) this.l).c;
            jSONObject.put("data", kVar != null ? ((com.braze.models.outgoing.event.b) kVar).getJsonKey() : null);
            b.put(SDKConstants.PARAM_UPDATE_TEMPLATE, jSONObject);
            String str = this.r.f645a;
            if (str != null && str.length() != 0) {
                b.put("respond_with", this.r.getJsonKey());
            }
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.y$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.m;
    }

    @Override // com.braze.requests.b
    public final String toString() {
        com.braze.triggers.actions.f fVar = this.k;
        com.braze.triggers.events.b bVar = this.l;
        return "TemplateRequest(templatedTriggeredAction=" + fVar + ", triggerEvent=" + bVar + ", triggerAnalyticsId='" + this.n + "', templatePayloadExpirationTimestamp=" + this.p + ", getTemplatedDataExpiration=" + (((com.braze.triggers.events.i) bVar).b + this.o) + "triggeredAction=" + this.q + ")";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        InAppMessageBase inAppMessageBase = apiResponse.g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.k.f));
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        if (responseError instanceof com.braze.models.response.b) {
            ((com.braze.events.d) internalPublisher).b(new g0(this.l, this.k), g0.class);
        }
    }
}
