package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.header;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTOKt;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2VO;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/header/CatalogShelfHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfHeader;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/header/CatalogShelfHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "toWidgetVO", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfHeader;)Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/header/CatalogShelfHeaderVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfHeader;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfHeaderMapper implements Function2<CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader, d, List<? extends CatalogShelfHeaderVO>> {
    private final CatalogShelfHeaderVO toWidgetVO(CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader catalogShelfHeader) {
        long hashCode = catalogShelfHeader.hashCode();
        HeaderV2VO vo = HeaderV2DTOKt.toVO(catalogShelfHeader.getHeader());
        String catalogueTabsConnectionTag = catalogShelfHeader.getCatalogueTabsConnectionTag();
        return new CatalogShelfHeaderVO(hashCode, catalogueTabsConnectionTag != null ? Integer.valueOf(catalogueTabsConnectionTag.hashCode()) : null, catalogShelfHeader.getCatalogueTabsConnectionTag(), vo);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CatalogShelfHeaderVO> invoke(@NotNull CatalogShelfDTO.CatalogShelfSection.CatalogShelfHeader state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toWidgetVO(state));
    }
}
