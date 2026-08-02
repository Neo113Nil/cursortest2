package ru.ozon.app.android.delivery.customActionsHandlers.addcard;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.AddCardResponse;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.api.SelectPaymentApi;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepository;", "", "", "actionName", "", "body", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/api/AddCardResponse;", "addCard", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface SelectPaymentRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepository$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentRepository;", "retrofit", "Lretrofit2/Retrofit;", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final SelectPaymentRepository create(@NotNull Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.create(SelectPaymentApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return new SelectPaymentRepositoryImpl((SelectPaymentApi) create);
        }
    }

    Object addCard(@NotNull String str, Map<String, String> map, @NotNull d<? super AddCardResponse> dVar);
}
