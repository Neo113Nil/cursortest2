package ru.ozon.app.android.ugc.widgets.rateItemsV2.core;

import Sc.InterfaceC4008j;
import WZ.t;
import android.content.Context;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.common.ugc.timer.TimerDTO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVO;
import ru.ozon.app.android.timerMolecule.presentation.TimerVOKt;
import ru.ozon.app.android.ugc.utils.TextUtilsKt;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2DTO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2Wrapper;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WrapperVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0013J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010$\u001a\u00020#*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b$\u0010%J*\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010'\u001a\u00060\u0003j\u0002`&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010\u000f\u001a\u00020\u0019*\u00020*¢\u0006\u0004\b\u000f\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/core/RateItemsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2Wrapper;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2WrapperVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RateItem;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "scrollType", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "toVo", "(Ljava/util/List;Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$HideButtonDTO;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$HideButtonDTO;)Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$HideButtonVO;", "state", "", "asyncData", "map", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2Wrapper;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "vo", "data", "rateItemsWrapperList", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RatingActionDTO;", "", "id", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RatingActionVO;", "toVO", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$RatingActionDTO;JLru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RatingActionVO;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2Wrapper;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO;", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO;)Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "Landroid/content/Context;", "J", "", "hideTitleWidth", "Ljava/lang/Integer;", "Landroid/text/TextPaint;", "textPaint$delegate", "LSc/j;", "getTextPaint", "()Landroid/text/TextPaint;", "textPaint", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateItemsV2Mapper implements Function2<RateItemsV2Wrapper, d, List<? extends RateItemsV2WrapperVO>> {

    @NotNull
    private final Context context;
    private Integer hideTitleWidth;
    private long id;

    /* renamed from: textPaint$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j textPaint;

    public RateItemsV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.textPaint = LazyUtilsKt.unsafeLazy(RateItemsV2Mapper$textPaint$2.INSTANCE);
    }

    private final TextPaint getTextPaint() {
        return (TextPaint) this.textPaint.getValue();
    }

    private final List<RateItemsV2WrapperVO> map(RateItemsV2Wrapper state, String asyncData) {
        List<RateItemsV2WrapperVO> rateItemsWrapperList;
        return state.getRateItemsV2Dto() == null ? (asyncData == null || (rateItemsWrapperList = rateItemsWrapperList(null, asyncData)) == null) ? K.f71697a : rateItemsWrapperList : rateItemsWrapperList(toVo(state.getRateItemsV2Dto()), null);
    }

    private final List<RateItemsV2WrapperVO> rateItemsWrapperList(RateItemsV2VO vo, String data) {
        return C7714v.a0(new RateItemsV2WrapperVO(this.id, data, vo));
    }

    private final RateItemsV2VO.RatingActionVO toVO(RateItemsV2DTO.RatingActionDTO ratingActionDTO, long j11, CommonControlSettings commonControlSettings) {
        AtomActionDTO action = ratingActionDTO.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = (action != null ? action.getBehavior() : null) == AtomActionDTO.Behavior.COMPOSER_ACTION ? commonControlSettings != null ? commonControlSettings.getTrackingInfo() : null : ratingActionDTO.getTracking();
        AtomActionDTO action2 = ratingActionDTO.getAction();
        return new RateItemsV2VO.RatingActionVO(action2 != null ? AtomActionMapperKt.toAtomAction(action2, ratingActionDTO.getTracking()) : null, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @NotNull
    public final RateItemsV2VO toVo(@NotNull RateItemsV2DTO rateItemsV2DTO) {
        Intrinsics.checkNotNullParameter(rateItemsV2DTO, "<this>");
        RateItemsV2DTO.ScrollType scrollType = rateItemsV2DTO.getScrollType();
        if (scrollType == null) {
            scrollType = RateItemsV2DTO.ScrollType.ONE_BY_ONE;
        }
        RateItemsV2DTO.ScrollType scrollType2 = scrollType;
        long j11 = this.id;
        List<RateItemsV2VO.RateItemVO> vo = toVo(rateItemsV2DTO.getItems(), scrollType2);
        RateItemsV2DTO.RateItemsHeader header = rateItemsV2DTO.getHeader();
        TextDTO title = header != null ? header.getTitle() : null;
        RateItemsV2DTO.RateItemsHeader header2 = rateItemsV2DTO.getHeader();
        RateItemsV2VO.RateItemsHeaderVO rateItemsHeaderVO = new RateItemsV2VO.RateItemsHeaderVO(title, header2 != null ? header2.getIconButton() : null);
        t tVar = null;
        Integer separatorHeight = rateItemsV2DTO.getSeparatorHeight();
        String widgetPageKey = rateItemsV2DTO.getWidgetPageKey();
        Map<String, TokenizedTrackingInfo> trackingInfo = rateItemsV2DTO.getTrackingInfo();
        if (trackingInfo != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(this.id), null, 2, null);
        }
        return new RateItemsV2VO(j11, vo, rateItemsHeaderVO, separatorHeight, widgetPageKey, tVar, rateItemsV2DTO.getStrokeColor(), scrollType2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RateItemsV2WrapperVO> invoke(@NotNull RateItemsV2Wrapper state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.id = widgetInfo.d().hashCode();
        return map(state, widgetInfo.c().a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<RateItemsV2VO.RateItemVO> toVo(List<? extends RateItemsV2DTO.RateItem> list, RateItemsV2DTO.ScrollType scrollType) {
        CellDTO cellDTO;
        t tVar;
        Object rateReviewsItemVO;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        RateItemsV2DTO.RateItem.RateProductItem rateProductItem;
        t tVar2;
        RateItemsV2DTO.RateItem.RateProductItem rateProductItem2;
        K k11;
        AtomActionDTO titleAction;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        Map<String, TokenizedTrackingInfo> trackingInfo3;
        AtomActionDTO action2;
        List<? extends RateItemsV2DTO.RateItem> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (RateItemsV2DTO.RateItem rateItem : list2) {
            if (rateItem instanceof RateItemsV2DTO.RateItem.RateProductItem) {
                RateItemsV2DTO.RateItem.RateProductItem rateProductItem3 = (RateItemsV2DTO.RateItem.RateProductItem) rateItem;
                ProductMediaDTO productMedia = rateProductItem3.getProductMedia();
                RatingDTO rating = rateProductItem3.getRating();
                String sku = rateProductItem3.getSku();
                RateItemsV2DTO.RateItemCommon rateItemCommon = rateProductItem3.getRateItemCommon();
                TextDTO title = rateItemCommon != null ? rateItemCommon.getTitle() : null;
                RateItemsV2DTO.RateItemCommon rateItemCommon2 = rateProductItem3.getRateItemCommon();
                String backgroundColor = rateItemCommon2 != null ? rateItemCommon2.getBackgroundColor() : null;
                RateItemsV2DTO.RateItemCommon rateItemCommon3 = rateProductItem3.getRateItemCommon();
                String strokeColor = rateItemCommon3 != null ? rateItemCommon3.getStrokeColor() : null;
                RateItemsV2DTO.RateItemCommon rateItemCommon4 = rateProductItem3.getRateItemCommon();
                AtomAction atomAction = (rateItemCommon4 == null || (action2 = rateItemCommon4.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action2, rateProductItem3.getRateItemCommon().getTrackingInfo());
                BadgeDTO badge = rateProductItem3.getBadge();
                RateItemsV2DTO.HideButtonDTO hideButton = rateProductItem3.getHideButton();
                RateItemsV2VO.HideButtonVO vo = hideButton != null ? toVo(hideButton) : null;
                TextDTO headerTitle = rateProductItem3.getHeaderTitle();
                RateItemsV2DTO.RateItemCommon rateItemCommon5 = rateProductItem3.getRateItemCommon();
                if (rateItemCommon5 == null || (trackingInfo3 = rateItemCommon5.getTrackingInfo()) == null) {
                    rateProductItem = rateProductItem3;
                    tVar2 = null;
                } else {
                    rateProductItem = rateProductItem3;
                    tVar2 = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo3, Long.valueOf(this.id), null, 2, null);
                }
                CommonControlSettings common = rateProductItem.getRating().getCommon();
                t mapToTokenizedEvent$default = (common == null || (trackingInfo2 = common.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(this.id), null, 2, null);
                TimerDTO timer = rateProductItem.getTimer();
                TimerVO vo2 = timer != null ? TimerVOKt.toVo(timer) : null;
                List<RateItemsV2DTO.RatingActionDTO> ratingActions = rateProductItem.getRatingActions();
                if (ratingActions != null) {
                    List<RateItemsV2DTO.RatingActionDTO> list3 = ratingActions;
                    ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        RateItemsV2DTO.RateItem.RateProductItem rateProductItem4 = rateProductItem;
                        arrayList2.add(toVO((RateItemsV2DTO.RatingActionDTO) it.next(), this.id, rateProductItem4.getRating().getCommon()));
                        rateProductItem = rateProductItem4;
                    }
                    rateProductItem2 = rateProductItem;
                    k11 = arrayList2;
                } else {
                    rateProductItem2 = rateProductItem;
                    k11 = K.f71697a;
                }
                RateItemsV2DTO.RateItemCommon rateItemCommon6 = rateProductItem2.getRateItemCommon();
                AtomAction atomAction2 = (rateItemCommon6 == null || (titleAction = rateItemCommon6.getTitleAction()) == null) ? null : AtomActionMapperKt.toAtomAction(titleAction, rateProductItem2.getRateItemCommon().getTitle().getTrackingInfo());
                RateItemsV2DTO.RateItemCommon rateItemCommon7 = rateProductItem2.getRateItemCommon();
                rateReviewsItemVO = new RateItemsV2VO.RateItemVO.RateProductItemVO(productMedia, rating, sku, title, backgroundColor, strokeColor, atomAction, badge, mapToTokenizedEvent$default, vo, headerTitle, k11, tVar2, vo2, atomAction2, rateItemCommon7 != null ? rateItemCommon7.getCell() : null, scrollType, false, 131072, null);
            } else if (rateItem instanceof RateItemsV2DTO.RateItem.RateReviewsItem) {
                RateItemsV2DTO.RateItem.RateReviewsItem rateReviewsItem = (RateItemsV2DTO.RateItem.RateReviewsItem) rateItem;
                IconDTO icon = rateReviewsItem.getIcon();
                RateItemsV2DTO.RateItemCommon rateItemCommon8 = rateReviewsItem.getRateItemCommon();
                TextDTO title2 = rateItemCommon8 != null ? rateItemCommon8.getTitle() : null;
                RateItemsV2DTO.RateItemCommon rateItemCommon9 = rateReviewsItem.getRateItemCommon();
                String backgroundColor2 = rateItemCommon9 != null ? rateItemCommon9.getBackgroundColor() : null;
                RateItemsV2DTO.RateItemCommon rateItemCommon10 = rateReviewsItem.getRateItemCommon();
                String strokeColor2 = rateItemCommon10 != null ? rateItemCommon10.getStrokeColor() : null;
                RateItemsV2DTO.RateItemCommon rateItemCommon11 = rateReviewsItem.getRateItemCommon();
                AtomAction atomAction3 = (rateItemCommon11 == null || (action = rateItemCommon11.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, rateReviewsItem.getRateItemCommon().getTrackingInfo());
                RateItemsV2DTO.RateItemCommon rateItemCommon12 = rateReviewsItem.getRateItemCommon();
                if (rateItemCommon12 == null || (trackingInfo = rateItemCommon12.getTrackingInfo()) == null) {
                    cellDTO = null;
                    tVar = null;
                } else {
                    cellDTO = null;
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(this.id), null, 2, null);
                }
                RateItemsV2DTO.RateItemCommon rateItemCommon13 = rateReviewsItem.getRateItemCommon();
                rateReviewsItemVO = new RateItemsV2VO.RateItemVO.RateReviewsItemVO(icon, title2, backgroundColor2, strokeColor2, atomAction3, tVar, rateItemCommon13 != null ? rateItemCommon13.getCell() : cellDTO);
            } else {
                throw new IllegalArgumentException("В списке есть null элементы");
            }
            arrayList.add(rateReviewsItemVO);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RateItemsV2VO.HideButtonVO toVo(RateItemsV2DTO.HideButtonDTO hideButtonDTO) {
        int i11;
        Paddings leftPadding;
        CommonControlSettings common;
        t tVar;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        IconButtonV3DTO iconButton = hideButtonDTO.getIconButton();
        TextDTO title = hideButtonDTO.getTitle();
        Integer num = this.hideTitleWidth;
        if (num == null) {
            num = TextUtilsKt.measureTextWidth(hideButtonDTO.getTitle(), this.context, getTextPaint());
            this.hideTitleWidth = num;
            Unit unit = Unit.f71690a;
            if (num == null) {
                i11 = 0;
                int i12 = i11;
                leftPadding = hideButtonDTO.getLeftPadding();
                if (leftPadding == null) {
                    leftPadding = Paddings.NONE;
                }
                Paddings paddings = leftPadding;
                common = hideButtonDTO.getIconButton().getCommon();
                tVar = null;
                if (common != null && (trackingInfo = common.getTrackingInfo()) != null) {
                    tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(this.id), null, 2, null);
                }
                return new RateItemsV2VO.HideButtonVO(iconButton, title, i12, paddings, tVar);
            }
        }
        i11 = num.intValue();
        int i122 = i11;
        leftPadding = hideButtonDTO.getLeftPadding();
        if (leftPadding == null) {
        }
        Paddings paddings2 = leftPadding;
        common = hideButtonDTO.getIconButton().getCommon();
        tVar = null;
        if (common != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(this.id), null, 2, null);
        }
        return new RateItemsV2VO.HideButtonVO(iconButton, title, i122, paddings2, tVar);
    }
}
