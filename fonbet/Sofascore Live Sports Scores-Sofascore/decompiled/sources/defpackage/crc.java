package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class crc {
    public static final crc a;
    public static final crc b;
    public static final crc c;
    public static final crc d;
    public static final /* synthetic */ crc[] e;

    static {
        crc crcVar = new crc("PRIMARY_HOME", 0);
        a = crcVar;
        crc crcVar2 = new crc("PRIMARY_AWAY", 1);
        b = crcVar2;
        crc crcVar3 = new crc("SECONDARY_HOME", 2);
        c = crcVar3;
        crc crcVar4 = new crc("SECONDARY_AWAY", 3);
        d = crcVar4;
        e = new crc[]{crcVar, crcVar2, crcVar3, crcVar4};
    }

    public static crc valueOf(String str) {
        return (crc) Enum.valueOf(crc.class, str);
    }

    public static crc[] values() {
        return (crc[]) e.clone();
    }
}
