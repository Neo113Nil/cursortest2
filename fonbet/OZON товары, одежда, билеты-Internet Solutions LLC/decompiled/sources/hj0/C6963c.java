package hj0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: hj0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6963c implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f65591a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f.a f65592b;

    /* renamed from: hj0.c$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f65593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.a f65594b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.repository.impl.ConfigurationRepositoryImpl$getConfiguration$$inlined$map$1$2", f = "ConfigurationRepositoryImpl.kt", l = {223}, m = "emit")
        /* renamed from: hj0.c$a$a, reason: collision with other inner class name */
        public static final class C1074a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f65595d;

            /* renamed from: e, reason: collision with root package name */
            int f65596e;

            public C1074a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f65595d = obj;
                this.f65596e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, f.a aVar) {
            this.f65593a = interfaceC2397i;
            this.f65594b = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1074a c1074a;
            int i11;
            if (dVar instanceof C1074a) {
                c1074a = (C1074a) dVar;
                int i12 = c1074a.f65596e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1074a.f65596e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1074a.f65595d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1074a.f65596e;
                    if (i11 != 0) {
                        s.b(obj2);
                        Object c11 = ((W2.f) obj).c(this.f65594b);
                        c1074a.f65596e = 1;
                        if (this.f65593a.emit(c11, c1074a) == aVar) {
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
            c1074a = new C1074a(dVar);
            Object obj22 = c1074a.f65595d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1074a.f65596e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C6963c(InterfaceC2395h interfaceC2395h, f.a aVar) {
        this.f65591a = interfaceC2395h;
        this.f65592b = aVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Object> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f65591a.collect(new a(interfaceC2397i, this.f65592b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
