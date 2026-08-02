package com.vk.core.view.components.button.dropdown;

import com.vk.core.view.components.button.VkButton;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* compiled from: VkDropdownButton.kt */
/* loaded from: classes17.dex */
public final class VkDropdownButton extends VkButton {
    public Appearance a0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkDropdownButton.kt */
    public static final class Appearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance Accent;
        public static final Appearance Neutral;

        static {
            Appearance appearance = new Appearance("Accent", 0);
            Accent = appearance;
            Appearance appearance2 = new Appearance("Neutral", 1);
            Neutral = appearance2;
            Appearance[] appearanceArr = {appearance, appearance2};
            $VALUES = appearanceArr;
            $ENTRIES = new asp(appearanceArr);
        }

        public Appearance() {
            throw null;
        }

        public static zrp<Appearance> h() {
            return $ENTRIES;
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }
    }

    /* compiled from: VkDropdownButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Appearance.values().length];
            try {
                iArr[Appearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Appearance.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Appearance getDropdownAppearance() {
        return this.a0;
    }

    public final void setDropdownAppearance(Appearance appearance) {
        VkButton.Appearance appearance2;
        this.a0 = appearance;
        int i = a.$EnumSwitchMapping$0[appearance.ordinal()];
        if (i == 1) {
            appearance2 = VkButton.Appearance.Accent;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            appearance2 = VkButton.Appearance.Neutral;
        }
        setAppearance(appearance2);
    }
}
