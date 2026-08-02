package ru.ozon.app.android.commonwidgets.widgets.resultheader.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.model.ResultsHeaderDTO;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ResultsHeaderVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/resultheader/core/ResultsHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/model/ResultsHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/resultheader/model/ResultsHeaderDTO;Ll20/d;)Ljava/util/List;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultsHeaderMapper implements Function2<ResultsHeaderDTO, d, List<? extends ResultsHeaderVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ResultsHeaderVO> invoke(@NotNull ResultsHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        String title = state.getTitle();
        String subtitle = state.getSubtitle();
        ButtonV3Atom.SmallIconButton actionButton = state.getActionButton();
        List<Badge> badge = state.getBadge();
        if (badge == null) {
            badge = K.f71697a;
        }
        List<Badge> list = badge;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ResultsHeaderVO(hashCode, title, subtitle, actionButton, list, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
