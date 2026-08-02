package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation;

import Bl.C2639a;
import C.o0;
import De.C2860c;
import G.g;
import N3.C3660k;
import V.e;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperProgressText;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003678Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J~\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b+\u0010*R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b/\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$HighlightProduct;", "mainProducts", "subProducts", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "subtitle", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "currentMiniWidget", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "miniProgressText", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;)Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getMainProducts", "()Ljava/util/List;", "getSubProducts", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "getSubtitle", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "getMiniProgressText", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "HighlightProduct", "ProductIcon", "ProductBadge", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HighlightProductsVO implements c {
    private final HighlightsCurrentMiniWidget currentMiniWidget;
    private final long id;

    @NotNull
    private final List<HighlightProduct> mainProducts;
    private final HighlightsWrapperProgressText miniProgressText;
    private final List<HighlightProduct> subProducts;
    private final TextAtom subtitle;
    private final TextAtom title;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$HighlightProduct;", "", "", "image", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductIcon;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductBadge;", "badge", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductIcon;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductBadge;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductIcon;", "getIcon", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductIcon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductBadge;", "getBadge", "()Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductBadge;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HighlightProduct {
        private final AtomAction action;
        private final ProductBadge badge;
        private final ProductIcon icon;
        private final String image;
        private final t trackingInfo;

        public HighlightProduct(String str, ProductIcon productIcon, AtomAction atomAction, t tVar, ProductBadge productBadge) {
            this.image = str;
            this.icon = productIcon;
            this.action = atomAction;
            this.trackingInfo = tVar;
            this.badge = productBadge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightProduct)) {
                return false;
            }
            HighlightProduct highlightProduct = (HighlightProduct) other;
            return Intrinsics.d(this.image, highlightProduct.image) && Intrinsics.d(this.icon, highlightProduct.icon) && Intrinsics.d(this.action, highlightProduct.action) && Intrinsics.d(this.trackingInfo, highlightProduct.trackingInfo) && Intrinsics.d(this.badge, highlightProduct.badge);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final ProductBadge getBadge() {
            return this.badge;
        }

        public final ProductIcon getIcon() {
            return this.icon;
        }

        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ProductIcon productIcon = this.icon;
            int hashCode2 = (hashCode + (productIcon == null ? 0 : productIcon.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.trackingInfo;
            int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            ProductBadge productBadge = this.badge;
            return hashCode4 + (productBadge != null ? productBadge.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HighlightProduct(image=" + this.image + ", icon=" + this.icon + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", badge=" + this.badge + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductBadge;", "", "", "image", "tintColor", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getTintColor", "getBackgroundColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductBadge {
        private final String backgroundColor;

        @NotNull
        private final String image;
        private final String tintColor;

        public ProductBadge(@NotNull String image, String str, String str2) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.tintColor = str;
            this.backgroundColor = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductBadge)) {
                return false;
            }
            ProductBadge productBadge = (ProductBadge) other;
            return Intrinsics.d(this.image, productBadge.image) && Intrinsics.d(this.tintColor, productBadge.tintColor) && Intrinsics.d(this.backgroundColor, productBadge.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.tintColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.tintColor;
            return o0.c(C3660k.d("ProductBadge(image=", str, ", tintColor=", str2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/HighlightProductsVO$ProductIcon;", "", "", "icon", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTintColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductIcon {

        @NotNull
        private final String icon;
        private final String tintColor;

        public ProductIcon(@NotNull String icon, String str) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.tintColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductIcon)) {
                return false;
            }
            ProductIcon productIcon = (ProductIcon) other;
            return Intrinsics.d(this.icon, productIcon.icon) && Intrinsics.d(this.tintColor, productIcon.tintColor);
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            String str = this.tintColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("ProductIcon(icon=", this.icon, ", tintColor=", this.tintColor, ")");
        }
    }

    public HighlightProductsVO(long j11, TextAtom textAtom, @NotNull List<HighlightProduct> mainProducts, List<HighlightProduct> list, t tVar, TextAtom textAtom2, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget, HighlightsWrapperProgressText highlightsWrapperProgressText) {
        Intrinsics.checkNotNullParameter(mainProducts, "mainProducts");
        this.id = j11;
        this.title = textAtom;
        this.mainProducts = mainProducts;
        this.subProducts = list;
        this.trackingInfo = tVar;
        this.subtitle = textAtom2;
        this.currentMiniWidget = highlightsCurrentMiniWidget;
        this.miniProgressText = highlightsWrapperProgressText;
    }

    public static /* synthetic */ HighlightProductsVO copy$default(HighlightProductsVO highlightProductsVO, long j11, TextAtom textAtom, List list, List list2, t tVar, TextAtom textAtom2, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget, HighlightsWrapperProgressText highlightsWrapperProgressText, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = highlightProductsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textAtom = highlightProductsVO.title;
        }
        TextAtom textAtom3 = textAtom;
        if ((i11 & 4) != 0) {
            list = highlightProductsVO.mainProducts;
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = highlightProductsVO.subProducts;
        }
        return highlightProductsVO.copy(j12, textAtom3, list3, list2, (i11 & 16) != 0 ? highlightProductsVO.trackingInfo : tVar, (i11 & 32) != 0 ? highlightProductsVO.subtitle : textAtom2, (i11 & 64) != 0 ? highlightProductsVO.currentMiniWidget : highlightsCurrentMiniWidget, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? highlightProductsVO.miniProgressText : highlightsWrapperProgressText);
    }

    @NotNull
    public final HighlightProductsVO copy(long id2, TextAtom title, @NotNull List<HighlightProduct> mainProducts, List<HighlightProduct> subProducts, t trackingInfo, TextAtom subtitle, HighlightsCurrentMiniWidget currentMiniWidget, HighlightsWrapperProgressText miniProgressText) {
        Intrinsics.checkNotNullParameter(mainProducts, "mainProducts");
        return new HighlightProductsVO(id2, title, mainProducts, subProducts, trackingInfo, subtitle, currentMiniWidget, miniProgressText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightProductsVO)) {
            return false;
        }
        HighlightProductsVO highlightProductsVO = (HighlightProductsVO) other;
        return this.id == highlightProductsVO.id && Intrinsics.d(this.title, highlightProductsVO.title) && Intrinsics.d(this.mainProducts, highlightProductsVO.mainProducts) && Intrinsics.d(this.subProducts, highlightProductsVO.subProducts) && Intrinsics.d(this.trackingInfo, highlightProductsVO.trackingInfo) && Intrinsics.d(this.subtitle, highlightProductsVO.subtitle) && this.currentMiniWidget == highlightProductsVO.currentMiniWidget && Intrinsics.d(this.miniProgressText, highlightProductsVO.miniProgressText);
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<HighlightProduct> getMainProducts() {
        return this.mainProducts;
    }

    public final HighlightsWrapperProgressText getMiniProgressText() {
        return this.miniProgressText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<HighlightProduct> getSubProducts() {
        return this.subProducts;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int b11 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.mainProducts);
        List<HighlightProduct> list = this.subProducts;
        int hashCode2 = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        t tVar = this.trackingInfo;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode4 = (hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        int hashCode5 = (hashCode4 + (highlightsCurrentMiniWidget == null ? 0 : highlightsCurrentMiniWidget.hashCode())) * 31;
        HighlightsWrapperProgressText highlightsWrapperProgressText = this.miniProgressText;
        return hashCode5 + (highlightsWrapperProgressText != null ? highlightsWrapperProgressText.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<HighlightProduct> list = this.mainProducts;
        List<HighlightProduct> list2 = this.subProducts;
        t tVar = this.trackingInfo;
        TextAtom textAtom2 = this.subtitle;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        HighlightsWrapperProgressText highlightsWrapperProgressText = this.miniProgressText;
        StringBuilder c11 = C2639a.c("HighlightProductsVO(id=", j11, ", title=", textAtom);
        C2860c.g(", mainProducts=", ", subProducts=", c11, list, list2);
        c11.append(", trackingInfo=");
        c11.append(tVar);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", currentMiniWidget=");
        c11.append(highlightsCurrentMiniWidget);
        c11.append(", miniProgressText=");
        c11.append(highlightsWrapperProgressText);
        c11.append(")");
        return c11.toString();
    }
}
