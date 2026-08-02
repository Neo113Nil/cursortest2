package ru.ozon.app.android.ui.widgets.textWidget.presentation;

import B0.C2454a;
import Bi.a;
import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.listItem.data.ListCellWrapperPreset;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.OrderedListCellDTO;
import ru.ozon.uni.atoms.data.cell.UnorderedListCellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J`\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0015R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "atoms", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "leftLayoutPadding", "rightLayoutPadding", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;LWZ/t;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;LWZ/t;)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getLeftLayoutPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightLayoutPadding", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getViewEvent", "()LWZ/t;", "TextWidgetItemVO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextWidgetVO implements c {

    @NotNull
    private final List<TextWidgetItemVO> atoms;
    private final String backgroundColor;
    private final long id;
    private final CommonCellSettings.LayoutPadding leftLayoutPadding;
    private final CommonCellSettings.LayoutPadding rightLayoutPadding;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "", "<init>", "()V", "", "getId", "()I", "id", "TextVO", "TextExpandableVO", "OrderedListCellVO", "UnorderedListCellVO", "ImageVO", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$ImageVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$OrderedListCellVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$UnorderedListCellVO;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TextWidgetItemVO {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$ImageVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "<init>", "(ILru/ozon/uni/atoms/data/image/ImageDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageVO extends TextWidgetItemVO {
            private final int id;

            @NotNull
            private final ImageDTO image;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageVO(int i11, @NotNull ImageDTO image) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.id = i11;
                this.image = image;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageVO)) {
                    return false;
                }
                ImageVO imageVO = (ImageVO) other;
                return this.id == imageVO.id && Intrinsics.d(this.image, imageVO.image);
            }

            @Override // ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO.TextWidgetItemVO
            public int getId() {
                return this.id;
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.image.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "ImageVO(id=" + this.id + ", image=" + this.image + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$OrderedListCellVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "", "id", "Lru/ozon/uni/atoms/data/cell/OrderedListCellDTO;", "cell", "numberOfItem", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "preset", "<init>", "(ILru/ozon/uni/atoms/data/cell/OrderedListCellDTO;ILru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/cell/OrderedListCellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/cell/OrderedListCellDTO;", "getNumberOfItem", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OrderedListCellVO extends TextWidgetItemVO {

            @NotNull
            private final OrderedListCellDTO cell;
            private final int id;
            private final int numberOfItem;

            @NotNull
            private final ListCellWrapperPreset preset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderedListCellVO(int i11, @NotNull OrderedListCellDTO cell, int i12, @NotNull ListCellWrapperPreset preset) {
                super(null);
                Intrinsics.checkNotNullParameter(cell, "cell");
                Intrinsics.checkNotNullParameter(preset, "preset");
                this.id = i11;
                this.cell = cell;
                this.numberOfItem = i12;
                this.preset = preset;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderedListCellVO)) {
                    return false;
                }
                OrderedListCellVO orderedListCellVO = (OrderedListCellVO) other;
                return this.id == orderedListCellVO.id && Intrinsics.d(this.cell, orderedListCellVO.cell) && this.numberOfItem == orderedListCellVO.numberOfItem && Intrinsics.d(this.preset, orderedListCellVO.preset);
            }

            @NotNull
            public final OrderedListCellDTO getCell() {
                return this.cell;
            }

            @Override // ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO.TextWidgetItemVO
            public int getId() {
                return this.id;
            }

            public final int getNumberOfItem() {
                return this.numberOfItem;
            }

            @NotNull
            public final ListCellWrapperPreset getPreset() {
                return this.preset;
            }

            public int hashCode() {
                return this.preset.hashCode() + C2454a.a(this.numberOfItem, (this.cell.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31);
            }

            @NotNull
            public String toString() {
                return "OrderedListCellVO(id=" + this.id + ", cell=" + this.cell + ", numberOfItem=" + this.numberOfItem + ", preset=" + this.preset + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "", "id", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "text", "<init>", "(ILru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;)V", "copy", "(ILru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;)Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextExpandableVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextExpandableVO extends TextWidgetItemVO {
            private final int id;

            @NotNull
            private final ExpandableTextDTO text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextExpandableVO(int i11, @NotNull ExpandableTextDTO text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.id = i11;
                this.text = text;
            }

            public static /* synthetic */ TextExpandableVO copy$default(TextExpandableVO textExpandableVO, int i11, ExpandableTextDTO expandableTextDTO, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = textExpandableVO.id;
                }
                if ((i12 & 2) != 0) {
                    expandableTextDTO = textExpandableVO.text;
                }
                return textExpandableVO.copy(i11, expandableTextDTO);
            }

            @NotNull
            public final TextExpandableVO copy(int id2, @NotNull ExpandableTextDTO text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new TextExpandableVO(id2, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextExpandableVO)) {
                    return false;
                }
                TextExpandableVO textExpandableVO = (TextExpandableVO) other;
                return this.id == textExpandableVO.id && Intrinsics.d(this.text, textExpandableVO.text);
            }

            @Override // ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO.TextWidgetItemVO
            public int getId() {
                return this.id;
            }

            @NotNull
            public final ExpandableTextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "TextExpandableVO(id=" + this.id + ", text=" + this.text + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$TextVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextVO extends TextWidgetItemVO {
            private final int id;

            @NotNull
            private final TextDTO text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextVO(int i11, @NotNull TextDTO text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.id = i11;
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextVO)) {
                    return false;
                }
                TextVO textVO = (TextVO) other;
                return this.id == textVO.id && Intrinsics.d(this.text, textVO.text);
            }

            @Override // ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO.TextWidgetItemVO
            public int getId() {
                return this.id;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "TextVO(id=" + this.id + ", text=" + this.text + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO$UnorderedListCellVO;", "Lru/ozon/app/android/ui/widgets/textWidget/presentation/TextWidgetVO$TextWidgetItemVO;", "", "id", "Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;", "cell", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "preset", "<init>", "(ILru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnorderedListCellVO extends TextWidgetItemVO {

            @NotNull
            private final UnorderedListCellDTO cell;
            private final int id;

            @NotNull
            private final ListCellWrapperPreset preset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnorderedListCellVO(int i11, @NotNull UnorderedListCellDTO cell, @NotNull ListCellWrapperPreset preset) {
                super(null);
                Intrinsics.checkNotNullParameter(cell, "cell");
                Intrinsics.checkNotNullParameter(preset, "preset");
                this.id = i11;
                this.cell = cell;
                this.preset = preset;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnorderedListCellVO)) {
                    return false;
                }
                UnorderedListCellVO unorderedListCellVO = (UnorderedListCellVO) other;
                return this.id == unorderedListCellVO.id && Intrinsics.d(this.cell, unorderedListCellVO.cell) && Intrinsics.d(this.preset, unorderedListCellVO.preset);
            }

            @NotNull
            public final UnorderedListCellDTO getCell() {
                return this.cell;
            }

            @Override // ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO.TextWidgetItemVO
            public int getId() {
                return this.id;
            }

            @NotNull
            public final ListCellWrapperPreset getPreset() {
                return this.preset;
            }

            public int hashCode() {
                return this.preset.hashCode() + ((this.cell.hashCode() + (Integer.hashCode(this.id) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                return "UnorderedListCellVO(id=" + this.id + ", cell=" + this.cell + ", preset=" + this.preset + ")";
            }
        }

        public /* synthetic */ TextWidgetItemVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getId();

        private TextWidgetItemVO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextWidgetVO(long j11, @NotNull List<? extends TextWidgetItemVO> atoms, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, String str, t tVar) {
        Intrinsics.checkNotNullParameter(atoms, "atoms");
        this.id = j11;
        this.atoms = atoms;
        this.leftLayoutPadding = layoutPadding;
        this.rightLayoutPadding = layoutPadding2;
        this.backgroundColor = str;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ TextWidgetVO copy$default(TextWidgetVO textWidgetVO, long j11, List list, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, String str, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = textWidgetVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = textWidgetVO.atoms;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            layoutPadding = textWidgetVO.leftLayoutPadding;
        }
        CommonCellSettings.LayoutPadding layoutPadding3 = layoutPadding;
        if ((i11 & 8) != 0) {
            layoutPadding2 = textWidgetVO.rightLayoutPadding;
        }
        CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding2;
        if ((i11 & 16) != 0) {
            str = textWidgetVO.backgroundColor;
        }
        String str2 = str;
        if ((i11 & 32) != 0) {
            tVar = textWidgetVO.viewEvent;
        }
        return textWidgetVO.copy(j12, list2, layoutPadding3, layoutPadding4, str2, tVar);
    }

    @NotNull
    public final TextWidgetVO copy(long id2, @NotNull List<? extends TextWidgetItemVO> atoms, CommonCellSettings.LayoutPadding leftLayoutPadding, CommonCellSettings.LayoutPadding rightLayoutPadding, String backgroundColor, t viewEvent) {
        Intrinsics.checkNotNullParameter(atoms, "atoms");
        return new TextWidgetVO(id2, atoms, leftLayoutPadding, rightLayoutPadding, backgroundColor, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextWidgetVO)) {
            return false;
        }
        TextWidgetVO textWidgetVO = (TextWidgetVO) other;
        return this.id == textWidgetVO.id && Intrinsics.d(this.atoms, textWidgetVO.atoms) && this.leftLayoutPadding == textWidgetVO.leftLayoutPadding && this.rightLayoutPadding == textWidgetVO.rightLayoutPadding && Intrinsics.d(this.backgroundColor, textWidgetVO.backgroundColor) && Intrinsics.d(this.viewEvent, textWidgetVO.viewEvent);
    }

    @NotNull
    public final List<TextWidgetItemVO> getAtoms() {
        return this.atoms;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CommonCellSettings.LayoutPadding getLeftLayoutPadding() {
        return this.leftLayoutPadding;
    }

    public final CommonCellSettings.LayoutPadding getRightLayoutPadding() {
        return this.rightLayoutPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.atoms);
        CommonCellSettings.LayoutPadding layoutPadding = this.leftLayoutPadding;
        int hashCode = (b11 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightLayoutPadding;
        int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TextWidgetItemVO> list = this.atoms;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftLayoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightLayoutPadding;
        String str = this.backgroundColor;
        t tVar = this.viewEvent;
        StringBuilder b11 = b.b(j11, "TextWidgetVO(id=", ", atoms=", list);
        b11.append(", leftLayoutPadding=");
        b11.append(layoutPadding);
        b11.append(", rightLayoutPadding=");
        b11.append(layoutPadding2);
        a.f(b11, ", backgroundColor=", str, ", viewEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
