package k2;

import j2.C7241a;
import j2.f;
import m2.C8043a;

/* loaded from: classes8.dex */
public final class c extends j2.d {

    /* renamed from: n0, reason: collision with root package name */
    private f.c f70296n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f70297o0;

    /* renamed from: p0, reason: collision with root package name */
    private C8043a f70298p0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70299a;

        static {
            int[] iArr = new int[f.c.values().length];
            f70299a = iArr;
            try {
                iArr[f.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70299a[f.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70299a[f.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70299a[f.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70299a[f.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70299a[f.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(j2.f fVar) {
        super(fVar, f.d.BARRIER);
    }

    @Override // j2.d
    public final m2.j J() {
        if (this.f70298p0 == null) {
            this.f70298p0 = new C8043a();
        }
        return this.f70298p0;
    }

    public final void L(f.c cVar) {
        this.f70296n0 = cVar;
    }

    @Override // j2.d, j2.C7241a, j2.e
    public final void apply() {
        J();
        int i11 = a.f70299a[this.f70296n0.ordinal()];
        int i12 = 3;
        if (i11 == 3 || i11 == 4) {
            i12 = 1;
        } else if (i11 == 5) {
            i12 = 2;
        } else if (i11 != 6) {
            i12 = 0;
        }
        this.f70298p0.h1(i12);
        this.f70298p0.i1(this.f70297o0);
    }

    @Override // j2.C7241a
    public final C7241a s(int i11) {
        this.f70297o0 = i11;
        return this;
    }

    @Override // j2.C7241a
    public final C7241a t(Float f7) {
        this.f70297o0 = this.f68888k0.d(f7);
        return this;
    }
}
