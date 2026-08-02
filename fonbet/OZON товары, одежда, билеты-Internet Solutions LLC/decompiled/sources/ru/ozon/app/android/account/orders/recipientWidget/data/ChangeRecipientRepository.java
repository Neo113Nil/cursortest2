package ru.ozon.app.android.account.orders.recipientWidget.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.ChangeRecipientModel;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientRepository;", "", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/ChangeRecipientModel;", "changeRecipientModel", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel$ChangeRecipientResult$Success;", "changeRecipient", "(Lru/ozon/app/android/account/orders/recipientWidget/presentation/ChangeRecipientModel;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ChangeRecipientRepository {
    Object changeRecipient(@NotNull ChangeRecipientModel changeRecipientModel, @NotNull d<? super RecipientViewModel.ChangeRecipientResult.Success> dVar);
}
