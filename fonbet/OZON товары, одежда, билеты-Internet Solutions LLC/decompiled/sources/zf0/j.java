package zf0;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.NetworkInfo;

/* loaded from: classes7.dex */
public final class j implements InterfaceC2395h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2408n0 f109004a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qf0.b f109005b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f109006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ qf0.b f109007b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.reachability.domain.NetworkModesKt$match$$inlined$map$1$2", f = "NetworkModes.kt", l = {223}, m = "emit")
        /* renamed from: zf0.j$a$a, reason: collision with other inner class name */
        public static final class C2351a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f109008d;

            /* renamed from: e, reason: collision with root package name */
            int f109009e;

            public C2351a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f109008d = obj;
                this.f109009e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, qf0.b bVar) {
            this.f109006a = interfaceC2397i;
            this.f109007b = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        
            if (((ru.ozon.android.networkinfo.models.NetworkInfo.Available) r6).getNetworkConnectionType() == ru.ozon.android.networkinfo.models.NetworkConnectionType.WIFI) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C2351a c2351a;
            int i11;
            if (dVar instanceof C2351a) {
                c2351a = (C2351a) dVar;
                int i12 = c2351a.f109009e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c2351a.f109009e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c2351a.f109008d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c2351a.f109009e;
                    if (i11 != 0) {
                        s.b(obj2);
                        NetworkInfo networkInfo = (NetworkInfo) obj;
                        Intrinsics.checkNotNullParameter(networkInfo, "<this>");
                        qf0.b networkMode = this.f109007b;
                        Intrinsics.checkNotNullParameter(networkMode, "networkMode");
                        boolean z11 = false;
                        if (networkInfo instanceof NetworkInfo.Available) {
                            int i13 = i.f109003b[networkMode.ordinal()];
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    switch (i.f109002a[((NetworkInfo.Available) networkInfo).getNetworkConnectionType().ordinal()]) {
                                    }
                                }
                                z11 = true;
                            }
                        }
                        Boolean valueOf = Boolean.valueOf(z11);
                        c2351a.f109009e = 1;
                        if (this.f109006a.emit(valueOf, c2351a) == aVar) {
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
            c2351a = new C2351a(dVar);
            Object obj22 = c2351a.f109008d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c2351a.f109009e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public j(C2408n0 c2408n0, qf0.b bVar) {
        this.f109004a = c2408n0;
        this.f109005b = bVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super Boolean> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f109004a.collect(new a(interfaceC2397i, this.f109005b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
