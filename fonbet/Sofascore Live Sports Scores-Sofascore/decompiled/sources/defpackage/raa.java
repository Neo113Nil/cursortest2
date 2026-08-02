package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class raa {
    public static final raa a;
    public static final raa b;
    public static final raa c;
    public static final raa d;
    public static final /* synthetic */ raa[] e;

    static {
        raa raaVar = new raa("IGNORED", 0);
        a = raaVar;
        raa raaVar2 = new raa("SCHEDULED", 1);
        b = raaVar2;
        raa raaVar3 = new raa("DEFERRED", 2);
        c = raaVar3;
        raa raaVar4 = new raa("IMMINENT", 3);
        d = raaVar4;
        e = new raa[]{raaVar, raaVar2, raaVar3, raaVar4};
    }

    public static raa valueOf(String str) {
        return (raa) Enum.valueOf(raa.class, str);
    }

    public static raa[] values() {
        return (raa[]) e.clone();
    }
}
