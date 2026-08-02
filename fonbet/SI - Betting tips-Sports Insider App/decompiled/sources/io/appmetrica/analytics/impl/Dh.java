package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Dh extends X4 {

    /* renamed from: w, reason: collision with root package name */
    public final String f12146w;

    /* renamed from: x, reason: collision with root package name */
    public final E6 f12147x;

    public Dh(@NonNull Context context, @NonNull Q4 q42, @NonNull C0372o4 c0372o4, @NonNull E6 e62, @NonNull C0161fm c0161fm, @NonNull V4 v42, @NonNull InterfaceC0476s9 interfaceC0476s9) {
        this(context, q42, new C0268k0(), new TimePassedChecker(), new C0067c5(context, q42, c0372o4, v42, c0161fm, new C0634yh(e62), C0353na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0353na.k().l(), interfaceC0476s9), e62, c0372o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(@NonNull C0372o4 c0372o4) {
        super.a(c0372o4);
        this.f12147x.a(this.f12146w, c0372o4.f14389i);
    }

    public Dh(Context context, Q4 q42, C0268k0 c0268k0, TimePassedChecker timePassedChecker, C0067c5 c0067c5, E6 e62, C0372o4 c0372o4) {
        super(context, q42, c0268k0, timePassedChecker, c0067c5, c0372o4);
        this.f12146w = q42.b();
        this.f12147x = e62;
    }
}
