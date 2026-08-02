package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ic extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f25568l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f25569m;

    /* renamed from: n, reason: collision with root package name */
    public final c9 f25570n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(ue serverConfigStorageProvider, String urlBase, String str, ArrayList pushDeliveryEvents) {
        super(new kd(urlBase + "push/delivery_events", false), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(pushDeliveryEvents, "pushDeliveryEvents");
        this.f25568l = pushDeliveryEvents;
        this.f25569m = pushDeliveryEvents.isEmpty();
        this.f25570n = c9.f25338h;
    }

    public static final String d() {
        return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f25568l;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                dc dcVar = (dc) obj;
                dcVar.f25636e.setValue(dcVar, k1.f25631h[0], this.f25541b);
                jSONArray.put(dcVar.getKey());
            }
            a10.put("events", jSONArray);
            String str = this.f25541b;
            if (str != null && !StringsKt.isBlank(str)) {
                a10.put("user_id", this.f25541b);
            }
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.B3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.ic.d();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f25570n;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return this.f25569m;
    }
}
