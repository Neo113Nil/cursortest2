package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l0m implements b98 {
    public final /* synthetic */ f7m a;

    public l0m(f7m f7mVar) {
        this.a = f7mVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int ordinal = ((ksl) obj).ordinal();
        f7m f7mVar = this.a;
        if (ordinal == 0) {
            f7mVar.b.invoke();
        } else {
            if (ordinal != 1) {
                zzl.b();
                return null;
            }
            f7mVar.c.invoke();
        }
        return Unit.a;
    }
}
