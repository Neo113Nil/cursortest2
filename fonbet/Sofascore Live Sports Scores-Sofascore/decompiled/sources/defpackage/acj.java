package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class acj {
    public static final acj a;
    public static final acj b;
    public static final acj c;
    public static final /* synthetic */ acj[] d;

    static {
        acj acjVar = new acj("None", 0);
        a = acjVar;
        acj acjVar2 = new acj("Touch", 1);
        b = acjVar2;
        acj acjVar3 = new acj("Mouse", 2);
        c = acjVar3;
        d = new acj[]{acjVar, acjVar2, acjVar3};
    }

    public static acj valueOf(String str) {
        return (acj) Enum.valueOf(acj.class, str);
    }

    public static acj[] values() {
        return (acj[]) d.clone();
    }
}
