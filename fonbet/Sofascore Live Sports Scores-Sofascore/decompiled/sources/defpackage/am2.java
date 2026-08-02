package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class am2 extends p8 {
    public final int c;
    public final boolean d;
    public final Integer e;
    public final yzc f;
    public final Function1 g;
    public final ox1 h;
    public final p12 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am2(View view, int i, boolean z, Integer num, yzc yzcVar, k43 k43Var, ox1 ox1Var) {
        super(view);
        view.getClass();
        yzcVar.getClass();
        k43Var.getClass();
        this.c = i;
        this.d = z;
        this.e = num;
        this.f = yzcVar;
        this.g = k43Var;
        this.h = ox1Var;
        this.i = p12.a(view);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        m22 m22Var = (m22) obj;
        m22Var.getClass();
        pd0.j(this.i, m22Var, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
