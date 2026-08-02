package cZ;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC5791a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC5791a[] $VALUES;
    public static final EnumC5791a DNS_TIME;
    public static final EnumC5791a TCP_TIME;
    public static final EnumC5791a TIME_TO_FIRST_BYTE;
    public static final EnumC5791a TIME_TO_LAST_BYTE;
    public static final EnumC5791a TLS_TIME;

    @NotNull
    private final String jsonKey;

    static {
        EnumC5791a enumC5791a = new EnumC5791a("DNS_TIME", 0, "dnsTime");
        DNS_TIME = enumC5791a;
        EnumC5791a enumC5791a2 = new EnumC5791a("TCP_TIME", 1, "tcpTime");
        TCP_TIME = enumC5791a2;
        EnumC5791a enumC5791a3 = new EnumC5791a("TLS_TIME", 2, "tlsTime");
        TLS_TIME = enumC5791a3;
        EnumC5791a enumC5791a4 = new EnumC5791a("TIME_TO_FIRST_BYTE", 3, "timeToFirstByte");
        TIME_TO_FIRST_BYTE = enumC5791a4;
        EnumC5791a enumC5791a5 = new EnumC5791a("TIME_TO_LAST_BYTE", 4, "timeToLastByte");
        TIME_TO_LAST_BYTE = enumC5791a5;
        EnumC5791a[] enumC5791aArr = {enumC5791a, enumC5791a2, enumC5791a3, enumC5791a4, enumC5791a5};
        $VALUES = enumC5791aArr;
        $ENTRIES = b.a(enumC5791aArr);
    }

    private EnumC5791a(String str, int i11, String str2) {
        this.jsonKey = str2;
    }

    @NotNull
    public static Xc.a<EnumC5791a> a() {
        return $ENTRIES;
    }

    public static EnumC5791a valueOf(String str) {
        return (EnumC5791a) Enum.valueOf(EnumC5791a.class, str);
    }

    public static EnumC5791a[] values() {
        return (EnumC5791a[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.jsonKey;
    }
}
