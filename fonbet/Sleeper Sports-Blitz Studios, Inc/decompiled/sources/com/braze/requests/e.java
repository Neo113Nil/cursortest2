package com.braze.requests;

import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.h0;
import com.braze.managers.d1;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.b3;
import com.braze.storage.g1;
import com.braze.storage.i1;
import com.braze.storage.j1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.requests.framework.h f668a;
    public final com.braze.communication.e b;
    public final com.braze.events.e c;
    public final com.braze.events.e d;
    public final com.braze.managers.r e;
    public final b3 f;
    public final com.braze.storage.p g;
    public final com.braze.requests.util.a h;
    public final com.braze.requests.framework.c i;
    public final HashMap j;
    public final o k;

    public e(com.braze.requests.framework.h requestInfo, com.braze.communication.e httpConnector, com.braze.events.e internalPublisher, com.braze.events.e externalPublisher, com.braze.managers.r brazeManager, b3 serverConfigStorage, com.braze.storage.p contentCardsStorage, com.braze.requests.util.a endpointMetadataProvider, com.braze.requests.framework.c requestDispatchCallback) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(serverConfigStorage, "serverConfigStorage");
        Intrinsics.checkNotNullParameter(contentCardsStorage, "contentCardsStorage");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        this.f668a = requestInfo;
        this.b = httpConnector;
        this.c = internalPublisher;
        this.d = externalPublisher;
        this.e = brazeManager;
        this.f = serverConfigStorage;
        this.g = contentCardsStorage;
        this.h = endpointMetadataProvider;
        this.i = requestDispatchCallback;
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate");
        hashMap.put("Content-Type", "application/json");
        this.j = hashMap;
        o oVar = requestInfo.f673a;
        this.k = oVar;
        oVar.a(hashMap);
    }

    public static final String b() {
        return "Experienced network communication exception processing API response. Sending network error event.";
    }

    public static final String d() {
        return "Api response was null, failing task.";
    }

    public final com.braze.models.response.a a() {
        ((b) this.k).e = Long.valueOf(DateTimeUtils.nowInSeconds());
        final com.braze.requests.util.d target = ((b) this.k).e();
        JSONObject b = this.k.b();
        if (b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(com.braze.requests.util.d.this);
                }
            }, 6, (Object) null);
            return new com.braze.models.response.n(this.k, new com.braze.communication.d(-1, (Map) null, 6));
        }
        com.braze.requests.util.a aVar = this.h;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(target, "target");
        String key = com.braze.requests.util.a.b(target.f681a);
        long a2 = aVar.f679a.a(key);
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        j1 j1Var = aVar.f679a;
        j1Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt__BuildersKt.runBlocking$default(null, new i1(j1Var, key, nowInMilliseconds, null), 1, null);
        this.j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(Math.min(nowInMilliseconds - a2, 7200000L)));
        HashMap hashMap = this.j;
        com.braze.requests.util.a aVar2 = this.h;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(target, "target");
        String key2 = com.braze.requests.util.a.a(target.f681a);
        long a3 = aVar2.f679a.a(key2, 1L);
        j1 j1Var2 = aVar2.f679a;
        j1Var2.getClass();
        Intrinsics.checkNotNullParameter(key2, "key");
        BuildersKt__BuildersKt.runBlocking$default(null, new g1(j1Var2, key2, a3 + 1, null), 1, null);
        hashMap.put("X-Braze-Req-Attempt", String.valueOf(a3));
        this.j.put("X-Braze-Req-Tokens-Remaining", String.valueOf(this.f668a.e));
        Integer num = this.f668a.f;
        if (num != null) {
            this.j.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
        }
        int i = com.braze.communication.c.f473a;
        com.braze.communication.d a4 = this.b.a(target, this.j, b);
        if (a4.c != null) {
            return new com.braze.models.response.g(this.k, a4, this.e);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.b();
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.d).b(new BrazeNetworkFailureEvent(this.k, a4), BrazeNetworkFailureEvent.class);
        return new com.braze.models.response.n(this.k, a4);
    }

    public final void c() {
        com.braze.models.response.a a2 = a();
        if (!(a2 instanceof com.braze.models.response.g)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.d();
                }
            }, 6, (Object) null);
            com.braze.models.response.f fVar = new com.braze.models.response.f(this.k, a2.f649a);
            this.k.a(this.c, this.d, fVar);
            ((com.braze.events.d) this.c).b(new com.braze.events.internal.f(this.k), com.braze.events.internal.f.class);
            a(fVar);
            this.i.a(a2);
            return;
        }
        com.braze.models.response.g apiResponse = (com.braze.models.response.g) a2;
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        com.braze.models.response.d dVar = apiResponse.d;
        if (dVar == null) {
            com.braze.requests.util.a aVar = this.h;
            com.braze.requests.util.d target = ((b) this.k).e();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(target, "target");
            String key = com.braze.requests.util.a.a(target.f681a);
            j1 j1Var = aVar.f679a;
            j1Var.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            BuildersKt__BuildersKt.runBlocking$default(null, new g1(j1Var, key, 1L, null), 1, null);
            this.k.a(this.c, this.d, apiResponse);
            this.i.a(apiResponse);
        } else {
            a(dVar);
            this.k.a(this.c, this.d, apiResponse.d);
            this.i.a((com.braze.models.response.a) apiResponse);
        }
        a(apiResponse);
        if (apiResponse.d instanceof com.braze.models.response.h) {
            ((com.braze.events.d) this.c).b(new com.braze.events.internal.f(this.k), com.braze.events.internal.f.class);
        } else {
            ((com.braze.events.d) this.c).b(new com.braze.events.internal.g(this.k), com.braze.events.internal.g.class);
        }
    }

    public static final String b(com.braze.models.response.d dVar) {
        return "Received server error from request: " + dVar.a();
    }

    public final void b(final ArrayList arrayList) {
        if (arrayList != null) {
            d.a(arrayList, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.b(e.this, arrayList);
                }
            });
        }
    }

    public static final Unit b(e eVar, List list) {
        ((com.braze.events.d) eVar.c).b(new h0(list), h0.class);
        return Unit.INSTANCE;
    }

    public static final String a(com.braze.requests.util.d dVar) {
        return "Could not parse request parameters for POST request to " + dVar + ", cancelling request.";
    }

    public final void a(com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        final String str = this.e.b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.a(str);
            }
        }, 6, (Object) null);
        a(apiResponse.f, str);
        a(apiResponse.i);
        b(apiResponse.h);
        a(apiResponse.j);
        a(apiResponse.k);
        a(apiResponse.g, str);
        String str2 = apiResponse.l;
        String str3 = apiResponse.m;
        String str4 = apiResponse.n;
        if (str2 != null && str3 != null && str4 != null) {
            ((com.braze.events.d) this.c).b(new com.braze.events.internal.h(str2, str3, str4), com.braze.events.internal.h.class);
        }
        a(apiResponse.p);
        d1 d1Var = apiResponse.q;
        if (d1Var != null) {
            ((com.braze.events.d) this.c).b(new com.braze.events.internal.t(d1Var), com.braze.events.internal.t.class);
        }
    }

    public static final String a(String str) {
        return "Processing server response payload for user with id: " + str;
    }

    public final void a(final com.braze.models.response.d responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.b(com.braze.models.response.d.this);
            }
        }, 6, (Object) null);
        ((com.braze.events.d) this.c).b(new com.braze.events.internal.x(responseError), com.braze.events.internal.x.class);
        o oVar = this.k;
        if (oVar instanceof y) {
            com.braze.events.e eVar = this.d;
            String a2 = ((y) oVar).l.a();
            Intrinsics.checkNotNullExpressionValue(a2, "getTriggerEventType(...)");
            ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(a2), NoMatchingTriggerEvent.class);
        }
    }

    public final void a(final com.braze.models.response.c cVar, final String str) {
        if (cVar != null) {
            d.a(cVar, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(e.this, cVar, str);
                }
            });
        }
    }

    public static final Unit a(e eVar, com.braze.models.response.c cVar, String str) {
        ContentCardsUpdatedEvent a2 = eVar.g.a(cVar, str);
        if (a2 != null) {
            ((com.braze.events.d) eVar.d).b(a2, ContentCardsUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    public final void a(final com.braze.models.response.m mVar) {
        if (mVar != null) {
            d.a(mVar, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(e.this, mVar);
                }
            });
        }
    }

    public static final Unit a(e eVar, com.braze.models.response.m serverConfig) {
        eVar.f.a(serverConfig);
        ((com.braze.events.d) eVar.c).b(new com.braze.events.internal.w(serverConfig), com.braze.events.internal.w.class);
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        d1 d1Var = new d1(serverConfig.z, serverConfig.B, serverConfig.A, serverConfig.C, serverConfig.D, serverConfig.E);
        ((com.braze.events.d) eVar.c).b(new com.braze.events.internal.t(d1Var), com.braze.events.internal.t.class);
        return Unit.INSTANCE;
    }

    public final void a(final ArrayList arrayList) {
        if (arrayList != null) {
            d.a(arrayList, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(e.this, arrayList);
                }
            });
        }
    }

    public static final Unit a(e eVar, List list) {
        ((com.braze.events.d) eVar.c).b(new com.braze.events.internal.l(list), com.braze.events.internal.l.class);
        return Unit.INSTANCE;
    }

    public final void a(final JSONArray jSONArray) {
        if (jSONArray != null) {
            d.a(jSONArray, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(e.this, jSONArray);
                }
            });
        }
    }

    public static final Unit a(e eVar, JSONArray jSONArray) {
        ((com.braze.events.d) eVar.c).b(new com.braze.events.internal.i(jSONArray), com.braze.events.internal.i.class);
        return Unit.INSTANCE;
    }

    public final void a(final JSONObject jSONObject) {
        if (jSONObject != null) {
            d.a(jSONObject, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(e.this, jSONObject);
                }
            });
        }
    }

    public static final Unit a(e eVar, JSONObject jSONObject) {
        ((com.braze.events.d) eVar.c).b(new com.braze.events.internal.a(jSONObject), com.braze.events.internal.a.class);
        return Unit.INSTANCE;
    }

    public final void a(final InAppMessageBase inAppMessageBase, final String str) {
        if (inAppMessageBase != null) {
            d.a(inAppMessageBase, new Function0() { // from class: com.braze.requests.e$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(e.this, inAppMessageBase, str);
                }
            });
        }
    }

    public static final Unit a(e eVar, IInAppMessage iInAppMessage, String str) {
        o oVar = eVar.k;
        if (oVar instanceof y) {
            iInAppMessage.setExpirationTimestamp(((y) oVar).p);
            com.braze.events.e eVar2 = eVar.c;
            y yVar = (y) eVar.k;
            ((com.braze.events.d) eVar2).b(new com.braze.events.internal.m(yVar.l, yVar.q, iInAppMessage, str), com.braze.events.internal.m.class);
        }
        return Unit.INSTANCE;
    }
}
