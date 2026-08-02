package Od;

import ie.EnumC4544a;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Nd.a f8620a;

    public d(Nd.a brandRepository) {
        Intrinsics.checkNotNullParameter(brandRepository, "brandRepository");
        this.f8620a = brandRepository;
    }

    public final C5582a a(EnumC4544a appStatus, String str, String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        return this.f8620a.h(appStatus, str, str2, z10);
    }
}
