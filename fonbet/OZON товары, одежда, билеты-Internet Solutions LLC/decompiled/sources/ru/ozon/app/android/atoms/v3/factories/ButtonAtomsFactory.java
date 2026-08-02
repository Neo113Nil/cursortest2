package ru.ozon.app.android.atoms.v3.factories;

import Sc.o;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.atoms.v3.holders.buttons.LargeIconButtonHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.LargePaymentButtonHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedPaymentButtonHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.cart.AddToCartButtonImageHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.cart.AddToCartButtonWithQuantityHolder;
import ru.ozon.app.android.atoms.v3.holders.switchingButton.SwitchingButtonHolder;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.atoms.AtomsFactory;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.buttons.GetButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeGradientButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.ResizableSmallButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonWithIconHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedSmallButtonWithIconHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.cart.AddToCartButtonHolder;
import ru.ozon.uni.atoms.v3.holders.buttons.joinPurchase.AddToJointPurchaseButtonHolder;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0006\b\u0001\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0015\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u0015\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\t\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/v3/factories/ButtonAtomsFactory;", "Lru/ozon/uni/atoms/AtomsFactory;", "<init>", "()V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "dto", "Landroid/content/Context;", "context", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Landroid/view/View;", "parseButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom;Landroid/content/Context;)Lru/ozon/uni/atoms/v3/AtomV3;", "Lkotlin/reflect/d;", "viewType", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/uni/atoms/af/Atom;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "createAtom", "(Landroid/content/Context;Lkotlin/reflect/d;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "data", "onAction", "(Landroid/content/Context;Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/af/Atom;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonAtomsFactory implements AtomsFactory {
    private final AtomV3<? extends AtomDTO, ? extends View> parseButton(ButtonV3Atom dto, Context context) {
        Object resizableSmallButtonHolder;
        if (dto instanceof ButtonV3Atom.LargeButton) {
            resizableSmallButtonHolder = new LargeButtonHolder(context, ((ButtonV3Atom.LargeButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.LargeGradientButton) {
            resizableSmallButtonHolder = new LargeGradientButtonHolder(context, ((ButtonV3Atom.LargeGradientButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.SmallButton) {
            resizableSmallButtonHolder = new WrappedButtonHolder(context, ((ButtonV3Atom.SmallButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.LargeBorderlessButton) {
            resizableSmallButtonHolder = new LargeBorderlessButtonHolder(context, ((ButtonV3Atom.LargeBorderlessButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.SmallBorderlessButton) {
            resizableSmallButtonHolder = new WrappedBorderlessButtonHolder(context, ((ButtonV3Atom.SmallBorderlessButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.SmallButtonWithIcon) {
            resizableSmallButtonHolder = new WrappedSmallButtonWithIconHolder(context, ((ButtonV3Atom.SmallButtonWithIcon) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.SmallBorderlessButtonWithIcon) {
            resizableSmallButtonHolder = new WrappedBorderlessButtonWithIconHolder(context, ((ButtonV3Atom.SmallBorderlessButtonWithIcon) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.PaymentButtonLarge) {
            resizableSmallButtonHolder = new LargePaymentButtonHolder(context, ((ButtonV3Atom.PaymentButtonLarge) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.PaymentButtonSmall) {
            resizableSmallButtonHolder = new WrappedPaymentButtonHolder(context, ((ButtonV3Atom.PaymentButtonSmall) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.GetButton) {
            resizableSmallButtonHolder = new GetButtonHolder(context, ((ButtonV3Atom.GetButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.SmallIconButton) {
            resizableSmallButtonHolder = new WrappedIconButtonHolder(context, ((ButtonV3Atom.SmallIconButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.LargeIconButton) {
            resizableSmallButtonHolder = new LargeIconButtonHolder(context, ((ButtonV3Atom.LargeIconButton) dto).getContext(), false, 4, (DefaultConstructorMarker) null);
        } else if (dto instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
            resizableSmallButtonHolder = new AddToCartButtonWithQuantityHolder(context, ((ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.AddToCartAtom.AddToCartButton) {
            resizableSmallButtonHolder = new AddToCartButtonHolder(context, ((ButtonV3Atom.AddToCartAtom.AddToCartButton) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) {
            resizableSmallButtonHolder = new AddToCartButtonImageHolder(context, ((ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) dto).getContext());
        } else if (dto instanceof ButtonV3Atom.AddToJointPurchaseButton) {
            resizableSmallButtonHolder = new AddToJointPurchaseButtonHolder(context, ((ButtonV3Atom.AddToJointPurchaseButton) dto).getContext());
        } else {
            if (!(dto instanceof ButtonV3Atom.ResizableSmallButton)) {
                throw new o();
            }
            resizableSmallButtonHolder = new ResizableSmallButtonHolder(context, ((ButtonV3Atom.ResizableSmallButton) dto).getContext());
        }
        return (AtomV3) ExtensionsKt.getExhaustive(resizableSmallButtonHolder);
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.LargeButton.class))) {
            return new LargeButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.LargeGradientButton.class))) {
            return new LargeGradientButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.SmallButton.class))) {
            return new WrappedButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.ResizableSmallButton.class))) {
            return new ResizableSmallButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.SmallButtonWithIcon.class))) {
            return new WrappedSmallButtonWithIconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.LargeBorderlessButton.class))) {
            return new LargeBorderlessButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.SmallBorderlessButton.class))) {
            return new WrappedBorderlessButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.SmallBorderlessButtonWithIcon.class))) {
            return new WrappedBorderlessButtonWithIconHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.PaymentButtonLarge.class))) {
            return new LargePaymentButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.PaymentButtonSmall.class))) {
            return new WrappedPaymentButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.GetButton.class))) {
            return new GetButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.SmallIconButton.class))) {
            return new WrappedIconButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.LargeIconButton.class))) {
            return new LargeIconButtonHolder(context, (String) null, false, 4, (DefaultConstructorMarker) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.class))) {
            return new AddToCartButtonWithQuantityHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.AddToCartAtom.AddToCartButton.class))) {
            return new AddToCartButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.AddToCartAtom.AddToCartButtonImage.class))) {
            return new AddToCartButtonImageHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(ButtonV3Atom.AddToJointPurchaseButton.class))) {
            return new AddToJointPurchaseButtonHolder(context, (String) null);
        }
        if (Intrinsics.d(viewType, N.b(SwitchingButton.class))) {
            return new SwitchingButtonHolder(context, (String) null);
        }
        return null;
    }

    @Override // ru.ozon.uni.atoms.AtomsFactory
    public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createAtom(@NotNull Context context, @NotNull AtomDTO data, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (data instanceof ButtonV3Atom) {
            return parseButton((ButtonV3Atom) data, context);
        }
        return null;
    }
}
