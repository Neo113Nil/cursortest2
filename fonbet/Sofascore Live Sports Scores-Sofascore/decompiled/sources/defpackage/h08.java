package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h08 extends i3 {
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bd, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e7, code lost:
    
        if (r4 == null) goto L21;
     */
    @Override // defpackage.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList j(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Event event = (Event) obj;
        event.getClass();
        setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Context context = getContext();
        context.getClass();
        g73 g73Var = new g73(context);
        String string = g73Var.getContext().getString(R.string.full_name);
        string.getClass();
        g73Var.setStatTitle(string);
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        Context context2 = g73Var.getContext();
        context2.getClass();
        String p = tba.p(context2, homeTeam$default);
        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
        Context context3 = g73Var.getContext();
        context3.getClass();
        g73Var.j(p, tba.p(context3, awayTeam$default));
        arrayList.add(g73Var);
        PlayerTeamInfo playerTeamInfo = Event.getHomeTeam$default(event, null, 1, null).getPlayerTeamInfo();
        Long birthDateTimestamp = playerTeamInfo != null ? playerTeamInfo.getBirthDateTimestamp() : null;
        PlayerTeamInfo playerTeamInfo2 = Event.getAwayTeam$default(event, null, 1, null).getPlayerTeamInfo();
        Long birthDateTimestamp2 = playerTeamInfo2 != null ? playerTeamInfo2.getBirthDateTimestamp() : null;
        String str6 = "-";
        if (birthDateTimestamp != null || birthDateTimestamp2 != null) {
            Context context4 = getContext();
            context4.getClass();
            g73 g73Var2 = new g73(context4);
            String string2 = g73Var2.getContext().getString(R.string.age);
            string2.getClass();
            g73Var2.setStatTitle(string2);
            if (birthDateTimestamp != null) {
                str = String.valueOf((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(birthDateTimestamp.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(event.getTimestamp() * 1000))));
            }
            str = "-";
            if (birthDateTimestamp2 != null) {
                str2 = String.valueOf((int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(birthDateTimestamp2.longValue() * 1000)), vxd.o(Instant.ofEpochMilli(event.getTimestamp() * 1000))));
            }
            str2 = "-";
            g73Var2.j(str, str2);
            arrayList.add(g73Var2);
        }
        Country country = Event.getHomeTeam$default(event, null, 1, null).getCountry();
        String name = country != null ? country.getName() : null;
        Country country2 = Event.getAwayTeam$default(event, null, 1, null).getCountry();
        String name2 = country2 != null ? country2.getName() : null;
        if (name != null || name2 != null) {
            Context context5 = getContext();
            context5.getClass();
            g73 g73Var3 = new g73(context5);
            String string3 = g73Var3.getContext().getString(R.string.home_country);
            string3.getClass();
            g73Var3.setStatTitle(string3);
            Context context6 = g73Var3.getContext();
            context6.getClass();
            String c = tv3.c(context6, name);
            if (c.length() <= 0) {
                c = null;
            }
            if (c == null) {
                c = "-";
            }
            Context context7 = g73Var3.getContext();
            context7.getClass();
            String c2 = tv3.c(context7, name2);
            if (c2.length() <= 0) {
                c2 = null;
            }
            if (c2 == null) {
                c2 = "-";
            }
            g73Var3.j(c, c2);
            arrayList.add(g73Var3);
        }
        PlayerTeamInfo playerTeamInfo3 = Event.getHomeTeam$default(event, null, 1, null).getPlayerTeamInfo();
        Double height = playerTeamInfo3 != null ? playerTeamInfo3.getHeight() : null;
        PlayerTeamInfo playerTeamInfo4 = Event.getAwayTeam$default(event, null, 1, null).getPlayerTeamInfo();
        Double height2 = playerTeamInfo4 != null ? playerTeamInfo4.getHeight() : null;
        if (height != null || height2 != null) {
            Context context8 = getContext();
            context8.getClass();
            g73 g73Var4 = new g73(context8);
            String string4 = g73Var4.getContext().getString(R.string.player_height);
            string4.getClass();
            g73Var4.setStatTitle(string4);
            if (height != null) {
                double doubleValue = height.doubleValue();
                Context context9 = g73Var4.getContext();
                context9.getClass();
                str3 = v7a.w(context9, doubleValue, (r4 & 4) == 0, false);
            } else {
                str3 = "-";
            }
            if (height2 != null) {
                double doubleValue2 = height2.doubleValue();
                Context context10 = g73Var4.getContext();
                context10.getClass();
                str4 = v7a.w(context10, doubleValue2, (r4 & 4) == 0, false);
            } else {
                str4 = "-";
            }
            g73Var4.j(str3, str4);
            arrayList.add(g73Var4);
        }
        PlayerTeamInfo playerTeamInfo5 = Event.getHomeTeam$default(event, null, 1, null).getPlayerTeamInfo();
        Double reach = playerTeamInfo5 != null ? playerTeamInfo5.getReach() : null;
        PlayerTeamInfo playerTeamInfo6 = Event.getAwayTeam$default(event, null, 1, null).getPlayerTeamInfo();
        Double reach2 = playerTeamInfo6 != null ? playerTeamInfo6.getReach() : null;
        if (reach == null && reach2 == null) {
            return arrayList;
        }
        Context context11 = getContext();
        context11.getClass();
        g73 g73Var5 = new g73(context11);
        String string5 = g73Var5.getContext().getString(R.string.reach);
        string5.getClass();
        g73Var5.setStatTitle(string5);
        if (reach != null) {
            double doubleValue3 = reach.doubleValue();
            Context context12 = g73Var5.getContext();
            context12.getClass();
            str5 = v7a.w(context12, doubleValue3, true, true);
        } else {
            str5 = "-";
        }
        if (reach2 != null) {
            double doubleValue4 = reach2.doubleValue();
            Context context13 = g73Var5.getContext();
            context13.getClass();
            str6 = v7a.w(context13, doubleValue4, true, true);
        }
        g73Var5.j(str5, str6);
        arrayList.add(g73Var5);
        return arrayList;
    }
}
