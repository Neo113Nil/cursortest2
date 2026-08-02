package l1;

import android.graphics.Shader;
import k1.C7464j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class F0 extends AbstractC7799Q {
    private long createdSize;
    private Shader internalShader;

    public F0() {
        super(null);
        this.createdSize = 9205357640488583168L;
    }

    @Override // l1.AbstractC7799Q
    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public final void mo69applyToPq9zytI(long j11, @NotNull r0 r0Var, float f7) {
        long j12;
        long j13;
        Shader shader = this.internalShader;
        if (shader == null || !C7464j.c(this.createdSize, j11)) {
            if (C7464j.g(j11)) {
                shader = null;
                this.internalShader = null;
                this.createdSize = 9205357640488583168L;
            } else {
                shader = mo70createShaderuvyYCjk(j11);
                this.internalShader = shader;
                this.createdSize = j11;
            }
        }
        long a11 = r0Var.a();
        j12 = C7807Z.f72248b;
        if (!C7807Z.p(a11, j12)) {
            j13 = C7807Z.f72248b;
            r0Var.b(j13);
        }
        if (!Intrinsics.d(r0Var.e(), shader)) {
            r0Var.f(shader);
        }
        if (r0Var.getAlpha() == f7) {
            return;
        }
        r0Var.setAlpha(f7);
    }

    @NotNull
    /* renamed from: createShader-uvyYCjk, reason: not valid java name */
    public abstract Shader mo70createShaderuvyYCjk(long j11);
}
