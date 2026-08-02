package bo.app;

import Ph.AbstractC1457j;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.C2991e;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final id f25682a;

    /* renamed from: b, reason: collision with root package name */
    public final ta f25683b;

    /* renamed from: c, reason: collision with root package name */
    public final r7 f25684c;

    /* renamed from: d, reason: collision with root package name */
    public final m9 f25685d;

    /* renamed from: e, reason: collision with root package name */
    public final e2 f25686e;

    /* renamed from: f, reason: collision with root package name */
    public final ue f25687f;

    /* renamed from: g, reason: collision with root package name */
    public final x3 f25688g;

    /* renamed from: h, reason: collision with root package name */
    public final a7 f25689h;

    /* renamed from: i, reason: collision with root package name */
    public final dd f25690i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f25691j;

    /* renamed from: k, reason: collision with root package name */
    public final d9 f25692k;

    public l2(id requestInfo, ta httpConnector, r7 internalPublisher, m9 externalPublisher, e2 brazeManager, ue serverConfigStorage, x3 contentCardsStorage, a7 endpointMetadataProvider, dd requestDispatchCallback) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(httpConnector, "httpConnector");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(serverConfigStorage, "serverConfigStorage");
        Intrinsics.checkNotNullParameter(contentCardsStorage, "contentCardsStorage");
        Intrinsics.checkNotNullParameter(endpointMetadataProvider, "endpointMetadataProvider");
        Intrinsics.checkNotNullParameter(requestDispatchCallback, "requestDispatchCallback");
        this.f25682a = requestInfo;
        this.f25683b = httpConnector;
        this.f25684c = internalPublisher;
        this.f25685d = externalPublisher;
        this.f25686e = brazeManager;
        this.f25687f = serverConfigStorage;
        this.f25688g = contentCardsStorage;
        this.f25689h = endpointMetadataProvider;
        this.f25690i = requestDispatchCallback;
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", "gzip, deflate");
        hashMap.put("Content-Type", "application/json");
        this.f25691j = hashMap;
        d9 d9Var = requestInfo.f25571a;
        this.f25692k = d9Var;
        d9Var.a(hashMap);
    }

    public static final String b() {
        return "Experienced network communication exception processing API response. Sending network error event.";
    }

    public static final String d() {
        return "Api response was null, failing task.";
    }

    public final j a() {
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        ((i2) this.f25692k).f25545f = Long.valueOf(nowInMilliseconds);
        ((i2) this.f25692k).f25544e = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(nowInMilliseconds));
        final kd target = ((i2) this.f25692k).e();
        JSONObject a10 = this.f25692k.a();
        if (a10 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.e5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.a(bo.app.kd.this);
                }
            }, 6, (Object) null);
            return new vg(this.f25692k, new n9(-1, (Map) null, 6));
        }
        a7 a7Var = this.f25689h;
        Intrinsics.checkNotNullParameter(target, "target");
        String key = a7.b(target.f25667a);
        long a11 = a7Var.f25250a.a(key);
        long nowInMilliseconds2 = DateTimeUtils.nowInMilliseconds();
        C2991e c2991e = a7Var.f25250a;
        c2991e.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        AbstractC1457j.b(null, new z6(c2991e, key, nowInMilliseconds2, null), 1, null);
        this.f25691j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(Math.min(nowInMilliseconds2 - a11, 7200000L)));
        HashMap hashMap = this.f25691j;
        a7 a7Var2 = this.f25689h;
        Intrinsics.checkNotNullParameter(target, "target");
        String key2 = a7.a(target.f25667a);
        long a12 = a7Var2.f25250a.a(key2, 1L);
        C2991e c2991e2 = a7Var2.f25250a;
        c2991e2.getClass();
        Intrinsics.checkNotNullParameter(key2, "key");
        AbstractC1457j.b(null, new x6(c2991e2, key2, a12 + 1, null), 1, null);
        hashMap.put("X-Braze-Req-Attempt", String.valueOf(a12));
        this.f25691j.put("X-Braze-Req-Tokens-Remaining", String.valueOf(this.f25682a.f25575e));
        Integer num = this.f25682a.f25576f;
        if (num != null) {
            this.f25691j.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
        }
        int i10 = x8.f26266a;
        n9 a13 = this.f25683b.a(target, this.f25691j, a10);
        if (a13.f25807c != null) {
            return new nb(this.f25692k, a13, this.f25686e);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) null, false, new Function0() { // from class: c3.f5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.l2.b();
            }
        }, 6, (Object) null);
        ((r7) this.f25685d).b(new BrazeNetworkFailureEvent(this.f25692k, a13), BrazeNetworkFailureEvent.class);
        return new vg(this.f25692k, a13);
    }

    public final void c() {
        j a10 = a();
        if (!(a10 instanceof nb)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Z4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.d();
                }
            }, 6, (Object) null);
            bb bbVar = new bb(this.f25692k, a10.f25581a);
            this.f25692k.a(this.f25684c, this.f25685d, bbVar);
            this.f25684c.b(new r5(this.f25692k), r5.class);
            a(bbVar);
            this.f25690i.a(a10);
            return;
        }
        nb apiResponse = (nb) a10;
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        t9 t9Var = apiResponse.f25810d;
        if (t9Var == null) {
            a7 a7Var = this.f25689h;
            kd target = ((i2) this.f25692k).e();
            Intrinsics.checkNotNullParameter(target, "target");
            String key = a7.a(target.f25667a);
            C2991e c2991e = a7Var.f25250a;
            c2991e.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            AbstractC1457j.b(null, new x6(c2991e, key, 1L, null), 1, null);
            this.f25692k.a(this.f25684c, this.f25685d, apiResponse);
            this.f25690i.a(apiResponse);
        } else {
            a(t9Var);
            this.f25692k.a(this.f25684c, this.f25685d, apiResponse.f25810d);
            this.f25690i.a((j) apiResponse);
        }
        a(apiResponse);
        if (apiResponse.f25810d instanceof pd) {
            this.f25684c.b(new r5(this.f25692k), r5.class);
        } else {
            this.f25684c.b(new s5(this.f25692k), s5.class);
        }
    }

    public static final String b(t9 t9Var) {
        return "Received server error from request: " + t9Var.a();
    }

    public final void b(final ArrayList arrayList) {
        if (arrayList != null) {
            k2.a(arrayList, new Function0() { // from class: c3.i5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.b(bo.app.l2.this, arrayList);
                }
            });
        }
    }

    public static final Unit b(l2 l2Var, List list) {
        l2Var.f25684c.b(new u8(list), u8.class);
        return Unit.INSTANCE;
    }

    public final void c(final ArrayList arrayList) {
        if (arrayList != null) {
            k2.a(arrayList, new Function0() { // from class: c3.l5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.c(bo.app.l2.this, arrayList);
                }
            });
        }
    }

    public static final Unit c(l2 l2Var, List list) {
        l2Var.f25684c.b(new ug(list), ug.class);
        return Unit.INSTANCE;
    }

    public static final String a(kd kdVar) {
        return "Could not parse request parameters for POST request to " + kdVar + ", cancelling request.";
    }

    public final void a(nb apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        final String str = this.f25686e.f25406b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.d5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.l2.a(str);
            }
        }, 6, (Object) null);
        a(apiResponse.f25812f, str);
        a(apiResponse.f25815i);
        c(apiResponse.f25814h);
        b(apiResponse.f25816j);
        a(apiResponse.f25817k);
        a(apiResponse.f25813g, str);
        String str2 = apiResponse.f25818l;
        String str3 = apiResponse.f25819m;
        String str4 = apiResponse.f25820n;
        if (str2 != null && str3 != null && str4 != null) {
            this.f25684c.b(new u5(str2, str3, str4), u5.class);
        }
        a(apiResponse.f25822p, apiResponse.f25823q, apiResponse.f25824r);
        a(apiResponse.f25824r);
        td tdVar = apiResponse.f25825s;
        if (tdVar != null) {
            this.f25684c.b(new yd(tdVar), yd.class);
        }
    }

    public static final String a(String str) {
        return "Processing server response payload for user with id: " + str;
    }

    public final void a(final t9 responseError) {
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.g5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.l2.b(bo.app.t9.this);
            }
        }, 6, (Object) null);
        this.f25684c.b(new ve(responseError), ve.class);
        d9 d9Var = this.f25692k;
        if (d9Var instanceof pf) {
            m9 m9Var = this.f25685d;
            String a10 = ((pf) d9Var).f25913m.a();
            Intrinsics.checkNotNullExpressionValue(a10, "getTriggerEventType(...)");
            ((r7) m9Var).b(new NoMatchingTriggerEvent(a10), NoMatchingTriggerEvent.class);
        }
    }

    public final void a(final u3 u3Var, final String str) {
        if (u3Var != null) {
            k2.a(u3Var, new Function0() { // from class: c3.a5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.a(bo.app.l2.this, u3Var, str);
                }
            });
        }
    }

    public static final Unit a(l2 l2Var, u3 u3Var, String str) {
        ContentCardsUpdatedEvent a10 = l2Var.f25688g.a(u3Var, str);
        if (a10 != null) {
            ((r7) l2Var.f25685d).b(a10, ContentCardsUpdatedEvent.class);
        }
        return Unit.INSTANCE;
    }

    public final void a(final re reVar) {
        if (reVar != null) {
            k2.a(reVar, new Function0() { // from class: c3.k5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.a(bo.app.l2.this, reVar);
                }
            });
        }
    }

    public static final Unit a(l2 l2Var, re serverConfig) {
        l2Var.f25687f.a(serverConfig);
        l2Var.f25684c.b(new te(serverConfig), te.class);
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        l2Var.f25684c.b(new yd(new td(serverConfig.f26026z, serverConfig.f25993B, serverConfig.f25992A, serverConfig.f25994C, serverConfig.f25995D, serverConfig.f25996E)), yd.class);
        return Unit.INSTANCE;
    }

    public final void a(final JSONArray jSONArray) {
        if (jSONArray != null) {
            k2.a(jSONArray, new Function0() { // from class: c3.b5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.a(bo.app.l2.this, jSONArray);
                }
            });
        }
    }

    public static final Unit a(l2 l2Var, JSONArray jSONArray) {
        l2Var.f25684c.b(new h8(jSONArray), h8.class);
        return Unit.INSTANCE;
    }

    public final void a(final JSONObject jSONObject, final Long l10, final ArrayList arrayList) {
        if (jSONObject != null) {
            k2.a(jSONObject, new Function0() { // from class: c3.c5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.a(bo.app.l2.this, jSONObject, l10, arrayList);
                }
            });
        }
    }

    public static final Unit a(l2 l2Var, JSONObject jSONObject, Long l10, List list) {
        r7 r7Var = l2Var.f25684c;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        r7Var.b(new e0(jSONObject, l10, list), e0.class);
        return Unit.INSTANCE;
    }

    public final void a(final ArrayList arrayList) {
        if (arrayList != null) {
            k2.a(arrayList, new Function0() { // from class: c3.j5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.a(bo.app.l2.this, arrayList);
                }
            });
        }
    }

    public static final Unit a(l2 l2Var, List list) {
        l2Var.f25684c.b(new e(list), e.class);
        return Unit.INSTANCE;
    }

    public final void a(final InAppMessageBase inAppMessageBase, final String str) {
        if (inAppMessageBase != null) {
            k2.a(inAppMessageBase, new Function0() { // from class: c3.h5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l2.a(bo.app.l2.this, inAppMessageBase, str);
                }
            });
        }
    }

    public static final Unit a(l2 l2Var, IInAppMessage iInAppMessage, String str) {
        d9 d9Var = l2Var.f25692k;
        if (d9Var instanceof pf) {
            iInAppMessage.setExpirationTimestamp(((pf) d9Var).f25917q);
            r7 r7Var = l2Var.f25684c;
            pf pfVar = (pf) l2Var.f25692k;
            r7Var.b(new la(pfVar.f25913m, pfVar.f25918r, iInAppMessage, str), la.class);
        }
        return Unit.INSTANCE;
    }
}
