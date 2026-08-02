package ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation;

import D3.g;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001:\u00018Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b1\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightIcon", "", "Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO$DocumentVO;", "documents", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "warning", "infoText", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/util/List;", "getDocuments", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getWarning", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getInfoText", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "DocumentVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ItemDocumentsVO implements c {
    private final List<DocumentVO> documents;
    private final long id;
    private final TextDTO infoText;
    private final Paddings paddings;
    private final IconButtonV3DTO rightIcon;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final CellDTO warning;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO$DocumentVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "subtext", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtext", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DocumentVO {
        public static final int $stable = AtomAction.$stable | AspectDTO.$stable;
        private final AtomAction action;
        private final AspectDTO aspect;
        private final TextDTO subtext;
        private final TextDTO text;

        public DocumentVO(TextDTO textDTO, TextDTO textDTO2, AspectDTO aspectDTO, AtomAction atomAction) {
            this.text = textDTO;
            this.subtext = textDTO2;
            this.aspect = aspectDTO;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentVO)) {
                return false;
            }
            DocumentVO documentVO = (DocumentVO) other;
            return Intrinsics.d(this.text, documentVO.text) && Intrinsics.d(this.subtext, documentVO.subtext) && Intrinsics.d(this.aspect, documentVO.aspect) && Intrinsics.d(this.action, documentVO.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final AspectDTO getAspect() {
            return this.aspect;
        }

        public final TextDTO getSubtext() {
            return this.subtext;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            TextDTO textDTO = this.text;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtext;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            AspectDTO aspectDTO = this.aspect;
            int hashCode3 = (hashCode2 + (aspectDTO == null ? 0 : aspectDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            TextDTO textDTO2 = this.subtext;
            AspectDTO aspectDTO = this.aspect;
            AtomAction atomAction = this.action;
            StringBuilder g10 = g.g("DocumentVO(text=", textDTO, ", subtext=", textDTO2, ", aspect=");
            g10.append(aspectDTO);
            g10.append(", action=");
            g10.append(atomAction);
            g10.append(")");
            return g10.toString();
        }
    }

    public ItemDocumentsVO(long j11, @NotNull TextDTO title, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, List<DocumentVO> list, CellDTO cellDTO, TextDTO textDTO2, Paddings paddings, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.rightIcon = iconButtonV3DTO;
        this.documents = list;
        this.warning = cellDTO;
        this.infoText = textDTO2;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDocumentsVO)) {
            return false;
        }
        ItemDocumentsVO itemDocumentsVO = (ItemDocumentsVO) other;
        return this.id == itemDocumentsVO.id && Intrinsics.d(this.title, itemDocumentsVO.title) && Intrinsics.d(this.subtitle, itemDocumentsVO.subtitle) && Intrinsics.d(this.rightIcon, itemDocumentsVO.rightIcon) && Intrinsics.d(this.documents, itemDocumentsVO.documents) && Intrinsics.d(this.warning, itemDocumentsVO.warning) && Intrinsics.d(this.infoText, itemDocumentsVO.infoText) && Intrinsics.d(this.paddings, itemDocumentsVO.paddings) && Intrinsics.d(this.tokenizedEvent, itemDocumentsVO.tokenizedEvent);
    }

    public final List<DocumentVO> getDocuments() {
        return this.documents;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getInfoText() {
        return this.infoText;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final IconButtonV3DTO getRightIcon() {
        return this.rightIcon;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final CellDTO getWarning() {
        return this.warning;
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightIcon;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        List<DocumentVO> list = this.documents;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CellDTO cellDTO = this.warning;
        int hashCode4 = (hashCode3 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.infoText;
        int hashCode5 = (hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        Paddings paddings = this.paddings;
        int hashCode6 = (hashCode5 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        IconButtonV3DTO iconButtonV3DTO = this.rightIcon;
        List<DocumentVO> list = this.documents;
        CellDTO cellDTO = this.warning;
        TextDTO textDTO3 = this.infoText;
        Paddings paddings = this.paddings;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("ItemDocumentsVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", rightIcon=");
        b11.append(iconButtonV3DTO);
        b11.append(", documents=");
        b11.append(list);
        b11.append(", warning=");
        b11.append(cellDTO);
        b11.append(", infoText=");
        b11.append(textDTO3);
        b11.append(", paddings=");
        b11.append(paddings);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
