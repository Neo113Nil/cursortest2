package ru.ozon.app.android.product.molecules.blur.presentation;

import Ds.C2880a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "blurPlaceholderImage", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "cornerRadius", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;ZLjava/lang/Float;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBlurPlaceholderImage", "Z", "()Z", "Ljava/lang/Float;", "getCornerRadius", "()Ljava/lang/Float;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BlurMoleculeVO {
    private final String blurPlaceholderImage;
    private final Float cornerRadius;
    private final CommonAtomIconDTO icon;
    private final boolean isAdult;
    private final TextDTO text;

    public BlurMoleculeVO(CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, String str, boolean z11, Float f7) {
        this.icon = commonAtomIconDTO;
        this.text = textDTO;
        this.blurPlaceholderImage = str;
        this.isAdult = z11;
        this.cornerRadius = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlurMoleculeVO)) {
            return false;
        }
        BlurMoleculeVO blurMoleculeVO = (BlurMoleculeVO) other;
        return Intrinsics.d(this.icon, blurMoleculeVO.icon) && Intrinsics.d(this.text, blurMoleculeVO.text) && Intrinsics.d(this.blurPlaceholderImage, blurMoleculeVO.blurPlaceholderImage) && this.isAdult == blurMoleculeVO.isAdult && Intrinsics.d(this.cornerRadius, blurMoleculeVO.cornerRadius);
    }

    public final String getBlurPlaceholderImage() {
        return this.blurPlaceholderImage;
    }

    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        int hashCode = (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode()) * 31;
        TextDTO textDTO = this.text;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.blurPlaceholderImage;
        int a11 = C3532b.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAdult);
        Float f7 = this.cornerRadius;
        return a11 + (f7 != null ? f7.hashCode() : 0);
    }

    /* renamed from: isAdult, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    @NotNull
    public String toString() {
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        TextDTO textDTO = this.text;
        String str = this.blurPlaceholderImage;
        boolean z11 = this.isAdult;
        Float f7 = this.cornerRadius;
        StringBuilder sb2 = new StringBuilder("BlurMoleculeVO(icon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", text=");
        sb2.append(textDTO);
        sb2.append(", blurPlaceholderImage=");
        C2880a.c(str, ", isAdult=", ", cornerRadius=", sb2, z11);
        sb2.append(f7);
        sb2.append(")");
        return sb2.toString();
    }
}
