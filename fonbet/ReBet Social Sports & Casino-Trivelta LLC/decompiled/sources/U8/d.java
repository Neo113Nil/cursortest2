package U8;

import android.content.Intent;
import android.net.Uri;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Images;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.RenditionType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f12144a = new d();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenditionType.values().length];
            try {
                iArr[RenditionType.original.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenditionType.downsized.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RenditionType.downsizedMedium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RenditionType.downsizedLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RenditionType.fixedWidth.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RenditionType.fixedWidthDownsampled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RenditionType.fixedWidthStill.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RenditionType.looping.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RenditionType.fixedHeight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Q8.e.values().length];
            try {
                iArr2[Q8.e.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Q8.e.MP4.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Q8.e.GIF.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final Image a(Media media, RenditionType imageType) {
        Images images;
        Images images2;
        Images images3;
        Images images4;
        Images images5;
        Images images6;
        Images images7;
        Images images8;
        Images images9;
        Intrinsics.checkNotNullParameter(imageType, "imageType");
        switch (a.$EnumSwitchMapping$0[imageType.ordinal()]) {
            case 1:
                if (media == null || (images = media.getImages()) == null) {
                    return null;
                }
                return images.getOriginal();
            case 2:
                if (media == null || (images2 = media.getImages()) == null) {
                    return null;
                }
                return images2.getDownsized();
            case 3:
                if (media == null || (images3 = media.getImages()) == null) {
                    return null;
                }
                return images3.getDownsizedMedium();
            case 4:
                if (media == null || (images4 = media.getImages()) == null) {
                    return null;
                }
                return images4.getDownsizedLarge();
            case 5:
                if (media == null || (images5 = media.getImages()) == null) {
                    return null;
                }
                return images5.getFixedWidth();
            case 6:
                if (media == null || (images6 = media.getImages()) == null) {
                    return null;
                }
                return images6.getFixedWidthDownsampled();
            case 7:
                if (media == null || (images7 = media.getImages()) == null) {
                    return null;
                }
                return images7.getFixedWidthStill();
            case 8:
                if (media == null || (images8 = media.getImages()) == null) {
                    return null;
                }
                return images8.getLooping();
            case 9:
                if (media == null || (images9 = media.getImages()) == null) {
                    return null;
                }
                return images9.getFixedHeight();
            default:
                return null;
        }
    }

    public final Intent b(Media media) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(media != null ? media.getUrl() : null));
        intent.setFlags(268435456);
        return intent;
    }
}
