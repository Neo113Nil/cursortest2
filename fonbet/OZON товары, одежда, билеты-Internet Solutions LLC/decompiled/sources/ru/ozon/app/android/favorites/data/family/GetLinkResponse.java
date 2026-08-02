package ru.ozon.app.android.favorites.data.family;

import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/data/family/GetLinkResponse;", "", "link", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getLink", "()Ljava/lang/String;", "getTitle", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetLinkResponse {
    private final String link;
    private final NotificationDTO notificationBar;
    private final String title;

    public GetLinkResponse(String str, String str2, NotificationDTO notificationDTO) {
        this.link = str;
        this.title = str2;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ GetLinkResponse copy$default(GetLinkResponse getLinkResponse, String str, String str2, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getLinkResponse.link;
        }
        if ((i11 & 2) != 0) {
            str2 = getLinkResponse.title;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = getLinkResponse.notificationBar;
        }
        return getLinkResponse.copy(str, str2, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final GetLinkResponse copy(String link, String title, NotificationDTO notificationBar) {
        return new GetLinkResponse(link, title, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLinkResponse)) {
            return false;
        }
        GetLinkResponse getLinkResponse = (GetLinkResponse) other;
        return Intrinsics.d(this.link, getLinkResponse.link) && Intrinsics.d(this.title, getLinkResponse.title) && Intrinsics.d(this.notificationBar, getLinkResponse.notificationBar);
    }

    public final String getLink() {
        return this.link;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.link;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.link;
        String str2 = this.title;
        NotificationDTO notificationDTO = this.notificationBar;
        StringBuilder d11 = C3660k.d("GetLinkResponse(link=", str, ", title=", str2, ", notificationBar=");
        d11.append(notificationDTO);
        d11.append(")");
        return d11.toString();
    }
}
