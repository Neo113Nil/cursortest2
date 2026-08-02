package ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation;

import Am.C2438a;
import B0.C2454a;
import G.g;
import J0.P;
import Lc.a;
import Pk0.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u000201BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$LabelVO;", "text", "", "overlayColor", "", "viewCorner", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$SpacersVO;", "spacers", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$LabelVO;Ljava/lang/String;FLru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$SpacersVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$LabelVO;", "getText", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$LabelVO;", "Ljava/lang/String;", "getOverlayColor", "F", "getViewCorner", "()F", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$SpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$SpacersVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "LabelVO", "SpacersVO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageSkuClickVO {
    private final AtomAction action;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final String overlayColor;

    @NotNull
    private final SpacersVO spacers;

    @NotNull
    private final LabelVO text;
    private final t tokenizedEvent;
    private final float viewCorner;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$LabelVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantity", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LabelVO {

        @NotNull
        private final TextDTO quantity;

        @NotNull
        private final TextDTO subtitle;

        public LabelVO(@NotNull TextDTO quantity, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.quantity = quantity;
            this.subtitle = subtitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LabelVO)) {
                return false;
            }
            LabelVO labelVO = (LabelVO) other;
            return Intrinsics.d(this.quantity, labelVO.quantity) && Intrinsics.d(this.subtitle, labelVO.subtitle);
        }

        @NotNull
        public final TextDTO getQuantity() {
            return this.quantity;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.quantity.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.b("LabelVO(quantity=", this.quantity, ", subtitle=", this.subtitle, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO$SpacersVO;", "", "", "top", "bottom", "right", "left", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getRight", "getLeft", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersVO {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public SpacersVO(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.right = i13;
            this.left = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersVO)) {
                return false;
            }
            SpacersVO spacersVO = (SpacersVO) other;
            return this.top == spacersVO.top && this.bottom == spacersVO.bottom && this.right == spacersVO.right && this.left == spacersVO.left;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.left) + C2454a.a(this.right, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.right, this.left, ", left=", ")", C2438a.a("SpacersVO(top=", this.top, ", bottom=", ", right=", this.bottom));
        }
    }

    public ImageSkuClickVO(@NotNull ImageDTO image, @NotNull LabelVO text, @NotNull String overlayColor, float f7, @NotNull SpacersVO spacers, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(overlayColor, "overlayColor");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.image = image;
        this.text = text;
        this.overlayColor = overlayColor;
        this.viewCorner = f7;
        this.spacers = spacers;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSkuClickVO)) {
            return false;
        }
        ImageSkuClickVO imageSkuClickVO = (ImageSkuClickVO) other;
        return Intrinsics.d(this.image, imageSkuClickVO.image) && Intrinsics.d(this.text, imageSkuClickVO.text) && Intrinsics.d(this.overlayColor, imageSkuClickVO.overlayColor) && Float.compare(this.viewCorner, imageSkuClickVO.viewCorner) == 0 && Intrinsics.d(this.spacers, imageSkuClickVO.spacers) && Intrinsics.d(this.action, imageSkuClickVO.action) && Intrinsics.d(this.tokenizedEvent, imageSkuClickVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final String getOverlayColor() {
        return this.overlayColor;
    }

    @NotNull
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final LabelVO getText() {
        return this.text;
    }

    public final float getViewCorner() {
        return this.viewCorner;
    }

    public int hashCode() {
        int hashCode = (this.spacers.hashCode() + b.a(this.viewCorner, g.a((this.text.hashCode() + (this.image.hashCode() * 31)) * 31, 31, this.overlayColor), 31)) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        LabelVO labelVO = this.text;
        String str = this.overlayColor;
        float f7 = this.viewCorner;
        SpacersVO spacersVO = this.spacers;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("ImageSkuClickVO(image=");
        sb2.append(imageDTO);
        sb2.append(", text=");
        sb2.append(labelVO);
        sb2.append(", overlayColor=");
        sb2.append(str);
        sb2.append(", viewCorner=");
        sb2.append(f7);
        sb2.append(", spacers=");
        sb2.append(spacersVO);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        return Tl.b.d(sb2, tVar, ")");
    }
}
