package n00;

import j00.C7235b;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import p00.InterfaceC8826b;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f76264a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8406a f76265b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7235b f76266c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Set<InterfaceC8826b<? extends Object>> f76267d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final h f76268e;

    public f(@NotNull c stateHolder, @NotNull C8406a diskStorage, @NotNull C7235b composerDebugTokenDelegate, @NotNull Set<InterfaceC8826b<? extends Object>> registeredFlags) {
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(diskStorage, "diskStorage");
        Intrinsics.checkNotNullParameter(composerDebugTokenDelegate, "composerDebugTokenDelegate");
        Intrinsics.checkNotNullParameter(registeredFlags, "registeredFlags");
        this.f76264a = stateHolder;
        this.f76265b = diskStorage;
        this.f76266c = composerDebugTokenDelegate;
        this.f76267d = registeredFlags;
        composerDebugTokenDelegate.a();
        Tc.d builder = new Tc.d();
        Iterator<T> it = registeredFlags.iterator();
        while (it.hasNext()) {
            InterfaceC8826b interfaceC8826b = (InterfaceC8826b) it.next();
            builder.put(interfaceC8826b, this.f76265b.c(interfaceC8826b));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f76264a.d(builder.u());
        this.f76268e = new h(this.f76264a.c());
    }

    public final Boolean b() {
        Intrinsics.checkNotNullParameter("COMPOSER_ALERTS_DISABLED", "argumentName");
        return this.f76264a.a();
    }

    public final boolean c(@NotNull InterfaceC8826b.a flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return ((Boolean) this.f76264a.b(flag)).booleanValue();
    }

    @NotNull
    public final String d(@NotNull C8829e flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return (String) this.f76264a.b(flag);
    }

    public final void e(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f76264a.e(key, z11);
    }

    public final <T> void f(@NotNull InterfaceC8826b<T> flagInfo, @NotNull T value) {
        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f76265b.f(flagInfo, value);
        this.f76264a.f(flagInfo, value);
    }

    public final void g(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f76266c.b(token);
    }

    @NotNull
    public final e h() {
        return new e(this.f76264a.g(), this);
    }
}
