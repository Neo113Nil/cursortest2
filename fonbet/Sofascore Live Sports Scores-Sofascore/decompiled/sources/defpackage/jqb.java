package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jqb {
    public static final rik h;
    public static final jqb i;
    public static final jqb j;
    public static final jqb k;
    public static final jqb l;
    public static final jqb m;
    public static final jqb n;
    public static final jqb o;
    public static final jqb p;
    public static final jqb q;
    public static final /* synthetic */ jqb[] r;
    public static final /* synthetic */ kp5 s;
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    static {
        jqb jqbVar = new jqb("MATCHES", 0, R.string.matches, R.drawable.ic_access_time_outline, R.drawable.ic_access_time_filled, 24);
        i = jqbVar;
        jqb jqbVar2 = new jqb("STAGE_RACES", 1, R.string.series, R.drawable.ic_access_time_outline, R.drawable.ic_access_time_filled, 24);
        j = jqbVar2;
        jqb jqbVar3 = new jqb("CYCLING_EVENTS", 2, R.string.cycling, R.drawable.ic_cycling, R.drawable.ic_cycling, 24);
        k = jqbVar3;
        jqb jqbVar4 = new jqb("MMA_EVENTS", 3, R.string.events, R.drawable.ic_access_time_outline, R.drawable.ic_access_time_filled, 24);
        l = jqbVar4;
        jqb jqbVar5 = new jqb("FAVORITES", 4, R.string.favourites, R.drawable.ic_star_empty, R.drawable.ic_star, 80);
        m = jqbVar5;
        jqb jqbVar6 = new jqb("WORLD_CUP", 5, R.string.wc26, 2131233094, 2131233094, 88);
        n = jqbVar6;
        jqb jqbVar7 = new jqb("FEATURED_TOURNAMENT", 6, R.string.afcon_25, R.drawable.ic_afcon, R.drawable.ic_afcon, 104);
        o = jqbVar7;
        jqb jqbVar8 = new jqb("FEED", 7, R.string.never_miss, R.drawable.ic_news_empty, R.drawable.ic_news, 88);
        p = jqbVar8;
        jqb jqbVar9 = new jqb("FANTASY", 8, R.string.fantasy, R.drawable.ic_main_fantasy, R.drawable.ic_main_fantasy_filled, 88);
        q = jqbVar9;
        jqb[] jqbVarArr = {jqbVar, jqbVar2, jqbVar3, jqbVar4, jqbVar5, jqbVar6, jqbVar7, jqbVar8, jqbVar9};
        r = jqbVarArr;
        s = new kp5(jqbVarArr);
        h = new rik(27);
    }

    public jqb(String str, int i2, int i3, int i4, int i5, int i6) {
        boolean z = (i6 & 8) == 0;
        boolean z2 = (i6 & 16) == 0;
        boolean z3 = (i6 & 32) == 0;
        boolean z4 = (i6 & 64) == 0;
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static jqb valueOf(String str) {
        return (jqb) Enum.valueOf(jqb.class, str);
    }

    public static jqb[] values() {
        return (jqb[]) r.clone();
    }
}
