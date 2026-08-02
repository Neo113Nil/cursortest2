package e70;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6315b implements InterfaceC6316c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC6315b[] $VALUES;
    public static final EnumC6315b BAD_REQUEST;
    public static final EnumC6315b CONFLICT;
    public static final EnumC6315b EMPTY_BODY;
    public static final EnumC6315b FORBIDDEN;
    public static final EnumC6315b NOT_FOUND;
    public static final EnumC6315b NO_INTERNET;
    public static final EnumC6315b PAYLOAD_TOO_LARGE;
    public static final EnumC6315b REQUEST_TIMEOUT;
    public static final EnumC6315b SERIALIZATION;
    public static final EnumC6315b SERVER_ERROR;
    public static final EnumC6315b SERVICE_UNAVAILABLE;
    public static final EnumC6315b TOO_MANY_REQUESTS;
    public static final EnumC6315b UNAUTHORIZED;
    public static final EnumC6315b UNKNOWN;
    public static final EnumC6315b WRONG_CONTENT_TYPE;

    static {
        EnumC6315b enumC6315b = new EnumC6315b("BAD_REQUEST", 0);
        BAD_REQUEST = enumC6315b;
        EnumC6315b enumC6315b2 = new EnumC6315b("REQUEST_TIMEOUT", 1);
        REQUEST_TIMEOUT = enumC6315b2;
        EnumC6315b enumC6315b3 = new EnumC6315b("UNAUTHORIZED", 2);
        UNAUTHORIZED = enumC6315b3;
        EnumC6315b enumC6315b4 = new EnumC6315b("FORBIDDEN", 3);
        FORBIDDEN = enumC6315b4;
        EnumC6315b enumC6315b5 = new EnumC6315b("NOT_FOUND", 4);
        NOT_FOUND = enumC6315b5;
        EnumC6315b enumC6315b6 = new EnumC6315b("CONFLICT", 5);
        CONFLICT = enumC6315b6;
        EnumC6315b enumC6315b7 = new EnumC6315b("TOO_MANY_REQUESTS", 6);
        TOO_MANY_REQUESTS = enumC6315b7;
        EnumC6315b enumC6315b8 = new EnumC6315b("NO_INTERNET", 7);
        NO_INTERNET = enumC6315b8;
        EnumC6315b enumC6315b9 = new EnumC6315b("PAYLOAD_TOO_LARGE", 8);
        PAYLOAD_TOO_LARGE = enumC6315b9;
        EnumC6315b enumC6315b10 = new EnumC6315b("SERVER_ERROR", 9);
        SERVER_ERROR = enumC6315b10;
        EnumC6315b enumC6315b11 = new EnumC6315b("SERVICE_UNAVAILABLE", 10);
        SERVICE_UNAVAILABLE = enumC6315b11;
        EnumC6315b enumC6315b12 = new EnumC6315b("SERIALIZATION", 11);
        SERIALIZATION = enumC6315b12;
        EnumC6315b enumC6315b13 = new EnumC6315b("WRONG_CONTENT_TYPE", 12);
        WRONG_CONTENT_TYPE = enumC6315b13;
        EnumC6315b enumC6315b14 = new EnumC6315b("EMPTY_BODY", 13);
        EMPTY_BODY = enumC6315b14;
        EnumC6315b enumC6315b15 = new EnumC6315b(FraudMonInfo.UNKNOWN, 14);
        UNKNOWN = enumC6315b15;
        EnumC6315b[] enumC6315bArr = {enumC6315b, enumC6315b2, enumC6315b3, enumC6315b4, enumC6315b5, enumC6315b6, enumC6315b7, enumC6315b8, enumC6315b9, enumC6315b10, enumC6315b11, enumC6315b12, enumC6315b13, enumC6315b14, enumC6315b15};
        $VALUES = enumC6315bArr;
        $ENTRIES = Xc.b.a(enumC6315bArr);
    }

    private EnumC6315b() {
        throw null;
    }

    public static EnumC6315b valueOf(String str) {
        return (EnumC6315b) Enum.valueOf(EnumC6315b.class, str);
    }

    public static EnumC6315b[] values() {
        return (EnumC6315b[]) $VALUES.clone();
    }
}
