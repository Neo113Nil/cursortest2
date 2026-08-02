package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lre {
    public static final lre c;
    public static final /* synthetic */ lre[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final boolean b;

    static {
        lre lreVar = new lre(0, R.string.all, "ALL", false);
        c = lreVar;
        lre[] lreVarArr = {lreVar, new lre(1, R.string.at_least_percent_appearances, "AT_LEAST_50_PERCENT", true)};
        d = lreVarArr;
        e = new kp5(lreVarArr);
    }

    public lre(int i, int i2, String str, boolean z) {
        this.a = i2;
        this.b = z;
    }

    public static lre valueOf(String str) {
        return (lre) Enum.valueOf(lre.class, str);
    }

    public static lre[] values() {
        return (lre[]) d.clone();
    }
}
