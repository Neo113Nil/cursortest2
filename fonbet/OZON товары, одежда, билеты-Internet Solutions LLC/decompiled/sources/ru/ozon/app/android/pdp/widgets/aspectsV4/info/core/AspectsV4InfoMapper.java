package ru.ozon.app.android.pdp.widgets.aspectsV4.info.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4DTO;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation.AspectsV4InfoVO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B'\u0012\u001e\b\u0002\u0010\u000b\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u000b\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/core/AspectsV4InfoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lkotlin/Function0;", "", "", "", "expandedState", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4DTO$AspectInfo;Ll20/d;)Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4InfoMapper implements Function2<AspectsV4DTO.AspectInfo, d, List<? extends AspectsV4InfoVO>> {
    private final Function0<Map<String, Boolean>> expandedState;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectsV4InfoMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AspectsV4InfoMapper(Function0<? extends Map<String, Boolean>> function0) {
        this.expandedState = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AspectsV4InfoVO> invoke(@NotNull AspectsV4DTO.AspectInfo state, @NotNull d widgetInfo) {
        boolean isExpanded;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Map<String, Boolean> invoke;
        Boolean bool;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        Function0<Map<String, Boolean>> function0 = this.expandedState;
        if (function0 == null || (invoke = function0.invoke()) == null || (bool = invoke.get(widgetInfo.d())) == null) {
            ExpandableTextDTO expandableText = state.getExpandableText();
            isExpanded = expandableText != null ? expandableText.isExpanded() : false;
        } else {
            isExpanded = bool.booleanValue();
        }
        boolean z11 = isExpanded;
        ExpandableTextDTO expandableText2 = state.getExpandableText();
        t tVar = null;
        ExpandableTextDTO copy$default = expandableText2 != null ? ExpandableTextDTO.copy$default(expandableText2, null, null, null, null, null, z11, null, null, null, null, null, null, null, true, null, null, null, null, 253919, null) : null;
        BadgeDTO badge = state.getBadge();
        ExpandableTextDTO expandableText3 = state.getExpandableText();
        if (expandableText3 != null && (trackingInfo = expandableText3.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null);
        }
        return C7714v.a0(new AspectsV4InfoVO(widgetId, badge, copy$default, tVar));
    }

    public /* synthetic */ AspectsV4InfoMapper(Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : function0);
    }
}
