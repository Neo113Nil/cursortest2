package v80;

import A30.m;
import kotlin.jvm.internal.Intrinsics;
import v80.C10274a;
import y80.C10863b;

/* loaded from: classes3.dex */
public final class e implements Jb.e<C10863b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<S80.b> f102560a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f102561b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<m> f102562c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<R30.a> f102563d;

    public e(Pc.a<S80.b> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2, Pc.a<m> aVar3, Pc.a<R30.a> aVar4) {
        this.f102560a = aVar;
        this.f102561b = aVar2;
        this.f102562c = aVar3;
        this.f102563d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        S80.b fintechNavigation = (S80.b) ((C10274a.s) this.f102560a).get();
        ru.ozon.fintech.settings.domain.a fintechSettings = (ru.ozon.fintech.settings.domain.a) ((C10274a.f) this.f102561b).get();
        m fintechAuthInteractor = (m) ((C10274a.d) this.f102562c).get();
        R30.a appCoroutineScopes = (R30.a) ((C10274a.l) this.f102563d).get();
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        return new C10863b(fintechAuthInteractor, appCoroutineScopes, fintechNavigation, fintechSettings);
    }
}
