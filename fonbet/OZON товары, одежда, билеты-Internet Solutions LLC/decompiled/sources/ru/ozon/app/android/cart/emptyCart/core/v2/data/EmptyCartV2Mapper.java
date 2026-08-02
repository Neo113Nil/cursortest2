package ru.ozon.app.android.cart.emptyCart.core.v2.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.emptyCart.core.v2.presentation.EmptyCartV2VO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/emptyCart/core/v2/data/EmptyCartV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/emptyCart/core/v2/data/EmptyCartV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/cart/emptyCart/core/v2/presentation/EmptyCartV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/cart/emptyCart/core/v2/data/EmptyCartV2DTO;J)Lru/ozon/app/android/cart/emptyCart/core/v2/presentation/EmptyCartV2VO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cart/emptyCart/core/v2/data/EmptyCartV2DTO;Ll20/d;)Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmptyCartV2Mapper implements Function2<EmptyCartV2DTO, d, List<? extends EmptyCartV2VO>> {
    private final EmptyCartV2VO toVO(EmptyCartV2DTO emptyCartV2DTO, long j11) {
        TextDTO title = emptyCartV2DTO.getTitle();
        TextDTO subtitle = emptyCartV2DTO.getSubtitle();
        ButtonV3DTO button = emptyCartV2DTO.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = emptyCartV2DTO.getTrackingInfo();
        return new EmptyCartV2VO(j11, title, subtitle, button, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EmptyCartV2VO> invoke(@NotNull EmptyCartV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.c0(toVO(state, widgetInfo.d().hashCode()));
    }
}
