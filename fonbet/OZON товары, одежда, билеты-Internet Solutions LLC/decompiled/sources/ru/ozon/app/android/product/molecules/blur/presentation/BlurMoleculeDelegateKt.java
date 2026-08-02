package ru.ozon.app.android.product.molecules.blur.presentation;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"needShowBlur", "", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "adultConfirmed", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlurMoleculeDelegateKt {
    public static final boolean needShowBlur(BlurMoleculeVO blurMoleculeVO, boolean z11) {
        if (blurMoleculeVO != null) {
            return (z11 && blurMoleculeVO.getIsAdult()) ? false : true;
        }
        return false;
    }
}
