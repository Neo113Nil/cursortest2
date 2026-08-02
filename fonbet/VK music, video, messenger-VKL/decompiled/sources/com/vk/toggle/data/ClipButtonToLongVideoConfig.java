package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* compiled from: ClipButtonToLongVideoConfig.kt */
/* loaded from: classes11.dex */
public final class ClipButtonToLongVideoConfig {
    public static final a b = new a();
    public static final ClipButtonToLongVideoConfig c = new ClipButtonToLongVideoConfig(0);
    public final Variant a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipButtonToLongVideoConfig.kt */
    public static final class Variant {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        public static final Variant BUTTON_RECOLOR;
        public static final Variant COMPACT_CAROUSEL;
        public static final Variant EXPANDED_CAROUSEL;
        public static final Variant NONE;

        static {
            Variant variant = new Variant("BUTTON_RECOLOR", 0);
            BUTTON_RECOLOR = variant;
            Variant variant2 = new Variant("COMPACT_CAROUSEL", 1);
            COMPACT_CAROUSEL = variant2;
            Variant variant3 = new Variant("EXPANDED_CAROUSEL", 2);
            EXPANDED_CAROUSEL = variant3;
            Variant variant4 = new Variant("NONE", 3);
            NONE = variant4;
            Variant[] variantArr = {variant, variant2, variant3, variant4};
            $VALUES = variantArr;
            $ENTRIES = new asp(variantArr);
        }

        public Variant() {
            throw null;
        }

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipButtonToLongVideoConfig.kt */
    public static final class a {
    }

    public ClipButtonToLongVideoConfig() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClipButtonToLongVideoConfig) && this.a == ((ClipButtonToLongVideoConfig) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClipButtonToLongVideoConfig(variant=" + this.a + ')';
    }

    public ClipButtonToLongVideoConfig(Variant variant) {
        this.a = variant;
    }

    public /* synthetic */ ClipButtonToLongVideoConfig(int i) {
        this(Variant.NONE);
    }
}
