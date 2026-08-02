package ek0;

import Hj0.M;
import Qj0.l0;
import fi0.v;
import fi0.x;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8336f;
import mi0.InterfaceC8339i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.d;
import ru.ozon.tracker.sendEvent.repository.EventRepository;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static v f62386a;

    /* renamed from: b, reason: collision with root package name */
    private static l0 f62387b;

    /* renamed from: c, reason: collision with root package name */
    private static d f62388c;

    /* renamed from: d, reason: collision with root package name */
    private static EventRepository f62389d;

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC8336f f62390e;

    /* renamed from: f, reason: collision with root package name */
    private static InterfaceC8339i f62391f;

    public static void a(@NotNull x settings, @NotNull M component) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(component, "component");
        f62386a = settings.p();
        f62387b = component.g();
        f62388c = component.b();
        f62389d = component.f();
        f62390e = component.e();
        f62391f = component.d();
    }

    public static v b() {
        return f62386a;
    }

    public static EventRepository c() {
        return f62389d;
    }

    public static InterfaceC8336f d() {
        return f62390e;
    }

    public static InterfaceC8339i e() {
        return f62391f;
    }

    public static d f() {
        return f62388c;
    }

    public static l0 g() {
        return f62387b;
    }
}
