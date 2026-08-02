package ru.ozon.app.android.deliveryreview.deliveryReviewSuccess.data;

import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewSuccess/data/DeliveryReviewSuccessDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "image", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImage", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryReviewSuccessDTO {

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final String image;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public DeliveryReviewSuccessDTO(@NotNull String title, @NotNull String subtitle, String str, @NotNull ButtonV3Atom.LargeButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        this.title = title;
        this.subtitle = subtitle;
        this.image = str;
        this.button = button;
    }

    public static /* synthetic */ DeliveryReviewSuccessDTO copy$default(DeliveryReviewSuccessDTO deliveryReviewSuccessDTO, String str, String str2, String str3, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deliveryReviewSuccessDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = deliveryReviewSuccessDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = deliveryReviewSuccessDTO.image;
        }
        if ((i11 & 8) != 0) {
            largeButton = deliveryReviewSuccessDTO.button;
        }
        return deliveryReviewSuccessDTO.copy(str, str2, str3, largeButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    public final DeliveryReviewSuccessDTO copy(@NotNull String title, @NotNull String subtitle, String image, @NotNull ButtonV3Atom.LargeButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(button, "button");
        return new DeliveryReviewSuccessDTO(title, subtitle, image, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReviewSuccessDTO)) {
            return false;
        }
        DeliveryReviewSuccessDTO deliveryReviewSuccessDTO = (DeliveryReviewSuccessDTO) other;
        return Intrinsics.d(this.title, deliveryReviewSuccessDTO.title) && Intrinsics.d(this.subtitle, deliveryReviewSuccessDTO.subtitle) && Intrinsics.d(this.image, deliveryReviewSuccessDTO.image) && Intrinsics.d(this.button, deliveryReviewSuccessDTO.button);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.image;
        return this.button.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.image;
        ButtonV3Atom.LargeButton largeButton = this.button;
        StringBuilder d11 = C3660k.d("DeliveryReviewSuccessDTO(title=", str, ", subtitle=", str2, ", image=");
        d11.append(str3);
        d11.append(", button=");
        d11.append(largeButton);
        d11.append(")");
        return d11.toString();
    }
}
