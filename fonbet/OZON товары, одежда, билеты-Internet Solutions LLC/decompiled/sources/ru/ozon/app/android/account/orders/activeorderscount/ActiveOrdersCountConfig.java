package ru.ozon.app.android.account.orders.activeorderscount;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.composer.widgets.base.config.ParseResult;
import ru.ozon.app.android.composer.widgets.base.config.UndisplayedWidgetConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001d\b\u0007\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/orders/activeorderscount/ActiveOrdersCountConfig;", "Lru/ozon/app/android/composer/widgets/base/config/UndisplayedWidgetConfig;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Landroid/content/Context;)V", "parseResult", "Lru/ozon/app/android/composer/widgets/base/config/ParseResult;", "params", "", "state", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActiveOrdersCountConfig extends UndisplayedWidgetConfig {

    @NotNull
    private final Context context;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public ActiveOrdersCountConfig(@NotNull JsonParser jsonDeserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsonDeserializer = jsonDeserializer;
        this.context = context;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.config.UndisplayedWidgetConfig
    @NotNull
    public ParseResult parseResult(String params, String state) {
        Context context = this.context;
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        OrdersCountStorage orderCountsStorage = ((AccountComponentApi) dependencyStorage.b(AccountComponentApi.class)).getOrderCountsStorage();
        if (state == null) {
            return new ParseResult.Failure("state is empty");
        }
        ActiveOrdersCountDTO activeOrdersCountDTO = (ActiveOrdersCountDTO) this.jsonDeserializer.fromJson(state, ActiveOrdersCountDTO.class);
        orderCountsStorage.setOrdersAndNotificationsCount(activeOrdersCountDTO.getActiveOrders(), activeOrdersCountDTO.getAllUnread());
        return ParseResult.Success.INSTANCE;
    }
}
