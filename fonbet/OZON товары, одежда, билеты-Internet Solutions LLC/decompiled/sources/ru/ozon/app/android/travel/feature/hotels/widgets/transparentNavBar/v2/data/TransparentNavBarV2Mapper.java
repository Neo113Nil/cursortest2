package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2VO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "dto", "", "isStaticNavBar", "", "backgroundColor", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "toVO", "(Ljava/lang/Object;ZLjava/lang/String;)Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2VO$Button;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransparentNavBarV2Mapper implements Function2<TransparentNavBarV2DTO, d, List<? extends TransparentNavBarV2VO>> {
    private final TransparentNavBarV2VO.Button toVO(Object dto, boolean isStaticNavBar, String backgroundColor) {
        FavoriteProductModel model;
        if (dto instanceof IconButtonV3DTO) {
            return new TransparentNavBarV2VO.IconButton((IconButtonV3DTO) dto);
        }
        if (!(dto instanceof FavoriteProductMoleculeV4)) {
            return null;
        }
        if (isStaticNavBar) {
            FavoriteProductMoleculeV4 favoriteProductMoleculeV4 = (FavoriteProductMoleculeV4) dto;
            model = FavoriteProductModel.copy$default(FavoriteProductModelKt.toModel(favoriteProductMoleculeV4), 0L, false, IconButtonV3DTO.copy$default(favoriteProductMoleculeV4.getFavoriteButton(), null, null, null, null, null, null, backgroundColor, null, null, null, null, null, null, null, 16319, null), IconButtonV3DTO.copy$default(favoriteProductMoleculeV4.getUnfavoriteButton(), null, null, null, null, null, null, backgroundColor, null, null, null, null, null, null, null, 16319, null), null, null, 51, null);
        } else {
            model = FavoriteProductModelKt.toModel((FavoriteProductMoleculeV4) dto);
        }
        return new TransparentNavBarV2VO.FavoriteButton(model);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TransparentNavBarV2VO> invoke(@NotNull TransparentNavBarV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<Object> rightButtons = state.getRightButtons();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = rightButtons.iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!Intrinsics.d(state.isDynamicAlpha(), Boolean.FALSE) && state.getScrollAnchorId() != null) {
                z11 = false;
            }
            TransparentNavBarV2DTO.ButtonsColors buttonShapeColors = state.getButtonShapeColors();
            TransparentNavBarV2VO.Button vo = toVO(next, z11, buttonShapeColors != null ? buttonShapeColors.getWithBackground() : null);
            if (vo != null) {
                arrayList.add(vo);
            }
        }
        List z02 = C7714v.z0(arrayList);
        List<Object> leftButtons = state.getLeftButtons();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : leftButtons) {
            boolean z12 = Intrinsics.d(state.isDynamicAlpha(), Boolean.FALSE) || state.getScrollAnchorId() == null;
            TransparentNavBarV2DTO.ButtonsColors buttonShapeColors2 = state.getButtonShapeColors();
            TransparentNavBarV2VO.Button vo2 = toVO(obj, z12, buttonShapeColors2 != null ? buttonShapeColors2.getWithBackground() : null);
            if (vo2 != null) {
                arrayList2.add(vo2);
            }
        }
        Boolean isDynamicAlpha = state.isDynamicAlpha();
        return C7714v.a0(new TransparentNavBarV2VO(hashCode, arrayList2, z02, 0.0f, isDynamicAlpha != null ? isDynamicAlpha.booleanValue() : false, state.getScrollAnchorId(), state.getButtonIconColors(), state.getButtonShapeColors(), 8, null));
    }
}
