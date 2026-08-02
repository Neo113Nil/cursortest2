package ru.ozon.android.networkinfo.models;

import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/android/networkinfo/models/NetworkInfo;", "", "isConnected", "", "()Z", "NotAvailable", "Unknown", "Available", "Lru/ozon/android/networkinfo/models/NetworkInfo$Available;", "Lru/ozon/android/networkinfo/models/NetworkInfo$NotAvailable;", "Lru/ozon/android/networkinfo/models/NetworkInfo$Unknown;", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NetworkInfo {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/ozon/android/networkinfo/models/NetworkInfo$Available;", "Lru/ozon/android/networkinfo/models/NetworkInfo;", "<init>", "()V", "isValidated", "", "()Z", "capabilities", "Landroid/net/NetworkCapabilities;", "getCapabilities", "()Landroid/net/NetworkCapabilities;", "linkProperties", "Landroid/net/LinkProperties;", "getLinkProperties", "()Landroid/net/LinkProperties;", "networkConnectionType", "Lru/ozon/android/networkinfo/models/NetworkConnectionType;", "getNetworkConnectionType", "()Lru/ozon/android/networkinfo/models/NetworkConnectionType;", "equals", "other", "", "hashCode", "", "toString", "", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Available implements NetworkInfo {
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!getClass().equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.android.networkinfo.models.NetworkInfo.Available");
            Available available = (Available) other;
            return isValidated() == available.isValidated() && getNetworkConnectionType() == available.getNetworkConnectionType();
        }

        @NotNull
        public abstract NetworkCapabilities getCapabilities();

        public abstract LinkProperties getLinkProperties();

        @NotNull
        public abstract NetworkConnectionType getNetworkConnectionType();

        public int hashCode() {
            return getNetworkConnectionType().hashCode() + (Boolean.hashCode(isValidated()) * 31);
        }

        @Override // ru.ozon.android.networkinfo.models.NetworkInfo
        public boolean isConnected() {
            return DefaultImpls.isConnected(this);
        }

        public abstract boolean isValidated();

        @NotNull
        public String toString() {
            return "Available(isValidated=" + isValidated() + ", networkConnectionType=" + getNetworkConnectionType() + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static boolean isConnected(@NotNull NetworkInfo networkInfo) {
            return (networkInfo instanceof Available) && ((Available) networkInfo).isValidated();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/android/networkinfo/models/NetworkInfo$NotAvailable;", "Lru/ozon/android/networkinfo/models/NetworkInfo;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* data */ class NotAvailable implements NetworkInfo {

        @NotNull
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NotAvailable);
        }

        public int hashCode() {
            return -1445234558;
        }

        @Override // ru.ozon.android.networkinfo.models.NetworkInfo
        public boolean isConnected() {
            return DefaultImpls.isConnected(this);
        }

        @NotNull
        public String toString() {
            return "NotAvailable";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/android/networkinfo/models/NetworkInfo$Unknown;", "Lru/ozon/android/networkinfo/models/NetworkInfo;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown implements NetworkInfo {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -1588670082;
        }

        @Override // ru.ozon.android.networkinfo.models.NetworkInfo
        public boolean isConnected() {
            return DefaultImpls.isConnected(this);
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }

    boolean isConnected();
}
