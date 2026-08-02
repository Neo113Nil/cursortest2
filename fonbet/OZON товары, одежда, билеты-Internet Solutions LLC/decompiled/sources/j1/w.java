package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w implements v {
    private static final /* synthetic */ w[] $VALUES;
    public static final w Active;
    public static final w ActiveParent;
    public static final w Captured;
    public static final w Inactive;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68742a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f68742a = iArr;
        }
    }

    static {
        w wVar = new w("Active", 0);
        Active = wVar;
        w wVar2 = new w("ActiveParent", 1);
        ActiveParent = wVar2;
        w wVar3 = new w("Captured", 2);
        Captured = wVar3;
        w wVar4 = new w("Inactive", 3);
        Inactive = wVar4;
        $VALUES = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    private w() {
        throw null;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    @Override // j1.v
    public final boolean a() {
        int i11 = a.f68742a[ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        throw new Sc.o();
    }

    public final boolean b() {
        int i11 = a.f68742a[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        throw new Sc.o();
    }
}
