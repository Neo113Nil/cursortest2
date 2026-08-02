package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import android.content.Context;
import androidx.core.content.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4DTO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4MapperKt;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4VO;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0014B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "determineRotationPeriod", "(Ljava/lang/Long;)J", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4PlainMapper implements Function2<AdvBannerV4DTO, d, List<? extends AdvBannerV4VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainMapper$Companion;", "", "<init>", "()V", "DEFAULT_ASPECT_RATIO", "", "DEFAULT_ROTATION_PERIOD", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdvBannerV4PlainMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final long determineRotationPeriod(Long l11) {
        if (l11 == null) {
            return 4L;
        }
        long longValue = l11.longValue();
        if (longValue <= 0) {
            return 4L;
        }
        return longValue;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdvBannerV4VO> invoke(@NotNull AdvBannerV4DTO state, @NotNull d widgetInfo) {
        Boolean isAutoRotateOn;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.getItems().hashCode();
        List<AdvBannerV4DTO.ItemDTO> items = state.getItems();
        List<AdvBannerV4ItemVO> designTypeVo = AdvBannerV4MapperKt.toDesignTypeVo(state, Long.valueOf(hashCode));
        int color = a.getColor(this.context, R$color.text_primary_on_light);
        boolean z11 = true;
        boolean z12 = !items.isEmpty();
        Double aspectRation = state.getAspectRation();
        double doubleValue = aspectRation != null ? aspectRation.doubleValue() : 1.0d;
        AdvBannerV4DTO.RotationOptions rotationOptions = state.getRotationOptions();
        if (rotationOptions != null && (isAutoRotateOn = rotationOptions.isAutoRotateOn()) != null) {
            z11 = isAutoRotateOn.booleanValue();
        }
        AdvBannerV4DTO.RotationOptions rotationOptions2 = state.getRotationOptions();
        return C7714v.a0(new AdvBannerV4VO(hashCode, designTypeVo, z12, doubleValue, color, null, new AdvBannerV4VO.RotationOptions(z11, determineRotationPeriod(rotationOptions2 != null ? rotationOptions2.getRotationPeriod() : null)), state.getBackgroundColor(), 32, null));
    }
}
