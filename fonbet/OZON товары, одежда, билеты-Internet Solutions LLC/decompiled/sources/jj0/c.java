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
public final class c implements InterfaceC2395h<C6575b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f70130a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f70131b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fj0.d f70132c;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f70133a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f70134b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ fj0.d f70135c;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.usecase.impl.LoadConfigurationUseCaseImpl$getBooleanConfig$$inlined$mapNotNull$1$2", f = "LoadConfigurationUseCaseImpl.kt", l = {226, 240}, m = "emit")
        /* renamed from: jj0.c$a$a, reason: collision with other inner class name */
        public static final class C1150a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f70136d;

            /* renamed from: e, reason: collision with root package name */
            int f70137e;

            /* renamed from: f, reason: collision with root package name */
            InterfaceC2397i f70138f;

            public C1150a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f70136d = obj;
                this.f70137e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, e eVar, fj0.d dVar) {
            this.f70133a = interfaceC2397i;
            this.f70134b = eVar;
            this.f70135c = dVar;
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
            C1150a c1150a;
            int i11;
            InterfaceC2397i interfaceC2397i;
            C6575b c6575b;
            Nl.a aVar;
            InterfaceC2397i interfaceC2397i2;
            if (dVar instanceof C1150a) {
                c1150a = (C1150a) dVar;
                int i12 = c1150a.f70137e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1150a.f70137e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1150a.f70136d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1150a.f70137e;
                    if (i11 != 0) {
                        s.b(obj2);
                        fj0.c cVar = (fj0.c) obj;
                        fj0.d dVar2 = this.f70135c;
                        interfaceC2397i = this.f70133a;
                        if (cVar != null) {
                            boolean booleanValue = ((Boolean) cVar.a()).booleanValue();
                            c6575b = new C6575b(cVar.b(), new fj0.f(dVar2.getKey(), booleanValue, booleanValue == ((Boolean) dVar2.a()).booleanValue()));
                            if (c6575b != null) {
                                c1150a.f70138f = null;
                                c1150a.f70137e = 2;
                            }
                            return Unit.f71690a;
                        }
                        aVar = this.f70134b.f70150a;
                        InterfaceC6744a a11 = aVar.a();
                        String key = dVar2.getKey();
                        boolean booleanValue2 = ((Boolean) dVar2.a()).booleanValue();
                        c1150a.f70138f = interfaceC2397i;
                        c1150a.f70137e = 1;
                        if (a11.f(key, booleanValue2, c1150a) != aVar2) {
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
                    interfaceC2397i2 = c1150a.f70138f;
                    s.b(obj2);
                    interfaceC2397i = interfaceC2397i2;
                    c6575b = null;
                    if (c6575b != null) {
                    }
                    return Unit.f71690a;
                }
            }
            c1150a = new C1150a(dVar);
            Object obj22 = c1150a.f70136d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1150a.f70137e;
            if (i11 != 0) {
            }
            interfaceC2397i = interfaceC2397i2;
            c6575b = null;
            if (c6575b != null) {
            }
            return Unit.f71690a;
        }
    }

    public c(InterfaceC2395h interfaceC2395h, e eVar, fj0.d dVar) {
        this.f70130a = interfaceC2395h;
        this.f70131b = eVar;
        this.f70132c = dVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super C6575b> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f70130a.collect(new a(interfaceC2397i, this.f70131b, this.f70132c), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
