package ru.ozon.app.android.pinlocator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pinlocator/PinLocator;", "", "<init>", "()V", "Placemark", "Courier", "User", "Lru/ozon/app/android/pinlocator/PinLocator$Courier;", "Lru/ozon/app/android/pinlocator/PinLocator$Placemark;", "Lru/ozon/app/android/pinlocator/PinLocator$User;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PinLocator {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pinlocator/PinLocator$Courier;", "Lru/ozon/app/android/pinlocator/PinLocator;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "toString", "equals", "", "other", "", "hashCode", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Courier extends PinLocator {

        @NotNull
        public static final Courier INSTANCE = new Courier();

        @NotNull
        private static final String id = "courierPlacemark";

        private Courier() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Courier);
        }

        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -1474753016;
        }

        @NotNull
        public String toString() {
            return getId();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pinlocator/PinLocator$Placemark;", "Lru/ozon/app/android/pinlocator/PinLocator;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "toString", "equals", "", "other", "", "hashCode", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Placemark extends PinLocator {

        @NotNull
        public static final Placemark INSTANCE = new Placemark();

        @NotNull
        private static final String id = "placemark";

        private Placemark() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Placemark);
        }

        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 437881199;
        }

        @NotNull
        public String toString() {
            return getId();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pinlocator/PinLocator$User;", "Lru/ozon/app/android/pinlocator/PinLocator;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "toString", "equals", "", "other", "", "hashCode", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class User extends PinLocator {

        @NotNull
        public static final User INSTANCE = new User();

        @NotNull
        private static final String id = "userLocationPlacemark";

        private User() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof User);
        }

        @NotNull
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -719494704;
        }

        @NotNull
        public String toString() {
            return getId();
        }
    }

    public /* synthetic */ PinLocator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PinLocator() {
    }
}
