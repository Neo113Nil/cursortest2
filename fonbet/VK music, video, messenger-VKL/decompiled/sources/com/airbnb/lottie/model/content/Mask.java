package com.airbnb.lottie.model.content;

import xsna.pf2;
import xsna.wf2;

/* loaded from: classes12.dex */
public final class Mask {
    public final MaskMode a;
    public final wf2 b;
    public final pf2 c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MaskMode {
        private static final /* synthetic */ MaskMode[] $VALUES;
        public static final MaskMode MASK_MODE_ADD;
        public static final MaskMode MASK_MODE_INTERSECT;
        public static final MaskMode MASK_MODE_NONE;
        public static final MaskMode MASK_MODE_SUBTRACT;

        static {
            MaskMode maskMode = new MaskMode("MASK_MODE_ADD", 0);
            MASK_MODE_ADD = maskMode;
            MaskMode maskMode2 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            MASK_MODE_SUBTRACT = maskMode2;
            MaskMode maskMode3 = new MaskMode("MASK_MODE_INTERSECT", 2);
            MASK_MODE_INTERSECT = maskMode3;
            MaskMode maskMode4 = new MaskMode("MASK_MODE_NONE", 3);
            MASK_MODE_NONE = maskMode4;
            $VALUES = new MaskMode[]{maskMode, maskMode2, maskMode3, maskMode4};
        }

        public MaskMode() {
            throw null;
        }

        public static MaskMode valueOf(String str) {
            return (MaskMode) Enum.valueOf(MaskMode.class, str);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) $VALUES.clone();
        }
    }

    public Mask(MaskMode maskMode, wf2 wf2Var, pf2 pf2Var, boolean z) {
        this.a = maskMode;
        this.b = wf2Var;
        this.c = pf2Var;
        this.d = z;
    }
}
