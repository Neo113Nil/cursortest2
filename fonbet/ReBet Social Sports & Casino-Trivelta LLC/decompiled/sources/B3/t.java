package B3;

import java.util.Collections;

/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: i, reason: collision with root package name */
    public final Object f692i;

    public t(G3.c cVar) {
        this(cVar, null);
    }

    @Override // B3.a
    public float c() {
        return 1.0f;
    }

    @Override // B3.a
    public Object h() {
        G3.c cVar = this.f620e;
        Object obj = this.f692i;
        return cVar.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    @Override // B3.a
    public Object i(G3.a aVar, float f10) {
        return h();
    }

    @Override // B3.a
    public void l() {
        if (this.f620e != null) {
            super.l();
        }
    }

    @Override // B3.a
    public void n(float f10) {
        this.f619d = f10;
    }

    public t(G3.c cVar, Object obj) {
        super(Collections.EMPTY_LIST);
        o(cVar);
        this.f692i = obj;
    }
}
