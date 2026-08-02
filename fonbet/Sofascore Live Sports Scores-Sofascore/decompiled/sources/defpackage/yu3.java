package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yu3 implements db2 {
    public final db2 b;
    public final w52 c = new w52();
    public long d;
    public long e;

    public yu3(db2 db2Var) {
        this.b = db2Var;
    }

    @Override // defpackage.db2
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.db2
    public final Throwable b() {
        return this.b.b();
    }

    public final void c() {
        d();
        this.d += this.c.i(this.b.f());
    }

    public final void d() {
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c.c;
        this.e = (j2 - j3) + j;
        this.d = j3;
    }

    @Override // defpackage.db2
    public final w52 f() {
        c();
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.db2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, sq3 sq3Var) {
        xu3 xu3Var;
        Object obj;
        int i2;
        if (sq3Var instanceof xu3) {
            xu3Var = (xu3) sq3Var;
            int i3 = xu3Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xu3Var.t = i3 - Integer.MIN_VALUE;
                obj = xu3Var.r;
                lu3 lu3Var = lu3.a;
                i2 = xu3Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    c();
                    if (this.c.c >= i) {
                        return Boolean.TRUE;
                    }
                    xu3Var.t = 1;
                    obj = this.b.g(i, xu3Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                c();
                return Boolean.TRUE;
            }
        }
        xu3Var = new xu3(this, sq3Var);
        obj = xu3Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = xu3Var.t;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.db2
    public final boolean h() {
        return this.c.w() && this.b.h();
    }
}
