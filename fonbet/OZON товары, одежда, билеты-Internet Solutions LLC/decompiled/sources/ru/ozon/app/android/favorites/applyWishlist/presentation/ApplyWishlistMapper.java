package ru.ozon.app.android.favorites.applyWishlist.presentation;

import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.applyWishlist.data.ApplyWishlistDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/applyWishlist/data/ApplyWishlistDTO;", "Ll20/d;", "", "Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/favorites/applyWishlist/data/ApplyWishlistDTO;Ll20/d;)Ljava/util/List;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplyWishlistMapper implements Function2<ApplyWishlistDTO, d, List<? extends ApplyWishlistVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ApplyWishlistVO> invoke(@NotNull ApplyWishlistDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        String hint = state.getHint();
        String listTitle = state.getListTitle();
        List<CellDTO> cells = state.getCells();
        ButtonV3DTO saveButton = state.getSaveButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new ApplyWishlistVO(hashCode, title, subtitle, hint, listTitle, cells, saveButton, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, state.getErrorForUser(), null, UserVerificationMethods.USER_VERIFY_NONE, null));
    }
}
