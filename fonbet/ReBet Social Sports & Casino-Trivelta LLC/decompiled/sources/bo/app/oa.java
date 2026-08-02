package bo.app;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oa extends tg {

    /* renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f25888g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f25889h;

    /* renamed from: i, reason: collision with root package name */
    public final a9 f25890i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(final JSONObject json, a9 brazeManager) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.I8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.oa.a(json);
            }
        }, 6, (Object) null);
        JSONObject jSONObject = json.getJSONObject(EventKeys.DATA);
        this.f25890i = brazeManager;
        this.f25889h = jSONObject;
        Intrinsics.checkNotNull(jSONObject);
        InAppMessageBase a10 = com.braze.support.i.a(jSONObject, brazeManager);
        this.f25888g = a10;
        if (a10 != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.J8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.oa.c();
            }
        }, 6, (Object) null);
        throw new IllegalArgumentException("Failed to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(json));
    }

    public static final String b(oa oaVar) {
        return "Attempting to publish in-app message after delay of " + oaVar.f26029b.f25829d + " seconds.";
    }

    public static final String c() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String d(v9 v9Var) {
        return "Cannot perform triggered action for " + v9Var + " due to deserialized in-app message being null";
    }

    @Override // bo.app.y9
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.f25888g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.H8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.oa.b();
                }
            }, 7, (Object) null);
            return arrayList;
        }
        InAppMessageBase inAppMessageBase2 = this.f25888g;
        MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
        int i10 = messageType == null ? -1 : na.f25808a[messageType.ordinal()];
        if (i10 == 1) {
            arrayList.add(new wc(xc.f26269a, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            arrayList.add(new wc(xc.f26270b, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i10 != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.G8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.oa.a(bo.app.oa.this);
                }
            }, 6, (Object) null);
            return arrayList;
        }
        Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
        while (it.hasNext()) {
            arrayList.add(new wc(xc.f26271c, it.next()));
        }
        return arrayList;
    }

    @Override // bo.app.rg, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        try {
            JSONObject key = super.getKey();
            if (key != null) {
                InAppMessageBase inAppMessageBase = this.f25888g;
                key.put(EventKeys.DATA, inAppMessageBase != null ? inAppMessageBase.getKey() : null);
                key.put("type", "inapp");
                return key;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String c(v9 v9Var) {
        return "Cannot perform triggered action for " + v9Var + " due to in-app message json being null";
    }

    public static final String d() {
        return "Caught exception while performing triggered action.";
    }

    public static final String b() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String a(oa oaVar) {
        InAppMessageBase inAppMessageBase = oaVar.f25888g;
        return "Failed to return remote paths to assets for type: " + (inAppMessageBase != null ? inAppMessageBase.getMessageType() : null);
    }

    public static final String a(JSONObject jSONObject) {
        return "Attempting to parse in-app message triggered action with JSON: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    @Override // bo.app.y9
    public final void a(Context context, r7 internalEventPublisher, final v9 triggerEvent, long j10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.C8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.oa.b(bo.app.oa.this);
                }
            }, 7, (Object) null);
            JSONObject jSONObject = this.f25889h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.D8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.oa.c(bo.app.v9.this);
                    }
                }, 6, (Object) null);
                return;
            }
            InAppMessageBase a10 = com.braze.support.i.a(jSONObject, this.f25890i);
            String a11 = triggerEvent.a();
            int i10 = uf.f26129g;
            if (Intrinsics.areEqual(a11, "test")) {
                if (a10 != null) {
                    a10.setTestSend(true);
                }
                this.f25889h.put("is_test_send", true);
            }
            if (a10 == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.E8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.oa.d(bo.app.v9.this);
                    }
                }, 6, (Object) null);
                return;
            }
            a10.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.f26091f));
            a10.setExpirationTimestamp(j10);
            internalEventPublisher.b(new la(triggerEvent, this, a10, ((e2) this.f25890i).f25406b), la.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.F8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.oa.d();
                }
            }, 4, (Object) null);
        }
    }
}
