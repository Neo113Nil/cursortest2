package ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.factory;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pZ.f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/factory/DestinationFactory;", "", "Landroid/net/Uri;", "deeplink", "", "canHandle", "(Landroid/net/Uri;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "createDestination", "(Landroid/content/Context;Landroid/net/Uri;)LpZ/f;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DestinationFactory {
    boolean canHandle(@NotNull Uri deeplink);

    @NotNull
    f createDestination(@NotNull Context context, @NotNull Uri deeplink);
}
