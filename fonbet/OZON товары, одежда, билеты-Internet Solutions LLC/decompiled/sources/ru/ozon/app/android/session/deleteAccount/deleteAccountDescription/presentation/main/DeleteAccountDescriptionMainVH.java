package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main;

import Bl.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.session.databinding.WidgetDeleteAccountDescriptionBinding;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.DeleteAccountDescriptionFieldErrorUpdateEvent;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.DeleteAccountDescriptionUpdateEvent;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionMainVO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010(\u001a\u00060&j\u0002`'H\u0014¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "message", "", "showFieldError", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/deprecated/Annotation;", "item", "bindAnnotation", "(Lru/ozon/uni/atoms/data/deprecated/Annotation;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;", "conditions", "bindConditions", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;", "reason", "bindReason", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;)V", "showRestriction", "id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateReason", "(Ljava/lang/String;Ljava/lang/String;)V", "error", "updateError", "onAttach", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;Ll20/d;)V", "Landroid/view/View;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "getViewModel", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "getRef", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/databinding/WidgetDeleteAccountDescriptionBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetDeleteAccountDescriptionBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter;", "conditionsAdapter", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/ConditionDescriptionsAdapter;", "reasonId", "Ljava/lang/String;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "textWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountDescriptionMainVH extends k<DeleteAccountDescriptionMainVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDeleteAccountDescriptionBinding binding;

    @NotNull
    private final ConditionDescriptionsAdapter conditionsAdapter;

    @NotNull
    private final View containerView;
    private String reasonId;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final SimpleTextWatcher textWatcher;

    @NotNull
    private final DeleteAccountDescriptionStickyViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountDescriptionMainVH(@NotNull View containerView, @NotNull DeleteAccountDescriptionStickyViewModel viewModel, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.ref = ref;
        WidgetDeleteAccountDescriptionBinding bind = WidgetDeleteAccountDescriptionBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).onComposerAction(new DeleteAccountDescriptionMainVH$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        ConditionDescriptionsAdapter conditionDescriptionsAdapter = new ConditionDescriptionsAdapter(buildHandler);
        this.conditionsAdapter = conditionDescriptionsAdapter;
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionMainVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String str;
                WidgetDeleteAccountDescriptionBinding widgetDeleteAccountDescriptionBinding;
                Intrinsics.checkNotNullParameter(editable, "editable");
                str = DeleteAccountDescriptionMainVH.this.reasonId;
                if (str != null) {
                    DeleteAccountDescriptionMainVH deleteAccountDescriptionMainVH = DeleteAccountDescriptionMainVH.this;
                    String obj = editable.toString();
                    deleteAccountDescriptionMainVH.updateReason(str, obj);
                    DeleteAccountDescriptionMainVH.updateError$default(deleteAccountDescriptionMainVH, null, 1, null);
                    deleteAccountDescriptionMainVH.getViewModel().textUpdated(str, obj);
                    widgetDeleteAccountDescriptionBinding = deleteAccountDescriptionMainVH.binding;
                    TextInputLayout textInputLayout = widgetDeleteAccountDescriptionBinding.reasonTil;
                    textInputLayout.Z(null);
                    textInputLayout.a0(false);
                }
            }
        };
        bind.conditionRV.setAdapter(conditionDescriptionsAdapter);
        bind.submitSA.setOnAction(buildHandler);
    }

    private final void bindAnnotation(Annotation item) {
        SingleAtom singleAtom = this.binding.annotationSA;
        if (item == null) {
            Intrinsics.f(singleAtom);
            ViewExtKt.gone(singleAtom);
            return;
        }
        SingleAtom.bind$default(singleAtom, item, false, 2, null);
        ImageView imageView = (ImageView) singleAtom.findViewById(R$id.iconIv);
        if (imageView != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, item.getTextColor());
            imageView.setImageTintList(parseColor != null ? ColorStateList.valueOf(parseColor.intValue()) : null);
        }
    }

    private final void bindConditions(DeleteAccountDescriptionMainVO.Conditions conditions) {
        this.binding.titleConditionTAV.setText(conditions.getTitle());
        this.conditionsAdapter.submitList(conditions.getDescriptions());
    }

    private final void bindReason(DeleteAccountDescriptionMainVO.Reason reason) {
        DeleteAccountDescriptionMainVO.Reason.Input input;
        DeleteAccountDescriptionMainVO.Reason.Input input2;
        DeleteAccountDescriptionMainVO.Reason.Input input3;
        this.reasonId = (reason == null || (input3 = reason.getInput()) == null) ? null : input3.getId();
        WidgetDeleteAccountDescriptionBinding widgetDeleteAccountDescriptionBinding = this.binding;
        widgetDeleteAccountDescriptionBinding.reasonEt.removeTextChangedListener(this.textWatcher);
        TextAtomView titleReasonTAV = widgetDeleteAccountDescriptionBinding.titleReasonTAV;
        Intrinsics.checkNotNullExpressionValue(titleReasonTAV, "titleReasonTAV");
        TextViewExtKt.setTextOrGone(titleReasonTAV, reason != null ? reason.getTitle() : null);
        TextInputLayout reasonTil = widgetDeleteAccountDescriptionBinding.reasonTil;
        Intrinsics.checkNotNullExpressionValue(reasonTil, "reasonTil");
        ViewExtKt.showOrGone(reasonTil, Boolean.valueOf(reason != null));
        widgetDeleteAccountDescriptionBinding.reasonTil.d0((reason == null || (input2 = reason.getInput()) == null) ? null : input2.getHint());
        widgetDeleteAccountDescriptionBinding.reasonEt.setText((reason == null || (input = reason.getInput()) == null) ? null : input.getText());
        widgetDeleteAccountDescriptionBinding.reasonEt.addTextChangedListener(this.textWatcher);
        SingleAtom submitSA = widgetDeleteAccountDescriptionBinding.submitSA;
        Intrinsics.checkNotNullExpressionValue(submitSA, "submitSA");
        ContainerExtKt.bindOrGone$default(submitSA, reason != null ? reason.getSubmitButton() : null, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFieldError(String message) {
        this.binding.reasonTil.Z(message);
        if (message == null) {
            message = "";
        }
        updateError(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRestriction(String message) {
        String string = message == null ? StringProvider.getString(R$string.common_universal_network_error) : message;
        ViewGroup b11 = b.b(this.ref);
        if (b11 != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, b11, null, OzonSpannableStringKt.toOzonSpannableString(string), null, null, Integer.valueOf(R$drawable.ic_warning), null, null, null, null, null, null, null, 3000L, null, null, this.ref.getContainer().g(), 57306, null).show();
        }
    }

    private final void updateError(String error) {
        this.ref.getController().d(new DeleteAccountDescriptionFieldErrorUpdateEvent(error));
    }

    static /* synthetic */ void updateError$default(DeleteAccountDescriptionMainVH deleteAccountDescriptionMainVH, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        deleteAccountDescriptionMainVH.updateError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateReason(String id2, String value) {
        this.ref.getController().d(new DeleteAccountDescriptionUpdateEvent(id2, value));
    }

    @NotNull
    public final ComposerReferences getRef() {
        return this.ref;
    }

    @NotNull
    public final DeleteAccountDescriptionStickyViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getAction().observe(this, new DeleteAccountDescriptionMainVH$sam$androidx_lifecycle_Observer$0(new DeleteAccountDescriptionMainVH$onAttach$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeleteAccountDescriptionMainVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindAnnotation(item.getRestriction());
        bindConditions(item.getConditions());
        bindReason(item.getReason());
    }
}
