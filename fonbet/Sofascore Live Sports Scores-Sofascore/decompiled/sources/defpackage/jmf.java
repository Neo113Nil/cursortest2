package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jmf {
    public static final jmf b;
    public static final jmf c;
    public static final jmf d;
    public static final jmf e;
    public static final jmf f;
    public static final jmf g;
    public static final jmf h;
    public static final /* synthetic */ jmf[] i;
    public static final /* synthetic */ kp5 j;
    public final int a;

    static {
        jmf jmfVar = new jmf("ATP", 0, 5);
        b = jmfVar;
        jmf jmfVar2 = new jmf("WTA", 1, 6);
        c = jmfVar2;
        jmf jmfVar3 = new jmf("UEFA", 2, 9);
        d = jmfVar3;
        jmf jmfVar4 = new jmf("RUGBY", 3, 3);
        e = jmfVar4;
        jmf jmfVar5 = new jmf("FIFA", 4, 2);
        f = jmfVar5;
        jmf jmfVar6 = new jmf("UTR_MEN", 5, 34);
        g = jmfVar6;
        jmf jmfVar7 = new jmf("UTR_WOMEN", 6, 35);
        h = jmfVar7;
        jmf[] jmfVarArr = {jmfVar, jmfVar2, jmfVar3, jmfVar4, jmfVar5, jmfVar6, jmfVar7};
        i = jmfVarArr;
        j = new kp5(jmfVarArr);
    }

    public jmf(String str, int i2, int i3) {
        this.a = i3;
    }

    public static jmf valueOf(String str) {
        return (jmf) Enum.valueOf(jmf.class, str);
    }

    public static jmf[] values() {
        return (jmf[]) i.clone();
    }
}
