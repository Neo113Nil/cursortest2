package ru.ozon.uni.android.ds.compose.component.image;

import B1.InterfaceC2547p;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/android/ds/compose/component/image/ImageVO;", "toVO", "(Lru/ozon/uni/atoms/data/image/ImageDTO;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/image/ImageVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;", "LB1/p;", "toContentScale", "(Lru/ozon/uni/atoms/data/image/ImageDTO$FitType;)LB1/p;", "LZ1/h;", "DEFAULT_IMAGE_WIDTH", "F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageVoKt {
    private static final float DEFAULT_IMAGE_WIDTH = 160;

    private static final InterfaceC2547p toContentScale(ImageDTO.FitType fitType) {
        return fitType == ImageDTO.FitType.FIT_CENTER ? InterfaceC2547p.a.d() : InterfaceC2547p.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ImageVO toVO(@NotNull ImageDTO imageDTO, InterfaceC3967k interfaceC3967k, int i11) {
        float f7;
        float widthRatio;
        int heightRatio;
        float dp;
        float dp2;
        float dp3;
        float dp4;
        float dp5;
        Intrinsics.checkNotNullParameter(imageDTO, "<this>");
        interfaceC3967k.o(347465911);
        String image = imageDTO.getImage();
        if (image == null) {
            image = "";
        }
        String str = image;
        C7807Z c7807z = TokenParserKt.tokenToColor(imageDTO.getBackgroundColor(), interfaceC3967k, 0);
        long w11 = c7807z != null ? c7807z.w() : C7807Z.f72258l;
        boolean hasParanja = imageDTO.getHasParanja();
        ImageDTO.CustomRatio customRatio = imageDTO.getCustomRatio();
        if (customRatio != null) {
            widthRatio = customRatio.getWidth();
            heightRatio = customRatio.getHeight();
        } else {
            ImageAspectRatio aspectRatio = imageDTO.getAspectRatio();
            if (aspectRatio == null) {
                f7 = 1.0f;
                float f11 = f7;
                dp = FoundationMapperKt.getDp(imageDTO.getCornerRadius());
                if (Float.isNaN(dp)) {
                    dp = UniTheme.INSTANCE.getRadii().getNone();
                }
                InterfaceC2547p contentScale = toContentScale(imageDTO.getFitType());
                dp2 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingLeft());
                if (Float.isNaN(dp2)) {
                    dp2 = UniTheme.INSTANCE.getPaddings().getNone();
                }
                dp3 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingTop());
                if (Float.isNaN(dp3)) {
                    dp3 = UniTheme.INSTANCE.getPaddings().getNone();
                }
                dp4 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingRight());
                if (Float.isNaN(dp4)) {
                    dp4 = UniTheme.INSTANCE.getPaddings().getNone();
                }
                dp5 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingBottom());
                if (Float.isNaN(dp5)) {
                    dp5 = UniTheme.INSTANCE.getPaddings().getNone();
                }
                float intValue = imageDTO.getImageWidth() == null ? r14.intValue() : DEFAULT_IMAGE_WIDTH;
                ImageDTO.ImageType imageType = imageDTO.getImageType();
                ImageVO imageVO = new ImageVO(str, w11, hasParanja, f11, dp, contentScale, dp2, dp3, dp4, dp5, intValue, (imageType == null && imageType.getIsFixed()) || (imageDTO.getImageType() == null && imageDTO.getImageWidth() != null), null);
                interfaceC3967k.k();
                return imageVO;
            }
            widthRatio = aspectRatio.getWidthRatio();
            heightRatio = aspectRatio.getHeightRatio();
        }
        f7 = widthRatio / heightRatio;
        float f112 = f7;
        dp = FoundationMapperKt.getDp(imageDTO.getCornerRadius());
        if (Float.isNaN(dp)) {
        }
        InterfaceC2547p contentScale2 = toContentScale(imageDTO.getFitType());
        dp2 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingLeft());
        if (Float.isNaN(dp2)) {
        }
        dp3 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingTop());
        if (Float.isNaN(dp3)) {
        }
        dp4 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingRight());
        if (Float.isNaN(dp4)) {
        }
        dp5 = FoundationMapperKt.getDp(imageDTO.getLayoutPaddingBottom());
        if (Float.isNaN(dp5)) {
        }
        if (imageDTO.getImageWidth() == null) {
        }
        ImageDTO.ImageType imageType2 = imageDTO.getImageType();
        ImageVO imageVO2 = new ImageVO(str, w11, hasParanja, f112, dp, contentScale2, dp2, dp3, dp4, dp5, intValue, (imageType2 == null && imageType2.getIsFixed()) || (imageDTO.getImageType() == null && imageDTO.getImageWidth() != null), null);
        interfaceC3967k.k();
        return imageVO2;
    }
}
