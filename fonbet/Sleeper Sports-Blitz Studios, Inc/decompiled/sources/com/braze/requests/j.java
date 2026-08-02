package com.braze.requests;

import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class j extends b {
    public final n k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b3 serverConfigStorageProvider, String urlBase, String str) {
        super(new com.braze.requests.util.d(urlBase + "feature_flags/sync"), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.k = n.e;
    }

    public static final String l() {
        return "Experienced JSONException while creating Feature Flags request. Returning null.";
    }

    public static final String m() {
        return "FeatureFlagsSyncRequest failed.";
    }

    public static final String n() {
        return "FeatureFlagsSyncRequest executed successfully.";
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
            String str = this.b;
            if (str != null && !StringsKt.isBlank(str)) {
                b.put("user_id", this.b);
            }
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.j$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.k;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.j$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.n();
            }
        }, 7, (Object) null);
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.k(this), com.braze.events.internal.k.class);
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.requests.j$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.m();
            }
        }, 6, (Object) null);
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
