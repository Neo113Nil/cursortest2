package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model;

import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notification", "", "", "notificationPayloads", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getMolecule", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "Ljava/util/Map;", "getNotificationPayloads", "()Ljava/util/Map;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteChangeResponse {

    @NotNull
    private final FavoriteProductMolecule molecule;
    private final NotificationModelWrapper notification;
    private final Map<String, String> notificationPayloads;

    public FavoriteChangeResponse(@NotNull FavoriteProductMolecule molecule, NotificationModelWrapper notificationModelWrapper, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        this.molecule = molecule;
        this.notification = notificationModelWrapper;
        this.notificationPayloads = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteChangeResponse)) {
            return false;
        }
        FavoriteChangeResponse favoriteChangeResponse = (FavoriteChangeResponse) other;
        return Intrinsics.d(this.molecule, favoriteChangeResponse.molecule) && Intrinsics.d(this.notification, favoriteChangeResponse.notification) && Intrinsics.d(this.notificationPayloads, favoriteChangeResponse.notificationPayloads);
    }

    @NotNull
    public final FavoriteProductMolecule getMolecule() {
        return this.molecule;
    }

    public final NotificationModelWrapper getNotification() {
        return this.notification;
    }

    public final Map<String, String> getNotificationPayloads() {
        return this.notificationPayloads;
    }

    public int hashCode() {
        int hashCode = this.molecule.hashCode() * 31;
        NotificationModelWrapper notificationModelWrapper = this.notification;
        int hashCode2 = (hashCode + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode())) * 31;
        Map<String, String> map = this.notificationPayloads;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        FavoriteProductMolecule favoriteProductMolecule = this.molecule;
        NotificationModelWrapper notificationModelWrapper = this.notification;
        Map<String, String> map = this.notificationPayloads;
        StringBuilder sb2 = new StringBuilder("FavoriteChangeResponse(molecule=");
        sb2.append(favoriteProductMolecule);
        sb2.append(", notification=");
        sb2.append(notificationModelWrapper);
        sb2.append(", notificationPayloads=");
        return P.f(sb2, map, ")");
    }
}
