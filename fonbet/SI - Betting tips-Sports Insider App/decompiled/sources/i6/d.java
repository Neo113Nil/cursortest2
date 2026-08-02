package i6;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import d6.g;
import e6.y;
import w7.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: l, reason: collision with root package name */
    public static final l1.a f10998l = new l1.a("ClientNotification.API", new a6.d(5), new d6.d());

    /* renamed from: m, reason: collision with root package name */
    public static final l1.a f10999m = new l1.a("ClientTelemetry.API", new a6.d(6), new d6.d());

    public m d(TelemetryData telemetryData) {
        e6.m a7 = y.a();
        a7.f8725d = new Feature[]{h7.b.f10386a};
        a7.f8724c = true;
        a7.f8723b = false;
        a7.f8722a = new i2.d(2, telemetryData);
        return c(2, a7.a());
    }
}
