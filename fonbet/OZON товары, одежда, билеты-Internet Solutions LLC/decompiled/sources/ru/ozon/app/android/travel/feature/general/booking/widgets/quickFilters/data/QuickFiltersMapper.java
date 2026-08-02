package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IconChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010 \u001a\u00060\u0003j\u0002`\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "", "asyncData", "extractState", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "", "chips", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$FilterItem;", "mapChips", "(Ljava/util/List;)Ljava/util/List;", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "mapLoader", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;", "mapSkeletonsSettings", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "Landroid/content/Context;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersMapper implements Function2<QuickFiltersDTO, d, List<? extends QuickFiltersVO>>, AsyncWidgetStateMapper<QuickFiltersDTO, QuickFiltersVO.QuickFiltersState> {

    @NotNull
    private final Context context;

    public QuickFiltersMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final QuickFiltersVO.QuickFiltersState extractState(QuickFiltersDTO state, String asyncData) {
        AsyncActionDTO asyncBehavior = state.getAsyncBehavior();
        AsyncActionVO vo = asyncBehavior != null ? MapperExtKt.toVO(asyncBehavior, asyncData) : null;
        List<QuickFiltersVO.FilterItem> mapChips = mapChips(state.getItems());
        String backgroundColor = state.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = state.getViewTrackingInfo();
        boolean isEmpty = state.getItems().isEmpty();
        QuickFiltersVO.SkeletonsSettings mapSkeletonsSettings = mapSkeletonsSettings(state.getSkeletonsSettings());
        QuickFiltersVO.Loader mapLoader = mapLoader(state);
        Integer autoScrollIndex = state.getAutoScrollIndex();
        Integer bottomPadding = state.getBottomPadding();
        boolean z11 = false;
        int px = bottomPadding != null ? UiExtKt.toPx(bottomPadding.intValue(), this.context) : 0;
        QuickFiltersDTO.StickyBehavior behaviour = QuickFiltersDTOKt.getBehaviour(state);
        TextDTO title = state.getTitle();
        if (state.getTitle() != null && state.getStickyBehavior() == QuickFiltersDTO.StickyBehavior.DYNAMIC_STICKY) {
            z11 = true;
        }
        return new QuickFiltersVO.QuickFiltersState(vo, title, mapChips, backgroundColor, mapLoader, isEmpty, mapSkeletonsSettings, viewTrackingInfo, autoScrollIndex, px, behaviour, z11);
    }

    private final List<QuickFiltersVO.FilterItem> mapChips(List<? extends Object> chips) {
        QuickFiltersVO.FilterItem divider;
        ArrayList arrayList = new ArrayList();
        for (Object obj : chips) {
            if (obj instanceof ChipDTO) {
                divider = new QuickFiltersVO.AtomViewVO((N.b(obj.getClass()) + "-" + ((Object) ((ChipDTO) obj).getTitle().getText())).hashCode(), (AtomDTO) obj);
            } else if (obj instanceof ButtonV3DTO) {
                divider = new QuickFiltersVO.AtomViewVO((N.b(obj.getClass()) + "-" + ((ButtonV3DTO) obj).getTitle()).hashCode(), (AtomDTO) obj);
            } else if (obj instanceof IndicatorLabelChipDTO) {
                divider = new QuickFiltersVO.AtomViewVO((N.b(obj.getClass()) + "-" + ((Object) ((IndicatorLabelChipDTO) obj).getTitle().getText())).hashCode(), (AtomDTO) obj);
            } else if (obj instanceof IconChipDTO) {
                kotlin.reflect.d b11 = N.b(obj.getClass());
                IconChipDTO iconChipDTO = (IconChipDTO) obj;
                String backgroundImage = iconChipDTO.getIcon().getBackgroundImage();
                CommonAtomIconDTO icon = iconChipDTO.getIcon().getIcon();
                divider = new QuickFiltersVO.AtomViewVO((b11 + "-" + backgroundImage + "-" + (icon != null ? icon.getIcon() : null)).hashCode(), (AtomDTO) obj);
            } else if (obj instanceof TagButtonDTO) {
                divider = new QuickFiltersVO.AtomViewVO((N.b(obj.getClass()) + "-" + ((TagButtonDTO) obj).getText()).hashCode(), (AtomDTO) obj);
            } else {
                divider = obj instanceof QuickFiltersDTO.Divider ? new QuickFiltersVO.Divider(String.valueOf(N.b(obj.getClass())).hashCode(), ((QuickFiltersDTO.Divider) obj).getColor()) : null;
            }
            if (divider != null) {
                arrayList.add(divider);
            }
        }
        return arrayList;
    }

    private final QuickFiltersVO.Loader mapLoader(QuickFiltersDTO item) {
        String token;
        QuickFiltersDTO.BarColor progressBarColor = item.getProgressBarColor();
        if (progressBarColor == null || (token = progressBarColor.getGradientAccentColor()) == null) {
            token = UniColors.BG_ACTION_PRIMARY.getToken();
        }
        return new QuickFiltersVO.Loader(item.isProgressBarShown(), item.getBackgroundColor(), progressBarColor != null ? progressBarColor.getSolidColor() : null, token);
    }

    private final QuickFiltersVO.SkeletonsSettings mapSkeletonsSettings(QuickFiltersDTO.SkeletonsSettings item) {
        if (item == null) {
            return null;
        }
        int[] widthPatterns = item.getWidthPatterns();
        if (widthPatterns != null) {
            int length = widthPatterns.length;
            for (int i11 = 0; i11 < length; i11++) {
                widthPatterns[i11] = UiExtKt.toPx(widthPatterns[i11], this.context);
            }
        }
        Integer height = item.getHeight();
        return new QuickFiltersVO.SkeletonsSettings(height != null ? Integer.valueOf(UiExtKt.toPx(height.intValue(), this.context)) : null, widthPatterns);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<QuickFiltersVO> invoke(@NotNull QuickFiltersDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new QuickFiltersVO(widgetInfo.d().hashCode(), extractState(state, widgetInfo.c().a())));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public QuickFiltersVO.QuickFiltersState mapAsyncState(@NotNull QuickFiltersDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state, null);
    }
}
