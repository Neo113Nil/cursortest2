package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class aij {
    public static final aij a;
    public static final aij b;
    public static final aij c;
    public static final /* synthetic */ aij[] d;

    static {
        aij aijVar = new aij("NONE", 0);
        a = aijVar;
        aij aijVar2 = new aij("DATE", 1);
        b = aijVar2;
        aij aijVar3 = new aij("TIME", 2);
        c = aijVar3;
        d = new aij[]{aijVar, aijVar2, aijVar3};
    }

    public static aij valueOf(String str) {
        return (aij) Enum.valueOf(aij.class, str);
    }

    public static aij[] values() {
        return (aij[]) d.clone();
    }
}
