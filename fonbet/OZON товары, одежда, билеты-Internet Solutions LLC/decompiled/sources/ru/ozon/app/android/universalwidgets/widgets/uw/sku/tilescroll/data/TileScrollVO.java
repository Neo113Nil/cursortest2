package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data;

import F3.G;
import G.g;
import Nh.a;
import Nh.b;
import Ve.C4598rp;
import WZ.t;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.tiles.tilescroll.data.InsightTileScrollPlaceholder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileItem;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileMoleculeVO;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u00019B[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/product/tiles/tilescroll/data/InsightTileScrollPlaceholder;", "", "id", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO;", "items", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileModelImage;", "prefetchedItems", "", "backgroundColor", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "themeVO", "Landroid/os/Parcelable;", "layoutManagerState", "", "resetScroll", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/product/common/TileThemeConfigVO;Landroid/os/Parcelable;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getPrefetchedItems", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getThemeVO", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "Z", "getResetScroll", "()Z", "setResetScroll", "(Z)V", "ItemVO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TileScrollVO implements c, InsightTileScrollPlaceholder {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final List<ItemVO> items;
    private Parcelable layoutManagerState;

    @NotNull
    private final List<SmallTileModelImage> prefetchedItems;
    private boolean resetScroll;
    private final TestInfo testInfo;

    @NotNull
    private final TileThemeConfigVO themeVO;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "<init>", "(J)V", "J", "getId", "()J", "TileVO", "BannerVO", "TrailedActionVO", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TileVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ItemVO implements c {
        private final long id;

        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001:\u000278BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "bannerImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "cornerRoundPx", "Lru/ozon/uni/atoms/data/text/TextDTO;", "topTextAtom", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "bottomBannerItem", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$GradientModelVO;", "gradientModel", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/Float;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$GradientModelVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBannerImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/Float;", "getCornerRoundPx", "()Ljava/lang/Float;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTopTextAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "getBottomBannerItem", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$GradientModelVO;", "getGradientModel", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$GradientModelVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "BottomBannerItem", "GradientModelVO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BannerVO extends ItemVO {

            @NotNull
            private final AtomAction action;

            @NotNull
            private final ImageDTO bannerImage;
            private final BottomBannerItem bottomBannerItem;
            private final Float cornerRoundPx;
            private final GradientModelVO gradientModel;
            private final long id;
            private final t tokenizedEvent;
            private final TextDTO topTextAtom;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Image", "Button", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem$Button;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem$Image;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class BottomBannerItem {

                @NotNull
                private final AtomDTO atom;

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem$Button;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAtom", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Button extends BottomBannerItem {

                    @NotNull
                    private final ButtonV3DTO atom;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Button(@NotNull ButtonV3DTO atom) {
                        super(atom, null);
                        Intrinsics.checkNotNullParameter(atom, "atom");
                        this.atom = atom;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Button) && Intrinsics.d(this.atom, ((Button) other).atom);
                    }

                    @NotNull
                    public ButtonV3DTO getAtom() {
                        return this.atom;
                    }

                    public int hashCode() {
                        return this.atom.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return G.b(this.atom, "Button(atom=", ")");
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem$Image;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$BottomBannerItem;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Image extends BottomBannerItem {

                    @NotNull
                    private final ImageDTO atom;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Image(@NotNull ImageDTO atom) {
                        super(atom, null);
                        Intrinsics.checkNotNullParameter(atom, "atom");
                        this.atom = atom;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Image) && Intrinsics.d(this.atom, ((Image) other).atom);
                    }

                    @NotNull
                    public ImageDTO getAtom() {
                        return this.atom;
                    }

                    public int hashCode() {
                        return this.atom.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Image(atom=" + this.atom + ")";
                    }
                }

                public /* synthetic */ BottomBannerItem(AtomDTO atomDTO, DefaultConstructorMarker defaultConstructorMarker) {
                    this(atomDTO);
                }

                private BottomBannerItem(AtomDTO atomDTO) {
                    this.atom = atomDTO;
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$GradientModelVO;", "", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "gradient", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "direction", "<init>", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;Landroid/graphics/drawable/GradientDrawable$Orientation;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "getDirection", "()Landroid/graphics/drawable/GradientDrawable$Orientation;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class GradientModelVO {

                @NotNull
                private final GradientDrawable.Orientation direction;

                @NotNull
                private final Color.Gradient gradient;

                public GradientModelVO(@NotNull Color.Gradient gradient, @NotNull GradientDrawable.Orientation direction) {
                    Intrinsics.checkNotNullParameter(gradient, "gradient");
                    Intrinsics.checkNotNullParameter(direction, "direction");
                    this.gradient = gradient;
                    this.direction = direction;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof GradientModelVO)) {
                        return false;
                    }
                    GradientModelVO gradientModelVO = (GradientModelVO) other;
                    return Intrinsics.d(this.gradient, gradientModelVO.gradient) && this.direction == gradientModelVO.direction;
                }

                @NotNull
                public final GradientDrawable.Orientation getDirection() {
                    return this.direction;
                }

                @NotNull
                public final Color.Gradient getGradient() {
                    return this.gradient;
                }

                public int hashCode() {
                    return this.direction.hashCode() + (this.gradient.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "GradientModelVO(gradient=" + this.gradient + ", direction=" + this.direction + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BannerVO(long j11, @NotNull ImageDTO bannerImage, @NotNull AtomAction action, Float f7, TextDTO textDTO, BottomBannerItem bottomBannerItem, GradientModelVO gradientModelVO, t tVar) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(bannerImage, "bannerImage");
                Intrinsics.checkNotNullParameter(action, "action");
                this.id = j11;
                this.bannerImage = bannerImage;
                this.action = action;
                this.cornerRoundPx = f7;
                this.topTextAtom = textDTO;
                this.bottomBannerItem = bottomBannerItem;
                this.gradientModel = gradientModelVO;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerVO)) {
                    return false;
                }
                BannerVO bannerVO = (BannerVO) other;
                return this.id == bannerVO.id && Intrinsics.d(this.bannerImage, bannerVO.bannerImage) && Intrinsics.d(this.action, bannerVO.action) && Intrinsics.d(this.cornerRoundPx, bannerVO.cornerRoundPx) && Intrinsics.d(this.topTextAtom, bannerVO.topTextAtom) && Intrinsics.d(this.bottomBannerItem, bannerVO.bottomBannerItem) && Intrinsics.d(this.gradientModel, bannerVO.gradientModel) && Intrinsics.d(this.tokenizedEvent, bannerVO.tokenizedEvent);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final ImageDTO getBannerImage() {
                return this.bannerImage;
            }

            public final BottomBannerItem getBottomBannerItem() {
                return this.bottomBannerItem;
            }

            public final Float getCornerRoundPx() {
                return this.cornerRoundPx;
            }

            public final GradientModelVO getGradientModel() {
                return this.gradientModel;
            }

            @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO.ItemVO, l20.c
            public long getId() {
                return this.id;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public final TextDTO getTopTextAtom() {
                return this.topTextAtom;
            }

            public int hashCode() {
                int a11 = C4598rp.a(this.action, a.b(this.bannerImage, Long.hashCode(this.id) * 31, 31), 31);
                Float f7 = this.cornerRoundPx;
                int hashCode = (a11 + (f7 == null ? 0 : f7.hashCode())) * 31;
                TextDTO textDTO = this.topTextAtom;
                int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                BottomBannerItem bottomBannerItem = this.bottomBannerItem;
                int hashCode3 = (hashCode2 + (bottomBannerItem == null ? 0 : bottomBannerItem.hashCode())) * 31;
                GradientModelVO gradientModelVO = this.gradientModel;
                int hashCode4 = (hashCode3 + (gradientModelVO == null ? 0 : gradientModelVO.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                ImageDTO imageDTO = this.bannerImage;
                AtomAction atomAction = this.action;
                Float f7 = this.cornerRoundPx;
                TextDTO textDTO = this.topTextAtom;
                BottomBannerItem bottomBannerItem = this.bottomBannerItem;
                GradientModelVO gradientModelVO = this.gradientModel;
                t tVar = this.tokenizedEvent;
                StringBuilder c11 = b.c("BannerVO(id=", j11, ", bannerImage=", imageDTO);
                c11.append(", action=");
                c11.append(atomAction);
                c11.append(", cornerRoundPx=");
                c11.append(f7);
                c11.append(", topTextAtom=");
                c11.append(textDTO);
                c11.append(", bottomBannerItem=");
                c11.append(bottomBannerItem);
                c11.append(", gradientModel=");
                c11.append(gradientModelVO);
                c11.append(", tokenizedEvent=");
                c11.append(tVar);
                c11.append(")");
                return c11.toString();
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TileVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileItem;", "", "id", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "model", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "getModel", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileMoleculeVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TileVO extends ItemVO implements SmallTileItem {
            private final long id;

            @NotNull
            private final SmallTileMoleculeVO model;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TileVO(long j11, @NotNull SmallTileMoleculeVO model, t tVar) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(model, "model");
                this.id = j11;
                this.model = model;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TileVO)) {
                    return false;
                }
                TileVO tileVO = (TileVO) other;
                return this.id == tileVO.id && Intrinsics.d(this.model, tileVO.model) && Intrinsics.d(this.tokenizedEvent, tileVO.tokenizedEvent);
            }

            @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO.ItemVO, l20.c
            public long getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileItem
            @NotNull
            public SmallTileMoleculeVO getModel() {
                return this.model;
            }

            @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileItem
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = (this.model.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                SmallTileMoleculeVO smallTileMoleculeVO = this.model;
                t tVar = this.tokenizedEvent;
                StringBuilder sb2 = new StringBuilder("TileVO(id=");
                sb2.append(j11);
                sb2.append(", model=");
                sb2.append(smallTileMoleculeVO);
                return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$TrailedActionVO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textAtom", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTextAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TrailedActionVO extends ItemVO {
            private final AtomAction action;

            @NotNull
            private final IconButtonV3DTO iconButton;
            private final long id;

            @NotNull
            private final TextDTO textAtom;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TrailedActionVO(long j11, @NotNull IconButtonV3DTO iconButton, @NotNull TextDTO textAtom, AtomAction atomAction) {
                super(j11, null);
                Intrinsics.checkNotNullParameter(iconButton, "iconButton");
                Intrinsics.checkNotNullParameter(textAtom, "textAtom");
                this.id = j11;
                this.iconButton = iconButton;
                this.textAtom = textAtom;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TrailedActionVO)) {
                    return false;
                }
                TrailedActionVO trailedActionVO = (TrailedActionVO) other;
                return this.id == trailedActionVO.id && Intrinsics.d(this.iconButton, trailedActionVO.iconButton) && Intrinsics.d(this.textAtom, trailedActionVO.textAtom) && Intrinsics.d(this.action, trailedActionVO.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final IconButtonV3DTO getIconButton() {
                return this.iconButton;
            }

            @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO.ItemVO, l20.c
            public long getId() {
                return this.id;
            }

            @NotNull
            public final TextDTO getTextAtom() {
                return this.textAtom;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.textAtom, GR.b.c(this.iconButton, Long.hashCode(this.id) * 31, 31), 31);
                AtomAction atomAction = this.action;
                return a11 + (atomAction == null ? 0 : atomAction.hashCode());
            }

            @NotNull
            public String toString() {
                return "TrailedActionVO(id=" + this.id + ", iconButton=" + this.iconButton + ", textAtom=" + this.textAtom + ", action=" + this.action + ")";
            }
        }

        public /* synthetic */ ItemVO(long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return null;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return hashCode();
        }

        private ItemVO(long j11) {
            this.id = j11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TileScrollVO(long j11, @NotNull List<? extends ItemVO> items, @NotNull List<SmallTileModelImage> prefetchedItems, String str, TestInfo testInfo, @NotNull TileThemeConfigVO themeVO, Parcelable parcelable, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(prefetchedItems, "prefetchedItems");
        Intrinsics.checkNotNullParameter(themeVO, "themeVO");
        this.id = j11;
        this.items = items;
        this.prefetchedItems = prefetchedItems;
        this.backgroundColor = str;
        this.testInfo = testInfo;
        this.themeVO = themeVO;
        this.layoutManagerState = parcelable;
        this.resetScroll = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileScrollVO)) {
            return false;
        }
        TileScrollVO tileScrollVO = (TileScrollVO) other;
        return this.id == tileScrollVO.id && Intrinsics.d(this.items, tileScrollVO.items) && Intrinsics.d(this.prefetchedItems, tileScrollVO.prefetchedItems) && Intrinsics.d(this.backgroundColor, tileScrollVO.backgroundColor) && Intrinsics.d(this.testInfo, tileScrollVO.testInfo) && Intrinsics.d(this.themeVO, tileScrollVO.themeVO) && Intrinsics.d(this.layoutManagerState, tileScrollVO.layoutManagerState) && this.resetScroll == tileScrollVO.resetScroll;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ItemVO> getItems() {
        return this.items;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @NotNull
    public final List<SmallTileModelImage> getPrefetchedItems() {
        return this.prefetchedItems;
    }

    public final boolean getResetScroll() {
        return this.resetScroll;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TileThemeConfigVO getThemeVO() {
        return this.themeVO;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.prefetchedItems);
        String str = this.backgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (this.themeVO.hashCode() + ((hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31)) * 31;
        Parcelable parcelable = this.layoutManagerState;
        return Boolean.hashCode(this.resetScroll) + ((hashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    public final void setResetScroll(boolean z11) {
        this.resetScroll = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ItemVO> list = this.items;
        List<SmallTileModelImage> list2 = this.prefetchedItems;
        String str = this.backgroundColor;
        TestInfo testInfo = this.testInfo;
        TileThemeConfigVO tileThemeConfigVO = this.themeVO;
        Parcelable parcelable = this.layoutManagerState;
        boolean z11 = this.resetScroll;
        StringBuilder b11 = Lh.b.b(j11, "TileScrollVO(id=", ", items=", list);
        b11.append(", prefetchedItems=");
        b11.append(list2);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", testInfo=");
        b11.append(testInfo);
        b11.append(", themeVO=");
        b11.append(tileThemeConfigVO);
        b11.append(", layoutManagerState=");
        b11.append(parcelable);
        b11.append(", resetScroll=");
        b11.append(z11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ TileScrollVO(long j11, List list, List list2, String str, TestInfo testInfo, TileThemeConfigVO tileThemeConfigVO, Parcelable parcelable, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, list2, str, testInfo, tileThemeConfigVO, parcelable, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z11);
    }
}
