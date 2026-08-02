package ru.ozon.app.android.returns.edit.presentation.viewObject;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnImageEditBlockVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "validationText", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "photoState", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getValidationText", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "getPhotoState", "()Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnImageEditBlockVO implements c {
    private final long id;

    @NotNull
    private final ReasonRow photoState;

    @NotNull
    private final TextDTO title;
    private final TextDTO validationText;

    public ReturnImageEditBlockVO(long j11, @NotNull TextDTO title, TextDTO textDTO, @NotNull ReasonRow photoState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(photoState, "photoState");
        this.id = j11;
        this.title = title;
        this.validationText = textDTO;
        this.photoState = photoState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnImageEditBlockVO)) {
            return false;
        }
        ReturnImageEditBlockVO returnImageEditBlockVO = (ReturnImageEditBlockVO) other;
        return this.id == returnImageEditBlockVO.id && Intrinsics.d(this.title, returnImageEditBlockVO.title) && Intrinsics.d(this.validationText, returnImageEditBlockVO.validationText) && Intrinsics.d(this.photoState, returnImageEditBlockVO.photoState);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ReasonRow getPhotoState() {
        return this.photoState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final TextDTO getValidationText() {
        return this.validationText;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.validationText;
        return this.photoState.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.validationText;
        ReasonRow reasonRow = this.photoState;
        StringBuilder b11 = a.b("ReturnImageEditBlockVO(id=", j11, ", title=", textDTO);
        b11.append(", validationText=");
        b11.append(textDTO2);
        b11.append(", photoState=");
        b11.append(reasonRow);
        b11.append(")");
        return b11.toString();
    }
}
