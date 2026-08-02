package ru.ozon.app.android.storefront.widgets.navigationSliderV2.core;

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
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.data.NavigationSliderV2DTO;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.html.OzonHtmlParser;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\r\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0014J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0003j\u0002`\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;", "resolver", "<init>", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;)V", "", "widgetId", "toVO", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO;J)Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO$NavigationItemV2DTO;", "", "maxLines", "itemWidth", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO$NavigationItemV2DTO;JII)Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/data/NavigationSliderV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollabilityResolver;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV2Mapper implements Function2<NavigationSliderV2DTO, d, List<? extends NavigationSliderV2VO>> {

    @NotNull
    private final NavigationSliderV2ScrollabilityResolver resolver;

    public NavigationSliderV2Mapper(@NotNull NavigationSliderV2ScrollabilityResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.resolver = resolver;
    }

    private final NavigationSliderV2VO toVO(NavigationSliderV2DTO navigationSliderV2DTO, long j11) {
        Object obj;
        int i11 = navigationSliderV2DTO.isTwoLinesTitle() ? 2 : 1;
        int itemWidth = this.resolver.getItemWidth(navigationSliderV2DTO.getItems().size());
        String title = navigationSliderV2DTO.getTitle();
        List<NavigationSliderV2DTO.NavigationItemV2DTO> items = navigationSliderV2DTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((NavigationSliderV2DTO.NavigationItemV2DTO) it.next(), j11, i11, itemWidth));
        }
        Iterator<T> it2 = navigationSliderV2DTO.getItems().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((NavigationSliderV2DTO.NavigationItemV2DTO) obj).getOnboardingCommon() != null) {
                break;
            }
        }
        NavigationSliderV2DTO.NavigationItemV2DTO navigationItemV2DTO = (NavigationSliderV2DTO.NavigationItemV2DTO) obj;
        OnBoardingDTO onboardingCommon = navigationItemV2DTO != null ? navigationItemV2DTO.getOnboardingCommon() : null;
        Iterator<NavigationSliderV2DTO.NavigationItemV2DTO> it3 = navigationSliderV2DTO.getItems().iterator();
        int i12 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i12 = -1;
                break;
            }
            if (it3.next().getOnboardingCommon() != null) {
                break;
            }
            i12++;
        }
        return new NavigationSliderV2VO(j11, title, arrayList, null, onboardingCommon, i12, this.resolver.isScrollable(navigationSliderV2DTO.getItems().size()), itemWidth, null, 264, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavigationSliderV2VO> invoke(@NotNull NavigationSliderV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final NavigationSliderV2VO.NavigationItemV2 toVO(NavigationSliderV2DTO.NavigationItemV2DTO navigationItemV2DTO, long j11, int i11, int i12) {
        String image = navigationItemV2DTO.getImage();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(navigationItemV2DTO.getAction(), navigationItemV2DTO.getTrackingInfo());
        String obj = OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, navigationItemV2DTO.getTitle(), 0, 2, null).toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        boolean isAdult = navigationItemV2DTO.isAdult();
        Map<String, TokenizedTrackingInfo> trackingInfo = navigationItemV2DTO.getTrackingInfo();
        return new NavigationSliderV2VO.NavigationItemV2(image, atomAction, obj, isAdult, false, i11, i12, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, navigationItemV2DTO.getOnboardingCommon() != null, 16, null);
    }
}
