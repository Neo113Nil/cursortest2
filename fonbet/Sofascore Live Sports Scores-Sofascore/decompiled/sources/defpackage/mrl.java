package defpackage;

import defpackage.lrl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mrl extends ot8 implements Function1 {
    public mrl(prl prlVar) {
        super(1, 0, prl.class, prlVar, "performSearch", "performSearch(Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        prl prlVar = (prl) this.receiver;
        prlVar.getClass();
        if (StringsKt.R(str)) {
            prlVar.g();
            prlVar.f();
        } else {
            prlVar.g();
            fdi fdiVar = prlVar.b;
            lrl.c cVar = new lrl.c(str, true, true, true);
            fdiVar.getClass();
            fdiVar.m(null, cVar);
        }
        return Unit.a;
    }
}
