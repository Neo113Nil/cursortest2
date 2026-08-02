package lb0;

import kb0.EnumC7626a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.host.config.external.AppId;

/* renamed from: lb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7914a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AppId f73159a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC7626a f73160b;

    /* renamed from: lb0.a$a, reason: collision with other inner class name */
    public static final class C1230a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AppId f73161a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final EnumC7626a f73162b;

        public C1230a(@NotNull AppId appId, @NotNull EnumC7626a hostAppEnv) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(hostAppEnv, "hostAppEnv");
            this.f73161a = appId;
            this.f73162b = hostAppEnv;
        }

        @NotNull
        public final C7914a a() {
            return new C7914a(this.f73161a, this.f73162b);
        }
    }

    public C7914a(AppId appId, EnumC7626a enumC7626a) {
        this.f73159a = appId;
        this.f73160b = enumC7626a;
    }

    @NotNull
    public final AppId a() {
        return this.f73159a;
    }

    @NotNull
    public final EnumC7626a b() {
        return this.f73160b;
    }
}
