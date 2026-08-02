package xf;

/* loaded from: classes10.dex */
public enum e {
    UNSET(0),
    TRUE(1),
    FALSE(2);

    private final int mValue;

    e(int i11) {
        this.mValue = i11;
    }

    public static e a(Boolean bool) {
        return bool == null ? UNSET : bool.booleanValue() ? TRUE : FALSE;
    }

    public final int b() {
        return this.mValue;
    }
}
