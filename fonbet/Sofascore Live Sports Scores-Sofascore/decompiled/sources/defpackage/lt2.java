package defpackage;

import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lt2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4h b;

    public /* synthetic */ lt2(b4h b4hVar, int i) {
        this.a = i;
        this.b = b4hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        b4h b4hVar = this.b;
        switch (i) {
            case 0:
                jyj jyjVar = (jyj) obj;
                jyjVar.getClass();
                f9e f9eVar = (f9e) jyjVar;
                f9eVar.p = true;
                f9eVar.o.invoke(b4hVar);
                sea.p(f9eVar);
                return Boolean.FALSE;
            default:
                AutofillValue autofillValue = ((r00) obj).a;
                Boolean valueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (valueOf != null) {
                    vjj vjjVar = valueOf.booleanValue() ? vjj.a : vjj.b;
                    KProperty[] kPropertyArr = y3h.a;
                    a4h a4hVar = w3h.L;
                    KProperty kProperty = y3h.a[26];
                    b4hVar.a(a4hVar, vjjVar);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
