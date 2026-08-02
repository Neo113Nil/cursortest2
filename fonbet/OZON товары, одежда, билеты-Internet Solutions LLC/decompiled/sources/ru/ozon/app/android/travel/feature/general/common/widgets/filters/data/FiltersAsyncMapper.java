package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersUpdateVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer.FiltersFooterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderVO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R*\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersAsyncMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersUpdateVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersHeaderMapper;", "headerMapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersSectionsMapper;", "sectionsMapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersFooterMapper;", "footerMapper", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersHeaderMapper;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersSectionsMapper;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersFooterMapper;)V", "state", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersUpdateVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersHeaderMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersSectionsMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersFooterMapper;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "setWidgetInfo", "(Ll20/d;)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersAsyncMapper implements AsyncWidgetStateMapper<FiltersDTO, FiltersUpdateVO> {

    @NotNull
    private final FiltersFooterMapper footerMapper;

    @NotNull
    private final FiltersHeaderMapper headerMapper;

    @NotNull
    private final FiltersSectionsMapper sectionsMapper;
    private d widgetInfo;

    public FiltersAsyncMapper(@NotNull FiltersHeaderMapper headerMapper, @NotNull FiltersSectionsMapper sectionsMapper, @NotNull FiltersFooterMapper footerMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(sectionsMapper, "sectionsMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.headerMapper = headerMapper;
        this.sectionsMapper = sectionsMapper;
        this.footerMapper = footerMapper;
    }

    public final void setWidgetInfo(d dVar) {
        this.widgetInfo = dVar;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public FiltersUpdateVO mapAsyncState(@NotNull FiltersDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        d dVar = this.widgetInfo;
        if (dVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AsyncActionDTO asyncBehavior = state.getAsyncBehavior();
        AsyncActionVO vo = asyncBehavior != null ? MapperExtKt.toVO(asyncBehavior, dVar.c().a()) : null;
        FiltersHeaderVO filtersHeaderVO = (FiltersHeaderVO) C7714v.K(this.headerMapper.invoke(state, dVar));
        if (filtersHeaderVO.getAsyncServerErrorMessage() != null) {
            AsyncActionVO asyncAction = filtersHeaderVO.getAsyncAction();
            filtersHeaderVO = FiltersHeaderVO.copy$default(filtersHeaderVO, 0L, asyncAction != null ? AsyncActionVO.copy$default(asyncAction, AsyncActionVO.AsyncBehaviorType.NO_ACTION, null, null, null, 14, null) : null, null, null, null, false, false, null, null, 509, null);
        }
        return new FiltersUpdateVO(vo, filtersHeaderVO, (FiltersFooterVO) C7714v.K(this.footerMapper.invoke(state, dVar)), this.sectionsMapper.invoke(state, dVar));
    }
}
