package ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule;

import Ej.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0012\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "", "sku", "", "rating", "Lru/ozon/uni/atoms/data/rating/RatingDTO;", "editErrorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/rating/RatingDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getSku", "()Ljava/lang/String;", "getRating", "()Lru/ozon/uni/atoms/data/rating/RatingDTO;", "getEditErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "formattedLocator", "getFormattedLocator", "updateInfo", "newAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "newTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "newTotal", "", "newNotification", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UgcRatingMolecule {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String RATING_LOCATOR_TAG = "ratingMolecule.ratingAtom";
    private final NotificationDTO editErrorNotification;

    @NotNull
    private final String formattedLocator;

    @NotNull
    private final RatingDTO rating;

    @NotNull
    private final String sku;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule$Companion;", "", "<init>", "()V", "RATING_LOCATOR_TAG", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r2 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UgcRatingMolecule(@NotNull String sku, @NotNull RatingDTO rating, NotificationDTO notificationDTO) {
        String str;
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(rating, "rating");
        this.sku = sku;
        this.rating = rating;
        this.editErrorNotification = notificationDTO;
        Float total = rating.getTotal();
        if (total != null) {
            Integer valueOf = Integer.valueOf((int) total.floatValue());
            valueOf = valueOf.intValue() == 0 ? null : valueOf;
            if (valueOf != null) {
                str = b.a(valueOf.intValue(), "ratingMolecule.ratingAtom_");
            }
        }
        str = RATING_LOCATOR_TAG;
        this.formattedLocator = str;
    }

    public static /* synthetic */ UgcRatingMolecule copy$default(UgcRatingMolecule ugcRatingMolecule, String str, RatingDTO ratingDTO, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ugcRatingMolecule.sku;
        }
        if ((i11 & 2) != 0) {
            ratingDTO = ugcRatingMolecule.rating;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = ugcRatingMolecule.editErrorNotification;
        }
        return ugcRatingMolecule.copy(str, ratingDTO, notificationDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RatingDTO getRating() {
        return this.rating;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getEditErrorNotification() {
        return this.editErrorNotification;
    }

    @NotNull
    public final UgcRatingMolecule copy(@NotNull String sku, @NotNull RatingDTO rating, NotificationDTO editErrorNotification) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(rating, "rating");
        return new UgcRatingMolecule(sku, rating, editErrorNotification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UgcRatingMolecule)) {
            return false;
        }
        UgcRatingMolecule ugcRatingMolecule = (UgcRatingMolecule) other;
        return Intrinsics.d(this.sku, ugcRatingMolecule.sku) && Intrinsics.d(this.rating, ugcRatingMolecule.rating) && Intrinsics.d(this.editErrorNotification, ugcRatingMolecule.editErrorNotification);
    }

    public final NotificationDTO getEditErrorNotification() {
        return this.editErrorNotification;
    }

    @NotNull
    public final String getFormattedLocator() {
        return this.formattedLocator;
    }

    @NotNull
    public final RatingDTO getRating() {
        return this.rating;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int hashCode = (this.rating.hashCode() + (this.sku.hashCode() * 31)) * 31;
        NotificationDTO notificationDTO = this.editErrorNotification;
        return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "UgcRatingMolecule(sku=" + this.sku + ", rating=" + this.rating + ", editErrorNotification=" + this.editErrorNotification + ")";
    }

    @NotNull
    public final UgcRatingMolecule updateInfo(AtomActionDTO newAction, Map<String, TokenizedTrackingInfo> newTrackingInfo, float newTotal, NotificationDTO newNotification) {
        CommonControlSettings common = this.rating.getCommon();
        return copy$default(this, null, RatingDTO.copy$default(this.rating, null, null, common != null ? CommonControlSettings.copy$default(common, newAction, newTrackingInfo, null, 4, null) : null, null, Float.valueOf(newTotal), null, null, 107, null), newNotification, 1, null);
    }
}
