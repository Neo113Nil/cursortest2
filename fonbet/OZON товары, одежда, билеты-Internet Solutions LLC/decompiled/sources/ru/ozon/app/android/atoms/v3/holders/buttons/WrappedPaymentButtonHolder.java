package ru.ozon.app.android.atoms.v3.holders.buttons;

import Cz.ViewOnClickListenerC2788a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.appearance.atom.SmallPaymentButtonAppearance;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.payments.SmallPaymentButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/buttons/WrappedPaymentButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/payments/SmallPaymentButtonView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "", "atomContext", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/payments/SmallPaymentButtonView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall$PaymentButtonSmallStyle;", "style", "", "mapStyle", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall$PaymentButtonSmallStyle;)I", "item", "", "onBind", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall;)V", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "appearance", "Lru/ozon/uni/android/uikit/appearance/StyleAppearance;", "defaultText$delegate", "LSc/j;", "getDefaultText", "()Ljava/lang/String;", "defaultText", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WrappedPaymentButtonHolder extends AtomV3<ButtonV3Atom.PaymentButtonSmall, SmallPaymentButtonView> implements WrappedAtomHolder {

    @NotNull
    private final StyleAppearance<SmallPaymentButtonView> appearance;

    /* renamed from: defaultText$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultText;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle.values().length];
            try {
                iArr[ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle.STYLE_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle.STYLE_TYPE_NATIVE_PAY_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle.STYLE_TYPE_FAST_PAY_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle.STYLE_TYPE_ONLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedPaymentButtonHolder(@NotNull SmallPaymentButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        this.appearance = StyleAppearance.INSTANCE.of(new SmallPaymentButtonAppearance());
        this.defaultText = k.a(n.NONE, WrappedPaymentButtonHolder$defaultText$2.INSTANCE);
        getContainerView().setOnClickListener(new ViewOnClickListenerC2788a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(WrappedPaymentButtonHolder wrappedPaymentButtonHolder, View view) {
        AtomAction atomAction;
        ButtonV3Atom.PaymentButtonSmall paymentButtonSmall = (ButtonV3Atom.PaymentButtonSmall) wrappedPaymentButtonHolder.getData();
        AtomActionDTO action = paymentButtonSmall.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, paymentButtonSmall.getTrackingInfo())) == null) {
            return;
        }
        wrappedPaymentButtonHolder.handleAction(atomAction);
    }

    private final String getDefaultText() {
        return (String) this.defaultText.getValue();
    }

    private final int mapStyle(ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        return ((Number) ExtensionsKt.getExhaustive(Integer.valueOf((i11 == 1 || i11 == 2) ? R$style.LargePaymentButton_GooglePay : i11 != 3 ? i11 != 4 ? R$style.LargePaymentButton_GooglePay : R$style.LargePaymentButton_OnlinePay : R$style.LargePaymentButton_FastPay))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.PaymentButtonSmall item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((WrappedPaymentButtonHolder) item);
        SmallPaymentButtonView containerView = getContainerView();
        StyleAppearance<SmallPaymentButtonView> styleAppearance = this.appearance;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle theme = item.getTheme();
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
        ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle theme2 = item.getTheme();
        if (theme2 == null) {
            theme2 = item.getStyle();
        }
        if (theme2 != ButtonV3Atom.PaymentButtonSmall.PaymentButtonSmallStyle.STYLE_TYPE_ONLINE) {
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
    public WrappedPaymentButtonHolder(@NotNull Context context, String str) {
        this(new SmallPaymentButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
