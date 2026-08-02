package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Patterns;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.sofascore.model.mvvm.model.DbMyTeam;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.network.response.serializers.TeamAverageRatingVersionSerializer;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rfi implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ rfi(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int _init_$lambda$0;
        TeamAverageRatingVersion _init_$lambda$1;
        int i;
        int i2 = 4;
        int i3 = 0;
        switch (this.a) {
            case 0:
                StoryModel storyModel = (StoryModel) obj;
                StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
                storyModel.getClass();
                return storyModel.r;
            case 1:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(Patterns.WEB_URL.matcher(str).matches());
            case 2:
                y3h.d((b4h) obj);
                return Unit.a;
            case 3:
                y3h.d((b4h) obj);
                return Unit.a;
            case 4:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putLong("PREF_USAGE_STREAK_LAST_TIMESTAMP", System.currentTimeMillis() / 1000);
                editor.putLong("PREF_USAGE_STREAK_DAYS", 1L);
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                return Float.valueOf(1.0f);
            case 7:
                return Float.valueOf(((Context) obj).getResources().getDisplayMetrics().density);
            case 8:
                return Unit.a;
            case 9:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
            case 10:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 11:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 12:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(V0.F0(0));
                    }
                    return arrayList;
                } finally {
                }
            case 13:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 14:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 15:
                ((Float) obj).getClass();
                return Unit.a;
            case 16:
                _init_$lambda$0 = TeamAverageRatingVersionSerializer._init_$lambda$0((TeamAverageRatingVersion) obj);
                return Integer.valueOf(_init_$lambda$0);
            case 17:
                _init_$lambda$1 = TeamAverageRatingVersionSerializer._init_$lambda$1(((Integer) obj).intValue());
                return _init_$lambda$1;
            case 18:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT DISTINCT teams.sport_slug FROM my_teams, teams WHERE teams.id = my_teams.teamId AND teams.type != 1");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(V0.isNull(0) ? null : V0.F0(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 19:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT * FROM my_teams");
                try {
                    int r = w1a.r(V0, "teamId");
                    int r2 = w1a.r(V0, "notificationsEnabled");
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.U0()) {
                        arrayList3.add(new DbMyTeam((int) V0.getLong(r), ((int) V0.getLong(r2)) != 0));
                    }
                    return arrayList3;
                } finally {
                }
            case 20:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("SELECT teamId FROM my_teams");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.U0()) {
                        arrayList4.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList4;
                } finally {
                }
            case 21:
                r60 r60Var = (r60) obj;
                r60Var.getClass();
                i = ((iwi) r60Var.a()).a > ((iwi) r60Var.b()).a ? 1 : -1;
                h74 h74Var = jg5.a;
                return new pp3(uo5.m(s02.h0(400, 0, h74Var, 2), new bvb(i, 27)).a(uo5.e(s02.h0(150, 0, null, 6), 2)), uo5.o(s02.h0(400, 0, h74Var, 2), new bvb(i, 28)).a(uo5.f(s02.h0(150, 0, null, 6), 2)), i2);
            case 22:
                iwi iwiVar = (iwi) obj;
                iwiVar.getClass();
                return Integer.valueOf(iwiVar.a);
            case 23:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(s02.h0(150, 0, null, 6), 2), of6.b);
            case 24:
                vvi vviVar = (vvi) obj;
                vviVar.getClass();
                return duf.a.getOrCreateKotlinClass(vviVar.getClass());
            case 25:
                r60 r60Var2 = (r60) obj;
                r60Var2.getClass();
                i = ((lwi) r60Var2.a()).a.compareTo(((lwi) r60Var2.b()).a) > 0 ? 1 : -1;
                h74 h74Var2 = jg5.a;
                return new pp3(uo5.m(s02.h0(400, 0, h74Var2, 2), new bvb(i, 29)), uo5.o(s02.h0(400, 0, h74Var2, 2), new kwi(i, i3)), i2);
            case 26:
                lwi lwiVar = (lwi) obj;
                lwiVar.getClass();
                return lwiVar.a;
            case 27:
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                Parcelable parcelable = (Parcelable) gz8.K(bundle, "ARG_PAYLOAD", TotrSharePayload.class);
                if (parcelable != null) {
                    return (TotrSharePayload) parcelable;
                }
                a70.p("Parcelable ARG_PAYLOAD not found");
                return null;
            case 28:
                ((Integer) obj).getClass();
                return Unit.a;
            default:
                List list = (List) obj;
                list.getClass();
                if ((list.size() != 1 || Intrinsics.c(list.get(0), Season.SubSeasonType.OVERALL.getLabel())) && list.size() <= 1) {
                    r7 = false;
                }
                return Boolean.valueOf(r7);
        }
    }
}
