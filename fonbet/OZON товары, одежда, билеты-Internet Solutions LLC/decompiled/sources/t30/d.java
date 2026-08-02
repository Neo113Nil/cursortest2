package t30;

import kotlin.jvm.internal.Intrinsics;
import t30.g;
import w30.q;

/* loaded from: classes3.dex */
public final class d implements Jb.e<q> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f99058a;

    public d(Pc.a<ru.ozon.fintech.settings.domain.a> aVar) {
        this.f99058a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((g.a.h) this.f99058a).get();
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        return new q(fintechSettings);
    }
}
