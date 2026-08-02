package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import De.C2859b;
import F3.G;
import Kk.C3532b;
import P4.f;
import WZ.t;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.Spacers;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002@AB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u009e\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b8\u0010\u001dR\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b<\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "state", "unfavorablePrice", "", "borderColor", "backgroundColor", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "spacers", "", "enableAsync", "asyncData", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "hasRoundedCorners", "Lru/ozon/uni/atoms/af/AtomAction;", "priceDetailsAction", "<init>", "(JLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;ZLjava/lang/String;LWZ/t;ZLru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(JLru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;ZLjava/lang/String;LWZ/t;ZLru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "getState", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "getUnfavorablePrice", "Ljava/lang/String;", "getBorderColor", "getBackgroundColor", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "Z", "getEnableAsync", "()Z", "getAsyncData", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getHasRoundedCorners", "Lru/ozon/uni/atoms/af/AtomAction;", "getPriceDetailsAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Type", "State", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StickyTotalVO implements c {
    private final String asyncData;
    private final String backgroundColor;
    private final String borderColor;
    private final boolean enableAsync;
    private final boolean hasRoundedCorners;
    private final long id;
    private final PriceDTO price;
    private final AtomAction priceDetailsAction;

    @NotNull
    private final Spacers spacers;
    private final State state;
    private final t tokenizedEvent;
    private final PriceDTO unfavorablePrice;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "", "ButtonOnly", "Cart", "Combo", "Pdp", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$ButtonOnly;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Cart;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Combo;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Pdp;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$ButtonOnly;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonOnly implements State {

            @NotNull
            private final ButtonV3DTO button;

            public ButtonOnly(@NotNull ButtonV3DTO button) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonOnly) && Intrinsics.d(this.button, ((ButtonOnly) other).button);
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @NotNull
            public String toString() {
                return G.b(this.button, "ButtonOnly(button=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Cart;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cart implements State {

            @NotNull
            private final ButtonV3DTO button;

            public Cart(@NotNull ButtonV3DTO button) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cart) && Intrinsics.d(this.button, ((Cart) other).button);
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @NotNull
            public String toString() {
                return G.b(this.button, "Cart(button=", ")");
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Combo;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "delay", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getDelay", "()J", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Combo implements State {
            public static final int $stable = AtomAction.$stable;
            private final AtomAction action;

            @NotNull
            private final ButtonV3DTO button;
            private final long delay;

            public Combo(@NotNull ButtonV3DTO button, AtomAction atomAction, long j11) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
                this.action = atomAction;
                this.delay = j11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Combo)) {
                    return false;
                }
                Combo combo = (Combo) other;
                return Intrinsics.d(this.button, combo.button) && Intrinsics.d(this.action, combo.action) && this.delay == combo.delay;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public final long getDelay() {
                return this.delay;
            }

            public int hashCode() {
                int hashCode = this.button.hashCode() * 31;
                AtomAction atomAction = this.action;
                return Long.hashCode(this.delay) + ((hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                ButtonV3DTO buttonV3DTO = this.button;
                AtomAction atomAction = this.action;
                long j11 = this.delay;
                StringBuilder sb2 = new StringBuilder("Combo(button=");
                sb2.append(buttonV3DTO);
                sb2.append(", action=");
                sb2.append(atomAction);
                sb2.append(", delay=");
                return f.a(j11, ")", sb2);
            }
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u008c\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b1\u00100R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b2\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Pdp;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "", "showPicker", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "delay", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "countPicker", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "incrementTrackingInfo", "decrementTrackingInfo", "removeTrackingInfo", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;JLru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "copy", "(ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;JLru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State$Pdp;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowPicker", "()Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "J", "getDelay", "()J", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "getCountPicker", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "Ljava/util/Map;", "getIncrementTrackingInfo", "()Ljava/util/Map;", "getDecrementTrackingInfo", "getRemoveTrackingInfo", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Pdp implements State {
            private final AtomAction action;

            @NotNull
            private final ButtonV3DTO button;

            @NotNull
            private final CartPickerVO countPicker;
            private final Map<String, TokenizedTrackingInfo> decrementTrackingInfo;
            private final long delay;
            private final Map<String, TokenizedTrackingInfo> incrementTrackingInfo;
            private final Map<String, TokenizedTrackingInfo> removeTrackingInfo;
            private final boolean showPicker;

            public Pdp(boolean z11, @NotNull ButtonV3DTO button, AtomAction atomAction, long j11, @NotNull CartPickerVO countPicker, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(countPicker, "countPicker");
                this.showPicker = z11;
                this.button = button;
                this.action = atomAction;
                this.delay = j11;
                this.countPicker = countPicker;
                this.incrementTrackingInfo = map;
                this.decrementTrackingInfo = map2;
                this.removeTrackingInfo = map3;
            }

            public static /* synthetic */ Pdp copy$default(Pdp pdp, boolean z11, ButtonV3DTO buttonV3DTO, AtomAction atomAction, long j11, CartPickerVO cartPickerVO, Map map, Map map2, Map map3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = pdp.showPicker;
                }
                if ((i11 & 2) != 0) {
                    buttonV3DTO = pdp.button;
                }
                if ((i11 & 4) != 0) {
                    atomAction = pdp.action;
                }
                if ((i11 & 8) != 0) {
                    j11 = pdp.delay;
                }
                if ((i11 & 16) != 0) {
                    cartPickerVO = pdp.countPicker;
                }
                if ((i11 & 32) != 0) {
                    map = pdp.incrementTrackingInfo;
                }
                if ((i11 & 64) != 0) {
                    map2 = pdp.decrementTrackingInfo;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    map3 = pdp.removeTrackingInfo;
                }
                long j12 = j11;
                AtomAction atomAction2 = atomAction;
                return pdp.copy(z11, buttonV3DTO, atomAction2, j12, cartPickerVO, map, map2, map3);
            }

            @NotNull
            public final Pdp copy(boolean showPicker, @NotNull ButtonV3DTO button, AtomAction action, long delay, @NotNull CartPickerVO countPicker, Map<String, TokenizedTrackingInfo> incrementTrackingInfo, Map<String, TokenizedTrackingInfo> decrementTrackingInfo, Map<String, TokenizedTrackingInfo> removeTrackingInfo) {
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(countPicker, "countPicker");
                return new Pdp(showPicker, button, action, delay, countPicker, incrementTrackingInfo, decrementTrackingInfo, removeTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Pdp)) {
                    return false;
                }
                Pdp pdp = (Pdp) other;
                return this.showPicker == pdp.showPicker && Intrinsics.d(this.button, pdp.button) && Intrinsics.d(this.action, pdp.action) && this.delay == pdp.delay && Intrinsics.d(this.countPicker, pdp.countPicker) && Intrinsics.d(this.incrementTrackingInfo, pdp.incrementTrackingInfo) && Intrinsics.d(this.decrementTrackingInfo, pdp.decrementTrackingInfo) && Intrinsics.d(this.removeTrackingInfo, pdp.removeTrackingInfo);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            @NotNull
            public final CartPickerVO getCountPicker() {
                return this.countPicker;
            }

            public final Map<String, TokenizedTrackingInfo> getDecrementTrackingInfo() {
                return this.decrementTrackingInfo;
            }

            public final long getDelay() {
                return this.delay;
            }

            public final Map<String, TokenizedTrackingInfo> getIncrementTrackingInfo() {
                return this.incrementTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getRemoveTrackingInfo() {
                return this.removeTrackingInfo;
            }

            public final boolean getShowPicker() {
                return this.showPicker;
            }

            public int hashCode() {
                int c11 = C2859b.c(this.button, Boolean.hashCode(this.showPicker) * 31, 31);
                AtomAction atomAction = this.action;
                int hashCode = (this.countPicker.hashCode() + Pk0.c.a((c11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.delay)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.incrementTrackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.decrementTrackingInfo;
                int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map3 = this.removeTrackingInfo;
                return hashCode3 + (map3 != null ? map3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Pdp(showPicker=" + this.showPicker + ", button=" + this.button + ", action=" + this.action + ", delay=" + this.delay + ", countPicker=" + this.countPicker + ", incrementTrackingInfo=" + this.incrementTrackingInfo + ", decrementTrackingInfo=" + this.decrementTrackingInfo + ", removeTrackingInfo=" + this.removeTrackingInfo + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$Type;", "", "<init>", "(Ljava/lang/String;I)V", "BUTTON_ONLY", "CART", "COMBO", "PDP_ASYNC", "PDP", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BUTTON_ONLY = new Type("BUTTON_ONLY", 0);
        public static final Type CART = new Type("CART", 1);
        public static final Type COMBO = new Type("COMBO", 2);
        public static final Type PDP_ASYNC = new Type("PDP_ASYNC", 3);
        public static final Type PDP = new Type("PDP", 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BUTTON_ONLY, CART, COMBO, PDP_ASYNC, PDP};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public StickyTotalVO(long j11, PriceDTO priceDTO, State state, PriceDTO priceDTO2, String str, String str2, @NotNull Spacers spacers, boolean z11, String str3, t tVar, boolean z12, AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.price = priceDTO;
        this.state = state;
        this.unfavorablePrice = priceDTO2;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.spacers = spacers;
        this.enableAsync = z11;
        this.asyncData = str3;
        this.tokenizedEvent = tVar;
        this.hasRoundedCorners = z12;
        this.priceDetailsAction = atomAction;
    }

    @NotNull
    public final StickyTotalVO copy(long id2, PriceDTO price, State state, PriceDTO unfavorablePrice, String borderColor, String backgroundColor, @NotNull Spacers spacers, boolean enableAsync, String asyncData, t tokenizedEvent, boolean hasRoundedCorners, AtomAction priceDetailsAction) {
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        return new StickyTotalVO(id2, price, state, unfavorablePrice, borderColor, backgroundColor, spacers, enableAsync, asyncData, tokenizedEvent, hasRoundedCorners, priceDetailsAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyTotalVO)) {
            return false;
        }
        StickyTotalVO stickyTotalVO = (StickyTotalVO) other;
        return this.id == stickyTotalVO.id && Intrinsics.d(this.price, stickyTotalVO.price) && Intrinsics.d(this.state, stickyTotalVO.state) && Intrinsics.d(this.unfavorablePrice, stickyTotalVO.unfavorablePrice) && Intrinsics.d(this.borderColor, stickyTotalVO.borderColor) && Intrinsics.d(this.backgroundColor, stickyTotalVO.backgroundColor) && Intrinsics.d(this.spacers, stickyTotalVO.spacers) && this.enableAsync == stickyTotalVO.enableAsync && Intrinsics.d(this.asyncData, stickyTotalVO.asyncData) && Intrinsics.d(this.tokenizedEvent, stickyTotalVO.tokenizedEvent) && this.hasRoundedCorners == stickyTotalVO.hasRoundedCorners && Intrinsics.d(this.priceDetailsAction, stickyTotalVO.priceDetailsAction);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final boolean getEnableAsync() {
        return this.enableAsync;
    }

    public final boolean getHasRoundedCorners() {
        return this.hasRoundedCorners;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final AtomAction getPriceDetailsAction() {
        return this.priceDetailsAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final State getState() {
        return this.state;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final PriceDTO getUnfavorablePrice() {
        return this.unfavorablePrice;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        PriceDTO priceDTO = this.price;
        int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        State state = this.state;
        int hashCode3 = (hashCode2 + (state == null ? 0 : state.hashCode())) * 31;
        PriceDTO priceDTO2 = this.unfavorablePrice;
        int hashCode4 = (hashCode3 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int a11 = C3532b.a((this.spacers.hashCode() + ((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.enableAsync);
        String str3 = this.asyncData;
        int hashCode6 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int a12 = C3532b.a((hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.hasRoundedCorners);
        AtomAction atomAction = this.priceDetailsAction;
        return a12 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PriceDTO priceDTO = this.price;
        State state = this.state;
        PriceDTO priceDTO2 = this.unfavorablePrice;
        String str = this.borderColor;
        String str2 = this.backgroundColor;
        Spacers spacers = this.spacers;
        boolean z11 = this.enableAsync;
        String str3 = this.asyncData;
        t tVar = this.tokenizedEvent;
        boolean z12 = this.hasRoundedCorners;
        AtomAction atomAction = this.priceDetailsAction;
        StringBuilder sb2 = new StringBuilder("StickyTotalVO(id=");
        sb2.append(j11);
        sb2.append(", price=");
        sb2.append(priceDTO);
        sb2.append(", state=");
        sb2.append(state);
        sb2.append(", unfavorablePrice=");
        sb2.append(priceDTO2);
        Nh.a.h(sb2, ", borderColor=", str, ", backgroundColor=", str2);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", enableAsync=");
        sb2.append(z11);
        Bi.a.f(sb2, ", asyncData=", str3, ", tokenizedEvent=", tVar);
        sb2.append(", hasRoundedCorners=");
        sb2.append(z12);
        sb2.append(", priceDetailsAction=");
        sb2.append(atomAction);
        sb2.append(")");
        return sb2.toString();
    }
}
