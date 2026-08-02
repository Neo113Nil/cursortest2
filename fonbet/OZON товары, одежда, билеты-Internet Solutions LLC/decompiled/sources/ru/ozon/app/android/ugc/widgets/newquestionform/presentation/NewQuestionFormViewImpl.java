package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import WZ.l;
import WZ.t;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.r;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.ugc.databinding.WidgetNewQuestionFormBinding;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormVO;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010!J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010!J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010!J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u00101R8\u00104\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u0006\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewImpl;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormView;", "Lru/ozon/app/android/ugc/databinding/WidgetNewQuestionFormBinding;", "binding", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetNewQuestionFormBinding;Lkotlin/jvm/functions/Function1;LWZ/l;Ll10/i;)V", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "vo", "bindImage", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;)V", "bindTitle", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;", "secondHeader", "bindSecondHeader", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO$Header;)V", "bindInput", "bindAnonymousCell", "bindPolicyRules", "bindSubmitButton", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "bind", "onSuccess", "()V", "onShowProgress", "onHideProgress", "", "message", "onInputError", "(Ljava/lang/String;)V", "onNetworkError", "onUnknownError", "Landroidx/core/widget/NestedScrollView;", "getContainerView", "()Landroidx/core/widget/NestedScrollView;", "Lru/ozon/app/android/ugc/databinding/WidgetNewQuestionFormBinding;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Ll10/i;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "Lkotlin/Function2;", "", "onSubmit", "Lkotlin/jvm/functions/Function2;", "getOnSubmit", "()Lkotlin/jvm/functions/Function2;", "setOnSubmit", "(Lkotlin/jvm/functions/Function2;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewQuestionFormViewImpl implements NewQuestionFormView {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetNewQuestionFormBinding binding;

    @NotNull
    private final i container;
    private Function2<? super String, ? super Boolean, Unit> onSubmit;

    @NotNull
    private final l tokenizedAnalytics;
    private NewQuestionFormVO vo;

    /* JADX WARN: Multi-variable type inference failed */
    public NewQuestionFormViewImpl(@NotNull final WidgetNewQuestionFormBinding binding, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull i container) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        this.binding = binding;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.container = container;
        TextInputEditText inputEt = binding.inputEt;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        inputEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormViewImpl$_init_$lambda$1$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                WidgetNewQuestionFormBinding.this.inputMtil.Z(null);
                WidgetNewQuestionFormBinding.this.inputMtil.a0(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        binding.policyRulesSa.setOnAction(actionHandler);
        binding.submitSa.setOnAction(new NewQuestionFormViewImpl$1$2(this, binding));
    }

    private final void bindAnonymousCell(NewQuestionFormVO vo) {
        WidgetNewQuestionFormBinding widgetNewQuestionFormBinding = this.binding;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell = vo.getAnonymousCell();
        if (anonymousCell != null) {
            widgetNewQuestionFormBinding.anonymousSa.setOnAction(null);
            SingleAtom.bind$default(widgetNewQuestionFormBinding.anonymousSa, anonymousCell, false, 2, null);
            widgetNewQuestionFormBinding.anonymousSa.setOnAction(new NewQuestionFormViewImpl$bindAnonymousCell$1$1$1(this));
        } else {
            SingleAtom anonymousSa = widgetNewQuestionFormBinding.anonymousSa;
            Intrinsics.checkNotNullExpressionValue(anonymousSa, "anonymousSa");
            ViewExtKt.gone(anonymousSa);
        }
    }

    private final void bindImage(NewQuestionFormVO vo) {
        ImageView productIv = this.binding.productIv;
        Intrinsics.checkNotNullExpressionValue(productIv, "productIv");
        ImageViewExtKt.loadImageOrGone(productIv, vo.getHeader().getImage());
    }

    private final void bindInput(NewQuestionFormVO vo) {
        WidgetNewQuestionFormBinding widgetNewQuestionFormBinding = this.binding;
        widgetNewQuestionFormBinding.inputMtil.d0(vo.getInputPlaceholder());
        widgetNewQuestionFormBinding.inputEt.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(vo.getInputMaxLength())});
    }

    private final void bindPolicyRules(NewQuestionFormVO vo) {
        SingleAtom policyRulesSa = this.binding.policyRulesSa;
        Intrinsics.checkNotNullExpressionValue(policyRulesSa, "policyRulesSa");
        ContainerExtKt.bindOrGone$default(policyRulesSa, vo.getPolicyRulesButton(), false, 2, null);
    }

    private final void bindSecondHeader(NewQuestionFormVO.Header secondHeader) {
        WidgetNewQuestionFormBinding widgetNewQuestionFormBinding = this.binding;
        if (secondHeader == null) {
            Group secondHeaderGroup = widgetNewQuestionFormBinding.secondHeaderGroup;
            Intrinsics.checkNotNullExpressionValue(secondHeaderGroup, "secondHeaderGroup");
            ViewExtKt.gone(secondHeaderGroup);
            return;
        }
        Group secondHeaderGroup2 = widgetNewQuestionFormBinding.secondHeaderGroup;
        Intrinsics.checkNotNullExpressionValue(secondHeaderGroup2, "secondHeaderGroup");
        ViewExtKt.show(secondHeaderGroup2);
        ImageView secondHeaderProductIv = widgetNewQuestionFormBinding.secondHeaderProductIv;
        Intrinsics.checkNotNullExpressionValue(secondHeaderProductIv, "secondHeaderProductIv");
        ImageViewExtKt.loadImageOrGone(secondHeaderProductIv, secondHeader.getImage());
        TextAtomV2View secondHeaderProductTav = widgetNewQuestionFormBinding.secondHeaderProductTav;
        Intrinsics.checkNotNullExpressionValue(secondHeaderProductTav, "secondHeaderProductTav");
        TextHolderKt.bind$default(secondHeaderProductTav, secondHeader.getText(), null, 2, null);
    }

    private final void bindSubmitButton(NewQuestionFormVO vo) {
        SingleAtom.bind$default(this.binding.submitSa, vo.getSendButton(), false, 2, null);
    }

    private final void bindTitle(NewQuestionFormVO vo) {
        TextAtomV2View productTav = this.binding.productTav;
        Intrinsics.checkNotNullExpressionValue(productTav, "productTav");
        TextHolderKt.bind$default(productTav, vo.getHeader().getText(), null, 2, null);
    }

    private final void showNotification(NotificationDTO notification) {
        r a11;
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a12 = this.container.Q().a();
        if (a12 == null || (a11 = this.container.Q().a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, a12, null, 8, null).show();
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void bind(@NotNull NewQuestionFormVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.vo = vo;
        bindImage(vo);
        bindTitle(vo);
        bindSecondHeader(vo.getSecondHeader());
        bindInput(vo);
        bindAnonymousCell(vo);
        bindPolicyRules(vo);
        bindSubmitButton(vo);
    }

    public Function2<String, Boolean, Unit> getOnSubmit() {
        return this.onSubmit;
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void onHideProgress() {
        WidgetNewQuestionFormBinding widgetNewQuestionFormBinding = this.binding;
        ConstraintLayout contentFl = widgetNewQuestionFormBinding.contentFl;
        Intrinsics.checkNotNullExpressionValue(contentFl, "contentFl");
        ViewExtKt.show(contentFl);
        widgetNewQuestionFormBinding.progressPb.c();
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void onInputError(String message) {
        if (message != null) {
            this.binding.inputMtil.Z(message);
            this.binding.inputMtil.a0(true);
        }
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void onNetworkError() {
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        showNotification(NotificationBarHelperKt.createNetworkErrorNotificationDTO(appTypeResolver.isSelect(context)));
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void onShowProgress() {
        WidgetNewQuestionFormBinding widgetNewQuestionFormBinding = this.binding;
        ConstraintLayout contentFl = widgetNewQuestionFormBinding.contentFl;
        Intrinsics.checkNotNullExpressionValue(contentFl, "contentFl");
        ViewExtKt.gone(contentFl);
        widgetNewQuestionFormBinding.progressPb.d();
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void onSuccess() {
        NewQuestionFormVO newQuestionFormVO = this.vo;
        if (newQuestionFormVO == null) {
            Intrinsics.n("vo");
            throw null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = newQuestionFormVO.getSendButton().getTrackingInfo();
        if (trackingInfo != null) {
            NewQuestionFormVO newQuestionFormVO2 = this.vo;
            if (newQuestionFormVO2 == null) {
                Intrinsics.n("vo");
                throw null;
            }
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(newQuestionFormVO2.getId()), null, 2, null);
            if (mapToTokenizedEvent$default != null) {
                TokenizedAnalyticsExtensionsKt.processComposerEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
            }
        }
        e V11 = this.container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        ComposerReferences composerReferences = (ComposerReferences) V11;
        ComposerExtKt.setResult$default(composerReferences.getContainer(), null, 0, null, 7, null);
        ComposerExtKt.closeFlow(composerReferences.getContainer());
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void onUnknownError() {
        showNotification(NotificationsKt.createFailedToSendNotification());
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    public void setOnSubmit(Function2<? super String, ? super Boolean, Unit> function2) {
        this.onSubmit = function2;
    }

    @Override // ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormView
    @NotNull
    public NestedScrollView getContainerView() {
        NestedScrollView constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }
}
