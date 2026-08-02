package com.vk.dto.market;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoodVariants.kt */
/* loaded from: classes18.dex */
public final class VariantGroupType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VariantGroupType[] $VALUES;
    public static final VariantGroupType COLOR;
    public static final a Companion;
    public static final VariantGroupType IMAGE;
    public static final VariantGroupType TEXT;

    /* renamed from: default, reason: not valid java name */
    private static final VariantGroupType f31default;
    private final String id;

    /* compiled from: GoodVariants.kt */
    public static final class a {
        public static VariantGroupType a(String str) {
            VariantGroupType variantGroupType;
            if (str == null) {
                return VariantGroupType.f31default;
            }
            VariantGroupType[] values = VariantGroupType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    variantGroupType = null;
                    break;
                }
                variantGroupType = values[i];
                if (epx.f(variantGroupType.getId(), str)) {
                    break;
                }
                i++;
            }
            return variantGroupType == null ? VariantGroupType.f31default : variantGroupType;
        }
    }

    static {
        VariantGroupType variantGroupType = new VariantGroupType("TEXT", 0, "text");
        TEXT = variantGroupType;
        VariantGroupType variantGroupType2 = new VariantGroupType("IMAGE", 1, "image");
        IMAGE = variantGroupType2;
        VariantGroupType variantGroupType3 = new VariantGroupType("COLOR", 2, "color");
        COLOR = variantGroupType3;
        VariantGroupType[] variantGroupTypeArr = {variantGroupType, variantGroupType2, variantGroupType3};
        $VALUES = variantGroupTypeArr;
        $ENTRIES = new asp(variantGroupTypeArr);
        Companion = new a();
        f31default = variantGroupType;
    }

    public VariantGroupType(String str, int i, String str2) {
        this.id = str2;
    }

    public static VariantGroupType valueOf(String str) {
        return (VariantGroupType) Enum.valueOf(VariantGroupType.class, str);
    }

    public static VariantGroupType[] values() {
        return (VariantGroupType[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
