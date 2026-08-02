package ru.ozon.app.android.account.orders.recipientWidget.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientApi;
import ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientRepositoryImpl;
import ru.ozon.app.android.account.orders.recipientWidget.data.RecipientMapper;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModelImpl;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/di/RecipientComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientMapper;", "mapper", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModelImpl;", "viewModel", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RecipientComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/di/RecipientComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/account/orders/recipientWidget/di/RecipientComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/recipientWidget/di/RecipientComponent;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final RecipientComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new RecipientComponent(storage) { // from class: ru.ozon.app.android.account.orders.recipientWidget.di.RecipientComponent$Companion$create$1
                private final AccountComponentApi accountComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(RecipientComponent$Companion$create$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;

                {
                    this.accountComponentApi = (AccountComponentApi) storage.getComponent(AccountComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
                }

                @Override // ru.ozon.app.android.account.orders.recipientWidget.di.RecipientComponent
                public RecipientMapper getMapper() {
                    return (RecipientMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.account.orders.recipientWidget.di.RecipientComponent
                public RecipientViewModelImpl getViewModel() {
                    Object create = this.networkComponentApi.getRetrofit().create(ChangeRecipientApi.class);
                    Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                    return new RecipientViewModelImpl(new ChangeRecipientRepositoryImpl((ChangeRecipientApi) create, this.networkComponentApi.getJsonDeserializer()), this.accountComponentApi.getOrderChangeManager());
                }
            };
        }
    }

    @NotNull
    RecipientMapper getMapper();

    @NotNull
    RecipientViewModelImpl getViewModel();
}
