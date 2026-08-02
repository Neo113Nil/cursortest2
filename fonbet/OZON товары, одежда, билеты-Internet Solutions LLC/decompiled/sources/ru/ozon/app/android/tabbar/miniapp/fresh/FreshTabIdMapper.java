package ru.ozon.app.android.tabbar.miniapp.fresh;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.tabbar.R$id;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabIdMapper;", "", "<init>", "()V", "getId", "", "tabUrl", "", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FreshTabIdMapper {

    @NotNull
    private static final Map<String, Integer> idsProvider;

    static {
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        idsProvider = U.j(new Pair(MiniAppExtKt.appendExpress(linkGenerator.cart()).toString(), Integer.valueOf(R$id.menu_cart)), new Pair(MiniAppExtKt.appendExpress(linkGenerator.express()).toString(), Integer.valueOf(R$id.menu_fresh_main)), new Pair(MiniAppExtKt.appendExpressMinimarket(linkGenerator.expressMinimarket()).toString(), Integer.valueOf(R$id.menu_fresh_main)), new Pair(MiniAppExtKt.appendExpress(linkGenerator.category()).toString(), Integer.valueOf(R$id.menu_catalog)), new Pair(MiniAppExtKt.appendExpressMinimarket(linkGenerator.category()).toString(), Integer.valueOf(R$id.menu_catalog)));
    }

    public final int getId(@NotNull String tabUrl) {
        Intrinsics.checkNotNullParameter(tabUrl, "tabUrl");
        Integer num = idsProvider.get(tabUrl);
        return num != null ? num.intValue() : tabUrl.hashCode();
    }
}
