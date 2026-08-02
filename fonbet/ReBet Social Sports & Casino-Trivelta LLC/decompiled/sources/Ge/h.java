package Ge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Fe.a f3942a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3943b;

    public h(Fe.a commonPreferencesRepository) {
        Intrinsics.checkNotNullParameter(commonPreferencesRepository, "commonPreferencesRepository");
        this.f3942a = commonPreferencesRepository;
        this.f3943b = new LinkedHashMap();
    }

    public static /* synthetic */ C5582a c(h hVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return hVar.b(z10);
    }

    public final C5582a a() {
        return c(this, false, 1, null);
    }

    public final C5582a b(boolean z10) {
        return this.f3942a.g(this.f3943b, z10);
    }

    public final C5582a d() {
        return this.f3942a.f();
    }

    public final h e(De.a preferenceKey, boolean z10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        this.f3943b.put(preferenceKey, Boolean.valueOf(z10));
        return this;
    }

    public final h f(De.a preferenceKey, int i10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        this.f3943b.put(preferenceKey, Integer.valueOf(i10));
        return this;
    }

    public final h g(De.a preferenceKey, long j10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        this.f3943b.put(preferenceKey, Long.valueOf(j10));
        return this;
    }

    public final h h(De.a preferenceKey, String str) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        this.f3943b.put(preferenceKey, str);
        return this;
    }

    public final h i(De.a preferenceKey, Set set) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        this.f3943b.put(preferenceKey, set);
        return this;
    }
}
