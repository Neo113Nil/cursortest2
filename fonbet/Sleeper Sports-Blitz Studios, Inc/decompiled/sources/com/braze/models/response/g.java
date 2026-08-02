package com.braze.models.response;

import com.braze.managers.d1;
import com.braze.managers.h1;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.requests.o;
import com.braze.requests.w;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mp4parser.boxes.threegpp.ts26244.AuthorBox;

/* loaded from: classes6.dex */
public final class g extends a {
    public final JSONObject c;
    public final d d;
    public final i e;
    public final c f;
    public final InAppMessageBase g;
    public final ArrayList h;
    public final m i;
    public final ArrayList j;
    public final JSONArray k;
    public final String l;
    public final String m;
    public final String n;
    public final long o;
    public final JSONObject p;
    public final d1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(o request, com.braze.communication.d connectionResult, r brazeManager) {
        super(request, connectionResult);
        c cVar;
        ArrayList a2;
        final JSONObject optJSONObject;
        m mVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        JSONObject jsonObject = connectionResult.c;
        jsonObject = jsonObject == null ? new JSONObject() : jsonObject;
        this.c = jsonObject;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(request, "request");
        String optionalString = JsonUtils.getOptionalString(jsonObject, "error");
        JSONObject optJSONObject2 = jsonObject.optJSONObject("auth_error");
        d hVar = optJSONObject2 != null ? new h(request, optJSONObject2.optInt("error_code", -1), JsonUtils.getOptionalString(optJSONObject2, DiscardedEvent.JsonKeys.REASON), optionalString) : Intrinsics.areEqual(optionalString, "invalid_api_key") ? new e(optionalString, request) : optionalString != null ? new b(optionalString, request) : null;
        this.d = hVar;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(request, "request");
        JSONObject optJSONObject3 = jsonObject.optJSONObject("optional_auth_error");
        this.e = optJSONObject3 != null ? new i(request, optJSONObject3.optInt("error_code", -1), JsonUtils.getOptionalString(optJSONObject3, DiscardedEvent.JsonKeys.REASON)) : null;
        this.k = jsonObject.optJSONArray("feature_flags");
        this.o = jsonObject.optLong("last_sync_at", -1L);
        this.p = jsonObject.optJSONObject("banners");
        if (hVar == null && (request instanceof com.braze.requests.f)) {
            try {
                cVar = new c(jsonObject);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.g$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a(g.this);
                    }
                }, 4, (Object) null);
            }
            this.f = cVar;
            a2 = com.braze.triggers.utils.c.f822a.a(this.c.optJSONArray("triggers"), brazeManager);
            this.h = a2;
            if (a2 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.models.response.g$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.b(g.this);
                    }
                }, 6, (Object) null);
            }
            optJSONObject = this.c.optJSONObject(AnalyticsConstantsKt.KEY_CONFIG);
            if (optJSONObject == null) {
                try {
                    mVar = new m(optJSONObject);
                } catch (Exception e2) {
                    e = e2;
                    mVar = null;
                }
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.models.response.g$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return g.a(optJSONObject);
                        }
                    }, 6, (Object) null);
                } catch (Exception e3) {
                    e = e3;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.models.response.g$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return g.b(optJSONObject);
                        }
                    }, 4, (Object) null);
                    this.i = mVar;
                    JSONObject optJSONObject4 = this.c.optJSONObject("templated_message");
                    com.braze.triggers.utils.c cVar2 = com.braze.triggers.utils.c.f822a;
                    this.g = com.braze.triggers.utils.c.a(optJSONObject4, brazeManager);
                    JSONArray optJSONArray = this.c.optJSONArray("geofences");
                    this.j = optJSONArray != null ? com.braze.support.o.a(optJSONArray) : null;
                    if (request instanceof com.braze.requests.h) {
                    }
                    this.q = request instanceof w ? h1.k.a(this.c, true) : null;
                }
            } else {
                mVar = null;
            }
            this.i = mVar;
            JSONObject optJSONObject42 = this.c.optJSONObject("templated_message");
            com.braze.triggers.utils.c cVar22 = com.braze.triggers.utils.c.f822a;
            this.g = com.braze.triggers.utils.c.a(optJSONObject42, brazeManager);
            JSONArray optJSONArray2 = this.c.optJSONArray("geofences");
            this.j = optJSONArray2 != null ? com.braze.support.o.a(optJSONArray2) : null;
            if (request instanceof com.braze.requests.h) {
                this.l = JsonUtils.getOptionalString(this.c, "mite");
                this.m = JsonUtils.getOptionalString(this.c, "host");
                this.n = JsonUtils.getOptionalString(this.c, AuthorBox.TYPE);
            } else {
                this.l = null;
                this.m = null;
                this.n = null;
            }
            this.q = request instanceof w ? h1.k.a(this.c, true) : null;
        }
        cVar = null;
        this.f = cVar;
        a2 = com.braze.triggers.utils.c.f822a.a(this.c.optJSONArray("triggers"), brazeManager);
        this.h = a2;
        if (a2 != null) {
        }
        optJSONObject = this.c.optJSONObject(AnalyticsConstantsKt.KEY_CONFIG);
        if (optJSONObject == null) {
        }
        this.i = mVar;
        JSONObject optJSONObject422 = this.c.optJSONObject("templated_message");
        com.braze.triggers.utils.c cVar222 = com.braze.triggers.utils.c.f822a;
        this.g = com.braze.triggers.utils.c.a(optJSONObject422, brazeManager);
        JSONArray optJSONArray22 = this.c.optJSONArray("geofences");
        this.j = optJSONArray22 != null ? com.braze.support.o.a(optJSONArray22) : null;
        if (request instanceof com.braze.requests.h) {
        }
        this.q = request instanceof w ? h1.k.a(this.c, true) : null;
    }

    public static final String a(g gVar) {
        return "Encountered Exception processing Content Cards response: " + gVar.c;
    }

    public static final String b(g gVar) {
        return "Found " + gVar.h.size() + " triggered actions in server response.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Got server config: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final String b(JSONObject jSONObject) {
        return "Encountered Exception processing server config: " + jSONObject;
    }
}
