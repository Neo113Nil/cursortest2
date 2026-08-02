package ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.data;

import Sc.o;
import WZ.x;
import android.content.Context;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.data.RailwayScrollPriceCalendarDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$DateTabDTO;", "tab", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$DateTabVO;", "mapDateTab", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$DateTabDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$DateTabVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$CornersDTO;", "corners", "Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "mapCorners", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO$CornersDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/presentation/RailwayScrollPriceCalendarVO$CornersVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/railwayScrollPriceCalendar/data/RailwayScrollPriceCalendarDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RailwayScrollPriceCalendarMapper implements Function2<RailwayScrollPriceCalendarDTO, d, List<? extends RailwayScrollPriceCalendarVO>> {

    @NotNull
    private final Context context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RailwayScrollPriceCalendarDTO.AsyncBehaviorType.values().length];
            try {
                iArr[RailwayScrollPriceCalendarDTO.AsyncBehaviorType.NO_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RailwayScrollPriceCalendarDTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RailwayScrollPriceCalendarMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final RailwayScrollPriceCalendarVO.CornersVO mapCorners(RailwayScrollPriceCalendarDTO.CornersDTO corners) {
        return new RailwayScrollPriceCalendarVO.CornersVO(ResourceExtKt.toPxF(corners.getTopRadius().getPx(), this.context), ResourceExtKt.toPxF(corners.getBottomRadius().getPx(), this.context));
    }

    private final RailwayScrollPriceCalendarVO.DateTabVO mapDateTab(RailwayScrollPriceCalendarDTO.DateTabDTO tab) {
        int hashCode = tab.getDate().getText().hashCode();
        TextDTO date = tab.getDate();
        Object pricesItem = tab.getPricesItem();
        TextDTO textDTO = pricesItem instanceof TextDTO ? (TextDTO) pricesItem : null;
        Object pricesItem2 = tab.getPricesItem();
        return new RailwayScrollPriceCalendarVO.DateTabVO(hashCode, date, textDTO, pricesItem2 instanceof IconDTO ? (IconDTO) pricesItem2 : null, tab.getAspect());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RailwayScrollPriceCalendarVO> invoke(@NotNull RailwayScrollPriceCalendarDTO state, @NotNull d widgetInfo) {
        RailwayScrollPriceCalendarVO.PriceCalendarState allDone;
        RailwayScrollPriceCalendarVO.DateTabVO dateTabVO;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getAsyncBehaviorType().ordinal()];
        if (i11 == 1) {
            Iterator<RailwayScrollPriceCalendarDTO.DateTabDTO> it = state.getDateTabs().iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                if (it.next().isActive()) {
                    break;
                }
                i12++;
            }
            Integer valueOf = Integer.valueOf(i12);
            if (i12 == -1) {
                valueOf = null;
            }
            List<RailwayScrollPriceCalendarDTO.DateTabDTO> dateTabs = state.getDateTabs();
            ArrayList arrayList = new ArrayList(C7714v.z(dateTabs, 10));
            Iterator<T> it2 = dateTabs.iterator();
            while (it2.hasNext()) {
                arrayList.add(mapDateTab((RailwayScrollPriceCalendarDTO.DateTabDTO) it2.next()));
            }
            allDone = new RailwayScrollPriceCalendarVO.PriceCalendarState.AllDone(arrayList, valueOf, (valueOf == null || (dateTabVO = (RailwayScrollPriceCalendarVO.DateTabVO) C7714v.Q(valueOf.intValue(), arrayList)) == null) ? null : Integer.valueOf(dateTabVO.getId()));
        } else {
            if (i11 != 2) {
                throw new o();
            }
            allDone = RailwayScrollPriceCalendarVO.PriceCalendarState.Loading.INSTANCE;
        }
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = state.getViewTrackingInfo();
        return C7714v.a0(new RailwayScrollPriceCalendarVO(hashCode, allDone, viewTrackingInfo != null ? x.b(viewTrackingInfo, Long.valueOf(hashCode), null) : null, mapCorners(state.getCorners()), state.getBackgroundColor(), UiExtKt.toPx(state.getVerticalPadding().getPx(), this.context), state.getRoundedCornersOuterColor()));
    }
}
