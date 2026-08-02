package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation;

import B0.A0;
import Nh.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;", "", "<init>", "()V", "Refresh", "Navigate", "Pay", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect$Navigate;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect$Pay;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect$Refresh;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TipsCourierReviewViewEffect {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect$Navigate;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;", "", "link", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Navigate extends TipsCourierReviewViewEffect {

        @NotNull
        private final String link;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Navigate(@NotNull String link) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Navigate) && Intrinsics.d(this.link, ((Navigate) other).link);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Navigate(link=", this.link, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect$Pay;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;", "", "link", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pay extends TipsCourierReviewViewEffect {

        @NotNull
        private final String link;

        @NotNull
        private final Map<String, String> params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pay(@NotNull String link, @NotNull Map<String, String> params) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(params, "params");
            this.link = link;
            this.params = params;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pay)) {
                return false;
            }
            Pay pay = (Pay) other;
            return Intrinsics.d(this.link, pay.link) && Intrinsics.d(this.params, pay.params);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final Map<String, String> getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode() + (this.link.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("Pay(link=", this.link, ", params=", ")", this.params);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect$Refresh;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/TipsCourierReviewViewEffect;", "", "link", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Refresh extends TipsCourierReviewViewEffect {

        @NotNull
        private final String link;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Refresh(@NotNull String link) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Refresh) && Intrinsics.d(this.link, ((Refresh) other).link);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Refresh(link=", this.link, ")");
        }
    }

    public /* synthetic */ TipsCourierReviewViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TipsCourierReviewViewEffect() {
    }
}
