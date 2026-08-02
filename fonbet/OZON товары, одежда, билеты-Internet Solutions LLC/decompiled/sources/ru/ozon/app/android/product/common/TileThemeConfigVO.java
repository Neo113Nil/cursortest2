package ru.ozon.app.android.product.common;

import B0.C2454a;
import Ek.a;
import Kk.C3532b;
import Ql.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/product/common/TileThemeConfigVO;", "", "", "containerCornerRadius", "", "topOffset", "", "isCompactFavIcon", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "addToCartButtonConfig", "<init>", "(FIZLru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getContainerCornerRadius", "()F", "I", "getTopOffset", "Z", "()Z", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "getAddToCartButtonConfig", "()Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "AddToCartButtonConfigVO", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileThemeConfigVO {

    @NotNull
    private final AddToCartButtonConfigVO addToCartButtonConfig;
    private final float containerCornerRadius;
    private final boolean isCompactFavIcon;
    private final int topOffset;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J~\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b$\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b&\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "", "", "containerCornerRadius", "", "containerHeight", "plusDrawableRes", "minusDrawableRes", "plusMinusSize", "plusMinusHorizontalMargin", "actionButtonTextStyleRes", "actionButtonIconSize", "quantityTextStyleRes", "", "alwaysMeasureWithSellerIcon", "alwaysMeasureMatchParent", "<init>", "(FIIIIIIIIZZ)V", "copy", "(FIIIIIIIIZZ)Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getContainerCornerRadius", "()F", "I", "getContainerHeight", "getPlusDrawableRes", "getMinusDrawableRes", "getPlusMinusSize", "getPlusMinusHorizontalMargin", "getActionButtonTextStyleRes", "getActionButtonIconSize", "getQuantityTextStyleRes", "Z", "getAlwaysMeasureWithSellerIcon", "()Z", "getAlwaysMeasureMatchParent", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class AddToCartButtonConfigVO {
        private final int actionButtonIconSize;
        private final int actionButtonTextStyleRes;
        private final boolean alwaysMeasureMatchParent;
        private final boolean alwaysMeasureWithSellerIcon;
        private final float containerCornerRadius;
        private final int containerHeight;
        private final int minusDrawableRes;
        private final int plusDrawableRes;
        private final int plusMinusHorizontalMargin;
        private final int plusMinusSize;
        private final int quantityTextStyleRes;

        public AddToCartButtonConfigVO(float f7, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, boolean z12) {
            this.containerCornerRadius = f7;
            this.containerHeight = i11;
            this.plusDrawableRes = i12;
            this.minusDrawableRes = i13;
            this.plusMinusSize = i14;
            this.plusMinusHorizontalMargin = i15;
            this.actionButtonTextStyleRes = i16;
            this.actionButtonIconSize = i17;
            this.quantityTextStyleRes = i18;
            this.alwaysMeasureWithSellerIcon = z11;
            this.alwaysMeasureMatchParent = z12;
        }

        public static /* synthetic */ AddToCartButtonConfigVO copy$default(AddToCartButtonConfigVO addToCartButtonConfigVO, float f7, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, boolean z12, int i19, Object obj) {
            if ((i19 & 1) != 0) {
                f7 = addToCartButtonConfigVO.containerCornerRadius;
            }
            if ((i19 & 2) != 0) {
                i11 = addToCartButtonConfigVO.containerHeight;
            }
            if ((i19 & 4) != 0) {
                i12 = addToCartButtonConfigVO.plusDrawableRes;
            }
            if ((i19 & 8) != 0) {
                i13 = addToCartButtonConfigVO.minusDrawableRes;
            }
            if ((i19 & 16) != 0) {
                i14 = addToCartButtonConfigVO.plusMinusSize;
            }
            if ((i19 & 32) != 0) {
                i15 = addToCartButtonConfigVO.plusMinusHorizontalMargin;
            }
            if ((i19 & 64) != 0) {
                i16 = addToCartButtonConfigVO.actionButtonTextStyleRes;
            }
            if ((i19 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i17 = addToCartButtonConfigVO.actionButtonIconSize;
            }
            if ((i19 & 256) != 0) {
                i18 = addToCartButtonConfigVO.quantityTextStyleRes;
            }
            if ((i19 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                z11 = addToCartButtonConfigVO.alwaysMeasureWithSellerIcon;
            }
            if ((i19 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                z12 = addToCartButtonConfigVO.alwaysMeasureMatchParent;
            }
            boolean z13 = z11;
            boolean z14 = z12;
            int i21 = i17;
            int i22 = i18;
            int i23 = i15;
            int i24 = i16;
            int i25 = i14;
            int i26 = i12;
            return addToCartButtonConfigVO.copy(f7, i11, i26, i13, i25, i23, i24, i21, i22, z13, z14);
        }

        @NotNull
        public final AddToCartButtonConfigVO copy(float containerCornerRadius, int containerHeight, int plusDrawableRes, int minusDrawableRes, int plusMinusSize, int plusMinusHorizontalMargin, int actionButtonTextStyleRes, int actionButtonIconSize, int quantityTextStyleRes, boolean alwaysMeasureWithSellerIcon, boolean alwaysMeasureMatchParent) {
            return new AddToCartButtonConfigVO(containerCornerRadius, containerHeight, plusDrawableRes, minusDrawableRes, plusMinusSize, plusMinusHorizontalMargin, actionButtonTextStyleRes, actionButtonIconSize, quantityTextStyleRes, alwaysMeasureWithSellerIcon, alwaysMeasureMatchParent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddToCartButtonConfigVO)) {
                return false;
            }
            AddToCartButtonConfigVO addToCartButtonConfigVO = (AddToCartButtonConfigVO) other;
            return Float.compare(this.containerCornerRadius, addToCartButtonConfigVO.containerCornerRadius) == 0 && this.containerHeight == addToCartButtonConfigVO.containerHeight && this.plusDrawableRes == addToCartButtonConfigVO.plusDrawableRes && this.minusDrawableRes == addToCartButtonConfigVO.minusDrawableRes && this.plusMinusSize == addToCartButtonConfigVO.plusMinusSize && this.plusMinusHorizontalMargin == addToCartButtonConfigVO.plusMinusHorizontalMargin && this.actionButtonTextStyleRes == addToCartButtonConfigVO.actionButtonTextStyleRes && this.actionButtonIconSize == addToCartButtonConfigVO.actionButtonIconSize && this.quantityTextStyleRes == addToCartButtonConfigVO.quantityTextStyleRes && this.alwaysMeasureWithSellerIcon == addToCartButtonConfigVO.alwaysMeasureWithSellerIcon && this.alwaysMeasureMatchParent == addToCartButtonConfigVO.alwaysMeasureMatchParent;
        }

        public final int getActionButtonIconSize() {
            return this.actionButtonIconSize;
        }

        public final int getActionButtonTextStyleRes() {
            return this.actionButtonTextStyleRes;
        }

        public final boolean getAlwaysMeasureMatchParent() {
            return this.alwaysMeasureMatchParent;
        }

        public final boolean getAlwaysMeasureWithSellerIcon() {
            return this.alwaysMeasureWithSellerIcon;
        }

        public final float getContainerCornerRadius() {
            return this.containerCornerRadius;
        }

        public final int getContainerHeight() {
            return this.containerHeight;
        }

        public final int getMinusDrawableRes() {
            return this.minusDrawableRes;
        }

        public final int getPlusDrawableRes() {
            return this.plusDrawableRes;
        }

        public final int getPlusMinusHorizontalMargin() {
            return this.plusMinusHorizontalMargin;
        }

        public final int getPlusMinusSize() {
            return this.plusMinusSize;
        }

        public final int getQuantityTextStyleRes() {
            return this.quantityTextStyleRes;
        }

        public int hashCode() {
            return Boolean.hashCode(this.alwaysMeasureMatchParent) + C3532b.a(C2454a.a(this.quantityTextStyleRes, C2454a.a(this.actionButtonIconSize, C2454a.a(this.actionButtonTextStyleRes, C2454a.a(this.plusMinusHorizontalMargin, C2454a.a(this.plusMinusSize, C2454a.a(this.minusDrawableRes, C2454a.a(this.plusDrawableRes, C2454a.a(this.containerHeight, Float.hashCode(this.containerCornerRadius) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31, this.alwaysMeasureWithSellerIcon);
        }

        @NotNull
        public String toString() {
            float f7 = this.containerCornerRadius;
            int i11 = this.containerHeight;
            int i12 = this.plusDrawableRes;
            int i13 = this.minusDrawableRes;
            int i14 = this.plusMinusSize;
            int i15 = this.plusMinusHorizontalMargin;
            int i16 = this.actionButtonTextStyleRes;
            int i17 = this.actionButtonIconSize;
            int i18 = this.quantityTextStyleRes;
            boolean z11 = this.alwaysMeasureWithSellerIcon;
            boolean z12 = this.alwaysMeasureMatchParent;
            StringBuilder sb2 = new StringBuilder("AddToCartButtonConfigVO(containerCornerRadius=");
            sb2.append(f7);
            sb2.append(", containerHeight=");
            sb2.append(i11);
            sb2.append(", plusDrawableRes=");
            a.f(i12, i13, ", minusDrawableRes=", ", plusMinusSize=", sb2);
            a.f(i14, i15, ", plusMinusHorizontalMargin=", ", actionButtonTextStyleRes=", sb2);
            a.f(i16, i17, ", actionButtonIconSize=", ", quantityTextStyleRes=", sb2);
            c.d(sb2, i18, ", alwaysMeasureWithSellerIcon=", z11, ", alwaysMeasureMatchParent=");
            return Pk0.a.a(")", sb2, z12);
        }
    }

    public TileThemeConfigVO(float f7, int i11, boolean z11, @NotNull AddToCartButtonConfigVO addToCartButtonConfig) {
        Intrinsics.checkNotNullParameter(addToCartButtonConfig, "addToCartButtonConfig");
        this.containerCornerRadius = f7;
        this.topOffset = i11;
        this.isCompactFavIcon = z11;
        this.addToCartButtonConfig = addToCartButtonConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileThemeConfigVO)) {
            return false;
        }
        TileThemeConfigVO tileThemeConfigVO = (TileThemeConfigVO) other;
        return Float.compare(this.containerCornerRadius, tileThemeConfigVO.containerCornerRadius) == 0 && this.topOffset == tileThemeConfigVO.topOffset && this.isCompactFavIcon == tileThemeConfigVO.isCompactFavIcon && Intrinsics.d(this.addToCartButtonConfig, tileThemeConfigVO.addToCartButtonConfig);
    }

    @NotNull
    public final AddToCartButtonConfigVO getAddToCartButtonConfig() {
        return this.addToCartButtonConfig;
    }

    public final float getContainerCornerRadius() {
        return this.containerCornerRadius;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }

    public int hashCode() {
        return this.addToCartButtonConfig.hashCode() + C3532b.a(C2454a.a(this.topOffset, Float.hashCode(this.containerCornerRadius) * 31, 31), 31, this.isCompactFavIcon);
    }

    /* renamed from: isCompactFavIcon, reason: from getter */
    public final boolean getIsCompactFavIcon() {
        return this.isCompactFavIcon;
    }

    @NotNull
    public String toString() {
        return "TileThemeConfigVO(containerCornerRadius=" + this.containerCornerRadius + ", topOffset=" + this.topOffset + ", isCompactFavIcon=" + this.isCompactFavIcon + ", addToCartButtonConfig=" + this.addToCartButtonConfig + ")";
    }
}
