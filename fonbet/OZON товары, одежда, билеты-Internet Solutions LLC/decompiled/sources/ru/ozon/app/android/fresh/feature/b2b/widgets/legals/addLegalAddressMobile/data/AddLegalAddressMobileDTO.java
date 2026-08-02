package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data;

import Bl.b;
import G.g;
import Ih.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/AddLegalAddressMobileDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", HammersV3BodyDTO.PLACEHOLDER, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "errorMessage", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPlaceholder", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getErrorMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddLegalAddressMobileDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final TextAtom errorMessage;

    @NotNull
    private final String placeholder;

    @NotNull
    private final TextAtom title;

    public AddLegalAddressMobileDTO(@NotNull TextAtom title, @NotNull String placeholder, @NotNull AtomActionDTO action, @NotNull TextAtom errorMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.title = title;
        this.placeholder = placeholder;
        this.action = action;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ AddLegalAddressMobileDTO copy$default(AddLegalAddressMobileDTO addLegalAddressMobileDTO, TextAtom textAtom, String str, AtomActionDTO atomActionDTO, TextAtom textAtom2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = addLegalAddressMobileDTO.title;
        }
        if ((i11 & 2) != 0) {
            str = addLegalAddressMobileDTO.placeholder;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = addLegalAddressMobileDTO.action;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = addLegalAddressMobileDTO.errorMessage;
        }
        return addLegalAddressMobileDTO.copy(textAtom, str, atomActionDTO, textAtom2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextAtom getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final AddLegalAddressMobileDTO copy(@NotNull TextAtom title, @NotNull String placeholder, @NotNull AtomActionDTO action, @NotNull TextAtom errorMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new AddLegalAddressMobileDTO(title, placeholder, action, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddLegalAddressMobileDTO)) {
            return false;
        }
        AddLegalAddressMobileDTO addLegalAddressMobileDTO = (AddLegalAddressMobileDTO) other;
        return Intrinsics.d(this.title, addLegalAddressMobileDTO.title) && Intrinsics.d(this.placeholder, addLegalAddressMobileDTO.placeholder) && Intrinsics.d(this.action, addLegalAddressMobileDTO.action) && Intrinsics.d(this.errorMessage, addLegalAddressMobileDTO.errorMessage);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TextAtom getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + a.b(this.action, g.a(this.title.hashCode() * 31, 31, this.placeholder), 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        String str = this.placeholder;
        AtomActionDTO atomActionDTO = this.action;
        TextAtom textAtom2 = this.errorMessage;
        StringBuilder d11 = b.d("AddLegalAddressMobileDTO(title=", ", placeholder=", str, ", action=", textAtom);
        d11.append(atomActionDTO);
        d11.append(", errorMessage=");
        d11.append(textAtom2);
        d11.append(")");
        return d11.toString();
    }
}
