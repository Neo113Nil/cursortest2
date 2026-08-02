package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ztf implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ buf b;

    public /* synthetic */ ztf(buf bufVar, int i) {
        this.a = i;
        this.b = bufVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        buf bufVar = this.b;
        switch (i) {
            case 0:
                bufVar.n(null, new c31(((Boolean) obj).booleanValue(), 10));
                break;
            default:
                bufVar.n(null, new c31(((Boolean) obj).booleanValue(), 11));
                break;
        }
        return Unit.a;
    }
}
