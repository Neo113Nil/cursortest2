package ru.ozon.app.android.returns.cancels.modalConstructor.presentation.models;

import De.C2859b;
import F3.G;
import G.g;
import Lh.b;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO;", "Ll20/c;", "DisclaimerWrapperVO", "TextWrapperVO", "ImageWrapperVO", "ButtonWrapperVO", "HorizontalScrollImagesVO", "PaddingVO", "SeparatorVO", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ModalConstructorVO extends c {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$ButtonWrapperVO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "padding", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "getPadding", "()Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonWrapperVO implements ModalConstructorVO {

        @NotNull
        private final ButtonV3DTO button;
        private final long id;

        @NotNull
        private final PaddingVO padding;

        public ButtonWrapperVO(long j11, @NotNull ButtonV3DTO button, @NotNull PaddingVO padding) {
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(padding, "padding");
            this.id = j11;
            this.button = button;
            this.padding = padding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonWrapperVO)) {
                return false;
            }
            ButtonWrapperVO buttonWrapperVO = (ButtonWrapperVO) other;
            return this.id == buttonWrapperVO.id && Intrinsics.d(this.button, buttonWrapperVO.button) && Intrinsics.d(this.padding, buttonWrapperVO.padding);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final PaddingVO getPadding() {
            return this.padding;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.padding.hashCode() + C2859b.c(this.button, Long.hashCode(this.id) * 31, 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            ButtonV3DTO buttonV3DTO = this.button;
            PaddingVO paddingVO = this.padding;
            StringBuilder c11 = G.c("ButtonWrapperVO(id=", j11, ", button=", buttonV3DTO);
            c11.append(", padding=");
            c11.append(paddingVO);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull ModalConstructorVO modalConstructorVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull ModalConstructorVO modalConstructorVO) {
            return modalConstructorVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$DisclaimerWrapperVO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO;", "", "id", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "padding", "<init>", "(JLru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "getPadding", "()Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisclaimerWrapperVO implements ModalConstructorVO {

        @NotNull
        private final DisclaimerDTO disclaimer;
        private final long id;

        @NotNull
        private final PaddingVO padding;

        public DisclaimerWrapperVO(long j11, @NotNull DisclaimerDTO disclaimer, @NotNull PaddingVO padding) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(padding, "padding");
            this.id = j11;
            this.disclaimer = disclaimer;
            this.padding = padding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerWrapperVO)) {
                return false;
            }
            DisclaimerWrapperVO disclaimerWrapperVO = (DisclaimerWrapperVO) other;
            return this.id == disclaimerWrapperVO.id && Intrinsics.d(this.disclaimer, disclaimerWrapperVO.disclaimer) && Intrinsics.d(this.padding, disclaimerWrapperVO.padding);
        }

        @NotNull
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final PaddingVO getPadding() {
            return this.padding;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.padding.hashCode() + ((this.disclaimer.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "DisclaimerWrapperVO(id=" + this.id + ", disclaimer=" + this.disclaimer + ", padding=" + this.padding + ")";
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$HorizontalScrollImagesVO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO;", "", "id", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "scrollImages", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "paddingBetweenImages", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "padding", "", "showBackground", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getScrollImages", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getPaddingBetweenImages", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "getPadding", "()Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "Z", "getShowBackground", "()Z", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HorizontalScrollImagesVO implements ModalConstructorVO {
        private final long id;

        @NotNull
        private final PaddingVO padding;

        @NotNull
        private final CommonCellSettings.LayoutPadding paddingBetweenImages;

        @NotNull
        private final List<ImageVO> scrollImages;
        private final boolean showBackground;

        public HorizontalScrollImagesVO(long j11, @NotNull List<ImageVO> scrollImages, @NotNull CommonCellSettings.LayoutPadding paddingBetweenImages, @NotNull PaddingVO padding, boolean z11) {
            Intrinsics.checkNotNullParameter(scrollImages, "scrollImages");
            Intrinsics.checkNotNullParameter(paddingBetweenImages, "paddingBetweenImages");
            Intrinsics.checkNotNullParameter(padding, "padding");
            this.id = j11;
            this.scrollImages = scrollImages;
            this.paddingBetweenImages = paddingBetweenImages;
            this.padding = padding;
            this.showBackground = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalScrollImagesVO)) {
                return false;
            }
            HorizontalScrollImagesVO horizontalScrollImagesVO = (HorizontalScrollImagesVO) other;
            return this.id == horizontalScrollImagesVO.id && Intrinsics.d(this.scrollImages, horizontalScrollImagesVO.scrollImages) && this.paddingBetweenImages == horizontalScrollImagesVO.paddingBetweenImages && Intrinsics.d(this.padding, horizontalScrollImagesVO.padding) && this.showBackground == horizontalScrollImagesVO.showBackground;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final PaddingVO getPadding() {
            return this.padding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getPaddingBetweenImages() {
            return this.paddingBetweenImages;
        }

        @NotNull
        public final List<ImageVO> getScrollImages() {
            return this.scrollImages;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final boolean getShowBackground() {
            return this.showBackground;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return Boolean.hashCode(this.showBackground) + ((this.padding.hashCode() + Ef0.c.a(this.paddingBetweenImages, g.b(Long.hashCode(this.id) * 31, 31, this.scrollImages), 31)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            List<ImageVO> list = this.scrollImages;
            CommonCellSettings.LayoutPadding layoutPadding = this.paddingBetweenImages;
            PaddingVO paddingVO = this.padding;
            boolean z11 = this.showBackground;
            StringBuilder b11 = b.b(j11, "HorizontalScrollImagesVO(id=", ", scrollImages=", list);
            b11.append(", paddingBetweenImages=");
            b11.append(layoutPadding);
            b11.append(", padding=");
            b11.append(paddingVO);
            return Bi.b.f(b11, ", showBackground=", z11, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$ImageWrapperVO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageWrapperVO implements ModalConstructorVO {
        private final long id;

        @NotNull
        private final ImageDTO image;

        public ImageWrapperVO(long j11, @NotNull ImageDTO image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.id = j11;
            this.image = image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageWrapperVO)) {
                return false;
            }
            ImageWrapperVO imageWrapperVO = (ImageWrapperVO) other;
            return this.id == imageWrapperVO.id && Intrinsics.d(this.image, imageWrapperVO.image);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.image.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = Nh.b.c("ImageWrapperVO(id=", this.id, ", image=", this.image);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$PaddingVO;", "", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "top", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottom", "getLeft", "getRight", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingVO {

        @NotNull
        private final CommonCellSettings.LayoutPadding bottom;

        @NotNull
        private final CommonCellSettings.LayoutPadding left;

        @NotNull
        private final CommonCellSettings.LayoutPadding right;

        @NotNull
        private final CommonCellSettings.LayoutPadding top;

        public PaddingVO() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingVO)) {
                return false;
            }
            PaddingVO paddingVO = (PaddingVO) other;
            return this.top == paddingVO.top && this.bottom == paddingVO.bottom && this.left == paddingVO.left && this.right == paddingVO.right;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getBottom() {
            return this.bottom;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getLeft() {
            return this.left;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getRight() {
            return this.right;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + Ef0.c.a(this.left, Ef0.c.a(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "PaddingVO(top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ")";
        }

        public PaddingVO(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom, @NotNull CommonCellSettings.LayoutPadding left, @NotNull CommonCellSettings.LayoutPadding right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }

        public /* synthetic */ PaddingVO(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 2) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$SeparatorVO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO;", "", "id", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "height", "<init>", "(JLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getHeight", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorVO implements ModalConstructorVO {

        @NotNull
        private final CommonCellSettings.LayoutPadding height;
        private final long id;

        public SeparatorVO(long j11, @NotNull CommonCellSettings.LayoutPadding height) {
            Intrinsics.checkNotNullParameter(height, "height");
            this.id = j11;
            this.height = height;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorVO)) {
                return false;
            }
            SeparatorVO separatorVO = (SeparatorVO) other;
            return this.id == separatorVO.id && this.height == separatorVO.height;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getHeight() {
            return this.height;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.height.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "SeparatorVO(id=" + this.id + ", height=" + this.height + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO$TextWrapperVO;", "Lru/ozon/app/android/returns/cancels/modalConstructor/presentation/models/ModalConstructorVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextWrapperVO implements ModalConstructorVO {
        private final long id;

        @NotNull
        private final TextDTO text;

        public TextWrapperVO(long j11, @NotNull TextDTO text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = j11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWrapperVO)) {
                return false;
            }
            TextWrapperVO textWrapperVO = (TextWrapperVO) other;
            return this.id == textWrapperVO.id && Intrinsics.d(this.text, textWrapperVO.text);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.text.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = a.b("TextWrapperVO(id=", this.id, ", text=", this.text);
            b11.append(")");
            return b11.toString();
        }
    }
}
