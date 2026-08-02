package hb0;

import Sc.s;
import h3.C6788a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;
import xe.M;

/* renamed from: hb0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6907c implements InterfaceC6906b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6788a f65273a;

    /* renamed from: b, reason: collision with root package name */
    private B0 f65274b;

    @e(c = "ru.ozon.host.config.debug.menu.utils.ThrottleJobImpl$throttle$1", f = "ThrottleJob.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: hb0.c$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f65275d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f65276e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f65276e = (j) function1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f65276e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65275d;
            if (i11 == 0) {
                s.b(obj);
                this.f65275d = 1;
                if (this.f65276e.invoke(this) == aVar) {
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

    public C6907c(@NotNull C6788a scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f65273a = scope;
    }

    @Override // hb0.InterfaceC6906b
    public final void a(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        B0 b02 = this.f65274b;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f65274b = C10727i.c(this.f65273a, null, null, new a(block, null), 3);
        }
    }
}
