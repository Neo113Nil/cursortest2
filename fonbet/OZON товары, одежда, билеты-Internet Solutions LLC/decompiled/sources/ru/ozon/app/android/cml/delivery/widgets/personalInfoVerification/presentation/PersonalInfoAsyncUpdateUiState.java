package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState;", "", "Error", "Loaded", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState$Error;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState$Loaded;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PersonalInfoAsyncUpdateUiState {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState$Error;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements PersonalInfoAsyncUpdateUiState {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -170067145;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState$Loaded;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationUpdate;", "update", "", "", "trackingPayloads", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationUpdate;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationUpdate;", "getUpdate", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationUpdate;", "Ljava/util/Map;", "getTrackingPayloads", "()Ljava/util/Map;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loaded implements PersonalInfoAsyncUpdateUiState {
        private final Map<String, String> trackingPayloads;

        @NotNull
        private final PersonalInfoVerificationUpdate update;

        public Loaded(@NotNull PersonalInfoVerificationUpdate update, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(update, "update");
            this.update = update;
            this.trackingPayloads = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.d(this.update, loaded.update) && Intrinsics.d(this.trackingPayloads, loaded.trackingPayloads);
        }

        public final Map<String, String> getTrackingPayloads() {
            return this.trackingPayloads;
        }

        @NotNull
        public final PersonalInfoVerificationUpdate getUpdate() {
            return this.update;
        }

        public int hashCode() {
            int hashCode = this.update.hashCode() * 31;
            Map<String, String> map = this.trackingPayloads;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "Loaded(update=" + this.update + ", trackingPayloads=" + this.trackingPayloads + ")";
        }
    }
}
