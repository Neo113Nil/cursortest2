package Dd;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Cd.a f2673a;

    public j(Cd.a authenticationRepository) {
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        this.f2673a = authenticationRepository;
    }

    public final C5582a a(Bd.b salesIQAuth) {
        Intrinsics.checkNotNullParameter(salesIQAuth, "salesIQAuth");
        return this.f2673a.d(salesIQAuth);
    }
}
