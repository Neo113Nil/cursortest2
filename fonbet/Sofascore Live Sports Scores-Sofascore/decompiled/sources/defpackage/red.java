package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class red {
    public static final it7 c;
    public static final /* synthetic */ red[] d;
    public static final /* synthetic */ kp5 e;
    public final String a;
    public final Function1 b;

    static {
        red[] redVarArr = {new red("WildPitch", 0, "WILD_PITCH", null), new red("Steal", 1, "STEAL", null), new red("Pickoff", 2, "PICK_OFF", null), new red("Bunt", 3, "BUNT", null), new red("CaughtStealing", 4, "CAUGHT_STEALING", null), new red("LineupChange", 5, "LINEUP_CHANGE", new a7d(13))};
        d = redVarArr;
        e = new kp5(redVarArr);
        c = new it7(29);
    }

    public red(String str, int i, String str2, a7d a7dVar) {
        this.a = str2;
        this.b = a7dVar;
    }

    public static red valueOf(String str) {
        return (red) Enum.valueOf(red.class, str);
    }

    public static red[] values() {
        return (red[]) d.clone();
    }
}
