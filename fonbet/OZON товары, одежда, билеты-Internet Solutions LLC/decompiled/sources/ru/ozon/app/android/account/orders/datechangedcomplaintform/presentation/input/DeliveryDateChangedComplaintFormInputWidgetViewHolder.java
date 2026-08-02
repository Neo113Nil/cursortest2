package ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input;

import Jk.a;
import Vg.d;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.G;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.CommentUpdated;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.DeliveryDateChangedComplaintFormInputWidgetViewHolder;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.cs_orders.databinding.WidgetDeliveryDateChangedComplaintFormInputBinding;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetDeliveryDateChangedComplaintFormInputBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetDeliveryDateChangedComplaintFormInputBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;Ll20/d;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetDeliveryDateChangedComplaintFormInputBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryDateChangedComplaintFormInputWidgetViewHolder extends k<DeliveryDateChangedComplaintFormInputVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDeliveryDateChangedComplaintFormInputBinding binding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Set<Class<ComposerActionWithActionHandler>> SUPPORTED_ACTIONS = e0.h(ComposerActionWithActionHandler.class);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputWidgetViewHolder$Companion;", "", "<init>", "()V", "COMMENT_MAX_LENGTH", "", "COMMENT_WARNING_LENGTH", "SUPPORTED_ACTIONS", "", "Ljava/lang/Class;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionHandler;", "getSUPPORTED_ACTIONS", "()Ljava/util/Set;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Class<ComposerActionWithActionHandler>> getSUPPORTED_ACTIONS() {
            return DeliveryDateChangedComplaintFormInputWidgetViewHolder.SUPPORTED_ACTIONS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryDateChangedComplaintFormInputWidgetViewHolder(@NotNull final WidgetDeliveryDateChangedComplaintFormInputBinding binding, @NotNull final ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        View view;
        RecyclerView composerRecyclerViewOrNull;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new DeliveryDateChangedComplaintFormInputWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        binding.commentTiet.setOnTouchListener(new a());
        TextInputEditText commentTiet = binding.commentTiet;
        Intrinsics.checkNotNullExpressionValue(commentTiet, "commentTiet");
        commentTiet.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.DeliveryDateChangedComplaintFormInputWidgetViewHolder$_init_$lambda$5$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                String str;
                if (s11 == null) {
                    return;
                }
                boolean z11 = s11.length() >= 220;
                WidgetDeliveryDateChangedComplaintFormInputBinding.this.commentTil.setShowError(z11);
                if (z11) {
                    str = s11.length() + "/255";
                } else {
                    str = null;
                }
                AppCompatTextView commentErrorTv = WidgetDeliveryDateChangedComplaintFormInputBinding.this.commentErrorTv;
                Intrinsics.checkNotNullExpressionValue(commentErrorTv, "commentErrorTv");
                TextViewExtKt.setTextOrGone(commentErrorTv, str);
                final MobilizationTextInputLayout commentTil = WidgetDeliveryDateChangedComplaintFormInputBinding.this.commentTil;
                Intrinsics.checkNotNullExpressionValue(commentTil, "commentTil");
                final ComposerReferences composerReferences = refs;
                final WidgetDeliveryDateChangedComplaintFormInputBinding widgetDeliveryDateChangedComplaintFormInputBinding = WidgetDeliveryDateChangedComplaintFormInputBinding.this;
                G.a(commentTil, new Runnable() { // from class: ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.DeliveryDateChangedComplaintFormInputWidgetViewHolder$lambda$5$lambda$2$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view2;
                        RecyclerView composerRecyclerViewOrNull2;
                        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                        if (c11 == null || (view2 = c11.getView()) == null || (composerRecyclerViewOrNull2 = ComposerViewExtensionKt.composerRecyclerViewOrNull(view2)) == null) {
                            return;
                        }
                        composerRecyclerViewOrNull2.scrollBy(0, widgetDeliveryDateChangedComplaintFormInputBinding.submitBtn.getHeight());
                    }
                });
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        TextInputEditText commentTiet2 = binding.commentTiet;
        Intrinsics.checkNotNullExpressionValue(commentTiet2, "commentTiet");
        commentTiet2.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.DeliveryDateChangedComplaintFormInputWidgetViewHolder$_init_$lambda$5$$inlined$doAfterTextChanged$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                ComposerReferences.this.getController().update(new CommentUpdated(s11 != null ? s11.toString() : null));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) {
            return;
        }
        composerRecyclerViewOrNull.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Jk.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                DeliveryDateChangedComplaintFormInputWidgetViewHolder.lambda$5$lambda$4(WidgetDeliveryDateChangedComplaintFormInputBinding.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$5$lambda$0(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(WidgetDeliveryDateChangedComplaintFormInputBinding widgetDeliveryDateChangedComplaintFormInputBinding, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i18 != i14) {
            RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
            if (recyclerView != null) {
                recyclerView.scrollBy(0, widgetDeliveryDateChangedComplaintFormInputBinding.submitBtn.getHeight() * 5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryDateChangedComplaintFormInputVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        MobilizationTextInputLayout mobilizationTextInputLayout = this.binding.commentTil;
        String hint = item.getInput().getHint();
        if (hint == null) {
            hint = "";
        }
        mobilizationTextInputLayout.setHint(hint);
        ButtonV3View submitBtn = this.binding.submitBtn;
        Intrinsics.checkNotNullExpressionValue(submitBtn, "submitBtn");
        ButtonV3HolderKt.bind(submitBtn, item.getSubmitButton(), this.actionHandler);
    }
}
