package kZ;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.C10720e0;
import xe.Y;

/* renamed from: kZ.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7622c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jZ.b f71169a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final He.c f71170b;

    @e(c = "ru.ozon.cdn.chooser.internal.domain.popreachability.timer.PoPReachabilityTimerImpl$listen$1", f = "PoPReachabilityTimer.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 28, AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: kZ.c$a */
    static final class a extends j implements Function2<InterfaceC2397i<? super Unit>, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f71171d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f71172e;

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = C7622c.this.new a(dVar);
            aVar.f71172e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super Unit> interfaceC2397i, d<? super Unit> dVar) {
            return ((a) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        
            if (xe.Y.b(r5, r9) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0072 -> B:13:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2397i interfaceC2397i;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f71171d;
            C7622c c7622c = C7622c.this;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.f71172e;
                long b11 = C7622c.b(c7622c);
                this.f71172e = interfaceC2397i2;
                this.f71171d = 1;
                if (Y.b(b11, this) != aVar) {
                    interfaceC2397i = interfaceC2397i2;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        interfaceC2397i = (InterfaceC2397i) this.f71172e;
                        s.b(obj);
                        Unit unit = Unit.f71690a;
                        this.f71172e = interfaceC2397i;
                        this.f71171d = 4;
                    } else if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                interfaceC2397i = (InterfaceC2397i) this.f71172e;
                s.b(obj);
                long a11 = C7622c.a(c7622c);
                this.f71172e = interfaceC2397i;
                this.f71171d = 3;
            } else {
                interfaceC2397i = (InterfaceC2397i) this.f71172e;
                s.b(obj);
            }
            Unit unit2 = Unit.f71690a;
            this.f71172e = interfaceC2397i;
            this.f71171d = 2;
        }
    }

    public C7622c(jZ.b timerConfig) {
        He.c coroutineDispatcher = C10720e0.a();
        Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f71169a = timerConfig;
        this.f71170b = coroutineDispatcher;
    }

    public static final long a(C7622c c7622c) {
        jZ.b bVar = c7622c.f71169a;
        return kotlin.random.c.INSTANCE.h(bVar.c(), bVar.b()) + bVar.a();
    }

    public static final long b(C7622c c7622c) {
        c7622c.getClass();
        c.Companion companion = kotlin.random.c.INSTANCE;
        jZ.b bVar = c7622c.f71169a;
        return companion.h(bVar.c(), bVar.b());
    }

    @NotNull
    public final InterfaceC2395h<Unit> c() {
        return C2399j.B(C2399j.A(new a(null)), this.f71170b);
    }
}
