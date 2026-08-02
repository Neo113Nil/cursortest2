package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum lqc {
    WIN(R.string.win_short, R.color.success),
    LOSE(R.string.losses_short, R.color.error),
    DRAW(R.string.draw_short, R.color.n_lv_1),
    NO_CONTEST(R.string.no_contest_short, R.color.n_lv_1),
    NONE(R.string.minus, R.color.n_lv_1);

    public final int a;
    public final int b;

    lqc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
