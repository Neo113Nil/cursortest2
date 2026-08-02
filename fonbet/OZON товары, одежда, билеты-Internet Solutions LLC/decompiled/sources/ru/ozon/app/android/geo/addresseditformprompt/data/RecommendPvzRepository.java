package ru.ozon.app.android.geo.addresseditformprompt.data;

import W10.c;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository;", "", "", "link", "LW10/c;", "trackingData", "Lio/reactivex/y;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;", "getRecommendedPvz", "(Ljava/lang/String;LW10/c;)Lio/reactivex/y;", "Result", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface RecommendPvzRepository {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;", "", "<init>", "()V", "Refresh", "Notification", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result$Notification;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result$Refresh;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Result {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result$Notification;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "", "", "trackingPayloads", "<init>", "(Lru/ozon/uni/android/flashbar/model/Restriction;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "Ljava/util/Map;", "getTrackingPayloads", "()Ljava/util/Map;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Notification extends Result {

            @NotNull
            private final Restriction restriction;
            private final Map<String, String> trackingPayloads;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Notification(@NotNull Restriction restriction, Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(restriction, "restriction");
                this.restriction = restriction;
                this.trackingPayloads = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Notification)) {
                    return false;
                }
                Notification notification = (Notification) other;
                return Intrinsics.d(this.restriction, notification.restriction) && Intrinsics.d(this.trackingPayloads, notification.trackingPayloads);
            }

            @NotNull
            public final Restriction getRestriction() {
                return this.restriction;
            }

            public final Map<String, String> getTrackingPayloads() {
                return this.trackingPayloads;
            }

            public int hashCode() {
                int hashCode = this.restriction.hashCode() * 31;
                Map<String, String> map = this.trackingPayloads;
                return hashCode + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                return "Notification(restriction=" + this.restriction + ", trackingPayloads=" + this.trackingPayloads + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result$Refresh;", "Lru/ozon/app/android/geo/addresseditformprompt/data/RecommendPvzRepository$Result;", "", "link", "Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;", "viewPort", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;", "getViewPort", "()Lru/ozon/app/android/geo/addresseditformprompt/data/ViewPort;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Refresh extends Result {

            @NotNull
            private final String link;

            @NotNull
            private final ViewPort viewPort;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refresh(@NotNull String link, @NotNull ViewPort viewPort) {
                super(null);
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(viewPort, "viewPort");
                this.link = link;
                this.viewPort = viewPort;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Refresh)) {
                    return false;
                }
                Refresh refresh = (Refresh) other;
                return Intrinsics.d(this.link, refresh.link) && Intrinsics.d(this.viewPort, refresh.viewPort);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final ViewPort getViewPort() {
                return this.viewPort;
            }

            public int hashCode() {
                return this.viewPort.hashCode() + (this.link.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Refresh(link=" + this.link + ", viewPort=" + this.viewPort + ")";
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }
    }

    @NotNull
    y<Result> getRecommendedPvz(@NotNull String link, c trackingData);
}
