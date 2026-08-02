package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem;

import G.g;
import Tl.b;
import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "", "", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "reasons", "", "backgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "validationText", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "copy", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getReasons", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getValidationText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NestedReasons {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<ReasonRow> reasons;
    private final TextDTO validationText;

    /* JADX WARN: Multi-variable type inference failed */
    public NestedReasons(@NotNull List<? extends ReasonRow> reasons, @NotNull String backgroundColor, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.reasons = reasons;
        this.backgroundColor = backgroundColor;
        this.validationText = textDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestedReasons copy$default(NestedReasons nestedReasons, List list, String str, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = nestedReasons.reasons;
        }
        if ((i11 & 2) != 0) {
            str = nestedReasons.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            textDTO = nestedReasons.validationText;
        }
        return nestedReasons.copy(list, str, textDTO);
    }

    @NotNull
    public final NestedReasons copy(@NotNull List<? extends ReasonRow> reasons, @NotNull String backgroundColor, TextDTO validationText) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new NestedReasons(reasons, backgroundColor, validationText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NestedReasons)) {
            return false;
        }
        NestedReasons nestedReasons = (NestedReasons) other;
        return Intrinsics.d(this.reasons, nestedReasons.reasons) && Intrinsics.d(this.backgroundColor, nestedReasons.backgroundColor) && Intrinsics.d(this.validationText, nestedReasons.validationText);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ReasonRow> getReasons() {
        return this.reasons;
    }

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    public int hashCode() {
        int a11 = g.a(this.reasons.hashCode() * 31, 31, this.backgroundColor);
        TextDTO textDTO = this.validationText;
        return a11 + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        List<ReasonRow> list = this.reasons;
        String str = this.backgroundColor;
        return b.e(C4055a.a("NestedReasons(reasons=", ", backgroundColor=", str, ", validationText=", list), this.validationText, ")");
    }
}
