package r1;

import Kk.C3532b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.C7786D;
import l1.C7790H;
import l1.C7807Z;
import l1.C7837o0;
import l1.K0;
import n1.C8408a;
import n1.C8409b;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9155c extends j {

    /* renamed from: b, reason: collision with root package name */
    private float[] f82664b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f82665c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f82666d;

    /* renamed from: e, reason: collision with root package name */
    private long f82667e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private List<? extends g> f82668f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f82669g;

    /* renamed from: h, reason: collision with root package name */
    private C7786D f82670h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC7737t f82671i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function1<j, Unit> f82672j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private String f82673k;

    /* renamed from: l, reason: collision with root package name */
    private float f82674l;

    /* renamed from: m, reason: collision with root package name */
    private float f82675m;

    /* renamed from: n, reason: collision with root package name */
    private float f82676n;

    /* renamed from: o, reason: collision with root package name */
    private float f82677o;

    /* renamed from: p, reason: collision with root package name */
    private float f82678p;

    /* renamed from: q, reason: collision with root package name */
    private float f82679q;

    /* renamed from: r, reason: collision with root package name */
    private float f82680r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f82681s;

    /* renamed from: r1.c$a */
    static final class a extends AbstractC7737t implements Function1<j, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(j jVar) {
            j jVar2 = jVar;
            C9155c c9155c = C9155c.this;
            c9155c.j(jVar2);
            Function1<j, Unit> b11 = c9155c.b();
            if (b11 != null) {
                b11.invoke(jVar2);
            }
            return Unit.f71690a;
        }
    }

    public C9155c() {
        super(0);
        long j11;
        this.f82665c = new ArrayList();
        this.f82666d = true;
        j11 = C7807Z.f72259m;
        this.f82667e = j11;
        this.f82668f = m.a();
        this.f82669g = true;
        this.f82672j = new a();
        this.f82673k = "";
        this.f82677o = 1.0f;
        this.f82678p = 1.0f;
        this.f82681s = true;
    }

    private final void i(long j11) {
        long j12;
        if (this.f82666d && j11 != 16) {
            long j13 = this.f82667e;
            if (j13 == 16) {
                this.f82667e = j11;
                return;
            }
            int i11 = m.f82827b;
            if (C7807Z.u(j13) == C7807Z.u(j11) && C7807Z.t(j13) == C7807Z.t(j11) && C7807Z.r(j13) == C7807Z.r(j11)) {
                return;
            }
            this.f82666d = false;
            j12 = C7807Z.f72259m;
            this.f82667e = j12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(j jVar) {
        long j11;
        long j12;
        long j13;
        if (!(jVar instanceof f)) {
            if (jVar instanceof C9155c) {
                C9155c c9155c = (C9155c) jVar;
                if (c9155c.f82666d && this.f82666d) {
                    i(c9155c.f82667e);
                    return;
                }
                this.f82666d = false;
                j11 = C7807Z.f72259m;
                this.f82667e = j11;
                return;
            }
            return;
        }
        f fVar = (f) jVar;
        AbstractC7799Q e11 = fVar.e();
        if (this.f82666d && e11 != null) {
            if (e11 instanceof K0) {
                i(((K0) e11).a());
            } else {
                this.f82666d = false;
                j13 = C7807Z.f72259m;
                this.f82667e = j13;
            }
        }
        AbstractC7799Q f7 = fVar.f();
        if (this.f82666d && f7 != null) {
            if (f7 instanceof K0) {
                i(((K0) f7).a());
                return;
            }
            this.f82666d = false;
            j12 = C7807Z.f72259m;
            this.f82667e = j12;
        }
    }

    @Override // r1.j
    public final void a(@NotNull InterfaceC8412e interfaceC8412e) {
        if (this.f82681s) {
            float[] fArr = this.f82664b;
            if (fArr == null) {
                fArr = C7837o0.b();
                this.f82664b = fArr;
            } else {
                C7837o0.e(fArr);
            }
            C7837o0.i(this.f82679q + this.f82675m, this.f82680r + this.f82676n, fArr);
            C7837o0.f(this.f82674l, fArr);
            C7837o0.g(this.f82677o, this.f82678p, fArr);
            C7837o0.i(-this.f82675m, -this.f82676n, fArr);
            this.f82681s = false;
        }
        if (this.f82669g) {
            if (!this.f82668f.isEmpty()) {
                C7786D c7786d = this.f82670h;
                if (c7786d == null) {
                    c7786d = C7790H.a();
                    this.f82670h = c7786d;
                }
                i.b(this.f82668f, c7786d);
            }
            this.f82669g = false;
        }
        C8408a.b w02 = interfaceC8412e.w0();
        long e11 = w02.e();
        w02.a().save();
        try {
            C8409b f7 = w02.f();
            float[] fArr2 = this.f82664b;
            if (fArr2 != null) {
                f7.f(C7837o0.a(fArr2).j());
            }
            C7786D c7786d2 = this.f82670h;
            if (!this.f82668f.isEmpty() && c7786d2 != null) {
                f7.a(c7786d2);
            }
            ArrayList arrayList = this.f82665c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((j) arrayList.get(i11)).a(interfaceC8412e);
            }
            C3532b.b(w02, e11);
        } catch (Throwable th2) {
            C3532b.b(w02, e11);
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<r1.j, kotlin.Unit>, kotlin.jvm.internal.t] */
    @Override // r1.j
    public final Function1<j, Unit> b() {
        return this.f82671i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r1.j
    public final void d(Function1<? super j, Unit> function1) {
        this.f82671i = (AbstractC7737t) function1;
    }

    public final long f() {
        return this.f82667e;
    }

    public final void g(int i11, @NotNull j jVar) {
        ArrayList arrayList = this.f82665c;
        if (i11 < arrayList.size()) {
            arrayList.set(i11, jVar);
        } else {
            arrayList.add(jVar);
        }
        j(jVar);
        jVar.d(this.f82672j);
        c();
    }

    public final boolean h() {
        return this.f82666d;
    }

    public final void k(@NotNull List<? extends g> list) {
        this.f82668f = list;
        this.f82669g = true;
        c();
    }

    public final void l(@NotNull String str) {
        this.f82673k = str;
        c();
    }

    public final void m(float f7) {
        this.f82675m = f7;
        this.f82681s = true;
        c();
    }

    public final void n(float f7) {
        this.f82676n = f7;
        this.f82681s = true;
        c();
    }

    public final void o(float f7) {
        this.f82674l = f7;
        this.f82681s = true;
        c();
    }

    public final void p(float f7) {
        this.f82677o = f7;
        this.f82681s = true;
        c();
    }

    public final void q(float f7) {
        this.f82678p = f7;
        this.f82681s = true;
        c();
    }

    public final void r(float f7) {
        this.f82679q = f7;
        this.f82681s = true;
        c();
    }

    public final void s(float f7) {
        this.f82680r = f7;
        this.f82681s = true;
        c();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f82673k);
        ArrayList arrayList = this.f82665c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) arrayList.get(i11);
            sb2.append("\t");
            sb2.append(jVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
