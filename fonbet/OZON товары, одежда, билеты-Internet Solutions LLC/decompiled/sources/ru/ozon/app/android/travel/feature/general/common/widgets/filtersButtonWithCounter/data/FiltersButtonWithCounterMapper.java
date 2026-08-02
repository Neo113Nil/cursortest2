package ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.data.FiltersButtonWithCounterDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation.FiltersButtonWithCounterVO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "<init>", "()V", "state", "", "asyncData", "", "id", "extractState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO;Ljava/lang/String;Ljava/lang/Long;)Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO$CounterPosition;", "position", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "mapCounterPosition", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO$CounterPosition;)Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FiltersButtonWithCounterMapper implements Function2<FiltersButtonWithCounterDTO, d, List<? extends FiltersButtonWithCounterVO>>, AsyncWidgetStateMapper<FiltersButtonWithCounterDTO, FiltersButtonWithCounterVO.FiltersButtonWithCounterState> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FiltersButtonWithCounterDTO.CounterPosition.values().length];
            try {
                iArr[FiltersButtonWithCounterDTO.CounterPosition.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FiltersButtonWithCounterDTO.CounterPosition.RIGHT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FiltersButtonWithCounterDTO.CounterPosition.RIGHT_TOP_OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final FiltersButtonWithCounterVO.FiltersButtonWithCounterState extractState(FiltersButtonWithCounterDTO state, String asyncData, Long id2) {
        AsyncActionDTO asyncBehavior = state.getAsyncBehavior();
        return new FiltersButtonWithCounterVO.FiltersButtonWithCounterState(asyncBehavior != null ? MapperExtKt.toVO(asyncBehavior, asyncData) : null, MapperExtKt.toVO(state.getButton(), id2), mapCounterPosition(state.getCounterPosition()), state.getBackgroundColor());
    }

    private final FiltersButtonWithCounterVO.CounterPosition mapCounterPosition(FiltersButtonWithCounterDTO.CounterPosition position) {
        int i11 = position == null ? -1 : WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i11 == 1) {
            return FiltersButtonWithCounterVO.CounterPosition.Right.INSTANCE;
        }
        if (i11 == 2) {
            return FiltersButtonWithCounterVO.CounterPosition.RightTop.INSTANCE;
        }
        if (i11 != 3) {
            return null;
        }
        return FiltersButtonWithCounterVO.CounterPosition.RightTopOverlay.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FiltersButtonWithCounterVO> invoke(@NotNull FiltersButtonWithCounterDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        return C7714v.a0(new FiltersButtonWithCounterVO(hashCode, extractState(state, widgetInfo.c().a(), Long.valueOf(hashCode))));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public FiltersButtonWithCounterVO.FiltersButtonWithCounterState mapAsyncState(@NotNull FiltersButtonWithCounterDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state, null, null);
    }
}
