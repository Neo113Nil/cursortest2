package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState;", "", "<init>", "()V", "Connected", "Disconnected", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState$Connected;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState$Disconnected;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ConnectionSocketState {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState$Connected;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState;", "<init>", "()V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Connected extends ConnectionSocketState {

        @NotNull
        public static final Connected INSTANCE = new Connected();

        private Connected() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState$Disconnected;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/domain/ConnectionSocketState;", "<init>", "()V", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Disconnected extends ConnectionSocketState {

        @NotNull
        public static final Disconnected INSTANCE = new Disconnected();

        private Disconnected() {
            super(null);
        }
    }

    public /* synthetic */ ConnectionSocketState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConnectionSocketState() {
    }
}
