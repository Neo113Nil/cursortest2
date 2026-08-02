package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class twi {
    public static final jpe c;
    public static final twi d;
    public static final twi e;
    public static final /* synthetic */ twi[] f;
    public static final /* synthetic */ kp5 g;
    public final q9k a;
    public final String b;

    static {
        twi twiVar = new twi("List", 0, new q9k(R.string.matches_list_view), "matches");
        d = twiVar;
        twi twiVar2 = new twi("Calendar", 1, new q9k(R.string.menu_calendar), "calendar");
        e = twiVar2;
        twi[] twiVarArr = {twiVar, twiVar2};
        f = twiVarArr;
        g = new kp5(twiVarArr);
        c = new jpe(4);
    }

    public twi(String str, int i, q9k q9kVar, String str2) {
        this.a = q9kVar;
        this.b = str2;
    }

    public static twi valueOf(String str) {
        return (twi) Enum.valueOf(twi.class, str);
    }

    public static twi[] values() {
        return (twi[]) f.clone();
    }
}
