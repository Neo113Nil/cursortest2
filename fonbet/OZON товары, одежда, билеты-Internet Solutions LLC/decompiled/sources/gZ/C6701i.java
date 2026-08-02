package gZ;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.r;
import Sc.s;
import androidx.lifecycle.D;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import hZ.C6894a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lZ.C7910a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.M;

/* renamed from: gZ.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6701i implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<C6894a> f64194a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6699g f64195b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mZ.f f64196c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f64197d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f64198e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f64199f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final D f64200g;

    /* renamed from: gZ.i$a */
    public interface a {
        @NotNull
        C6701i a(@NotNull x0<C6894a> x0Var);
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.CdnChooserUpdater$startVpnMonitor$1", f = "CdnChooserUpdater.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: gZ.i$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f64201d;

        /* renamed from: gZ.i$b$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6701i f64203a;

            a(C6701i c6701i) {
                this.f64203a = c6701i;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                ((Boolean) obj).booleanValue();
                Object a11 = C6701i.a(this.f64203a, dVar);
                return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C6701i.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f64201d;
            if (i11 == 0) {
                s.b(obj);
                C6701i c6701i = C6701i.this;
                InterfaceC2395h<Boolean> e11 = c6701i.f64196c.e();
                a aVar2 = new a(c6701i);
                this.f64201d = 1;
                if (e11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C6701i(@NotNull x0<C6894a> cdnConfigFlow, @NotNull C6699g cdnChooserNewConfigInteractor, @NotNull mZ.f vpnConnectionMonitor) {
        ProcessLifecycleOwner processLifecycleOwner;
        Intrinsics.checkNotNullParameter(cdnConfigFlow, "cdnConfigFlow");
        Intrinsics.checkNotNullParameter(cdnChooserNewConfigInteractor, "cdnChooserNewConfigInteractor");
        Intrinsics.checkNotNullParameter(vpnConnectionMonitor, "vpnConnectionMonitor");
        this.f64194a = cdnConfigFlow;
        this.f64195b = cdnChooserNewConfigInteractor;
        this.f64196c = vpnConnectionMonitor;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        this.f64200g = K.a(processLifecycleOwner);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C6701i c6701i, kotlin.coroutines.d dVar) {
        C6702j c6702j;
        int i11;
        Object a11;
        c6701i.getClass();
        if (dVar instanceof C6702j) {
            c6702j = (C6702j) dVar;
            int i12 = c6702j.f64207g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6702j.f64207g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6702j.f64205e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6702j.f64207g;
                if (i11 != 0) {
                    s.b(obj);
                    c6702j.f64204d = c6701i;
                    c6702j.f64207g = 1;
                    a11 = c6701i.f64195b.a(c6702j);
                    if (a11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6701i = c6702j.f64204d;
                    s.b(obj);
                    a11 = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                if (!(a11 instanceof r.b)) {
                    c6701i.f64194a.tryEmit((C6894a) a11);
                }
                return Unit.f71690a;
            }
        }
        c6702j = new C6702j(c6701i, dVar);
        Object obj2 = c6702j.f64205e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6702j.f64207g;
        if (i11 != 0) {
        }
        r.Companion companion2 = r.INSTANCE;
        if (!(a11 instanceof r.b)) {
        }
        return Unit.f71690a;
    }

    private final void d() {
        this.f64196c.f();
        B0 b02 = this.f64198e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f64198e = C10727i.c(this.f64200g, null, null, new b(null), 3);
    }

    public final void c() {
        ProcessLifecycleOwner processLifecycleOwner;
        if (this.f64197d) {
            return;
        }
        this.f64197d = true;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(this);
        d();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J owner) {
        long j11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        if (this.f64197d) {
            if (this.f64199f == null) {
                long b11 = this.f64195b.b();
                AbToolLibsApi a11 = aZ.e.a();
                if (a11 != null) {
                    j11 = a11.getLong(C7910a.a().getName(), C7910a.a().getServiceName(), AbToolNamespace.PLATFORM_MOBILE);
                } else {
                    j11 = 3600;
                }
                if (b11 >= j11 && this.f64196c.h()) {
                    B0 b02 = this.f64199f;
                    if (b02 != null) {
                        ((H0) b02).j(null);
                    }
                    this.f64199f = C10727i.c(this.f64200g, null, null, new C6703k(this, null), 3);
                }
            }
            if (this.f64198e == null) {
                d();
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        this.f64196c.g();
        B0 b02 = this.f64198e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f64198e = null;
        B0 b03 = this.f64199f;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        this.f64199f = null;
    }
}
