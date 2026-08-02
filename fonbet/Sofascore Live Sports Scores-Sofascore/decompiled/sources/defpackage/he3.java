package defpackage;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class he3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ he3(int i, Function2 function2) {
        this.a = i;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        o89 a;
        Long k0;
        spg spgVar;
        int i = this.a;
        Long l = null;
        int i2 = 1;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1061203673, av8Var, new he3(i2, function2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    function2.invoke(av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                mk9 mk9Var = (mk9) obj;
                Object obj3 = (Integer) obj2;
                obj3.getClass();
                mk9Var.getClass();
                aq4 aq4Var = mk9Var.a;
                if (aq4Var != null && (a = aq4Var.a()) != null) {
                    List list = zi9.a;
                    String str = a.get(CommonGatewayClient.HEADER_RETRY_AFTER);
                    if (str != null && (k0 = StringsKt.k0(str)) != null) {
                        l = Long.valueOf(k0.longValue() * 1000);
                    }
                }
                return Long.valueOf(Math.max(((Number) function2.invoke(mk9Var, obj3)).longValue(), l != null ? l.longValue() : 0L));
            default:
                lpg lpgVar = (lpg) obj;
                List list2 = (List) function2.invoke(lpgVar, obj2);
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj4 = list2.get(i3);
                    if (obj4 != null && (spgVar = lpgVar.b) != null && !spgVar.d(obj4)) {
                        i3c.h(i3, " can't be saved: ", obj4, "item at index ");
                        return null;
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
        }
    }
}
