package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.radio;

import Az.ViewOnClickListenerC2453a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentRadioBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateRadio;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/radio/RadioVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentRadioBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentRadioBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "groupId", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "", "bind", "(ILru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentRadioBinding;", "I", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RadioVH extends RecyclerView.C {

    @NotNull
    private final ItemDeliveryReviewComponentRadioBinding binding;
    private ComponentVO component;
    private int groupId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioVH(@NotNull ItemDeliveryReviewComponentRadioBinding binding, @NotNull ComposerReferences refs) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.binding = binding;
        this.groupId = -1;
        binding.radioFl.setOnClickListener(new ViewOnClickListenerC2453a(8, refs, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ComposerReferences composerReferences, RadioVH radioVH, View view) {
        InterfaceC7851b controller = composerReferences.getController();
        int i11 = radioVH.groupId;
        ComponentVO componentVO = radioVH.component;
        if (componentVO != null) {
            controller.update(new UpdateRadio(i11, componentVO.getId()));
        } else {
            Intrinsics.n("component");
            throw null;
        }
    }

    public final void bind(int groupId, @NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.groupId = groupId;
        this.component = component;
        ElementVO element = component.getElement();
        ElementVO.Radio radio = element instanceof ElementVO.Radio ? (ElementVO.Radio) element : null;
        if (radio != null) {
            this.binding.radioTv.setText(radio.getText());
            this.binding.radioIv.setImageResource(component.getDisabled() ? 0 : radio.getIsSelected() ? R$drawable.ic_radio_checked : ru.ozon.app.android.uikit.R$drawable.ic_checkbox_unchecked);
        }
    }
}
