package defpackage;

import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rh9 implements xj9 {
    public final ij9 a;
    public final lek b;
    public final xh3 c;
    public final w89 d;

    public rh9(yj9 yj9Var) {
        this.a = yj9Var.b;
        this.b = yj9Var.a.b();
        this.c = yj9Var.f;
        this.d = new w89((Map) yj9Var.c.b);
    }

    @Override // defpackage.gj9
    public final o89 a() {
        return this.d;
    }

    @Override // defpackage.xj9
    public final xh3 getAttributes() {
        return this.c;
    }

    @Override // defpackage.xj9, defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // defpackage.xj9
    public final ij9 getMethod() {
        return this.a;
    }

    @Override // defpackage.xj9
    public final lek getUrl() {
        return this.b;
    }
}
