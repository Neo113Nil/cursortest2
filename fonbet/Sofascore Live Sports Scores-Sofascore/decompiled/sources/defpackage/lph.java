package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lph implements b98 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ e1d c;
    public final /* synthetic */ e1d d;

    public lph(Function1 function1, int i, e1d e1dVar, e1d e1dVar2) {
        this.a = function1;
        this.b = i;
        this.c = e1dVar;
        this.d = e1dVar2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        CharSequence charSequence = (CharSequence) obj;
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(charSequence.toString());
        }
        if (((Boolean) this.c.getValue()).booleanValue() && charSequence.length() >= this.b) {
            this.d.setValue(Boolean.TRUE);
        }
        return Unit.a;
    }
}
