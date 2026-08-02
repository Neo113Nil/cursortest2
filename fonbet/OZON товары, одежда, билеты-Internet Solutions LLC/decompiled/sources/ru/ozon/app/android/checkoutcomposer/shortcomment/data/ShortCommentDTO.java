package ru.ozon.app.android.checkoutcomposer.shortcomment.data;

import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/shortcomment/data/ShortCommentDTO;", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "image", "", "imageRight", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getImage", "()Ljava/lang/String;", "getImageRight", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShortCommentDTO {
    public static final int $stable = OzonSpannableString.$stable;

    @NotNull
    private final AtomActionDTO action;
    private final String image;
    private final String imageRight;

    @NotNull
    private final OzonSpannableString text;

    public ShortCommentDTO(@NotNull OzonSpannableString text, String str, String str2, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.text = text;
        this.image = str;
        this.imageRight = str2;
        this.action = action;
    }

    public static /* synthetic */ ShortCommentDTO copy$default(ShortCommentDTO shortCommentDTO, OzonSpannableString ozonSpannableString, String str, String str2, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = shortCommentDTO.text;
        }
        if ((i11 & 2) != 0) {
            str = shortCommentDTO.image;
        }
        if ((i11 & 4) != 0) {
            str2 = shortCommentDTO.imageRight;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = shortCommentDTO.action;
        }
        return shortCommentDTO.copy(ozonSpannableString, str, str2, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageRight() {
        return this.imageRight;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ShortCommentDTO copy(@NotNull OzonSpannableString text, String image, String imageRight, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ShortCommentDTO(text, image, imageRight, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortCommentDTO)) {
            return false;
        }
        ShortCommentDTO shortCommentDTO = (ShortCommentDTO) other;
        return Intrinsics.d(this.text, shortCommentDTO.text) && Intrinsics.d(this.image, shortCommentDTO.image) && Intrinsics.d(this.imageRight, shortCommentDTO.imageRight) && Intrinsics.d(this.action, shortCommentDTO.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageRight() {
        return this.imageRight;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.image;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageRight;
        return this.action.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.image;
        String str2 = this.imageRight;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder f7 = b.f("ShortCommentDTO(text=", ozonSpannableString, ", image=", str, ", imageRight=");
        f7.append(str2);
        f7.append(", action=");
        f7.append(atomActionDTO);
        f7.append(")");
        return f7.toString();
    }
}
