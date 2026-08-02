package jj0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fj0.C6575b;
import gj0.InterfaceC6744a;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements InterfaceC2395h<C6575b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f70140a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f70141b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fj0.d f70142c;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f70143a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f70144b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ fj0.d f70145c;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.usecase.impl.LoadConfigurationUseCaseImpl$getIntConfig$$inlined$mapNotNull$1$2", f = "LoadConfigurationUseCaseImpl.kt", l = {226, 240}, m = "emit")
        /* renamed from: jj0.d$a$a, reason: collision with other inner class name */
        public static final class C1151a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f70146d;

            /* renamed from: e, reason: collision with root package name */
            int f70147e;

            /* renamed from: f, reason: collision with root package name */
            InterfaceC2397i f70148f;

            public C1151a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70146d = obj;
                this.f70147e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, e eVar, fj0.d dVar) {
            this.f70143a = interfaceC2397i;
            this.f70144b = eVar;
            this.f70145c = dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
        
            if (r2.emit(r7, r0) == r1) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1151a c1151a;
            int i11;
            InterfaceC2397i interfaceC2397i;
            C6575b c6575b;
            Nl.a aVar;
            InterfaceC2397i interfaceC2397i2;
            if (dVar instanceof C1151a) {
                c1151a = (C1151a) dVar;
                int i12 = c1151a.f70147e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1151a.f70147e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1151a.f70146d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1151a.f70147e;
                    if (i11 != 0) {
                        s.b(obj2);
                        fj0.c cVar = (fj0.c) obj;
                        fj0.d dVar2 = this.f70145c;
                        interfaceC2397i = this.f70143a;
                        if (cVar != null) {
                            int intValue = ((Number) cVar.a()).intValue();
                            c6575b = new C6575b(cVar.b(), new fj0.h(dVar2.getKey(), intValue, intValue == ((Number) dVar2.a()).intValue()));
                            if (c6575b != null) {
                                c1151a.f70148f = null;
                                c1151a.f70147e = 2;
                            }
                            return Unit.f71690a;
                        }
                        aVar = this.f70144b.f70150a;
                        InterfaceC6744a a11 = aVar.a();
                        String key = dVar2.getKey();
                        int intValue2 = ((Number) dVar2.a()).intValue();
                        c1151a.f70148f = interfaceC2397i;
                        c1151a.f70147e = 1;
                        if (a11.c(intValue2, key, c1151a) != aVar2) {
                            interfaceC2397i2 = interfaceC2397i;
                        }
                        return aVar2;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return Unit.f71690a;
                    }
                    interfaceC2397i2 = c1151a.f70148f;
                    s.b(obj2);
                    interfaceC2397i = interfaceC2397i2;
                    c6575b = null;
                    if (c6575b != null) {
                    }
                    return Unit.f71690a;
                }
            }
            c1151a = new C1151a(dVar);
            Object obj22 = c1151a.f70146d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1151a.f70147e;
            if (i11 != 0) {
            }
            interfaceC2397i = interfaceC2397i2;
            c6575b = null;
            if (c6575b != null) {
            }
            return Unit.f71690a;
        }
    }

    public d(InterfaceC2395h interfaceC2395h, e eVar, fj0.d dVar) {
        this.f70140a = interfaceC2395h;
        this.f70141b = eVar;
        this.f70142c = dVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super C6575b> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f70140a.collect(new a(interfaceC2397i, this.f70141b, this.f70142c), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
