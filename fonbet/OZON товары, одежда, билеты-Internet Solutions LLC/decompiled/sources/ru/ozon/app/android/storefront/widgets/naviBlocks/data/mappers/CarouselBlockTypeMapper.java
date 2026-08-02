package ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers;

import WZ.t;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel.CarouselNaviBlockVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0014B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004*\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/CarouselBlockTypeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CarouselNaviBlockModel;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;", "", "id", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "mapToVo", "(Ljava/util/List;J)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CarouselNaviBlockModel;Ll20/d;)Ljava/util/List;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselBlockTypeMapper implements Function2<NaviBlockModel.CarouselNaviBlockModel, d, List<? extends CarouselNaviBlockVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/CarouselBlockTypeMapper$Companion;", "", "<init>", "()V", "DEFAULT_FRAME_DURATION", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [WZ.t] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private final List<FrameVO> mapToVo(List<NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO> list, long j11) {
        Iterator it;
        t tVar;
        TextDTO textDTO;
        List<NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO frameDTO = (NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO) it2.next();
            String backgroundColor = frameDTO.getBackgroundColor();
            String image = frameDTO.getImage();
            TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(frameDTO.getTitle(), null, null, null, null, null, null, null, null, null, null, null, false, 4095, null);
            TextAtom subtitle = frameDTO.getSubtitle();
            if (subtitle != null) {
                it = it2;
                tVar = 0;
                textDTO = TextMapperKt.dsTextAtom$default(subtitle, null, null, null, null, null, null, null, null, null, null, null, false, 4095, null);
            } else {
                it = it2;
                tVar = 0;
                textDTO = null;
            }
            Badge badge = frameDTO.getBadge();
            AtomActionDTO action = frameDTO.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, frameDTO.getTrackingInfo()) : tVar;
            Map<String, TokenizedTrackingInfo> trackingInfo = frameDTO.getTrackingInfo();
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), tVar, 2, tVar);
            }
            arrayList.add(new FrameVO(backgroundColor, image, dsTextAtom$default, textDTO, badge, atomAction, tVar));
            it2 = it;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CarouselNaviBlockVO> invoke(@NotNull NaviBlockModel.CarouselNaviBlockModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d().hashCode() + "_singleBlock_" + state.getPosition()).hashCode();
        return C7714v.a0(new CarouselNaviBlockVO(hashCode, NaviBlocksCornerMapperKt.getRoundedCorners(state), state.getPosition(), state.getCarouselBlock().getFrameDuration() != null ? r11.intValue() * 1000 : 5000L, mapToVo(state.getCarouselBlock().getFrames(), hashCode)));
    }
}
