package ru.ozon.app.android.pdp.widgets.selectSeller.presentation;

import Lc.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.presentation.SisBrandFavoriteButtonDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerBrandView;", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerBaseView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;", "selectSeller", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;", "sisBrandFavoriteButtonDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;Lru/ozon/app/android/seller/molecule/sisbrandfavorite/presentation/SisBrandFavoriteButtonDelegate;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleContainer", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getSubtitleContainer", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectSellerBrandView extends SelectSellerBaseView {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View subtitleContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSellerBrandView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        a.d(textAtomV2View, R$id.selectSellerSubtitle, 0, -2, false);
        this.subtitleContainer = textAtomV2View;
        addView(getSubtitleContainer());
        setupConstraints();
    }

    @Override // ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerBaseView
    public void bind(@NotNull SelectSellerVO selectSeller, @NotNull SisBrandFavoriteButtonDelegate sisBrandFavoriteButtonDelegate, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(selectSeller, "selectSeller");
        Intrinsics.checkNotNullParameter(sisBrandFavoriteButtonDelegate, "sisBrandFavoriteButtonDelegate");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        super.bind(selectSeller, sisBrandFavoriteButtonDelegate, actionHandler);
        TextHolderKt.bindOrGone$default(getSubtitleContainer(), selectSeller.getSubtitle(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerBaseView
    @NotNull
    public TextAtomV2View getSubtitleContainer() {
        return this.subtitleContainer;
    }
}
