package Re;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10226a;

    public n(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10226a = conversationsRepository;
    }

    public final C5582a a(De.a preferenceKey, boolean z10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return this.f10226a.n(preferenceKey, z10);
    }
}
