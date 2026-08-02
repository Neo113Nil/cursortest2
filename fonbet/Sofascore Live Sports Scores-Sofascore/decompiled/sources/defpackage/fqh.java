package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fqh implements Function0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boh c;

    public fqh(long j, Function0 function0, boh bohVar) {
        this.a = j;
        this.b = function0;
        this.c = bohVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long v = yaa.v();
        boh bohVar = this.c;
        if (v - bohVar.h() >= this.a) {
            bohVar.i(v);
            this.b.invoke();
        }
        return Unit.a;
    }
}
