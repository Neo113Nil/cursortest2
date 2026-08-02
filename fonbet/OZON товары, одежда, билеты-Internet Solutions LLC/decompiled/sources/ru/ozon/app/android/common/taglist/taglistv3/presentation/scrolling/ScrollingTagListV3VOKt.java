package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling;

import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.taglist.TagListViewType;
import ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3DTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"toScroll", "", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3VO;", "Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "id", "", "layoutManagerState", "Landroid/os/Parcelable;", "taglist_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScrollingTagListV3VOKt {
    @NotNull
    public static final List<ScrollingTagListV3VO> toScroll(@NotNull TagListV3DTO tagListV3DTO, long j11, Parcelable parcelable) {
        ScrollingTagListV3VO scrollingTagListV3VO;
        Intrinsics.checkNotNullParameter(tagListV3DTO, "<this>");
        if (tagListV3DTO.getView() == TagListViewType.VIEW_TYPE_SCROLL) {
            List<AtomDTO> tags = tagListV3DTO.getTags();
            OnBoardingDTO onboarding = tagListV3DTO.getOnboarding();
            Integer onboardingIndex = tagListV3DTO.getOnboardingIndex();
            CommonCellSettings.LayoutPadding bottomPadding = tagListV3DTO.getBottomPadding();
            if (bottomPadding == null) {
                bottomPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding = bottomPadding;
            CommonCellSettings.LayoutPadding topPadding = tagListV3DTO.getTopPadding();
            if (topPadding == null) {
                topPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding2 = topPadding;
            CommonCellSettings.LayoutPadding leftPadding = tagListV3DTO.getLeftPadding();
            if (leftPadding == null) {
                leftPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding3 = leftPadding;
            CommonCellSettings.LayoutPadding rightPadding = tagListV3DTO.getRightPadding();
            if (rightPadding == null) {
                rightPadding = CommonCellSettings.LayoutPadding.PADDING_500;
            }
            CommonCellSettings.LayoutPadding layoutPadding4 = rightPadding;
            Boolean isBottomRounded = tagListV3DTO.isBottomRounded();
            scrollingTagListV3VO = new ScrollingTagListV3VO(tags, onboarding, onboardingIndex, parcelable, j11, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, isBottomRounded != null ? isBottomRounded.booleanValue() : false, tagListV3DTO.getBackgroundColor());
        } else {
            scrollingTagListV3VO = null;
        }
        return C7714v.c0(scrollingTagListV3VO);
    }

    public static /* synthetic */ List toScroll$default(TagListV3DTO tagListV3DTO, long j11, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            parcelable = null;
        }
        return toScroll(tagListV3DTO, j11, parcelable);
    }
}
