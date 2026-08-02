package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pm3 implements swf {
    public final am3 a;
    public Handler b;
    public final a5f c = new a5f(new om3(this, 0));
    public boolean d = true;
    public final om3 e = new om3(this, 1);
    public final ArrayList f = new ArrayList();

    public pm3(am3 am3Var) {
        this.a = am3Var;
    }

    @Override // defpackage.swf
    public final void a() {
        this.c.j();
    }

    @Override // defpackage.swf
    public final void d() {
        a5f a5fVar = this.c;
        imf imfVar = (imf) a5fVar.i;
        if (imfVar != null) {
            imfVar.f();
        }
        a5fVar.a();
    }

    @Override // defpackage.swf
    public final void b() {
    }
}
