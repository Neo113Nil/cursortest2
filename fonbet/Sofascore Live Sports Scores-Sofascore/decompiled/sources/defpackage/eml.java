package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class eml {
    public static final eml c;
    public static final eml d;
    public static final eml e;
    public static final eml f;
    public static final /* synthetic */ eml[] g;
    public static final /* synthetic */ kp5 h;
    public final char a;
    public final char b;

    static {
        eml emlVar = new eml("OBJ", 0, '{', '}');
        c = emlVar;
        eml emlVar2 = new eml("LIST", 1, '[', ']');
        d = emlVar2;
        eml emlVar3 = new eml("MAP", 2, '{', '}');
        e = emlVar3;
        eml emlVar4 = new eml("POLY_OBJ", 3, '[', ']');
        f = emlVar4;
        eml[] emlVarArr = {emlVar, emlVar2, emlVar3, emlVar4};
        g = emlVarArr;
        h = new kp5(emlVarArr);
    }

    public eml(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static eml valueOf(String str) {
        return (eml) Enum.valueOf(eml.class, str);
    }

    public static eml[] values() {
        return (eml[]) g.clone();
    }
}
