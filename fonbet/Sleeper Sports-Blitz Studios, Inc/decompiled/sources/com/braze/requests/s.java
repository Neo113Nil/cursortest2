package com.braze.requests;

import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.facebook.appevents.internal.AppLinkManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class s extends b {
    public final ArrayList k;
    public final long l;
    public final List m;
    public final n n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b3 serverConfigStorageProvider, String urlBase, String str, ArrayList campaignIds, long j, List dedupeIds) {
        super(new com.braze.requests.util.d(urlBase + "push/redeliver"), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        Intrinsics.checkNotNullParameter(dedupeIds, "dedupeIds");
        this.k = campaignIds;
        this.l = j;
        this.m = dedupeIds;
        this.n = n.k;
    }

    public static final String l() {
        return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
    }

    public static final String m() {
        return "PushMaxSendRequest executed successfully.";
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
            b.put(AppLinkManager.CAMPAIGN_IDS_KEY, new JSONArray((Collection) this.k));
            b.put("last_sync_at", this.l);
            if (!this.m.isEmpty()) {
                b.put("dedupe_ids", new JSONArray((Collection) this.m));
            }
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.s$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.n;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.s$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.m();
            }
        }, 7, (Object) null);
        long j = apiResponse.o;
        if (j != -1) {
            ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.p(j), com.braze.events.internal.p.class);
        }
    }
}
