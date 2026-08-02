package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting;

import Bl.b;
import G.g;
import Kk.C3532b;
import Nh.a;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001:\u00011BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\u0005\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO;", "Ll20/c;", "", "id", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO$ItemVO;", "items", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "selectedIds", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "titleBadge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleAtom", "<init>", "(JZLjava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getSelectedIds", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ItemVO", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PostingVO implements c {
    private final AtomAction action;
    private final long id;
    private final boolean isSelected;

    @NotNull
    private final List<ItemVO> items;
    private final String selectedIds;

    @NotNull
    private final String title;

    @NotNull
    private final TextDTO titleAtom;
    private final BadgeDTO titleBadge;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/posting/PostingVO$ItemVO;", "", "", "image", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getSubtitle", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemVO {

        @NotNull
        private final String image;
        private final String subtitle;

        public ItemVO(@NotNull String image, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.subtitle = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemVO)) {
                return false;
            }
            ItemVO itemVO = (ItemVO) other;
            return Intrinsics.d(this.image, itemVO.image) && Intrinsics.d(this.subtitle, itemVO.subtitle);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.subtitle;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("ItemVO(image=", this.image, ", subtitle=", this.subtitle, ")");
        }
    }

    public PostingVO(long j11, boolean z11, @NotNull String title, @NotNull List<ItemVO> items, AtomAction atomAction, String str, BadgeDTO badgeDTO, @NotNull TextDTO titleAtom) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
        this.id = j11;
        this.isSelected = z11;
        this.title = title;
        this.items = items;
        this.action = atomAction;
        this.selectedIds = str;
        this.titleBadge = badgeDTO;
        this.titleAtom = titleAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostingVO)) {
            return false;
        }
        PostingVO postingVO = (PostingVO) other;
        return this.id == postingVO.id && this.isSelected == postingVO.isSelected && Intrinsics.d(this.title, postingVO.title) && Intrinsics.d(this.items, postingVO.items) && Intrinsics.d(this.action, postingVO.action) && Intrinsics.d(this.selectedIds, postingVO.selectedIds) && Intrinsics.d(this.titleBadge, postingVO.titleBadge) && Intrinsics.d(this.titleAtom, postingVO.titleAtom);
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSelectedIds() {
        return this.selectedIds;
    }

    @NotNull
    public final TextDTO getTitleAtom() {
        return this.titleAtom;
    }

    public final BadgeDTO getTitleBadge() {
        return this.titleBadge;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isSelected), 31, this.title), 31, this.items);
        AtomAction atomAction = this.action;
        int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str = this.selectedIds;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BadgeDTO badgeDTO = this.titleBadge;
        return this.titleAtom.hashCode() + ((hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isSelected;
        String str = this.title;
        List<ItemVO> list = this.items;
        AtomAction atomAction = this.action;
        String str2 = this.selectedIds;
        BadgeDTO badgeDTO = this.titleBadge;
        TextDTO textDTO = this.titleAtom;
        StringBuilder c11 = b.c(j11, "PostingVO(id=", ", isSelected=", z11);
        a.g(", title=", str, ", items=", c11, list);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", selectedIds=");
        c11.append(str2);
        c11.append(", titleBadge=");
        c11.append(badgeDTO);
        c11.append(", titleAtom=");
        c11.append(textDTO);
        c11.append(")");
        return c11.toString();
    }
}
