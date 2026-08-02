package j2;

import m2.e;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final String f68875h = new String("FIXED_DIMENSION");

    /* renamed from: i, reason: collision with root package name */
    public static final String f68876i = new String("WRAP_DIMENSION");

    /* renamed from: j, reason: collision with root package name */
    public static final String f68877j = new String("SPREAD_DIMENSION");

    /* renamed from: k, reason: collision with root package name */
    public static final String f68878k = new String("PARENT_DIMENSION");

    /* renamed from: l, reason: collision with root package name */
    public static final String f68879l = new String("PERCENT_DIMENSION");

    /* renamed from: m, reason: collision with root package name */
    public static final String f68880m = new String("RATIO_DIMENSION");

    /* renamed from: f, reason: collision with root package name */
    String f68886f;

    /* renamed from: a, reason: collision with root package name */
    int f68881a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f68882b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    float f68883c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    int f68884d = 0;

    /* renamed from: e, reason: collision with root package name */
    String f68885e = null;

    /* renamed from: g, reason: collision with root package name */
    boolean f68887g = false;

    private c(String str) {
        this.f68886f = str;
    }

    public static c b() {
        String str = f68876i;
        c cVar = new c(f68875h);
        cVar.f68886f = str;
        return cVar;
    }

    public static c c(int i11) {
        c cVar = new c(f68875h);
        cVar.f68886f = null;
        cVar.f68884d = i11;
        return cVar;
    }

    public static c d() {
        return new c(f68878k);
    }

    public static c e(float f7) {
        c cVar = new c(f68879l);
        cVar.f68883c = f7;
        return cVar;
    }

    public static c f(String str) {
        c cVar = new c(f68880m);
        cVar.f68885e = str;
        return cVar;
    }

    public static c g(String str) {
        c cVar = new c();
        cVar.f68881a = 0;
        cVar.f68882b = Integer.MAX_VALUE;
        cVar.f68883c = 1.0f;
        cVar.f68884d = 0;
        cVar.f68885e = null;
        cVar.f68886f = str;
        cVar.f68887g = true;
        return cVar;
    }

    public static c h() {
        return new c(f68876i);
    }

    public final void a(m2.e eVar, int i11) {
        String str = this.f68885e;
        if (str != null) {
            eVar.s0(str);
        }
        String str2 = f68878k;
        String str3 = f68879l;
        String str4 = f68876i;
        int i12 = 2;
        if (i11 == 0) {
            if (this.f68887g) {
                eVar.C0(e.b.MATCH_CONSTRAINT);
                String str5 = this.f68886f;
                if (str5 == str4) {
                    i12 = 1;
                } else if (str5 != str3) {
                    i12 = 0;
                }
                eVar.D0(i12, this.f68881a, this.f68882b, this.f68883c);
                return;
            }
            int i13 = this.f68881a;
            if (i13 > 0) {
                eVar.M0(i13);
            }
            int i14 = this.f68882b;
            if (i14 < Integer.MAX_VALUE) {
                eVar.J0(i14);
            }
            String str6 = this.f68886f;
            if (str6 == str4) {
                eVar.C0(e.b.WRAP_CONTENT);
                return;
            }
            if (str6 == str2) {
                eVar.C0(e.b.MATCH_PARENT);
                return;
            } else {
                if (str6 == null) {
                    eVar.C0(e.b.FIXED);
                    eVar.T0(this.f68884d);
                    return;
                }
                return;
            }
        }
        if (this.f68887g) {
            eVar.Q0(e.b.MATCH_CONSTRAINT);
            String str7 = this.f68886f;
            if (str7 == str4) {
                i12 = 1;
            } else if (str7 != str3) {
                i12 = 0;
            }
            eVar.R0(i12, this.f68881a, this.f68882b, this.f68883c);
            return;
        }
        int i15 = this.f68881a;
        if (i15 > 0) {
            eVar.L0(i15);
        }
        int i16 = this.f68882b;
        if (i16 < Integer.MAX_VALUE) {
            eVar.I0(i16);
        }
        String str8 = this.f68886f;
        if (str8 == str4) {
            eVar.Q0(e.b.WRAP_CONTENT);
            return;
        }
        if (str8 == str2) {
            eVar.Q0(e.b.MATCH_PARENT);
        } else if (str8 == null) {
            eVar.Q0(e.b.FIXED);
            eVar.z0(this.f68884d);
        }
    }

    public final void i(int i11) {
        if (i11 >= 0) {
            this.f68881a = i11;
        }
    }
}
