package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ja7 {
    public static final /* synthetic */ ja7[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final int b;
    public final int c;

    static {
        ja7[] ja7VarArr = {new ja7("JOIN", 0, R.drawable.ic_compare_players, R.string.fantasy_join_private_league_title, R.string.fantasy_join_private_league_body), new ja7("CREATE", 1, R.drawable.ic_lock_privacy, R.string.fantasy_create_a_private_league_title, R.string.fantasy_create_a_private_league_body), new ja7("JOIN_RANDOM", 2, R.drawable.ic_browser, R.string.fantasy_join_a_public_league_title, R.string.fantasy_join_a_public_league_body)};
        d = ja7VarArr;
        e = new kp5(ja7VarArr);
    }

    public ja7(String str, int i, int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    public static ja7 valueOf(String str) {
        return (ja7) Enum.valueOf(ja7.class, str);
    }

    public static ja7[] values() {
        return (ja7[]) d.clone();
    }
}
