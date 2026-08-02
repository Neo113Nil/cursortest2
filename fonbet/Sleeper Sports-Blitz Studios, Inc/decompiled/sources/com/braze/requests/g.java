package com.braze.requests;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.enums.SdkFlavor;
import com.braze.events.internal.c0;
import com.braze.events.internal.d0;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class g extends b {
    public com.braze.models.outgoing.k k;
    public SdkFlavor l;
    public com.braze.models.outgoing.l m;
    public com.braze.models.b n;
    public EnumSet o;
    public String p;
    public String q;
    public final n r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b3 serverConfigStorageProvider, String urlBase, com.braze.models.outgoing.k outboundRespondWith) {
        super(new com.braze.requests.util.d(urlBase + "data"), (String) null, serverConfigStorageProvider, 10);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(outboundRespondWith, "outboundRespondWith");
        this.k = outboundRespondWith;
        this.r = n.f;
    }

    public static final String d() {
        return "Remote notifications enabled field set on request, but push token field not set. Not sending remote notifications enabled field.";
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String m() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        ArrayList<com.braze.models.m> arrayList = new ArrayList();
        arrayList.add(this.i);
        arrayList.add(this.m);
        arrayList.add(this.n);
        arrayList.add(this.k);
        if (!arrayList.isEmpty()) {
            for (com.braze.models.m mVar : arrayList) {
                if (mVar != null && !mVar.isEmpty()) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.i);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.braze.models.m mVar2 = (com.braze.models.m) it.next();
            if (mVar2 != null && !mVar2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        com.braze.models.outgoing.l lVar;
        com.braze.models.outgoing.h hVar = this.i;
        if (hVar == null || !hVar.getJsonKey().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey()) || ((lVar = this.m) != null && lVar.f646a.has(DataStoreKey.PUSH_TOKEN.getKey()))) {
            com.braze.models.outgoing.h hVar2 = this.i;
            if (hVar2 != null) {
                hVar2.m = true;
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.g$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.d();
                }
            }, 7, (Object) null);
            com.braze.models.outgoing.h hVar3 = this.i;
            if (hVar3 != null) {
                hVar3.m = false;
            }
        }
        JSONObject b = super.b();
        if (b == null) {
            return null;
        }
        try {
            String str = this.p;
            if (str != null) {
                b.put(App.JsonKeys.APP_VERSION, str);
            }
            String str2 = this.q;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                b.put("app_version_code", this.q);
            }
            com.braze.models.outgoing.l lVar2 = this.m;
            if (lVar2 != null && !lVar2.isEmpty()) {
                JSONArray jsonArrayForJsonPut = lVar2.b;
                Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
                b.put("attributes", jsonArrayForJsonPut);
            }
            com.braze.models.b bVar = this.n;
            if (bVar != null && !bVar.b) {
                b.put("events", JsonUtils.constructJsonArray(bVar.f619a));
            }
            SdkFlavor sdkFlavor = this.l;
            if (sdkFlavor != null) {
                b.put("sdk_flavor", sdkFlavor.getJsonKey());
            }
            EnumSet set = this.o;
            if (set != null) {
                BrazeSdkMetadata.Companion.getClass();
                Intrinsics.checkNotNullParameter(set, "set");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BrazeSdkMetadata) it.next()).jsonKey);
                }
                b.put("sdk_metadata", new JSONArray((Collection) CollectionsKt.sorted(arrayList)));
            }
            b.put("respond_with", this.k.getJsonKey());
            return b;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.requests.g$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.r;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.d internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.k.c()) {
            internalPublisher.b(new d0(this), d0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.k.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.g$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.m();
                }
            }, 7, (Object) null);
            ((com.braze.events.d) internalPublisher).b(new c0(this), c0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        if (!this.k.isEmpty() && this.k.c()) {
            existingHeaders.put("X-Braze-TriggersRequest", "true");
            existingHeaders.put("X-Braze-DataRequest", "true");
        }
    }
}
