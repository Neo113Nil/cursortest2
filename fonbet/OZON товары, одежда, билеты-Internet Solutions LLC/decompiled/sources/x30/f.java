package x30;

import Ae.O0;
import Ae.x0;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import androidx.fragment.app.r;
import g30.InterfaceC6618a;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x30.f.a;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.Y;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f104973a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final R30.a f104974b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f104975c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f104976d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f104977e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f104978f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f104979g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f104980h;

    /* renamed from: i, reason: collision with root package name */
    private B0 f104981i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Object f104982j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f104983k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f104984l;

    public static final class a implements DisplayManager.DisplayListener {

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.screen.ScreenCaptureManager$displayListener$2$1$onDisplayAdded$1", f = "ScreenCaptureManager.kt", l = {50}, m = "invokeSuspend")
        /* renamed from: x30.f$a$a, reason: collision with other inner class name */
        static final class C2271a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f104986d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f104987e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2271a(f fVar, kotlin.coroutines.d<? super C2271a> dVar) {
                super(2, dVar);
                this.f104987e = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2271a(this.f104987e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2271a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f104986d;
                if (i11 == 0) {
                    s.b(obj);
                    this.f104986d = 1;
                    if (Y.b(1000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                f fVar = this.f104987e;
                fVar.i().setValue(Boolean.valueOf(fVar.j()));
                return Unit.f71690a;
            }
        }

        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i11) {
            f fVar = f.this;
            B0 b02 = fVar.f104981i;
            if (b02 == null || !b02.isActive()) {
                fVar.f104981i = C10727i.c(fVar.f104974b.b(), null, null, new C2271a(fVar, null), 3);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i11) {
            f fVar = f.this;
            B0 b02 = fVar.f104981i;
            if (b02 == null || !b02.isActive()) {
                fVar.i().setValue(Boolean.FALSE);
                return;
            }
            B0 b03 = fVar.f104981i;
            if (b03 != null) {
                b03.j(null);
            }
        }
    }

    public f(@NotNull Context context, @NotNull R30.a appCoroutineScopes, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f104973a = context;
        this.f104974b = appCoroutineScopes;
        this.f104975c = analyticInteractor;
        this.f104976d = Build.VERSION.SDK_INT >= 35;
        this.f104977e = Sc.k.a(n.PUBLICATION, new d70.g(this, 4));
        n nVar = n.NONE;
        this.f104978f = Sc.k.a(nVar, new c());
        this.f104982j = Sc.k.a(nVar, new Function0() { // from class: x30.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.this.new a();
            }
        });
        this.f104983k = O0.a(Boolean.valueOf(j()));
        this.f104984l = Sc.k.a(nVar, new A50.a(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [x30.e] */
    public static e a(f fVar) {
        if (fVar.f104976d) {
            return new Consumer() { // from class: x30.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.b(f.this, ((Integer) obj).intValue());
                }
            };
        }
        return null;
    }

    public static void b(f fVar, int i11) {
        if (i11 == 1) {
            fVar.f104983k.setValue(Boolean.TRUE);
        } else {
            fVar.f104983k.setValue(Boolean.FALSE);
        }
    }

    public static DisplayManager c(f fVar) {
        return (DisplayManager) androidx.core.content.a.getSystemService(fVar.f104973a, DisplayManager.class);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    public final void g() {
        if (this.f104979g) {
            DisplayManager displayManager = (DisplayManager) this.f104977e.getValue();
            if (displayManager != null) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) this.f104982j.getValue());
            }
            this.f104979g = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    public final void h() {
        boolean z11;
        if (this.f104979g || this.f104976d) {
            return;
        }
        try {
            DisplayManager displayManager = (DisplayManager) this.f104977e.getValue();
            if (displayManager != null) {
                displayManager.registerDisplayListener((DisplayManager.DisplayListener) this.f104982j.getValue(), null);
            }
            z11 = true;
        } catch (Exception unused) {
            z11 = false;
        }
        this.f104979g = z11;
    }

    @NotNull
    public final x0<Boolean> i() {
        return this.f104983k;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    public final boolean j() {
        if (this.f104976d) {
            return false;
        }
        DisplayManager displayManager = (DisplayManager) this.f104977e.getValue();
        Display[] displays = displayManager != null ? displayManager.getDisplays() : null;
        this.f104975c.L1(null, Integer.valueOf(displays != null ? displays.length : -1));
        return displays != null && displays.length > 1;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Sc.j, java.lang.Object] */
    public final void k(@NotNull r activity) {
        int addScreenRecordingCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.f104976d || this.f104980h) {
            return;
        }
        Consumer consumer = (Consumer) this.f104984l.getValue();
        boolean z11 = false;
        if (consumer != null) {
            try {
                x0<Boolean> x0Var = this.f104983k;
                addScreenRecordingCallback = activity.getWindowManager().addScreenRecordingCallback((ExecutorService) this.f104978f.getValue(), consumer);
                x0Var.setValue(Boolean.valueOf(addScreenRecordingCallback == 1));
                z11 = true;
            } catch (Exception e11) {
                L80.a.c("ScreenCaptureManager", "activity.windowManager.addScreenRecordingCallback", e11);
            }
        }
        this.f104980h = z11;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Sc.j, java.lang.Object] */
    public final void l(@NotNull l80.f activity) {
        Consumer consumer;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f104976d && this.f104980h && (consumer = (Consumer) this.f104984l.getValue()) != null) {
            try {
                activity.getWindowManager().removeScreenRecordingCallback(consumer);
            } catch (Exception e11) {
                L80.a.c("ScreenCaptureManager", "activity.windowManager.removeScreenRecordingCallback", e11);
            }
            this.f104980h = false;
        }
    }
}
