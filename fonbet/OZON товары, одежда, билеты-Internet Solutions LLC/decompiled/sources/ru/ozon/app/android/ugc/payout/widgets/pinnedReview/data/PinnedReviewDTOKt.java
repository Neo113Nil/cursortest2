package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"disableIfHasNotAction", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "payout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewDTOKt {
    @NotNull
    public static final FooterControlDTO disableIfHasNotAction(@NotNull FooterControlDTO footerControlDTO) {
        Intrinsics.checkNotNullParameter(footerControlDTO, "<this>");
        CommonControlSettings common = footerControlDTO.getSelected().getCommon();
        if ((common != null ? common.getAction() : null) != null) {
            CommonControlSettings common2 = footerControlDTO.getNormal().getCommon();
            if ((common2 != null ? common2.getAction() : null) != null) {
                return footerControlDTO;
            }
        }
        UncontainedIconLabelButtonDTO normal = footerControlDTO.getNormal();
        Boolean bool = Boolean.FALSE;
        return FooterControlDTO.copy$default(footerControlDTO, false, UncontainedIconLabelButtonDTO.copy$default(normal, null, null, bool, null, null, null, null, null, 251, null), UncontainedIconLabelButtonDTO.copy$default(footerControlDTO.getSelected(), null, null, bool, null, null, null, null, null, 251, null), 1, null);
    }
}
