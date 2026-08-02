package com.vk.stat.scheme;

import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeNetworkProtocol {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStat$TypeNetworkProtocol[] $VALUES;
    public static final SchemeStat$TypeNetworkProtocol H2;
    public static final SchemeStat$TypeNetworkProtocol HTTP_1_0;
    public static final SchemeStat$TypeNetworkProtocol HTTP_1_1;
    public static final SchemeStat$TypeNetworkProtocol QUIC;
    private final String value;

    /* compiled from: SchemeStat.kt */
    public static final class Serializer implements uay<SchemeStat$TypeNetworkProtocol> {
        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            return new hay(((SchemeStat$TypeNetworkProtocol) obj).value);
        }
    }

    static {
        SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol = new SchemeStat$TypeNetworkProtocol("HTTP_1_0", 0, "http/1.0");
        HTTP_1_0 = schemeStat$TypeNetworkProtocol;
        SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol2 = new SchemeStat$TypeNetworkProtocol("HTTP_1_1", 1, "http/1.1");
        HTTP_1_1 = schemeStat$TypeNetworkProtocol2;
        SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol3 = new SchemeStat$TypeNetworkProtocol("H2", 2, "h2");
        H2 = schemeStat$TypeNetworkProtocol3;
        SchemeStat$TypeNetworkProtocol schemeStat$TypeNetworkProtocol4 = new SchemeStat$TypeNetworkProtocol("QUIC", 3, "quic");
        QUIC = schemeStat$TypeNetworkProtocol4;
        SchemeStat$TypeNetworkProtocol[] schemeStat$TypeNetworkProtocolArr = {schemeStat$TypeNetworkProtocol, schemeStat$TypeNetworkProtocol2, schemeStat$TypeNetworkProtocol3, schemeStat$TypeNetworkProtocol4};
        $VALUES = schemeStat$TypeNetworkProtocolArr;
        $ENTRIES = new asp(schemeStat$TypeNetworkProtocolArr);
    }

    public SchemeStat$TypeNetworkProtocol(String str, int i, String str2) {
        this.value = str2;
    }

    public static SchemeStat$TypeNetworkProtocol valueOf(String str) {
        return (SchemeStat$TypeNetworkProtocol) Enum.valueOf(SchemeStat$TypeNetworkProtocol.class, str);
    }

    public static SchemeStat$TypeNetworkProtocol[] values() {
        return (SchemeStat$TypeNetworkProtocol[]) $VALUES.clone();
    }
}
