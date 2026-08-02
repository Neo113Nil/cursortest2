package defpackage;

import android.content.Context;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerSummaryEvent;
import com.sofascore.model.newNetwork.PlayerYearSummaryResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p8c extends hoi implements et8 {
    public String r;
    public String s;
    public int t;
    public /* synthetic */ Event u;
    public /* synthetic */ Player v;
    public /* synthetic */ Team w;
    public final /* synthetic */ MediaPost x;
    public final /* synthetic */ ku3 y;
    public final /* synthetic */ u8c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(4, rq3Var);
        this.x = mediaPost;
        this.y = ku3Var;
        this.z = u8cVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        p8c p8cVar = new p8c((rq3) obj4, this.y, this.z, this.x);
        p8cVar.u = (Event) obj;
        p8cVar.v = (Player) obj2;
        p8cVar.w = (Team) obj3;
        return p8cVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Pair pair2;
        Object w;
        String str;
        String str2;
        String slug;
        u8c u8cVar = this.z;
        Context context = u8cVar.a;
        Event event = this.u;
        Player player = this.v;
        Team team = this.w;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        MediaPost mediaPost = this.x;
        if (i == 0) {
            y6a.M(obj);
            Integer playerId = mediaPost.getPlayerId();
            if (playerId != null) {
                av4 t = xw3.t(this.y, null, new w7c(u8cVar, playerId.intValue(), null, 9), 3);
                List<String> tags = mediaPost.getTags();
                tags.getClass();
                if (tags.contains("exceptional")) {
                    if (tags.contains("ratingHigh")) {
                        pair2 = new Pair(context.getString(R.string.high_average_rating_title), context.getString(R.string.high_average_rating_body));
                    } else if (tags.contains("ratingConsistent")) {
                        pair2 = new Pair(context.getString(R.string.consistent_average_rating_title), context.getString(R.string.consistent_average_rating_body));
                    } else {
                        pair = new Pair(null, null);
                    }
                    pair = pair2;
                } else {
                    pair = new Pair(null, null);
                }
                String str3 = (String) pair.a;
                String str4 = (String) pair.b;
                this.u = event;
                this.v = player;
                this.w = team;
                this.r = str3;
                this.s = str4;
                this.t = 1;
                w = t.w(this);
                if (w == lu3Var) {
                    return lu3Var;
                }
                str = str4;
                str2 = str3;
            }
            return null;
        }
        if (i != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str5 = this.s;
        String str6 = this.r;
        y6a.M(obj);
        str2 = str6;
        str = str5;
        w = obj;
        PlayerYearSummaryResponse playerYearSummaryResponse = (PlayerYearSummaryResponse) yaa.x((x2g) w);
        List<PlayerSummaryEvent> summary = playerYearSummaryResponse != null ? playerYearSummaryResponse.getSummary() : null;
        if (summary != null && !summary.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : summary) {
                String type = ((PlayerSummaryEvent) obj2).getType();
                xyg[] xygVarArr = xyg.a;
                if (Intrinsics.c(type, "event")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String value = ((PlayerSummaryEvent) it.next()).getValue();
                Double f = value != null ? b.f(value) : null;
                if (f != null) {
                    arrayList2.add(f);
                }
            }
            Double d = new Double(CollectionsKt.O(arrayList2));
            Double d2 = !Double.isNaN(d.doubleValue()) ? d : null;
            int id = mediaPost.getId();
            long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
            Sport sport = mediaPost.getSport();
            if (sport != null && (slug = sport.getSlug()) != null) {
                return new zuh(id, str2, str, createdAtTimestamp, slug, uxf.F(event, context, false, false, null, null, 60), uxf.G(player), uxf.J(team, context, null, false, null, 30), l6g.W(summary), d2, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
            }
        }
        return null;
    }
}
