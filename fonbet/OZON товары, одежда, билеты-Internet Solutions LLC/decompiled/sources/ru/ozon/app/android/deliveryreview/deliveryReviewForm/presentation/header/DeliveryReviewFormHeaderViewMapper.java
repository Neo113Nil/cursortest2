package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.header;

import As.C2444a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.deliveryreview.R$layout;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.DeliveryReviewFormDTO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R2\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R2\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001c¨\u0006'"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/di/DeliveryReviewFormWidgetComponent;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/DeliveryReviewFormDTO;Ljava/lang/String;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderVO;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/header/DeliveryReviewFormHeaderVO;)Ljava/lang/Object;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryReviewFormHeaderViewMapper extends WidgetViewMapper2<DeliveryReviewFormWidgetComponent, DeliveryReviewFormDTO, DeliveryReviewFormHeaderVO> {

    @NotNull
    private final Function2<DeliveryReviewFormDTO, d, List<DeliveryReviewFormHeaderVO>> mapper = new DeliveryReviewFormHeaderViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_delivery_review_form_header;

    @NotNull
    private final Function2<View, ComposerReferences, k<DeliveryReviewFormHeaderVO>> holderProducer = new DeliveryReviewFormHeaderViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryReviewFormHeaderVO toVO(DeliveryReviewFormDTO deliveryReviewFormDTO, String str) {
        long hashCode = str.hashCode();
        Boolean disabled = deliveryReviewFormDTO.getDisabled();
        boolean booleanValue = disabled != null ? disabled.booleanValue() : false;
        String title = deliveryReviewFormDTO.getTitle();
        Boolean showRating = deliveryReviewFormDTO.getShowRating();
        Integer selectedRating = deliveryReviewFormDTO.getSelectedRating();
        AtomActionDTO changeRatingAction = deliveryReviewFormDTO.getChangeRatingAction();
        AtomAction atomAction = changeRatingAction != null ? AtomActionMapperKt.toAtomAction(changeRatingAction, null) : null;
        DeliveryReviewFormDTO.Form form = deliveryReviewFormDTO.getForm();
        return new DeliveryReviewFormHeaderVO(hashCode, booleanValue, title, showRating, selectedRating, atomAction, form != null ? form.getRatingTitle() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeliveryReviewFormWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DeliveryReviewFormWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DeliveryReviewFormHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DeliveryReviewFormDTO, d, List<DeliveryReviewFormHeaderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryReviewFormWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(DeliveryReviewFormWidgetComponent.class), new C2444a(storage, 0));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull DeliveryReviewFormHeaderVO oldItem, @NotNull DeliveryReviewFormHeaderVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }
}
