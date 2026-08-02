package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data;

import WZ.t;
import android.content.Context;
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
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data.SearchFormBarDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation.SearchFormBarVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO$Bar;", "bar", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO$Bar;", "mapBar", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO$Bar;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO$Bar;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormBarMapper implements Function2<SearchFormBarDTO, d, List<? extends SearchFormBarVO>> {

    @NotNull
    private final Context context;

    public SearchFormBarMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final SearchFormBarVO.Bar mapBar(SearchFormBarDTO.Bar bar) {
        return new SearchFormBarVO.Bar(bar.getBackgroundColor(), ResourceExtKt.toPxF(bar.getCornerRadius().getPx(), this.context), bar.getIcon(), bar.getPlaceholder());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchFormBarVO> invoke(@NotNull SearchFormBarDTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CommonControlSettings commonSettings = state.getCommonSettings();
        long hashCode2 = widgetInfo.d().hashCode();
        SearchFormBarVO.Bar mapBar = mapBar(state.getBar());
        float pxF = ResourceExtKt.toPxF(state.getCornerRadius().getPx(), this.context);
        String backgroundColor = state.getBackgroundColor();
        String leftPatchColor = state.getLeftPatchColor();
        String rightPatchColor = state.getRightPatchColor();
        t tVar = null;
        AtomAction atomAction = (commonSettings == null || (action = commonSettings.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, commonSettings.getTrackingInfo());
        if (commonSettings != null && (trackingInfo = commonSettings.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        }
        return C7714v.a0(new SearchFormBarVO(hashCode2, mapBar, pxF, backgroundColor, leftPatchColor, rightPatchColor, atomAction, tVar));
    }
}
