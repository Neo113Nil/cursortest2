package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SuggestDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestDTO$Suggest;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ModelsKt {
    @NotNull
    public static final SuggestVO toVO(@NotNull SuggestDTO.Suggest suggest) {
        Intrinsics.checkNotNullParameter(suggest, "<this>");
        return new SuggestVO(suggest.getTitle(), suggest.getSubtitle(), suggest.getLink(), suggest.getNotExact());
    }
}
