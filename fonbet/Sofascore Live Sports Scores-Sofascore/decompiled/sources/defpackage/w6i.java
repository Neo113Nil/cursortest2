package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w6i extends i3 {
    @Override // defpackage.i3
    public final ArrayList j(Object obj) {
        Stage stage = (Stage) obj;
        stage.getClass();
        ArrayList arrayList = new ArrayList();
        StageInfo info = stage.getInfo();
        if (info != null) {
            String circuitCity = info.getCircuitCity();
            if (circuitCity != null) {
                Context context = getContext();
                context.getClass();
                vm6 vm6Var = new vm6(context);
                String string = vm6Var.getContext().getString(R.string.city);
                string.getClass();
                vm6Var.j(string, null, true);
                vm6Var.setLabelValue(circuitCity);
                arrayList.add(vm6Var);
            }
            Integer laps = info.getLaps();
            if (laps != null) {
                if (laps.intValue() == 0) {
                    laps = null;
                }
                if (laps != null) {
                    int intValue = laps.intValue();
                    Context context2 = getContext();
                    context2.getClass();
                    vm6 vm6Var2 = new vm6(context2);
                    String string2 = vm6Var2.getContext().getString(R.string.formula_laps);
                    string2.getClass();
                    vm6Var2.j(string2, null, true);
                    vm6Var2.setLabelValue(String.valueOf(intValue));
                    arrayList.add(vm6Var2);
                }
            }
            Float circuitLength = info.getCircuitLength();
            if (circuitLength != null) {
                if (circuitLength.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    circuitLength = null;
                }
                if (circuitLength != null) {
                    float floatValue = circuitLength.floatValue();
                    Context context3 = getContext();
                    context3.getClass();
                    vm6 vm6Var3 = new vm6(context3);
                    String string3 = vm6Var3.getContext().getString(R.string.circuit_length);
                    string3.getClass();
                    vm6Var3.j(string3, null, true);
                    Context context4 = vm6Var3.getContext();
                    context4.getClass();
                    vm6Var3.setLabelValue(v7a.r(context4, floatValue));
                    arrayList.add(vm6Var3);
                }
            }
            Float raceDistance = info.getRaceDistance();
            if (raceDistance != null) {
                if (raceDistance.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    raceDistance = null;
                }
                if (raceDistance != null) {
                    float floatValue2 = raceDistance.floatValue();
                    Context context5 = getContext();
                    context5.getClass();
                    vm6 vm6Var4 = new vm6(context5);
                    String string4 = vm6Var4.getContext().getString(R.string.race_distance);
                    string4.getClass();
                    vm6Var4.j(string4, null, true);
                    Context context6 = vm6Var4.getContext();
                    context6.getClass();
                    vm6Var4.setLabelValue(v7a.r(context6, floatValue2));
                    arrayList.add(vm6Var4);
                }
            }
            String lapRecord = info.getLapRecord();
            if (lapRecord != null) {
                Context context7 = getContext();
                context7.getClass();
                vm6 vm6Var5 = new vm6(context7);
                String string5 = vm6Var5.getContext().getString(R.string.lap_record);
                string5.getClass();
                vm6Var5.j(string5, null, true);
                vm6Var5.setLabelValue(lapRecord);
                arrayList.add(vm6Var5);
            }
        }
        return arrayList;
    }
}
