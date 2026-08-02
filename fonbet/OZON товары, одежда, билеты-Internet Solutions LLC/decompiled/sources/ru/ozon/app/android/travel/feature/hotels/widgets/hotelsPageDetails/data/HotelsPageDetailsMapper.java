package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.data;

import G.g;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.data.HotelsPageDetailsDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.presentation.HotelsPageDetailsVO;
import ru.ozon.app.android.travel.molecules.dto.iconWithText.v2.IconWithTextV2DTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\r\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0003j\u0002`\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO$TabInfo;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$TabInfoVO;", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO$TabInfo;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$TabInfoVO;", "fullDescription", "buttonTitle", "buttonColor", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$ShortDescription;", "prepareShortDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/presentation/HotelsPageDetailsVO$ShortDescription;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetails/data/HotelsPageDetailsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageDetailsMapper implements Function2<HotelsPageDetailsDTO, d, List<? extends HotelsPageDetailsVO>> {

    @NotNull
    private final Context context;

    public HotelsPageDetailsMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final HotelsPageDetailsVO.ShortDescription prepareShortDescription(String fullDescription, String buttonTitle, String buttonColor) {
        if (fullDescription == null || buttonTitle == null || fullDescription.length() <= 150) {
            return null;
        }
        String c11 = g.c(h.q0(148 - buttonTitle.length(), fullDescription), "… ", buttonTitle);
        return new HotelsPageDetailsVO.ShortDescription(c11, c11.length() - buttonTitle.length(), c11.length(), StyleParser.INSTANCE.parseColor(this.context, buttonColor, R$color.text_primary));
    }

    private final HotelsPageDetailsVO toVO(HotelsPageDetailsDTO hotelsPageDetailsDTO, String str) {
        long hashCode = str.hashCode();
        List<HotelsPageDetailsDTO.TabInfo> tabs = hotelsPageDetailsDTO.getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((HotelsPageDetailsDTO.TabInfo) it.next()));
        }
        boolean z11 = hotelsPageDetailsDTO.getTabs().size() >= 2;
        Map<String, TokenizedTrackingInfo> trackingInfo = hotelsPageDetailsDTO.getTrackingInfo();
        return new HotelsPageDetailsVO(hashCode, arrayList, z11, 0, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsPageDetailsVO> invoke(@NotNull HotelsPageDetailsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return state.getTabs().isEmpty() ? K.f71697a : C7714v.a0(toVO(state, widgetInfo.d()));
    }

    private final HotelsPageDetailsVO.TabInfoVO toVO(HotelsPageDetailsDTO.TabInfo tabInfo) {
        ArrayList arrayList;
        TextAtom title;
        String title2 = tabInfo.getTitle();
        String description = tabInfo.getDescription();
        String fullDescriptionButtonTitle = tabInfo.getFullDescriptionButtonTitle();
        LinkButtonDTO extendButton = tabInfo.getExtendButton();
        ArrayList arrayList2 = null;
        HotelsPageDetailsVO.ShortDescription prepareShortDescription = prepareShortDescription(description, fullDescriptionButtonTitle, (extendButton == null || (title = extendButton.getTitle()) == null) ? null : title.getTextColor());
        String description2 = tabInfo.getDescription();
        String description3 = tabInfo.getDescription();
        boolean z11 = !(description3 == null || description3.length() == 0);
        List<HotelsPageDetailsDTO.Facilities> facilities = tabInfo.getFacilities();
        if (facilities != null) {
            List<HotelsPageDetailsDTO.Facilities> list = facilities;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (HotelsPageDetailsDTO.Facilities facilities2 : list) {
                arrayList.add(new HotelsPageDetailsVO.FacilitiesVO(U7.d.e(facilities2.getKey(), facilities2.getValue()).hashCode(), facilities2.getKey(), facilities2.getValue()));
            }
        } else {
            arrayList = null;
        }
        List<HotelsPageDetailsDTO.Facilities> facilities3 = tabInfo.getFacilities();
        boolean z12 = !(facilities3 == null || facilities3.isEmpty());
        LinkButtonDTO extendButton2 = tabInfo.getExtendButton();
        LinkButtonVO vo = extendButton2 != null ? MapperExtKt.toVO(extendButton2) : null;
        List<IconWithTextV2DTO> additionalInfo = tabInfo.getAdditionalInfo();
        if (additionalInfo != null) {
            List<IconWithTextV2DTO> list2 = additionalInfo;
            arrayList2 = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(MapperExtKt.toVO((IconWithTextV2DTO) it.next(), Integer.valueOf(tabInfo.getAdditionalInfo().size())));
            }
        }
        ArrayList arrayList3 = arrayList2;
        List<IconWithTextV2DTO> additionalInfo2 = tabInfo.getAdditionalInfo();
        return new HotelsPageDetailsVO.TabInfoVO(title2, prepareShortDescription, description2, z11, arrayList, z12, vo, arrayList3, !(additionalInfo2 == null || additionalInfo2.isEmpty()));
    }
}
