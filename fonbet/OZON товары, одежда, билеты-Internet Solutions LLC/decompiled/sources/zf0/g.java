package zf0;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import qj.C9067a;
import qj.C9070d;
import ru.ozon.android.networkinfo.models.NetworkInfo;

/* loaded from: classes7.dex */
public final class g implements InterfaceC2395h<p> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2408n0 f108984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9067a f108985b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f108986c;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f108987a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9067a f108988b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f108989c;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.DomainData$special$$inlined$map$1$2", f = "PeriodicPingInteractor.kt", l = {223}, m = "emit")
        /* renamed from: zf0.g$a$a, reason: collision with other inner class name */
        public static final class C2350a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f108990d;

            /* renamed from: e, reason: collision with root package name */
            int f108991e;

            public C2350a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f108990d = obj;
                this.f108991e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, C9067a c9067a, h hVar) {
            this.f108987a = interfaceC2397i;
            this.f108988b = c9067a;
            this.f108989c = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C2350a c2350a;
            int i11;
            NetworkInfo h11;
            qf0.b bVar;
            if (dVar instanceof C2350a) {
                c2350a = (C2350a) dVar;
                int i12 = c2350a.f108991e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c2350a.f108991e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c2350a.f108990d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c2350a.f108991e;
                    if (i11 != 0) {
                        s.b(obj2);
                        EnumC9053a enumC9053a = (EnumC9053a) obj;
                        h11 = this.f108988b.h(C9070d.f82206b);
                        Intrinsics.checkNotNullParameter(h11, "<this>");
                        if (h11 instanceof NetworkInfo.Available) {
                            bVar = i.f109002a[((NetworkInfo.Available) h11).getNetworkConnectionType().ordinal()] == 1 ? qf0.b.WiFi : qf0.b.Cellular;
                        } else {
                            bVar = qf0.b.Any;
                        }
                        p pVar = new p(this.f108989c.g(), enumC9053a, bVar);
                        c2350a.f108991e = 1;
                        if (this.f108987a.emit(pVar, c2350a) == aVar) {
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
            c2350a = new C2350a(dVar);
            Object obj22 = c2350a.f108990d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c2350a.f108991e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public g(C2408n0 c2408n0, C9067a c9067a, h hVar) {
        this.f108984a = c2408n0;
        this.f108985b = c9067a;
        this.f108986c = hVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super p> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f108984a.collect(new a(interfaceC2397i, this.f108985b, this.f108986c), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
