package v30;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.antifraud.internal.models.DeviceStatus;

/* loaded from: classes3.dex */
public final class f implements InterfaceC2395h<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f102059a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f102060b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f102061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f102062b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.FintechAntiFraudInteractorImpl$getDeviceStatusStateFlow$$inlined$map$1$2", f = "FintechAntiFraudInteractorImpl.kt", l = {223}, m = "emit")
        /* renamed from: v30.f$a$a, reason: collision with other inner class name */
        public static final class C2221a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f102063d;

            /* renamed from: e, reason: collision with root package name */
            int f102064e;

            public C2221a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f102063d = obj;
                this.f102064e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, e eVar) {
            this.f102061a = interfaceC2397i;
            this.f102062b = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C2221a c2221a;
            int i11;
            String v11;
            if (dVar instanceof C2221a) {
                c2221a = (C2221a) dVar;
                int i12 = c2221a.f102064e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c2221a.f102064e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c2221a.f102063d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c2221a.f102064e;
                    if (i11 != 0) {
                        s.b(obj2);
                        v11 = this.f102062b.v((DeviceStatus) obj);
                        c2221a.f102064e = 1;
                        if (this.f102061a.emit(v11, c2221a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c2221a = new C2221a(dVar);
            Object obj22 = c2221a.f102063d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c2221a.f102064e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public f(InterfaceC2395h interfaceC2395h, e eVar) {
        this.f102059a = interfaceC2395h;
        this.f102060b = eVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super String> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f102059a.collect(new a(interfaceC2397i, this.f102060b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
