package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.post.FighterSuggestPostBody;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lnlc;", "Lq8;", "Lcn9;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class nlc extends q8 implements cn9 {
    public final /* synthetic */ wj9 e;
    public final e64 f;
    public final Team g;
    public final FighterSuggestPostBody h;
    public final FighterSuggestPostBody i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlc(e64 e64Var, fqg fqgVar, Application application) {
        super(application);
        PlayerTeamInfo playerTeamInfo;
        Double reach;
        PlayerTeamInfo playerTeamInfo2;
        Double height;
        PlayerTeamInfo playerTeamInfo3;
        PlayerTeamInfo playerTeamInfo4;
        Country country;
        PlayerTeamInfo playerTeamInfo5;
        fqgVar.getClass();
        e64Var.getClass();
        this.e = new wj9(2);
        this.f = e64Var;
        Team team = (Team) fqgVar.a("ARG_FIGHTER");
        this.g = team;
        Integer num = null;
        String name = team != null ? team.getName() : null;
        String nickname = (team == null || (playerTeamInfo5 = team.getPlayerTeamInfo()) == null) ? null : playerTeamInfo5.getNickname();
        ArrayList arrayList = dv3.a;
        com.sofascore.model.Country a = dv3.a((team == null || (country = team.getCountry()) == null) ? null : country.getAlpha2());
        String iso3Alpha = a != null ? a.getIso3Alpha() : null;
        String fightingStyle = (team == null || (playerTeamInfo4 = team.getPlayerTeamInfo()) == null) ? null : playerTeamInfo4.getFightingStyle();
        Long birthDateTimestamp = (team == null || (playerTeamInfo3 = team.getPlayerTeamInfo()) == null) ? null : playerTeamInfo3.getBirthDateTimestamp();
        Integer valueOf = (team == null || (playerTeamInfo2 = team.getPlayerTeamInfo()) == null || (height = playerTeamInfo2.getHeight()) == null) ? null : Integer.valueOf((int) (height.doubleValue() * 100.0d));
        if (team != null && (playerTeamInfo = team.getPlayerTeamInfo()) != null && (reach = playerTeamInfo.getReach()) != null) {
            num = Integer.valueOf((int) (reach.doubleValue() * 100.0d));
        }
        FighterSuggestPostBody fighterSuggestPostBody = new FighterSuggestPostBody(name, (String) null, nickname, iso3Alpha, fightingStyle, birthDateTimestamp, valueOf, num, 2, (DefaultConstructorMarker) null);
        this.h = fighterSuggestPostBody;
        this.i = FighterSuggestPostBody.copy$default(fighterSuggestPostBody, null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // defpackage.cn9
    public final yzc b() {
        return (yzc) this.e.c;
    }
}
