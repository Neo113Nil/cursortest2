package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hdj {
    public static final hdj a;
    public static final hdj b;
    public static final hdj c;
    public static final hdj d;
    public static final /* synthetic */ hdj[] e;

    static {
        hdj hdjVar = new hdj("StartInput", 0);
        a = hdjVar;
        hdj hdjVar2 = new hdj("StopInput", 1);
        b = hdjVar2;
        hdj hdjVar3 = new hdj("ShowKeyboard", 2);
        c = hdjVar3;
        hdj hdjVar4 = new hdj("HideKeyboard", 3);
        d = hdjVar4;
        e = new hdj[]{hdjVar, hdjVar2, hdjVar3, hdjVar4};
    }

    public static hdj valueOf(String str) {
        return (hdj) Enum.valueOf(hdj.class, str);
    }

    public static hdj[] values() {
        return (hdj[]) e.clone();
    }
}
