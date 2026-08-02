package ru.ozon.app.android.orderdetails.customsfees.presentation;

import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "copyText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "copyIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "copyAction", "subtitle", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "firstRow", "secondRow", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCopyText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCopyIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCopyAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getSubtitle", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "getFirstRow", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "getSecondRow", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeeVO implements c {
    public static final int $stable = (ImagesVO.$stable | AtomAction.$stable) | IconDTO.$stable;

    @NotNull
    private final ButtonV3DTO button;
    private final AtomAction copyAction;
    private final IconDTO copyIcon;
    private final TextDTO copyText;
    private final ImagesVO firstRow;
    private final long id;
    private final ImagesVO secondRow;
    private final TextDTO subtitle;
    private final TextDTO title;

    public FeeVO(long j11, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, AtomAction atomAction, TextDTO textDTO3, ImagesVO imagesVO, ImagesVO imagesVO2, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.title = textDTO;
        this.copyText = textDTO2;
        this.copyIcon = iconDTO;
        this.copyAction = atomAction;
        this.subtitle = textDTO3;
        this.firstRow = imagesVO;
        this.secondRow = imagesVO2;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeVO)) {
            return false;
        }
        FeeVO feeVO = (FeeVO) other;
        return this.id == feeVO.id && Intrinsics.d(this.title, feeVO.title) && Intrinsics.d(this.copyText, feeVO.copyText) && Intrinsics.d(this.copyIcon, feeVO.copyIcon) && Intrinsics.d(this.copyAction, feeVO.copyAction) && Intrinsics.d(this.subtitle, feeVO.subtitle) && Intrinsics.d(this.firstRow, feeVO.firstRow) && Intrinsics.d(this.secondRow, feeVO.secondRow) && Intrinsics.d(this.button, feeVO.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final AtomAction getCopyAction() {
        return this.copyAction;
    }

    public final IconDTO getCopyIcon() {
        return this.copyIcon;
    }

    public final TextDTO getCopyText() {
        return this.copyText;
    }

    public final ImagesVO getFirstRow() {
        return this.firstRow;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ImagesVO getSecondRow() {
        return this.secondRow;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.copyText;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        IconDTO iconDTO = this.copyIcon;
        int hashCode4 = (hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomAction atomAction = this.copyAction;
        int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        TextDTO textDTO3 = this.subtitle;
        int hashCode6 = (hashCode5 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        ImagesVO imagesVO = this.firstRow;
        int hashCode7 = (hashCode6 + (imagesVO == null ? 0 : imagesVO.hashCode())) * 31;
        ImagesVO imagesVO2 = this.secondRow;
        return this.button.hashCode() + ((hashCode7 + (imagesVO2 != null ? imagesVO2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.copyText;
        IconDTO iconDTO = this.copyIcon;
        AtomAction atomAction = this.copyAction;
        TextDTO textDTO3 = this.subtitle;
        ImagesVO imagesVO = this.firstRow;
        ImagesVO imagesVO2 = this.secondRow;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder b11 = a.b("FeeVO(id=", j11, ", title=", textDTO);
        b11.append(", copyText=");
        b11.append(textDTO2);
        b11.append(", copyIcon=");
        b11.append(iconDTO);
        b11.append(", copyAction=");
        b11.append(atomAction);
        b11.append(", subtitle=");
        b11.append(textDTO3);
        b11.append(", firstRow=");
        b11.append(imagesVO);
        b11.append(", secondRow=");
        b11.append(imagesVO2);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(")");
        return b11.toString();
    }
}
