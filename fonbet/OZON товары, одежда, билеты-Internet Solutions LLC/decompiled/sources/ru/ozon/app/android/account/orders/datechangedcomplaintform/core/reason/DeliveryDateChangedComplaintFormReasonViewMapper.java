package ru.ozon.app.android.account.orders.datechangedcomplaintform.core.reason;

import EN.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.data.DeliveryDateChangedComplaintFormDTO;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.reason.DeliveryDateChangedComplaintFormReasonVO;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.reason.DeliveryDateChangedComplaintReasonWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/reason/DeliveryDateChangedComplaintFormReasonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/di/DeliveryDateChangedComplaintFormComponent;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/DeliveryDateChangedComplaintFormDTO;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/DeliveryDateChangedComplaintFormReasonVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/DeliveryDateChangedComplaintReasonWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/reason/DeliveryDateChangedComplaintFormReasonMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/reason/DeliveryDateChangedComplaintFormReasonMapper;", "mapper", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryDateChangedComplaintFormReasonViewMapper extends WidgetViewMapper2<DeliveryDateChangedComplaintFormComponent, DeliveryDateChangedComplaintFormDTO, DeliveryDateChangedComplaintFormReasonVO> {

    @NotNull
    private final Function2<View, ComposerReferences, DeliveryDateChangedComplaintReasonWidgetViewHolder> holderProducer = DeliveryDateChangedComplaintFormReasonViewMapper$holderProducer$1.INSTANCE;
    private final Void layout;

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeliveryDateChangedComplaintFormComponent widgetComponent$lambda$2(C7475g c7475g) {
        return DeliveryDateChangedComplaintFormComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, DeliveryDateChangedComplaintReasonWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryDateChangedComplaintFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(DeliveryDateChangedComplaintFormComponent.class), new a(storage, 2));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public CheckboxTitleSubtitleCellView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView = new CheckboxTitleSubtitleCellView(context, null, 0, 0, null, false, null, 126, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int px = UiExtKt.toPx(24);
        marginLayoutParams.setMargins(px, marginLayoutParams.topMargin, px, marginLayoutParams.bottomMargin);
        checkboxTitleSubtitleCellView.setLayoutParams(marginLayoutParams);
        return checkboxTitleSubtitleCellView;
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public DeliveryDateChangedComplaintFormReasonMapper getMapper() {
        return component().getReasonMapper();
    }
}
