package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple;

import F3.G;
import G.g;
import N3.C3660k;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.RoundedCornerVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001'B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b&\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "position", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "topItem", "bottomItem", "<init>", "(JLjava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getRoundedCorners", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "getPosition", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "getTopItem", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "getBottomItem", "NaviBlockItemVO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CoupleNaviBlockVO implements c {

    @NotNull
    private final NaviBlockItemVO bottomItem;
    private final long id;

    @NotNull
    private final NaviBlockPositionVO position;

    @NotNull
    private final List<RoundedCornerVO> roundedCorners;

    @NotNull
    private final NaviBlockItemVO topItem;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "", "", "backgroundColor", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "titleDisclosure", "subtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitleDisclosure", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NaviBlockItemVO {
        private final AtomAction action;
        private final String backgroundColor;
        private final String image;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final IconDTO titleDisclosure;
        private final t tokenizedEvent;

        public NaviBlockItemVO(String str, String str2, @NotNull TextDTO title, IconDTO iconDTO, TextDTO textDTO, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.backgroundColor = str;
            this.image = str2;
            this.title = title;
            this.titleDisclosure = iconDTO;
            this.subtitle = textDTO;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NaviBlockItemVO)) {
                return false;
            }
            NaviBlockItemVO naviBlockItemVO = (NaviBlockItemVO) other;
            return Intrinsics.d(this.backgroundColor, naviBlockItemVO.backgroundColor) && Intrinsics.d(this.image, naviBlockItemVO.image) && Intrinsics.d(this.title, naviBlockItemVO.title) && Intrinsics.d(this.titleDisclosure, naviBlockItemVO.titleDisclosure) && Intrinsics.d(this.subtitle, naviBlockItemVO.subtitle) && Intrinsics.d(this.action, naviBlockItemVO.action) && Intrinsics.d(this.tokenizedEvent, naviBlockItemVO.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getImage() {
            return this.image;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final IconDTO getTitleDisclosure() {
            return this.titleDisclosure;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.image;
            int a11 = b.a(this.title, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            IconDTO iconDTO = this.titleDisclosure;
            int hashCode2 = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.image;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.titleDisclosure;
            TextDTO textDTO2 = this.subtitle;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = C3660k.d("NaviBlockItemVO(backgroundColor=", str, ", image=", str2, ", title=");
            G.f(d11, textDTO, ", titleDisclosure=", iconDTO, ", subtitle=");
            d11.append(textDTO2);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(", tokenizedEvent=");
            return Tl.b.d(d11, tVar, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoupleNaviBlockVO(long j11, @NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull NaviBlockPositionVO position, @NotNull NaviBlockItemVO topItem, @NotNull NaviBlockItemVO bottomItem) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(topItem, "topItem");
        Intrinsics.checkNotNullParameter(bottomItem, "bottomItem");
        this.id = j11;
        this.roundedCorners = roundedCorners;
        this.position = position;
        this.topItem = topItem;
        this.bottomItem = bottomItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoupleNaviBlockVO)) {
            return false;
        }
        CoupleNaviBlockVO coupleNaviBlockVO = (CoupleNaviBlockVO) other;
        return this.id == coupleNaviBlockVO.id && Intrinsics.d(this.roundedCorners, coupleNaviBlockVO.roundedCorners) && this.position == coupleNaviBlockVO.position && Intrinsics.d(this.topItem, coupleNaviBlockVO.topItem) && Intrinsics.d(this.bottomItem, coupleNaviBlockVO.bottomItem);
    }

    @NotNull
    public final NaviBlockItemVO getBottomItem() {
        return this.bottomItem;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final NaviBlockPositionVO getPosition() {
        return this.position;
    }

    @NotNull
    public final List<RoundedCornerVO> getRoundedCorners() {
        return this.roundedCorners;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final NaviBlockItemVO getTopItem() {
        return this.topItem;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.bottomItem.hashCode() + ((this.topItem.hashCode() + ((this.position.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.roundedCorners)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RoundedCornerVO> list = this.roundedCorners;
        NaviBlockPositionVO naviBlockPositionVO = this.position;
        NaviBlockItemVO naviBlockItemVO = this.topItem;
        NaviBlockItemVO naviBlockItemVO2 = this.bottomItem;
        StringBuilder b11 = Lh.b.b(j11, "CoupleNaviBlockVO(id=", ", roundedCorners=", list);
        b11.append(", position=");
        b11.append(naviBlockPositionVO);
        b11.append(", topItem=");
        b11.append(naviBlockItemVO);
        b11.append(", bottomItem=");
        b11.append(naviBlockItemVO2);
        b11.append(")");
        return b11.toString();
    }
}
