package ru.ozon.app.android.account.orders.emptyscreen.fintech.data;

import B90.C2616s;
import Ns.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/fintech/data/OfflineFintechBannerDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OfflineFintechBannerDTO {
    public static final int $stable = 0;

    @i(name = "image")
    @NotNull
    private final ImageDTO image;

    @i(name = "subtitle")
    @NotNull
    private final TextDTO subtitle;

    @i(name = SelectionItemFormDTO.TITLE_FIELD_NAME)
    @NotNull
    private final TextDTO title;

    public OfflineFintechBannerDTO(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }

    public static /* synthetic */ OfflineFintechBannerDTO copy$default(OfflineFintechBannerDTO offlineFintechBannerDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = offlineFintechBannerDTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = offlineFintechBannerDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = offlineFintechBannerDTO.subtitle;
        }
        return offlineFintechBannerDTO.copy(imageDTO, textDTO, textDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final OfflineFintechBannerDTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new OfflineFintechBannerDTO(image, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineFintechBannerDTO)) {
            return false;
        }
        OfflineFintechBannerDTO offlineFintechBannerDTO = (OfflineFintechBannerDTO) other;
        return Intrinsics.d(this.image, offlineFintechBannerDTO.image) && Intrinsics.d(this.title, offlineFintechBannerDTO.title) && Intrinsics.d(this.subtitle, offlineFintechBannerDTO.subtitle);
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + b.a(this.title, this.image.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        return Tl.b.e(C2616s.d("OfflineFintechBannerDTO(image=", imageDTO, ", title=", textDTO, ", subtitle="), this.subtitle, ")");
    }
}
