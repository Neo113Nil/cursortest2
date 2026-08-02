package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i08 {
    public static final a99 d;
    public static final /* synthetic */ i08[] e;
    public static final /* synthetic */ kp5 f;
    public final String a;
    public final int b;
    public final int c;

    static {
        i08[] i08VarArr = {new i08("MMA", 0, Sports.MMA, R.string.mma, R.drawable.ic_discipline_mma), new i08("KICKBOXING", 1, "kickboxing", R.string.mma_fighting_style_kickboxing, R.drawable.ic_discipline_kickboxing), new i08("BOXING", 2, "boxing", R.string.mma_fighting_style_boxing, R.drawable.ic_discipline_boxing), new i08("MUAY_THAI", 3, "muay-thai", R.string.mma_fighting_style_muay_thai, R.drawable.ic_discipline_muay_thai), new i08("GRAPPLING", 4, "grappling", R.string.mma_fighting_style_submission_grappling, R.drawable.ic_discipline_grappling)};
        e = i08VarArr;
        f = new kp5(i08VarArr);
        d = new a99(23);
    }

    public i08(String str, int i, String str2, int i2, int i3) {
        this.a = str2;
        this.b = i2;
        this.c = i3;
    }

    public static i08 valueOf(String str) {
        return (i08) Enum.valueOf(i08.class, str);
    }

    public static i08[] values() {
        return (i08[]) e.clone();
    }
}
