package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.data;

import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation.AddToFavoritesCellVI;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesCellMapper implements Function2<AddToFavoritesCellDTO, d, List<? extends AddToFavoritesCellVI>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddToFavoritesCellVI> invoke(@NotNull AddToFavoritesCellDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CellDTO disableAutoToggle = DsCellExtensionsKt.disableAutoToggle(state.getCell());
        CommonControlSettings modalAction = state.getModalAction();
        AtomAction atomAction = modalAction != null ? modalAction.toAtomAction() : null;
        Long y02 = h.y0(state.getSku());
        String addLink = state.getAddLink();
        String deleteLink = state.getDeleteLink();
        boolean isFavorite = state.isFavorite();
        Map<String, TokenizedTrackingInfo> addTrackingInfo = state.getAddTrackingInfo();
        t d11 = addTrackingInfo != null ? x.d(addTrackingInfo, widgetInfo) : null;
        Map<String, TokenizedTrackingInfo> deleteTrackingInfo = state.getDeleteTrackingInfo();
        AddToFavoritesCellVI.AddToFavoritesCellModelVI addToFavoritesCellModelVI = new AddToFavoritesCellVI.AddToFavoritesCellModelVI(y02, addLink, deleteLink, isFavorite, d11, deleteTrackingInfo != null ? x.d(deleteTrackingInfo, widgetInfo) : null);
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new AddToFavoritesCellVI(hashCode, disableAutoToggle, addToFavoritesCellModelVI, atomAction, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null));
    }
}
