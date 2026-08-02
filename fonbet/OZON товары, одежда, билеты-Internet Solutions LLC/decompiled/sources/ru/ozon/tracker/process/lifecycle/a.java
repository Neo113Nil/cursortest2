package ru.ozon.tracker.process.lifecycle;

import Sc.k;
import Sc.n;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.I;
import xe.N;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f97835a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f97836b;

    /* renamed from: ru.ozon.tracker.process.lifecycle.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2149a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97837a;

        static {
            int[] iArr = new int[ApplicationLifecycleState.values().length];
            try {
                iArr[ApplicationLifecycleState.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApplicationLifecycleState.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97837a = iArr;
        }
    }

    /* synthetic */ class b extends C7735q implements Function0<Yj0.a> {
        @Override // kotlin.jvm.functions.Function0
        public final Yj0.a invoke() {
            return (Yj0.a) ((Ib.a) this.receiver).get();
        }
    }

    public a(@NotNull I lifecycleDispatcher, @NotNull Ib.a<Yj0.a> lifecycleStateProviderLazy) {
        Intrinsics.checkNotNullParameter(lifecycleDispatcher, "lifecycleDispatcher");
        Intrinsics.checkNotNullParameter(lifecycleStateProviderLazy, "lifecycleStateProviderLazy");
        this.f97835a = lifecycleDispatcher;
        this.f97836b = k.a(n.NONE, new b(0, lifecycleStateProviderLazy, Ib.a.class, "get", "get()Ljava/lang/Object;", 0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final Yj0.a b(a aVar) {
        return (Yj0.a) aVar.f97836b.getValue();
    }

    public final Object c(@NotNull ApplicationLifecycleState applicationLifecycleState, @NotNull Function2 function2, @NotNull j jVar) {
        Object d11 = N.d(new ru.ozon.tracker.process.lifecycle.b(null, function2, applicationLifecycleState, this), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
