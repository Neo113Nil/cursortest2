package ru.ozon.app.android.cart.domain.di.module;

import YZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/domain/di/module/CartDomainAnalyticsPayloadTypesModule;", "", "<init>", "()V", "", "LYZ/a;", "provideSupportedPayloadTypes$cart_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideSupportedPayloadTypes", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartDomainAnalyticsPayloadTypesModule {
    @NotNull
    public final Set<a> provideSupportedPayloadTypes$cart_prodGoogleAllVendorsRelease() {
        ActionType.Companion companion = ActionType.INSTANCE;
        String type = companion.getByName("pre_to_cart").getType();
        Intrinsics.checkNotNullParameter(type, "type");
        a a11 = a.a(type);
        String type2 = companion.getByName("cart_auto_select").getType();
        Intrinsics.checkNotNullParameter(type2, "type");
        a a12 = a.a(type2);
        String type3 = companion.getByName("pull_refresh").getType();
        Intrinsics.checkNotNullParameter(type3, "type");
        a a13 = a.a(type3);
        String type4 = companion.getByName("swipe_view").getType();
        Intrinsics.checkNotNullParameter(type4, "type");
        a a14 = a.a(type4);
        String type5 = companion.getByName("swipe_favorite").getType();
        Intrinsics.checkNotNullParameter(type5, "type");
        a a15 = a.a(type5);
        String type6 = companion.getByName("swipe_unfavorite").getType();
        Intrinsics.checkNotNullParameter(type6, "type");
        a a16 = a.a(type6);
        String type7 = companion.getByName("swipe_pre_remove").getType();
        Intrinsics.checkNotNullParameter(type7, "type");
        a a17 = a.a(type7);
        String type8 = companion.getByName("swipe_remove").getType();
        Intrinsics.checkNotNullParameter(type8, "type");
        a a18 = a.a(type8);
        String type9 = companion.getByName("cart_stars_deal_cancelled").getType();
        Intrinsics.checkNotNullParameter(type9, "type");
        a a19 = a.a(type9);
        String type10 = companion.getByName("click_select_async").getType();
        Intrinsics.checkNotNullParameter(type10, "type");
        a a21 = a.a(type10);
        String type11 = companion.getByName("click_unselect_async").getType();
        Intrinsics.checkNotNullParameter(type11, "type");
        a a22 = a.a(type11);
        String type12 = companion.getByName("increment_async").getType();
        Intrinsics.checkNotNullParameter(type12, "type");
        a a23 = a.a(type12);
        String type13 = companion.getByName("decrement_async").getType();
        Intrinsics.checkNotNullParameter(type13, "type");
        return e0.a(a11, a12, a13, a14, a15, a16, a17, a18, a19, a21, a22, a23, a.a(type13));
    }
}
