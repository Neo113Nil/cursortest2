package oe0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import oe0.z;
import org.jetbrains.annotations.NotNull;

/* renamed from: oe0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8712c implements InterfaceC2395h<z.b.c> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f78141a;

    /* renamed from: oe0.c$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f78142a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.FusedSubscribeLocationUpdates$createLocationTrackerFlow$$inlined$mapNotNull$1$2", f = "FusedSubscribeLocationUpdates.kt", l = {230}, m = "emit")
        /* renamed from: oe0.c$a$a, reason: collision with other inner class name */
        public static final class C1322a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f78143d;

            /* renamed from: e, reason: collision with root package name */
            int f78144e;

            public C1322a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f78143d = obj;
                this.f78144e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f78142a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1322a c1322a;
            int i11;
            z.b.c cVar;
            if (dVar instanceof C1322a) {
                c1322a = (C1322a) dVar;
                int i12 = c1322a.f78144e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1322a.f78144e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1322a.f78143d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1322a.f78144e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        z.b bVar = (z.b) obj;
                        if (bVar instanceof z.b.c) {
                            cVar = (z.b.c) bVar;
                        } else {
                            if (!(bVar instanceof z.b.a) && !(bVar instanceof z.b.C1325b)) {
                                throw new Sc.o();
                            }
                            cVar = null;
                        }
                        if (cVar != null) {
                            c1322a.f78144e = 1;
                            if (this.f78142a.emit(cVar, c1322a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c1322a = new C1322a(dVar);
            Object obj22 = c1322a.f78143d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1322a.f78144e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C8712c(InterfaceC2395h interfaceC2395h) {
        this.f78141a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super z.b.c> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = ((AbstractC2635g) this.f78141a).collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
