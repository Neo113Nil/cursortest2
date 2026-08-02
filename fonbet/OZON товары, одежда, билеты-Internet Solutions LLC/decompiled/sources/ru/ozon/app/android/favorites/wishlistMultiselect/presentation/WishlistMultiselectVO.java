package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import B0.C2454a;
import De.C2859b;
import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.wishlistMultiselect.data.WishlistMultiselectDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/presentation/WishlistMultiselectVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "", "limit", "Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;", "subtextParts", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "notificationWarning", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ILru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "I", "getLimit", "Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;", "getSubtextParts", "()Lru/ozon/app/android/favorites/wishlistMultiselect/data/WishlistMultiselectDTO$SubtextParts;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "getNotificationWarning", "()Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WishlistMultiselectVO implements c {
    private final long id;
    private final int limit;
    private final NotificationModelWrapper notificationWarning;

    @NotNull
    private final ButtonV3DTO submitButton;

    @NotNull
    private final WishlistMultiselectDTO.SubtextParts subtextParts;

    public WishlistMultiselectVO(long j11, @NotNull ButtonV3DTO submitButton, int i11, @NotNull WishlistMultiselectDTO.SubtextParts subtextParts, NotificationModelWrapper notificationModelWrapper) {
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(subtextParts, "subtextParts");
        this.id = j11;
        this.submitButton = submitButton;
        this.limit = i11;
        this.subtextParts = subtextParts;
        this.notificationWarning = notificationModelWrapper;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WishlistMultiselectVO)) {
            return false;
        }
        WishlistMultiselectVO wishlistMultiselectVO = (WishlistMultiselectVO) other;
        return this.id == wishlistMultiselectVO.id && Intrinsics.d(this.submitButton, wishlistMultiselectVO.submitButton) && this.limit == wishlistMultiselectVO.limit && Intrinsics.d(this.subtextParts, wishlistMultiselectVO.subtextParts) && Intrinsics.d(this.notificationWarning, wishlistMultiselectVO.notificationWarning);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final NotificationModelWrapper getNotificationWarning() {
        return this.notificationWarning;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final WishlistMultiselectDTO.SubtextParts getSubtextParts() {
        return this.subtextParts;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.subtextParts.hashCode() + C2454a.a(this.limit, C2859b.c(this.submitButton, Long.hashCode(this.id) * 31, 31), 31)) * 31;
        NotificationModelWrapper notificationModelWrapper = this.notificationWarning;
        return hashCode + (notificationModelWrapper == null ? 0 : notificationModelWrapper.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        int i11 = this.limit;
        WishlistMultiselectDTO.SubtextParts subtextParts = this.subtextParts;
        NotificationModelWrapper notificationModelWrapper = this.notificationWarning;
        StringBuilder c11 = G.c("WishlistMultiselectVO(id=", j11, ", submitButton=", buttonV3DTO);
        c11.append(", limit=");
        c11.append(i11);
        c11.append(", subtextParts=");
        c11.append(subtextParts);
        c11.append(", notificationWarning=");
        c11.append(notificationModelWrapper);
        c11.append(")");
        return c11.toString();
    }
}
