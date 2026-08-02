package com.vk.core.tool.onboarding;

import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkOnboarding.kt */
/* loaded from: classes17.dex */
public final class VkOnboarding$HighlighterMarkerType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkOnboarding$HighlighterMarkerType[] $VALUES;
    public static final VkOnboarding$HighlighterMarkerType Type1;
    public static final VkOnboarding$HighlighterMarkerType Type2;
    public static final VkOnboarding$HighlighterMarkerType Type3;
    public static final VkOnboarding$HighlighterMarkerType Type4;

    /* compiled from: VkOnboarding.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOnboarding$HighlighterMarkerType.values().length];
            try {
                iArr[VkOnboarding$HighlighterMarkerType.Type1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOnboarding$HighlighterMarkerType.Type2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOnboarding$HighlighterMarkerType.Type3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkOnboarding$HighlighterMarkerType.Type4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType = new VkOnboarding$HighlighterMarkerType("Type1", 0);
        Type1 = vkOnboarding$HighlighterMarkerType;
        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType2 = new VkOnboarding$HighlighterMarkerType("Type2", 1);
        Type2 = vkOnboarding$HighlighterMarkerType2;
        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType3 = new VkOnboarding$HighlighterMarkerType("Type3", 2);
        Type3 = vkOnboarding$HighlighterMarkerType3;
        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType4 = new VkOnboarding$HighlighterMarkerType("Type4", 3);
        Type4 = vkOnboarding$HighlighterMarkerType4;
        VkOnboarding$HighlighterMarkerType[] vkOnboarding$HighlighterMarkerTypeArr = {vkOnboarding$HighlighterMarkerType, vkOnboarding$HighlighterMarkerType2, vkOnboarding$HighlighterMarkerType3, vkOnboarding$HighlighterMarkerType4};
        $VALUES = vkOnboarding$HighlighterMarkerTypeArr;
        $ENTRIES = new asp(vkOnboarding$HighlighterMarkerTypeArr);
    }

    public VkOnboarding$HighlighterMarkerType() {
        throw null;
    }

    public static VkOnboarding$HighlighterMarkerType valueOf(String str) {
        return (VkOnboarding$HighlighterMarkerType) Enum.valueOf(VkOnboarding$HighlighterMarkerType.class, str);
    }

    public static VkOnboarding$HighlighterMarkerType[] values() {
        return (VkOnboarding$HighlighterMarkerType[]) $VALUES.clone();
    }

    public final int h() {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return R.drawable.vk_icon_onboarding_highlighter_4_12h;
        }
        if (i == 2) {
            return R.drawable.vk_icon_onboarding_highlighter_2_12h;
        }
        if (i == 3) {
            return R.drawable.vk_icon_onboarding_highlighter_3_12h;
        }
        if (i == 4) {
            return R.drawable.vk_icon_onboarding_highlighter_1_12h;
        }
        throw new NoWhenBranchMatchedException();
    }
}
