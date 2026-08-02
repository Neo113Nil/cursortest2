package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fpi {
    public static final fpi a;
    public static final fpi b;
    public static final fpi c;
    public static final /* synthetic */ fpi[] d;

    static {
        fpi fpiVar = new fpi("StartToEnd", 0);
        a = fpiVar;
        fpi fpiVar2 = new fpi("EndToStart", 1);
        b = fpiVar2;
        fpi fpiVar3 = new fpi("Settled", 2);
        c = fpiVar3;
        d = new fpi[]{fpiVar, fpiVar2, fpiVar3};
    }

    public static fpi valueOf(String str) {
        return (fpi) Enum.valueOf(fpi.class, str);
    }

    public static fpi[] values() {
        return (fpi[]) d.clone();
    }
}
