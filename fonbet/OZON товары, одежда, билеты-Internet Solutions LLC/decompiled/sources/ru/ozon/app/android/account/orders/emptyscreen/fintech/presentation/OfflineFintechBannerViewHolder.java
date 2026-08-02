package ru.ozon.app.android.account.orders.emptyscreen.fintech.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerView;", "offlineFintechBannerView", "<init>", "(Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerVI;Ll20/d;)V", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerView;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OfflineFintechBannerViewHolder extends k<OfflineFintechBannerVI> {
    public static final int $stable = TextAtomV2View.$stable | Image.$stable;

    @NotNull
    private final OfflineFintechBannerView offlineFintechBannerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineFintechBannerViewHolder(@NotNull OfflineFintechBannerView offlineFintechBannerView) {
        super(offlineFintechBannerView);
        Intrinsics.checkNotNullParameter(offlineFintechBannerView, "offlineFintechBannerView");
        this.offlineFintechBannerView = offlineFintechBannerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OfflineFintechBannerVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ImageHolderKt.bind$default(this.offlineFintechBannerView.getImage(), item.getImage(), null, 2, null);
        TextHolderKt.bind$default(this.offlineFintechBannerView.getTitle(), item.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.offlineFintechBannerView.getSubtitle(), item.getSubtitle(), null, 2, null);
    }
}
