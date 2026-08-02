package Od;

import ie.EnumC4544a;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Nd.a f8621a;

    public e(Nd.a brandRepository) {
        Intrinsics.checkNotNullParameter(brandRepository, "brandRepository");
        this.f8621a = brandRepository;
    }

    public final C5582a a(EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        return this.f8621a.g(appStatus);
    }
}
