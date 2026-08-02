package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f3e {
    public static final f3e b;
    public static final f3e c;
    public static final f3e d;
    public static final /* synthetic */ f3e[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;

    static {
        f3e f3eVar = new f3e("HighestRatedPlayers", 0, R.string.highest_ratings);
        b = f3eVar;
        f3e f3eVar2 = new f3e("MostAwards", 1, R.string.most_awards);
        c = f3eVar2;
        f3e f3eVar3 = new f3e("TopLeagues", 2, R.string.top_leagues);
        d = f3eVar3;
        f3e[] f3eVarArr = {f3eVar, f3eVar2, f3eVar3};
        e = f3eVarArr;
        f = new kp5(f3eVarArr);
    }

    public f3e(String str, int i, int i2) {
        this.a = i2;
    }

    public static f3e valueOf(String str) {
        return (f3e) Enum.valueOf(f3e.class, str);
    }

    public static f3e[] values() {
        return (f3e[]) e.clone();
    }
}
