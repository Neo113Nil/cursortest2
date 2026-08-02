package ru.ozon.id.nativeauth.pageNotification.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/pageNotification/data/PageNotificationDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "logoUrl", "button", "Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getLogoUrl", "getButton", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageNotificationDTO {
    private final EntryDTO.EntryButtonDTO button;
    private final String logoUrl;
    private final OzonSpannableString subtitle;

    @NotNull
    private final String title;

    public PageNotificationDTO(@NotNull String title, OzonSpannableString ozonSpannableString, String str, EntryDTO.EntryButtonDTO entryButtonDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.logoUrl = str;
        this.button = entryButtonDTO;
    }

    public static /* synthetic */ PageNotificationDTO copy$default(PageNotificationDTO pageNotificationDTO, String str, OzonSpannableString ozonSpannableString, String str2, EntryDTO.EntryButtonDTO entryButtonDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pageNotificationDTO.title;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString = pageNotificationDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str2 = pageNotificationDTO.logoUrl;
        }
        if ((i11 & 8) != 0) {
            entryButtonDTO = pageNotificationDTO.button;
        }
        return pageNotificationDTO.copy(str, ozonSpannableString, str2, entryButtonDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final EntryDTO.EntryButtonDTO getButton() {
        return this.button;
    }

    @NotNull
    public final PageNotificationDTO copy(@NotNull String title, OzonSpannableString subtitle, String logoUrl, EntryDTO.EntryButtonDTO button) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new PageNotificationDTO(title, subtitle, logoUrl, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageNotificationDTO)) {
            return false;
        }
        PageNotificationDTO pageNotificationDTO = (PageNotificationDTO) other;
        return Intrinsics.d(this.title, pageNotificationDTO.title) && Intrinsics.d(this.subtitle, pageNotificationDTO.subtitle) && Intrinsics.d(this.logoUrl, pageNotificationDTO.logoUrl) && Intrinsics.d(this.button, pageNotificationDTO.button);
    }

    public final EntryDTO.EntryButtonDTO getButton() {
        return this.button;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str = this.logoUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EntryDTO.EntryButtonDTO entryButtonDTO = this.button;
        return hashCode3 + (entryButtonDTO != null ? entryButtonDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        OzonSpannableString ozonSpannableString = this.subtitle;
        return "PageNotificationDTO(title=" + str + ", subtitle=" + ((Object) ozonSpannableString) + ", logoUrl=" + this.logoUrl + ", button=" + this.button + ")";
    }
}
