package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xil {
    public static final xil b;
    public static final xil c;
    public static final /* synthetic */ xil[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;

    static {
        xil xilVar = new xil("PLAYERS", 0, R.string.players);
        b = xilVar;
        xil xilVar2 = new xil("FANTASY", 1, R.string.fantasy);
        c = xilVar2;
        xil[] xilVarArr = {xilVar, xilVar2};
        d = xilVarArr;
        e = new kp5(xilVarArr);
    }

    public xil(String str, int i, int i2) {
        this.a = i2;
    }

    public static xil valueOf(String str) {
        return (xil) Enum.valueOf(xil.class, str);
    }

    public static xil[] values() {
        return (xil[]) d.clone();
    }
}
