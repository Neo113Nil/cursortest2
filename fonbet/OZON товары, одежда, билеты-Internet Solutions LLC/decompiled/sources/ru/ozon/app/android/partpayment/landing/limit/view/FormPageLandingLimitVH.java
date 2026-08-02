package ru.ozon.app.android.partpayment.landing.limit.view;

import Ar.b;
import Sc.o;
import WZ.t;
import Xw.a;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.partpayment.databinding.WidgetFormPageLandingLimitBinding;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitUiViewMapper;
import ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModel;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001*\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel;)V", "", "errorText", "", "wrongLimit", "(Ljava/lang/String;)V", "sendProblem", "()V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModel;", "Lru/ozon/app/android/partpayment/databinding/WidgetFormPageLandingLimitBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/WidgetFormPageLandingLimitBinding;", "Landroid/view/animation/Animation;", "shakeAnimation", "Landroid/view/animation/Animation;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "shownFlashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "currentItem", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVO;", "ru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVH$textWatcher$1", "textWatcher", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitVH$textWatcher$1;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageLandingLimitVH extends k<FormPageLandingLimitVO> {

    @NotNull
    private final WidgetFormPageLandingLimitBinding binding;

    @NotNull
    private final View containerView;
    private FormPageLandingLimitVO currentItem;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Animation shakeAnimation;
    private Flashbar shownFlashbar;

    @NotNull
    private final FormPageLandingLimitVH$textWatcher$1 textWatcher;

    @NotNull
    private final LandingLimitViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitVH$textWatcher$1] */
    public FormPageLandingLimitVH(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull LandingLimitViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        WidgetFormPageLandingLimitBinding bind = WidgetFormPageLandingLimitBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.shake);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(...)");
        this.shakeAnimation = loadAnimation;
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                WidgetFormPageLandingLimitBinding widgetFormPageLandingLimitBinding;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(s11, "s");
                widgetFormPageLandingLimitBinding = FormPageLandingLimitVH.this.binding;
                TextInputLayout textInputLayout = widgetFormPageLandingLimitBinding.inputTil;
                if (textInputLayout != null) {
                    textInputLayout.Z("");
                }
                composerReferences = FormPageLandingLimitVH.this.references;
                composerReferences.getController().d(new FormPageLandingLimitUiViewMapper.FormPageLandingLimitUpdate(s11.toString()));
            }
        };
        bind.sendBtn.setOnClickListener(new b(this, 5));
        bind.descriptionTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(FormPageLandingLimitVH formPageLandingLimitVH, View view) {
        t tokenizedEvent;
        FormPageLandingLimitVO formPageLandingLimitVO = formPageLandingLimitVH.currentItem;
        if (formPageLandingLimitVO != null) {
            formPageLandingLimitVH.viewModel.sendLimit(formPageLandingLimitVO.getValidationURL(), formPageLandingLimitVO.getName(), String.valueOf(formPageLandingLimitVH.binding.inputEt.getText()));
        }
        FormPageLandingLimitVO formPageLandingLimitVO2 = formPageLandingLimitVH.currentItem;
        if (formPageLandingLimitVO2 == null || (tokenizedEvent = formPageLandingLimitVO2.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(formPageLandingLimitVH.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$3(FormPageLandingLimitVH formPageLandingLimitVH, LandingLimitViewModel.UiAction uiAction) {
        if (Intrinsics.d(uiAction, LandingLimitViewModel.UiAction.SendProblem.INSTANCE)) {
            formPageLandingLimitVH.sendProblem();
        } else {
            if (!(uiAction instanceof LandingLimitViewModel.UiAction.WrongLimit)) {
                throw new o();
            }
            formPageLandingLimitVH.wrongLimit(((LandingLimitViewModel.UiAction.WrongLimit) uiAction).getError());
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final void sendProblem() {
        Flashbar flashbar = this.shownFlashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        ViewGroup rootView = ContextExtKt.getRootView(this.references.getContainer().j());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_message_request_problem));
            int i11 = R$drawable.ic_warning;
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, -1L, null, null, this.references.getContainer().g(), 57306, null);
            this.shownFlashbar = create$default;
            create$default.show();
        }
    }

    private final void wrongLimit(String errorText) {
        TextInputLayout textInputLayout = this.binding.inputTil;
        if (textInputLayout != null) {
            textInputLayout.Z(errorText);
        }
        this.binding.inputTil.startAnimation(this.shakeAnimation);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getUiAction().observe(this, new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FormPageLandingLimitVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.currentItem = item;
        this.containerView.setContentDescription(item.getTitle());
        WidgetFormPageLandingLimitBinding widgetFormPageLandingLimitBinding = this.binding;
        widgetFormPageLandingLimitBinding.titleTv.setText(item.getTitle());
        TextInputEditText textInputEditText = widgetFormPageLandingLimitBinding.inputEt;
        textInputEditText.removeTextChangedListener(this.textWatcher);
        boolean equals = String.valueOf(textInputEditText.getText()).equals(item.getValue());
        textInputEditText.setText(item.getValue());
        if (!equals) {
            textInputEditText.setSelection(item.getValue().length(), item.getValue().length());
        }
        textInputEditText.addTextChangedListener(this.textWatcher);
        widgetFormPageLandingLimitBinding.inputTil.d0(item.getHint());
        TextView textView = widgetFormPageLandingLimitBinding.descriptionTv;
        textView.setText(item.getDescription());
        textView.setContentDescription(item.getDescription());
        widgetFormPageLandingLimitBinding.sendBtn.setText(item.getValidationBtn());
    }
}
