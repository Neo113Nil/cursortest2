package gf;

/* renamed from: gf.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC6726b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public static final a Companion = new a();
    private final int httpCode;

    /* renamed from: gf.b$a */
    public static final class a {
        public static EnumC6726b a(int i11) {
            for (EnumC6726b enumC6726b : EnumC6726b.values()) {
                if (enumC6726b.a() == i11) {
                    return enumC6726b;
                }
            }
            return null;
        }
    }

    EnumC6726b(int i11) {
        this.httpCode = i11;
    }

    public final int a() {
        return this.httpCode;
    }
}
