package Ge;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Fe.a f3936a;

    public b(Fe.a commonPreferencesRepository) {
        Intrinsics.checkNotNullParameter(commonPreferencesRepository, "commonPreferencesRepository");
        this.f3936a = commonPreferencesRepository;
    }

    public final C5582a a() {
        return this.f3936a.l();
    }

    public final C5582a b(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f3936a.s(id2);
    }

    public final C5582a c() {
        return this.f3936a.p();
    }
}
