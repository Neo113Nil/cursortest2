package ru.ozon.app.android.travel.molecules.view.errorState;

import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\rR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "", "", "message", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getMessage", "()Ljava/lang/CharSequence;", "Ljava/lang/String;", "getTitle", "getImage", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ErrorStateVO {
    private final List<AtomDTO> buttons;
    private final String image;
    private final CharSequence message;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorStateVO(CharSequence charSequence, @NotNull String title, String str, List<? extends AtomDTO> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.message = charSequence;
        this.title = title;
        this.image = str;
        this.buttons = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorStateVO)) {
            return false;
        }
        ErrorStateVO errorStateVO = (ErrorStateVO) other;
        return Intrinsics.d(this.message, errorStateVO.message) && Intrinsics.d(this.title, errorStateVO.title) && Intrinsics.d(this.image, errorStateVO.image) && Intrinsics.d(this.buttons, errorStateVO.buttons);
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    public final String getImage() {
        return this.image;
    }

    public final CharSequence getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.message;
        int a11 = g.a((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.title);
        String str = this.image;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<AtomDTO> list = this.buttons;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CharSequence charSequence = this.message;
        return "ErrorStateVO(message=" + ((Object) charSequence) + ", title=" + this.title + ", image=" + this.image + ", buttons=" + this.buttons + ")";
    }
}
