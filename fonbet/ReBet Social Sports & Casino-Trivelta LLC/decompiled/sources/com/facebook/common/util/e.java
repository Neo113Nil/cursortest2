package com.facebook.common.util;

/* loaded from: classes2.dex */
public enum e {
    YES,
    NO,
    UNSET;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$common$util$TriState;

        static {
            int[] iArr = new int[e.values().length];
            $SwitchMap$com$facebook$common$util$TriState = iArr;
            try {
                iArr[e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$common$util$TriState[e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$common$util$TriState[e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e c(boolean z10) {
        return z10 ? YES : NO;
    }

    public boolean a() {
        int i10 = a.$SwitchMap$com$facebook$common$util$TriState[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public boolean b() {
        return this != UNSET;
    }
}
