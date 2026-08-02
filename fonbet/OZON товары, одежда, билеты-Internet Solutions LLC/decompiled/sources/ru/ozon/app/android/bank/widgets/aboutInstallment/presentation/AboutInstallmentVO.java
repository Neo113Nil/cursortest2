package ru.ozon.app.android.bank.widgets.aboutInstallment.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00012BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "moreDisclosure", "", "Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO$ItemVO;", "items", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "getMoreDisclosure", "()Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ItemVO", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AboutInstallmentVO implements c {
    private final AtomAction action;
    private final long id;

    @NotNull
    private final List<ItemVO> items;
    private final DisclosureAtom moreDisclosure;

    @NotNull
    private final TextAtom subTitle;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/bank/widgets/aboutInstallment/presentation/AboutInstallmentVO$ItemVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "", "image", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getImage", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemVO {

        @NotNull
        private final String image;

        @NotNull
        private final TextAtom text;

        public ItemVO(@NotNull TextAtom text, @NotNull String image) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(image, "image");
            this.text = text;
            this.image = image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemVO)) {
                return false;
            }
            ItemVO itemVO = (ItemVO) other;
            return Intrinsics.d(this.text, itemVO.text) && Intrinsics.d(this.image, itemVO.image);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.image.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ItemVO(text=" + this.text + ", image=" + this.image + ")";
        }
    }

    public AboutInstallmentVO(long j11, @NotNull TextAtom title, @NotNull TextAtom subTitle, DisclosureAtom disclosureAtom, @NotNull List<ItemVO> items, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.title = title;
        this.subTitle = subTitle;
        this.moreDisclosure = disclosureAtom;
        this.items = items;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AboutInstallmentVO)) {
            return false;
        }
        AboutInstallmentVO aboutInstallmentVO = (AboutInstallmentVO) other;
        return this.id == aboutInstallmentVO.id && Intrinsics.d(this.title, aboutInstallmentVO.title) && Intrinsics.d(this.subTitle, aboutInstallmentVO.subTitle) && Intrinsics.d(this.moreDisclosure, aboutInstallmentVO.moreDisclosure) && Intrinsics.d(this.items, aboutInstallmentVO.items) && Intrinsics.d(this.action, aboutInstallmentVO.action) && Intrinsics.d(this.tokenizedEvent, aboutInstallmentVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ItemVO> getItems() {
        return this.items;
    }

    public final DisclosureAtom getMoreDisclosure() {
        return this.moreDisclosure;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subTitle);
        DisclosureAtom disclosureAtom = this.moreDisclosure;
        int b12 = g.b((b11 + (disclosureAtom == null ? 0 : disclosureAtom.hashCode())) * 31, 31, this.items);
        AtomAction atomAction = this.action;
        int hashCode = (b12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        DisclosureAtom disclosureAtom = this.moreDisclosure;
        List<ItemVO> list = this.items;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("AboutInstallmentVO(id=", j11, ", title=", textAtom);
        c11.append(", subTitle=");
        c11.append(textAtom2);
        c11.append(", moreDisclosure=");
        c11.append(disclosureAtom);
        c11.append(", items=");
        c11.append(list);
        c11.append(", action=");
        c11.append(atomAction);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
