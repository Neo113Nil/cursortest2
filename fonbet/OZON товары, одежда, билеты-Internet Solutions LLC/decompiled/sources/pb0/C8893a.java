package pb0;

import Db0.f;
import Sc.InterfaceC4008j;
import Sc.s;
import android.app.Activity;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qb0.InterfaceC9018a;
import ru.ozon.id.antibot.callback.presentation.FullScreenAntibotActivity;
import xe.C10720e0;
import xe.L0;
import xe.M;
import xe.f1;

/* renamed from: pb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8893a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<f> f80388a;

    /* renamed from: b, reason: collision with root package name */
    private FullScreenAntibotActivity f80389b;

    @e(c = "ru.ozon.id.antibot.callback.FullScreenAntibotCallback$awaitAntibotContainer$2", f = "FullScreenAntibotCallback.kt", l = {34, 42}, m = "invokeSuspend")
    /* renamed from: pb0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C1353a extends j implements Function2<M, d<? super InterfaceC9018a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC9018a f80390d;

        /* renamed from: e, reason: collision with root package name */
        int f80391e;

        C1353a(d<? super C1353a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return C8893a.this.new C1353a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super InterfaceC9018a> dVar) {
            return ((C1353a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            if (xe.l1.a(r6) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        
            if (pb0.C8893a.c(r2, r6) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC9018a interfaceC9018a;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f80391e;
            C8893a c8893a = C8893a.this;
            if (i11 == 0) {
                s.b(obj);
                this.f80391e = 1;
            } else if (i11 == 1) {
                s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC9018a = this.f80390d;
                s.b(obj);
                if (interfaceC9018a != null) {
                    return interfaceC9018a;
                }
            }
            InterfaceC9018a interfaceC9018a2 = c8893a.f80389b;
            interfaceC9018a = null;
            if (interfaceC9018a2 != null && interfaceC9018a2.getLifecycle().b().a(AbstractC5434v.b.RESUMED)) {
                interfaceC9018a = interfaceC9018a2;
            }
            this.f80390d = interfaceC9018a;
            this.f80391e = 2;
        }
    }

    /* renamed from: pb0.a$b */
    static final class b extends AbstractC7737t implements Function1<FullScreenAntibotActivity, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FullScreenAntibotActivity fullScreenAntibotActivity) {
            FullScreenAntibotActivity activity = fullScreenAntibotActivity;
            Intrinsics.checkNotNullParameter(activity, "activity");
            C8893a.this.f80389b = activity;
            return Unit.f71690a;
        }
    }

    public C8893a(@NotNull InterfaceC4008j<f> activityLifecycleCallback) {
        Intrinsics.checkNotNullParameter(activityLifecycleCallback, "activityLifecycleCallback");
        this.f80388a = activityLifecycleCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (xe.C10727i.f(r5, r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r6 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C8893a c8893a, kotlin.coroutines.jvm.internal.c cVar) {
        C8894b c8894b;
        int i11;
        AbstractC5434v lifecycle;
        AbstractC5434v.b b11;
        Activity activity;
        c8893a.getClass();
        if (cVar instanceof C8894b) {
            c8894b = (C8894b) cVar;
            int i12 = c8894b.f80396f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8894b.f80396f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c8894b.f80394d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8894b.f80396f;
                if (i11 != 0) {
                    s.b(obj);
                    FullScreenAntibotActivity fullScreenAntibotActivity = c8893a.f80389b;
                    if (fullScreenAntibotActivity != null && (lifecycle = fullScreenAntibotActivity.getLifecycle()) != null && (b11 = lifecycle.b()) != null && b11.a(AbstractC5434v.b.RESUMED)) {
                        return Unit.f71690a;
                    }
                    f value = c8893a.f80388a.getValue();
                    c8894b.f80396f = 1;
                    obj = value.g(c8894b);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    s.b(obj);
                }
                activity = (Activity) obj;
                if (activity != null) {
                    throw new IllegalStateException("Превышен таймаут ожидания STARTED активити");
                }
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                C8895c c8895c = new C8895c(activity, null);
                c8894b.f80396f = 2;
            }
        }
        c8894b = new C8894b(c8893a, cVar);
        Object obj2 = c8894b.f80394d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8894b.f80396f;
        if (i11 != 0) {
        }
        activity = (Activity) obj2;
        if (activity != null) {
        }
    }

    public final Object d(@NotNull d<? super InterfaceC9018a> dVar) {
        return f1.c(2000L, new C1353a(null), dVar);
    }

    public final void e() {
        FullScreenAntibotActivity fullScreenAntibotActivity = this.f80389b;
        if (fullScreenAntibotActivity == null) {
            return;
        }
        fullScreenAntibotActivity.close();
        this.f80389b = null;
    }

    public final void f() {
        this.f80388a.getValue().f(new b());
    }
}
