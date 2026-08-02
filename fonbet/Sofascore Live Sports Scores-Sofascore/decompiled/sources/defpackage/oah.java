package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class oah extends n52 {
    public by9 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.n52
    public final void a(float f, long j, gtj gtjVar) {
        Paint paint = (Paint) gtjVar.d;
        by9 by9Var = this.a;
        if (by9Var == null || !njh.c(this.b, j)) {
            if (njh.g(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                by9Var = null;
            } else {
                by9Var = this.a;
                if (by9Var == null) {
                    by9Var = new by9();
                    this.a = by9Var;
                }
                by9Var.a = b(j);
                this.a = by9Var;
                this.b = j;
            }
        }
        long b = hkg.b(paint.getColor());
        long j2 = r13.b;
        if (!e8k.a(b, j2)) {
            gtjVar.v(j2);
        }
        if (!Intrinsics.c((Shader) gtjVar.e, by9Var != null ? (Shader) by9Var.a : null)) {
            gtjVar.z(by9Var != null ? (Shader) by9Var.a : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        gtjVar.t(f);
    }

    public abstract Shader b(long j);
}
