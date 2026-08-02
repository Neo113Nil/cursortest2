package ru.ozon.app.android.composer.navigator.redirect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy;", "", "Navigate", "Refresh", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Navigate;", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Refresh;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface RedirectStrategy {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Navigate;", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Navigate implements RedirectStrategy {

        @NotNull
        public static final Navigate INSTANCE = new Navigate();

        private Navigate() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Navigate);
        }

        public int hashCode() {
            return 586031966;
        }

        @NotNull
        public String toString() {
            return "Navigate";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy$Refresh;", "Lru/ozon/app/android/composer/navigator/redirect/RedirectStrategy;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Refresh implements RedirectStrategy {

        @NotNull
        public static final Refresh INSTANCE = new Refresh();

        private Refresh() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Refresh);
        }

        public int hashCode() {
            return 759432014;
        }

        @NotNull
        public String toString() {
            return "Refresh";
        }
    }
}
