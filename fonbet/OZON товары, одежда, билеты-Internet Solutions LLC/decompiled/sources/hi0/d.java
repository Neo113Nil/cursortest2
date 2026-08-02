package hi0;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.EventType;
import xe.AbstractC10744q0;
import xe.J;
import xe.a1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f65542a = k.b(e.f65551b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f65543b = k.b(a.f65548b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f65544c = k.b(c.f65550b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f65545d = k.b(b.f65549b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C1071d f65546e = new C1071d(J.f105405n0);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f65547f = 0;

    static final class a extends AbstractC7737t implements Function0<AbstractC10744q0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f65548b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC10744q0 invoke() {
            return a1.a(1, "TrackerTimerContext");
        }
    }

    static final class b extends AbstractC7737t implements Function0<AbstractC10744q0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f65549b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC10744q0 invoke() {
            int size = EventType.getEntries().size();
            if (size > 10) {
                size = 10;
            }
            return a1.a(size, "EventManagerContext");
        }
    }

    static final class c extends AbstractC7737t implements Function0<AbstractC10744q0> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f65550b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC10744q0 invoke() {
            return a1.a(1, "LifecycleContext");
        }
    }

    /* renamed from: hi0.d$d, reason: collision with other inner class name */
    public static final class C1071d extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        }
    }

    static final class e extends AbstractC7737t implements Function0<AbstractC10744q0> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f65551b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC10744q0 invoke() {
            return a1.a(1, "TrackerContext");
        }
    }

    @NotNull
    public static final AbstractC10744q0 a() {
        return (AbstractC10744q0) f65543b.getValue();
    }

    @NotNull
    public static final C1071d b() {
        return f65546e;
    }

    @NotNull
    public static final AbstractC10744q0 c() {
        return (AbstractC10744q0) f65545d.getValue();
    }

    @NotNull
    public static final AbstractC10744q0 d() {
        return (AbstractC10744q0) f65544c.getValue();
    }

    @NotNull
    public static final AbstractC10744q0 e() {
        return (AbstractC10744q0) f65542a.getValue();
    }
}
