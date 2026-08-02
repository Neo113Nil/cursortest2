package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Kk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "", "<init>", "()V", "HideLoader", "UpdateButton", "UpdateData", "ShowTooltip", "Action", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$Action;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$HideLoader;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$ShowTooltip;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$UpdateButton;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$UpdateData;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CartButtonV5State {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$Action;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action extends CartButtonV5State {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(@NotNull AtomAction action) {
            super(null);
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && Intrinsics.d(this.action, ((Action) other).action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return c.e("Action(action=", ")", this.action);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$HideLoader;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "", "isFirst", "isSecond", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideLoader extends CartButtonV5State {
        private final boolean isFirst;
        private final boolean isSecond;

        public HideLoader(boolean z11, boolean z12) {
            super(null);
            this.isFirst = z11;
            this.isSecond = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HideLoader)) {
                return false;
            }
            HideLoader hideLoader = (HideLoader) other;
            return this.isFirst == hideLoader.isFirst && this.isSecond == hideLoader.isSecond;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSecond) + (Boolean.hashCode(this.isFirst) * 31);
        }

        /* renamed from: isFirst, reason: from getter */
        public final boolean getIsFirst() {
            return this.isFirst;
        }

        /* renamed from: isSecond, reason: from getter */
        public final boolean getIsSecond() {
            return this.isSecond;
        }

        @NotNull
        public String toString() {
            return Ef0.c.c("HideLoader(isFirst=", ", isSecond=", ")", this.isFirst, this.isSecond);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$ShowTooltip;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "", "isFirst", "isSecond", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowTooltip extends CartButtonV5State {
        private final boolean isFirst;
        private final boolean isSecond;

        public ShowTooltip(boolean z11, boolean z12) {
            super(null);
            this.isFirst = z11;
            this.isSecond = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTooltip)) {
                return false;
            }
            ShowTooltip showTooltip = (ShowTooltip) other;
            return this.isFirst == showTooltip.isFirst && this.isSecond == showTooltip.isSecond;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSecond) + (Boolean.hashCode(this.isFirst) * 31);
        }

        /* renamed from: isFirst, reason: from getter */
        public final boolean getIsFirst() {
            return this.isFirst;
        }

        /* renamed from: isSecond, reason: from getter */
        public final boolean getIsSecond() {
            return this.isSecond;
        }

        @NotNull
        public String toString() {
            return Ef0.c.c("ShowTooltip(isFirst=", ", isSecond=", ")", this.isFirst, this.isSecond);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$UpdateButton;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "button", "", "isRelatedProduct", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "getButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateButton extends CartButtonV5State {

        @NotNull
        private final CartButtonV5VO.CartButton button;
        private final boolean isRelatedProduct;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateButton(@NotNull CartButtonV5VO.CartButton button, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.isRelatedProduct = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateButton)) {
                return false;
            }
            UpdateButton updateButton = (UpdateButton) other;
            return Intrinsics.d(this.button, updateButton.button) && this.isRelatedProduct == updateButton.isRelatedProduct;
        }

        @NotNull
        public final CartButtonV5VO.CartButton getButton() {
            return this.button;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRelatedProduct) + (this.button.hashCode() * 31);
        }

        /* renamed from: isRelatedProduct, reason: from getter */
        public final boolean getIsRelatedProduct() {
            return this.isRelatedProduct;
        }

        @NotNull
        public String toString() {
            return "UpdateButton(button=" + this.button + ", isRelatedProduct=" + this.isRelatedProduct + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State$UpdateData;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "item", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "getItem", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateData extends CartButtonV5State {

        @NotNull
        private final CartButtonV5VO item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateData(@NotNull CartButtonV5VO item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateData) && Intrinsics.d(this.item, ((UpdateData) other).item);
        }

        @NotNull
        public final CartButtonV5VO getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateData(item=" + this.item + ")";
        }
    }

    public /* synthetic */ CartButtonV5State(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CartButtonV5State() {
    }
}
