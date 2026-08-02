package ru.ozon.app.android.account.orders.view.maps.domain;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/content/Intent;", "intent", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "routeType", "<init>", "(Ljava/lang/String;Landroid/content/Intent;Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "getRouteType", "()Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "RouteType", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MapRoute {

    @NotNull
    private final Intent intent;

    @NotNull
    private final RouteType routeType;

    @NotNull
    private final String title;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "", "<init>", "()V", "GOOGLE", "YANDEX", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType$GOOGLE;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType$YANDEX;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RouteType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType$GOOGLE;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GOOGLE extends RouteType {

            @NotNull
            public static final GOOGLE INSTANCE = new GOOGLE();

            private GOOGLE() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType$YANDEX;", "Lru/ozon/app/android/account/orders/view/maps/domain/MapRoute$RouteType;", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class YANDEX extends RouteType {

            @NotNull
            public static final YANDEX INSTANCE = new YANDEX();

            private YANDEX() {
                super(null);
            }
        }

        public /* synthetic */ RouteType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RouteType() {
        }
    }

    public MapRoute(@NotNull String title, @NotNull Intent intent, @NotNull RouteType routeType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(routeType, "routeType");
        this.title = title;
        this.intent = intent;
        this.routeType = routeType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapRoute)) {
            return false;
        }
        MapRoute mapRoute = (MapRoute) other;
        return Intrinsics.d(this.title, mapRoute.title) && Intrinsics.d(this.intent, mapRoute.intent) && Intrinsics.d(this.routeType, mapRoute.routeType);
    }

    @NotNull
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    public final RouteType getRouteType() {
        return this.routeType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.routeType.hashCode() + ((this.intent.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MapRoute(title=" + this.title + ", intent=" + this.intent + ", routeType=" + this.routeType + ")";
    }
}
