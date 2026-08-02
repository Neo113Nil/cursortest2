package ru.ozon.app.android.favorites.wishlistMultiselect.data;

import Ak.C2436a;
import B0.C2454a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO;", "", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "limit", "", "subtextParts", "Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;", "notificationWarning", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ILru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLimit", "()I", "getSubtextParts", "()Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;", "getNotificationWarning", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "SubtextParts", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WishlistMultiselectDTO {
    private final int limit;
    private final NotificationModelWrapper notificationWarning;

    @NotNull
    private final ButtonV3DTO submitButton;

    @NotNull
    private final SubtextParts subtextParts;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;", "", "selectWords", "", "", "productWords", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSelectWords", "()Ljava/util/List;", "getProductWords", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubtextParts {
        private final List<String> productWords;
        private final List<String> selectWords;

        public SubtextParts(List<String> list, List<String> list2) {
            this.selectWords = list;
            this.productWords = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubtextParts copy$default(SubtextParts subtextParts, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = subtextParts.selectWords;
            }
            if ((i11 & 2) != 0) {
                list2 = subtextParts.productWords;
            }
            return subtextParts.copy(list, list2);
        }

        public final List<String> component1() {
            return this.selectWords;
        }

        public final List<String> component2() {
            return this.productWords;
        }

        @NotNull
        public final SubtextParts copy(List<String> selectWords, List<String> productWords) {
            return new SubtextParts(selectWords, productWords);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubtextParts)) {
                return false;
            }
            SubtextParts subtextParts = (SubtextParts) other;
            return Intrinsics.d(this.selectWords, subtextParts.selectWords) && Intrinsics.d(this.productWords, subtextParts.productWords);
        }

        public final List<String> getProductWords() {
            return this.productWords;
        }

        public final List<String> getSelectWords() {
            return this.selectWords;
        }

        public int hashCode() {
            List<String> list = this.selectWords;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.productWords;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return C2436a.b("SubtextParts(selectWords=", this.selectWords, ", productWords=", ")", this.productWords);
        }
    }

    public WishlistMultiselectDTO(@NotNull ButtonV3DTO submitButton, int i11, @NotNull SubtextParts subtextParts, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @ProtoOneOf(label = "type") NotificationModelWrapper notificationModelWrapper) {
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(subtextParts, "subtextParts");
        this.submitButton = submitButton;
        this.limit = i11;
        this.subtextParts = subtextParts;
        this.notificationWarning = notificationModelWrapper;
    }

    public static /* synthetic */ WishlistMultiselectDTO copy$default(WishlistMultiselectDTO wishlistMultiselectDTO, ButtonV3DTO buttonV3DTO, int i11, SubtextParts subtextParts, NotificationModelWrapper notificationModelWrapper, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            buttonV3DTO = wishlistMultiselectDTO.submitButton;
        }
        if ((i12 & 2) != 0) {
            i11 = wishlistMultiselectDTO.limit;
        }
        if ((i12 & 4) != 0) {
            subtextParts = wishlistMultiselectDTO.subtextParts;
        }
        if ((i12 & 8) != 0) {
            notificationModelWrapper = wishlistMultiselectDTO.notificationWarning;
        }
        return wishlistMultiselectDTO.copy(buttonV3DTO, i11, subtextParts, notificationModelWrapper);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SubtextParts getSubtextParts() {
        return this.subtextParts;
    }

    /* renamed from: component4, reason: from getter */
    public final NotificationModelWrapper getNotificationWarning() {
        return this.notificationWarning;
    }

    @NotNull
    public final WishlistMultiselectDTO copy(@NotNull ButtonV3DTO submitButton, int limit, @NotNull SubtextParts subtextParts, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "notification", type = NotificationAtom.Notification.class), @ProtoOneOfSignature(name = "notificationWithIcon", type = NotificationAtom.NotificationWithIcon.class), @ProtoOneOfSignature(name = "notificationBar", type = NotificationDTO.class)}) @ProtoOneOf(label = "type") NotificationModelWrapper notificationWarning) {
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(subtextParts, "subtextParts");
        return new WishlistMultiselectDTO(submitButton, limit, subtextParts, notificationWarning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WishlistMultiselectDTO)) {
            return false;
        }
        WishlistMultiselectDTO wishlistMultiselectDTO = (WishlistMultiselectDTO) other;
        return Intrinsics.d(this.submitButton, wishlistMultiselectDTO.submitButton) && this.limit == wishlistMultiselectDTO.limit && Intrinsics.d(this.subtextParts, wishlistMultiselectDTO.subtextParts) && Intrinsics.d(this.notificationWarning, wishlistMultiselectDTO.notificationWarning);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final NotificationModelWrapper getNotificationWarning() {
        return this.notificationWarning;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final SubtextParts getSubtextParts() {
        return this.subtextParts;
    }

    public int hashCode() {
        int hashCode = (this.subtextParts.hashCode() + C2454a.a(this.limit, this.submitButton.hashCode() * 31, 31)) * 31;
        NotificationModelWrapper notificationModelWrapper = this.notificationWarning;
        return hashCode + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode());
    }

    @NotNull
    public String toString() {
        return "WishlistMultiselectDTO(submitButton=" + this.submitButton + ", limit=" + this.limit + ", subtextParts=" + this.subtextParts + ", notificationWarning=" + this.notificationWarning + ")";
    }
}
