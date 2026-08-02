package ru.ozon.app.android.checkoutcomposer.discountcode.presentation;

import Bc.t;
import Bl.b;
import Lm0.a;
import android.app.Dialog;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.camera.core.impl.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.atoms.R$string;
import ru.ozon.app.android.checkout.databinding.WidgetDiscountCodeBinding;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.DiscountCodeVO;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.ValidateCodeBody;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.ValidateCodeResponse;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\r2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/presentation/DiscountCodeVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;", "Lru/ozon/app/android/checkout/databinding/WidgetDiscountCodeBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetDiscountCodeBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "validateCode", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "", "e", "processValidateFail", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/ValidateCodeResponse;", "response", "processValidateResponse", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)V", "showDefaultInputError", "()V", "", "message", "showFlashbar", "(Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;Ll20/d;)V", "onAttach", "onDetach", "Lru/ozon/app/android/checkout/databinding/WidgetDiscountCodeBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/Runnable;", "openKeyboardRunnable", "Ljava/lang/Runnable;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountCodeVH extends k<DiscountCodeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDiscountCodeBinding binding;

    @NotNull
    private final Runnable openKeyboardRunnable;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final ActionV2Repository repository;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/presentation/DiscountCodeVH$Companion;", "", "<init>", "()V", "SHOW_KEYBOARD_DELAY", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DiscountCodeVH(@NotNull WidgetDiscountCodeBinding binding, @NotNull ComposerReferences ref, @NotNull ActionV2Repository repository) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(repository, "repository");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.repository = repository;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).onComposerAction(new DiscountCodeVH$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.openKeyboardRunnable = new Y(this, 2);
        binding.buttonAtom.setOnAction(buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openKeyboardRunnable$lambda$1(DiscountCodeVH discountCodeVH) {
        EditText editText = discountCodeVH.binding.valueEt;
        editText.requestFocus();
        KeyboardUtilsKt.showKeyboard(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processValidateFail(Throwable e11) {
        a.f17149a.e(e11);
        showDefaultInputError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processValidateResponse(ActionV2Response<ValidateCodeResponse> response) {
        ValidateCodeResponse.Data data;
        String message;
        ValidateCodeResponse data2 = response.getData();
        if ((data2 != null ? data2.getError() : null) != null) {
            ValidateCodeResponse data3 = response.getData();
            this.binding.valueEt.setError(data3 != null ? data3.getError() : null);
            return;
        }
        ValidateCodeResponse data4 = response.getData();
        if (data4 != null && (data = data4.getData()) != null && (message = data.getMessage()) != null) {
            showFlashbar(message);
        }
        ComposerExtKt.sendRefreshToTargetFragment$default(this.ref.getContainer(), null, null, null, null, 15, null);
        this.ref.getNavigator().popBackStack();
    }

    private final void showDefaultInputError() {
        this.binding.valueEt.setError(StringProvider.getString(R$string.common_error_try_one_more_time));
    }

    private final void showFlashbar(String message) {
        ViewGroup b11 = b.b(this.ref);
        if (b11 != null) {
            RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, b11, C7714v.m0(new Restriction(null, message, null, null, Restriction.Type.SUCCESS.getValue(), null, null, null, null, null, null, null, 4077, null)), this.ref.getContainer().g(), null, null, null, null, null, 248, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateCode(AtomAction.ComposerAction action) {
        t g10 = this.repository.callActionWithTracking(new ActionV2Request(new ValidateCodeBody(this.binding.valueEt.getText().toString()), action.getActionName(), false, 4, null), getTrackingData(), ValidateCodeResponse.class).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        RxExtKt.subscribe(g10, this, new DiscountCodeVH$validateCode$1(this), new DiscountCodeVH$validateCode$2(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        Window window;
        ComponentCallbacksC5392m c11 = this.ref.getContainer().c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        Intrinsics.g(parentFragment, "null cannot be cast to non-null type ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment");
        Dialog dialog = ((BottomSheetComposerFragment) parentFragment).getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        super.onAttach();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        LinearLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.f(constraintLayout);
        KeyboardUtilsKt.hideKeyboard(constraintLayout);
        constraintLayout.removeCallbacks(this.openKeyboardRunnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DiscountCodeVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetDiscountCodeBinding widgetDiscountCodeBinding = this.binding;
        widgetDiscountCodeBinding.buttonAtom.bind(item.getButton());
        widgetDiscountCodeBinding.valueTil.setHint(item.getInput().getHint());
        widgetDiscountCodeBinding.valueEt.setText(item.getInput().getText());
        widgetDiscountCodeBinding.getConstraintLayout().postDelayed(this.openKeyboardRunnable, 100L);
    }
}
