package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t8 extends i2 {

    /* renamed from: l, reason: collision with root package name */
    public final k1 f26074l;

    /* renamed from: m, reason: collision with root package name */
    public final c9 f26075m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(ue serverConfigStorageProvider, String urlBase, k1 geofenceEvent) {
        super(new kd(urlBase + "geofence/report", false), (String) null, serverConfigStorageProvider, 10);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
        this.f26074l = geofenceEvent;
        this.f26075m = c9.f25340j;
    }

    public static final String l() {
        return "Experienced JSONException while creating geofence report request.Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a10 = super.a();
        if (a10 == null) {
            return null;
        }
        try {
            a10.put("geofence_event", this.f26074l.getKey());
            return a10;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: c3.bb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.t8.l();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.f26075m;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }
}
