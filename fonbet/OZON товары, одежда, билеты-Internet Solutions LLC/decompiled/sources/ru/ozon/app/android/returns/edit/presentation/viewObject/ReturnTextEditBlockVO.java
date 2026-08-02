package ru.ozon.app.android.returns.edit.presentation.viewObject;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnTextEditBlockVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "", "validationText", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnTextEditBlockVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "getTextArea", "()Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "Ljava/lang/String;", "getValidationText", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnTextEditBlockVO implements c {

    @NotNull
    private final AtomActionDTO action;
    private final long id;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final RmsTextAreaDto textArea;

    @NotNull
    private final TextDTO title;
    private final String validationText;

    public ReturnTextEditBlockVO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull RmsTextAreaDto textArea, String str, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.textArea = textArea;
        this.validationText = str;
        this.action = action;
    }

    public static /* synthetic */ ReturnTextEditBlockVO copy$default(ReturnTextEditBlockVO returnTextEditBlockVO, long j11, TextDTO textDTO, TextDTO textDTO2, RmsTextAreaDto rmsTextAreaDto, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = returnTextEditBlockVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = returnTextEditBlockVO.title;
        }
        TextDTO textDTO3 = textDTO;
        if ((i11 & 4) != 0) {
            textDTO2 = returnTextEditBlockVO.subtitle;
        }
        TextDTO textDTO4 = textDTO2;
        if ((i11 & 8) != 0) {
            rmsTextAreaDto = returnTextEditBlockVO.textArea;
        }
        RmsTextAreaDto rmsTextAreaDto2 = rmsTextAreaDto;
        if ((i11 & 16) != 0) {
            str = returnTextEditBlockVO.validationText;
        }
        String str2 = str;
        if ((i11 & 32) != 0) {
            atomActionDTO = returnTextEditBlockVO.action;
        }
        return returnTextEditBlockVO.copy(j12, textDTO3, textDTO4, rmsTextAreaDto2, str2, atomActionDTO);
    }

    @NotNull
    public final ReturnTextEditBlockVO copy(long id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull RmsTextAreaDto textArea, String validationText, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ReturnTextEditBlockVO(id2, title, subtitle, textArea, validationText, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnTextEditBlockVO)) {
            return false;
        }
        ReturnTextEditBlockVO returnTextEditBlockVO = (ReturnTextEditBlockVO) other;
        return this.id == returnTextEditBlockVO.id && Intrinsics.d(this.title, returnTextEditBlockVO.title) && Intrinsics.d(this.subtitle, returnTextEditBlockVO.subtitle) && Intrinsics.d(this.textArea, returnTextEditBlockVO.textArea) && Intrinsics.d(this.validationText, returnTextEditBlockVO.validationText) && Intrinsics.d(this.action, returnTextEditBlockVO.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
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
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final RmsTextAreaDto getTextArea() {
        return this.textArea;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final String getValidationText() {
        return this.validationText;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.textArea.hashCode() + b.a(this.subtitle, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31)) * 31;
        String str = this.validationText;
        return this.action.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        RmsTextAreaDto rmsTextAreaDto = this.textArea;
        String str = this.validationText;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder b11 = a.b("ReturnTextEditBlockVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", textArea=");
        b11.append(rmsTextAreaDto);
        b11.append(", validationText=");
        b11.append(str);
        b11.append(", action=");
        b11.append(atomActionDTO);
        b11.append(")");
        return b11.toString();
    }
}
