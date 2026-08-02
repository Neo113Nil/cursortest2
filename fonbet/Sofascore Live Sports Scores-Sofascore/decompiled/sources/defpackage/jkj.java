package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jkj {
    public static final jkj a;
    public static final jkj b;
    public static final jkj c;
    public static final /* synthetic */ jkj[] d;

    static {
        jkj jkjVar = new jkj("Uninitialized", 0);
        a = jkjVar;
        jkj jkjVar2 = new jkj("Detached", 1);
        b = jkjVar2;
        jkj jkjVar3 = new jkj("Attached", 2);
        c = jkjVar3;
        d = new jkj[]{jkjVar, jkjVar2, jkjVar3};
    }

    public static jkj valueOf(String str) {
        return (jkj) Enum.valueOf(jkj.class, str);
    }

    public static jkj[] values() {
        return (jkj[]) d.clone();
    }
}
