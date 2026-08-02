package Re;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10213a;

    public e(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10213a = conversationsRepository;
    }

    public final C5582a a(De.a preferenceKey, boolean z10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return this.f10213a.b(preferenceKey, z10);
    }
}
