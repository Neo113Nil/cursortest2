package defpackage;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q8c extends hoi implements Function2 {
    public final /* synthetic */ MediaPost A;
    public String r;
    public String s;
    public bx7 t;
    public int u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ ku3 y;
    public final /* synthetic */ u8c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(2, rq3Var);
        this.y = ku3Var;
        this.z = u8cVar;
        this.A = mediaPost;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        q8c q8cVar = new q8c(rq3Var, this.y, this.z, this.A);
        q8cVar.x = obj;
        return q8cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q8c) create((Event) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Pair pair2;
        Object obj2;
        Object w;
        long j;
        String str;
        String str2;
        bx7 bx7Var;
        int i;
        u8c u8cVar = this.z;
        Context context = u8cVar.a;
        Event event = (Event) this.x;
        lu3 lu3Var = lu3.a;
        int i2 = this.w;
        if (i2 == 0) {
            y6a.M(obj);
            av4 t = xw3.t(this.y, null, new s7c(u8cVar, event, null, 11), 3);
            MediaPost mediaPost = this.A;
            List<String> tags = mediaPost.getTags();
            tags.getClass();
            if (tags.contains("exceptional")) {
                if (tags.contains("grandSlam")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_grand_slam_title), context.getString(R.string.cards_tennis_grand_slam_body));
                } else if (tags.contains("davisCup")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_davis_cup_title), context.getString(R.string.cards_tennis_davis_cup_body));
                } else if (tags.contains("billieJean")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_billie_jean_title), context.getString(R.string.cards_tennis_billie_jean_body));
                } else if (tags.contains("comeback")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_comeback_title), context.getString(R.string.cards_tennis_comeback_body));
                } else if (tags.contains("underdog")) {
                    pair = new Pair(context.getString(R.string.cards_tennis_underdog_title), null);
                } else if (tags.contains("tiebreak")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_tiebreaks_title), context.getString(R.string.cards_tennis_tiebreaks_body));
                } else if (tags.contains("break")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_breaks_title), context.getString(R.string.cards_tennis_breaks_body));
                } else if (tags.contains("comeUp")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_comeup_title), context.getString(R.string.cards_tennis_comeup_body));
                } else if (tags.contains("set")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_5_set_title), context.getString(R.string.cards_tennis_5_set_body));
                } else if (tags.contains("top10")) {
                    pair2 = new Pair(context.getString(R.string.cards_tennis_top_10_title), context.getString(R.string.cards_tennis_top_10_body));
                } else {
                    pair = new Pair(null, null);
                }
                pair = pair2;
            } else {
                pair = new Pair(null, null);
            }
            String str3 = (String) pair.a;
            String str4 = (String) pair.b;
            int id = mediaPost.getId();
            long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
            obj2 = null;
            bx7 F = uxf.F(event, context, true, true, null, null, 52);
            this.x = event;
            this.r = str3;
            this.s = str4;
            this.t = F;
            this.u = id;
            this.v = createdAtTimestamp;
            this.w = 1;
            w = t.w(this);
            if (w == lu3Var) {
                return lu3Var;
            }
            j = createdAtTimestamp;
            str = str3;
            str2 = str4;
            bx7Var = F;
            i = id;
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j2 = this.v;
            int i3 = this.u;
            bx7 bx7Var2 = this.t;
            String str5 = this.s;
            String str6 = this.r;
            y6a.M(obj);
            j = j2;
            str2 = str5;
            obj2 = null;
            str = str6;
            bx7Var = bx7Var2;
            w = obj;
            i = i3;
        }
        n6j n6jVar = (n6j) yaa.x((x2g) w);
        return n6jVar == null ? obj2 : new m6j(i, str, str2, j, Sports.TENNIS, bx7Var, n6jVar, event, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
    }
}
