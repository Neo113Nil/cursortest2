package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormData;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.ReviewFormRepository;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "reviewFormRepository", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "updateByCachedValueIfNeeded", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/ReviewFormRepository;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormAnonymousMapper implements Function2<ReviewFormAnonymousDTO, d, List<? extends ReviewFormAnonymousVO>> {

    @NotNull
    private final ReviewFormRepository reviewFormRepository;

    public ReviewFormAnonymousMapper(@NotNull ReviewFormRepository reviewFormRepository) {
        Intrinsics.checkNotNullParameter(reviewFormRepository, "reviewFormRepository");
        this.reviewFormRepository = reviewFormRepository;
    }

    private final CellDTO updateByCachedValueIfNeeded(CellDTO cellDTO) {
        Boolean isSelected;
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        CellDTO.RightBlock rightBlock2 = null;
        ToggleDTO toggleDTO = null;
        if (rightBlock != null) {
            CellDTO.RightBlock rightBlock3 = cellDTO.getRightBlock();
            AtomDTO control = rightBlock3 != null ? rightBlock3.getControl() : null;
            ToggleDTO toggleDTO2 = control instanceof ToggleDTO ? (ToggleDTO) control : null;
            if (toggleDTO2 != null) {
                ReviewFormData formData = this.reviewFormRepository.getFormData();
                if (formData == null || (isSelected = formData.getAnonymous()) == null) {
                    isSelected = toggleDTO2.isSelected();
                }
                toggleDTO = ToggleDTO.copy$default(toggleDTO2, isSelected, null, null, null, null, null, 62, null);
            }
            rightBlock2 = CellDTO.RightBlock.copy$default(rightBlock, null, null, null, null, null, null, null, null, null, null, toggleDTO, null, 3071, null);
        }
        return CellDTO.copy$default(cellDTO, null, null, null, rightBlock2, null, 23, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewFormAnonymousVO> invoke(@NotNull ReviewFormAnonymousDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new ReviewFormAnonymousVO(c.a(widgetInfo.d(), "anonymous"), state.getUploadKey(), state.isEditReview() ? state.getAnonymousCell() : updateByCachedValueIfNeeded(state.getAnonymousCell())));
    }
}
