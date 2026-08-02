package o7;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o7.InterfaceC5820b;

/* loaded from: classes2.dex */
public final class j extends AbstractC5826h {

    /* renamed from: A, reason: collision with root package name */
    public long f59440A;

    /* renamed from: B, reason: collision with root package name */
    public long f59441B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f59442C;

    /* renamed from: D, reason: collision with root package name */
    public int f59443D;

    /* renamed from: E, reason: collision with root package name */
    public int f59444E;

    /* renamed from: F, reason: collision with root package name */
    public Throwable f59445F;

    /* renamed from: G, reason: collision with root package name */
    public EnumC5823e f59446G;

    /* renamed from: H, reason: collision with root package name */
    public n f59447H;

    /* renamed from: I, reason: collision with root package name */
    public long f59448I;

    /* renamed from: J, reason: collision with root package name */
    public long f59449J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC5820b.a f59450K;

    /* renamed from: r, reason: collision with root package name */
    public String f59451r;

    /* renamed from: s, reason: collision with root package name */
    public String f59452s;

    /* renamed from: t, reason: collision with root package name */
    public Object f59453t;

    /* renamed from: u, reason: collision with root package name */
    public Object f59454u;

    /* renamed from: v, reason: collision with root package name */
    public Object f59455v;

    /* renamed from: w, reason: collision with root package name */
    public long f59456w;

    /* renamed from: x, reason: collision with root package name */
    public long f59457x;

    /* renamed from: y, reason: collision with root package name */
    public long f59458y;

    /* renamed from: z, reason: collision with root package name */
    public long f59459z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k infra) {
        super(infra);
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.f59456w = -1L;
        this.f59457x = -1L;
        this.f59458y = -1L;
        this.f59459z = -1L;
        this.f59440A = -1L;
        this.f59441B = -1L;
        this.f59443D = -1;
        this.f59444E = -1;
        this.f59446G = EnumC5823e.f59376c;
        this.f59447H = n.f59467c;
        this.f59448I = -1L;
        this.f59449J = -1L;
    }

    public final void A(long j10) {
        this.f59458y = j10;
    }

    public final void B(String str) {
        this.f59451r = str;
    }

    public final void C(long j10) {
        this.f59457x = j10;
    }

    public final void D(long j10) {
        this.f59456w = j10;
    }

    public final void E(Throwable th2) {
        this.f59445F = th2;
    }

    public final void F(InterfaceC5820b.a aVar) {
        this.f59450K = aVar;
    }

    public final void G(Object obj) {
        this.f59455v = obj;
    }

    public final void H(EnumC5823e enumC5823e) {
        Intrinsics.checkNotNullParameter(enumC5823e, "<set-?>");
        this.f59446G = enumC5823e;
    }

    public final void I(Object obj) {
        this.f59453t = obj;
    }

    public final void J(long j10) {
        this.f59441B = j10;
    }

    public final void K(long j10) {
        this.f59440A = j10;
    }

    public final void L(long j10) {
        this.f59449J = j10;
    }

    public final void M(int i10) {
        this.f59444E = i10;
    }

    public final void N(int i10) {
        this.f59443D = i10;
    }

    public final void O(boolean z10) {
        this.f59442C = z10;
    }

    public final void P(String str) {
        this.f59452s = str;
    }

    public final void Q(long j10) {
        this.f59448I = j10;
    }

    public final void R(boolean z10) {
        this.f59447H = z10 ? n.f59468d : n.f59469e;
    }

    public final C5824f S() {
        return new C5824f(j(), this.f59451r, this.f59452s, this.f59453t, this.f59454u, this.f59455v, this.f59456w, this.f59457x, this.f59458y, this.f59459z, this.f59440A, this.f59441B, f(), n(), this.f59442C, this.f59443D, this.f59444E, this.f59445F, this.f59447H, this.f59448I, this.f59449J, null, this.f59450K, a(), o(), c(), d(), b(), r(), q(), l(), p(), CollectionsKt.toList(k()), m(), h(), i(), g(), e());
    }

    public final void w() {
        this.f59452s = null;
        this.f59453t = null;
        this.f59454u = null;
        this.f59455v = null;
        this.f59442C = false;
        this.f59443D = -1;
        this.f59444E = -1;
        this.f59445F = null;
        this.f59446G = EnumC5823e.f59376c;
        this.f59447H = n.f59467c;
        this.f59450K = null;
        x();
        s();
    }

    public final void x() {
        this.f59440A = -1L;
        this.f59441B = -1L;
        this.f59456w = -1L;
        this.f59458y = -1L;
        this.f59459z = -1L;
        this.f59448I = -1L;
        this.f59449J = -1L;
        k().clear();
        u(false);
        t(null);
        v(null);
    }

    public final void y(Object obj) {
        this.f59454u = obj;
    }

    public final void z(long j10) {
        this.f59459z = j10;
    }
}
