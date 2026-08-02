package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s8 extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final y8 f26044l;

    /* renamed from: m, reason: collision with root package name */
    public final c9 f26045m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(ue serverConfigStorageProvider, String urlBase, y8 locationEvent, String str) {
        super(new kd(urlBase + "geofence/request", false), str, serverConfigStorageProvider, 8);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(locationEvent, "locationEvent");
        this.f26044l = locationEvent;
        this.f26045m = c9.f25339i;
    }

    public static final String l() {
        return "Experienced JSONException while creating geofence refresh request. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            a10.put("location_event", ((k1) this.f26044l).getKey());
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.Ma
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.s8.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f26045m;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }
}
