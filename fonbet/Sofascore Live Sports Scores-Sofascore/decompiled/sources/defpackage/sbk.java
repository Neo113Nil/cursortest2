package defpackage;

import com.sofascore.model.database.DbUserSegmentation;
import com.sofascore.model.mvvm.model.UserSegmentationTypeConverter;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class sbk implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sbk(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UniversalRequestStoreOuterClass.UniversalRequestStore createDataStore$lambda$2;
        nlg V0;
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                createDataStore$lambda$2 = UniversalRequestDataStoreProvider.createDataStore$lambda$2((uu3) obj);
                return createDataStore$lambda$2;
            case 1:
                rx2 rx2Var = (rx2) obj;
                rx2Var.getClass();
                rx2Var.a(a99.g, new ihd(((efk) rx2Var.b).a, (rq3) null));
                return Unit.a;
            case 2:
                ulf ulfVar = (ulf) obj;
                ulfVar.getClass();
                return ulfVar instanceof slf ? ((slf) ulfVar).a : Integer.valueOf(ulfVar.hashCode());
            case 3:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT * FROM user_segmentation");
                try {
                    int r = w1a.r(V0, "type");
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(new DbUserSegmentation(UserSegmentationTypeConverter.INSTANCE.toEnum((int) V0.getLong(r))));
                    }
                    return arrayList;
                } finally {
                }
            case 4:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("DELETE FROM user_segmentation");
                try {
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } finally {
                }
            case 5:
                dk4 dk4Var = (dk4) obj;
                dk4Var.getClass();
                dk4.p(dk4Var);
                v9g.x(dk4Var, ':');
                dk4.j(dk4Var);
                v9g.I(dk4Var, "", new sbk(10));
                return Unit.a;
            case 6:
                dk4 dk4Var2 = (dk4) obj;
                dk4Var2.getClass();
                dk4Var2.b("z");
                return Unit.a;
            case 7:
                dk4 dk4Var3 = (dk4) obj;
                dk4Var3.getClass();
                v9g.I(dk4Var3, "Z", new sbk(8));
                return Unit.a;
            case 8:
                dk4 dk4Var4 = (dk4) obj;
                dk4Var4.getClass();
                dk4.p(dk4Var4);
                v9g.I(dk4Var4, "", new sbk(9));
                return Unit.a;
            case 9:
                dk4 dk4Var5 = (dk4) obj;
                dk4Var5.getClass();
                dk4.j(dk4Var5);
                v9g.I(dk4Var5, "", new sbk(11));
                return Unit.a;
            case 10:
                dk4 dk4Var6 = (dk4) obj;
                dk4Var6.getClass();
                v9g.x(dk4Var6, ':');
                dk4.k(dk4Var6);
                return Unit.a;
            case 11:
                dk4 dk4Var7 = (dk4) obj;
                dk4Var7.getClass();
                dk4.k(dk4Var7);
                return Unit.a;
            case 12:
                dk4 dk4Var8 = (dk4) obj;
                dk4Var8.getClass();
                dk4Var8.b("z");
                return Unit.a;
            case 13:
                dk4 dk4Var9 = (dk4) obj;
                dk4Var9.getClass();
                v9g.I(dk4Var9, "Z", new sbk(5));
                return Unit.a;
            case 14:
                wj4 wj4Var = (wj4) obj;
                v9g.v(wj4Var, new Function1[]{new sbk(23)}, new sbk(28));
                wj4Var.d(new xn1(new zk4(k3e.a)));
                v9g.v(wj4Var, new Function1[]{new sbk(29)}, new wik(i));
                v9g.v(wj4Var, new Function1[]{new wik(i2)}, new sbk(15));
                v9g.v(wj4Var, new Function1[]{new sbk(16)}, new sbk(17));
                v9g.v(wj4Var, new Function1[]{new sbk(18)}, new sbk(19));
                v9g.x(wj4Var, ' ');
                ck4.n(wj4Var);
                v9g.x(wj4Var, ':');
                ck4.m(wj4Var);
                v9g.I(wj4Var, ":0", new sbk(24));
                wj4Var.b(" ");
                v9g.v(wj4Var, new Function1[]{new sbk(25), new sbk(26)}, new sbk(27));
                return Unit.a;
            case 15:
                wj4 wj4Var2 = (wj4) obj;
                evc evcVar = evc.b;
                wj4Var2.getClass();
                evcVar.getClass();
                wj4Var2.d(new xn1(new cvc(evcVar)));
                return Unit.a;
            case 16:
                v9g.x((wj4) obj, '-');
                return Unit.a;
            case 17:
                v9g.x((wj4) obj, ' ');
                return Unit.a;
            case 18:
                wj4 wj4Var3 = (wj4) obj;
                wj4Var3.getClass();
                wj4Var3.d(new xn1(new zrf()));
                return Unit.a;
            case 19:
                ek4.f((wj4) obj);
                return Unit.a;
            case 20:
                wj4 wj4Var4 = (wj4) obj;
                qhk qhkVar = (qhk) rhk.c.getValue();
                wj4Var4.getClass();
                qhkVar.getClass();
                wj4Var4.a.a(qhkVar.a);
                return Unit.a;
            case 21:
                v9g.x((wj4) obj, ',');
                return Unit.a;
            case 22:
                ((wj4) obj).b(", ");
                return Unit.a;
            case 23:
                return Unit.a;
            case 24:
                wj4 wj4Var5 = (wj4) obj;
                v9g.x(wj4Var5, ':');
                ck4.g(wj4Var5);
                return Unit.a;
            case 25:
                ((wj4) obj).b("UT");
                return Unit.a;
            case 26:
                ((wj4) obj).b("Z");
                return Unit.a;
            case 27:
                v9g.I((wj4) obj, "GMT", new sbk(20));
                return Unit.a;
            case 28:
                wj4 wj4Var6 = (wj4) obj;
                el4 el4Var = el4.b;
                wj4Var6.getClass();
                el4Var.getClass();
                wj4Var6.i(new xn1(new cl4(el4Var)));
                v9g.v(wj4Var6, new Function1[]{new sbk(21)}, new sbk(22));
                return Unit.a;
            default:
                v9g.x((wj4) obj, '-');
                return Unit.a;
        }
    }
}
