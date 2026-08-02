package ru.ozon.app.android.returns.listEmpty.presentation;

import Ak.C2436a;
import B90.C2619v;
import Co.a;
import D3.h;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0014\u0015R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO;", "Ll20/c;", "", "getColor", "()Ljava/lang/String;", "color", "getImage", "image", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getImageSize", "()Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCallToAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "callToAction", "Banner", "Instruction", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Banner;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface TextBlockVO extends c {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Banner;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO;", "", "id", "", "color", "image", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "callToAction", "", "textRows", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getColor", "getImage", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getImageSize", "()Lru/ozon/app/android/pikazon/image/ImageSize;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCallToAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getTextRows", "()Ljava/util/List;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner implements TextBlockVO {
        private final ButtonV3Atom.LargeButton callToAction;

        @NotNull
        private final String color;

        @NotNull
        private final TextAtom header;
        private final long id;

        @NotNull
        private final String image;

        @NotNull
        private final ImageSize imageSize;

        @NotNull
        private final List<TextAtom> textRows;

        public Banner(long j11, @NotNull String color, @NotNull String image, @NotNull ImageSize imageSize, @NotNull TextAtom header, ButtonV3Atom.LargeButton largeButton, @NotNull List<TextAtom> textRows) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(textRows, "textRows");
            this.id = j11;
            this.color = color;
            this.image = image;
            this.imageSize = imageSize;
            this.header = header;
            this.callToAction = largeButton;
            this.textRows = textRows;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return this.id == banner.id && Intrinsics.d(this.color, banner.color) && Intrinsics.d(this.image, banner.image) && Intrinsics.d(this.imageSize, banner.imageSize) && Intrinsics.d(this.header, banner.header) && Intrinsics.d(this.callToAction, banner.callToAction) && Intrinsics.d(this.textRows, banner.textRows);
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        public ButtonV3Atom.LargeButton getCallToAction() {
            return this.callToAction;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public String getColor() {
            return this.color;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public TextAtom getHeader() {
            return this.header;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public String getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public ImageSize getImageSize() {
            return this.imageSize;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final List<TextAtom> getTextRows() {
            return this.textRows;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int b11 = C2619v.b((this.imageSize.hashCode() + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.color), 31, this.image)) * 31, 31, this.header);
            ButtonV3Atom.LargeButton largeButton = this.callToAction;
            return this.textRows.hashCode() + ((b11 + (largeButton == null ? 0 : largeButton.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.color;
            String str2 = this.image;
            ImageSize imageSize = this.imageSize;
            TextAtom textAtom = this.header;
            ButtonV3Atom.LargeButton largeButton = this.callToAction;
            List<TextAtom> list = this.textRows;
            StringBuilder c11 = C2436a.c(j11, "Banner(id=", ", color=", str);
            c11.append(", image=");
            c11.append(str2);
            c11.append(", imageSize=");
            c11.append(imageSize);
            c11.append(", header=");
            c11.append(textAtom);
            c11.append(", callToAction=");
            c11.append(largeButton);
            return h.c(c11, ", textRows=", list, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull TextBlockVO textBlockVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull TextBlockVO textBlockVO) {
            return textBlockVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO;", "", "id", "", "color", "image", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "callToAction", "", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;", "items", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getColor", "getImage", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getImageSize", "()Lru/ozon/app/android/pikazon/image/ImageSize;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCallToAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Item", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Instruction implements TextBlockVO {
        private final ButtonV3Atom.LargeButton callToAction;

        @NotNull
        private final String color;

        @NotNull
        private final TextAtom header;
        private final long id;

        @NotNull
        private final String image;

        @NotNull
        private final ImageSize imageSize;

        @NotNull
        private final List<Item> items;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction$Item;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "ordinalNumber", "content", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOrdinalNumber", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getContent", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Item {
            public static final int $stable = TextAtom.$stable;

            @NotNull
            private final TextAtom content;

            @NotNull
            private final TextAtom ordinalNumber;

            public Item(@NotNull TextAtom ordinalNumber, @NotNull TextAtom content) {
                Intrinsics.checkNotNullParameter(ordinalNumber, "ordinalNumber");
                Intrinsics.checkNotNullParameter(content, "content");
                this.ordinalNumber = ordinalNumber;
                this.content = content;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return Intrinsics.d(this.ordinalNumber, item.ordinalNumber) && Intrinsics.d(this.content, item.content);
            }

            @NotNull
            public final TextAtom getContent() {
                return this.content;
            }

            @NotNull
            public final TextAtom getOrdinalNumber() {
                return this.ordinalNumber;
            }

            public int hashCode() {
                return this.content.hashCode() + (this.ordinalNumber.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return a.a("Item(ordinalNumber=", this.ordinalNumber, ", content=", this.content, ")");
            }
        }

        public Instruction(long j11, @NotNull String color, @NotNull String image, @NotNull ImageSize imageSize, @NotNull TextAtom header, ButtonV3Atom.LargeButton largeButton, @NotNull List<Item> items) {
            Intrinsics.checkNotNullParameter(color, "color");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(imageSize, "imageSize");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(items, "items");
            this.id = j11;
            this.color = color;
            this.image = image;
            this.imageSize = imageSize;
            this.header = header;
            this.callToAction = largeButton;
            this.items = items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Instruction)) {
                return false;
            }
            Instruction instruction = (Instruction) other;
            return this.id == instruction.id && Intrinsics.d(this.color, instruction.color) && Intrinsics.d(this.image, instruction.image) && Intrinsics.d(this.imageSize, instruction.imageSize) && Intrinsics.d(this.header, instruction.header) && Intrinsics.d(this.callToAction, instruction.callToAction) && Intrinsics.d(this.items, instruction.items);
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        public ButtonV3Atom.LargeButton getCallToAction() {
            return this.callToAction;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public String getColor() {
            return this.color;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public TextAtom getHeader() {
            return this.header;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public String getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.returns.listEmpty.presentation.TextBlockVO
        @NotNull
        public ImageSize getImageSize() {
            return this.imageSize;
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int b11 = C2619v.b((this.imageSize.hashCode() + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.color), 31, this.image)) * 31, 31, this.header);
            ButtonV3Atom.LargeButton largeButton = this.callToAction;
            return this.items.hashCode() + ((b11 + (largeButton == null ? 0 : largeButton.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.color;
            String str2 = this.image;
            ImageSize imageSize = this.imageSize;
            TextAtom textAtom = this.header;
            ButtonV3Atom.LargeButton largeButton = this.callToAction;
            List<Item> list = this.items;
            StringBuilder c11 = C2436a.c(j11, "Instruction(id=", ", color=", str);
            c11.append(", image=");
            c11.append(str2);
            c11.append(", imageSize=");
            c11.append(imageSize);
            c11.append(", header=");
            c11.append(textAtom);
            c11.append(", callToAction=");
            c11.append(largeButton);
            return h.c(c11, ", items=", list, ")");
        }
    }

    ButtonV3Atom.LargeButton getCallToAction();

    @NotNull
    String getColor();

    @NotNull
    TextAtom getHeader();

    @NotNull
    String getImage();

    @NotNull
    ImageSize getImageSize();
}
