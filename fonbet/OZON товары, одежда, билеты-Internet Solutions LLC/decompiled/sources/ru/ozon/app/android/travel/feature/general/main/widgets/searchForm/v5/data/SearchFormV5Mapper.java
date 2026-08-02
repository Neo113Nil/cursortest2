package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data.SearchFormV5DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5VO;
import ru.ozon.app.android.travel.molecules.dto.iconField.IconFieldDTO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0003j\u0002`\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "mapContent", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$Locations;", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "mapLocation", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$Locations;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$TextField;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;", "mapTextField", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO$TextField;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5Mapper implements Function2<SearchFormV5DTO, d, List<? extends SearchFormV5VO>>, AsyncWidgetStateMapper<SearchFormV5DTO, SearchFormV5VO.Content> {

    @NotNull
    private final Context context;

    public SearchFormV5Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final SearchFormV5VO.Content mapContent(SearchFormV5DTO state) {
        SearchFormV5DTO.Locations locations = state.getLocations();
        SearchFormV5VO.Content.Locations mapLocation = locations != null ? mapLocation(locations, this.context) : null;
        IconFieldDTO dateField = state.getDateField();
        IconFieldVO vo = dateField != null ? MapperExtKt.toVo(dateField) : null;
        IconFieldDTO rightField = state.getRightField();
        IconFieldVO vo2 = rightField != null ? MapperExtKt.toVo(rightField) : null;
        IconFieldDTO touristField = state.getTouristField();
        IconFieldVO vo3 = touristField != null ? MapperExtKt.toVo(touristField) : null;
        ButtonV3DTO searchButton = state.getSearchButton();
        String backgroundColor = state.getBackgroundColor();
        float pxF = ResourceExtKt.toPxF(state.getCornerRadius().getPx(), this.context);
        String leftPatchColor = state.getLeftPatchColor();
        String rightPatchColor = state.getRightPatchColor();
        CellDTO toggleCell = state.getToggleCell();
        return new SearchFormV5VO.Content(mapLocation, vo, vo2, vo3, searchButton, backgroundColor, pxF, leftPatchColor, rightPatchColor, toggleCell != null ? DsCellExtensionsKt.disableAutoToggle(toggleCell) : null, state.getTrackingInfo(), false, state.getAsyncFetchConfig(), 2048, null);
    }

    private final SearchFormV5VO.Content.Locations mapLocation(SearchFormV5DTO.Locations item, Context context) {
        SearchFormV5VO.Content.TextField mapTextField = mapTextField(item.getTopLocation());
        SearchFormV5DTO.TextField bottomLocation = item.getBottomLocation();
        return new SearchFormV5VO.Content.Locations(mapTextField, bottomLocation != null ? mapTextField(bottomLocation) : null, item.getBackgroundColor(), ResourceExtKt.toPxF(item.getCornerRadius().getPx(), context), item.getSwapButton(), item.getSeparatorColor() != null, item.getSeparatorColor());
    }

    private final SearchFormV5VO.Content.TextField mapTextField(SearchFormV5DTO.TextField item) {
        return new SearchFormV5VO.Content.TextField(item.getText(), item.getCommonControlSettings(), item.getDestinations());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchFormV5VO> invoke(@NotNull SearchFormV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new SearchFormV5VO(widgetInfo.d().hashCode(), mapContent(state), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public SearchFormV5VO.Content mapAsyncState(@NotNull SearchFormV5DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapContent(state);
    }
}
