package yg;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yg.h;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f106604a = new ArrayList();

    @NotNull
    public final void a(@NotNull String name, String str, @NotNull C10897a body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f106604a.add(new f(name, str, body.c(), body));
    }

    @NotNull
    public final void b() {
        Intrinsics.checkNotNullParameter("type", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter("NON_FATAL", "content");
        ArrayList arrayList = this.f106604a;
        int i11 = h.f106612p0;
        arrayList.add(new f("type", null, null, h.a.a("text/plain", "NON_FATAL")));
    }

    @NotNull
    public final c c() {
        return new c(V.e.b(new Object[]{Long.valueOf(kotlin.random.c.INSTANCE.g())}, 1, "------------%016x", "format(this, *args)"), C7714v.U0(this.f106604a));
    }
}
