package ru.ozon.app.android.ugc.widgets.reviewSort.core;

import WZ.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.reviewSort.data.ReviewSortDTO;
import ru.ozon.app.android.ugc.widgets.reviewSort.presentation.ReviewSortVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewSort/core/ReviewSortMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/reviewSort/presentation/ReviewSortVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/reviewSort/data/ReviewSortDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewSortMapper implements Function2<ReviewSortDTO, d, List<? extends ReviewSortVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReviewSortVO> invoke(@NotNull ReviewSortDTO state, @NotNull d widgetInfo) {
        String str;
        AtomActionDTO action;
        AtomActionDTO action2;
        AtomActionDTO action3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        List<CellDTO> cells = state.getCells();
        String backgroundColor = state.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_SECONDARY.getToken();
        }
        String str2 = backgroundColor;
        CornerRadius cornerRadius = state.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_500;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        ButtonV3DTO applyButton = state.getApplyButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Iterator<CellDTO> it = state.getCells().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            CellDTO next = it.next();
            CommonControlSettings common = state.getApplyButton().getCommon();
            String id2 = (common == null || (action3 = common.getAction()) == null) ? null : action3.getId();
            CommonControlSettings common2 = next.getCommon();
            if (Intrinsics.d(id2, (common2 == null || (action2 = common2.getAction()) == null) ? null : action2.getId())) {
                break;
            }
            i11++;
        }
        CommonControlSettings common3 = state.getApplyButton().getCommon();
        if (common3 == null || (action = common3.getAction()) == null || (str = action.getId()) == null) {
            str = "";
        }
        return C7714v.a0(new ReviewSortVO(hashCode, title, cells, str2, cornerRadius2, applyButton, tokenizedEvent$default, i11, str));
    }
}
