package ru.ozon.app.android.fresh.main.widgets.header.presentation;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import Lh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0080\b\u0018\u00002\u00020\u0001:\u0001=Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b,\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b3\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderVO;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsPartVO;", "", "id", "", "scrollWidgetKey", "", "catalogueTabsConnectionTag", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "backgroundColor", "LWZ/t;", "tokenizedEvent", "", "topIslandCornerRadius", "Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderVO$MarginsVO;", "margins", "<init>", "(JLjava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;LWZ/t;FLru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderVO$MarginsVO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getCatalogueTabsConnectionTag", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "F", "getTopIslandCornerRadius", "()F", "Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderVO$MarginsVO;", "getMargins", "()Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderVO$MarginsVO;", "MarginsVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HeaderVO implements CatalogTabsPartVO {
    private final AtomAction action;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final String catalogueTabsConnectionTag;
    private final long id;

    @NotNull
    private final MarginsVO margins;
    private final Integer scrollWidgetKey;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final float topIslandCornerRadius;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderVO$MarginsVO;", "", "", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeftMargin", "getTopMargin", "getRightMargin", "getBottomMargin", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MarginsVO {
        private final int bottomMargin;
        private final int leftMargin;
        private final int rightMargin;
        private final int topMargin;

        public MarginsVO(int i11, int i12, int i13, int i14) {
            this.leftMargin = i11;
            this.topMargin = i12;
            this.rightMargin = i13;
            this.bottomMargin = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MarginsVO)) {
                return false;
            }
            MarginsVO marginsVO = (MarginsVO) other;
            return this.leftMargin == marginsVO.leftMargin && this.topMargin == marginsVO.topMargin && this.rightMargin == marginsVO.rightMargin && this.bottomMargin == marginsVO.bottomMargin;
        }

        public final int getBottomMargin() {
            return this.bottomMargin;
        }

        public final int getLeftMargin() {
            return this.leftMargin;
        }

        public final int getRightMargin() {
            return this.rightMargin;
        }

        public final int getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottomMargin) + C2454a.a(this.rightMargin, C2454a.a(this.topMargin, Integer.hashCode(this.leftMargin) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.rightMargin, this.bottomMargin, ", bottomMargin=", ")", C2438a.a("MarginsVO(leftMargin=", this.leftMargin, ", topMargin=", ", rightMargin=", this.topMargin));
        }
    }

    public HeaderVO(long j11, Integer num, String str, @NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, AtomAction atomAction, String str2, t tVar, float f7, @NotNull MarginsVO margins) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.catalogueTabsConnectionTag = str;
        this.title = title;
        this.subtitle = textDTO;
        this.badge = badgeDTO;
        this.action = atomAction;
        this.backgroundColor = str2;
        this.tokenizedEvent = tVar;
        this.topIslandCornerRadius = f7;
        this.margins = margins;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderVO)) {
            return false;
        }
        HeaderVO headerVO = (HeaderVO) other;
        return this.id == headerVO.id && Intrinsics.d(this.scrollWidgetKey, headerVO.scrollWidgetKey) && Intrinsics.d(this.catalogueTabsConnectionTag, headerVO.catalogueTabsConnectionTag) && Intrinsics.d(this.title, headerVO.title) && Intrinsics.d(this.subtitle, headerVO.subtitle) && Intrinsics.d(this.badge, headerVO.badge) && Intrinsics.d(this.action, headerVO.action) && Intrinsics.d(this.backgroundColor, headerVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, headerVO.tokenizedEvent) && Float.compare(this.topIslandCornerRadius, headerVO.topIslandCornerRadius) == 0 && Intrinsics.d(this.margins, headerVO.margins);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @Override // ru.ozon.app.android.fresh.navigation.CatalogTabsPartVO
    public String getCatalogueTabsConnectionTag() {
        return this.catalogueTabsConnectionTag;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final MarginsVO getMargins() {
        return this.margins;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
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

    public final float getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return CatalogTabsPartVO.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.catalogueTabsConnectionTag;
        int a11 = b.a(this.title, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode3 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return this.margins.hashCode() + Pk0.b.a(this.topIslandCornerRadius, (hashCode6 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        String str = this.catalogueTabsConnectionTag;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.badge;
        AtomAction atomAction = this.action;
        String str2 = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        float f7 = this.topIslandCornerRadius;
        MarginsVO marginsVO = this.margins;
        StringBuilder c11 = a.c("HeaderVO(id=", j11, ", scrollWidgetKey=", num);
        c11.append(", catalogueTabsConnectionTag=");
        c11.append(str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", subtitle=");
        c11.append(textDTO2);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", backgroundColor=");
        c11.append(str2);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", topIslandCornerRadius=");
        c11.append(f7);
        c11.append(", margins=");
        c11.append(marginsVO);
        c11.append(")");
        return c11.toString();
    }
}
