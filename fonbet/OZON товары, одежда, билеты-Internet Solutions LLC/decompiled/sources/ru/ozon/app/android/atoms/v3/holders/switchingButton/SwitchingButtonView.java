package ru.ozon.app.android.atoms.v3.holders.switchingButton;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.atoms.databinding.SwitchingButtonAtomViewBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@InterfaceC3999a
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u000b*\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u001dR0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010)¨\u00060"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/switchingButton/SwitchingButtonView;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "bindReverted", "()V", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getButton", "(Lru/ozon/app/android/atoms/data/button/SwitchingButton;)Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "shouldRevertState", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "isActive", "setLocator", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Ljava/lang/Boolean;)V", "molecule", "bind", "(Lru/ozon/app/android/atoms/data/button/SwitchingButton;)V", "bindOrGone", "Lru/ozon/app/android/atoms/databinding/SwitchingButtonAtomViewBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/SwitchingButtonAtomViewBinding;", "currentModel", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "getCurrentModel", "()Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "setCurrentModel", "Lkotlin/Function1;", "buttonChanged", "Lkotlin/jvm/functions/Function1;", "getButtonChanged", "()Lkotlin/jvm/functions/Function1;", "setButtonChanged", "(Lkotlin/jvm/functions/Function1;)V", "actionHandler", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwitchingButtonView extends FrameLayout implements AtomView {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final SwitchingButtonAtomViewBinding binding;
    private Function1<? super AtomAction, Unit> buttonChanged;
    private SwitchingButton currentModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.holders.switchingButton.SwitchingButtonView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
            invoke2(atomAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SwitchingButtonView switchingButtonView = SwitchingButtonView.this;
            SingleAtom switchingButton = switchingButtonView.binding.switchingButton;
            Intrinsics.checkNotNullExpressionValue(switchingButton, "switchingButton");
            SwitchingButton currentModel = SwitchingButtonView.this.getCurrentModel();
            switchingButtonView.setLocator(switchingButton, currentModel != null ? Boolean.valueOf(currentModel.isActive()) : null);
            if (SwitchingButtonView.this.shouldRevertState(it)) {
                SwitchingButtonView.this.bindReverted();
            }
            Function1<AtomAction, Unit> buttonChanged = SwitchingButtonView.this.getButtonChanged();
            if (buttonChanged != null) {
                buttonChanged.invoke(it);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchingButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindReverted() {
        SwitchingButton switchingButton = this.currentModel;
        if (switchingButton != null) {
            bind(SwitchingButton.copy$default(switchingButton, null, !switchingButton.isActive(), null, null, null, null, 61, null));
        }
    }

    private final AtomDTO getButton(SwitchingButton switchingButton) {
        AtomDTO activeButton;
        return (!switchingButton.isActive() || (activeButton = switchingButton.getActiveButton()) == null) ? switchingButton.getDefaultButton() : activeButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLocator(SingleAtom singleAtom, Boolean bool) {
        singleAtom.setContentDescription(Intrinsics.d(bool, Boolean.TRUE) ? "switchingButtonActive" : "switchingButtonDisabled");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRevertState(AtomAction action) {
        if (!(action instanceof AtomAction.ComposerAction)) {
            return false;
        }
        SwitchingButton switchingButton = this.currentModel;
        return (switchingButton != null ? switchingButton.getActiveButton() : null) != null;
    }

    public final void bind(@NotNull SwitchingButton molecule) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        this.currentModel = molecule;
        this.binding.switchingButton.setOnAction(this.actionHandler);
        SingleAtom.bind$default(this.binding.switchingButton, getButton(molecule), false, 2, null);
        SingleAtom switchingButton = this.binding.switchingButton;
        Intrinsics.checkNotNullExpressionValue(switchingButton, "switchingButton");
        SwitchingButton switchingButton2 = this.currentModel;
        setLocator(switchingButton, switchingButton2 != null ? Boolean.valueOf(switchingButton2.isActive()) : null);
    }

    public final void bindOrGone(SwitchingButton molecule) {
        if (molecule == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(molecule);
        }
    }

    public final Function1<AtomAction, Unit> getButtonChanged() {
        return this.buttonChanged;
    }

    public final SwitchingButton getCurrentModel() {
        return this.currentModel;
    }

    public final void setButtonChanged(Function1<? super AtomAction, Unit> function1) {
        this.buttonChanged = function1;
    }

    public /* synthetic */ SwitchingButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchingButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = SwitchingButtonAtomViewBinding.inflate(LayoutInflater.from(context), this);
        this.actionHandler = new AnonymousClass1();
    }
}
