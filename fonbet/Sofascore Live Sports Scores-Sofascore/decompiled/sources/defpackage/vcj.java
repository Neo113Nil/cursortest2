package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vcj {
    public static final vcj a;
    public static final vcj b;
    public static final /* synthetic */ vcj[] c;

    static {
        vcj vcjVar = new vcj("Filled", 0);
        a = vcjVar;
        vcj vcjVar2 = new vcj("Outlined", 1);
        b = vcjVar2;
        c = new vcj[]{vcjVar, vcjVar2};
    }

    public static vcj valueOf(String str) {
        return (vcj) Enum.valueOf(vcj.class, str);
    }

    public static vcj[] values() {
        return (vcj[]) c.clone();
    }
}
