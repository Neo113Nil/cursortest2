package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rt3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ st3 b;

    public /* synthetic */ rt3(st3 st3Var, b4h b4hVar) {
        this.a = 3;
        this.b = st3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        st3 st3Var = this.b;
        switch (i) {
            case 0:
                e1d e1dVar = st3Var.s.t;
                Boolean bool = Boolean.TRUE;
                ((eoh) e1dVar).setValue(bool);
                ((eoh) st3Var.s.s).setValue(bool);
                q5b q5bVar = st3Var.s;
                AutofillValue autofillValue = ((r00) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                st3.n1(q5bVar, (String) textValue, st3Var.t, st3Var.u);
                return bool;
            case 1:
                List list = (List) obj;
                if (st3Var.s.d() != null) {
                    bej d = st3Var.s.d();
                    d.getClass();
                    list.add(d.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                st3.n1(st3Var.s, ((q80) obj).b, st3Var.t, st3Var.u);
                return Boolean.TRUE;
            default:
                q80 q80Var = (q80) obj;
                if (!st3Var.t && st3Var.u) {
                    jdj jdjVar = st3Var.s.e;
                    if (jdjVar != null) {
                        List j = b.j(new i38(), new t43(q80Var, 1));
                        q5b q5bVar2 = st3Var.s;
                        fp4 fp4Var = q5bVar2.d;
                        gt3 gt3Var = q5bVar2.v;
                        wcj f = fp4Var.f(j);
                        jdjVar.a(null, f);
                        gt3Var.invoke(f);
                    } else {
                        wcj wcjVar = st3Var.r;
                        String str = wcjVar.a.b;
                        long j2 = wcjVar.b;
                        int i2 = pej.c;
                        String obj2 = StringsKt.X(str, (int) (j2 >> 32), (int) (j2 & 4294967295L), q80Var).toString();
                        int length = q80Var.b.length() + ((int) (st3Var.r.b >> 32));
                        st3Var.s.v.invoke(new wcj(4, t6a.g(length, length), obj2));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ rt3(st3 st3Var, int i) {
        this.a = i;
        this.b = st3Var;
    }
}
