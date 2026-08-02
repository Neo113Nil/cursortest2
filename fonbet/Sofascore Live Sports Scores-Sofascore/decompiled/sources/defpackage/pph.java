package defpackage;

import android.content.SharedPreferences;
import com.sofascore.results.helper.SofaBackupAgent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class pph implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ pph(Map map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gv9 gv9Var;
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                Map map2 = SofaBackupAgent.b;
                editor.getClass();
                bga bgaVar = vga.a;
                bgaVar.getClass();
                editor.putString("PREF_NOTIFICATION_SETTINGS", bgaVar.c(new q79(uhi.a, gz1.a, 1), map));
                return Unit.a;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                List list = (List) map.get(num);
                return list == null ? km5.a : list;
            case 2:
                Integer num2 = (Integer) obj;
                num2.intValue();
                List list2 = (List) map.get(num2);
                return list2 == null ? km5.a : list2;
            default:
                oil oilVar = (oil) obj;
                gv9<rxb> gv9Var2 = oilVar.q;
                if (gv9Var2 != null) {
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var2, 10));
                    for (rxb rxbVar : gv9Var2) {
                        r2f r2fVar = (r2f) map.get(Integer.valueOf(rxbVar.a.getId()));
                        if (r2fVar != null && !(rxbVar.g instanceof o2f)) {
                            rxbVar = rxb.a(rxbVar, r2fVar, 191);
                        }
                        arrayList.add(rxbVar);
                    }
                    gv9Var = l6g.W(arrayList);
                } else {
                    gv9Var = null;
                }
                return oil.a(oilVar, null, null, null, null, null, false, null, false, false, null, null, false, null, null, null, null, gv9Var, null, null, null, null, null, null, null, null, 33488895);
        }
    }
}
