package bo.app;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l4 extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public lb f25694l;

    /* renamed from: m, reason: collision with root package name */
    public SdkFlavor f25695m;

    /* renamed from: n, reason: collision with root package name */
    public mb f25696n;

    /* renamed from: o, reason: collision with root package name */
    public l1 f25697o;

    /* renamed from: p, reason: collision with root package name */
    public EnumSet f25698p;

    /* renamed from: q, reason: collision with root package name */
    public String f25699q;

    /* renamed from: r, reason: collision with root package name */
    public String f25700r;

    /* renamed from: s, reason: collision with root package name */
    public final c9 f25701s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(ue serverConfigStorageProvider, String urlBase, lb outboundRespondWith) {
        super(new kd(urlBase + EventKeys.DATA, false), (String) null, serverConfigStorageProvider, 10);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(outboundRespondWith, "outboundRespondWith");
        this.f25694l = outboundRespondWith;
        this.f25701s = c9.f25336f;
    }

    public static final String l() {
        return "Remote notifications enabled field set on request, but push token field not set. Not sending remote notifications enabled field.";
    }

    public static final String m() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String n() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        String str;
        mb mbVar;
        x4 x4Var = this.f25549j;
        if (x4Var == null || !x4Var.getJsonKey().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey()) || ((mbVar = this.f25696n) != null && mbVar.f25755a.has(DataStoreKey.PUSH_TOKEN.getKey()))) {
            x4 x4Var2 = this.f25549j;
            if (x4Var2 != null) {
                x4Var2.f26247m = true;
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.m5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l4.l();
                }
            }, 7, (Object) null);
            x4 x4Var3 = this.f25549j;
            if (x4Var3 != null) {
                x4Var3.f26247m = false;
            }
        }
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            String str2 = this.f25699q;
            if (str2 != null) {
                a10.put(PublisherMetadata.APP_VERSION, str2);
            }
            String str3 = this.f25700r;
            if (str3 != null && !StringsKt.isBlank(str3)) {
                a10.put("app_version_code", this.f25700r);
            }
            mb mbVar2 = this.f25696n;
            if (mbVar2 != null && !mbVar2.isEmpty()) {
                JSONArray jsonArrayForJsonPut = mbVar2.f25756b;
                Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
                a10.put("attributes", jsonArrayForJsonPut);
            }
            l1 l1Var = this.f25697o;
            if (l1Var != null && !l1Var.f25681b) {
                a10.put("events", JsonUtils.constructJsonArray(l1Var.f25680a));
            }
            SdkFlavor sdkFlavor = this.f25695m;
            if (sdkFlavor != null) {
                a10.put("sdk_flavor", sdkFlavor.getJsonKey());
            }
            EnumSet<BrazeSdkMetadata> set = this.f25698p;
            if (set != null) {
                BrazeSdkMetadata.Companion.getClass();
                Intrinsics.checkNotNullParameter(set, "set");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                for (BrazeSdkMetadata brazeSdkMetadata : set) {
                    Intrinsics.checkNotNull(brazeSdkMetadata);
                    str = brazeSdkMetadata.jsonKey;
                    arrayList.add(str);
                }
                a10.put("sdk_metadata", new JSONArray((Collection) CollectionsKt.sorted(arrayList)));
            }
            a10.put("respond_with", this.f25694l.getJsonKey());
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.n5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l4.m();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f25701s;
    }

    @Override // bo.app.d9
    public final boolean c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f25549j);
        arrayList.add(this.f25696n);
        arrayList.add(this.f25697o);
        arrayList.add(this.f25694l);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                l9 l9Var = (l9) obj;
                if (l9Var != null && !l9Var.isEmpty()) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f25549j);
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            l9 l9Var2 = (l9) obj2;
            if (l9Var2 != null && !l9Var2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // bo.app.i2, bo.app.r9
    public final void b(r7 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.f25694l.b()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.o5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.l4.n();
                }
            }, 7, (Object) null);
            internalPublisher.b(new dg(this), dg.class);
        }
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        if (this.f25694l.b()) {
            internalPublisher.b(new eg(this), eg.class);
        }
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        if (!this.f25694l.isEmpty() && this.f25694l.b()) {
            existingHeaders.put("X-Braze-TriggersRequest", "true");
            existingHeaders.put("X-Braze-DataRequest", "true");
        }
    }
}
