package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import com.sofascore.model.mvvm.model.CricketPlayerInfo;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r04 extends i3 {
    @Override // defpackage.i3
    public final ArrayList j(Object obj) {
        CricketPlayerInfo cricketPlayerInfo = (CricketPlayerInfo) obj;
        cricketPlayerInfo.getClass();
        ArrayList arrayList = new ArrayList();
        String string = getContext().getString(R.string.player_profile);
        string.getClass();
        kqb d = kqb.d(LayoutInflater.from(getContext()), this.d.a, false);
        d.d.setText(string);
        arrayList.add(d.b);
        String batting = cricketPlayerInfo.getBatting();
        if (batting != null) {
            Context context = getContext();
            context.getClass();
            vm6 vm6Var = new vm6(context);
            vm6Var.j("Batting", null, true);
            vm6Var.setLabelValue(batting);
            arrayList.add(vm6Var);
        }
        String bowling = cricketPlayerInfo.getBowling();
        if (bowling != null) {
            Context context2 = getContext();
            context2.getClass();
            vm6 vm6Var2 = new vm6(context2);
            vm6Var2.j("Bowling", null, true);
            vm6Var2.setLabelValue(bowling);
            arrayList.add(vm6Var2);
        }
        String role = cricketPlayerInfo.getRole();
        if (role != null) {
            Context context3 = getContext();
            context3.getClass();
            vm6 vm6Var3 = new vm6(context3);
            vm6Var3.j("Role", null, true);
            vm6Var3.setLabelValue(role);
            arrayList.add(vm6Var3);
        }
        return arrayList;
    }
}
