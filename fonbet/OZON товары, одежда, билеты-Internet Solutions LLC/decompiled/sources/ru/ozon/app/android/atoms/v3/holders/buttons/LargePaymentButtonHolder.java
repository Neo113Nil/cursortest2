package ru.ozon.app.android.atoms.v3.holders.buttons;

import JG.b;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.LargePaymentButtonAppearance;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.payments.LargePaymentButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/buttons/LargePaymentButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/payments/LargePaymentButtonView;", "view", "", "atomContext", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/payments/LargePaymentButtonView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;", "style", "", "mapStyle", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;)I", "item", "", "onBind", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;)V", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "defaultText$delegate", "LSc/j;", "getDefaultText", "()Ljava/lang/String;", "defaultText", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargePaymentButtonHolder extends AtomV3<ButtonV3Atom.PaymentButtonLarge, LargePaymentButtonView> {

    @NotNull
    private final StyleAppearance<LargePaymentButtonView> appearance;

    /* renamed from: defaultText$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultText;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.values().length];
            try {
                iArr[ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.STYLE_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.STYLE_TYPE_NATIVE_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.STYLE_TYPE_FAST_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.STYLE_TYPE_ONLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargePaymentButtonHolder(@NotNull LargePaymentButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.appearance = StyleAppearance.INSTANCE.of(new LargePaymentButtonAppearance());
        this.defaultText = k.a(n.NONE, LargePaymentButtonHolder$defaultText$2.INSTANCE);
        getContainerView().setOnClickListener(new b(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(LargePaymentButtonHolder largePaymentButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.PaymentButtonLarge paymentButtonLarge = (ButtonV3Atom.PaymentButtonLarge) largePaymentButtonHolder.getData();
        AtomActionDTO action = paymentButtonLarge.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, paymentButtonLarge.getTrackingInfo())) == null) {
            return;
        }
        largePaymentButtonHolder.handleAction(atomAction);
    }

    private final String getDefaultText() {
        return (String) this.defaultText.getValue();
    }

    private final int mapStyle(ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle style) {
        boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(getContext());
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i11 == -1 || i11 == 1 || i11 == 2) {
            return roundCornersFlag ? R$style.LargePaymentButton_GooglePay_Round : R$style.LargePaymentButton_GooglePay;
        }
        if (i11 == 3) {
            return roundCornersFlag ? R$style.LargePaymentButton_FastPay_Round : R$style.LargePaymentButton_FastPay;
        }
        if (i11 == 4) {
            return roundCornersFlag ? R$style.LargePaymentButton_OnlinePay_Round : R$style.LargePaymentButton_OnlinePay;
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.PaymentButtonLarge item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((LargePaymentButtonHolder) item);
        LargePaymentButtonView containerView = getContainerView();
        StyleAppearance<LargePaymentButtonView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle theme = item.getTheme();
        if (theme == null) {
            theme = item.getStyle();
        }
        styleAppearance.read(context, mapStyle(theme));
        this.appearance.apply(containerView);
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
        ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle theme2 = item.getTheme();
        if (theme2 == null) {
            theme2 = item.getStyle();
        }
        if (theme2 != ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.STYLE_TYPE_ONLINE) {
            containerView.setText(null);
            return;
        }
        CharSequence text = item.getText();
        if (text == null) {
            text = getDefaultText();
        }
        containerView.setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargePaymentButtonHolder(@NotNull Context context, String str) {
        this(new LargePaymentButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
