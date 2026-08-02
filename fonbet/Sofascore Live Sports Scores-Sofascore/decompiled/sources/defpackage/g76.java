package defpackage;

import com.sofascore.model.mvvm.model.DbMyTeam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class g76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ g76(String str, List list, int i) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        List list = this.c;
        String str = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                nlg V0 = glgVar.V0(str);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        V0.q(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 1:
                glgVar.getClass();
                nlg V02 = glgVar.V0(str);
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        V02.q(i2, ((Number) it2.next()).intValue());
                        i2++;
                    }
                    V02.U0();
                    int y = u0a.y(glgVar);
                    V02.close();
                    return Integer.valueOf(y);
                } catch (Throwable th2) {
                    V02.close();
                    throw th2;
                }
            case 2:
                glgVar.getClass();
                nlg V03 = glgVar.V0(str);
                try {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        V03.q(i2, ((Number) it3.next()).intValue());
                        i2++;
                    }
                    V03.U0();
                    int y2 = u0a.y(glgVar);
                    V03.close();
                    return Integer.valueOf(y2);
                } catch (Throwable th3) {
                    V03.close();
                    throw th3;
                }
            case 3:
                glgVar.getClass();
                nlg V04 = glgVar.V0(str);
                try {
                    Iterator it4 = list.iterator();
                    int i3 = 1;
                    while (it4.hasNext()) {
                        V04.q(i3, ((Number) it4.next()).intValue());
                        i3++;
                    }
                    int r = w1a.r(V04, "teamId");
                    int r2 = w1a.r(V04, "notificationsEnabled");
                    ArrayList arrayList = new ArrayList();
                    while (V04.U0()) {
                        arrayList.add(new DbMyTeam((int) V04.getLong(r), ((int) V04.getLong(r2)) != 0));
                    }
                    V04.close();
                    return arrayList;
                } catch (Throwable th4) {
                    V04.close();
                    throw th4;
                }
            default:
                glgVar.getClass();
                nlg V05 = glgVar.V0(str);
                try {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        V05.q(i2, ((Number) it5.next()).intValue());
                        i2++;
                    }
                    V05.U0();
                    int y3 = u0a.y(glgVar);
                    V05.close();
                    return Integer.valueOf(y3);
                } catch (Throwable th5) {
                    V05.close();
                    throw th5;
                }
        }
    }
}
