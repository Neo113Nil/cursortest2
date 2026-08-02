package ru.ozon.app.android.account.orders.commonBarcode.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.CommonBarcodeVO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/commonBarcode/data/CommonBarcodeDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeMapper implements Function2<CommonBarcodeDTO, d, List<? extends CommonBarcodeVO>> {
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CommonBarcodeVO> invoke(@NotNull CommonBarcodeDTO state, @NotNull d widgetInfo) {
        TextAtom description;
        TextAtom textAtom;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (Intrinsics.d(state.isFullWidth(), Boolean.TRUE)) {
            description = state.getDescription();
        } else {
            TextAtom description2 = state.getDescription();
            if (description2 == null) {
                textAtom = null;
                long hashCode = widgetInfo.d().hashCode();
                String title = state.getTitle();
                String code = state.getCode();
                String subtitle = state.getSubtitle();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                AtomActionDTO action = state.getAction();
                AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
                Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(state.getSubtitleTextStyle());
                return C7714v.a0(new CommonBarcodeVO(hashCode, title, subtitle, code, trackingInfo, atomAction, textAtom, parseTextStyle == null ? parseTextStyle.intValue() : R$style.OzonTextAppearance_Body_500medium));
            }
            description = TextAtom.copy$default(description2, null, null, UniColors.TEXT_SECONDARY_ON_LIGHT.getToken(), null, null, null, null, 123, null);
        }
        textAtom = description;
        long hashCode2 = widgetInfo.d().hashCode();
        String title2 = state.getTitle();
        String code2 = state.getCode();
        String subtitle2 = state.getSubtitle();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        AtomActionDTO action2 = state.getAction();
        AtomAction atomAction2 = action2 != null ? AtomActionMapperKt.toAtomAction(action2, state.getTrackingInfo()) : null;
        Integer parseTextStyle2 = StyleParser.INSTANCE.parseTextStyle(state.getSubtitleTextStyle());
        return C7714v.a0(new CommonBarcodeVO(hashCode2, title2, subtitle2, code2, trackingInfo2, atomAction2, textAtom, parseTextStyle2 == null ? parseTextStyle2.intValue() : R$style.OzonTextAppearance_Body_500medium));
    }
}
