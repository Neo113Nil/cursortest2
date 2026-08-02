package ru.ozon.app.android.account.orders.buttonv2.core;

import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.buttonv2.data.ActionButtonV2DTO;
import ru.ozon.app.android.account.orders.data.adapter.DataToStringAdapter;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/core/ActionButtonV2Parser;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/account/orders/buttonv2/data/ActionButtonV2DTO;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/account/orders/buttonv2/data/ActionButtonV2DTO;", "Lcom/squareup/moshi/Moshi;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionButtonV2Parser implements Function2<String, String, ActionButtonV2DTO> {

    @NotNull
    private final Moshi moshi;

    public ActionButtonV2Parser(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    @Override // kotlin.jvm.functions.Function2
    public ActionButtonV2DTO invoke(String params, String state) {
        Moshi.a g10 = this.moshi.g();
        g10.b(new DataToStringAdapter());
        Moshi moshi = new Moshi(g10);
        if (state != null) {
            return (ActionButtonV2DTO) moshi.c(ActionButtonV2DTO.class).fromJson(state);
        }
        return null;
    }
}
