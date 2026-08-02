package ru.ozon.app.android.pdp.widgets.sellerV4.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4SimpleStateViewHolder;", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4BaseViewHolder;", "sellerDisclosureView", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "inhibitor", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "<init>", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV4SimpleStateViewHolder extends SellerV4BaseViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV4SimpleStateViewHolder(@NotNull DisclosureIconTitleSubtitleCellView sellerDisclosureView, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor) {
        super(sellerDisclosureView, null, refs, inhibitor, 2, null);
        Intrinsics.checkNotNullParameter(sellerDisclosureView, "sellerDisclosureView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
    }
}
