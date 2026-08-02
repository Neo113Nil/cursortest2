package ru.ozon.app.android.orderdetails.customsfees.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.orderdetails.customsfees.core.CustomsFeesMapper;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\u00060\u0011j\u0002`\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/di/CustomsFeesComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "<init>", "(Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;Lru/ozon/app/android/account/di/AccountComponentApi;Lru/ozon/app/android/network/di/NetworkComponentApi;)V", "Lru/ozon/app/android/orderdetails/customsfees/core/CustomsFeesMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/orderdetails/customsfees/core/CustomsFeesMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider$delegate", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomsFeesComponent implements InterfaceC6958a {

    /* renamed from: adultListDelegateProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adultListDelegateProvider;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/di/CustomsFeesComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/orderdetails/customsfees/di/CustomsFeesComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/orderdetails/customsfees/di/CustomsFeesComponent;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomsFeesComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new CustomsFeesComponent((CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class), (AccountComponentApi) storage.getComponent(AccountComponentApi.class), (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class));
        }

        private Companion() {
        }
    }

    public CustomsFeesComponent(@NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi, @NotNull AccountComponentApi accountComponentApi, @NotNull NetworkComponentApi networkComponentApi) {
        Intrinsics.checkNotNullParameter(customActionHandlersComponentApi, "customActionHandlersComponentApi");
        Intrinsics.checkNotNullParameter(accountComponentApi, "accountComponentApi");
        Intrinsics.checkNotNullParameter(networkComponentApi, "networkComponentApi");
        this.mapper = k.b(CustomsFeesComponent$mapper$2.INSTANCE);
        this.customActionHandlersStoreFactory = k.b(new CustomsFeesComponent$customActionHandlersStoreFactory$2(customActionHandlersComponentApi));
        this.adultListDelegateProvider = k.b(new CustomsFeesComponent$adultListDelegateProvider$2(accountComponentApi, networkComponentApi));
    }

    @NotNull
    public final AdultListDelegateProvider getAdultListDelegateProvider() {
        return (AdultListDelegateProvider) this.adultListDelegateProvider.getValue();
    }

    @NotNull
    public final d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @NotNull
    public final CustomsFeesMapper getMapper() {
        return (CustomsFeesMapper) this.mapper.getValue();
    }
}
