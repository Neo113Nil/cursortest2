package kd0;

import Sc.InterfaceC4008j;
import We.B;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nc0.C8490a;
import ob0.t;
import ob0.u;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8921d;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;
import rc0.C9245b;
import ru.ozon.app.android.limb2.di.modules.Limb2PluginProvidersModule;
import ru.ozon.id.nativeauth.sso2.C9549c;

/* renamed from: kd0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7667a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Fb0.f> f71431a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<t> f71432b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<u> f71433c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ub0.a> f71434d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ic0.g> f71435e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8490a> f71436f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9549c> f71437g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9245b> f71438h;

    /* renamed from: kd0.a$a, reason: collision with other inner class name */
    public static final class C1171a extends AbstractC8921d {

        /* renamed from: b, reason: collision with root package name */
        private final pf0.j f71439b = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC8923f f71440c = EnumC8923f.AppInterceptor;

        /* renamed from: d, reason: collision with root package name */
        private final String f71441d = "x-o3-language";

        /* renamed from: e, reason: collision with root package name */
        private final Function0<String> f71442e;

        /* renamed from: kd0.a$a$a, reason: collision with other inner class name */
        static final class C1172a extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7667a f71444b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1172a(C7667a c7667a) {
                super(0);
                this.f71444b = c7667a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                Ub0.d localeProvider$lambda$1;
                localeProvider$lambda$1 = Limb2PluginProvidersModule.getLocaleProvider$lambda$1((InterfaceC4008j) ((BY.b) ((Fb0.f) this.f71444b.f71431a.getValue()).getLocaleProvider()).f3307a);
                return localeProvider$lambda$1.d().toLanguageTag();
            }
        }

        C1171a() {
            this.f71442e = new C1172a(C7667a.this);
        }

        @Override // pf0.AbstractC8921d
        public final Function0<String> c() {
            return this.f71442e;
        }

        @Override // pf0.AbstractC8921d, pf0.AbstractC8922e
        public final B getInterceptor() {
            return (Ub0.a) C7667a.this.f71434d.getValue();
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71441d;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71439b;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71440c;
        }
    }

    /* renamed from: kd0.a$b */
    public static final class b extends AbstractC8922e {

        /* renamed from: a, reason: collision with root package name */
        private final pf0.j f71445a = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC8923f f71446b = EnumC8923f.AppInterceptor;

        /* renamed from: c, reason: collision with root package name */
        private final String f71447c = "initAuth";

        b() {
        }

        @Override // pf0.AbstractC8922e
        public final B getInterceptor() {
            return (Ic0.g) C7667a.this.f71435e.getValue();
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71447c;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71445a;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71446b;
        }
    }

    /* renamed from: kd0.a$c */
    public static final class c extends AbstractC8922e {

        /* renamed from: a, reason: collision with root package name */
        private final pf0.j f71449a = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC8923f f71450b = EnumC8923f.AppInterceptor;

        /* renamed from: c, reason: collision with root package name */
        private final String f71451c = "migrateSharedStorage";

        c() {
        }

        @Override // pf0.AbstractC8922e
        public final B getInterceptor() {
            return (C9245b) C7667a.this.f71438h.getValue();
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71451c;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71449a;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71450b;
        }
    }

    /* renamed from: kd0.a$d */
    public static final class d extends AbstractC8922e {

        /* renamed from: a, reason: collision with root package name */
        private final pf0.j f71453a = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC8923f f71454b = EnumC8923f.AppInterceptor;

        /* renamed from: c, reason: collision with root package name */
        private final String f71455c = "autologinInterceptor";

        d() {
        }

        @Override // pf0.AbstractC8922e
        public final B getInterceptor() {
            return (C8490a) C7667a.this.f71436f.getValue();
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71455c;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71453a;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71454b;
        }
    }

    /* renamed from: kd0.a$e */
    public static final class e extends AbstractC8921d {

        /* renamed from: b, reason: collision with root package name */
        private final pf0.j f71457b = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC8923f f71458c = EnumC8923f.AppInterceptor;

        /* renamed from: d, reason: collision with root package name */
        private final String f71459d = "x-o3-app-name";

        /* renamed from: e, reason: collision with root package name */
        private final Function0<String> f71460e;

        /* renamed from: kd0.a$e$a, reason: collision with other inner class name */
        static final class C1173a extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7667a f71461b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1173a(C7667a c7667a) {
                super(0);
                this.f71461b = c7667a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((Fb0.f) this.f71461b.f71431a.getValue()).getAppName().a();
            }
        }

        e(C7667a c7667a) {
            this.f71460e = new C1173a(c7667a);
        }

        @Override // pf0.AbstractC8921d
        public final Function0<String> c() {
            return this.f71460e;
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71459d;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71457b;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71458c;
        }
    }

    /* renamed from: kd0.a$f */
    public static final class f extends AbstractC8921d {

        /* renamed from: b, reason: collision with root package name */
        private final pf0.j f71462b = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC8923f f71463c = EnumC8923f.AppInterceptor;

        /* renamed from: d, reason: collision with root package name */
        private final String f71464d = "x-o3-app-version";

        /* renamed from: e, reason: collision with root package name */
        private final Function0<String> f71465e;

        /* renamed from: kd0.a$f$a, reason: collision with other inner class name */
        static final class C1174a extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7667a f71466b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1174a(C7667a c7667a) {
                super(0);
                this.f71466b = c7667a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((Fb0.f) this.f71466b.f71431a.getValue()).getAppVersion();
            }
        }

        f(C7667a c7667a) {
            this.f71465e = new C1174a(c7667a);
        }

        @Override // pf0.AbstractC8921d
        public final Function0<String> c() {
            return this.f71465e;
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71464d;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71462b;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71463c;
        }
    }

    /* renamed from: kd0.a$g */
    public static final class g extends AbstractC8921d {

        /* renamed from: b, reason: collision with root package name */
        private final pf0.j f71467b = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC8923f f71468c = EnumC8923f.AppInterceptor;

        /* renamed from: d, reason: collision with root package name */
        private final String f71469d = "user-agent";

        /* renamed from: e, reason: collision with root package name */
        private final Function0<String> f71470e;

        /* renamed from: kd0.a$g$a, reason: collision with other inner class name */
        static final class C1175a extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7667a f71471b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1175a(C7667a c7667a) {
                super(0);
                this.f71471b = c7667a;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((Fb0.f) this.f71471b.f71431a.getValue()).getUserAgent();
            }
        }

        g(C7667a c7667a) {
            this.f71470e = new C1175a(c7667a);
        }

        @Override // pf0.AbstractC8921d
        public final Function0<String> c() {
            return this.f71470e;
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71469d;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71467b;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71468c;
        }
    }

    /* renamed from: kd0.a$h */
    public static final class h extends AbstractC8922e {

        /* renamed from: a, reason: collision with root package name */
        private final pf0.j f71472a = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC8923f f71473b = EnumC8923f.OzonIdAppInterceptor;

        /* renamed from: c, reason: collision with root package name */
        private final String f71474c = "antibotInterceptor";

        h() {
        }

        @Override // pf0.AbstractC8922e
        public final B getInterceptor() {
            return (t) C7667a.this.f71432b.getValue();
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71474c;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71472a;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71473b;
        }
    }

    /* renamed from: kd0.a$i */
    public static final class i extends AbstractC8922e {

        /* renamed from: a, reason: collision with root package name */
        private final pf0.j f71476a = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC8923f f71477b = EnumC8923f.NetworkInterceptor;

        /* renamed from: c, reason: collision with root package name */
        private final String f71478c = "sso2CheckDomainNetworkInterceptor";

        i() {
        }

        @Override // pf0.AbstractC8922e
        public final B getInterceptor() {
            return (C9549c) C7667a.this.f71437g.getValue();
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71478c;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71476a;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71477b;
        }
    }

    /* renamed from: kd0.a$j */
    public static final class j extends AbstractC8922e {

        /* renamed from: a, reason: collision with root package name */
        private final pf0.j f71480a = pf0.j.PROD_BUILDS_ALL_USERS;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC8923f f71481b = EnumC8923f.OzonIdNetworkInterceptor;

        /* renamed from: c, reason: collision with root package name */
        private final String f71482c = "antibotNetworkInterceptor";

        j() {
        }

        @Override // pf0.AbstractC8922e
        public final B getInterceptor() {
            return (u) C7667a.this.f71433c.getValue();
        }

        @Override // pf0.AbstractC8922e
        public final String getKey() {
            return this.f71482c;
        }

        @Override // pf0.AbstractC8922e
        public final pf0.j getOzonNetworkDevToolsLevel() {
            return this.f71480a;
        }

        @Override // pf0.AbstractC8922e
        public final EnumC8923f getType() {
            return this.f71481b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7667a(@NotNull InterfaceC4008j<? extends Fb0.f> ozonIdConfig, @NotNull InterfaceC4008j<t> antibotInterceptor, @NotNull InterfaceC4008j<u> antibotNetworkInterceptor, @NotNull InterfaceC4008j<Ub0.a> localeInterceptor, @NotNull InterfaceC4008j<Ic0.g> initSessionInterceptor, @NotNull InterfaceC4008j<C8490a> autologinInterceptor, @NotNull InterfaceC4008j<C9549c> sso2CheckDomainNetworkInterceptor, @NotNull InterfaceC4008j<C9245b> sharedStoreMigrationInterceptor) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(antibotInterceptor, "antibotInterceptor");
        Intrinsics.checkNotNullParameter(antibotNetworkInterceptor, "antibotNetworkInterceptor");
        Intrinsics.checkNotNullParameter(localeInterceptor, "localeInterceptor");
        Intrinsics.checkNotNullParameter(initSessionInterceptor, "initSessionInterceptor");
        Intrinsics.checkNotNullParameter(autologinInterceptor, "autologinInterceptor");
        Intrinsics.checkNotNullParameter(sso2CheckDomainNetworkInterceptor, "sso2CheckDomainNetworkInterceptor");
        Intrinsics.checkNotNullParameter(sharedStoreMigrationInterceptor, "sharedStoreMigrationInterceptor");
        this.f71431a = ozonIdConfig;
        this.f71432b = antibotInterceptor;
        this.f71433c = antibotNetworkInterceptor;
        this.f71434d = localeInterceptor;
        this.f71435e = initSessionInterceptor;
        this.f71436f = autologinInterceptor;
        this.f71437g = sso2CheckDomainNetworkInterceptor;
        this.f71438h = sharedStoreMigrationInterceptor;
    }

    @NotNull
    public final List<AbstractC8922e> i() {
        return C7714v.b0(new b(), new c(), new d(), new e(this), new f(this), new g(this), new h(), new i(), new j(), new C1171a());
    }
}
