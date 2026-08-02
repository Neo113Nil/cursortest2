package ru.ozon.app.android.travel.molecules.dto.errorState;

import G.g;
import GR.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/errorState/ErrorStateDTO;", "", "message", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "image", "buttons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMessage", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Ljava/lang/String;", "getImage", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ErrorStateDTO {
    private final List<AtomDTO> buttons;
    private final String image;
    private final OzonSpannableString message;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorStateDTO(OzonSpannableString ozonSpannableString, @NotNull String title, String str, List<? extends AtomDTO> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.message = ozonSpannableString;
        this.title = title;
        this.image = str;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorStateDTO copy$default(ErrorStateDTO errorStateDTO, OzonSpannableString ozonSpannableString, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = errorStateDTO.message;
        }
        if ((i11 & 2) != 0) {
            str = errorStateDTO.title;
        }
        if ((i11 & 4) != 0) {
            str2 = errorStateDTO.image;
        }
        if ((i11 & 8) != 0) {
            list = errorStateDTO.buttons;
        }
        return errorStateDTO.copy(ozonSpannableString, str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<AtomDTO> component4() {
        return this.buttons;
    }

    @NotNull
    public final ErrorStateDTO copy(OzonSpannableString message, @NotNull String title, String image, List<? extends AtomDTO> buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ErrorStateDTO(message, title, image, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorStateDTO)) {
            return false;
        }
        ErrorStateDTO errorStateDTO = (ErrorStateDTO) other;
        return Intrinsics.d(this.message, errorStateDTO.message) && Intrinsics.d(this.title, errorStateDTO.title) && Intrinsics.d(this.image, errorStateDTO.image) && Intrinsics.d(this.buttons, errorStateDTO.buttons);
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    public final String getImage() {
        return this.image;
    }

    public final OzonSpannableString getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        OzonSpannableString ozonSpannableString = this.message;
        int a11 = g.a((ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31, 31, this.title);
        String str = this.image;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<AtomDTO> list = this.buttons;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.message;
        String str = this.title;
        String str2 = this.image;
        List<AtomDTO> list = this.buttons;
        StringBuilder f7 = b.f("ErrorStateDTO(message=", ozonSpannableString, ", title=", str, ", image=");
        f7.append(str2);
        f7.append(", buttons=");
        f7.append(list);
        f7.append(")");
        return f7.toString();
    }
}
