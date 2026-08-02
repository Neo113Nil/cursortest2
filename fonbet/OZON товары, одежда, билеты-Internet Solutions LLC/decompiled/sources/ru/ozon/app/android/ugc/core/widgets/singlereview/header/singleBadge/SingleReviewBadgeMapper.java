package ru.ozon.app.android.ugc.core.widgets.singlereview.header.singleBadge;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeDO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "getReviewHeaderVO", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeDO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/singleBadge/SingleReviewBadgeDO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewBadgeMapper implements Function2<SingleReviewBadgeDO, d, List<? extends SingleReviewBadgeVO>> {
    private final SingleReviewBadgeVO getReviewHeaderVO(SingleReviewBadgeDO singleReviewBadgeDO) {
        return new SingleReviewBadgeVO(c.a(singleReviewBadgeDO.getUuid(), "_singleBadge"), singleReviewBadgeDO.getBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleReviewBadgeVO> invoke(@NotNull SingleReviewBadgeDO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(getReviewHeaderVO(state));
    }
}
