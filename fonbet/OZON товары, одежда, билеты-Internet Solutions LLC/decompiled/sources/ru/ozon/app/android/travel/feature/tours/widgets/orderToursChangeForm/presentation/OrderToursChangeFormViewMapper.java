package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.data.OrderToursChangeFormDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di.OrderToursChangeFormComponent;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001ej\u0002`\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001d¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/di/OrderToursChangeFormComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/data/OrderToursChangeFormDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderToursChangeFormViewMapper extends WidgetViewMapper2<OrderToursChangeFormComponent, OrderToursChangeFormDTO, OrderToursChangeFormVO> {

    @NotNull
    private final Function2<View, ComposerReferences, OrderToursChangeFormWidgetViewHolder> holderProducer = new OrderToursChangeFormViewMapper$holderProducer$1(this);
    private final Integer layout;

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ConstraintLayout constraintLayout = new ConstraintLayout(parent.getContext());
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context);
        Context context2 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewExtKt.updatePadding(constraintLayout, px, px, px, ResourceExtKt.toPx(20, context2));
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context3 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context3, R$attr.layerFloor1);
        Context context4 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        constraintLayout.setBackground(roundedBackgroundProducer.produce(themeColor, ResourceExtKt.toPxF(24, context4)));
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        q qVar = q.f64554a;
        d b11 = N.b(TextAtomView.class);
        Context context5 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        View view = (TextAtomView) qVar.g(b11, context5);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        view.setId(R$id.orderToursChangeFormTitleTav);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        view.setLayoutParams(bVar);
        constraintLayout.addView(view);
        d b12 = N.b(TextAtomView.class);
        Context context6 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        View view2 = (TextAtomView) qVar.g(b12, context6);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        view2.setId(R$id.orderToursChangeFormInfoTav);
        bVar2.f41638j = view.getId();
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        Context context7 = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = ResourceExtKt.toPx(2, context7);
        view2.setLayoutParams(bVar2);
        constraintLayout.addView(view2);
        Context context8 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        View commonTextInputView = new CommonTextInputView(context8, null, 0, 0, 14, null);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        commonTextInputView.setId(R$id.orderToursChangeFormInputCtiv);
        bVar3.f41638j = view2.getId();
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = px;
        commonTextInputView.setLayoutParams(bVar3);
        constraintLayout.addView(commonTextInputView);
        return constraintLayout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, OrderToursChangeFormWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderToursChangeFormDTO, l20.d, List<OrderToursChangeFormVO>> getMapper() {
        return component().getOrderToursChangeFormMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderToursChangeFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return OrderToursChangeFormComponent.INSTANCE.create(storage);
    }
}
