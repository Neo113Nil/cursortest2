package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import J0.P;
import Kk.C3532b;
import Pk0.a;
import T7.E;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004'()*B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;", CommentV3DTO.HEADER_FIELD_NAME, "body", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;", "headerImage", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;", "getHeader", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;", "getBody", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;", "getHeaderImage", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Content", "ContentItem", "Image", "Paddings", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MilesForBuyersModalInfoVO implements c {

    @NotNull
    private final Content body;

    @NotNull
    private final Content header;
    private final Image headerImage;
    private final long id;
    private final t viewEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;", "", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "items", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Paddings;", "paddings", "", "backgroundColor", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Paddings;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Paddings;", "getPaddings", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Paddings;", "Ljava/lang/String;", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        private final String backgroundColor;

        @NotNull
        private final List<ContentItem> items;

        @NotNull
        private final Paddings paddings;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@NotNull List<? extends ContentItem> items, @NotNull Paddings paddings, String str) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(paddings, "paddings");
            this.items = items;
            this.paddings = paddings;
            this.backgroundColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.items, content.items) && Intrinsics.d(this.paddings, content.paddings) && Intrinsics.d(this.backgroundColor, content.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<ContentItem> getItems() {
            return this.items;
        }

        @NotNull
        public final Paddings getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            int hashCode = (this.paddings.hashCode() + (this.items.hashCode() * 31)) * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            List<ContentItem> list = this.items;
            Paddings paddings = this.paddings;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("Content(items=");
            sb2.append(list);
            sb2.append(", paddings=");
            sb2.append(paddings);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "", "TextItem", "IconItem", "ProgressItem", "SeparatorItem", "CellItem", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$CellItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$IconItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$ProgressItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$SeparatorItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$TextItem;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ContentItem {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$CellItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellItem implements ContentItem {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final CellDTO cell;

            public CellItem(@NotNull CellDTO cell) {
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.cell = cell;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CellItem) && Intrinsics.d(this.cell, ((CellItem) other).cell);
            }

            @NotNull
            public final CellDTO getCell() {
                return this.cell;
            }

            public int hashCode() {
                return this.cell.hashCode();
            }

            @NotNull
            public String toString() {
                return "CellItem(cell=" + this.cell + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$IconItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconItem implements ContentItem {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO icon;

            public IconItem(@NotNull IconDTO icon) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.icon = icon;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconItem) && Intrinsics.d(this.icon, ((IconItem) other).icon);
            }

            @NotNull
            public final IconDTO getIcon() {
                return this.icon;
            }

            public int hashCode() {
                return this.icon.hashCode();
            }

            @NotNull
            public String toString() {
                return "IconItem(icon=" + this.icon + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$ProgressItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "progress", "", "progressBackgroundColor", "", "paddingLeft", "progressHeight", "<init>", "(Lru/ozon/app/android/atoms/data/progress/ProgressBar;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "getProgress", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "Ljava/lang/String;", "getProgressBackgroundColor", "I", "getPaddingLeft", "getProgressHeight", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProgressItem implements ContentItem {
            private final int paddingLeft;

            @NotNull
            private final ProgressBar progress;
            private final String progressBackgroundColor;
            private final int progressHeight;

            public ProgressItem(@NotNull ProgressBar progress, String str, int i11, int i12) {
                Intrinsics.checkNotNullParameter(progress, "progress");
                this.progress = progress;
                this.progressBackgroundColor = str;
                this.paddingLeft = i11;
                this.progressHeight = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProgressItem)) {
                    return false;
                }
                ProgressItem progressItem = (ProgressItem) other;
                return Intrinsics.d(this.progress, progressItem.progress) && Intrinsics.d(this.progressBackgroundColor, progressItem.progressBackgroundColor) && this.paddingLeft == progressItem.paddingLeft && this.progressHeight == progressItem.progressHeight;
            }

            public final int getPaddingLeft() {
                return this.paddingLeft;
            }

            @NotNull
            public final ProgressBar getProgress() {
                return this.progress;
            }

            public final String getProgressBackgroundColor() {
                return this.progressBackgroundColor;
            }

            public final int getProgressHeight() {
                return this.progressHeight;
            }

            public int hashCode() {
                int hashCode = this.progress.hashCode() * 31;
                String str = this.progressBackgroundColor;
                return Integer.hashCode(this.progressHeight) + C2454a.a(this.paddingLeft, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }

            @NotNull
            public String toString() {
                ProgressBar progressBar = this.progress;
                String str = this.progressBackgroundColor;
                int i11 = this.paddingLeft;
                int i12 = this.progressHeight;
                StringBuilder sb2 = new StringBuilder("ProgressItem(progress=");
                sb2.append(progressBar);
                sb2.append(", progressBackgroundColor=");
                sb2.append(str);
                sb2.append(", paddingLeft=");
                return P.a(i11, i12, ", progressHeight=", ")", sb2);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$SeparatorItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "", "height", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SeparatorItem implements ContentItem {
            private final int height;

            public SeparatorItem(int i11) {
                this.height = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SeparatorItem) && this.height == ((SeparatorItem) other).height;
            }

            public final int getHeight() {
                return this.height;
            }

            public int hashCode() {
                return Integer.hashCode(this.height);
            }

            @NotNull
            public String toString() {
                return E.a(this.height, "SeparatorItem(height=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem$TextItem;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$ContentItem;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextItem implements ContentItem {

            @NotNull
            private final TextDTO text;

            public TextItem(@NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextItem) && Intrinsics.d(this.text, ((TextItem) other).text);
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return "TextItem(text=" + this.text + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "isImageForeground", "isBackgroundHeader", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Z", "()Z", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {

        @NotNull
        private final ImageDTO image;
        private final boolean isBackgroundHeader;
        private final boolean isImageForeground;

        public Image(@NotNull ImageDTO image, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.isImageForeground = z11;
            this.isBackgroundHeader = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.image, image.image) && this.isImageForeground == image.isImageForeground && this.isBackgroundHeader == image.isBackgroundHeader;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isBackgroundHeader) + C3532b.a(this.image.hashCode() * 31, 31, this.isImageForeground);
        }

        /* renamed from: isBackgroundHeader, reason: from getter */
        public final boolean getIsBackgroundHeader() {
            return this.isBackgroundHeader;
        }

        /* renamed from: isImageForeground, reason: from getter */
        public final boolean getIsImageForeground() {
            return this.isImageForeground;
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            boolean z11 = this.isImageForeground;
            boolean z12 = this.isBackgroundHeader;
            StringBuilder sb2 = new StringBuilder("Image(image=");
            sb2.append(imageDTO);
            sb2.append(", isImageForeground=");
            sb2.append(z11);
            sb2.append(", isBackgroundHeader=");
            return a.a(")", sb2, z12);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Paddings;", "", "", "leading", "top", "trailing", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeading", "getTop", "getTrailing", "getBottom", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        private final int bottom;
        private final int leading;
        private final int top;
        private final int trailing;

        public Paddings(int i11, int i12, int i13, int i14) {
            this.leading = i11;
            this.top = i12;
            this.trailing = i13;
            this.bottom = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return this.leading == paddings.leading && this.top == paddings.top && this.trailing == paddings.trailing && this.bottom == paddings.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeading() {
            return this.leading;
        }

        public final int getTop() {
            return this.top;
        }

        public final int getTrailing() {
            return this.trailing;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.trailing, C2454a.a(this.top, Integer.hashCode(this.leading) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.trailing, this.bottom, ", bottom=", ")", C2438a.a("Paddings(leading=", this.leading, ", top=", ", trailing=", this.top));
        }
    }

    public MilesForBuyersModalInfoVO(long j11, @NotNull Content header, @NotNull Content body, Image image, t tVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        this.id = j11;
        this.header = header;
        this.body = body;
        this.headerImage = image;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilesForBuyersModalInfoVO)) {
            return false;
        }
        MilesForBuyersModalInfoVO milesForBuyersModalInfoVO = (MilesForBuyersModalInfoVO) other;
        return this.id == milesForBuyersModalInfoVO.id && Intrinsics.d(this.header, milesForBuyersModalInfoVO.header) && Intrinsics.d(this.body, milesForBuyersModalInfoVO.body) && Intrinsics.d(this.headerImage, milesForBuyersModalInfoVO.headerImage) && Intrinsics.d(this.viewEvent, milesForBuyersModalInfoVO.viewEvent);
    }

    @NotNull
    public final Content getBody() {
        return this.body;
    }

    @NotNull
    public final Content getHeader() {
        return this.header;
    }

    public final Image getHeaderImage() {
        return this.headerImage;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int hashCode = (this.body.hashCode() + ((this.header.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        Image image = this.headerImage;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Content content = this.header;
        Content content2 = this.body;
        Image image = this.headerImage;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("MilesForBuyersModalInfoVO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(content);
        sb2.append(", body=");
        sb2.append(content2);
        sb2.append(", headerImage=");
        sb2.append(image);
        return Lh.a.b(sb2, ", viewEvent=", tVar, ")");
    }
}
