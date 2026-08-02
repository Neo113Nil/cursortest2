package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vre implements ure {
    public static final /* synthetic */ vre[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final int b;

    static {
        vre[] vreVarArr = {new vre("POINTS", 0, "points", R.string.rugby_points), new vre("TRIES", 1, "tries", R.string.rugby_tries), new vre("TACKLES", 2, "tackles", R.string.rugby_tackles), new vre("CARRIES", 3, "carries", R.string.rugby_carries)};
        c = vreVarArr;
        d = new kp5(vreVarArr);
    }

    public vre(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static vre valueOf(String str) {
        return (vre) Enum.valueOf(vre.class, str);
    }

    public static vre[] values() {
        return (vre[]) c.clone();
    }

    @Override // defpackage.ure
    public final int d() {
        return this.b;
    }

    @Override // defpackage.ure
    public final String g() {
        return this.a;
    }
}
