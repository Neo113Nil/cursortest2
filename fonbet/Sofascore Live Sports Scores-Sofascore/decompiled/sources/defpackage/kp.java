package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class kp {
    public static final kp a;
    public static final /* synthetic */ kp[] b;

    /* JADX INFO: Fake field, exist only in values array */
    kp EF0;

    static {
        kp kpVar = new kp("AM", 0);
        kp kpVar2 = new kp("PM", 1);
        a = kpVar2;
        b = new kp[]{kpVar, kpVar2};
    }

    public static kp valueOf(String str) {
        return (kp) Enum.valueOf(kp.class, str);
    }

    public static kp[] values() {
        return (kp[]) b.clone();
    }
}
