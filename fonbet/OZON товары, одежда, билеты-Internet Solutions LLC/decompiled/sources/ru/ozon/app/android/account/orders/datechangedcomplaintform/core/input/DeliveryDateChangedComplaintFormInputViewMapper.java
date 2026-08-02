package ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input;

import A00.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.data.DeliveryDateChangedComplaintFormDTO;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.DeliveryDateChangedComplaintFormInputVO;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input.DeliveryDateChangedComplaintFormInputWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.cs_orders.R$layout;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/DeliveryDateChangedComplaintFormInputViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/di/DeliveryDateChangedComplaintFormComponent;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/DeliveryDateChangedComplaintFormDTO;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;)Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputVO;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/DeliveryDateChangedComplaintFormInputWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/DeliveryDateChangedComplaintFormInputMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/core/input/DeliveryDateChangedComplaintFormInputMapper;", "mapper", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryDateChangedComplaintFormInputViewMapper extends WidgetViewMapper2<DeliveryDateChangedComplaintFormComponent, DeliveryDateChangedComplaintFormDTO, DeliveryDateChangedComplaintFormInputVO> {
    private final int layout = R$layout.widget_delivery_date_changed_complaint_form_input;

    @NotNull
    private final Function2<View, ComposerReferences, DeliveryDateChangedComplaintFormInputWidgetViewHolder> holderProducer = new DeliveryDateChangedComplaintFormInputViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(CommentUpdated.class, ReasonSelected.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeliveryDateChangedComplaintFormComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DeliveryDateChangedComplaintFormComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, DeliveryDateChangedComplaintFormInputWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    public void getPayload(@NotNull DeliveryDateChangedComplaintFormInputVO oldItem, @NotNull DeliveryDateChangedComplaintFormInputVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryDateChangedComplaintFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(DeliveryDateChangedComplaintFormComponent.class), new DR.a(storage, 2));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public DeliveryDateChangedComplaintFormInputMapper getMapper() {
        return component().getInputMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((DeliveryDateChangedComplaintFormInputVO) cVar, (DeliveryDateChangedComplaintFormInputVO) cVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public DeliveryDateChangedComplaintFormInputVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DeliveryDateChangedComplaintFormInputVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return component().getComplaintInfoUpdater().handleUpdate(update, oldItem);
    }
}
