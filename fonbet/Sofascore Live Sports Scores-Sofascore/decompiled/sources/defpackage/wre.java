package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wre implements ure {
    public static final /* synthetic */ wre[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final int b;

    static {
        wre[] wreVarArr = {new wre("POINTS", 0, "pointsTotal", R.string.total), new wre("ATTACK_POINTS", 1, "attackPoints", R.string.volleyball_attack), new wre("ACES", 2, "aces", R.string.volleyball_aces), new wre("BLOCK_POINTS", 3, "blockPoints", R.string.volleyball_blocks)};
        c = wreVarArr;
        d = new kp5(wreVarArr);
    }

    public wre(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static wre valueOf(String str) {
        return (wre) Enum.valueOf(wre.class, str);
    }

    public static wre[] values() {
        return (wre[]) c.clone();
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
