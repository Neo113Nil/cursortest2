package ru.ozon.app.android.tabbar.miniapp.seller;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.tabbar.R$id;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/seller/SellerTabIdMapper;", "", "<init>", "()V", "getId", "", "tabUrl", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerTabIdMapper {

    @NotNull
    private static final Map<String, Integer> idsProvider = U.i(new Pair(LinkGenerator.INSTANCE.cart().toString(), Integer.valueOf(R$id.menu_cart)));

    public final Integer getId(@NotNull String tabUrl) {
        Intrinsics.checkNotNullParameter(tabUrl, "tabUrl");
        String builder = Uri.parse(tabUrl).buildUpon().clearQuery().toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return idsProvider.get(builder);
    }
}
