package ru.ozon.app.android.orderdetails.modalConstructor.mappers;

import Lh.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.orderdetails.modalConstructor.data.ModalConstructorDTO;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.models.ModalConstructorVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomType;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0002\u001a\u00020\b*\u00020\u00042\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u001f\u0010\u0002\u001a\u00020\u000b*\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u000e*\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0002\u001a\u00020\u0018*\u00020\u00152\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0002\u0010\u0019\u001a\u001f\u0010\u0002\u001a\u00020\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "toVO", "(Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$PaddingDTO;)Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$DisclaimerWrapperDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$DisclaimerWrapperVO;", "(Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$DisclaimerWrapperDTO;Ll20/d;)Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$DisclaimerWrapperVO;", "Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$ButtonWrapperDTO;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$ButtonWrapperVO;", "(Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$ButtonWrapperDTO;Ll20/d;)Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$ButtonWrapperVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$TextWrapperVO;", "toModalConstructorTextWrapperVO", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ll20/d;)Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$TextWrapperVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$ImageWrapperVO;", "toModalConstructorImageWrapperVO", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ll20/d;)Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$ImageWrapperVO;", "Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;", "", "inOpenGallery", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$HorizontalScrollImagesVO;", "(Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;Ll20/d;Z)Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$HorizontalScrollImagesVO;", "Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$Separator;", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$SeparatorVO;", "(Lru/ozon/app/android/orderdetails/modalConstructor/data/ModalConstructorDTO$Separator;Ll20/d;)Lru/ozon/app/android/orderdetails/modalConstructor/presentation/models/ModalConstructorVO$SeparatorVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ModalConstructorMapperKt {
    @NotNull
    public static final ModalConstructorVO.ImageWrapperVO toModalConstructorImageWrapperVO(@NotNull ImageDTO imageDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(imageDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        AtomType type = imageDTO.getType();
        return new ModalConstructorVO.ImageWrapperVO((d11 + "_" + type).hashCode(), imageDTO);
    }

    @NotNull
    public static final ModalConstructorVO.TextWrapperVO toModalConstructorTextWrapperVO(@NotNull TextDTO textDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(textDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        AtomType type = textDTO.getType();
        return new ModalConstructorVO.TextWrapperVO((d11 + "_" + type).hashCode(), TextDTO.copy$default(textDTO, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null));
    }

    @NotNull
    public static final ModalConstructorVO.PaddingVO toVO(ModalConstructorDTO.PaddingDTO paddingDTO) {
        if (paddingDTO == null) {
            return new ModalConstructorVO.PaddingVO(null, null, null, null, 15, null);
        }
        CommonCellSettings.LayoutPadding top = paddingDTO.getTop();
        if (top == null) {
            top = CommonCellSettings.LayoutPadding.NONE;
        }
        CommonCellSettings.LayoutPadding bottom = paddingDTO.getBottom();
        if (bottom == null) {
            bottom = CommonCellSettings.LayoutPadding.NONE;
        }
        CommonCellSettings.LayoutPadding left = paddingDTO.getLeft();
        if (left == null) {
            left = CommonCellSettings.LayoutPadding.NONE;
        }
        CommonCellSettings.LayoutPadding right = paddingDTO.getRight();
        if (right == null) {
            right = CommonCellSettings.LayoutPadding.NONE;
        }
        return new ModalConstructorVO.PaddingVO(top, bottom, left, right);
    }

    public static /* synthetic */ ModalConstructorVO.HorizontalScrollImagesVO toVO$default(ModalConstructorDTO.HorizontalScrollImagesDTO horizontalScrollImagesDTO, d dVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return toVO(horizontalScrollImagesDTO, dVar, z11);
    }

    @NotNull
    public static final ModalConstructorVO.DisclaimerWrapperVO toVO(@NotNull ModalConstructorDTO.DisclaimerWrapperDTO disclaimerWrapperDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(disclaimerWrapperDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        AtomType type = disclaimerWrapperDTO.getDisclaimer().getType();
        return new ModalConstructorVO.DisclaimerWrapperVO((d11 + "_" + type).hashCode(), disclaimerWrapperDTO.getDisclaimer(), toVO(disclaimerWrapperDTO.getPadding()));
    }

    @NotNull
    public static final ModalConstructorVO.ButtonWrapperVO toVO(@NotNull ModalConstructorDTO.ButtonWrapperDTO buttonWrapperDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(buttonWrapperDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        AtomType type = buttonWrapperDTO.getButton().getType();
        return new ModalConstructorVO.ButtonWrapperVO((d11 + "_" + type).hashCode(), buttonWrapperDTO.getButton(), toVO(buttonWrapperDTO.getPadding()));
    }

    @NotNull
    public static final ModalConstructorVO.HorizontalScrollImagesVO toVO(@NotNull ModalConstructorDTO.HorizontalScrollImagesDTO horizontalScrollImagesDTO, @NotNull d widgetInfo, boolean z11) {
        List list;
        CommonControlSettings common;
        CommonControlSettings common2;
        Intrinsics.checkNotNullParameter(horizontalScrollImagesDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (z11) {
            list = ImagesVOKt.toGalleryItems(horizontalScrollImagesDTO.getScrollImages());
        } else {
            list = K.f71697a;
        }
        long a11 = b.a(horizontalScrollImagesDTO.getScrollImages().size(), widgetInfo.d(), "_");
        List<ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO> scrollImages = horizontalScrollImagesDTO.getScrollImages();
        ArrayList arrayList = new ArrayList(C7714v.z(scrollImages, 10));
        for (ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO imageDTO : scrollImages) {
            ProductMediaDTO productMedia = imageDTO.getProductMedia();
            Map<String, TokenizedTrackingInfo> map = null;
            AtomActionDTO action = (productMedia == null || (common2 = productMedia.getCommon()) == null) ? null : common2.getAction();
            ProductMediaDTO productMedia2 = imageDTO.getProductMedia();
            if (productMedia2 != null && (common = productMedia2.getCommon()) != null) {
                map = common.getTrackingInfo();
            }
            arrayList.add(ImageVOKt.toVo(imageDTO, action, map, list));
        }
        CommonCellSettings.LayoutPadding paddingBetweenImages = horizontalScrollImagesDTO.getPaddingBetweenImages();
        if (paddingBetweenImages == null) {
            paddingBetweenImages = CommonCellSettings.LayoutPadding.PADDING_300;
        }
        return new ModalConstructorVO.HorizontalScrollImagesVO(a11, arrayList, paddingBetweenImages, toVO(horizontalScrollImagesDTO.getPadding()), horizontalScrollImagesDTO.getShowBackground());
    }

    @NotNull
    public static final ModalConstructorVO.SeparatorVO toVO(@NotNull ModalConstructorDTO.Separator separator, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(separator, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return new ModalConstructorVO.SeparatorVO(b.a(separator.getHeight().ordinal(), widgetInfo.d(), "_"), separator.getHeight());
    }
}
