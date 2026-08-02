package v5;

/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC10228b {
    ENABLED("ENABLED", 0),
    READ_ONLY("READ_ONLY", 1),
    WRITE_ONLY("WRITE_ONLY", 2),
    DISABLED("DISABLED", 3);

    private final boolean readEnabled;
    private final boolean writeEnabled;

    EnumC10228b(String str, int i11) {
        this.readEnabled = r1;
        this.writeEnabled = r2;
    }

    public final boolean a() {
        return this.readEnabled;
    }

    public final boolean b() {
        return this.writeEnabled;
    }
}
