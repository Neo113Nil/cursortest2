package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.textarea;

import De.s;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentTextareaBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.utils.DebouncedTextWatcher;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0011\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/textarea/TextareaVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentTextareaBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "deliveryReviewFormViewModel", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentTextareaBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;)V", "", "subscribeToInformerListUpdate", "()V", "updateTitleVisibility", "Lcom/google/android/material/textfield/TextInputEditText;", "", "newText", "setTextIfDifferent", "(Lcom/google/android/material/textfield/TextInputEditText;Ljava/lang/String;)V", "", "groupId", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "bind", "(ILru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "updateData", "onViewRecycled", "onViewDetachedFromWindow", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentTextareaBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "I", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "Lxe/B0;", "viewHolderInformersJob", "Lxe/B0;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/utils/DebouncedTextWatcher;", "textWatcher", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/utils/DebouncedTextWatcher;", "Companion", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextareaVH extends RecyclerView.C {

    @NotNull
    private final ItemDeliveryReviewComponentTextareaBinding binding;
    private ComponentVO component;

    @NotNull
    private final DeliveryReviewFormViewModel deliveryReviewFormViewModel;
    private int groupId;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final DebouncedTextWatcher textWatcher;
    private B0 viewHolderInformersJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextareaVH(@NotNull ItemDeliveryReviewComponentTextareaBinding binding, @NotNull ComposerReferences refs, @NotNull DeliveryReviewFormViewModel deliveryReviewFormViewModel) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(deliveryReviewFormViewModel, "deliveryReviewFormViewModel");
        this.binding = binding;
        this.refs = refs;
        this.deliveryReviewFormViewModel = deliveryReviewFormViewModel;
        this.groupId = -1;
        DebouncedTextWatcher debouncedTextWatcher = new DebouncedTextWatcher(300L, new TextareaVH$textWatcher$1(this));
        this.textWatcher = debouncedTextWatcher;
        binding.textareaEt.addTextChangedListener(debouncedTextWatcher);
    }

    private final void setTextIfDifferent(TextInputEditText textInputEditText, String str) {
        if (String.valueOf(textInputEditText.getText()).equals(str)) {
            return;
        }
        textInputEditText.setText(str);
    }

    private final void subscribeToInformerListUpdate() {
        B0 b02 = this.viewHolderInformersJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b11 = X0.b();
        this.viewHolderInformersJob = b11;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(N.a(CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11)), null, null, new TextareaVH$subscribeToInformerListUpdate$1$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTitleVisibility() {
        String title;
        ComponentVO componentVO;
        ComponentVO componentVO2 = this.component;
        ElementVO element = componentVO2 != null ? componentVO2.getElement() : null;
        ElementVO.Textarea textarea = element instanceof ElementVO.Textarea ? (ElementVO.Textarea) element : null;
        if (textarea == null || (title = textarea.getTitle()) == null || title.length() == 0 || (componentVO = this.component) == null || componentVO.getHidden()) {
            return;
        }
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewExtKt.show(titleTv);
    }

    public final void bind(int groupId, @NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        ElementVO element = component.getElement();
        ElementVO.Textarea textarea = element instanceof ElementVO.Textarea ? (ElementVO.Textarea) element : null;
        if (textarea != null) {
            TextInputEditText textareaEt = this.binding.textareaEt;
            Intrinsics.checkNotNullExpressionValue(textareaEt, "textareaEt");
            String value = textarea.getValue();
            if (value == null) {
                value = "";
            }
            setTextIfDifferent(textareaEt, value);
        }
        updateData(groupId, component);
        subscribeToInformerListUpdate();
    }

    public final void onViewDetachedFromWindow() {
        B0 b02 = this.viewHolderInformersJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.viewHolderInformersJob = null;
    }

    public final void onViewRecycled() {
        B0 b02 = this.viewHolderInformersJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.viewHolderInformersJob = null;
    }

    public final void updateData(int groupId, ComponentVO component) {
        this.groupId = groupId;
        this.component = component;
        ItemDeliveryReviewComponentTextareaBinding itemDeliveryReviewComponentTextareaBinding = this.binding;
        TextAtomV2View headerTV = itemDeliveryReviewComponentTextareaBinding.headerTV;
        Intrinsics.checkNotNullExpressionValue(headerTV, "headerTV");
        boolean z11 = false;
        ViewExtKt.showOrGone(headerTV, Boolean.valueOf((component == null || component.getHidden()) ? false : true));
        TextView titleTv = itemDeliveryReviewComponentTextareaBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewExtKt.showOrGone(titleTv, Boolean.valueOf((component == null || component.getHidden()) ? false : true));
        MobilizationTextInputLayout textareaTil = itemDeliveryReviewComponentTextareaBinding.textareaTil;
        Intrinsics.checkNotNullExpressionValue(textareaTil, "textareaTil");
        if (component != null && !component.getHidden()) {
            z11 = true;
        }
        ViewExtKt.showOrGone(textareaTil, Boolean.valueOf(z11));
        if (component == null || component.getHidden()) {
            return;
        }
        ElementVO element = component.getElement();
        ElementVO.Textarea textarea = element instanceof ElementVO.Textarea ? (ElementVO.Textarea) element : null;
        if (textarea != null) {
            TextAtomV2View headerTV2 = itemDeliveryReviewComponentTextareaBinding.headerTV;
            Intrinsics.checkNotNullExpressionValue(headerTV2, "headerTV");
            TextHolderKt.bindOrGone$default(headerTV2, textarea.getHeader(), null, 2, null);
            TextView titleTv2 = itemDeliveryReviewComponentTextareaBinding.titleTv;
            Intrinsics.checkNotNullExpressionValue(titleTv2, "titleTv");
            TextViewExtKt.setTextOrGone(titleTv2, textarea.getTitle());
            itemDeliveryReviewComponentTextareaBinding.textareaTil.setHint(textarea.getHint());
        }
        itemDeliveryReviewComponentTextareaBinding.textareaTil.setEnabled(!component.getDisabled());
        itemDeliveryReviewComponentTextareaBinding.textareaTil.setEditable(!component.getDisabled());
    }
}
