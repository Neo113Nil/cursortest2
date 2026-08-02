package ru.ozon.app.android.storefront.widgets.navigationSliderV3.core;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.data.NavigationSliderV3DTO;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.vo.NavigationSliderV3VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001a2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001aB\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0015J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "imageWidth", "", "isCompactStyle", "itemWidth", "(Ljava/lang/Integer;Z)I", "", "widgetId", "toVO", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO;J)Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO$NavigationItemV3DTO;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO$NavigationItemV3;", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO$NavigationItemV3DTO;JZ)Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO$NavigationItemV3;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV3/data/NavigationSliderV3DTO;Ll20/d;)Ljava/util/List;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderV3Mapper implements Function2<NavigationSliderV3DTO, d, List<? extends NavigationSliderV3VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3Mapper$Companion;", "", "<init>", "()V", "ITEM_WIDTH_COMPACT", "", "ITEM_WIDTH_WIDE", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final int itemWidth(Integer imageWidth, boolean isCompactStyle) {
        return imageWidth != null ? imageWidth.intValue() : isCompactStyle ? 56 : 72;
    }

    private final NavigationSliderV3VO toVO(NavigationSliderV3DTO navigationSliderV3DTO, long j11) {
        List<NavigationSliderV3DTO.NavigationItemV3DTO> items = navigationSliderV3DTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((NavigationSliderV3DTO.NavigationItemV3DTO) it.next(), j11, navigationSliderV3DTO.isCompactStyle()));
        }
        return new NavigationSliderV3VO(j11, arrayList, navigationSliderV3DTO.getBackgroundColor(), navigationSliderV3DTO.isCompactStyle(), null, 16, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavigationSliderV3VO> invoke(@NotNull NavigationSliderV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final NavigationSliderV3VO.NavigationItemV3 toVO(NavigationSliderV3DTO.NavigationItemV3DTO navigationItemV3DTO, long j11, boolean z11) {
        TextDTO title = navigationItemV3DTO.getTitle();
        ImageDTO image = navigationItemV3DTO.getImage();
        int px = ResourceExtKt.toPx(itemWidth(navigationItemV3DTO.getImage().getImageWidth(), z11));
        AtomActionDTO action = navigationItemV3DTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, navigationItemV3DTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = navigationItemV3DTO.getTrackingInfo();
        return new NavigationSliderV3VO.NavigationItemV3(title, image, px, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }
}
