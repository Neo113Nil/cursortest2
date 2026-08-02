package Ge;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Fe.a f3937a;

    public c(Fe.a commonPreferencesRepository) {
        Intrinsics.checkNotNullParameter(commonPreferencesRepository, "commonPreferencesRepository");
        this.f3937a = commonPreferencesRepository;
    }

    public final C5582a a(De.a preferenceKey) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return this.f3937a.m(preferenceKey);
    }

    public final C5582a b(De.a preferenceKey, boolean z10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return this.f3937a.o(preferenceKey, z10);
    }
}
