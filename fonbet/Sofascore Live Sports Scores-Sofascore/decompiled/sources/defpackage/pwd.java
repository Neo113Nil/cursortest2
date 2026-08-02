package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pwd {
    public static final pwd a;
    public static final pwd b;
    public static final /* synthetic */ pwd[] c;

    static {
        pwd pwdVar = new pwd("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = pwdVar;
        pwd pwdVar2 = new pwd("DROP_WORK_REQUEST", 1);
        b = pwdVar2;
        c = new pwd[]{pwdVar, pwdVar2};
    }

    public static pwd valueOf(String str) {
        return (pwd) Enum.valueOf(pwd.class, str);
    }

    public static pwd[] values() {
        return (pwd[]) c.clone();
    }
}
