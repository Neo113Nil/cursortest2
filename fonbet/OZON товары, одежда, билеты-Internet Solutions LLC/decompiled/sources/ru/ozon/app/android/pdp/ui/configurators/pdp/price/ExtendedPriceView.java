package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import Am.C2438a;
import B0.A0;
import B0.C2454a;
import C.o0;
import K00.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.ExtendedPrice;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R.\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0013R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isSelect", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "", "setupSubviews", "()V", "setupConstraints", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState;", "viewState", "update", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState;)V", "hasBackground", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Offsets;", "offsets", "updatePaddings", "(ZLru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Offsets;)V", "Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState;", "getViewState", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState;", "setViewState", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceView;", "priceV", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "priceDescriptionTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/widget/ImageView;", "priceDescriptionIv", "Landroid/widget/ImageView;", "disclosureIv", "Landroid/widget/Space;", "descriptionAnchorSpace", "Landroid/widget/Space;", "Landroidx/constraintlayout/widget/Barrier;", "horizontalBarrier", "Landroidx/constraintlayout/widget/Barrier;", "Companion", "ViewState", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class ExtendedPriceView extends ConstraintLayout {
    private static final int ACCENT_PRICE_PADDING_HORIZONTAL;
    private static final int ACCENT_PRICE_PADDING_VERTICAL;
    private static final int SELECT_ACCENT_PRICE_OFFSET;
    private Space descriptionAnchorSpace;
    private ImageView disclosureIv;
    private Barrier horizontalBarrier;
    private final boolean isSelect;
    private ImageView priceDescriptionIv;
    private TextAtomV2View priceDescriptionTav;
    private PriceView priceV;
    private ViewState viewState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$Companion;", "", "<init>", "()V", "", "ACCENT_PRICE_PADDING_VERTICAL", "I", "getACCENT_PRICE_PADDING_VERTICAL", "()I", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getACCENT_PRICE_PADDING_VERTICAL() {
            return ExtendedPriceView.ACCENT_PRICE_PADDING_VERTICAL;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u000f¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "price", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Offsets;", "offsets", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "background", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Disclosure;", "disclosure", "", "priceLocator", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Offsets;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Disclosure;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "getPrice", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Offsets;", "getOffsets", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Offsets;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "getBackground", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Disclosure;", "getDisclosure", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Disclosure;", "Ljava/lang/String;", "getPriceLocator", "Disclosure", "Offsets", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewState {
        private final Background background;
        private final Disclosure disclosure;

        @NotNull
        private final Offsets offsets;

        @NotNull
        private final ExtendedPrice price;

        @NotNull
        private final String priceLocator;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Disclosure;", "", "", "tintColor", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTintColor", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Disclosure {
            private final String tintColor;

            /* JADX WARN: Multi-variable type inference failed */
            public Disclosure() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Disclosure) && Intrinsics.d(this.tintColor, ((Disclosure) other).tintColor);
            }

            public final String getTintColor() {
                return this.tintColor;
            }

            public int hashCode() {
                String str = this.tintColor;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Disclosure(tintColor=", this.tintColor, ")");
            }

            public Disclosure(String str) {
                this.tintColor = str;
            }

            public /* synthetic */ Disclosure(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPriceView$ViewState$Offsets;", "", "", "x", "y", "bottom", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getX", "getY", "getBottom", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Offsets {
            private final int bottom;
            private final int x;
            private final int y;

            public Offsets() {
                this(0, 0, 0, 7, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Offsets)) {
                    return false;
                }
                Offsets offsets = (Offsets) other;
                return this.x == offsets.x && this.y == offsets.y && this.bottom == offsets.bottom;
            }

            public final int getBottom() {
                return this.bottom;
            }

            public final int getX() {
                return this.x;
            }

            public final int getY() {
                return this.y;
            }

            public int hashCode() {
                return Integer.hashCode(this.bottom) + C2454a.a(this.y, Integer.hashCode(this.x) * 31, 31);
            }

            @NotNull
            public String toString() {
                return b.e(this.bottom, ")", C2438a.a("Offsets(x=", this.x, ", y=", ", bottom=", this.y));
            }

            public Offsets(int i11, int i12, int i13) {
                this.x = i11;
                this.y = i12;
                this.bottom = i13;
            }

            public /* synthetic */ Offsets(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13);
            }
        }

        public ViewState(@NotNull ExtendedPrice price, @NotNull Offsets offsets, Background background, Disclosure disclosure, @NotNull String priceLocator) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(offsets, "offsets");
            Intrinsics.checkNotNullParameter(priceLocator, "priceLocator");
            this.price = price;
            this.offsets = offsets;
            this.background = background;
            this.disclosure = disclosure;
            this.priceLocator = priceLocator;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.d(this.price, viewState.price) && Intrinsics.d(this.offsets, viewState.offsets) && Intrinsics.d(this.background, viewState.background) && Intrinsics.d(this.disclosure, viewState.disclosure) && Intrinsics.d(this.priceLocator, viewState.priceLocator);
        }

        public final Background getBackground() {
            return this.background;
        }

        public final Disclosure getDisclosure() {
            return this.disclosure;
        }

        @NotNull
        public final Offsets getOffsets() {
            return this.offsets;
        }

        @NotNull
        public final ExtendedPrice getPrice() {
            return this.price;
        }

        @NotNull
        public final String getPriceLocator() {
            return this.priceLocator;
        }

        public int hashCode() {
            int hashCode = (this.offsets.hashCode() + (this.price.hashCode() * 31)) * 31;
            Background background = this.background;
            int hashCode2 = (hashCode + (background == null ? 0 : background.hashCode())) * 31;
            Disclosure disclosure = this.disclosure;
            return this.priceLocator.hashCode() + ((hashCode2 + (disclosure != null ? disclosure.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            ExtendedPrice extendedPrice = this.price;
            Offsets offsets = this.offsets;
            Background background = this.background;
            Disclosure disclosure = this.disclosure;
            String str = this.priceLocator;
            StringBuilder sb2 = new StringBuilder("ViewState(price=");
            sb2.append(extendedPrice);
            sb2.append(", offsets=");
            sb2.append(offsets);
            sb2.append(", background=");
            sb2.append(background);
            sb2.append(", disclosure=");
            sb2.append(disclosure);
            sb2.append(", priceLocator=");
            return o0.c(sb2, str, ")");
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        ACCENT_PRICE_PADDING_VERTICAL = dimens.getDP_8();
        ACCENT_PRICE_PADDING_HORIZONTAL = dimens.getDP_12();
        SELECT_ACCENT_PRICE_OFFSET = dimens.getDP_4();
    }

    public /* synthetic */ ExtendedPriceView(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, z11);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        PriceView priceView = this.priceV;
        if (priceView == null) {
            Intrinsics.n("priceV");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, priceView);
        PriceView priceView2 = this.priceV;
        if (priceView2 == null) {
            Intrinsics.n("priceV");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, priceView2);
        TextAtomV2View textAtomV2View = this.priceDescriptionTav;
        if (textAtomV2View == null) {
            Intrinsics.n("priceDescriptionTav");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, textAtomV2View);
        TextAtomV2View textAtomV2View2 = this.priceDescriptionTav;
        if (textAtomV2View2 == null) {
            Intrinsics.n("priceDescriptionTav");
            throw null;
        }
        Space space = this.descriptionAnchorSpace;
        if (space == null) {
            Intrinsics.n("descriptionAnchorSpace");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, textAtomV2View2, space);
        ImageView imageView = this.priceDescriptionIv;
        if (imageView == null) {
            Intrinsics.n("priceDescriptionIv");
            throw null;
        }
        TextAtomV2View textAtomV2View3 = this.priceDescriptionTav;
        if (textAtomV2View3 == null) {
            Intrinsics.n("priceDescriptionTav");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, imageView, textAtomV2View3);
        ImageView imageView2 = this.priceDescriptionIv;
        if (imageView2 == null) {
            Intrinsics.n("priceDescriptionIv");
            throw null;
        }
        TextAtomV2View textAtomV2View4 = this.priceDescriptionTav;
        if (textAtomV2View4 == null) {
            Intrinsics.n("priceDescriptionTav");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, imageView2, textAtomV2View4);
        ImageView imageView3 = this.priceDescriptionIv;
        if (imageView3 == null) {
            Intrinsics.n("priceDescriptionIv");
            throw null;
        }
        TextAtomV2View textAtomV2View5 = this.priceDescriptionTav;
        if (textAtomV2View5 == null) {
            Intrinsics.n("priceDescriptionTav");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, imageView3, textAtomV2View5);
        ImageView imageView4 = this.disclosureIv;
        if (imageView4 == null) {
            Intrinsics.n("disclosureIv");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, imageView4);
        ImageView imageView5 = this.disclosureIv;
        if (imageView5 == null) {
            Intrinsics.n("disclosureIv");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, imageView5);
        ImageView imageView6 = this.disclosureIv;
        if (imageView6 == null) {
            Intrinsics.n("disclosureIv");
            throw null;
        }
        Barrier barrier = this.horizontalBarrier;
        if (barrier == null) {
            Intrinsics.n("horizontalBarrier");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintStartToStartOf(dVar, imageView6, barrier);
        ImageView imageView7 = this.disclosureIv;
        if (imageView7 == null) {
            Intrinsics.n("disclosureIv");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, imageView7);
        Space space2 = this.descriptionAnchorSpace;
        if (space2 == null) {
            Intrinsics.n("descriptionAnchorSpace");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, space2);
        Space space3 = this.descriptionAnchorSpace;
        if (space3 == null) {
            Intrinsics.n("descriptionAnchorSpace");
            throw null;
        }
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, space3);
        Space space4 = this.descriptionAnchorSpace;
        if (space4 == null) {
            Intrinsics.n("descriptionAnchorSpace");
            throw null;
        }
        int id2 = space4.getId();
        PriceView priceView3 = this.priceV;
        if (priceView3 == null) {
            Intrinsics.n("priceV");
            throw null;
        }
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.bottomToBottom(dVar, id2, priceView3.getId(), this.isSelect ? SELECT_ACCENT_PRICE_OFFSET : 0);
        dVar.f(this);
    }

    private final void setupSubviews() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceView priceView = new PriceView(context, null, 0, this.isSelect, 6, null);
        priceView.setId(R$id.extendedPricePriceV);
        addView(priceView);
        this.priceV = priceView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setId(R$id.extendedPricePriceDescriptionTav);
        addView(textAtomV2View);
        this.priceDescriptionTav = textAtomV2View;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R$id.extendedPriceIconIv);
        Dimens dimens = Dimens.INSTANCE;
        ConstraintLayout.b bVar = new ConstraintLayout.b(dimens.getDP_16(), dimens.getDP_16());
        bVar.setMargins(dimens.getDP_4(), ((ViewGroup.MarginLayoutParams) bVar).topMargin, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, dimens.getDP_1());
        imageView.setLayoutParams(bVar);
        addView(imageView);
        this.priceDescriptionIv = imageView;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(R$id.extendedPriceDisclosureIv);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.setMarginStart(this.isSelect ? dimens.getDP_8() : dimens.getDP_4());
        imageView2.setLayoutParams(bVar2);
        imageView2.setImageResource(R$drawable.ic_s_chevron_right_filled);
        addView(imageView2);
        this.disclosureIv = imageView2;
        Space space = new Space(getContext());
        space.setId(R$id.extendedPriceDescriptionAnchorSpace);
        space.setLayoutParams(new ConstraintLayout.b(-2, dimens.getDP_1()));
        addView(space);
        this.descriptionAnchorSpace = space;
        Barrier barrier = new Barrier(getContext());
        barrier.setId(R$id.extendedPriceBarrier);
        barrier.f(6);
        PriceView priceView2 = this.priceV;
        if (priceView2 == null) {
            Intrinsics.n("priceV");
            throw null;
        }
        int id2 = priceView2.getId();
        ImageView imageView3 = this.priceDescriptionIv;
        if (imageView3 == null) {
            Intrinsics.n("priceDescriptionIv");
            throw null;
        }
        barrier.setReferencedIds(new int[]{id2, imageView3.getId()});
        addView(barrier);
        this.horizontalBarrier = barrier;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void update(ViewState viewState) {
        Icon icon;
        PriceView priceView;
        PriceView priceView2 = this.priceV;
        OzBackgroundDrawable ozBackgroundDrawable = null;
        if (priceView2 == null) {
            Intrinsics.n("priceV");
            throw null;
        }
        StyledText finalPrice = viewState.getPrice().getFinalPrice();
        StyledText originalPrice = viewState.getPrice().getOriginalPrice();
        StyledText finalPriceHint = viewState.getPrice().getFinalPriceHint();
        String strikethroughColor = viewState.getPrice().getStrikethroughColor();
        ExtendedPrice.IconWithPosition icon2 = viewState.getPrice().getIcon();
        if (icon2 != null) {
            if (icon2.getPosition() != ExtendedPrice.IconPosition.AFTER_PRICE) {
                icon2 = null;
            }
            if (icon2 != null) {
                icon = icon2.getIcon();
                PriceViewExtKt.bind(priceView2, finalPrice, originalPrice, finalPriceHint, strikethroughColor, icon, viewState.getPriceLocator());
                priceView = this.priceV;
                if (priceView != null) {
                    Intrinsics.n("priceV");
                    throw null;
                }
                priceView.setContentDescription(viewState.getPrice().getFinalPrice().getText());
                TextAtomV2View textAtomV2View = this.priceDescriptionTav;
                if (textAtomV2View == null) {
                    Intrinsics.n("priceDescriptionTav");
                    throw null;
                }
                TextHolderKt.bindOrGone$default(textAtomV2View, viewState.getPrice().getDescription(), null, 2, null);
                ExtendedPrice.IconWithPosition icon3 = viewState.getPrice().getIcon();
                if (icon3 == null || icon3.getPosition() != ExtendedPrice.IconPosition.AFTER_DESCRIPTION) {
                    icon3 = null;
                }
                ImageView imageView = this.priceDescriptionIv;
                if (imageView == null) {
                    Intrinsics.n("priceDescriptionIv");
                    throw null;
                }
                ViewExtKt.bindOrGone$default(imageView, icon3 != null ? icon3.getIcon() : null, null, 2, null);
                ImageView imageView2 = this.disclosureIv;
                if (imageView2 == null) {
                    Intrinsics.n("disclosureIv");
                    throw null;
                }
                imageView2.setVisibility(viewState.getDisclosure() != null ? 0 : 8);
                ImageView imageView3 = this.disclosureIv;
                if (imageView3 == null) {
                    Intrinsics.n("disclosureIv");
                    throw null;
                }
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ViewState.Disclosure disclosure = viewState.getDisclosure();
                ThemeExtKt.tint(imageView3, Integer.valueOf(styleParser.parseColor(context, disclosure != null ? disclosure.getTintColor() : null, UniColors.GRAPHIC_LIGHT_KEY.getResId())));
                updatePaddings(viewState.getBackground() != null, viewState.getOffsets());
                Background background = viewState.getBackground();
                if (background != null) {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    ozBackgroundDrawable = new OzBackgroundDrawable(context2, background, UiExtKt.toPxF((this.isSelect ? CornerRadius.RADIUS_500 : CornerRadius.RADIUS_350).getPx()));
                }
                setBackground(ozBackgroundDrawable);
                return;
            }
        }
        icon = null;
        PriceViewExtKt.bind(priceView2, finalPrice, originalPrice, finalPriceHint, strikethroughColor, icon, viewState.getPriceLocator());
        priceView = this.priceV;
        if (priceView != null) {
        }
    }

    private final void updatePaddings(boolean hasBackground, ViewState.Offsets offsets) {
        Integer valueOf = Integer.valueOf(ACCENT_PRICE_PADDING_HORIZONTAL);
        if (!hasBackground) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Integer valueOf2 = hasBackground ? Integer.valueOf(ACCENT_PRICE_PADDING_VERTICAL) : null;
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
        setPadding(offsets.getX() + intValue, offsets.getY() + intValue2, intValue, offsets.getBottom() + intValue2);
    }

    public final void setViewState(ViewState viewState) {
        if (Intrinsics.d(viewState, this.viewState)) {
            return;
        }
        this.viewState = viewState;
        if (viewState != null) {
            update(viewState);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendedPriceView(@NotNull Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSelect = z11;
        setLayoutParams(new ConstraintLayout.b(-2, -2));
        setupSubviews();
        setupConstraints();
    }
}
