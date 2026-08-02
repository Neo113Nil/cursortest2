package ru.ozon.app.android.pdp.widgets.productStarsTile.presentation;

import D3.g;
import Lh.a;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0010R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;", "firstBlock", "secondBlock", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;", "getFirstBlock", "()Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;", "getSecondBlock", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "BlockVO", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductStarsTileVO implements c {
    private final String backgroundColor;

    @NotNull
    private final BlockVO firstBlock;
    private final long id;

    @NotNull
    private final BlockVO secondBlock;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdp/widgets/productStarsTile/presentation/ProductStarsTileVO$BlockVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockVO {
        public static final int $stable = IconDTO.$stable;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public BlockVO(@NotNull TextDTO title, @NotNull TextDTO subtitle, String str, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.subtitle = subtitle;
            this.backgroundColor = str;
            this.icon = icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BlockVO)) {
                return false;
            }
            BlockVO blockVO = (BlockVO) other;
            return Intrinsics.d(this.title, blockVO.title) && Intrinsics.d(this.subtitle, blockVO.subtitle) && Intrinsics.d(this.backgroundColor, blockVO.backgroundColor) && Intrinsics.d(this.icon, blockVO.icon);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, this.title.hashCode() * 31, 31);
            String str = this.backgroundColor;
            return this.icon.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.backgroundColor;
            IconDTO iconDTO = this.icon;
            StringBuilder g10 = g.g("BlockVO(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor=");
            g10.append(str);
            g10.append(", icon=");
            g10.append(iconDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public ProductStarsTileVO(long j11, @NotNull BlockVO firstBlock, @NotNull BlockVO secondBlock, String str, t tVar) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
        this.id = j11;
        this.firstBlock = firstBlock;
        this.secondBlock = secondBlock;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductStarsTileVO)) {
            return false;
        }
        ProductStarsTileVO productStarsTileVO = (ProductStarsTileVO) other;
        return this.id == productStarsTileVO.id && Intrinsics.d(this.firstBlock, productStarsTileVO.firstBlock) && Intrinsics.d(this.secondBlock, productStarsTileVO.secondBlock) && Intrinsics.d(this.backgroundColor, productStarsTileVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, productStarsTileVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlockVO getFirstBlock() {
        return this.firstBlock;
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
    public final BlockVO getSecondBlock() {
        return this.secondBlock;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.secondBlock.hashCode() + ((this.firstBlock.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        BlockVO blockVO = this.firstBlock;
        BlockVO blockVO2 = this.secondBlock;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("ProductStarsTileVO(id=");
        sb2.append(j11);
        sb2.append(", firstBlock=");
        sb2.append(blockVO);
        sb2.append(", secondBlock=");
        sb2.append(blockVO2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
