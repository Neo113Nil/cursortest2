package sj;

import Ej.o;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kb0.EnumC7626a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;
import ru.ozon.host.config.external.AppId;
import yj.C10910a;
import za0.InterfaceC11014a;

/* loaded from: classes6.dex */
public final class e extends Ej.d<AndroidLogEntry, sj.a, c> {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e f98817f = new e();

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f98818g = k.b(b.f98822b);

    /* renamed from: h, reason: collision with root package name */
    private static Ld0.c f98819h;

    private static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final o<?> f98820a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private AtomicInteger f98821b;

        public a(@NotNull o<?> repository) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            this.f98820a = repository;
            this.f98821b = new AtomicInteger();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f98821b.incrementAndGet();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (this.f98821b.decrementAndGet() == 0) {
                this.f98820a.g(true);
            }
        }
    }

    static final class b extends AbstractC7737t implements Function0<zj.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f98822b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final zj.d invoke() {
            return new zj.d();
        }
    }

    public static void r(Ld0.c cVar) {
        f98819h = cVar;
    }

    @Override // Ej.d
    public final c b() {
        String str;
        String str2;
        EnumC7626a G11;
        String b11;
        AppId m11;
        Ld0.c cVar = f98819h;
        if (cVar == null) {
            throw new IllegalStateException("Для создания дефолтного конфига нужно инициализировать limbDiStore");
        }
        InterfaceC11014a interfaceC11014a = (InterfaceC11014a) cVar.d(InterfaceC11014a.class);
        Application a11 = cVar.c().a();
        if (interfaceC11014a == null || (m11 = interfaceC11014a.m()) == null || (str = m11.getAppName()) == null) {
            str = "android-libs";
        }
        c cVar2 = new c(a11, "0yRPAKMBv3ysRu930sidkFewzuvwxKODye2LqqULWDzGCVFWb2FrTvOMRoJ9UO66", str);
        cVar2.x("5121cb6e-f924-40ba-8854-31c136cdab85");
        if (interfaceC11014a == null || (G11 = interfaceC11014a.G()) == null || (b11 = G11.b()) == null) {
            str2 = null;
        } else {
            str2 = b11.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
        }
        cVar2.q(str2);
        cVar2.p(cVar.c().b() == Nd0.b.DEBUG);
        return cVar2;
    }

    @Override // Ej.d
    public final C10910a c(ru.ozon.android.ozonLogger.core.e eVar, Ej.b currentTimeProvider) {
        c config = (c) eVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        return new C10910a(config, currentTimeProvider);
    }

    @Override // Ej.d
    public final xj.d d(ru.ozon.android.ozonLogger.core.e eVar) {
        c config = (c) eVar;
        Intrinsics.checkNotNullParameter(config, "config");
        return new xj.d(config);
    }

    @Override // Ej.d
    protected final void j() {
        h().u().registerActivityLifecycleCallbacks(new a(i()));
    }

    @NotNull
    public final d q(@NotNull sj.a config) {
        Intrinsics.checkNotNullParameter(config, "config");
        c globalConfig = h();
        o<AndroidLogEntry> repository = i();
        Ej.b currentTimeProvider = g();
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        return new d(globalConfig, config, repository, currentTimeProvider);
    }
}
