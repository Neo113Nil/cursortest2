package xe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ O[] $VALUES;
    public static final O ATOMIC;
    public static final O DEFAULT;
    public static final O LAZY;
    public static final O UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105412a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105412a = iArr;
        }
    }

    static {
        O o11 = new O("DEFAULT", 0);
        DEFAULT = o11;
        O o12 = new O("LAZY", 1);
        LAZY = o12;
        O o13 = new O("ATOMIC", 2);
        ATOMIC = o13;
        O o14 = new O("UNDISPATCHED", 3);
        UNDISPATCHED = o14;
        O[] oArr = {o11, o12, o13, o14};
        $VALUES = oArr;
        $ENTRIES = Xc.b.a(oArr);
    }

    private O() {
        throw null;
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }
}
