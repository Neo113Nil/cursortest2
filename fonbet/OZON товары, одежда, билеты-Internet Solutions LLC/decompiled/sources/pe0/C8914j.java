package pe0;

import Ae.M0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe0.C9049d;
import re0.C9260c;
import we0.p;

/* renamed from: pe0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8914j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8907c f80476a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9260c f80477b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8908d f80478c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9049d f80479d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C8912h f80480e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<p> f80481f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C8913i f80482g;

    public C8914j(@NotNull C8907c followCameraController, @NotNull C9260c locationPulseListener, @NotNull C8908d internalLocationListener, @NotNull C9049d locationModifierByCompass, @NotNull C8912h initLocationInterpolator, @NotNull M0 initUserPinLocationStateFlow, @NotNull C8913i searchUserPinManager) {
        Intrinsics.checkNotNullParameter(followCameraController, "followCameraController");
        Intrinsics.checkNotNullParameter(locationPulseListener, "locationPulseListener");
        Intrinsics.checkNotNullParameter(internalLocationListener, "internalLocationListener");
        Intrinsics.checkNotNullParameter(locationModifierByCompass, "locationModifierByCompass");
        Intrinsics.checkNotNullParameter(initLocationInterpolator, "initLocationInterpolator");
        Intrinsics.checkNotNullParameter(initUserPinLocationStateFlow, "initUserPinLocationStateFlow");
        Intrinsics.checkNotNullParameter(searchUserPinManager, "searchUserPinManager");
        this.f80476a = followCameraController;
        this.f80477b = locationPulseListener;
        this.f80478c = internalLocationListener;
        this.f80479d = locationModifierByCompass;
        this.f80480e = initLocationInterpolator;
        this.f80481f = initUserPinLocationStateFlow;
        this.f80482g = searchUserPinManager;
    }

    @NotNull
    public final C8907c a() {
        return this.f80476a;
    }

    @NotNull
    public final C8912h b() {
        return this.f80480e;
    }

    @NotNull
    public final M0<p> c() {
        return this.f80481f;
    }

    @NotNull
    public final C8908d d() {
        return this.f80478c;
    }

    @NotNull
    public final C9049d e() {
        return this.f80479d;
    }

    @NotNull
    public final C9260c f() {
        return this.f80477b;
    }

    @NotNull
    public final C8913i g() {
        return this.f80482g;
    }
}
