package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items;

import Sc.o;
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
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.data.ExpressNavigationSliderV2DTO;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemVO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u001fB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\n\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\n\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\n\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Items;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item;", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;", "position", "", "getRatio", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;)F", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Settings;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Settings;", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Settings;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Settings;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$PositionType;", "fromDTOTypeToVOType", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$PositionType;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Data;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Data;", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Item$Data;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Data;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2DTO$Items;Ll20/d;)Ljava/util/List;", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressNavigationSliderV2ItemsMapper implements Function2<ExpressNavigationSliderV2DTO.Items, d, List<? extends ExpressNavigationSliderV2ItemVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ExpressNavigationSliderV2ItemVO.PositionType.values().length];
            try {
                iArr[ExpressNavigationSliderV2ItemVO.PositionType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ExpressNavigationSliderV2DTO.PositionType.values().length];
            try {
                iArr2[ExpressNavigationSliderV2DTO.PositionType.FULL_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ExpressNavigationSliderV2DTO.PositionType.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ExpressNavigationSliderV2DTO.PositionType.HALF_WIDTH_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ExpressNavigationSliderV2DTO.PositionType.HALF_WIDTH_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final ExpressNavigationSliderV2ItemVO.PositionType fromDTOTypeToVOType(ExpressNavigationSliderV2DTO.PositionType position) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[position.ordinal()];
        if (i11 == 1) {
            return ExpressNavigationSliderV2ItemVO.PositionType.FULL_WIDTH;
        }
        if (i11 == 2) {
            return ExpressNavigationSliderV2ItemVO.PositionType.INVALID;
        }
        if (i11 == 3) {
            return ExpressNavigationSliderV2ItemVO.PositionType.HALF_WIDTH_LEFT;
        }
        if (i11 == 4) {
            return ExpressNavigationSliderV2ItemVO.PositionType.HALF_WIDTH_RIGHT;
        }
        throw new o();
    }

    private final float getRatio(ExpressNavigationSliderV2ItemVO.PositionType position) {
        return WhenMappings.$EnumSwitchMapping$0[position.ordinal()] == 1 ? 0.23323616f : 0.4848485f;
    }

    private final ExpressNavigationSliderV2ItemVO toVO(ExpressNavigationSliderV2DTO.Item item) {
        long hashCode = item.hashCode();
        ExpressNavigationSliderV2ItemVO.Settings vo = toVO(item.getSettings());
        ExpressNavigationSliderV2ItemVO.Data vo2 = toVO(item.getData());
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        return new ExpressNavigationSliderV2ItemVO(hashCode, vo, vo2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, getRatio(toVO(item.getSettings()).getPosition()), item.getData().isAdult(), false, 64, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ExpressNavigationSliderV2ItemVO> invoke(@NotNull ExpressNavigationSliderV2DTO.Items state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ExpressNavigationSliderV2DTO.Item> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ExpressNavigationSliderV2DTO.Item) it.next()));
        }
        return arrayList;
    }

    private final ExpressNavigationSliderV2ItemVO.Settings toVO(ExpressNavigationSliderV2DTO.Item.Settings settings) {
        return new ExpressNavigationSliderV2ItemVO.Settings(settings.getRightIndent(), fromDTOTypeToVOType(settings.getPosition()));
    }

    private final ExpressNavigationSliderV2ItemVO.Data toVO(ExpressNavigationSliderV2DTO.Item.Data data) {
        return new ExpressNavigationSliderV2ItemVO.Data(data.getTitle(), data.getBackgroundColor(), data.getImage(), data.getDeeplink(), data.getLink());
    }
}
