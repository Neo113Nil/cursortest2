package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ysa {
    public static final ysa a;
    public static final ysa b;
    public static final ysa c;
    public static final /* synthetic */ ysa[] d;

    static {
        ysa ysaVar = new ysa("SYNCHRONIZED", 0);
        a = ysaVar;
        ysa ysaVar2 = new ysa("PUBLICATION", 1);
        b = ysaVar2;
        ysa ysaVar3 = new ysa("NONE", 2);
        c = ysaVar3;
        d = new ysa[]{ysaVar, ysaVar2, ysaVar3};
    }

    public static ysa valueOf(String str) {
        return (ysa) Enum.valueOf(ysa.class, str);
    }

    public static ysa[] values() {
        return (ysa[]) d.clone();
    }
}
