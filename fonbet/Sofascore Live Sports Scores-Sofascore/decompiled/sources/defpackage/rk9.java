package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rk9 implements m4h {
    public final vh9 a;
    public int b;
    public xh9 c;

    public rk9(vh9 vh9Var) {
        this.a = vh9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.m4h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yj9 yj9Var, sq3 sq3Var) {
        qk9 qk9Var;
        int i;
        xh9 xh9Var;
        if (sq3Var instanceof qk9) {
            qk9Var = (qk9) sq3Var;
            int i2 = qk9Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qk9Var.t = i2 - Integer.MIN_VALUE;
                Object obj = qk9Var.r;
                lu3 lu3Var = lu3.a;
                i = qk9Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    xh9 xh9Var2 = this.c;
                    if (xh9Var2 != null) {
                        s9a.o(xh9Var2, null);
                    }
                    int i3 = this.b;
                    if (i3 >= 20) {
                        throw new kx2("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.", 7);
                    }
                    this.b = i3 + 1;
                    rj9 rj9Var = this.a.g;
                    Object obj2 = yj9Var.d;
                    qk9Var.t = 1;
                    obj = rj9Var.a(yj9Var, obj2, qk9Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                xh9Var = !(obj instanceof xh9) ? (xh9) obj : null;
                if (xh9Var == null) {
                    this.c = xh9Var;
                    return xh9Var;
                }
                cp4.g(obj, "Failed to execute send pipeline. Expected [HttpClientCall], but received ");
                return null;
            }
        }
        qk9Var = new qk9(this, sq3Var);
        Object obj3 = qk9Var.r;
        lu3 lu3Var2 = lu3.a;
        i = qk9Var.t;
        if (i != 0) {
        }
        if (!(obj3 instanceof xh9)) {
        }
        if (xh9Var == null) {
        }
    }
}
