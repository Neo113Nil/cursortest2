package com.braze.requests;

import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class h extends b {
    public final n k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b3 serverConfigStorageProvider, String urlBase, String str) {
        super(new com.braze.requests.util.d(urlBase + "dust/config"), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.k = n.o;
    }

    public static final String l() {
        return "Experienced JSONException while creating DUST config request. Returning null.";
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.h$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.k;
    }
}
