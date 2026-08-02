package ru.ozon.app.android.returns.creation.widgets.textAreaButton.viewObject;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.viewObject.RmsTextAreaV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/textAreaButton/viewObject/ReturnTextAreaButtonVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/viewObject/RmsTextAreaV2VO;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLru/ozon/app/android/returns/ui/molecules/textarea/v2/viewObject/RmsTextAreaV2VO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/viewObject/RmsTextAreaV2VO;", "getTextArea", "()Lru/ozon/app/android/returns/ui/molecules/textarea/v2/viewObject/RmsTextAreaV2VO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnTextAreaButtonVO implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final RmsTextAreaV2VO textArea;

    public ReturnTextAreaButtonVO(long j11, @NotNull RmsTextAreaV2VO textArea, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.textArea = textArea;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnTextAreaButtonVO)) {
            return false;
        }
        ReturnTextAreaButtonVO returnTextAreaButtonVO = (ReturnTextAreaButtonVO) other;
        return this.id == returnTextAreaButtonVO.id && Intrinsics.d(this.textArea, returnTextAreaButtonVO.textArea) && Intrinsics.d(this.button, returnTextAreaButtonVO.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
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
    public final RmsTextAreaV2VO getTextArea() {
        return this.textArea;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.button.hashCode() + ((this.textArea.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnTextAreaButtonVO(id=" + this.id + ", textArea=" + this.textArea + ", button=" + this.button + ")";
    }
}
