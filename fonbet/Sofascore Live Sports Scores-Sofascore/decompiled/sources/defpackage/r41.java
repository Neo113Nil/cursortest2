package defpackage;

import android.content.SharedPreferences;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.network.response.MediaHighlightedItem;
import com.sofascore.model.network.response.playerOfTheSeason.POTSNetworkPlayer;
import com.sofascore.model.network.response.playerOfTheSeason.POTSTopCompetitionNetworkItem;
import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r41 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ r41(v1e v1eVar, List list) {
        this.a = 6;
        this.b = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r1 == null) goto L34;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String name;
        gv9 gv9Var;
        jqk jqkVar;
        int i = this.a;
        rfl rflVar = null;
        List<POTSTopCompetitionNetworkItem> list = this.b;
        switch (i) {
            case 0:
                return zbc.a((zbc) obj, 0, null, l6g.W(list), null, null, false, 59);
            case 1:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                bga bgaVar = vga.a;
                bgaVar.getClass();
                editor.putString("PREF_BUZZER_TILE_ORDER", bgaVar.c(new xg0(uhi.a, 0), list));
                return Unit.a;
            case 2:
                int intValue = ((Integer) obj).intValue();
                int i2 = DynamicBottomNavigation.q;
                return Boolean.valueOf(intValue >= list.size());
            case 3:
                return Boolean.valueOf(list.contains(Integer.valueOf(((Event) obj).getId())));
            case 4:
                ((Integer) obj).getClass();
                return Integer.valueOf(list.size());
            case 5:
                SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
                editor2.getClass();
                editor2.putString("PREF_MATCH_OF_THE_WEEK_SHOWN_EVENT_IDS", CollectionsKt.f0(this.b, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                return Unit.a;
            case 6:
                q1e q1eVar = (q1e) obj;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new o1e((String) it.next()));
                }
                return q1e.a(q1eVar, l6g.W(CollectionsKt.w0(arrayList, a.c(n1e.a))), null, null, 6);
            case 7:
                c3e c3eVar = (c3e) obj;
                xbb b = a.b();
                for (POTSTopCompetitionNetworkItem pOTSTopCompetitionNetworkItem : list) {
                    int id = pOTSTopCompetitionNetworkItem.getUniqueTournament().getId();
                    String x = tba.x(pOTSTopCompetitionNetworkItem.getUniqueTournament());
                    if (x == null) {
                        x = "";
                    }
                    b.add(new a3e(id, x));
                    int i3 = 0;
                    for (Object obj2 : pOTSTopCompetitionNetworkItem.getTopPlayers()) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            b.q();
                            throw null;
                        }
                        POTSNetworkPlayer pOTSNetworkPlayer = (POTSNetworkPlayer) obj2;
                        int id2 = pOTSTopCompetitionNetworkItem.getUniqueTournament().getId();
                        boolean z = i3 == b.i(pOTSTopCompetitionNetworkItem.getTopPlayers());
                        pOTSNetworkPlayer.getClass();
                        int id3 = pOTSNetworkPlayer.getPlayer().getId();
                        String t = tba.t(pOTSNetworkPlayer.getPlayer());
                        int id4 = pOTSNetworkPlayer.getSeason().getId();
                        String year = pOTSNetworkPlayer.getSeason().getYear();
                        int id5 = pOTSNetworkPlayer.getTeam().getId();
                        FieldTranslations fieldTranslations = pOTSNetworkPlayer.getTeam().getFieldTranslations();
                        if (fieldTranslations == null || (name = tba.r(fieldTranslations)) == null) {
                            name = pOTSNetworkPlayer.getTeam().getName();
                        }
                        b.add(new z2e(id3, t, id4, year, id5, name, id2, pOTSNetworkPlayer.getRating(), z));
                        i3 = i4;
                    }
                }
                gv9 W = l6g.W(a.a(b));
                boolean z2 = c3eVar.b;
                W.getClass();
                return new c3e(W, z2);
            default:
                oil oilVar = (oil) obj;
                rfl rflVar2 = oilVar.g;
                if (rflVar2 != null) {
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            MediaHighlightedItem mediaHighlightedItem = (MediaHighlightedItem) it2.next();
                            Integer mo689getId = mediaHighlightedItem.getItem().mo689getId();
                            if (mo689getId != null) {
                                int intValue2 = mo689getId.intValue();
                                String title = mediaHighlightedItem.getItem().getTitle();
                                String str = title == null ? "" : title;
                                String subtitle = mediaHighlightedItem.getItem().getSubtitle();
                                String str2 = subtitle == null ? "" : subtitle;
                                String thumbnailUrl = mediaHighlightedItem.getItem().getThumbnailUrl();
                                String str3 = thumbnailUrl == null ? "" : thumbnailUrl;
                                String videoUrl = mediaHighlightedItem.getItem().getVideoUrl();
                                jqkVar = new jqk(intValue2, str, str2, str3, videoUrl == null ? "" : videoUrl);
                            } else {
                                jqkVar = null;
                            }
                            if (jqkVar != null) {
                                arrayList2.add(jqkVar);
                            }
                        }
                        gv9Var = l6g.W(arrayList2);
                        break;
                    }
                    gv9Var = rlh.b;
                    rflVar = rfl.a(rflVar2, null, gv9Var, null, 447);
                }
                return oil.a(oilVar, null, null, null, null, null, false, rflVar, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554367);
        }
    }

    public /* synthetic */ r41(List list, int i) {
        this.a = i;
        this.b = list;
    }
}
