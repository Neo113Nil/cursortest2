package Ge;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Fe.a f3946a;

    public k(Fe.a commonPreferencesRepository) {
        Intrinsics.checkNotNullParameter(commonPreferencesRepository, "commonPreferencesRepository");
        this.f3946a = commonPreferencesRepository;
    }

    public final C5582a a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f3946a.u(key, value);
    }

    public final C5582a b() {
        return this.f3946a.q();
    }
}
