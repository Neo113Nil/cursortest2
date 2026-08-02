package defpackage;

import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class we5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ DynamicBottomNavigation b;

    public /* synthetic */ we5(DynamicBottomNavigation dynamicBottomNavigation) {
        this.b = dynamicBottomNavigation;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        DynamicBottomNavigation dynamicBottomNavigation = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                oqf oqfVar = (oqf) obj2;
                int i2 = DynamicBottomNavigation.q;
                oqfVar.getClass();
                dynamicBottomNavigation.p.put(num, oqfVar);
                break;
            default:
                ((Integer) obj2).getClass();
                int i3 = DynamicBottomNavigation.q;
                dynamicBottomNavigation.a(aba.K(1), (of3) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ we5(DynamicBottomNavigation dynamicBottomNavigation, int i) {
        this.b = dynamicBottomNavigation;
    }
}
