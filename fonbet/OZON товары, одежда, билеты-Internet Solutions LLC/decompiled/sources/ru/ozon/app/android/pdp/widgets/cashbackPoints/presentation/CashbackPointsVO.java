package ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation;

import Bi.a;
import G.g;
import Ns.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001#B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lkotlin/Pair;", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO$Block;", "blocks", "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLkotlin/Pair;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lkotlin/Pair;", "getBlocks", "()Lkotlin/Pair;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Block", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CashbackPointsVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final Pair<Block, Block> blocks;
    private final long id;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO$Block;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "", "hasBottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBackgroundColor", "Z", "getHasBottomMargin", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Block {

        @NotNull
        private final String backgroundColor;
        private final boolean hasBottomMargin;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public Block(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String backgroundColor, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.subtitle = subtitle;
            this.backgroundColor = backgroundColor;
            this.hasBottomMargin = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Block)) {
                return false;
            }
            Block block = (Block) other;
            return Intrinsics.d(this.title, block.title) && Intrinsics.d(this.subtitle, block.subtitle) && Intrinsics.d(this.backgroundColor, block.backgroundColor) && this.hasBottomMargin == block.hasBottomMargin;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final boolean getHasBottomMargin() {
            return this.hasBottomMargin;
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
            return Boolean.hashCode(this.hasBottomMargin) + g.a(b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.backgroundColor;
            boolean z11 = this.hasBottomMargin;
            StringBuilder g10 = D3.g.g("Block(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor=");
            g10.append(str);
            g10.append(", hasBottomMargin=");
            g10.append(z11);
            g10.append(")");
            return g10.toString();
        }
    }

    public CashbackPointsVO(long j11, @NotNull Pair<Block, Block> blocks, @NotNull String backgroundColor, t tVar) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.blocks = blocks;
        this.backgroundColor = backgroundColor;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackPointsVO)) {
            return false;
        }
        CashbackPointsVO cashbackPointsVO = (CashbackPointsVO) other;
        return this.id == cashbackPointsVO.id && Intrinsics.d(this.blocks, cashbackPointsVO.blocks) && Intrinsics.d(this.backgroundColor, cashbackPointsVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, cashbackPointsVO.tokenizedEvent);
    }

    @NotNull
    public final Pair<Block, Block> getBlocks() {
        return this.blocks;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a((this.blocks.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.backgroundColor);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Pair<Block, Block> pair = this.blocks;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CashbackPointsVO(id=");
        sb2.append(j11);
        sb2.append(", blocks=");
        sb2.append(pair);
        a.f(sb2, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
