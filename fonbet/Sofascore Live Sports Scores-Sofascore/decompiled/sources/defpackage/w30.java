package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class w30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ w30(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                e1dVar.setValue((dma) obj);
                break;
            case 1:
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                    ymaVar.a();
                }
                break;
            case 2:
                ((vnb) obj).getClass();
                break;
            case 3:
                aej aejVar = (aej) obj;
                aejVar.getClass();
                e1dVar.setValue(Boolean.valueOf(aejVar.d()));
                break;
            case 4:
                e1dVar.setValue((wj1) obj);
                break;
            case 5:
                ll1 ll1Var = (ll1) obj;
                ll1Var.getClass();
                e1dVar.setValue(ll1Var);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                e1dVar.setValue(bool);
                break;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                e1dVar.setValue(bool2);
                break;
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                e1dVar.setValue(bool3);
                break;
            case 9:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                e1dVar.setValue(bool4);
                break;
            case 10:
                e1dVar.setValue((dma) obj);
                break;
            case 11:
                u7j u7jVar = (u7j) obj;
                e1dVar.setValue(u7jVar.c ? u7jVar.b : u7jVar.a);
                break;
            case 12:
                List list = (List) obj;
                if (e1dVar != null) {
                    e1dVar.setValue(list);
                }
                break;
            case 13:
                tfh tfhVar = (tfh) obj;
                tfhVar.getClass();
                e1dVar.setValue(tfhVar);
                break;
            case 14:
                String str = (String) obj;
                str.getClass();
                e1dVar.setValue(str);
                break;
            case 15:
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                e1dVar.setValue(new c7a(dmaVar.e()));
                break;
            case 16:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                break;
            case 17:
                b4h b4hVar = (b4h) obj;
                if (!StringsKt.R((CharSequence) e1dVar.getValue())) {
                    String str2 = (String) e1dVar.getValue();
                    KProperty[] kPropertyArr = y3h.a;
                    b4hVar.a(w3h.O, str2);
                }
                break;
            case 18:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                e1dVar.setValue(bool5);
                break;
            case 19:
                Boolean bool6 = (Boolean) obj;
                bool6.getClass();
                e1dVar.setValue(bool6);
                break;
            case 20:
                Boolean bool7 = (Boolean) obj;
                bool7.getClass();
                e1dVar.setValue(bool7);
                break;
            case 21:
                ((Boolean) obj).getClass();
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                break;
            case 22:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 23:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 24:
                r9k r9kVar = (r9k) obj;
                r9kVar.getClass();
                e1dVar.setValue(r9kVar);
                break;
            case 25:
                mte mteVar = (mte) obj;
                mteVar.getClass();
                e1dVar.setValue(mteVar);
                break;
            case 26:
                String str3 = (String) obj;
                str3.getClass();
                e1dVar.setValue(str3);
                break;
            case 27:
                String str4 = (String) obj;
                str4.getClass();
                e1dVar.setValue(str4);
                break;
            case 28:
                String str5 = (String) obj;
                str5.getClass();
                e1dVar.setValue(str5);
                break;
            default:
                String str6 = (String) obj;
                str6.getClass();
                e1dVar.setValue(str6);
                break;
        }
        return Unit.a;
    }
}
