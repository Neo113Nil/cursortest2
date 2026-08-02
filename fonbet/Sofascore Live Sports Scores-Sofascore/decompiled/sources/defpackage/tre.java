package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tre implements ure {
    public static final tre d;
    public static final tre e;
    public static final /* synthetic */ tre[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;
    public final int b;
    public final boolean c;

    static {
        tre treVar = new tre("POINTS", "points", 0, R.string.points_basketball, false);
        tre treVar2 = new tre("REBOUNDS", "rebounds", 1, R.string.rebounds, false);
        tre treVar3 = new tre("ASSISTS", "assists", 2, R.string.football_assists, false);
        tre treVar4 = new tre("STEALS", "steals", 3, R.string.steals, true);
        d = treVar4;
        tre treVar5 = new tre("BLOCKS", "blocks", 4, R.string.blocks, true);
        e = treVar5;
        tre[] treVarArr = {treVar, treVar2, treVar3, treVar4, treVar5};
        f = treVarArr;
        g = new kp5(treVarArr);
    }

    public tre(String str, String str2, int i, int i2, boolean z) {
        this.a = str2;
        this.b = i2;
        this.c = z;
    }

    public static tre valueOf(String str) {
        return (tre) Enum.valueOf(tre.class, str);
    }

    public static tre[] values() {
        return (tre[]) f.clone();
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
