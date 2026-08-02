package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di;

import GZ.g;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModelImpl;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsMapper;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/di/TipCourierDetailsV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "getMapper", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsMapper;", "mapper", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModel", "()Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "createAndPayViewModel", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModelImpl;", "viewModel", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "Companion", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TipCourierDetailsV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/di/TipCourierDetailsV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/di/TipCourierDetailsV2Component;", "create", "(Lk20/g;)Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/di/TipCourierDetailsV2Component;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final TipCourierDetailsV2Component create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new TipCourierDetailsV2Component$Companion$create$1(storage);
        }
    }

    @NotNull
    CreateAndPayViewModel getCreateAndPayViewModel();

    @NotNull
    d getCustomActionHandlersFactory();

    @NotNull
    TipCourierDetailsMapper getMapper();

    @NotNull
    g getOzonRouter();

    @NotNull
    TipCourierDetailsViewModelImpl getViewModel();
}
