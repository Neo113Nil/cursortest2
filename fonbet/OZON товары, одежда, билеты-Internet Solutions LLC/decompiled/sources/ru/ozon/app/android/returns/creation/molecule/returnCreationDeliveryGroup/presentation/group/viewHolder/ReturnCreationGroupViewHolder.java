package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewHolder;

import JG.a;
import JG.b;
import Vg.d;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationDeliveryGroupBinding;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewObject.DeliveryGroupVO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckboxBindingDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewHolder/ReturnCreationGroupViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewObject/DeliveryGroupVO;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationDeliveryGroupBinding;", "binding", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationDeliveryGroupBinding;LVg/d;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewObject/DeliveryGroupVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationDeliveryGroupBinding;", "LVg/d;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckboxBindingDelegate;", "checkboxDelegate", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckboxBindingDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "actionSelect", "Lkotlin/jvm/functions/Function0;", "Landroid/view/View$OnTouchListener;", "actionSelectTouchListener", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnClickListener;", "actionSelectClickListener", "Landroid/view/View$OnClickListener;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class ReturnCreationGroupViewHolder extends k<DeliveryGroupVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function0<Unit> actionSelect;

    @NotNull
    private final View.OnClickListener actionSelectClickListener;

    @NotNull
    private final View.OnTouchListener actionSelectTouchListener;

    @NotNull
    private final ReturnCreationDeliveryGroupBinding binding;

    @NotNull
    private final RmsCheckboxBindingDelegate checkboxDelegate;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReturnCreationGroupViewHolder(@NotNull ReturnCreationDeliveryGroupBinding binding, @NotNull d customActionHandlersStoreFactory, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        this.checkboxDelegate = new RmsCheckboxBindingDelegate();
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ReturnCreationGroupViewHolder$actionHandler$1(this)).onPreProcess(new ReturnCreationGroupViewHolder$actionHandler$2(oneTimePostRefreshHandler)).buildHandler();
        this.actionSelect = new ReturnCreationGroupViewHolder$actionSelect$1(this);
        a aVar = new a(0, this);
        this.actionSelectTouchListener = aVar;
        b bVar = new b(this, 0);
        this.actionSelectClickListener = bVar;
        binding.getConstraintLayout().setOnClickListener(bVar);
        binding.titleTa.setOnTouchListener(aVar);
        CheckBoxView checkBoxView = binding.checkboxCbv;
        checkBoxView.setClickable(false);
        checkBoxView.setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void actionSelectClickListener$lambda$1(ReturnCreationGroupViewHolder returnCreationGroupViewHolder, View view) {
        returnCreationGroupViewHolder.actionSelect.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean actionSelectTouchListener$lambda$0(ReturnCreationGroupViewHolder returnCreationGroupViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        returnCreationGroupViewHolder.actionSelect.invoke();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryGroupVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        RmsCheckboxBindingDelegate rmsCheckboxBindingDelegate = this.checkboxDelegate;
        CheckBoxView checkboxCbv = this.binding.checkboxCbv;
        Intrinsics.checkNotNullExpressionValue(checkboxCbv, "checkboxCbv");
        rmsCheckboxBindingDelegate.bind(checkboxCbv, item.getCheckbox());
        TextAtomV2View titleTa = this.binding.titleTa;
        Intrinsics.checkNotNullExpressionValue(titleTa, "titleTa");
        TextHolderKt.bind$default(titleTa, item.getTitle(), null, 2, null);
    }
}
