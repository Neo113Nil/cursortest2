package ru.ozon.app.android.pdp.widgets.aspectsV4.size.core;

import java.util.ArrayList;
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
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4SizeSubWidgetObject;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeVO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/core/AspectsV4SizeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4SizeSubWidgetObject;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "", "isSelectApp", "<init>", "(Z)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4SizeSubWidgetObject;Ll20/d;)Ljava/util/List;", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4SizeMapper implements Function2<AspectsV4SizeSubWidgetObject, d, List<? extends AspectsV4SizeVO>> {
    private final boolean isSelectApp;

    public AspectsV4SizeMapper(boolean z11) {
        this.isSelectApp = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<AspectsV4SizeVO> invoke(@NotNull AspectsV4SizeSubWidgetObject state, @NotNull d widgetInfo) {
        AspectDTO.AspectState aspectState;
        AspectDTO.AspectState aspectState2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        int hashCode = widgetInfo.d().hashCode();
        List<AspectsV4SizeSubWidgetObject.Size> sizeVariants = state.getSizeVariants();
        ArrayList arrayList = new ArrayList(C7714v.z(sizeVariants, 10));
        int i11 = 0;
        int i12 = 0;
        for (Object obj : sizeVariants) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            AspectsV4SizeSubWidgetObject.Size size = (AspectsV4SizeSubWidgetObject.Size) obj;
            TextDTO copy$default = TextDTO.copy$default(size.getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 1, 262143, null);
            TextDTO subtext = size.getSubtext();
            CornerRadius cornerRadius = (size.getSubtext() == null || !this.isSelectApp) ? size.getSubtext() != null ? CornerRadius.RADIUS_400 : this.isSelectApp ? CornerRadius.RADIUS_500 : CornerRadius.RADIUS_300 : CornerRadius.RADIUS_550;
            if (size.getIsSelected() && !size.getIsOutOfStock()) {
                aspectState2 = AspectDTO.AspectState.SELECTED;
            } else if (size.getIsSelected() && size.getIsOutOfStock()) {
                aspectState2 = AspectDTO.AspectState.SELECTED_UNAVAILABLE;
            } else {
                aspectState = (size.getIsSelected() || !size.getIsOutOfStock()) ? AspectDTO.AspectState.ENABLED : AspectDTO.AspectState.UNAVAILABLE;
                AspectDTO aspectDTO = new AspectDTO(cornerRadius, aspectState, new AspectDTO.CustomStyle(!size.getIsSelected() ? state.getSelectedColor() : this.isSelectApp ? UniColors.LAYER_FLOOR_1.getToken() : !size.getIsOutOfStock() ? UniColors.GRAPHIC_NEUTRAL.getToken() : null, UniColors.LAYER_FLOOR_1.getToken()), null, null, 24, null);
                String refreshDeeplink = size.getRefreshDeeplink();
                Map<String, TokenizedTrackingInfo> trackingInfo = size.getTrackingInfo();
                arrayList.add(new AspectsV4SizeVO.Size(copy$default, subtext, aspectDTO, refreshDeeplink, trackingInfo == null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null));
                i12 = i13;
            }
            aspectState = aspectState2;
            i11 = i12;
            AspectDTO aspectDTO2 = new AspectDTO(cornerRadius, aspectState, new AspectDTO.CustomStyle(!size.getIsSelected() ? state.getSelectedColor() : this.isSelectApp ? UniColors.LAYER_FLOOR_1.getToken() : !size.getIsOutOfStock() ? UniColors.GRAPHIC_NEUTRAL.getToken() : null, UniColors.LAYER_FLOOR_1.getToken()), null, null, 24, null);
            String refreshDeeplink2 = size.getRefreshDeeplink();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = size.getTrackingInfo();
            arrayList.add(new AspectsV4SizeVO.Size(copy$default, subtext, aspectDTO2, refreshDeeplink2, trackingInfo2 == null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(widgetId), null, 2, null) : null));
            i12 = i13;
        }
        Integer valueOf = Integer.valueOf(hashCode);
        Map<String, TokenizedTrackingInfo> widgetTrackingInfo = state.getWidgetTrackingInfo();
        return C7714v.a0(new AspectsV4SizeVO(widgetId, arrayList, i11, valueOf, widgetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(widgetTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null));
    }
}
