package defpackage;

import android.view.autofill.AutofillValue;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q0k extends sw2 {
    public vjj O;

    @Override // defpackage.m2
    public final void n1(b4h b4hVar) {
        vjj vjjVar = this.O;
        KProperty[] kPropertyArr = y3h.a;
        a4h a4hVar = w3h.L;
        KProperty[] kPropertyArr2 = y3h.a;
        KProperty kProperty = kPropertyArr2[26];
        b4hVar.a(a4hVar, vjjVar);
        uz uzVar = uxf.s;
        a4h a4hVar2 = w3h.s;
        KProperty kProperty2 = kPropertyArr2[9];
        b4hVar.a(a4hVar2, uzVar);
        r00 r00Var = new r00(AutofillValue.forToggle(this.O != vjj.c));
        a4h a4hVar3 = w3h.t;
        KProperty kProperty3 = kPropertyArr2[10];
        b4hVar.a(a4hVar3, r00Var);
        y3h.b(b4hVar, new lt2(b4hVar, 1));
    }
}
