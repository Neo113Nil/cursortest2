package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum gmf {
    PROMOTION_ZONE(R.string.weekly_challenge_promotion, R.color.success, R.drawable.ic_section_arrow_up),
    DEMOTION_ZONE(R.string.weekly_challenge_relegation, R.color.error, R.drawable.ic_section_arrow_up),
    FILLING_UP_ZONE(R.string.weekly_challenge_leaderboard_empty, 0, 0);

    public final int a;
    public final int b;
    public final int c;

    gmf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
