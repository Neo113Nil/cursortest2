package ru.ozon.app.android.account.orders.view.maps.domain;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.domain.MapRoute;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/MapsRouterImpl;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapsRouter;", "", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRouteHandler;", "routeHandlers", "Landroid/content/Context;", "context", "<init>", "(Ljava/util/Set;Landroid/content/Context;)V", "Lkotlin/Pair;", "Landroid/content/Intent;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "pair", "", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute;", "mapToMapsRoute", "(Lkotlin/Pair;)Ljava/util/List;", "Lcom/google/android/gms/maps/model/LatLng;", "targetLocation", "handleRoute", "(Lcom/google/android/gms/maps/model/LatLng;)Ljava/util/List;", "Ljava/util/Set;", "Landroid/content/Context;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapsRouterImpl implements MapsRouter {

    @NotNull
    private final Context context;

    @NotNull
    private final Set<MapRouteHandler> routeHandlers;

    public MapsRouterImpl(@NotNull Set<MapRouteHandler> routeHandlers, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(routeHandlers, "routeHandlers");
        Intrinsics.checkNotNullParameter(context, "context");
        this.routeHandlers = routeHandlers;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MapRoute> mapToMapsRoute(Pair<? extends Intent, ? extends MapRoute.RouteType> pair) {
        PackageManager packageManager = this.context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(pair.e(), 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = queryIntentActivities;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(((ResolveInfo) it.next()).activityInfo.packageName, UserVerificationMethods.USER_VERIFY_PATTERN);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
            Intrinsics.checkNotNullExpressionValue(loadLabel, "loadLabel(...)");
            arrayList.add(new MapRoute(loadLabel.toString(), pair.e(), pair.f()));
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.account.orders.view.maps.domain.MapsRouter
    @NotNull
    public List<MapRoute> handleRoute(@NotNull LatLng targetLocation) {
        Intrinsics.checkNotNullParameter(targetLocation, "targetLocation");
        return l.C(l.m(l.w(C7714v.w(this.routeHandlers), new MapsRouterImpl$handleRoute$1(targetLocation)), new MapsRouterImpl$handleRoute$2(this)));
    }
}
