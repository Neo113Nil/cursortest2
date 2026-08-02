package j00;

import android.app.Application;
import f00.InterfaceC6396b;
import g00.InterfaceC6608a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import n00.e;
import n00.f;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;
import p00.InterfaceC8826b;

/* renamed from: j00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7234a implements InterfaceC6396b, InterfaceC6608a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f68711a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Nd0.b f68712b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Application f68713c;

    public C7234a(@NotNull f storage, @NotNull Nd0.b buildType, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(buildType, "buildType");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f68711a = storage;
        this.f68712b = buildType;
        this.f68713c = application;
    }

    @Override // f00.InterfaceC6396b
    public final boolean C() {
        return !(this.f68711a.b() != null ? r0.booleanValue() : false);
    }

    @Override // f00.InterfaceC6396b
    public final boolean E(@NotNull InterfaceC8826b.a flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return this.f68711a.c(flag);
    }

    @NotNull
    public final Application N() {
        return this.f68713c;
    }

    public final void O(@NotNull String key, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f68711a.e(key, z11);
    }

    public final void P(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f68711a.g(token);
    }

    public final void Q(@NotNull InterfaceC8826b.a flagInfo, boolean z11) {
        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
        this.f68711a.f(flagInfo, Boolean.valueOf(z11));
    }

    public final void R(@NotNull InterfaceC8826b.AbstractC1343b flagInfo, @NotNull String value) {
        Intrinsics.checkNotNullParameter(flagInfo, "flagInfo");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68711a.f(flagInfo, value);
    }

    @NotNull
    public final e S() {
        return this.f68711a.h();
    }

    @Override // f00.InterfaceC6396b
    public final boolean k() {
        return this.f68712b == Nd0.b.DEBUG;
    }

    @Override // Ld0.e
    public final void onInstantPluginsCreated() {
    }

    @Override // g00.InterfaceC6608a
    public final String v() {
        String d11 = this.f68711a.d(C8829e.f80013b);
        if (h.K(d11)) {
            return null;
        }
        return d11;
    }
}
