package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wsd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wsd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((a7d) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "OnboardingAddedItemComponent";
            case 1:
                ((etd) obj3).invoke(((gv9) obj2).get(((Number) obj).intValue()));
                return "POTS award";
            case 2:
                return ((etd) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                return ((etd) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                int intValue = ((Number) obj).intValue();
                return ((eee) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            case 5:
                int intValue2 = ((Number) obj).intValue();
                return ((eee) obj3).invoke(Integer.valueOf(intValue2), ((List) obj2).get(intValue2));
            case 6:
                int intValue3 = ((Number) obj).intValue();
                return ((eee) obj3).invoke(Integer.valueOf(intValue3), ((List) obj2).get(intValue3));
            case 7:
                int intValue4 = ((Number) obj).intValue();
                return ((xt3) obj3).invoke(Integer.valueOf(intValue4), ((gv9) obj2).get(intValue4));
            case 8:
                int intValue5 = ((Number) obj).intValue();
                return ((o43) obj3).invoke(Integer.valueOf(intValue5), ((List) obj2).get(intValue5));
            case 9:
                ((z1h) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "chip_item";
            case 10:
                int intValue6 = ((Number) obj).intValue();
                return ((wqg) obj3).invoke(Integer.valueOf(intValue6), ((List) obj2).get(intValue6));
            case 11:
                int intValue7 = ((Number) obj).intValue();
                return ((wqg) obj3).invoke(Integer.valueOf(intValue7), ((List) obj2).get(intValue7));
            case 12:
                int intValue8 = ((Number) obj).intValue();
                return ((m04) obj3).invoke(Integer.valueOf(intValue8), ((List) obj2).get(intValue8));
            case 13:
                KeyEvent keyEvent = ((sia) obj).a;
                wd8 wd8Var = (wd8) obj3;
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && u0a.z(keyEvent) == 2 && keyEvent.getSource() != 257)) {
                    if (mha.t(19, keyEvent)) {
                        z = ((yd8) wd8Var).h(5, true);
                    } else if (mha.t(20, keyEvent)) {
                        z = ((yd8) wd8Var).h(6, true);
                    } else if (mha.t(21, keyEvent)) {
                        z = ((yd8) wd8Var).h(3, true);
                    } else if (mha.t(22, keyEvent)) {
                        z = ((yd8) wd8Var).h(4, true);
                    } else if (mha.t(23, keyEvent)) {
                        mvh mvhVar = ((q5b) obj2).c;
                        if (mvhVar != null) {
                            ((lw4) mvhVar).b();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                int intValue9 = ((Number) obj).intValue();
                return ((t6j) obj3).invoke(Integer.valueOf(intValue9), ((List) obj2).get(intValue9));
            case 15:
                ((jwj) obj3).a.g.q((b40) obj2);
                return Unit.a;
            case 16:
                return ((crj) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                return ((crj) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 18:
                return ((sbk) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 19:
                Throwable th = (Throwable) obj;
                if (th instanceof wcl) {
                    ((kdb) obj3).stop(((wcl) th).a);
                }
                ((ddb) obj2).cancel(false);
                return Unit.a;
            case 20:
                return ((pcl) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 21:
                return ((pcl) obj3).invoke(((gv9) obj2).get(((Number) obj).intValue()));
            case 22:
                return ((pcl) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((pcl) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((pcl) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                int intValue10 = ((Number) obj).intValue();
                return ((t6j) obj3).invoke(Integer.valueOf(intValue10), ((List) obj2).get(intValue10));
        }
    }
}
