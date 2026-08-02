package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class baf {
    public static final baf b;
    public static final baf c;
    public static final /* synthetic */ baf[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;

    static {
        baf bafVar = new baf("TOP_PREDICTORS", 0, R.string.top_predictors);
        baf bafVar2 = new baf("TOP_CONTRIBUTORS", 1, R.string.top_contributors_leaderboard);
        b = bafVar2;
        baf bafVar3 = new baf("TOP_EDITORS", 2, R.string.top_editors_leaderboard);
        c = bafVar3;
        baf[] bafVarArr = {bafVar, bafVar2, bafVar3};
        d = bafVarArr;
        e = new kp5(bafVarArr);
    }

    public baf(String str, int i, int i2) {
        this.a = i2;
    }

    public static baf valueOf(String str) {
        return (baf) Enum.valueOf(baf.class, str);
    }

    public static baf[] values() {
        return (baf[]) d.clone();
    }
}
