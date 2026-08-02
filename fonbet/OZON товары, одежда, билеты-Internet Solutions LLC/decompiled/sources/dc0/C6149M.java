package dc0;

import Sc.InterfaceC4008j;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* renamed from: dc0.M, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6149M {

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f61505b;

    /* renamed from: c, reason: collision with root package name */
    private a f61506c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61504a = Sc.k.b(b.f61511b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Handler f61507d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.google.gson.internal.a f61508e = new com.google.gson.internal.a(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dc0.M$a */
    /* loaded from: classes3.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final NotificationDTO f61509a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f61510b;

        public a(@NotNull NotificationDTO notificationDTO, Function1<? super AtomAction, Unit> function1) {
            Intrinsics.checkNotNullParameter(notificationDTO, "notificationDTO");
            this.f61509a = notificationDTO;
            this.f61510b = function1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<ru.ozon.uni.atoms.af.AtomAction, kotlin.Unit>] */
        public final Function1<AtomAction, Unit> a() {
            return this.f61510b;
        }

        @NotNull
        public final NotificationDTO b() {
            return this.f61509a;
        }
    }

    /* renamed from: dc0.M$b */
    static final class b extends AbstractC7737t implements Function0<Qc0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f61511b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Qc0.a invoke() {
            return new Qc0.a();
        }
    }

    public static void a(C6149M c6149m, boolean z11) {
        if (z11) {
            return;
        }
        c6149m.f61506c = null;
    }

    public static void b(C6149M c6149m, NotificationDTO notificationDTO, Function1 function1) {
        ViewGroup viewGroup = c6149m.f61505b;
        c6149m.f61506c = new a(notificationDTO, function1);
        InterfaceC4008j interfaceC4008j = c6149m.f61504a;
        ((Qc0.a) interfaceC4008j.getValue()).c();
        if (viewGroup != null) {
            ((Qc0.a) interfaceC4008j.getValue()).d(notificationDTO, viewGroup, c6149m.f61508e, function1 != null ? new C6150N(function1, c6149m) : null);
        }
    }

    public final void d() {
        this.f61505b = null;
        ((Qc0.a) this.f61504a.getValue()).c();
    }

    public final void e(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f61505b = rootView;
        a aVar = this.f61506c;
        if (aVar != null) {
            NotificationDTO b11 = aVar.b();
            Function1<AtomAction, Unit> a11 = aVar.a();
            ((Qc0.a) this.f61504a.getValue()).d(b11, rootView, this.f61508e, a11 != null ? new C6150N(a11, this) : null);
        }
    }

    public final void f(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Qc0.a aVar = (Qc0.a) this.f61504a.getValue();
        NotificationDTO.Preset preset = NotificationDTO.Preset.INFO;
        aVar.getClass();
        g(Qc0.a.b(message, preset, 3), null);
    }

    public final void g(@NotNull final NotificationDTO notificationBarDto, final Function1<? super AtomAction, Unit> function1) {
        Intrinsics.checkNotNullParameter(notificationBarDto, "notificationBarDto");
        this.f61507d.post(new Runnable() { // from class: dc0.L
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
            @Override // java.lang.Runnable
            public final void run() {
                C6149M.b(C6149M.this, notificationBarDto, function1);
            }
        });
    }
}
