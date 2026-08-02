package ru.ozon.app.android.pdp.widgets.aspectsV4.core;

import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.pdp.ui.configurators.pdp.aspectsV4.data.AspectsV4ImageSubWidgetObject;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.AspectsV4ImageVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/core/AspectV4ImageMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4ImageSubWidgetObject;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "", "isSelect", "<init>", "(Z)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/aspectsV4/data/AspectsV4ImageSubWidgetObject;Ll20/d;)Ljava/util/List;", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectV4ImageMapper implements Function2<AspectsV4ImageSubWidgetObject, d, List<? extends AspectsV4ImageVO>> {
    private final boolean isSelect;

    public AspectV4ImageMapper(boolean z11) {
        this.isSelect = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AspectsV4ImageVO> invoke(@NotNull AspectsV4ImageSubWidgetObject state, @NotNull d widgetInfo) {
        ImageDTO copy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        int hashCode = widgetInfo.d().hashCode();
        long j11 = hashCode;
        List<AspectsV4ImageSubWidgetObject.Image> images = state.getImages();
        ArrayList arrayList = new ArrayList(C7714v.z(images, 10));
        Iterator<T> it = images.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            AtomAction atomAction = null;
            if (!it.hasNext()) {
                String selectedColor = state.getSelectedColor();
                Map<String, TokenizedTrackingInfo> widgetTrackingInfo = state.getWidgetTrackingInfo();
                return C7714v.a0(new AspectsV4ImageVO(j11, Integer.valueOf(hashCode), selectedColor, i12, arrayList, widgetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(widgetTrackingInfo, Long.valueOf(j11), null, 2, null) : null));
            }
            Object next = it.next();
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AspectsV4ImageSubWidgetObject.Image image = (AspectsV4ImageSubWidgetObject.Image) next;
            if (image.getIsSelected()) {
                i12 = i11;
            }
            ImageDTO image2 = image.getImage().getImage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(image2);
            sb2.append(i11);
            long hashCode2 = sb2.toString().hashCode();
            copy = r15.copy((r34 & 1) != 0 ? r15.image : null, (r34 & 2) != 0 ? r15.backgroundColor : null, (r34 & 4) != 0 ? r15.aspectRatio : null, (r34 & 8) != 0 ? r15.hasParanja : false, (r34 & 16) != 0 ? r15.layoutPaddingLeft : null, (r34 & 32) != 0 ? r15.layoutPaddingRight : null, (r34 & 64) != 0 ? r15.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r15.layoutPaddingBottom : null, (r34 & 256) != 0 ? r15.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r15.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r15.testInfo : null, (r34 & 2048) != 0 ? r15.trackingInfo : null, (r34 & 4096) != 0 ? r15.imageWidth : Integer.valueOf(this.isSelect ? 64 : 56), (r34 & 8192) != 0 ? r15.imageType : null, (r34 & 16384) != 0 ? r15.fitType : null, (r34 & 32768) != 0 ? image.getImage().getImage().customRatio : null);
            BadgeDTO badge = image.getImage().getBadge();
            TextDTO label = image.getImage().getLabel();
            boolean isWave = image.getImage().isWave();
            boolean isSelected = image.getIsSelected();
            boolean isOutOfStock = image.getIsOutOfStock();
            String refreshDeeplink = image.getRefreshDeeplink();
            Map<String, TokenizedTrackingInfo> trackingInfo = image.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            AtomActionDTO action = image.getAction();
            if (action != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, image.getTrackingInfo());
            }
            arrayList.add(new AspectsV4ImageVO.Variant(hashCode2, Integer.valueOf(hashCode), copy, badge, label, isSelected, isOutOfStock, isWave, refreshDeeplink, tokenizedEvent$default, atomAction));
            i11 = i13;
        }
    }
}
