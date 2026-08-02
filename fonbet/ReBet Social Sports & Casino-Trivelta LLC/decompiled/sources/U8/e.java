package U8;

import android.net.Uri;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.RenditionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class e {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Q8.e.values().length];
            try {
                iArr[Q8.e.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q8.e.MP4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q8.e.GIF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RenditionType.values().length];
            try {
                iArr2[RenditionType.original.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RenditionType.downsized.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RenditionType.downsizedMedium.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RenditionType.downsizedLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RenditionType.fixedWidth.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RenditionType.fixedWidthSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[RenditionType.fixedWidthDownsampled.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[RenditionType.fixedWidthStill.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[RenditionType.looping.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[RenditionType.fixedHeight.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[RenditionType.originalStill.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[RenditionType.preview.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[RenditionType.fixedHeightStill.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[RenditionType.fixedHeightDownsampled.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[RenditionType.fixedHeightSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[RenditionType.fixedHeightSmallStill.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[RenditionType.fixedWidthSmallStill.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[RenditionType.downsizedSmall.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[RenditionType.downsizedStill.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Image a(Media media, RenditionType imageType) {
        Intrinsics.checkNotNullParameter(media, "<this>");
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        switch (a.$EnumSwitchMapping$1[imageType.ordinal()]) {
            case 1:
                return media.getImages().getOriginal();
            case 2:
                return media.getImages().getDownsized();
            case 3:
                return media.getImages().getDownsizedMedium();
            case 4:
                return media.getImages().getDownsizedLarge();
            case 5:
                return media.getImages().getFixedWidth();
            case 6:
                return media.getImages().getFixedWidthSmall();
            case 7:
                return media.getImages().getFixedWidthDownsampled();
            case 8:
                return media.getImages().getFixedWidthStill();
            case 9:
                return media.getImages().getLooping();
            case 10:
                return media.getImages().getFixedHeight();
            case 11:
                return media.getImages().getOriginalStill();
            case 12:
                return media.getImages().getPreview();
            case 13:
                return media.getImages().getFixedHeightStill();
            case 14:
                return media.getImages().getFixedHeightDownsampled();
            case 15:
                return media.getImages().getFixedHeightSmall();
            case 16:
                return media.getImages().getFixedHeightSmallStill();
            case 17:
                return media.getImages().getFixedWidthSmall();
            case 18:
                return media.getImages().getDownsizedSmall();
            case 19:
                return media.getImages().getDownsizedStill();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Uri b(Image image, Q8.e imageFormat) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        int i10 = a.$EnumSwitchMapping$0[imageFormat.ordinal()];
        if (i10 == 1) {
            String webPUrl = image.getWebPUrl();
            if (webPUrl == null || webPUrl.length() == 0) {
                return null;
            }
            return Uri.parse(image.getWebPUrl());
        }
        if (i10 == 2) {
            String mp4Url = image.getMp4Url();
            if (mp4Url == null || mp4Url.length() == 0) {
                return null;
            }
            return Uri.parse(image.getMp4Url());
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String gifUrl = image.getGifUrl();
        if (gifUrl == null || gifUrl.length() == 0) {
            return null;
        }
        return Uri.parse(image.getGifUrl());
    }

    public static final Uri c(Image image, Q8.e imageFormat) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        Uri b10 = b(image, imageFormat);
        return (b10 == null && (b10 = b(image, Q8.e.WEBP)) == null) ? b(image, Q8.e.GIF) : b10;
    }
}
