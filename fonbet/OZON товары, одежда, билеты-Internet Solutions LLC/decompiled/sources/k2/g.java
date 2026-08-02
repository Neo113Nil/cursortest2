package k2;

import androidx.annotation.NonNull;
import j2.f;
import l2.C7853b;

/* loaded from: classes8.dex */
public final class g extends j2.d {

    /* renamed from: A0, reason: collision with root package name */
    private String f70332A0;

    /* renamed from: B0, reason: collision with root package name */
    private int f70333B0;

    /* renamed from: n0, reason: collision with root package name */
    private C7853b f70334n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f70335o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f70336p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f70337q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f70338r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f70339s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f70340t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f70341u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f70342v0;

    /* renamed from: w0, reason: collision with root package name */
    private float f70343w0;

    /* renamed from: x0, reason: collision with root package name */
    private String f70344x0;

    /* renamed from: y0, reason: collision with root package name */
    private String f70345y0;

    /* renamed from: z0, reason: collision with root package name */
    private String f70346z0;

    public g(@NonNull j2.f fVar, @NonNull f.d dVar) {
        super(fVar, dVar);
        this.f70335o0 = 0;
        this.f70336p0 = 0;
        this.f70337q0 = 0;
        this.f70338r0 = 0;
        if (dVar == f.d.ROW) {
            this.f70340t0 = 1;
        } else if (dVar == f.d.COLUMN) {
            this.f70341u0 = 1;
        }
    }

    @Override // j2.d
    @NonNull
    public final m2.j J() {
        if (this.f70334n0 == null) {
            this.f70334n0 = new C7853b();
        }
        return this.f70334n0;
    }

    public final void L(@NonNull String str) {
        this.f70345y0 = str;
    }

    public final void M(int i11) {
        if (K() == f.d.ROW) {
            return;
        }
        this.f70341u0 = i11;
    }

    public final void N(int i11) {
        this.f70333B0 = i11;
    }

    public final void O(@NonNull String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] split = str.split("\\|");
        this.f70333B0 = 0;
        for (String str2 : split) {
            String lowerCase = str2.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("subgridbycolrow")) {
                this.f70333B0 |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.f70333B0 |= 2;
            }
        }
    }

    public final void P(float f7) {
        this.f70342v0 = f7;
    }

    public final void Q(int i11) {
        this.f70339s0 = i11;
    }

    public final void R(int i11) {
        this.f70338r0 = i11;
    }

    public final void S(int i11) {
        this.f70336p0 = i11;
    }

    public final void T(int i11) {
        this.f70335o0 = i11;
    }

    public final void U(int i11) {
        this.f70337q0 = i11;
    }

    public final void V(@NonNull String str) {
        this.f70344x0 = str;
    }

    public final void W(int i11) {
        if (K() == f.d.COLUMN) {
            return;
        }
        this.f70340t0 = i11;
    }

    public final void X(@NonNull String str) {
        this.f70332A0 = str;
    }

    public final void Y(@NonNull String str) {
        this.f70346z0 = str;
    }

    public final void Z(float f7) {
        this.f70343w0 = f7;
    }

    @Override // j2.d, j2.C7241a, j2.e
    public final void apply() {
        J();
        this.f70334n0.H1(this.f70339s0);
        int i11 = this.f70340t0;
        if (i11 != 0) {
            this.f70334n0.J1(i11);
        }
        int i12 = this.f70341u0;
        if (i12 != 0) {
            this.f70334n0.E1(i12);
        }
        float f7 = this.f70342v0;
        if (f7 != 0.0f) {
            this.f70334n0.G1(f7);
        }
        float f11 = this.f70343w0;
        if (f11 != 0.0f) {
            this.f70334n0.M1(f11);
        }
        String str = this.f70344x0;
        if (str != null && !str.isEmpty()) {
            this.f70334n0.I1(this.f70344x0);
        }
        String str2 = this.f70345y0;
        if (str2 != null && !str2.isEmpty()) {
            this.f70334n0.D1(this.f70345y0);
        }
        String str3 = this.f70346z0;
        if (str3 != null && !str3.isEmpty()) {
            this.f70334n0.L1(this.f70346z0);
        }
        String str4 = this.f70332A0;
        if (str4 != null && !str4.isEmpty()) {
            this.f70334n0.K1(this.f70332A0);
        }
        this.f70334n0.F1(this.f70333B0);
        this.f70334n0.r1(this.f70335o0);
        this.f70334n0.o1(this.f70336p0);
        this.f70334n0.s1(this.f70337q0);
        this.f70334n0.n1(this.f70338r0);
        I();
    }
}
