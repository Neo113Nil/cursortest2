package defpackage;

import android.os.Bundle;
import com.ironsource.C4427z5;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.DbMyUniqueTournament;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.TvChannelVote;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class crj implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ crj(o5k o5kVar) {
        this.a = 26;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nlg V0;
        int i;
        Stage stage;
        long startDateTimestamp;
        String name;
        StageSeason stageSeason;
        UniqueStage uniqueStage;
        String slug;
        String name2;
        int id;
        switch (this.a) {
            case 0:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                V0 = glgVar.V0("SELECT uniqueTournamentId FROM my_leagues WHERE notificationsEnabled = 1");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.U0()) {
                        arrayList.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT uniqueTournamentId FROM my_leagues");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT DISTINCT category_sport_slug FROM leagues");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (V0.U0()) {
                        arrayList3.add(V0.isNull(0) ? null : V0.F0(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 3:
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                V0 = glgVar4.V0("SELECT id FROM pinned_tournaments_table ORDER BY orderIndex");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.U0()) {
                        arrayList4.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList4;
                } finally {
                }
            case 4:
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                V0 = glgVar5.V0("SELECT COUNT(*) FROM pinned_tournaments_table");
                try {
                    i = V0.U0() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 5:
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                V0 = glgVar6.V0("SELECT id FROM pinned_tournaments_table ORDER BY orderIndex");
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (V0.U0()) {
                        arrayList5.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList5;
                } finally {
                }
            case 6:
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                V0 = glgVar7.V0("SELECT * FROM my_leagues");
                try {
                    int r = w1a.r(V0, "uniqueTournamentId");
                    int r2 = w1a.r(V0, "notificationsEnabled");
                    ArrayList arrayList6 = new ArrayList();
                    while (V0.U0()) {
                        arrayList6.add(new DbMyUniqueTournament((int) V0.getLong(r), ((int) V0.getLong(r2)) != 0));
                    }
                    return arrayList6;
                } finally {
                }
            case 7:
                nlg nlgVar = (nlg) obj;
                nlgVar.getClass();
                return Boolean.valueOf(nlgVar.U0());
            case 8:
                o0h o0hVar = (o0h) obj;
                long j = o0hVar.g;
                a5f a5fVar = o0hVar.i;
                if (a5fVar != null) {
                    a5fVar.i(o0hVar, yso.o, o0hVar.h);
                }
                long j2 = o0hVar.g;
                if (j != j2) {
                    h0h h0hVar = o0hVar.p;
                    if (h0hVar != null) {
                        if (h0hVar.a > j2) {
                            o0hVar.T();
                        } else {
                            h0hVar.g = j2;
                            if (h0hVar.b == null) {
                                h0hVar.h = wzb.c((1.0d - h0hVar.e.a(0)) * o0hVar.g);
                            }
                        }
                    } else if (j2 != 0) {
                        o0hVar.Y();
                    }
                }
                return Unit.a;
            case 9:
                w8g w8gVar = (w8g) obj;
                w8gVar.getClass();
                return w8gVar.getKey();
            case 10:
                w8g w8gVar2 = (w8g) obj;
                w8gVar2.getClass();
                return duf.a.getOrCreateKotlinClass(w8gVar2.getClass());
            case 11:
                nlg nlgVar2 = (nlg) obj;
                nlgVar2.getClass();
                c9h c9hVar = new c9h();
                while (nlgVar2.U0()) {
                    c9hVar.add(Integer.valueOf((int) nlgVar2.getLong(0)));
                }
                return w9h.a(c9hVar);
            case 12:
                fui fuiVar = (fui) obj;
                fuiVar.getClass();
                return Boolean.valueOf(fuiVar.d);
            case 13:
                ((fui) obj).getClass();
                return Boolean.TRUE;
            case 14:
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                return (Country) gz8.M(bundle, "ARG_TV_CHANNEL_SELECTED_COUNTRY", Country.class);
            case 15:
                glg glgVar8 = (glg) obj;
                glgVar8.getClass();
                V0 = glgVar8.V0("SELECT * FROM tv_channel_vote_table");
                try {
                    int r3 = w1a.r(V0, "eventId");
                    int r4 = w1a.r(V0, "channelId");
                    int r5 = w1a.r(V0, "isConfirmed");
                    int r6 = w1a.r(V0, "timestamp");
                    ArrayList arrayList7 = new ArrayList();
                    while (V0.U0()) {
                        arrayList7.add(new TvChannelVote((int) V0.getLong(r3), (int) V0.getLong(r4), ((int) V0.getLong(r5)) != 0, V0.getLong(r6)));
                    }
                    return arrayList7;
                } finally {
                }
            case 16:
                glg glgVar9 = (glg) obj;
                glgVar9.getClass();
                V0 = glgVar9.V0("SELECT * FROM my_channels_table");
                try {
                    int r7 = w1a.r(V0, "id");
                    int r8 = w1a.r(V0, "name");
                    int r9 = w1a.r(V0, "countryCode");
                    int r10 = w1a.r(V0, "link");
                    ArrayList arrayList8 = new ArrayList();
                    while (V0.U0()) {
                        arrayList8.add(new TvChannel((int) V0.getLong(r7), V0.F0(r8), V0.F0(r9), V0.isNull(r10) ? null : V0.F0(r10)));
                    }
                    return arrayList8;
                } finally {
                }
            case 17:
                glg glgVar10 = (glg) obj;
                glgVar10.getClass();
                V0 = glgVar10.V0("SELECT countryCode FROM my_channels_table");
                try {
                    ArrayList arrayList9 = new ArrayList();
                    while (V0.U0()) {
                        arrayList9.add(V0.F0(0));
                    }
                    return arrayList9;
                } finally {
                }
            case 18:
                glg glgVar11 = (glg) obj;
                glgVar11.getClass();
                V0 = glgVar11.V0("SELECT COUNT(id) FROM my_channels_table");
                try {
                    i = V0.U0() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 19:
                Pair pair = (Pair) obj;
                pair.getClass();
                Object obj2 = pair.b;
                Event event = obj2 instanceof Event ? (Event) obj2 : null;
                if (event != null) {
                    startDateTimestamp = event.getStartTimestamp();
                } else {
                    stage = obj2 instanceof Stage ? (Stage) obj2 : null;
                    if (stage == null) {
                        return 0L;
                    }
                    startDateTimestamp = stage.getStartDateTimestamp();
                }
                return Long.valueOf(startDateTimestamp);
            case 20:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                Object obj3 = pair2.b;
                Event event2 = obj3 instanceof Event ? (Event) obj3 : null;
                if (event2 != null && (name = Event.getHomeTeam$default(event2, null, 1, null).getName()) != null) {
                    return name;
                }
                stage = obj3 instanceof Stage ? (Stage) obj3 : null;
                return stage != null ? stage.getDescription() : "";
            case 21:
                Pair pair3 = (Pair) obj;
                pair3.getClass();
                Object obj4 = pair3.b;
                Event event3 = obj4 instanceof Event ? (Event) obj4 : null;
                if (event3 != null && (name2 = Event.getAwayTeam$default(event3, null, 1, null).getName()) != null) {
                    return name2;
                }
                stage = obj4 instanceof Stage ? (Stage) obj4 : null;
                return (stage == null || (stageSeason = stage.getStageSeason()) == null || (uniqueStage = stageSeason.getUniqueStage()) == null || (slug = uniqueStage.getSlug()) == null) ? "" : slug;
            case 22:
                Pair pair4 = (Pair) obj;
                pair4.getClass();
                Object obj5 = pair4.b;
                Event event4 = obj5 instanceof Event ? (Event) obj5 : null;
                if (event4 != null) {
                    id = event4.getId();
                } else {
                    stage = obj5 instanceof Stage ? (Stage) obj5 : null;
                    if (stage == null) {
                        return 0;
                    }
                    id = stage.getId();
                }
                return Integer.valueOf(id);
            case 23:
                int i2 = TypeHeaderView.q;
                ((List) obj).getClass();
                return Boolean.FALSE;
            case 24:
                ((List) obj).getClass();
                return Boolean.TRUE;
            case 25:
                List list = (List) obj;
                list.getClass();
                return Boolean.valueOf(list.size() > 1);
            case 26:
                KTypeProjection kTypeProjection = (KTypeProjection) obj;
                kTypeProjection.getClass();
                if (kTypeProjection.getVariance() == null) {
                    return "*";
                }
                KType type = kTypeProjection.getType();
                o5k o5kVar = type instanceof o5k ? (o5k) type : null;
                String a = o5kVar != null ? o5kVar.a(true) : String.valueOf(kTypeProjection.getType());
                int i3 = n5k.a[kTypeProjection.getVariance().ordinal()];
                if (i3 == 1) {
                    return a;
                }
                if (i3 == 2) {
                    return "in ".concat(a);
                }
                if (i3 == 3) {
                    return "out ".concat(a);
                }
                zzl.b();
                return null;
            case 27:
                Pair pair5 = (Pair) obj;
                pair5.getClass();
                String str = (String) pair5.a;
                Object obj6 = pair5.b;
                if (obj6 == null) {
                    return str;
                }
                return str + C4427z5.U + String.valueOf(obj6);
            case 28:
                ((phe) obj).getClass();
                return Unit.a;
            default:
                glg glgVar12 = (glg) obj;
                glgVar12.getClass();
                V0 = glgVar12.V0("SELECT id FROM my_unique_stage");
                try {
                    ArrayList arrayList10 = new ArrayList();
                    while (V0.U0()) {
                        arrayList10.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList10;
                } finally {
                }
        }
    }

    public /* synthetic */ crj(int i) {
        this.a = i;
    }
}
