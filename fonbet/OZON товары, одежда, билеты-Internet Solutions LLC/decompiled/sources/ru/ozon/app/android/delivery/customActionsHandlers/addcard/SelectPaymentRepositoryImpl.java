package ru.ozon.app.android.delivery.customActionsHandlers.addcard;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.AddCardResponse;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.SelectPaymentApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepositoryImpl;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepository;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/api/SelectPaymentApi;", "userCardsApi", "<init>", "(Lru/ozon/app/android/delivery/customActionsHandlers/addcard/api/SelectPaymentApi;)V", "", "actionName", "", "body", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/api/AddCardResponse;", "addCard", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/api/SelectPaymentApi;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectPaymentRepositoryImpl implements SelectPaymentRepository {

    @NotNull
    private final SelectPaymentApi userCardsApi;

    public SelectPaymentRepositoryImpl(@NotNull SelectPaymentApi userCardsApi) {
        Intrinsics.checkNotNullParameter(userCardsApi, "userCardsApi");
        this.userCardsApi = userCardsApi;
    }

    @Override // ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentRepository
    public Object addCard(@NotNull String str, Map<String, String> map, @NotNull d<? super AddCardResponse> dVar) {
        return this.userCardsApi.addCard(str, map, dVar);
    }
}
