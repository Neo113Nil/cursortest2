package ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.data;

import Sc.o;
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
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.data.StickyPromoRedirectV2DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation.StickyPromoRedirectV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO;Ll20/d;)Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StickyPromoRedirectV2Mapper implements Function2<StickyPromoRedirectV2DTO, d, List<? extends StickyPromoRedirectV2VO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickyPromoRedirectV2DTO.Position.values().length];
            try {
                iArr[StickyPromoRedirectV2DTO.Position.POSITION_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickyPromoRedirectV2DTO.Position.POSITION_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickyPromoRedirectV2DTO.Position.POSITION_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StickyPromoRedirectV2VO> invoke(@NotNull StickyPromoRedirectV2DTO state, @NotNull d widgetInfo) {
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String valueOf = String.valueOf((hashCode + state.getAnimationURL()).hashCode());
        String animationURL = state.getAnimationURL();
        int i12 = WhenMappings.$EnumSwitchMapping$0[state.getPosition().ordinal()];
        if (i12 == 1) {
            i11 = 8388611;
        } else if (i12 == 2) {
            i11 = 17;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = 8388613;
        }
        int i13 = i11;
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new StickyPromoRedirectV2VO(hashCode, valueOf, animationURL, i13, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
