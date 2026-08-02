package ru.ozon.app.android.pdp.widgets.badgeListV2.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BadgeListV2DTO;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2ItemDecorator;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2VO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/core/BadgeListV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;Ll20/d;)Ljava/util/List;", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "", "decorator", "Lkotlin/jvm/functions/Function1;", "getDecorator", "()Lkotlin/jvm/functions/Function1;", "setDecorator", "(Lkotlin/jvm/functions/Function1;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV2Mapper implements Function2<BadgeListV2DTO, d, List<? extends BadgeListV2VO>> {
    private Function1<? super BadgeListV2ItemDecorator.PaddingConfig, Unit> decorator;

    public final void setDecorator(Function1<? super BadgeListV2ItemDecorator.PaddingConfig, Unit> function1) {
        this.decorator = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BadgeListV2VO> invoke(@NotNull BadgeListV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        Function1<? super BadgeListV2ItemDecorator.PaddingConfig, Unit> function1 = this.decorator;
        if (function1 != null) {
            function1.invoke(new BadgeListV2ItemDecorator.PaddingConfig(state.getInset(), state.getSpacedBy()));
        }
        List<BadgeDTO> badges = state.getBadges();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        String json = state.getJson();
        if (json == null) {
            json = "";
        }
        return C7714v.a0(new BadgeListV2VO(widgetId, badges, tokenizedEvent$default, json, state.getInset(), state.getSpacedBy(), null, 64, null));
    }
}
