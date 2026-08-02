package ru.ozon.app.android.analytics.plugins.af;

import B90.C2618u;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "", "<init>", "()V", "link", "Landroid/net/Uri;", "getLink", "()Landroid/net/Uri;", "deferred", "", "getDeferred", "()Z", "Nan", "Success", "Failure", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult$Failure;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult$Nan;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult$Success;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AppsFlyerDeeplinkResult {
    private final boolean deferred;
    private final Uri link;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult$Failure;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "", "deferred", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getDeferred", "()Z", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends AppsFlyerDeeplinkResult {
        private final boolean deferred;

        public Failure(boolean z11) {
            super(null);
            this.deferred = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && this.deferred == ((Failure) other).deferred;
        }

        @Override // ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult
        public boolean getDeferred() {
            return this.deferred;
        }

        public int hashCode() {
            return Boolean.hashCode(this.deferred);
        }

        @NotNull
        public String toString() {
            return C2618u.g("Failure(deferred=", ")", this.deferred);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult$Nan;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "<init>", "()V", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Nan extends AppsFlyerDeeplinkResult {

        @NotNull
        public static final Nan INSTANCE = new Nan();

        private Nan() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult$Success;", "Lru/ozon/app/android/analytics/plugins/af/AppsFlyerDeeplinkResult;", "Landroid/net/Uri;", "link", "", "deferred", "<init>", "(Landroid/net/Uri;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getLink", "()Landroid/net/Uri;", "Z", "getDeferred", "()Z", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Success extends AppsFlyerDeeplinkResult {
        private final boolean deferred;
        private final Uri link;

        public Success(Uri uri, boolean z11) {
            super(null);
            this.link = uri;
            this.deferred = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.link, success.link) && this.deferred == success.deferred;
        }

        @Override // ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult
        public boolean getDeferred() {
            return this.deferred;
        }

        @Override // ru.ozon.app.android.analytics.plugins.af.AppsFlyerDeeplinkResult
        public Uri getLink() {
            return this.link;
        }

        public int hashCode() {
            Uri uri = this.link;
            return Boolean.hashCode(this.deferred) + ((uri == null ? 0 : uri.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "Success(link=" + this.link + ", deferred=" + this.deferred + ")";
        }
    }

    public /* synthetic */ AppsFlyerDeeplinkResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean getDeferred() {
        return this.deferred;
    }

    public Uri getLink() {
        return this.link;
    }

    private AppsFlyerDeeplinkResult() {
    }
}
