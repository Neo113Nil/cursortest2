package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class qt implements nk2 {
    public static final gt b;
    public static final lt c;
    public static final ot d;
    public static final pt e;
    public static final ht f;
    public static final mt g;
    public static final jt h;
    public static final nt i;
    public static final kt j;
    public static final /* synthetic */ qt[] k;
    public static final /* synthetic */ kp5 l;
    public final int a;

    static {
        lt ltVar = new lt();
        c = ltVar;
        ot otVar = new ot();
        d = otVar;
        pt ptVar = new pt();
        e = ptVar;
        ht htVar = new ht();
        f = htVar;
        mt mtVar = new mt();
        g = mtVar;
        jt jtVar = new jt();
        h = jtVar;
        nt ntVar = new nt();
        i = ntVar;
        kt ktVar = new kt();
        j = ktVar;
        qt[] qtVarArr = {ltVar, otVar, ptVar, htVar, mtVar, jtVar, ntVar, ktVar};
        k = qtVarArr;
        l = new kp5(qtVarArr);
        b = new gt();
    }

    public qt(String str, int i2, int i3) {
        this.a = i3;
    }

    public static qt valueOf(String str) {
        return (qt) Enum.valueOf(qt.class, str);
    }

    public static qt[] values() {
        return (qt[]) k.clone();
    }

    @Override // defpackage.nk2
    public final int d() {
        return this.a;
    }
}
