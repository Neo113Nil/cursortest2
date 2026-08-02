package ru.ozon.app.android.payment.feature.webpage;

import android.net.Uri;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.feature.webpage.PaymentViewModel;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel;", "<init>", "()V", "", ImagesContract.URL, "", "init", "(Ljava/lang/String;)V", "", "onRedirectPage", "(Ljava/lang/String;)Z", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel$Action;", "actions", "Landroidx/lifecycle/V;", "getActions", "()Landroidx/lifecycle/V;", "isFinalRedirect", "Z", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentViewModelImpl extends w0 implements PaymentViewModel {

    @NotNull
    private final V<PaymentViewModel.Action> actions = new V<>();
    private boolean isFinalRedirect;

    @Override // ru.ozon.app.android.payment.feature.webpage.PaymentViewModel
    public void init(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        getActions().postValue(new PaymentViewModel.Action.LoadPage(url));
    }

    @Override // ru.ozon.app.android.payment.feature.webpage.PaymentViewModel
    public boolean onRedirectPage(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        if (Intrinsics.d(parse.getScheme(), "ozon") && (Intrinsics.d(parse.getAuthority(), "browser") || Intrinsics.d(parse.getAuthority(), "pdf"))) {
            getActions().postValue(new PaymentViewModel.Action.OpenDeeplink(url, false));
            return true;
        }
        if (!Intrinsics.d(parse.getScheme(), "ozon") || this.isFinalRedirect) {
            return false;
        }
        this.isFinalRedirect = true;
        getActions().postValue(new PaymentViewModel.Action.OpenDeeplink(url, true));
        return true;
    }

    @Override // ru.ozon.app.android.payment.feature.webpage.PaymentViewModel
    @NotNull
    public V<PaymentViewModel.Action> getActions() {
        return this.actions;
    }
}
