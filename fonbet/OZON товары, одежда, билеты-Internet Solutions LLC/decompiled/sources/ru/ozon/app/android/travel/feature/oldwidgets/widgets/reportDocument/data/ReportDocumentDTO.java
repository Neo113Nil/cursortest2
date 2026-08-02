package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data;

import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "fromDate", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "toDate", Scopes.EMAIL, "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "getFromDate", "()Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "getToDate", "getEmail", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportDocumentDTO {

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final CommonInputDTO email;
    private final CommonInputDTO fromDate;

    @NotNull
    private final TextAtom text;

    @NotNull
    private final TextAtom title;
    private final CommonInputDTO toDate;

    public ReportDocumentDTO(@NotNull TextAtom title, @NotNull TextAtom text, CommonInputDTO commonInputDTO, CommonInputDTO commonInputDTO2, CommonInputDTO commonInputDTO3, @NotNull ButtonV3Atom.LargeButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(button, "button");
        this.title = title;
        this.text = text;
        this.fromDate = commonInputDTO;
        this.toDate = commonInputDTO2;
        this.email = commonInputDTO3;
        this.button = button;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final CommonInputDTO getEmail() {
        return this.email;
    }

    public final CommonInputDTO getFromDate() {
        return this.fromDate;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final CommonInputDTO getToDate() {
        return this.toDate;
    }
}
