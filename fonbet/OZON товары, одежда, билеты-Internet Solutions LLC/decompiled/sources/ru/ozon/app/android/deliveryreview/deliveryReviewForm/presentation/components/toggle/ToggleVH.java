package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.toggle;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentToggleBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.model.ControllingToggleState;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleToggleView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/toggle/ToggleVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentToggleBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "deliveryReviewFormViewModel", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentToggleBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;)V", "", "groupId", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "", "bind", "(ILru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentToggleBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "I", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ToggleVH extends RecyclerView.C {

    @NotNull
    private final ItemDeliveryReviewComponentToggleBinding binding;
    private ComponentVO component;
    private int groupId;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "toggleState", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/model/ControllingToggleState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/model/ControllingToggleState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.toggle.ToggleVH$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<ControllingToggleState, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ControllingToggleState controllingToggleState) {
            invoke2(controllingToggleState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ControllingToggleState controllingToggleState) {
            String selectControllingComponentId = controllingToggleState.getSelectControllingComponentId();
            ComponentVO componentVO = ToggleVH.this.component;
            if (Intrinsics.d(selectControllingComponentId, componentVO != null ? componentVO.getId() : null)) {
                ToggleVH.this.binding.toggleV.setSelected(controllingToggleState.anyDependedComponentSelected());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleVH(@NotNull ItemDeliveryReviewComponentToggleBinding binding, @NotNull ComposerReferences refs, @NotNull DeliveryReviewFormViewModel deliveryReviewFormViewModel) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(deliveryReviewFormViewModel, "deliveryReviewFormViewModel");
        this.binding = binding;
        this.refs = refs;
        this.groupId = -1;
        CellWithSubtitleToggleView cellWithSubtitleToggleView = binding.toggleV;
        cellWithSubtitleToggleView.setSubtitle(null);
        cellWithSubtitleToggleView.setBackground(null);
        cellWithSubtitleToggleView.alignActionViewCenterVertical();
        cellWithSubtitleToggleView.hideSeparator(true);
        cellWithSubtitleToggleView.setOnCheckedChangeListener(new ToggleVH$1$1(this));
        Context context = cellWithSubtitleToggleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseCellView.setTitleTextColor$default(cellWithSubtitleToggleView, ThemeExtKt.themeColor(context, R$attr.textPrimary), false, 2, null);
        deliveryReviewFormViewModel.getControllingToggleState().observe(refs.getContainer().g(), new ToggleVH$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    public final void bind(int groupId, @NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.groupId = groupId;
        this.component = component;
        ItemDeliveryReviewComponentToggleBinding itemDeliveryReviewComponentToggleBinding = this.binding;
        CellWithSubtitleToggleView toggleV = itemDeliveryReviewComponentToggleBinding.toggleV;
        Intrinsics.checkNotNullExpressionValue(toggleV, "toggleV");
        ViewExtKt.showOrGone(toggleV, Boolean.valueOf(!component.getHidden()));
        if (!component.getHidden()) {
            ElementVO element = component.getElement();
            ElementVO.Toggle toggle = element instanceof ElementVO.Toggle ? (ElementVO.Toggle) element : null;
            if (toggle != null) {
                itemDeliveryReviewComponentToggleBinding.toggleV.setTitle(toggle.getText());
                CellWithSubtitleToggleView cellWithSubtitleToggleView = itemDeliveryReviewComponentToggleBinding.toggleV;
                Boolean byUserSelected = toggle.getByUserSelected();
                cellWithSubtitleToggleView.setSelected(byUserSelected != null ? byUserSelected.booleanValue() : toggle.getIsSelected());
            }
        }
        itemDeliveryReviewComponentToggleBinding.toggleV.setEnabled(!component.getDisabled());
    }
}
