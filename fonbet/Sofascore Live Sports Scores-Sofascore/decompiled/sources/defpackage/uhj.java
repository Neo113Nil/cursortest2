package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uhj implements z88 {
    public final /* synthetic */ pog a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public uhj(pog pogVar, int i, List list) {
        this.a = pogVar;
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new ca8(b98Var, this.b, this.c), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
