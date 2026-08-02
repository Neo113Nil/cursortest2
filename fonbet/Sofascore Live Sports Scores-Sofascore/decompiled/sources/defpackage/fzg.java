package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fzg {
    public static final jpe c;
    public static final fzg d;
    public static final fzg e;
    public static final fzg f;
    public static final /* synthetic */ fzg[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;

    static {
        fzg fzgVar = new fzg("ALL", 0, R.string.all, R.string.all);
        d = fzgVar;
        fzg fzgVar2 = new fzg("PER_GAME", 1, R.string.per_game_stats_short, R.string.basketball_per_game_stats_title);
        e = fzgVar2;
        fzg fzgVar3 = new fzg("TOTAL", 2, R.string.total_stats_short, R.string.total);
        f = fzgVar3;
        fzg[] fzgVarArr = {fzgVar, fzgVar2, fzgVar3};
        g = fzgVarArr;
        h = new kp5(fzgVarArr);
        c = new jpe(2);
    }

    public fzg(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static fzg valueOf(String str) {
        return (fzg) Enum.valueOf(fzg.class, str);
    }

    public static fzg[] values() {
        return (fzg[]) g.clone();
    }
}
