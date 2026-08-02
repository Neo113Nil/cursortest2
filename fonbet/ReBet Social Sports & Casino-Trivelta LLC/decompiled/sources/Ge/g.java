package Ge;

import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Fe.a f3941a;

    public g(Fe.a commonPreferencesRepository) {
        Intrinsics.checkNotNullParameter(commonPreferencesRepository, "commonPreferencesRepository");
        this.f3941a = commonPreferencesRepository;
    }

    public final C5582a a(String id2, Pe.b conversationAttributes) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(conversationAttributes, "conversationAttributes");
        return this.f3941a.h(id2, conversationAttributes);
    }

    public final C5582a b(String str) {
        return this.f3941a.j(str);
    }

    public final C5582a c(Long l10) {
        return this.f3941a.t(l10);
    }

    public final C5582a d(Pe.b bVar) {
        return this.f3941a.n(bVar);
    }
}
