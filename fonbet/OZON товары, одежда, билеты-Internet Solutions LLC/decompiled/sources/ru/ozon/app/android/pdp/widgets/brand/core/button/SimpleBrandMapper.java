package ru.ozon.app.android.pdp.widgets.brand.core.button;

import WZ.t;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BrandDTO;
import ru.ozon.app.android.pdp.widgets.brand.presentation.SimpleBrandVO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/core/button/SimpleBrandMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "uncontainedButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SimpleBrandMapper implements Function2<BrandDTO, d, List<? extends SimpleBrandVO>> {
    public static final int $stable = UncontainedIconLabelButtonDTO.$stable;
    private final UncontainedIconLabelButtonDTO uncontainedButton;

    public SimpleBrandMapper(UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO) {
        this.uncontainedButton = uncontainedIconLabelButtonDTO;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SimpleBrandVO> invoke(@NotNull BrandDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO = this.uncontainedButton;
        List<SimpleBrandVO> list = null;
        if (uncontainedIconLabelButtonDTO != null) {
            String backgroundColor = state.getBackgroundColor();
            if (backgroundColor == null) {
                backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
            }
            String str = backgroundColor;
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
            String json = state.getJson();
            if (json == null) {
                json = "";
            }
            list = C7714v.a0(new SimpleBrandVO(hashCode, str, tokenizedEvent$default, uncontainedIconLabelButtonDTO, json));
        }
        return list == null ? K.f71697a : list;
    }
}
