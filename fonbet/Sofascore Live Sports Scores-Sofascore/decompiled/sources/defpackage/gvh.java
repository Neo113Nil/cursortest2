package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gvh {
    public static final gvh c;
    public static final gvh d;
    public static final gvh e;
    public static final gvh f;
    public static final gvh g;
    public static final /* synthetic */ gvh[] h;
    public static final /* synthetic */ kp5 i;
    public final int a;
    public final Integer b;

    static {
        gvh gvhVar = new gvh(0, R.string.rating_general_text, null, "SPECIFIC_RATING");
        c = gvhVar;
        gvh gvhVar2 = new gvh(1, R.string.average_player_rating_text, null, "AVERAGE_GENERAL");
        gvh gvhVar3 = new gvh(2, R.string.average_player_rating_text, null, "AVERAGE_PLAYER");
        d = gvhVar3;
        gvh gvhVar4 = new gvh(3, R.string.average_team_rating_text, Integer.valueOf(R.string.v2_average_team_rating_text), "AVERAGE_TEAM");
        e = gvhVar4;
        gvh gvhVar5 = new gvh(4, R.string.average_team_rating_match, Integer.valueOf(R.string.v2_average_team_rating_match), "AVERAGE_MATCH");
        f = gvhVar5;
        gvh gvhVar6 = new gvh(5, R.string.average_sofascore_rating_text, null, "AVERAGE_RATING");
        g = gvhVar6;
        gvh[] gvhVarArr = {gvhVar, gvhVar2, gvhVar3, gvhVar4, gvhVar5, gvhVar6};
        h = gvhVarArr;
        i = new kp5(gvhVarArr);
    }

    public gvh(int i2, int i3, Integer num, String str) {
        this.a = i3;
        this.b = num;
    }

    public static gvh valueOf(String str) {
        return (gvh) Enum.valueOf(gvh.class, str);
    }

    public static gvh[] values() {
        return (gvh[]) h.clone();
    }
}
