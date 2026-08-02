package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.model;

import B90.C2618u;
import Fm.C3051a;
import G.g;
import I0.C3173b;
import J0.C3349u1;
import N3.C3660k;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO;", "carousel", "<init>", "(JLru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO;", "getCarousel", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO;", "CarouselVO", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ComparisonCarouselVO implements c {

    @NotNull
    private final CarouselVO carousel;
    private final long id;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "productActionOnSwipe", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Index;", "indices", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$ComparedProduct;", "products", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getProductActionOnSwipe", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/List;", "getIndices", "()Ljava/util/List;", "getProducts", "Index", "ProductViewType", "Button", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarouselVO {

        @NotNull
        private final List<Index> indices;

        @NotNull
        private final AtomActionDTO productActionOnSwipe;
        private final List<ProductViewType.ComparedProduct> products;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "", "<init>", "()V", "AddToCartButton", "SmallButtons", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$AddToCartButton;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Button {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$AddToCartButton;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "primaryButton", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "getPrimaryButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AddToCartButton extends Button {

                @NotNull
                private final ButtonV3Atom.AddToCartAtom.AddToCartButton primaryButton;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AddToCartButton(@NotNull ButtonV3Atom.AddToCartAtom.AddToCartButton primaryButton) {
                    super(null);
                    Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
                    this.primaryButton = primaryButton;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof AddToCartButton) && Intrinsics.d(this.primaryButton, ((AddToCartButton) other).primaryButton);
                }

                @NotNull
                public final ButtonV3Atom.AddToCartAtom.AddToCartButton getPrimaryButton() {
                    return this.primaryButton;
                }

                public int hashCode() {
                    return this.primaryButton.hashCode();
                }

                @NotNull
                public String toString() {
                    return "AddToCartButton(primaryButton=" + this.primaryButton + ")";
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButton", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons$NotifyButton;", "notifyButton", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons$NotifyButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons$NotifyButton;", "getNotifyButton", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons$NotifyButton;", "NotifyButton", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SmallButtons extends Button {
                private final NotifyButton notifyButton;

                @NotNull
                private final ButtonV3Atom.SmallButton smallButton;

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button$SmallButtons$NotifyButton;", "", "", "isSubscribed", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "subscribeButton", "unsubscribeButton", "<init>", "(ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getUnsubscribeButton", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class NotifyButton {
                    private final boolean isSubscribed;

                    @NotNull
                    private final ButtonV3Atom.SmallIconButton subscribeButton;

                    @NotNull
                    private final ButtonV3Atom.SmallIconButton unsubscribeButton;

                    public NotifyButton(boolean z11, @NotNull ButtonV3Atom.SmallIconButton subscribeButton, @NotNull ButtonV3Atom.SmallIconButton unsubscribeButton) {
                        Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
                        Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
                        this.isSubscribed = z11;
                        this.subscribeButton = subscribeButton;
                        this.unsubscribeButton = unsubscribeButton;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof NotifyButton)) {
                            return false;
                        }
                        NotifyButton notifyButton = (NotifyButton) other;
                        return this.isSubscribed == notifyButton.isSubscribed && Intrinsics.d(this.subscribeButton, notifyButton.subscribeButton) && Intrinsics.d(this.unsubscribeButton, notifyButton.unsubscribeButton);
                    }

                    @NotNull
                    public final ButtonV3Atom.SmallIconButton getSubscribeButton() {
                        return this.subscribeButton;
                    }

                    @NotNull
                    public final ButtonV3Atom.SmallIconButton getUnsubscribeButton() {
                        return this.unsubscribeButton;
                    }

                    public int hashCode() {
                        return this.unsubscribeButton.hashCode() + C3349u1.d(this.subscribeButton, Boolean.hashCode(this.isSubscribed) * 31, 31);
                    }

                    /* renamed from: isSubscribed, reason: from getter */
                    public final boolean getIsSubscribed() {
                        return this.isSubscribed;
                    }

                    @NotNull
                    public String toString() {
                        return "NotifyButton(isSubscribed=" + this.isSubscribed + ", subscribeButton=" + this.subscribeButton + ", unsubscribeButton=" + this.unsubscribeButton + ")";
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SmallButtons(@NotNull ButtonV3Atom.SmallButton smallButton, NotifyButton notifyButton) {
                    super(null);
                    Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                    this.smallButton = smallButton;
                    this.notifyButton = notifyButton;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SmallButtons)) {
                        return false;
                    }
                    SmallButtons smallButtons = (SmallButtons) other;
                    return Intrinsics.d(this.smallButton, smallButtons.smallButton) && Intrinsics.d(this.notifyButton, smallButtons.notifyButton);
                }

                public final NotifyButton getNotifyButton() {
                    return this.notifyButton;
                }

                @NotNull
                public final ButtonV3Atom.SmallButton getSmallButton() {
                    return this.smallButton;
                }

                public int hashCode() {
                    int hashCode = this.smallButton.hashCode() * 31;
                    NotifyButton notifyButton = this.notifyButton;
                    return hashCode + (notifyButton == null ? 0 : notifyButton.hashCode());
                }

                @NotNull
                public String toString() {
                    return "SmallButtons(smallButton=" + this.smallButton + ", notifyButton=" + this.notifyButton + ")";
                }
            }

            public /* synthetic */ Button(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Button() {
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Index;", "", "", "selectedIndex", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;", "emptyProduct", "<init>", "(ILru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSelectedIndex", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;", "getEmptyProduct", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Index {
            private final ProductViewType.EmptyProductVO emptyProduct;
            private final int selectedIndex;

            public Index(int i11, ProductViewType.EmptyProductVO emptyProductVO) {
                this.selectedIndex = i11;
                this.emptyProduct = emptyProductVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Index)) {
                    return false;
                }
                Index index = (Index) other;
                return this.selectedIndex == index.selectedIndex && Intrinsics.d(this.emptyProduct, index.emptyProduct);
            }

            public final ProductViewType.EmptyProductVO getEmptyProduct() {
                return this.emptyProduct;
            }

            public final int getSelectedIndex() {
                return this.selectedIndex;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.selectedIndex) * 31;
                ProductViewType.EmptyProductVO emptyProductVO = this.emptyProduct;
                return hashCode + (emptyProductVO == null ? 0 : emptyProductVO.hashCode());
            }

            @NotNull
            public String toString() {
                return "Index(selectedIndex=" + this.selectedIndex + ", emptyProduct=" + this.emptyProduct + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType;", "", "<init>", "()V", "EmptyProductVO", "ComparedProduct", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$ComparedProduct;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class ProductViewType {

            @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b5\u0010\u0016¨\u00066"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$ComparedProduct;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType;", "", "sku", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "removeButton", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "button", "pageInfo", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSku", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRemoveButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "getButton", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$Button;", "getPageInfo", "getDeeplink", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ComparedProduct extends ProductViewType {
                private final Badge badge;
                private final Button button;

                @NotNull
                private final String deeplink;

                @NotNull
                private final FavoriteProductMolecule favoriteButton;

                @NotNull
                private final String image;

                @NotNull
                private final String pageInfo;

                @NotNull
                private final Price price;

                @NotNull
                private final IconButtonV3DTO removeButton;

                @NotNull
                private final String sku;

                @NotNull
                private final TextDTO title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ComparedProduct(@NotNull String sku, @NotNull String image, @NotNull TextDTO title, @NotNull Price price, Badge badge, @NotNull FavoriteProductMolecule favoriteButton, @NotNull IconButtonV3DTO removeButton, Button button, @NotNull String pageInfo, @NotNull String deeplink) {
                    super(null);
                    Intrinsics.checkNotNullParameter(sku, "sku");
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(price, "price");
                    Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
                    Intrinsics.checkNotNullParameter(removeButton, "removeButton");
                    Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    this.sku = sku;
                    this.image = image;
                    this.title = title;
                    this.price = price;
                    this.badge = badge;
                    this.favoriteButton = favoriteButton;
                    this.removeButton = removeButton;
                    this.button = button;
                    this.pageInfo = pageInfo;
                    this.deeplink = deeplink;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ComparedProduct)) {
                        return false;
                    }
                    ComparedProduct comparedProduct = (ComparedProduct) other;
                    return Intrinsics.d(this.sku, comparedProduct.sku) && Intrinsics.d(this.image, comparedProduct.image) && Intrinsics.d(this.title, comparedProduct.title) && Intrinsics.d(this.price, comparedProduct.price) && Intrinsics.d(this.badge, comparedProduct.badge) && Intrinsics.d(this.favoriteButton, comparedProduct.favoriteButton) && Intrinsics.d(this.removeButton, comparedProduct.removeButton) && Intrinsics.d(this.button, comparedProduct.button) && Intrinsics.d(this.pageInfo, comparedProduct.pageInfo) && Intrinsics.d(this.deeplink, comparedProduct.deeplink);
                }

                public final Badge getBadge() {
                    return this.badge;
                }

                public final Button getButton() {
                    return this.button;
                }

                @NotNull
                public final String getDeeplink() {
                    return this.deeplink;
                }

                @NotNull
                public final FavoriteProductMolecule getFavoriteButton() {
                    return this.favoriteButton;
                }

                @NotNull
                public final String getImage() {
                    return this.image;
                }

                @NotNull
                public final String getPageInfo() {
                    return this.pageInfo;
                }

                @NotNull
                public final Price getPrice() {
                    return this.price;
                }

                @NotNull
                public final IconButtonV3DTO getRemoveButton() {
                    return this.removeButton;
                }

                @NotNull
                public final String getSku() {
                    return this.sku;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int a11 = C3051a.a(this.price, b.a(this.title, g.a(this.sku.hashCode() * 31, 31, this.image), 31), 31);
                    Badge badge = this.badge;
                    int c11 = GR.b.c(this.removeButton, (this.favoriteButton.hashCode() + ((a11 + (badge == null ? 0 : badge.hashCode())) * 31)) * 31, 31);
                    Button button = this.button;
                    return this.deeplink.hashCode() + g.a((c11 + (button != null ? button.hashCode() : 0)) * 31, 31, this.pageInfo);
                }

                @NotNull
                public String toString() {
                    String str = this.sku;
                    String str2 = this.image;
                    TextDTO textDTO = this.title;
                    Price price = this.price;
                    Badge badge = this.badge;
                    FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
                    IconButtonV3DTO iconButtonV3DTO = this.removeButton;
                    Button button = this.button;
                    String str3 = this.pageInfo;
                    String str4 = this.deeplink;
                    StringBuilder d11 = C3660k.d("ComparedProduct(sku=", str, ", image=", str2, ", title=");
                    d11.append(textDTO);
                    d11.append(", price=");
                    d11.append(price);
                    d11.append(", badge=");
                    d11.append(badge);
                    d11.append(", favoriteButton=");
                    d11.append(favoriteProductMolecule);
                    d11.append(", removeButton=");
                    d11.append(iconButtonV3DTO);
                    d11.append(", button=");
                    d11.append(button);
                    d11.append(", pageInfo=");
                    return C3173b.c(d11, str3, ", deeplink=", str4, ")");
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType$EmptyProductVO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/model/ComparisonCarouselVO$CarouselVO$ProductViewType;", "", "image", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "button", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class EmptyProductVO extends ProductViewType {

                @NotNull
                private final ButtonV3Atom.LargeBorderlessButton button;

                @NotNull
                private final String image;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EmptyProductVO(@NotNull String image, @NotNull ButtonV3Atom.LargeBorderlessButton button) {
                    super(null);
                    Intrinsics.checkNotNullParameter(image, "image");
                    Intrinsics.checkNotNullParameter(button, "button");
                    this.image = image;
                    this.button = button;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof EmptyProductVO)) {
                        return false;
                    }
                    EmptyProductVO emptyProductVO = (EmptyProductVO) other;
                    return Intrinsics.d(this.image, emptyProductVO.image) && Intrinsics.d(this.button, emptyProductVO.button);
                }

                @NotNull
                public final ButtonV3Atom.LargeBorderlessButton getButton() {
                    return this.button;
                }

                @NotNull
                public final String getImage() {
                    return this.image;
                }

                public int hashCode() {
                    return this.button.hashCode() + (this.image.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "EmptyProductVO(image=" + this.image + ", button=" + this.button + ")";
                }
            }

            public /* synthetic */ ProductViewType(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ProductViewType() {
            }
        }

        public CarouselVO(@NotNull AtomActionDTO productActionOnSwipe, @NotNull List<Index> indices, List<ProductViewType.ComparedProduct> list) {
            Intrinsics.checkNotNullParameter(productActionOnSwipe, "productActionOnSwipe");
            Intrinsics.checkNotNullParameter(indices, "indices");
            this.productActionOnSwipe = productActionOnSwipe;
            this.indices = indices;
            this.products = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarouselVO)) {
                return false;
            }
            CarouselVO carouselVO = (CarouselVO) other;
            return Intrinsics.d(this.productActionOnSwipe, carouselVO.productActionOnSwipe) && Intrinsics.d(this.indices, carouselVO.indices) && Intrinsics.d(this.products, carouselVO.products);
        }

        @NotNull
        public final List<Index> getIndices() {
            return this.indices;
        }

        @NotNull
        public final AtomActionDTO getProductActionOnSwipe() {
            return this.productActionOnSwipe;
        }

        public final List<ProductViewType.ComparedProduct> getProducts() {
            return this.products;
        }

        public int hashCode() {
            int b11 = g.b(this.productActionOnSwipe.hashCode() * 31, 31, this.indices);
            List<ProductViewType.ComparedProduct> list = this.products;
            return b11 + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.productActionOnSwipe;
            List<Index> list = this.indices;
            List<ProductViewType.ComparedProduct> list2 = this.products;
            StringBuilder sb2 = new StringBuilder("CarouselVO(productActionOnSwipe=");
            sb2.append(atomActionDTO);
            sb2.append(", indices=");
            sb2.append(list);
            sb2.append(", products=");
            return C2618u.h(sb2, list2, ")");
        }
    }

    public ComparisonCarouselVO(long j11, @NotNull CarouselVO carousel) {
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        this.id = j11;
        this.carousel = carousel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparisonCarouselVO)) {
            return false;
        }
        ComparisonCarouselVO comparisonCarouselVO = (ComparisonCarouselVO) other;
        return this.id == comparisonCarouselVO.id && Intrinsics.d(this.carousel, comparisonCarouselVO.carousel);
    }

    @NotNull
    public final CarouselVO getCarousel() {
        return this.carousel;
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

    public int hashCode() {
        return this.carousel.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "ComparisonCarouselVO(id=" + this.id + ", carousel=" + this.carousel + ")";
    }
}
