package gg0;

import Ld0.c;
import Ld0.e;
import Od0.a;
import Od0.c;
import Od0.d;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import hg0.InterfaceC6951a;
import java.util.Iterator;
import java.util.List;
import jg0.f;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qg0.InterfaceC9056a;
import rg0.C9270b;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.app.android.sentry.di.module.SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1;
import ru.ozon.ozonSentryHelper.internal.ui.debugActivity.SentryHelperDebugActivity;
import ru.ozon.uni.ozi.config.OziConfigKt;
import s20.d;
import sg0.InterfaceC9693a;
import tg0.C9873a;
import zb0.c;

/* renamed from: gg0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6732b extends d<InterfaceC6951a> implements Od0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1 f64469a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9270b> f64470b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9873a f64471c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC6951a> f64472d;

    /* renamed from: gg0.b$a */
    public static final class a extends s20.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f64473a;

        /* renamed from: gg0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C1042a extends d.a {

            /* renamed from: a, reason: collision with root package name */
            private final String f64474a = "ozonSentryHelper";

            /* renamed from: b, reason: collision with root package name */
            private final String f64475b = "OzonSentryHelper";

            /* renamed from: c, reason: collision with root package name */
            private final Function1<s20.c, Intent> f64476c;

            /* renamed from: gg0.b$a$a$a, reason: collision with other inner class name */
            static final class C1043a extends AbstractC7737t implements Function1<s20.c, Intent> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f64477b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1043a(c cVar) {
                    super(1);
                    this.f64477b = cVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Intent invoke(s20.c cVar) {
                    s20.c request = cVar;
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intent intent = new Intent(this.f64477b.c().a(), (Class<?>) SentryHelperDebugActivity.class);
                    intent.setData(request.a());
                    return intent;
                }
            }

            C1042a(c cVar) {
                this.f64476c = new C1043a(cVar);
            }

            @Override // s20.d.a
            public final String getId() {
                return this.f64474a;
            }

            @Override // s20.d.a
            public final Function1<s20.c, Intent> getIntent() {
                return this.f64476c;
            }

            @Override // s20.d.a
            public final String getName() {
                return this.f64475b;
            }
        }

        a(c cVar) {
            this.f64473a = cVar;
        }

        @Override // s20.b
        public final s20.d provide() {
            return new C1042a(this.f64473a);
        }
    }

    /* renamed from: gg0.b$b, reason: collision with other inner class name */
    public static final class C1044b extends zb0.d {

        /* renamed from: a, reason: collision with root package name */
        private final c.b f64478a;

        C1044b(C6732b c6732b) {
            this.f64478a = c6732b.f64471c;
        }

        @Override // zb0.d
        public final c.b c() {
            return this.f64478a;
        }
    }

    public C6732b(@NotNull SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1 config, @NotNull InterfaceC4008j deeplinkHandlerLazy, @NotNull C9873a ozonIdCookieEventListener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(deeplinkHandlerLazy, "deeplinkHandlerLazy");
        Intrinsics.checkNotNullParameter(ozonIdCookieEventListener, "ozonIdCookieEventListener");
        this.f64469a = config;
        this.f64470b = deeplinkHandlerLazy;
        this.f64471c = ozonIdCookieEventListener;
        this.f64472d = InterfaceC6951a.class;
    }

    @Override // Od0.b
    public final void beforeHandleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // Od0.b
    public final boolean canHandle(@NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f64470b.getValue().getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri a11 = deeplink.a();
        return Intrinsics.d(a11 != null ? a11.getHost() : null, "ozonSentryHelper");
    }

    @Override // Od0.d
    public final InterfaceC6951a create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        ug0.b platformDependencies = new ug0.b(store);
        SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1 config = this.f64469a;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(platformDependencies, "platformDependencies");
        C6731a c6731a = new C6731a();
        f.f70086a.k(config, platformDependencies);
        Iterator it = f.f().iterator();
        while (it.hasNext()) {
            ((InterfaceC9056a) it.next()).initialize();
        }
        return c6731a;
    }

    @Override // Od0.d
    @NotNull
    public final List<Ld0.f> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        a aVar = null;
        try {
            OziConfigKt.getGlobalOziConfig();
            aVar = new a(diStore);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        Ld0.f[] elements = {aVar, new C1044b(this)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC6951a> getKey() {
        return this.f64472d;
    }

    @Override // Od0.b
    @NotNull
    public final Od0.a handleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink, @NotNull Context activityContext) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Uri a11 = deeplink.a();
        if (a11 == null) {
            return new a.c();
        }
        e d11 = store.d(AbToolBaseApi.class);
        AbToolLibsApi abToolLibsApi = d11 instanceof AbToolLibsApi ? (AbToolLibsApi) d11 : null;
        if (abToolLibsApi == null) {
            a.c cVar = new a.c();
            InterfaceC9693a.f98765a.d();
            return cVar;
        }
        Nd0.b b11 = store.c().b();
        boolean z11 = true;
        if ((!(deeplink instanceof c.a) || !Intrinsics.d(((c.a) deeplink).b().getStringExtra("TEST_USER"), "ENABLED")) && b11 != Nd0.b.DEBUG && !abToolLibsApi.isOzonQa() && !abToolLibsApi.isOzonEmployee()) {
            z11 = false;
        }
        return this.f64470b.getValue().c(a11, z11);
    }

    @Override // Od0.d
    public final boolean isLazyInitializationEnabled() {
        return false;
    }
}
