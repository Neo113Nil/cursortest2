package zf0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.E0;
import Ae.I0;
import De.C2862e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import qf0.d;
import qj.C9067a;
import rf0.AbstractC9267a;
import ze.EnumC11113a;

/* loaded from: classes7.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f108993a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC9267a f108994b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d.b f108995c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Af0.a f108996d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<h, kotlin.coroutines.d<? super EnumC9053a>, Object> f108997e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C0 f108998f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final B0<qf0.e> f108999g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private EnumC9053a f109000h;

    /* renamed from: i, reason: collision with root package name */
    private long f109001i;

    public h(@NotNull String domain, @NotNull AbstractC9267a pingConfig, @NotNull d.b pingMode, @NotNull Af0.a logger, @NotNull C9067a networkInfoProvider, @NotNull C2862e parentScope) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(pingConfig, "pingConfig");
        Intrinsics.checkNotNullParameter(pingMode, "pingMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        this.f108993a = domain;
        this.f108994b = pingConfig;
        this.f108995c = pingMode;
        this.f108996d = logger;
        this.f108997e = new f(2, null);
        C0 a11 = E0.a(1, 1, EnumC11113a.DROP_OLDEST);
        this.f108998f = a11;
        C2408n0 c2408n0 = new C2408n0(networkInfoProvider.j(), new C11119a(this, null));
        qf0.b networkMode = pingConfig.a();
        Intrinsics.checkNotNullParameter(c2408n0, "<this>");
        Intrinsics.checkNotNullParameter(networkMode, "networkMode");
        g gVar = new g(new C2408n0(C2399j.D(new C2417s0(a11, new C2408n0(new j(c2408n0, networkMode), new b(this, null)), new c(this, null)), new d(this, null)), new e(this, null)), networkInfoProvider, this);
        int i11 = I0.f818a;
        this.f108999g = C2399j.L(gVar, parentScope, I0.a.b(3));
        this.f109000h = EnumC9053a.Unknown;
    }

    public final void e(@NotNull Function2<? super h, ? super kotlin.coroutines.d<? super EnumC9053a>, ? extends Object> task) {
        boolean d11;
        boolean d12;
        ru.ozon.android.ozonLogger.core.h a11;
        ru.ozon.android.ozonLogger.core.h a12;
        Intrinsics.checkNotNullParameter(task, "task");
        Af0.a aVar = this.f108996d;
        d11 = aVar.d();
        String str = this.f108993a;
        if (d11 && (a12 = Af0.a.a(aVar)) != null) {
            a12.b("Добавление асинхронной задачи в очередь выполнения для " + str, null, null);
        }
        this.f108998f.tryEmit(task);
        d12 = aVar.d();
        if (!d12 || (a11 = Af0.a.a(aVar)) == null) {
            return;
        }
        a11.b("Асинхронная задача добавлена в очередь выполнения для " + str, null, null);
    }

    @NotNull
    public final EnumC9053a f() {
        return this.f109000h;
    }

    @NotNull
    public final String g() {
        return this.f108993a;
    }

    @NotNull
    public final B0<qf0.e> h() {
        return this.f108999g;
    }

    public final long i() {
        return this.f109001i;
    }

    @NotNull
    public final AbstractC9267a j() {
        return this.f108994b;
    }

    @NotNull
    public final d.b k() {
        return this.f108995c;
    }
}
