package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kjj {
    public static final kjj a;
    public static final kjj b;
    public static final /* synthetic */ kjj[] c;

    /* JADX INFO: Fake field, exist only in values array */
    kjj EF0;

    static {
        kjj kjjVar = new kjj("FAKE", 0);
        kjj kjjVar2 = new kjj("MTLS", 1);
        a = kjjVar2;
        kjj kjjVar3 = new kjj("CUSTOM_MANAGERS", 2);
        b = kjjVar3;
        c = new kjj[]{kjjVar, kjjVar2, kjjVar3};
    }

    public static kjj valueOf(String str) {
        return (kjj) Enum.valueOf(kjj.class, str);
    }

    public static kjj[] values() {
        return (kjj[]) c.clone();
    }
}
