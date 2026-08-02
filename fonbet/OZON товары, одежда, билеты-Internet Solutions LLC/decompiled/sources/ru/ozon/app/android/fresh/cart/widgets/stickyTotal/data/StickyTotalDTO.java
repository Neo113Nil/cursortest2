package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data;

import Ak.b;
import Ep.a;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001HB\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0019HÆ\u0003J´\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0013\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006I"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "stickyControl", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl;", "unfavorablePrice", "borderColor", "", "backgroundColor", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "enableAsync", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isRoundedCorners", "actionButton", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$ActionButton;", "countPicker", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "priceDetailsControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;ZLjava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$ActionButton;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getStickyControl", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl;", "getUnfavorablePrice", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;", "getEnableAsync", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getActionButton", "()Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$ActionButton;", "getCountPicker", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "getPriceDetailsControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl;Lru/ozon/uni/atoms/data/price/PriceDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/Spacers;ZLjava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$ActionButton;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;", "equals", "other", "hashCode", "", "toString", "StickyControl", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StickyTotalDTO {
    public static final int $stable = 8;
    private final StickyControl.ActionButton actionButton;
    private final String backgroundColor;
    private final String borderColor;
    private final ButtonV3DTO button;
    private final CartPickerDTO countPicker;
    private final boolean enableAsync;
    private final Boolean isRoundedCorners;
    private final PriceDTO price;
    private final CommonControlSettings priceDetailsControlSettings;
    private final Spacers spacers;
    private final StickyControl stickyControl;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final PriceDTO unfavorablePrice;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl;", "", "Counter", "ActionButton", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$ActionButton;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$Counter;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface StickyControl {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$ActionButton;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "delay", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$ActionButton;", "equals", "", "other", "", "hashCode", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActionButton implements StickyControl {
            public static final int $stable = 0;
            private final AtomActionDTO action;

            @NotNull
            private final ButtonV3DTO button;
            private final Integer delay;

            public ActionButton(@NotNull ButtonV3DTO button, AtomActionDTO atomActionDTO, Integer num) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
                this.action = atomActionDTO;
                this.delay = num;
            }

            public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, Integer num, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    buttonV3DTO = actionButton.button;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = actionButton.action;
                }
                if ((i11 & 4) != 0) {
                    num = actionButton.delay;
                }
                return actionButton.copy(buttonV3DTO, atomActionDTO, num);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getDelay() {
                return this.delay;
            }

            @NotNull
            public final ActionButton copy(@NotNull ButtonV3DTO button, AtomActionDTO action, Integer delay) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new ActionButton(button, action, delay);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) other;
                return Intrinsics.d(this.button, actionButton.button) && Intrinsics.d(this.action, actionButton.action) && Intrinsics.d(this.delay, actionButton.delay);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public final Integer getDelay() {
                return this.delay;
            }

            public int hashCode() {
                int hashCode = this.button.hashCode() * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Integer num = this.delay;
                return hashCode2 + (num != null ? num.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                ButtonV3DTO buttonV3DTO = this.button;
                AtomActionDTO atomActionDTO = this.action;
                Integer num = this.delay;
                StringBuilder sb2 = new StringBuilder("ActionButton(button=");
                sb2.append(buttonV3DTO);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", delay=");
                return a.c(sb2, num, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl$Counter;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO$StickyControl;", "countPicker", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "<init>", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;)V", "getCountPicker", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Counter implements StickyControl {
            public static final int $stable = 8;

            @NotNull
            private final CartPickerDTO countPicker;

            public Counter(@NotNull CartPickerDTO countPicker) {
                Intrinsics.checkNotNullParameter(countPicker, "countPicker");
                this.countPicker = countPicker;
            }

            public static /* synthetic */ Counter copy$default(Counter counter, CartPickerDTO cartPickerDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cartPickerDTO = counter.countPicker;
                }
                return counter.copy(cartPickerDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CartPickerDTO getCountPicker() {
                return this.countPicker;
            }

            @NotNull
            public final Counter copy(@NotNull CartPickerDTO countPicker) {
                Intrinsics.checkNotNullParameter(countPicker, "countPicker");
                return new Counter(countPicker);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Counter) && Intrinsics.d(this.countPicker, ((Counter) other).countPicker);
            }

            @NotNull
            public final CartPickerDTO getCountPicker() {
                return this.countPicker;
            }

            public int hashCode() {
                return this.countPicker.hashCode();
            }

            @NotNull
            public String toString() {
                return "Counter(countPicker=" + this.countPicker + ")";
            }
        }
    }

    public StickyTotalDTO(PriceDTO priceDTO, ButtonV3DTO buttonV3DTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "counter", type = StickyControl.Counter.class), @ProtoOneOfSignature(name = "actionButton", type = StickyControl.ActionButton.class)}) @ProtoOneOf StickyControl stickyControl, PriceDTO priceDTO2, String str, String str2, Spacers spacers, boolean z11, Map<String, TokenizedTrackingInfo> map, Boolean bool, StickyControl.ActionButton actionButton, CartPickerDTO cartPickerDTO, CommonControlSettings commonControlSettings) {
        this.price = priceDTO;
        this.button = buttonV3DTO;
        this.stickyControl = stickyControl;
        this.unfavorablePrice = priceDTO2;
        this.borderColor = str;
        this.backgroundColor = str2;
        this.spacers = spacers;
        this.enableAsync = z11;
        this.trackingInfo = map;
        this.isRoundedCorners = bool;
        this.actionButton = actionButton;
        this.countPicker = cartPickerDTO;
        this.priceDetailsControlSettings = commonControlSettings;
    }

    public static /* synthetic */ StickyTotalDTO copy$default(StickyTotalDTO stickyTotalDTO, PriceDTO priceDTO, ButtonV3DTO buttonV3DTO, StickyControl stickyControl, PriceDTO priceDTO2, String str, String str2, Spacers spacers, boolean z11, Map map, Boolean bool, StickyControl.ActionButton actionButton, CartPickerDTO cartPickerDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            priceDTO = stickyTotalDTO.price;
        }
        return stickyTotalDTO.copy(priceDTO, (i11 & 2) != 0 ? stickyTotalDTO.button : buttonV3DTO, (i11 & 4) != 0 ? stickyTotalDTO.stickyControl : stickyControl, (i11 & 8) != 0 ? stickyTotalDTO.unfavorablePrice : priceDTO2, (i11 & 16) != 0 ? stickyTotalDTO.borderColor : str, (i11 & 32) != 0 ? stickyTotalDTO.backgroundColor : str2, (i11 & 64) != 0 ? stickyTotalDTO.spacers : spacers, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? stickyTotalDTO.enableAsync : z11, (i11 & 256) != 0 ? stickyTotalDTO.trackingInfo : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? stickyTotalDTO.isRoundedCorners : bool, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? stickyTotalDTO.actionButton : actionButton, (i11 & 2048) != 0 ? stickyTotalDTO.countPicker : cartPickerDTO, (i11 & 4096) != 0 ? stickyTotalDTO.priceDetailsControlSettings : commonControlSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final PriceDTO getPrice() {
        return this.price;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsRoundedCorners() {
        return this.isRoundedCorners;
    }

    /* renamed from: component11, reason: from getter */
    public final StickyControl.ActionButton getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component12, reason: from getter */
    public final CartPickerDTO getCountPicker() {
        return this.countPicker;
    }

    /* renamed from: component13, reason: from getter */
    public final CommonControlSettings getPriceDetailsControlSettings() {
        return this.priceDetailsControlSettings;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final StickyControl getStickyControl() {
        return this.stickyControl;
    }

    /* renamed from: component4, reason: from getter */
    public final PriceDTO getUnfavorablePrice() {
        return this.unfavorablePrice;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getEnableAsync() {
        return this.enableAsync;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final StickyTotalDTO copy(PriceDTO price, ButtonV3DTO button, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "counter", type = StickyControl.Counter.class), @ProtoOneOfSignature(name = "actionButton", type = StickyControl.ActionButton.class)}) @ProtoOneOf StickyControl stickyControl, PriceDTO unfavorablePrice, String borderColor, String backgroundColor, Spacers spacers, boolean enableAsync, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean isRoundedCorners, StickyControl.ActionButton actionButton, CartPickerDTO countPicker, CommonControlSettings priceDetailsControlSettings) {
        return new StickyTotalDTO(price, button, stickyControl, unfavorablePrice, borderColor, backgroundColor, spacers, enableAsync, trackingInfo, isRoundedCorners, actionButton, countPicker, priceDetailsControlSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyTotalDTO)) {
            return false;
        }
        StickyTotalDTO stickyTotalDTO = (StickyTotalDTO) other;
        return Intrinsics.d(this.price, stickyTotalDTO.price) && Intrinsics.d(this.button, stickyTotalDTO.button) && Intrinsics.d(this.stickyControl, stickyTotalDTO.stickyControl) && Intrinsics.d(this.unfavorablePrice, stickyTotalDTO.unfavorablePrice) && Intrinsics.d(this.borderColor, stickyTotalDTO.borderColor) && Intrinsics.d(this.backgroundColor, stickyTotalDTO.backgroundColor) && Intrinsics.d(this.spacers, stickyTotalDTO.spacers) && this.enableAsync == stickyTotalDTO.enableAsync && Intrinsics.d(this.trackingInfo, stickyTotalDTO.trackingInfo) && Intrinsics.d(this.isRoundedCorners, stickyTotalDTO.isRoundedCorners) && Intrinsics.d(this.actionButton, stickyTotalDTO.actionButton) && Intrinsics.d(this.countPicker, stickyTotalDTO.countPicker) && Intrinsics.d(this.priceDetailsControlSettings, stickyTotalDTO.priceDetailsControlSettings);
    }

    public final StickyControl.ActionButton getActionButton() {
        return this.actionButton;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CartPickerDTO getCountPicker() {
        return this.countPicker;
    }

    public final boolean getEnableAsync() {
        return this.enableAsync;
    }

    public final PriceDTO getPrice() {
        return this.price;
    }

    public final CommonControlSettings getPriceDetailsControlSettings() {
        return this.priceDetailsControlSettings;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final StickyControl getStickyControl() {
        return this.stickyControl;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final PriceDTO getUnfavorablePrice() {
        return this.unfavorablePrice;
    }

    public int hashCode() {
        PriceDTO priceDTO = this.price;
        int hashCode = (priceDTO == null ? 0 : priceDTO.hashCode()) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        StickyControl stickyControl = this.stickyControl;
        int hashCode3 = (hashCode2 + (stickyControl == null ? 0 : stickyControl.hashCode())) * 31;
        PriceDTO priceDTO2 = this.unfavorablePrice;
        int hashCode4 = (hashCode3 + (priceDTO2 == null ? 0 : priceDTO2.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Spacers spacers = this.spacers;
        int a11 = C3532b.a((hashCode6 + (spacers == null ? 0 : spacers.hashCode())) * 31, 31, this.enableAsync);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.isRoundedCorners;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        StickyControl.ActionButton actionButton = this.actionButton;
        int hashCode9 = (hashCode8 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        CartPickerDTO cartPickerDTO = this.countPicker;
        int hashCode10 = (hashCode9 + (cartPickerDTO == null ? 0 : cartPickerDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.priceDetailsControlSettings;
        return hashCode10 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    public final Boolean isRoundedCorners() {
        return this.isRoundedCorners;
    }

    @NotNull
    public String toString() {
        PriceDTO priceDTO = this.price;
        ButtonV3DTO buttonV3DTO = this.button;
        StickyControl stickyControl = this.stickyControl;
        PriceDTO priceDTO2 = this.unfavorablePrice;
        String str = this.borderColor;
        String str2 = this.backgroundColor;
        Spacers spacers = this.spacers;
        boolean z11 = this.enableAsync;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Boolean bool = this.isRoundedCorners;
        StickyControl.ActionButton actionButton = this.actionButton;
        CartPickerDTO cartPickerDTO = this.countPicker;
        CommonControlSettings commonControlSettings = this.priceDetailsControlSettings;
        StringBuilder sb2 = new StringBuilder("StickyTotalDTO(price=");
        sb2.append(priceDTO);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", stickyControl=");
        sb2.append(stickyControl);
        sb2.append(", unfavorablePrice=");
        sb2.append(priceDTO2);
        sb2.append(", borderColor=");
        Nh.a.h(sb2, str, ", backgroundColor=", str2, ", spacers=");
        sb2.append(spacers);
        sb2.append(", enableAsync=");
        sb2.append(z11);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", isRoundedCorners=");
        sb2.append(bool);
        sb2.append(", actionButton=");
        sb2.append(actionButton);
        sb2.append(", countPicker=");
        sb2.append(cartPickerDTO);
        sb2.append(", priceDetailsControlSettings=");
        return b.g(sb2, commonControlSettings, ")");
    }

    public /* synthetic */ StickyTotalDTO(PriceDTO priceDTO, ButtonV3DTO buttonV3DTO, StickyControl stickyControl, PriceDTO priceDTO2, String str, String str2, Spacers spacers, boolean z11, Map map, Boolean bool, StickyControl.ActionButton actionButton, CartPickerDTO cartPickerDTO, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(priceDTO, buttonV3DTO, stickyControl, priceDTO2, str, str2, spacers, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, map, bool, actionButton, cartPickerDTO, commonControlSettings);
    }
}
