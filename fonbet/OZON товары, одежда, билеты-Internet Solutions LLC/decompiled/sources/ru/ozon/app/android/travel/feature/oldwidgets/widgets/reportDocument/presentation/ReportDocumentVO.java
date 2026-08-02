package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "", "isDateVisible", "isEmailVisible", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "fromDate", "toDate", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", Scopes.EMAIL, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZLru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "Z", "()Z", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "getFromDate", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$DateCommonInputVO;", "getToDate", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "getEmail", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportDocumentVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final CommonInputVO.TextCommonInputVO email;
    private final CommonInputVO.DateCommonInputVO fromDate;
    private final long id;
    private final boolean isDateVisible;
    private final boolean isEmailVisible;

    @NotNull
    private final TextAtom text;

    @NotNull
    private final TextAtom title;
    private final CommonInputVO.DateCommonInputVO toDate;

    public ReportDocumentVO(long j11, @NotNull TextAtom title, @NotNull TextAtom text, boolean z11, boolean z12, CommonInputVO.DateCommonInputVO dateCommonInputVO, CommonInputVO.DateCommonInputVO dateCommonInputVO2, CommonInputVO.TextCommonInputVO textCommonInputVO, @NotNull ButtonV3Atom.LargeButton button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.title = title;
        this.text = text;
        this.isDateVisible = z11;
        this.isEmailVisible = z12;
        this.fromDate = dateCommonInputVO;
        this.toDate = dateCommonInputVO2;
        this.email = textCommonInputVO;
        this.button = button;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final CommonInputVO.TextCommonInputVO getEmail() {
        return this.email;
    }

    public final CommonInputVO.DateCommonInputVO getFromDate() {
        return this.fromDate;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final CommonInputVO.DateCommonInputVO getToDate() {
        return this.toDate;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    /* renamed from: isDateVisible, reason: from getter */
    public final boolean getIsDateVisible() {
        return this.isDateVisible;
    }

    /* renamed from: isEmailVisible, reason: from getter */
    public final boolean getIsEmailVisible() {
        return this.isEmailVisible;
    }
}
