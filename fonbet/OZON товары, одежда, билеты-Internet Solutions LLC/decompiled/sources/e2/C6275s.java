package e2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i2.C7000c;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6275s implements InterfaceC6274r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6276t f61852a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6276t f61853b = new C6276t(null, "min");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6276t f61854c = new C6276t(null, "max");

    public C6275s(@NotNull String str) {
        this.f61852a = new C6276t(str, "base");
    }

    @NotNull
    public final C7000c a() {
        C6276t c6276t = this.f61853b;
        boolean b11 = c6276t.b();
        C6276t c6276t2 = this.f61852a;
        C6276t c6276t3 = this.f61854c;
        if (b11 && c6276t3.b()) {
            return c6276t2.a();
        }
        i2.f fVar = new i2.f(new char[0]);
        if (!c6276t.b()) {
            fVar.A("min", c6276t.a());
        }
        if (!c6276t3.b()) {
            fVar.A("max", c6276t3.a());
        }
        fVar.A(AppMeasurementSdk.ConditionalUserProperty.VALUE, c6276t2.a());
        return fVar;
    }

    @NotNull
    public final C6276t b() {
        return this.f61853b;
    }
}
