package ru.ozon.app.android.travel.actionhandler.deeplinkRoute.event;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;", "", "Push", "Pop", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent$Pop;", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent$Push;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DeeplinkRouteEvent {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent$Pop;", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;", "<init>", "()V", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pop implements DeeplinkRouteEvent {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent$Push;", "Lru/ozon/app/android/travel/actionhandler/deeplinkRoute/event/DeeplinkRouteEvent;", "", "refreshUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRefreshUrl", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Push implements DeeplinkRouteEvent {

        @NotNull
        private final String refreshUrl;

        public Push(@NotNull String refreshUrl) {
            Intrinsics.checkNotNullParameter(refreshUrl, "refreshUrl");
            this.refreshUrl = refreshUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Push) && Intrinsics.d(this.refreshUrl, ((Push) other).refreshUrl);
        }

        @NotNull
        public final String getRefreshUrl() {
            return this.refreshUrl;
        }

        public int hashCode() {
            return this.refreshUrl.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Push(refreshUrl=", this.refreshUrl, ")");
        }
    }
}
