package j40;

import Jb.f;
import Jb.j;
import android.content.Context;
import g30.InterfaceC6618a;
import i40.InterfaceC7007a;
import k40.C7481b;
import kotlin.jvm.internal.Intrinsics;
import l40.InterfaceC7871a;

/* renamed from: j40.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7282e implements InterfaceC7007a {

    /* renamed from: a, reason: collision with root package name */
    private final O90.a f69438a;

    /* renamed from: b, reason: collision with root package name */
    private final Y20.a f69439b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<Context> f69440c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<J7.c> f69441d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<S80.b> f69442e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<Q90.c> f69443f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f69444g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<InterfaceC7871a> f69445h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<InterfaceC7871a> f69446i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j40.e$a */
    static final class a implements Pc.a<Q90.c> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f69447a;

        a(O90.a aVar) {
            this.f69447a = aVar;
        }

        @Override // Pc.a
        public final Q90.c get() {
            Q90.c F02 = this.f69447a.F0();
            j.c(F02);
            return F02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j40.e$b */
    static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f69448a;

        b(Y20.a aVar) {
            this.f69448a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f69448a.B();
            j.c(B11);
            return B11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j40.e$c */
    static final class c implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f69449a;

        c(P30.b bVar) {
            this.f69449a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f69449a.h();
            j.c(h11);
            return h11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j40.e$d */
    static final class d implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f69450a;

        d(M80.a aVar) {
            this.f69450a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f69450a.d0();
            j.c(d02);
            return d02;
        }
    }

    C7282e(Y20.a aVar, P30.b bVar, O90.a aVar2, M80.a aVar3, M90.a aVar4) {
        this.f69438a = aVar2;
        this.f69439b = aVar;
        c cVar = new c(bVar);
        this.f69440c = cVar;
        Pc.a<J7.c> b11 = Jb.d.b(new C7279b(cVar));
        this.f69441d = b11;
        d dVar = new d(aVar3);
        this.f69442e = dVar;
        a aVar5 = new a(aVar2);
        this.f69443f = aVar5;
        b bVar2 = new b(aVar);
        this.f69444g = bVar2;
        this.f69445h = Jb.d.b(new C7280c(b11, dVar, aVar5, bVar2));
        this.f69446i = Jb.d.b(new C7281d(f.a(aVar4), this.f69443f, this.f69444g));
    }

    @Override // i40.InterfaceC7007a
    public final C7481b Z() {
        O90.a aVar = this.f69438a;
        ru.ozon.fintech.settings.domain.a fintechSettings = aVar.w0();
        j.c(fintechSettings);
        InterfaceC7871a gmsReviewService = this.f69445h.get();
        InterfaceC7871a rustoreReviewService = this.f69446i.get();
        InterfaceC6618a fintechAnalyticInteractor = this.f69439b.B();
        j.c(fintechAnalyticInteractor);
        Q90.c featureToggles = aVar.F0();
        j.c(featureToggles);
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(gmsReviewService, "gmsReviewService");
        Intrinsics.checkNotNullParameter(rustoreReviewService, "rustoreReviewService");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        return new C7481b(fintechSettings, gmsReviewService, rustoreReviewService, featureToggles, fintechAnalyticInteractor);
    }
}
