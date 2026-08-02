package ru.ozon.app.android.returns.listEmpty.data;

import B90.C2619v;
import Cm.e;
import G.g;
import N3.C3660k;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto;", "", "banner", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;", "instruction", "<init>", "(Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;)V", "getBanner", "()Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;", "getInstruction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TextBlock", "ImageSize", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnListEmptyDto {
    public static final int $stable = 8;

    @NotNull
    private final TextBlock banner;

    @NotNull
    private final TextBlock instruction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$ImageSize;", "", "height", "", "width", "<init>", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageSize {
        public static final int $stable = 0;
        private final int height;
        private final int width;

        public ImageSize(@i(name = "height") int i11, @i(name = "width") int i12) {
            this.height = i11;
            this.width = i12;
        }

        public static /* synthetic */ ImageSize copy$default(ImageSize imageSize, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = imageSize.height;
            }
            if ((i13 & 2) != 0) {
                i12 = imageSize.width;
            }
            return imageSize.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        @NotNull
        public final ImageSize copy(@i(name = "height") int height, @i(name = "width") int width) {
            return new ImageSize(height, width);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageSize)) {
                return false;
            }
            ImageSize imageSize = (ImageSize) other;
            return this.height == imageSize.height && this.width == imageSize.width;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.width) + (Integer.hashCode(this.height) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("ImageSize(height=", this.height, ", width=", ")", this.width);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;", "", "color", "", "image", "imageSize", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$ImageSize;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textRows", "", "callToAction", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$ImageSize;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getColor", "()Ljava/lang/String;", "getImage", "getImageSize", "()Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$ImageSize;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTextRows", "()Ljava/util/List;", "getCallToAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextBlock {
        public static final int $stable = 8;
        private final ButtonV3Atom.LargeButton callToAction;

        @NotNull
        private final String color;

        @NotNull
        private final TextAtom header;

        @NotNull
        private final String image;

        @NotNull
        private final ImageSize imageSize;

        @NotNull
        private final List<TextAtom> textRows;

        public TextBlock(@i(name = "color") @NotNull String color, @i(name = "image") @NotNull String image, @i(name = "imageSize") @NotNull ImageSize imageSize, @i(name = "header") @NotNull TextAtom header, @i(name = "textRows") @NotNull List<TextAtom> textRows, @i(name = "callToAction") ButtonV3Atom.LargeButton largeButton) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(textRows, "textRows");
            this.color = color;
            this.image = image;
            this.imageSize = imageSize;
            this.header = header;
            this.textRows = textRows;
            this.callToAction = largeButton;
        }

        public static /* synthetic */ TextBlock copy$default(TextBlock textBlock, String str, String str2, ImageSize imageSize, TextAtom textAtom, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textBlock.color;
            }
            if ((i11 & 2) != 0) {
                str2 = textBlock.image;
            }
            if ((i11 & 4) != 0) {
                imageSize = textBlock.imageSize;
            }
            if ((i11 & 8) != 0) {
                textAtom = textBlock.header;
            }
            if ((i11 & 16) != 0) {
                list = textBlock.textRows;
            }
            if ((i11 & 32) != 0) {
                largeButton = textBlock.callToAction;
            }
            List list2 = list;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            return textBlock.copy(str, str2, imageSize, textAtom, list2, largeButton2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ImageSize getImageSize() {
            return this.imageSize;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        public final List<TextAtom> component5() {
            return this.textRows;
        }

        /* renamed from: component6, reason: from getter */
        public final ButtonV3Atom.LargeButton getCallToAction() {
            return this.callToAction;
        }

        @NotNull
        public final TextBlock copy(@i(name = "color") @NotNull String color, @i(name = "image") @NotNull String image, @i(name = "imageSize") @NotNull ImageSize imageSize, @i(name = "header") @NotNull TextAtom header, @i(name = "textRows") @NotNull List<TextAtom> textRows, @i(name = "callToAction") ButtonV3Atom.LargeButton callToAction) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(textRows, "textRows");
            return new TextBlock(color, image, imageSize, header, textRows, callToAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextBlock)) {
                return false;
            }
            TextBlock textBlock = (TextBlock) other;
            return Intrinsics.d(this.color, textBlock.color) && Intrinsics.d(this.image, textBlock.image) && Intrinsics.d(this.imageSize, textBlock.imageSize) && Intrinsics.d(this.header, textBlock.header) && Intrinsics.d(this.textRows, textBlock.textRows) && Intrinsics.d(this.callToAction, textBlock.callToAction);
        }

        public final ButtonV3Atom.LargeButton getCallToAction() {
            return this.callToAction;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final TextAtom getHeader() {
            return this.header;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final ImageSize getImageSize() {
            return this.imageSize;
        }

        @NotNull
        public final List<TextAtom> getTextRows() {
            return this.textRows;
        }

        public int hashCode() {
            int b11 = g.b(C2619v.b((this.imageSize.hashCode() + g.a(this.color.hashCode() * 31, 31, this.image)) * 31, 31, this.header), 31, this.textRows);
            ButtonV3Atom.LargeButton largeButton = this.callToAction;
            return b11 + (largeButton == null ? 0 : largeButton.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.color;
            String str2 = this.image;
            ImageSize imageSize = this.imageSize;
            TextAtom textAtom = this.header;
            List<TextAtom> list = this.textRows;
            ButtonV3Atom.LargeButton largeButton = this.callToAction;
            StringBuilder d11 = C3660k.d("TextBlock(color=", str, ", image=", str2, ", imageSize=");
            d11.append(imageSize);
            d11.append(", header=");
            d11.append(textAtom);
            d11.append(", textRows=");
            d11.append(list);
            d11.append(", callToAction=");
            d11.append(largeButton);
            d11.append(")");
            return d11.toString();
        }
    }

    public ReturnListEmptyDto(@i(name = "banner") @NotNull TextBlock banner, @i(name = "instruction") @NotNull TextBlock instruction) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        this.banner = banner;
        this.instruction = instruction;
    }

    public static /* synthetic */ ReturnListEmptyDto copy$default(ReturnListEmptyDto returnListEmptyDto, TextBlock textBlock, TextBlock textBlock2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textBlock = returnListEmptyDto.banner;
        }
        if ((i11 & 2) != 0) {
            textBlock2 = returnListEmptyDto.instruction;
        }
        return returnListEmptyDto.copy(textBlock, textBlock2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextBlock getBanner() {
        return this.banner;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextBlock getInstruction() {
        return this.instruction;
    }

    @NotNull
    public final ReturnListEmptyDto copy(@i(name = "banner") @NotNull TextBlock banner, @i(name = "instruction") @NotNull TextBlock instruction) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        return new ReturnListEmptyDto(banner, instruction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnListEmptyDto)) {
            return false;
        }
        ReturnListEmptyDto returnListEmptyDto = (ReturnListEmptyDto) other;
        return Intrinsics.d(this.banner, returnListEmptyDto.banner) && Intrinsics.d(this.instruction, returnListEmptyDto.instruction);
    }

    @NotNull
    public final TextBlock getBanner() {
        return this.banner;
    }

    @NotNull
    public final TextBlock getInstruction() {
        return this.instruction;
    }

    public int hashCode() {
        return this.instruction.hashCode() + (this.banner.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnListEmptyDto(banner=" + this.banner + ", instruction=" + this.instruction + ")";
    }
}
