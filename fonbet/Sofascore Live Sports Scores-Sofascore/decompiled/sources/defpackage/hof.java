package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hof implements xdh, nj2, pt8 {
    public final /* synthetic */ xdh a;

    @Nullable
    private final yda job;

    public hof(b1d b1dVar, g9i g9iVar) {
        this.a = b1dVar;
        this.job = g9iVar;
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
        return beh.c(this, coroutineContext, i, a62Var);
    }
}
