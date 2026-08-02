package ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation;

import EZ.e;
import EZ.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.factory.ProductSelectorDestinationFactory;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00162\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorNavigator;", "LEZ/g;", "Landroidx/appcompat/app/g;", "activity", "<init>", "(Landroidx/appcompat/app/g;)V", "LEZ/e;", "response", "wrapToFragment", "(LEZ/e;)LEZ/e;", "LpZ/a;", "destination", "", "canWrapDestination", "(LpZ/a;)Z", "Landroid/content/Intent;", "Landroid/content/Context;", "context", "isProductSelector", "(Landroid/content/Intent;Landroid/content/Context;)Z", "", "requestCode", "", "navigate", "(LEZ/e;I)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/CompoundDestinationFactory;", "compoundDestinationFactory", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/CompoundDestinationFactory;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductSelectorNavigator extends g {

    @NotNull
    private final CompoundDestinationFactory compoundDestinationFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSelectorNavigator(@NotNull androidx.appcompat.app.g activity) {
        super(activity, Integer.valueOf(R$id.container), null, null, 12, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.compoundDestinationFactory = new CompoundDestinationFactoryImpl(e0.h(new ProductSelectorDestinationFactory()));
    }

    private final boolean canWrapDestination(C8880a destination) {
        return isProductSelector(destination.a(), getActivity());
    }

    private final boolean isProductSelector(Intent intent, Context context) {
        return Intrinsics.d(intent.getComponent(), new ComponentName(context, (Class<?>) ProductSelectorActivity.class));
    }

    private final e<?> wrapToFragment(e<?> response) {
        Object b11 = response.b();
        if (!(b11 instanceof C8880a)) {
            return response;
        }
        C8880a c8880a = (C8880a) b11;
        if (!canWrapDestination(c8880a)) {
            return response;
        }
        String stringExtra = c8880a.a().getStringExtra("ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.EXTRA_DEEPLINK");
        CompoundDestinationFactory compoundDestinationFactory = this.compoundDestinationFactory;
        r activity = getActivity();
        Uri parse = Uri.parse(stringExtra);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return response.e(compoundDestinationFactory.createDestination(activity, parse));
    }

    @Override // EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.navigate(wrapToFragment(response), requestCode);
    }
}
