package ru.ozon.app.android.travel.feature.general.order.widgets.buyersContacts.presentation;

import Bl.C2639a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/buyersContacts/presentation/BuyersContactsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "", "textAtoms", "", "atomSpacing", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "infoBadge", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getTextAtoms", "()Ljava/util/List;", "Ljava/lang/Integer;", "getAtomSpacing", "()Ljava/lang/Integer;", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "getInfoBadge", "()Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeVO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BuyersContactsVO implements c {
    private final Integer atomSpacing;
    private final TextAtom header;
    private final long id;
    private final InfoBadgeVO infoBadge;

    @NotNull
    private final List<TextAtom> textAtoms;

    public BuyersContactsVO(long j11, TextAtom textAtom, @NotNull List<TextAtom> textAtoms, Integer num, InfoBadgeVO infoBadgeVO) {
        Intrinsics.checkNotNullParameter(textAtoms, "textAtoms");
        this.id = j11;
        this.header = textAtom;
        this.textAtoms = textAtoms;
        this.atomSpacing = num;
        this.infoBadge = infoBadgeVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyersContactsVO)) {
            return false;
        }
        BuyersContactsVO buyersContactsVO = (BuyersContactsVO) other;
        return this.id == buyersContactsVO.id && Intrinsics.d(this.header, buyersContactsVO.header) && Intrinsics.d(this.textAtoms, buyersContactsVO.textAtoms) && Intrinsics.d(this.atomSpacing, buyersContactsVO.atomSpacing) && Intrinsics.d(this.infoBadge, buyersContactsVO.infoBadge);
    }

    public final Integer getAtomSpacing() {
        return this.atomSpacing;
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final InfoBadgeVO getInfoBadge() {
        return this.infoBadge;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TextAtom> getTextAtoms() {
        return this.textAtoms;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.header;
        int b11 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.textAtoms);
        Integer num = this.atomSpacing;
        int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        InfoBadgeVO infoBadgeVO = this.infoBadge;
        return hashCode2 + (infoBadgeVO != null ? infoBadgeVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.header;
        List<TextAtom> list = this.textAtoms;
        Integer num = this.atomSpacing;
        InfoBadgeVO infoBadgeVO = this.infoBadge;
        StringBuilder c11 = C2639a.c("BuyersContactsVO(id=", j11, ", header=", textAtom);
        c11.append(", textAtoms=");
        c11.append(list);
        c11.append(", atomSpacing=");
        c11.append(num);
        c11.append(", infoBadge=");
        c11.append(infoBadgeVO);
        c11.append(")");
        return c11.toString();
    }
}
