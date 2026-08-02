package wf0;

import Ae.InterfaceC2395h;
import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.d;
import qf0.e;
import rf0.AbstractC9267a;
import sf0.C9690a;
import sf0.C9691b;
import yf0.C10896f;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2259a f104498b = new C2259a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f104499a;

    /* renamed from: wf0.a$a, reason: collision with other inner class name */
    public static final class C2259a {
    }

    static final class b extends AbstractC7737t implements Function0<C10896f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ wf0.b f104500b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wf0.b bVar) {
            super(0);
            this.f104500b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10896f invoke() {
            Intrinsics.checkNotNullParameter(a.f104498b, "<this>");
            return new C10896f(this.f104500b);
        }
    }

    public a(@NotNull wf0.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f104499a = k.b(new b(config));
    }

    public final void a(long j11, @NotNull String domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        b().g().f(j11, domain);
    }

    @NotNull
    public final C10896f b() {
        return (C10896f) this.f104499a.getValue();
    }

    @NotNull
    public final InterfaceC2395h<e> c(@NotNull String... domains) {
        Intrinsics.checkNotNullParameter(domains, "domains");
        return b().g().i((String[]) Arrays.copyOf(domains, domains.length));
    }

    @NotNull
    public final d d() {
        return b().h();
    }

    public final void e(@NotNull String domain, @NotNull AbstractC9267a config, @NotNull d.b mode) throws C9691b, C9690a {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().g().m(domain, config, mode);
    }
}
