package g6;

import androidx.annotation.NonNull;
import e6.AbstractC6306d;

/* loaded from: classes8.dex */
public final class e extends AbstractC6306d<c> {
    public e(c cVar) {
        super(cVar);
    }

    @Override // V5.v
    public final void a() {
        c cVar = (c) this.f62023a;
        cVar.stop();
        cVar.e();
    }

    @Override // V5.v
    @NonNull
    public final Class<c> b() {
        return c.class;
    }

    @Override // V5.v
    public final int getSize() {
        return ((c) this.f62023a).d();
    }

    @Override // e6.AbstractC6306d, V5.r
    public final void initialize() {
        ((c) this.f62023a).c().prepareToDraw();
    }
}
