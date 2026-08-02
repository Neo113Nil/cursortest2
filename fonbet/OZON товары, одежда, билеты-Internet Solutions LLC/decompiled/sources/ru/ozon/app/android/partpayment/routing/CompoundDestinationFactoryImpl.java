package ru.ozon.app.android.partpayment.routing;

import K1.G;
import android.content.Context;
import android.net.Uri;
import androidx.collection.C5155y;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactoryImpl;", "Lru/ozon/app/android/partpayment/routing/CompoundDestinationFactory;", "", "Lru/ozon/app/android/partpayment/routing/DestinationFactory;", "factories", "<init>", "(Ljava/util/Set;)V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "deeplink", "LpZ/f;", "createDestination", "(Landroid/content/Context;Landroid/net/Uri;)LpZ/f;", "Ljava/util/Set;", "Landroidx/collection/y;", "map", "Landroidx/collection/y;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompoundDestinationFactoryImpl implements CompoundDestinationFactory {

    @NotNull
    private final Set<DestinationFactory> factories;

    @NotNull
    private final C5155y<Uri, DestinationFactory> map;

    public CompoundDestinationFactoryImpl(@NotNull Set<DestinationFactory> factories) {
        Intrinsics.checkNotNullParameter(factories, "factories");
        this.factories = factories;
        this.map = new C5155y<>(20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @Override // ru.ozon.app.android.partpayment.routing.CompoundDestinationFactory
    @NotNull
    public f createDestination(@NotNull Context context, @NotNull Uri deeplink) {
        DestinationFactory destinationFactory;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        C5155y<Uri, DestinationFactory> c5155y = this.map;
        DestinationFactory destinationFactory2 = c5155y.get(deeplink);
        if (destinationFactory2 == null) {
            Iterator it = this.factories.iterator();
            while (true) {
                if (!it.hasNext()) {
                    destinationFactory = 0;
                    break;
                }
                destinationFactory = it.next();
                if (((DestinationFactory) destinationFactory).canHandle(deeplink)) {
                    break;
                }
            }
            destinationFactory2 = destinationFactory;
            if (destinationFactory2 == null) {
                throw new IllegalArgumentException(G.b(deeplink, "cannot create destination with deeplink : "));
            }
            c5155y.put(deeplink, destinationFactory2);
        }
        return destinationFactory2.createDestination(context, deeplink);
    }
}
