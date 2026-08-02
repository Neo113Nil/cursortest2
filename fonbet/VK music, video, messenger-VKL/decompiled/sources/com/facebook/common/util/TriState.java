package com.facebook.common.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class TriState {
    private static final /* synthetic */ TriState[] $VALUES;
    public static final TriState NO;
    public static final TriState UNSET;
    public static final TriState YES;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TriState.values().length];
            a = iArr;
            try {
                iArr[TriState.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TriState.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TriState.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        TriState triState = new TriState("YES", 0);
        YES = triState;
        TriState triState2 = new TriState("NO", 1);
        NO = triState2;
        TriState triState3 = new TriState("UNSET", 2);
        UNSET = triState3;
        $VALUES = new TriState[]{triState, triState2, triState3};
    }

    public TriState() {
        throw null;
    }

    public static TriState valueOf(String str) {
        return (TriState) Enum.valueOf(TriState.class, str);
    }

    public static TriState[] values() {
        return (TriState[]) $VALUES.clone();
    }

    public final boolean h() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }
}
