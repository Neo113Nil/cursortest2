package com.braze.requests;

import com.braze.managers.d1;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class x extends b {
    public final ArrayList k;
    public final n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b3 serverConfigStorageProvider, String urlBase, String str, ArrayList logs) {
        super(new com.braze.requests.util.d(urlBase + "debugger/log", true), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.k = logs;
        this.l = n.n;
    }

    public static final String d() {
        return "Experienced JSONException while creating SDK Debugger Log request. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return this.k.isEmpty();
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
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                com.braze.models.o oVar = (com.braze.models.o) it.next();
                oVar.getClass();
                jSONArray.put(new JSONObject().put("log", oVar.f638a).put(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, oVar.b));
            }
            b.put("data", new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put("data", jSONArray)));
            return b;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.E, (Throwable) e, true, new Function0() { // from class: com.braze.requests.x$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.d();
                }
            });
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.l;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, final com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: com.braze.requests.x$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x.a(com.braze.models.response.d.this);
            }
        }, 3, (Object) null);
        ((com.braze.events.d) internalPublisher).b(new com.braze.events.internal.t(new d1()), com.braze.events.internal.t.class);
    }

    public static final String a(com.braze.models.response.d dVar) {
        return "SDK Debugger Log Request failed " + dVar.a() + ". Disabling SDK Debugger.";
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-Rec-Auth-Code", this.c.y());
    }
}
