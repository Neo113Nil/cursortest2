package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.vi;

import Kk.C3532b;
import Pk0.h;
import WZ.t;
import Xc.a;
import Xc.b;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00020\u0001:\u0003345BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery;", "gallery", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MainState;", "mainState", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MultiButton;", "multiButton", "<init>", "(JLru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MainState;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MultiButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery;", "getGallery", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MainState;", "getMainState", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MainState;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MultiButton;", "getMultiButton", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MultiButton;", "Gallery", "MainState", "MultiButton", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MaxiTileVI implements c {
    private final AtomAction action;

    @NotNull
    private final Gallery gallery;
    private final long id;

    @NotNull
    private final MainState mainState;

    @NotNull
    private final MultiButton multiButton;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001eB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery;", "", "", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;", "imageItems", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImageItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "ImageItem", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gallery {
        private final AtomAction action;

        @NotNull
        private final List<ImageItem> imageItems;
        private final TestInfo testInfo;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001:\u0001%B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem;", "", "", "link", "Landroid/widget/ImageView$ScaleType;", "scaleType", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "enableParanja", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;", "displayMode", "<init>", "(Ljava/lang/String;Landroid/widget/ImageView$ScaleType;LWZ/t;ZLru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getEnableParanja", "()Z", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;", "getDisplayMode", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;", "DisplayMode", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageItem {

            @NotNull
            private final DisplayMode displayMode;
            private final boolean enableParanja;

            @NotNull
            private final String link;

            @NotNull
            private final ImageView.ScaleType scaleType;
            private final t tokenizedEvent;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$Gallery$ImageItem$DisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "RATIO_3_4", "FULL_WIDTH", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class DisplayMode {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ DisplayMode[] $VALUES;
                public static final DisplayMode RATIO_3_4 = new DisplayMode("RATIO_3_4", 0);
                public static final DisplayMode FULL_WIDTH = new DisplayMode("FULL_WIDTH", 1);

                private static final /* synthetic */ DisplayMode[] $values() {
                    return new DisplayMode[]{RATIO_3_4, FULL_WIDTH};
                }

                static {
                    DisplayMode[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private DisplayMode(String str, int i11) {
                }

                @NotNull
                public static a<DisplayMode> getEntries() {
                    return $ENTRIES;
                }

                public static DisplayMode valueOf(String str) {
                    return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
                }

                public static DisplayMode[] values() {
                    return (DisplayMode[]) $VALUES.clone();
                }
            }

            public ImageItem(@NotNull String link, @NotNull ImageView.ScaleType scaleType, t tVar, boolean z11, @NotNull DisplayMode displayMode) {
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(scaleType, "scaleType");
                Intrinsics.checkNotNullParameter(displayMode, "displayMode");
                this.link = link;
                this.scaleType = scaleType;
                this.tokenizedEvent = tVar;
                this.enableParanja = z11;
                this.displayMode = displayMode;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageItem)) {
                    return false;
                }
                ImageItem imageItem = (ImageItem) other;
                return Intrinsics.d(this.link, imageItem.link) && this.scaleType == imageItem.scaleType && Intrinsics.d(this.tokenizedEvent, imageItem.tokenizedEvent) && this.enableParanja == imageItem.enableParanja && this.displayMode == imageItem.displayMode;
            }

            @NotNull
            public final DisplayMode getDisplayMode() {
                return this.displayMode;
            }

            public final boolean getEnableParanja() {
                return this.enableParanja;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final ImageView.ScaleType getScaleType() {
                return this.scaleType;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = (this.scaleType.hashCode() + (this.link.hashCode() * 31)) * 31;
                t tVar = this.tokenizedEvent;
                return this.displayMode.hashCode() + C3532b.a((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.enableParanja);
            }

            @NotNull
            public String toString() {
                return "ImageItem(link=" + this.link + ", scaleType=" + this.scaleType + ", tokenizedEvent=" + this.tokenizedEvent + ", enableParanja=" + this.enableParanja + ", displayMode=" + this.displayMode + ")";
            }
        }

        public Gallery(@NotNull List<ImageItem> imageItems, AtomAction atomAction, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(imageItems, "imageItems");
            this.imageItems = imageItems;
            this.action = atomAction;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gallery)) {
                return false;
            }
            Gallery gallery = (Gallery) other;
            return Intrinsics.d(this.imageItems, gallery.imageItems) && Intrinsics.d(this.action, gallery.action) && Intrinsics.d(this.testInfo, gallery.testInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final List<ImageItem> getImageItems() {
            return this.imageItems;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            int hashCode = this.imageItems.hashCode() * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<ImageItem> list = this.imageItems;
            AtomAction atomAction = this.action;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("Gallery(imageItems=");
            sb2.append(list);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MainState;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "labelList", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "getLabelList", "()Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainState {
        private final LabelListVO labelList;
        private final PriceDTO price;

        @NotNull
        private final TextDTO text;

        public MainState(@NotNull TextDTO text, PriceDTO priceDTO, LabelListVO labelListVO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.price = priceDTO;
            this.labelList = labelListVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainState)) {
                return false;
            }
            MainState mainState = (MainState) other;
            return Intrinsics.d(this.text, mainState.text) && Intrinsics.d(this.price, mainState.price) && Intrinsics.d(this.labelList, mainState.labelList);
        }

        public final LabelListVO getLabelList() {
            return this.labelList;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            LabelListVO labelListVO = this.labelList;
            return hashCode2 + (labelListVO != null ? labelListVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MainState(text=" + this.text + ", price=" + this.price + ", labelList=" + this.labelList + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/vi/MaxiTileVI$MultiButton;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "detailsButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "addToCartButton", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "addToCartConfig", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDetailsButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "getAddToCartButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "getAddToCartConfig", "()Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiButton {

        @NotNull
        private final AddToCartButtonDTO addToCartButton;

        @NotNull
        private final TileThemeConfigVO.AddToCartButtonConfigVO addToCartConfig;
        private final ButtonV3DTO detailsButton;

        public MultiButton(ButtonV3DTO buttonV3DTO, @NotNull AddToCartButtonDTO addToCartButton, @NotNull TileThemeConfigVO.AddToCartButtonConfigVO addToCartConfig) {
            Intrinsics.checkNotNullParameter(addToCartButton, "addToCartButton");
            Intrinsics.checkNotNullParameter(addToCartConfig, "addToCartConfig");
            this.detailsButton = buttonV3DTO;
            this.addToCartButton = addToCartButton;
            this.addToCartConfig = addToCartConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiButton)) {
                return false;
            }
            MultiButton multiButton = (MultiButton) other;
            return Intrinsics.d(this.detailsButton, multiButton.detailsButton) && Intrinsics.d(this.addToCartButton, multiButton.addToCartButton) && Intrinsics.d(this.addToCartConfig, multiButton.addToCartConfig);
        }

        @NotNull
        public final AddToCartButtonDTO getAddToCartButton() {
            return this.addToCartButton;
        }

        @NotNull
        public final TileThemeConfigVO.AddToCartButtonConfigVO getAddToCartConfig() {
            return this.addToCartConfig;
        }

        public final ButtonV3DTO getDetailsButton() {
            return this.detailsButton;
        }

        public int hashCode() {
            ButtonV3DTO buttonV3DTO = this.detailsButton;
            return this.addToCartConfig.hashCode() + ((this.addToCartButton.hashCode() + ((buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "MultiButton(detailsButton=" + this.detailsButton + ", addToCartButton=" + this.addToCartButton + ", addToCartConfig=" + this.addToCartConfig + ")";
        }
    }

    public MaxiTileVI(long j11, @NotNull Gallery gallery, TestInfo testInfo, AtomAction atomAction, t tVar, @NotNull MainState mainState, @NotNull MultiButton multiButton) {
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(mainState, "mainState");
        Intrinsics.checkNotNullParameter(multiButton, "multiButton");
        this.id = j11;
        this.gallery = gallery;
        this.testInfo = testInfo;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.mainState = mainState;
        this.multiButton = multiButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxiTileVI)) {
            return false;
        }
        MaxiTileVI maxiTileVI = (MaxiTileVI) other;
        return this.id == maxiTileVI.id && Intrinsics.d(this.gallery, maxiTileVI.gallery) && Intrinsics.d(this.testInfo, maxiTileVI.testInfo) && Intrinsics.d(this.action, maxiTileVI.action) && Intrinsics.d(this.tokenizedEvent, maxiTileVI.tokenizedEvent) && Intrinsics.d(this.mainState, maxiTileVI.mainState) && Intrinsics.d(this.multiButton, maxiTileVI.multiButton);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final Gallery getGallery() {
        return this.gallery;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final MainState getMainState() {
        return this.mainState;
    }

    @NotNull
    public final MultiButton getMultiButton() {
        return this.multiButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.gallery.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return this.multiButton.hashCode() + ((this.mainState.hashCode() + ((hashCode3 + (tVar != null ? tVar.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MaxiTileVI(id=" + this.id + ", gallery=" + this.gallery + ", testInfo=" + this.testInfo + ", action=" + this.action + ", tokenizedEvent=" + this.tokenizedEvent + ", mainState=" + this.mainState + ", multiButton=" + this.multiButton + ")";
    }
}
