package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo;

import B90.C2619v;
import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AdditionalServiceVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "price", "", "isSelected", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getPrice", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServiceVO implements TravelRailwaySeatSelectFooterVO.FooterItem {
    public static final int $stable;
    private final AtomAction action;
    private final TextAtom description;
    private final int id;
    private final boolean isSelected;

    @NotNull
    private final TextAtom price;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = AtomAction.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12 | i12;
    }

    public AdditionalServiceVO(int i11, @NotNull TextAtom title, TextAtom textAtom, @NotNull TextAtom price, boolean z11, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = i11;
        this.title = title;
        this.description = textAtom;
        this.price = price;
        this.isSelected = z11;
        this.action = atomAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServiceVO)) {
            return false;
        }
        AdditionalServiceVO additionalServiceVO = (AdditionalServiceVO) other;
        return this.id == additionalServiceVO.id && Intrinsics.d(this.title, additionalServiceVO.title) && Intrinsics.d(this.description, additionalServiceVO.description) && Intrinsics.d(this.price, additionalServiceVO.price) && this.isSelected == additionalServiceVO.isSelected && Intrinsics.d(this.action, additionalServiceVO.action);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO.FooterItem
    public int getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getPrice() {
        return this.price;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = C2619v.b(Integer.hashCode(this.id) * 31, 31, this.title);
        TextAtom textAtom = this.description;
        int a11 = C3532b.a(C2619v.b((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.price), 31, this.isSelected);
        AtomAction atomAction = this.action;
        return a11 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        TextAtom textAtom3 = this.price;
        boolean z11 = this.isSelected;
        AtomAction atomAction = this.action;
        StringBuilder sb2 = new StringBuilder("AdditionalServiceVO(id=");
        sb2.append(i11);
        sb2.append(", title=");
        sb2.append(textAtom);
        sb2.append(", description=");
        C4636t5.c(", price=", ", isSelected=", sb2, textAtom2, textAtom3);
        sb2.append(z11);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}
