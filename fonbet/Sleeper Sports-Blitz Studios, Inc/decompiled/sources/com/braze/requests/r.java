package com.braze.requests;

import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class r extends b {
    public final ArrayList k;
    public final boolean l;
    public final n m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b3 serverConfigStorageProvider, String urlBase, String str, ArrayList pushDeliveryEvents) {
        super(new com.braze.requests.util.d(urlBase + "push/delivery_events"), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(pushDeliveryEvents, "pushDeliveryEvents");
        this.k = pushDeliveryEvents;
        this.l = pushDeliveryEvents.isEmpty();
        this.m = n.h;
    }

    public static final String d() {
        return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return this.l;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject b = super.b();
        if (b == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                aVar.e.setValue(aVar, com.braze.models.outgoing.event.b.h[0], this.b);
                jSONArray.put(aVar.getJsonKey());
            }
            b.put("events", jSONArray);
            String str = this.b;
            if (str != null && !StringsKt.isBlank(str)) {
                b.put("user_id", this.b);
            }
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.r$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return r.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.m;
    }
}
