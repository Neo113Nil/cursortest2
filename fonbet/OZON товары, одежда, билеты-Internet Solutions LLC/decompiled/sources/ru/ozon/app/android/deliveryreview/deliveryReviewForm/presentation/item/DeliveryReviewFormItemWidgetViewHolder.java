package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import Bs.ViewOnClickListenerC2671b;
import V4.C4072a;
import V4.n;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.R$drawable;
import ru.ozon.app.android.deliveryreview.databinding.WidgetDeliveryReviewFormItemBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentAdapter;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentDecoration;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewFormItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "uploadPhotosViewModel", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "deliveryReviewFormViewModel", "", "isSelect", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewFormItemBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;Z)V", "", "observeValidation", "()V", "isOpen", "updateCollapse", "(Z)V", "error", "setErrorIfNeed", "(Z)Lkotlin/Unit;", "item", "Ll20/d;", "info", "", "payload", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;Ll20/d;)V", "Lru/ozon/app/android/deliveryreview/databinding/WidgetDeliveryReviewFormItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentAdapter;", "componentAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentAdapter;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentDecoration;", "componentItemDecoration", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentDecoration;", "groupItemVo", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryReviewFormItemWidgetViewHolder extends k<DeliveryReviewFormItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDeliveryReviewFormItemBinding binding;

    @NotNull
    private final ComponentAdapter componentAdapter;

    @NotNull
    private final ComponentDecoration componentItemDecoration;

    @NotNull
    private final DeliveryReviewFormViewModel deliveryReviewFormViewModel;
    private DeliveryReviewFormItemVO groupItemVo;
    private final boolean isSelect;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeliveryReviewFormItemWidgetViewHolder(@NotNull WidgetDeliveryReviewFormItemBinding binding, @NotNull ComposerReferences refs, @NotNull ComponentUploadPhotosViewModel uploadPhotosViewModel, @NotNull DeliveryReviewFormViewModel deliveryReviewFormViewModel, boolean z11) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(uploadPhotosViewModel, "uploadPhotosViewModel");
        Intrinsics.checkNotNullParameter(deliveryReviewFormViewModel, "deliveryReviewFormViewModel");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.deliveryReviewFormViewModel = deliveryReviewFormViewModel;
        this.isSelect = z11;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        ComponentAdapter componentAdapter = new ComponentAdapter(uploadPhotosViewModel, deliveryReviewFormViewModel, refs, z11, buildHandler);
        this.componentAdapter = componentAdapter;
        ComponentDecoration componentDecoration = new ComponentDecoration(getContext());
        this.componentItemDecoration = componentDecoration;
        RecyclerView recyclerView = binding.componentRv;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(componentAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(componentDecoration);
        recyclerView.setItemAnimator(null);
        binding.titleTv.setOnClickListener(new ViewOnClickListenerC2671b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(DeliveryReviewFormItemWidgetViewHolder deliveryReviewFormItemWidgetViewHolder, View view) {
        DeliveryReviewFormItemVO boundData = deliveryReviewFormItemWidgetViewHolder.getBoundData();
        if (boundData != null) {
            deliveryReviewFormItemWidgetViewHolder.refs.getController().update(new UpdateGroupCollapse(boundData.getFormGroupId()));
        }
    }

    private final void observeValidation() {
        this.deliveryReviewFormViewModel.getValidation().observe(this.refs.getContainer().g(), new DeliveryReviewFormItemWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new DeliveryReviewFormItemWidgetViewHolder$observeValidation$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setErrorIfNeed(boolean error) {
        WidgetDeliveryReviewFormItemBinding widgetDeliveryReviewFormItemBinding = this.binding;
        if (error) {
            widgetDeliveryReviewFormItemBinding.llFormContainer.setBackground(g.d(getContext().getResources(), R$drawable.bg_delivery_review_form_error, getContext().getTheme()));
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), UniColors.TEXT_ACCENT.getToken());
            if (parseColor == null) {
                return null;
            }
            widgetDeliveryReviewFormItemBinding.titleTv.setTextColor(parseColor.intValue());
            return Unit.f71690a;
        }
        widgetDeliveryReviewFormItemBinding.llFormContainer.setBackground(null);
        Integer parseColor2 = StyleParser.INSTANCE.parseColor(getContext(), UniColors.TEXT_SECONDARY.getToken());
        if (parseColor2 == null) {
            return null;
        }
        widgetDeliveryReviewFormItemBinding.titleTv.setTextColor(parseColor2.intValue());
        return Unit.f71690a;
    }

    private final void updateCollapse(boolean isOpen) {
        WidgetDeliveryReviewFormItemBinding widgetDeliveryReviewFormItemBinding = this.binding;
        n.a(widgetDeliveryReviewFormItemBinding.componentRv, new C4072a());
        RecyclerView componentRv = widgetDeliveryReviewFormItemBinding.componentRv;
        Intrinsics.checkNotNullExpressionValue(componentRv, "componentRv");
        ViewExtKt.showOrGone(componentRv, Boolean.valueOf(isOpen));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryReviewFormItemVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        super.bind((DeliveryReviewFormItemWidgetViewHolder) item, info, payload);
        this.deliveryReviewFormViewModel.resetValidation();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryReviewFormItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.groupItemVo = item;
        this.deliveryReviewFormViewModel.updateGroup(item);
        TextView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, item.getTitle());
        updateCollapse(item.getIsOpen());
        setErrorIfNeed(item.getFormError());
        this.componentAdapter.setGroupId(item.getFormGroupId());
        this.componentAdapter.submitList(item.getFormComponents());
        this.componentItemDecoration.setItems$deliveryreview_prodGoogleAllVendorsRelease(item.getFormComponents());
        observeValidation();
    }
}
