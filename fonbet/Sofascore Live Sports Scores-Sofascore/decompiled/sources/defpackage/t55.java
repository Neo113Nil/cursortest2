package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t55 extends xka implements Function0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ nqg j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t55(boolean z, nqg nqgVar, String str) {
        super(0);
        this.i = z;
        this.j = nqgVar;
        this.k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.i) {
            nqg nqgVar = this.j;
            String str = this.k;
            pqg pqgVar = nqgVar.a;
            synchronized (((haf) pqgVar.f)) {
            }
        }
        return Unit.a;
    }
}
