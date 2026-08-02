package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonVI;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "button", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "mapButton", "(Ljava/lang/Object;)Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/data/AddToFavoritesButtonDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesButtonMapper implements Function2<AddToFavoritesButtonDTO, d, List<? extends AddToFavoritesButtonVI>> {
    private final AddToFavoritesButtonVI.ButtonType mapButton(Object button) {
        if (button instanceof FavoriteProductMoleculeV4) {
            return new AddToFavoritesButtonVI.ButtonType.FavoriteButton(FavoriteProductModelKt.toModel((FavoriteProductMoleculeV4) button));
        }
        if (button instanceof IconButtonV3DTO) {
            return new AddToFavoritesButtonVI.ButtonType.IconButton((IconButtonV3DTO) button);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddToFavoritesButtonVI> invoke(@NotNull AddToFavoritesButtonDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        AddToFavoritesButtonVI.ButtonType mapButton = mapButton(state.getButton());
        OnBoardingDTO onboarding = state.getOnboarding();
        CommonControlSettings modalAction = state.getModalAction();
        return C7714v.a0(new AddToFavoritesButtonVI(hashCode, mapButton, onboarding, modalAction != null ? modalAction.toAtomAction() : null));
    }
}
