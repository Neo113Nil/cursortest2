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
public final class f extends b {
    public long k;
    public long l;
    public int m;
    public final n n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b3 serverConfigStorageProvider, String urlBase, long j, long j2, String str, int i, c requestInitiatedBy) {
        super(new com.braze.requests.util.d(urlBase + "content_cards/sync"), str, serverConfigStorageProvider, requestInitiatedBy);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
        this.k = j;
        this.l = j2;
        this.m = i;
        this.n = n.d;
    }

    public static final String l() {
        return "Experienced JSONException while creating Content Cards request. Returning null.";
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
            b.put("last_full_sync_at", this.l);
            b.put("last_card_updated_at", this.k);
            String str = this.b;
            if (str != null && !StringsKt.isBlank(str)) {
                b.put("user_id", this.b);
            }
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.f$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.n;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-ContentCardsRequest", "true");
        existingHeaders.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.m));
    }
}
