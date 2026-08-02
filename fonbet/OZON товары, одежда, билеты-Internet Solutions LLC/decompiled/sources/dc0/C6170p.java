package dc0;

import Sc.InterfaceC4008j;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: dc0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6170p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f61574a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.e> f61575b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<qc0.b> f61576c;

    public C6170p(@NotNull InterfaceC4008j<C6144H> localCookieDataSource, @NotNull InterfaceC4008j<Cb0.e> clientCookiesInteractor, @NotNull InterfaceC4008j<qc0.b> crossAppChallengeKeyRepository) {
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(clientCookiesInteractor, "clientCookiesInteractor");
        Intrinsics.checkNotNullParameter(crossAppChallengeKeyRepository, "crossAppChallengeKeyRepository");
        this.f61574a = localCookieDataSource;
        this.f61575b = clientCookiesInteractor;
        this.f61576c = crossAppChallengeKeyRepository;
    }

    public static final void d(C6170p c6170p, String str) {
        if (str == null) {
            c6170p.getClass();
            return;
        }
        Cb0.e value = c6170p.f61575b.getValue();
        C6169o c6169o = new C6169o(str);
        c6169o.getAttributes().f();
        Cb0.e.h(value, C7714v.a0(c6169o));
    }

    public static Object e(C6170p c6170p, boolean z11, boolean z12, kotlin.coroutines.jvm.internal.c cVar, int i11) {
        boolean z13 = (i11 & 1) != 0 ? true : z11;
        boolean z14 = (i11 & 2) != 0 ? true : z12;
        boolean z15 = (i11 & 4) == 0;
        c6170p.getClass();
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(He.b.f10879b, new C6168n(c6170p, z13, z14, z15, null), cVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public final Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object e11 = this.f61574a.getValue().e(null, (kotlin.coroutines.jvm.internal.c) dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }
}
