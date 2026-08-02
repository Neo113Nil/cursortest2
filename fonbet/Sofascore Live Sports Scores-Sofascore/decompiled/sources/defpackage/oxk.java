package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oxk implements xse {
    public static final bgf d;
    public static final oxk e;
    public static final /* synthetic */ oxk[] f;
    public static final /* synthetic */ kp5 g;
    public final String a;
    public final Function1 b;
    public final int c;

    static {
        oxk oxkVar = new oxk("POINTS", 0, "Points", new owk(27), R.string.volleyball_points);
        e = oxkVar;
        oxk[] oxkVarArr = {oxkVar, new oxk("ATTACKS", 1, "Attacks", new owk(28), R.string.volleyball_attack), new oxk("ACES", 2, "Aces", new owk(29), R.string.volleyball_aces), new oxk("BLOCKS", 3, "Blocks", new nxk(0), R.string.volleyball_blocks)};
        f = oxkVarArr;
        g = new kp5(oxkVarArr);
        d = new bgf(5);
    }

    public oxk(String str, int i, String str2, Function1 function1, int i2) {
        this.a = str2;
        this.b = function1;
        this.c = i2;
    }

    public static oxk valueOf(String str) {
        return (oxk) Enum.valueOf(oxk.class, str);
    }

    public static oxk[] values() {
        return (oxk[]) f.clone();
    }

    @Override // defpackage.xse
    public final Function1 d() {
        return this.b;
    }

    @Override // defpackage.xse
    public final int g() {
        return this.c;
    }

    @Override // defpackage.xse
    public final String getValue() {
        return this.a;
    }
}
