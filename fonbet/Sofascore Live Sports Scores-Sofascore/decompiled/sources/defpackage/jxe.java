package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jxe {
    public static final /* synthetic */ jxe[] a = {new jxe("GOALKEEPER", 0), new jxe("PLAYER", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    jxe EF5;

    public static jxe valueOf(String str) {
        return (jxe) Enum.valueOf(jxe.class, str);
    }

    public static jxe[] values() {
        return (jxe[]) a.clone();
    }
}
