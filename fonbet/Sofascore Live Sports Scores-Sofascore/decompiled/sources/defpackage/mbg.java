package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mbg {
    public static final mbg a;
    public static final mbg b;
    public static final mbg c;
    public static final /* synthetic */ mbg[] d;

    static {
        mbg mbgVar = new mbg("NEVER", 0);
        a = mbgVar;
        mbg mbgVar2 = new mbg("EXPANDED_ONLY", 1);
        b = mbgVar2;
        mbg mbgVar3 = new mbg("ALWAYS", 2);
        c = mbgVar3;
        d = new mbg[]{mbgVar, mbgVar2, mbgVar3};
    }

    public static mbg valueOf(String str) {
        return (mbg) Enum.valueOf(mbg.class, str);
    }

    public static mbg[] values() {
        return (mbg[]) d.clone();
    }
}
