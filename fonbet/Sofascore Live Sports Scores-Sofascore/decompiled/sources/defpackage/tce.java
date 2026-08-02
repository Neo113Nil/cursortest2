package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tce {
    public static final tce a;
    public static final tce b;
    public static final tce c;
    public static final /* synthetic */ tce[] d;

    /* JADX INFO: Fake field, exist only in values array */
    tce EF0;

    static {
        tce tceVar = new tce("HIDDEN", 0);
        tce tceVar2 = new tce("NOT_TAKEN", 1);
        a = tceVar2;
        tce tceVar3 = new tce("SCORED", 2);
        b = tceVar3;
        tce tceVar4 = new tce("MISSED", 3);
        c = tceVar4;
        d = new tce[]{tceVar, tceVar2, tceVar3, tceVar4};
    }

    public static tce valueOf(String str) {
        return (tce) Enum.valueOf(tce.class, str);
    }

    public static tce[] values() {
        return (tce[]) d.clone();
    }
}
