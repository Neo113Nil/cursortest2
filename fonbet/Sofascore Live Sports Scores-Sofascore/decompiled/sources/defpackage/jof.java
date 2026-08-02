package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jof implements ddi, nj2, pt8 {
    public final /* synthetic */ ddi a;

    @Nullable
    private final yda job;

    public jof(f1d f1dVar, yda ydaVar) {
        this.a = f1dVar;
        this.job = ydaVar;
    }

    @Override // defpackage.xdh
    public final List a() {
        return this.a.a();
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        return this.a.collect(b98Var, rq3Var);
    }

    @Override // defpackage.pt8
    public final z88 e(CoroutineContext coroutineContext, int i, a62 a62Var) {
        return (((i < 0 || i >= 2) && i != -2) || a62Var != a62.b) ? beh.c(this, coroutineContext, i, a62Var) : this;
    }

    @Override // defpackage.ddi
    public final Object getValue() {
        return this.a.getValue();
    }
}
