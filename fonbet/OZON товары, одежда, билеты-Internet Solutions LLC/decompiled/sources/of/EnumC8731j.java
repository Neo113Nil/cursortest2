package of;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: of.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC8731j {
    private static final /* synthetic */ EnumC8731j[] $VALUES;
    public static final EnumC8731j CONTINUE_ALWAYS;
    public static final EnumC8731j DISCONNECT_AFTER_REQUEST;
    public static final EnumC8731j DISCONNECT_AT_END;
    public static final EnumC8731j DISCONNECT_AT_START;
    public static final EnumC8731j DISCONNECT_DURING_REQUEST_BODY;
    public static final EnumC8731j DISCONNECT_DURING_RESPONSE_BODY;
    public static final EnumC8731j EXPECT_CONTINUE;
    public static final EnumC8731j FAIL_HANDSHAKE;
    public static final EnumC8731j KEEP_OPEN;
    public static final EnumC8731j NO_RESPONSE;
    public static final EnumC8731j RESET_STREAM_AT_START;
    public static final EnumC8731j SHUTDOWN_INPUT_AT_END;
    public static final EnumC8731j SHUTDOWN_OUTPUT_AT_END;
    public static final EnumC8731j SHUTDOWN_SERVER_AFTER_RESPONSE;
    public static final EnumC8731j STALL_SOCKET_AT_START;
    public static final EnumC8731j UPGRADE_TO_SSL_AT_END;

    static {
        EnumC8731j enumC8731j = new EnumC8731j("SHUTDOWN_SERVER_AFTER_RESPONSE", 0);
        SHUTDOWN_SERVER_AFTER_RESPONSE = enumC8731j;
        EnumC8731j enumC8731j2 = new EnumC8731j("KEEP_OPEN", 1);
        KEEP_OPEN = enumC8731j2;
        EnumC8731j enumC8731j3 = new EnumC8731j("DISCONNECT_AT_END", 2);
        DISCONNECT_AT_END = enumC8731j3;
        EnumC8731j enumC8731j4 = new EnumC8731j("UPGRADE_TO_SSL_AT_END", 3);
        UPGRADE_TO_SSL_AT_END = enumC8731j4;
        EnumC8731j enumC8731j5 = new EnumC8731j("DISCONNECT_AT_START", 4);
        DISCONNECT_AT_START = enumC8731j5;
        EnumC8731j enumC8731j6 = new EnumC8731j("DISCONNECT_AFTER_REQUEST", 5);
        DISCONNECT_AFTER_REQUEST = enumC8731j6;
        EnumC8731j enumC8731j7 = new EnumC8731j("DISCONNECT_DURING_REQUEST_BODY", 6);
        DISCONNECT_DURING_REQUEST_BODY = enumC8731j7;
        EnumC8731j enumC8731j8 = new EnumC8731j("DISCONNECT_DURING_RESPONSE_BODY", 7);
        DISCONNECT_DURING_RESPONSE_BODY = enumC8731j8;
        EnumC8731j enumC8731j9 = new EnumC8731j("FAIL_HANDSHAKE", 8);
        FAIL_HANDSHAKE = enumC8731j9;
        EnumC8731j enumC8731j10 = new EnumC8731j("SHUTDOWN_INPUT_AT_END", 9);
        SHUTDOWN_INPUT_AT_END = enumC8731j10;
        EnumC8731j enumC8731j11 = new EnumC8731j("SHUTDOWN_OUTPUT_AT_END", 10);
        SHUTDOWN_OUTPUT_AT_END = enumC8731j11;
        EnumC8731j enumC8731j12 = new EnumC8731j("STALL_SOCKET_AT_START", 11);
        STALL_SOCKET_AT_START = enumC8731j12;
        EnumC8731j enumC8731j13 = new EnumC8731j("NO_RESPONSE", 12);
        NO_RESPONSE = enumC8731j13;
        EnumC8731j enumC8731j14 = new EnumC8731j("RESET_STREAM_AT_START", 13);
        RESET_STREAM_AT_START = enumC8731j14;
        EnumC8731j enumC8731j15 = new EnumC8731j("EXPECT_CONTINUE", 14);
        EXPECT_CONTINUE = enumC8731j15;
        EnumC8731j enumC8731j16 = new EnumC8731j("CONTINUE_ALWAYS", 15);
        CONTINUE_ALWAYS = enumC8731j16;
        $VALUES = new EnumC8731j[]{enumC8731j, enumC8731j2, enumC8731j3, enumC8731j4, enumC8731j5, enumC8731j6, enumC8731j7, enumC8731j8, enumC8731j9, enumC8731j10, enumC8731j11, enumC8731j12, enumC8731j13, enumC8731j14, enumC8731j15, enumC8731j16};
    }

    private EnumC8731j() {
        throw null;
    }

    public static EnumC8731j valueOf(String str) {
        return (EnumC8731j) Enum.valueOf(EnumC8731j.class, str);
    }

    public static EnumC8731j[] values() {
        return (EnumC8731j[]) $VALUES.clone();
    }
}
