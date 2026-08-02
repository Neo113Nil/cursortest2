package com.vk.core.view.components.subnavigation;

import android.view.View;
import xsna.asp;
import xsna.zrp;

/* compiled from: SubnavigationButton.kt */
/* loaded from: classes17.dex */
public interface SubnavigationButton {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubnavigationButton.kt */
    public static final class Appearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance Accent;
        public static final Appearance Inherit;
        public static final Appearance Neutral;

        static {
            Appearance appearance = new Appearance("Inherit", 0);
            Inherit = appearance;
            Appearance appearance2 = new Appearance("Neutral", 1);
            Neutral = appearance2;
            Appearance appearance3 = new Appearance("Accent", 2);
            Accent = appearance3;
            Appearance[] appearanceArr = {appearance, appearance2, appearance3};
            $VALUES = appearanceArr;
            $ENTRIES = new asp(appearanceArr);
        }

        public Appearance() {
            throw null;
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubnavigationButton.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Outline;
        public static final Mode Primary;
        public static final Mode Secondary;
        public static final Mode Tertiary;

        static {
            Mode mode = new Mode("Primary", 0);
            Primary = mode;
            Mode mode2 = new Mode("Secondary", 1);
            Secondary = mode2;
            Mode mode3 = new Mode("Outline", 2);
            Outline = mode3;
            Mode mode4 = new Mode("Tertiary", 3);
            Tertiary = mode4;
            Mode[] modeArr = {mode, mode2, mode3, mode4};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubnavigationButton.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("Small", 0);
            Small = size;
            Size size2 = new Size("Medium", 1);
            Medium = size2;
            Size size3 = new Size("Large", 2);
            Large = size3;
            Size[] sizeArr = {size, size2, size3};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    void K1(Integer num);

    void Q0(Integer num);

    void l2(boolean z, Integer num);

    void setActive(boolean z);

    void setAppearance(Appearance appearance);

    void setClickListener(View.OnClickListener onClickListener);

    void setLabel(CharSequence charSequence);

    void setLeftIconVisible(boolean z);

    void setMode(Mode mode);

    void setParent(b bVar);

    void setRightIconVisible(boolean z);

    void setSize(Size size);
}
