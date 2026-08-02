package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Vj extends X4 {
    public Vj(@NonNull Context context, @NonNull C0161fm c0161fm, @NonNull Q4 q42, @NonNull C0372o4 c0372o4, @NonNull InterfaceC0208hh interfaceC0208hh, @NonNull V4 v42, @NonNull P4 p42) {
        this(context, q42, new C0268k0(), new TimePassedChecker(), new C0067c5(context, q42, c0372o4, v42, c0161fm, interfaceC0208hh, C0353na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0353na.k().l(), p42), c0372o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Ea
    @NonNull
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public Vj(Context context, Q4 q42, C0268k0 c0268k0, TimePassedChecker timePassedChecker, C0067c5 c0067c5, C0372o4 c0372o4) {
        super(context, q42, c0268k0, timePassedChecker, c0067c5, c0372o4);
    }
}
