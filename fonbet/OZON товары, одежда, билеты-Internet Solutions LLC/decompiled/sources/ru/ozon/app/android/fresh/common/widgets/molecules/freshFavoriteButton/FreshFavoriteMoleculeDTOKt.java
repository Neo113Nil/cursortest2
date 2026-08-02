package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a$\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¨\u0006\r"}, d2 = {"toModel", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;", "widgetId", "", "isAdultProduct", "", "getActionName", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshFavoriteMoleculeDTOKt {
    private static final String getActionName(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(atomActionDTO, map);
        AtomAction.ComposerAction composerAction = atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null;
        if (composerAction != null) {
            return composerAction.getActionName();
        }
        return null;
    }

    @NotNull
    public static final FreshFavoriteMoleculeVO toModel(@NotNull FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(freshFavoriteMoleculeDTO, "<this>");
        return new FreshFavoriteMoleculeVO(new FreshFavoriteState(Long.valueOf(freshFavoriteMoleculeDTO.getSku()), freshFavoriteMoleculeDTO.isFavorite(), z11, getActionName(freshFavoriteMoleculeDTO.getFavoriteButton().getAction(), null), x.b(freshFavoriteMoleculeDTO.getFavoriteButton().getTrackingInfo(), Long.valueOf(j11), null), getActionName(freshFavoriteMoleculeDTO.getUnfavoriteButton().getAction(), null), x.b(freshFavoriteMoleculeDTO.getUnfavoriteButton().getTrackingInfo(), Long.valueOf(j11), null)));
    }
}
