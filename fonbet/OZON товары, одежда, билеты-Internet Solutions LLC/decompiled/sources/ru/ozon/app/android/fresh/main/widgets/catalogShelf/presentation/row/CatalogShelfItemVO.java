package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row;

import G.g;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "soldOut", "", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadgeV2", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getSoldOut", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogShelfItemVO {
    private final AtomAction action;
    private final BadgeDTO advBadgeV2;

    @NotNull
    private final String image;
    private final Badge soldOut;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    public CatalogShelfItemVO(@NotNull TextAtom title, Badge badge, @NotNull String image, AtomAction atomAction, BadgeDTO badgeDTO, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.title = title;
        this.soldOut = badge;
        this.image = image;
        this.action = atomAction;
        this.advBadgeV2 = badgeDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogShelfItemVO)) {
            return false;
        }
        CatalogShelfItemVO catalogShelfItemVO = (CatalogShelfItemVO) other;
        return Intrinsics.d(this.title, catalogShelfItemVO.title) && Intrinsics.d(this.soldOut, catalogShelfItemVO.soldOut) && Intrinsics.d(this.image, catalogShelfItemVO.image) && Intrinsics.d(this.action, catalogShelfItemVO.action) && Intrinsics.d(this.advBadgeV2, catalogShelfItemVO.advBadgeV2) && Intrinsics.d(this.tokenizedEvent, catalogShelfItemVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getAdvBadgeV2() {
        return this.advBadgeV2;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final Badge getSoldOut() {
        return this.soldOut;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Badge badge = this.soldOut;
        int a11 = g.a((hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.image);
        AtomAction atomAction = this.action;
        int hashCode2 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        BadgeDTO badgeDTO = this.advBadgeV2;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        Badge badge = this.soldOut;
        String str = this.image;
        AtomAction atomAction = this.action;
        BadgeDTO badgeDTO = this.advBadgeV2;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CatalogShelfItemVO(title=");
        sb2.append(textAtom);
        sb2.append(", soldOut=");
        sb2.append(badge);
        sb2.append(", image=");
        b.d(str, ", action=", ", advBadgeV2=", sb2, atomAction);
        sb2.append(badgeDTO);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
