package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zp4 implements xj9 {
    public final xh9 a;
    public final ij9 b;
    public final lek c;
    public final w89 d;
    public final xh3 e;

    public zp4(xh9 xh9Var, zj9 zj9Var) {
        this.a = xh9Var;
        this.b = zj9Var.b;
        this.c = zj9Var.a;
        this.d = zj9Var.c;
        this.e = zj9Var.f;
    }

    @Override // defpackage.gj9
    public final o89 a() {
        return this.d;
    }

    @Override // defpackage.xj9
    public final xh3 getAttributes() {
        return this.e;
    }

    @Override // defpackage.xj9, defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    @Override // defpackage.xj9
    public final ij9 getMethod() {
        return this.b;
    }

    @Override // defpackage.xj9
    public final lek getUrl() {
        return this.c;
    }
}
