package ru.ozon.app.android.pdp.widgets.sellerPoints.presentation;

import C.o0;
import D3.g;
import WZ.t;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002)*B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;", "firstBlock", "secondBlock", "", "backgroundColor", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Size;", "size", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Size;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;", "getFirstBlock", "()Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;", "getSecondBlock", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Size;", "getSize", "()Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Size;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Size", "Block", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerPointsVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final Block firstBlock;
    private final long id;
    private final Block secondBlock;

    @NotNull
    private final Size size;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBackgroundColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Block {

        @NotNull
        private final String backgroundColor;
        private final TextDTO subtitle;
        private final TextDTO title;

        public Block(TextDTO textDTO, TextDTO textDTO2, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.backgroundColor = backgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Block)) {
                return false;
            }
            Block block = (Block) other;
            return Intrinsics.d(this.title, block.title) && Intrinsics.d(this.subtitle, block.subtitle) && Intrinsics.d(this.backgroundColor, block.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            return this.backgroundColor.hashCode() + ((hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            return o0.c(g.g("Block(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "REGULAR", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SMALL = new Size("SMALL", 0);
        public static final Size REGULAR = new Size("REGULAR", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SMALL, REGULAR};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public SellerPointsVO(long j11, @NotNull Block firstBlock, Block block, @NotNull String backgroundColor, @NotNull Size size, t tVar) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(size, "size");
        this.id = j11;
        this.firstBlock = firstBlock;
        this.secondBlock = block;
        this.backgroundColor = backgroundColor;
        this.size = size;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerPointsVO)) {
            return false;
        }
        SellerPointsVO sellerPointsVO = (SellerPointsVO) other;
        return this.id == sellerPointsVO.id && Intrinsics.d(this.firstBlock, sellerPointsVO.firstBlock) && Intrinsics.d(this.secondBlock, sellerPointsVO.secondBlock) && Intrinsics.d(this.backgroundColor, sellerPointsVO.backgroundColor) && this.size == sellerPointsVO.size && Intrinsics.d(this.tokenizedEvent, sellerPointsVO.tokenizedEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Block getFirstBlock() {
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

    public final Block getSecondBlock() {
        return this.secondBlock;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.firstBlock.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Block block = this.secondBlock;
        int hashCode2 = (this.size.hashCode() + G.g.a((hashCode + (block == null ? 0 : block.hashCode())) * 31, 31, this.backgroundColor)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SellerPointsVO(id=" + this.id + ", firstBlock=" + this.firstBlock + ", secondBlock=" + this.secondBlock + ", backgroundColor=" + this.backgroundColor + ", size=" + this.size + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
