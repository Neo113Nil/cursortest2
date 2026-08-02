package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderVO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;Ll20/d;)Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersHeaderMapper implements Function2<FiltersDTO, d, List<? extends FiltersHeaderVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FiltersHeaderVO> invoke(@NotNull FiltersDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        FiltersDTO.HeaderDTO header = state.getHeader();
        long a11 = c.a(widgetInfo.d(), "-header");
        ButtonV3DTO leftButtonApp = header.getLeftButtonApp();
        TextDTO title = header.getTitle();
        IconButtonV3DTO rightButton = header.getRightButton();
        boolean z11 = state.getSections().size() == 1;
        boolean isFirstSectionSeparated = state.isFirstSectionSeparated();
        AsyncActionDTO asyncBehavior = state.getAsyncBehavior();
        return C7714v.a0(new FiltersHeaderVO(a11, asyncBehavior != null ? MapperExtKt.toVO(asyncBehavior, widgetInfo.c().a()) : null, leftButtonApp, title, rightButton, z11, isFirstSectionSeparated, state.getAsyncErrorMessage(), state.getAsyncServerErrorMessage()));
    }
}
