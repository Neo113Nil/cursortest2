package ru.ozon.app.android.geo.addressBookBar.presentation.common;

import Ae.C2399j;
import Ae.C2408n0;
import W10.c;
import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addressBookBar.presentation.AddressBookBarDelegate;
import ru.ozon.app.android.geo.addressBookBar.presentation.view.AddressBookBarView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import xe.B0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;", "Lru/ozon/app/android/geo/addressBookBar/presentation/view/AddressBookBarView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "<init>", "(Lru/ozon/app/android/geo/addressBookBar/presentation/view/AddressBookBarView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "Lru/ozon/app/android/geo/addressBookBar/presentation/AddressBookBarDelegate;", "delegate", "Lru/ozon/app/android/geo/addressBookBar/presentation/AddressBookBarDelegate;", "Lxe/B0;", "addressCellJob", "Lxe/B0;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookBarWidgetViewHolder extends k<AddressBookBarVO> {
    private B0 addressCellJob;

    @NotNull
    private final AddressUiInfoViewModel addressUiInfoViewModel;

    @NotNull
    private final AddressBookBarDelegate delegate;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBookBarWidgetViewHolder(@NotNull AddressBookBarView view, @NotNull ComposerReferences refs, @NotNull AddressUiInfoViewModel addressUiInfoViewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(addressUiInfoViewModel, "addressUiInfoViewModel");
        this.refs = refs;
        this.addressUiInfoViewModel = addressUiInfoViewModel;
        this.delegate = new AddressBookBarDelegate(view, this, refs);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        B0 b02 = this.addressCellJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.addressCellJob = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressBookBarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.delegate.bindSeparator(item);
        if (this.addressCellJob != null) {
            return;
        }
        this.addressCellJob = C2399j.C(new C2408n0(C5427n.a(this.addressUiInfoViewModel.getAddressCellFlow(), U7.d.c(this.refs), AbstractC5434v.b.STARTED), new AddressBookBarWidgetViewHolder$bind$1(this, null)), K.a(this.refs.getContainer().g()));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddressBookBarVO item, @NotNull c trackingData, f viewedPond) {
        t trackingInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        if ((viewedPond == null || !viewedPond.c(String.valueOf(item.getId()))) && (trackingInfo = item.getTrackingInfo()) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), trackingInfo, null, 2, null);
            if (viewedPond != null) {
                viewedPond.e(String.valueOf(item.getId()));
            }
        }
    }
}
