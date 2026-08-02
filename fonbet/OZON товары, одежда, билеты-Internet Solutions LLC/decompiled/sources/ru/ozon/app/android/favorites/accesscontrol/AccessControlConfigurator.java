package ru.ozon.app.android.favorites.accesscontrol;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlViewModel;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/AccessControlConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel;", "pAccessControlViewModel", "<init>", "(LPc/a;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)V", "LPc/a;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel;", "viewModel", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AccessControlConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<AccessControlViewModel> pAccessControlViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    public AccessControlConfigurator(@NotNull a<AccessControlViewModel> pAccessControlViewModel) {
        Intrinsics.checkNotNullParameter(pAccessControlViewModel, "pAccessControlViewModel");
        this.pAccessControlViewModel = pAccessControlViewModel;
        this.viewModel = k.b(new AccessControlConfigurator$viewModel$2(this));
    }

    private final AccessControlViewModel getViewModel() {
        return (AccessControlViewModel) this.viewModel.getValue();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1 && requestCode == 5463) {
            Long valueOf = data != null ? Long.valueOf(data.getLongExtra("key:request_id_ac_widget", 0L)) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            long longValue = valueOf.longValue();
            AccessControlViewModel viewModel = getViewModel();
            if (viewModel != null) {
                viewModel.changeAccess(longValue);
            }
        }
    }
}
