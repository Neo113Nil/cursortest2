package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum glj {
    ENGLAND(new q9k(R.string.england), "EN"),
    GERMANY(new q9k(R.string.germany), PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_END),
    FRANCE(new q9k(R.string.france), "FR"),
    SPAIN(new q9k(R.string.spain), "ES"),
    ITALY(new q9k(R.string.italy), "IT");

    public final q9k a;
    public final String b;

    glj(q9k q9kVar, String str) {
        this.a = q9kVar;
        this.b = str;
    }
}
