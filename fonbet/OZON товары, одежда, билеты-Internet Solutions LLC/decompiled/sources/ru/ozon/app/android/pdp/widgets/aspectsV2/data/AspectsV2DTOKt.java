package ru.ozon.app.android.pdp.widgets.aspectsV2.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "", "isEnabled", "(Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;)Z", "isAvailable", "isSelected", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV2DTOKt {
    public static final boolean isAvailable(@NotNull AspectsV2DTO.VariantV2 variantV2) {
        Intrinsics.checkNotNullParameter(variantV2, "<this>");
        return variantV2.getState() == AspectsV2DTO.State.SELECT || variantV2.getState() == AspectsV2DTO.State.DEFAULT || variantV2.getState() == AspectsV2DTO.State.PARTIALLY_DISABLED;
    }

    public static final boolean isEnabled(@NotNull AspectsV2DTO.VariantV2 variantV2) {
        Intrinsics.checkNotNullParameter(variantV2, "<this>");
        return variantV2.getState() != AspectsV2DTO.State.PARTIALLY_DISABLED;
    }

    public static final boolean isSelected(@NotNull AspectsV2DTO.VariantV2 variantV2) {
        Intrinsics.checkNotNullParameter(variantV2, "<this>");
        return variantV2.getState() == AspectsV2DTO.State.SELECT || variantV2.getState() == AspectsV2DTO.State.SELECT_OOS;
    }
}
