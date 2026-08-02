package ru.ozon.app.android.fresh.main.widgets.bannerList.presentation;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.bannerList.data.BannerListDTO;
import ru.ozon.app.android.fresh.main.widgets.bannerList.data.BannerRow;
import ru.ozon.app.android.fresh.main.widgets.bannerList.presentation.BannerRowVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerRow;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO$RoundedCorners;", "toRoundedCorners", "(Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;)Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO$RoundedCorners;", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerRow;J)Lru/ozon/app/android/fresh/main/widgets/bannerList/presentation/BannerRowVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerRow;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerRowMapper implements Function2<BannerRow, d, List<? extends BannerRowVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerListDTO.RoundedCorners.values().length];
            try {
                iArr[BannerListDTO.RoundedCorners.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerListDTO.RoundedCorners.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerListDTO.RoundedCorners.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final BannerRowVO.RoundedCorners toRoundedCorners(BannerListDTO.RoundedCorners roundedCorners) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[roundedCorners.ordinal()];
        if (i11 == 1) {
            return BannerRowVO.RoundedCorners.TOP;
        }
        if (i11 == 2) {
            return BannerRowVO.RoundedCorners.BOTTOM;
        }
        if (i11 == 3) {
            return BannerRowVO.RoundedCorners.FULL;
        }
        throw new o();
    }

    private final BannerRowVO toVO(BannerRow bannerRow, long j11) {
        TextAtom title = bannerRow.getBanner().getTitle();
        String image = bannerRow.getBanner().getImage();
        AtomActionDTO action = bannerRow.getBanner().getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, bannerRow.getBanner().getTrackingInfo()) : null;
        String backgroundColor = bannerRow.getBanner().getBackgroundColor();
        int indexOfList = bannerRow.getIndexOfList();
        int lastIndex = bannerRow.getLastIndex();
        BannerListDTO.RoundedCorners roundedCorners = bannerRow.getRoundedCorners();
        BannerRowVO.RoundedCorners roundedCorners2 = roundedCorners != null ? toRoundedCorners(roundedCorners) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = bannerRow.getBanner().getTrackingInfo();
        return new BannerRowVO(j11, title, image, atomAction, backgroundColor, indexOfList, lastIndex, roundedCorners2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BannerRowVO> invoke(@NotNull BannerRow state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }
}
