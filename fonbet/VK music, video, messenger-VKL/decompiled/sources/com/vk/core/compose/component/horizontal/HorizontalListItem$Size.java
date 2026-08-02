package com.vk.core.compose.component.horizontal;

import xsna.asp;
import xsna.zrp;

/* compiled from: HorizontalListItem.kt */
/* loaded from: classes17.dex */
public interface HorizontalListItem$Size {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HorizontalListItem.kt */
    public static final class WithPicture implements HorizontalListItem$Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WithPicture[] $VALUES;
        public static final WithPicture Medium;
        public static final WithPicture Small;

        static {
            WithPicture withPicture = new WithPicture("Small", 0);
            Small = withPicture;
            WithPicture withPicture2 = new WithPicture("Medium", 1);
            Medium = withPicture2;
            WithPicture[] withPictureArr = {withPicture, withPicture2};
            $VALUES = withPictureArr;
            $ENTRIES = new asp(withPictureArr);
        }

        public WithPicture() {
            throw null;
        }

        public static WithPicture valueOf(String str) {
            return (WithPicture) Enum.valueOf(WithPicture.class, str);
        }

        public static WithPicture[] values() {
            return (WithPicture[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HorizontalListItem.kt */
    public static final class WithPlainImage implements HorizontalListItem$Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WithPlainImage[] $VALUES;
        public static final WithPlainImage ExtraLarge;
        public static final WithPlainImage Large;

        static {
            WithPlainImage withPlainImage = new WithPlainImage("Large", 0);
            Large = withPlainImage;
            WithPlainImage withPlainImage2 = new WithPlainImage("ExtraLarge", 1);
            ExtraLarge = withPlainImage2;
            WithPlainImage[] withPlainImageArr = {withPlainImage, withPlainImage2};
            $VALUES = withPlainImageArr;
            $ENTRIES = new asp(withPlainImageArr);
        }

        public WithPlainImage() {
            throw null;
        }

        public static WithPlainImage valueOf(String str) {
            return (WithPlainImage) Enum.valueOf(WithPlainImage.class, str);
        }

        public static WithPlainImage[] values() {
            return (WithPlainImage[]) $VALUES.clone();
        }
    }
}
