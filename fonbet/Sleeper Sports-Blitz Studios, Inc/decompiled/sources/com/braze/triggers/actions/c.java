package com.braze.triggers.actions;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.events.internal.m;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c extends h {
    public final InAppMessageBase g;
    public final JSONObject h;
    public final r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(final JSONObject json, r brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.a(json);
            }
        }, 6, (Object) null);
        JSONObject jSONObject = json.getJSONObject("data");
        this.i = brazeManager;
        this.h = jSONObject;
        Intrinsics.checkNotNull(jSONObject);
        InAppMessageBase a2 = s.a(jSONObject, brazeManager);
        this.g = a2;
        if (a2 != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.f();
            }
        }, 6, (Object) null);
        throw new IllegalArgumentException("Failed to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(json));
    }

    public static final String a(c cVar) {
        InAppMessageBase inAppMessageBase = cVar.g;
        return "Failed to return remote paths to assets for type: " + (inAppMessageBase != null ? inAppMessageBase.getMessageType() : null);
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to in-app message json being null";
    }

    public static final String d(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to deserialized in-app message being null";
    }

    public static final String e() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String f() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String g() {
        return "Caught exception while performing triggered action.";
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.e();
                }
            }, 7, (Object) null);
            return arrayList;
        }
        InAppMessageBase inAppMessageBase2 = this.g;
        MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
        int i = messageType == null ? -1 : b.f798a[messageType.ordinal()];
        if (i == 1) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.f812a, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i == 2 || i == 3 || i == 4) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.b, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a(c.this);
                }
            }, 6, (Object) null);
            return arrayList;
        }
        Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.c, it.next()));
        }
        return arrayList;
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        try {
            JSONObject jsonKey = super.getJsonKey();
            if (jsonKey != null) {
                InAppMessageBase inAppMessageBase = this.g;
                jsonKey.put("data", inAppMessageBase != null ? inAppMessageBase.getJsonKey() : null);
                jsonKey.put("type", "inapp");
                return jsonKey;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String a(JSONObject jSONObject) {
        return "Attempting to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e internalEventPublisher, final com.braze.triggers.events.b triggerEvent, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.b(c.this);
                }
            }, 7, (Object) null);
            JSONObject jSONObject = this.h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.c(com.braze.triggers.events.b.this);
                    }
                }, 6, (Object) null);
                return;
            }
            InAppMessageBase a2 = s.a(jSONObject, this.i);
            String a3 = triggerEvent.a();
            int i = com.braze.triggers.events.h.e;
            if (Intrinsics.areEqual(a3, "test")) {
                if (a2 != null) {
                    a2.setTestSend(true);
                }
                this.h.put("is_test_send", true);
            }
            if (a2 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.d(com.braze.triggers.events.b.this);
                    }
                }, 6, (Object) null);
                return;
            }
            a2.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.f));
            a2.setExpirationTimestamp(j);
            ((com.braze.events.d) internalEventPublisher).b(new m(triggerEvent, this, a2, this.i.b), m.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.actions.c$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.g();
                }
            }, 4, (Object) null);
        }
    }

    public static final String b(c cVar) {
        return "Attempting to publish in-app message after delay of " + cVar.d().d() + " seconds.";
    }
}
