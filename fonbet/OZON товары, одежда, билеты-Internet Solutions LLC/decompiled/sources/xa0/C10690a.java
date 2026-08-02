package xa0;

import A30.m;
import Jb.j;
import c90.InterfaceC5773a;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import s30.InterfaceC9590a;
import wa0.InterfaceC10467a;
import xa0.d;
import y30.InterfaceC10835a;
import ya0.C10877b;

/* renamed from: xa0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10690a implements InterfaceC10467a {

    /* renamed from: a, reason: collision with root package name */
    private final O90.a f105245a;

    /* renamed from: b, reason: collision with root package name */
    private final P30.b f105246b;

    /* renamed from: c, reason: collision with root package name */
    private final Y20.a f105247c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9590a f105248d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10835a f105249e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<InterfaceC5773a> f105250f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<Moshi> f105251g;

    /* renamed from: xa0.a$a, reason: collision with other inner class name */
    private static final class C2277a implements Pc.a<InterfaceC5773a> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f105252a;

        C2277a(Z80.a aVar) {
            this.f105252a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC5773a get() {
            InterfaceC5773a T02 = this.f105252a.T0();
            j.c(T02);
            return T02;
        }
    }

    C10690a(Y20.a aVar, P30.b bVar, Z80.a aVar2, O90.a aVar3, InterfaceC10835a interfaceC10835a, InterfaceC9590a interfaceC9590a) {
        d dVar;
        this.f105245a = aVar3;
        this.f105246b = bVar;
        this.f105247c = aVar;
        this.f105248d = interfaceC9590a;
        this.f105249e = interfaceC10835a;
        this.f105250f = new C2277a(aVar2);
        dVar = d.a.f105254a;
        this.f105251g = Jb.d.b(dVar);
    }

    @Override // wa0.InterfaceC10467a
    public final C10877b P() {
        O90.a aVar = this.f105245a;
        Q90.c featureToggles = aVar.F0();
        j.c(featureToggles);
        P30.b bVar = this.f105246b;
        O30.b fintechLibType = bVar.M0();
        j.c(fintechLibType);
        ru.ozon.fintech.settings.domain.a fintechSettings = aVar.w0();
        j.c(fintechSettings);
        InterfaceC6618a fintechAnalyticInteractor = this.f105247c.B();
        j.c(fintechAnalyticInteractor);
        S30.a applicationInfoDataSource = bVar.getApplicationInfoDataSource();
        j.c(applicationInfoDataSource);
        v30.d fintechAntiFraudInteractor = this.f105248d.o1();
        j.c(fintechAntiFraudInteractor);
        m fintechAuthInteractor = this.f105249e.a1();
        j.c(fintechAuthInteractor);
        Ib.a testEnvironmentManagerLazy = Jb.d.a(this.f105250f);
        Moshi moshi = this.f105251g.get();
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(testEnvironmentManagerLazy, "testEnvironmentManagerLazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new C10877b(featureToggles, fintechLibType, fintechSettings, fintechAnalyticInteractor, applicationInfoDataSource, fintechAntiFraudInteractor, fintechAuthInteractor, testEnvironmentManagerLazy, moshi);
    }
}
