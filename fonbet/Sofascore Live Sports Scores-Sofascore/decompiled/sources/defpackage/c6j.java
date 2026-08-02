package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c6j {
    public static final c6j e;
    public static final c6j f;
    public static final c6j g;
    public static final c6j h;
    public static final /* synthetic */ c6j[] i;
    public static final /* synthetic */ kp5 j;
    public final int a;
    public final String b;
    public final jmf c;
    public final int d;

    static {
        c6j c6jVar = new c6j("ATP", 0, 3, "ATP", jmf.b, 5);
        e = c6jVar;
        c6j c6jVar2 = new c6j("WTA", 1, 6, "WTA", jmf.c, 6);
        f = c6jVar2;
        c6j c6jVar3 = new c6j("UTR_MEN", 2, 1843, "UTR", jmf.g, 34);
        g = c6jVar3;
        c6j c6jVar4 = new c6j("UTR_WOMEN", 3, 1844, "UTR", jmf.h, 35);
        h = c6jVar4;
        c6j[] c6jVarArr = {c6jVar, c6jVar2, c6jVar3, c6jVar4};
        i = c6jVarArr;
        j = new kp5(c6jVarArr);
    }

    public c6j(String str, int i2, int i3, String str2, jmf jmfVar, int i4) {
        this.a = i3;
        this.b = str2;
        this.c = jmfVar;
        this.d = i4;
    }

    public static c6j valueOf(String str) {
        return (c6j) Enum.valueOf(c6j.class, str);
    }

    public static c6j[] values() {
        return (c6j[]) i.clone();
    }
}
