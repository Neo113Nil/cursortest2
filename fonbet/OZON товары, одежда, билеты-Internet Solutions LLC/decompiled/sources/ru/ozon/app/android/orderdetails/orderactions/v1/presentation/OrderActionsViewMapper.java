package ru.ozon.app.android.orderdetails.orderactions.v1.presentation;

import DD.a;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.orderactions.v1.data.OrderActionButtonModel;
import ru.ozon.app.android.orderdetails.orderactions.v1.data.OrderActionsDTO;
import ru.ozon.app.android.orderdetails.orderactions.v1.di.OrderActionsComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007*\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R2\u0010*\u001a\u001a\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040)0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"¨\u0006,"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/orderdetails/orderactions/v1/di/OrderActionsComponent;", "Lru/ozon/app/android/orderdetails/orderactions/v1/data/OrderActionsDTO;", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionVO;", "<init>", "()V", "", "toVO", "(Lru/ozon/app/android/orderdetails/orderactions/v1/data/OrderActionsDTO;)Ljava/util/List;", "", "", "getTextColor", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lru/ozon/app/android/orderdetails/orderactions/v1/data/OrderActionButtonModel;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "toBorderLessButton", "(Lru/ozon/app/android/orderdetails/orderactions/v1/data/OrderActionButtonModel;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/orderdetails/orderactions/v1/presentation/OrderActionDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderActionsViewMapper extends WidgetViewMapper2<OrderActionsComponent, OrderActionsDTO, OrderActionVO> {

    @NotNull
    private final Function2<OrderActionsDTO, d, List<OrderActionVO>> mapper = new OrderActionsViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_order_action_item;

    @NotNull
    private final Function2<View, ComposerReferences, k<OrderActionVO>> holderProducer = new OrderActionsViewMapper$holderProducer$1(this);

    private final Integer getTextColor(String str) {
        return StyleParser.INSTANCE.parseColor(component().getContext(), str);
    }

    private final ButtonV3Atom.LargeBorderlessButton toBorderLessButton(OrderActionButtonModel orderActionButtonModel) {
        return new ButtonV3Atom.LargeBorderlessButton(OzonSpannableStringKt.toOzonSpannableString(orderActionButtonModel.getText()), orderActionButtonModel.getAction(), null, null, null, orderActionButtonModel.getTrackingInfo(), 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OrderActionVO> toVO(OrderActionsDTO orderActionsDTO) {
        List<OrderActionButtonModel> buttons = orderActionsDTO.getButtons();
        if (buttons == null) {
            return K.f71697a;
        }
        List<OrderActionButtonModel> list = buttons;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (OrderActionButtonModel orderActionButtonModel : list) {
            long hashCode = orderActionButtonModel.hashCode();
            ButtonV3Atom.LargeBorderlessButton borderLessButton = toBorderLessButton(orderActionButtonModel);
            String textColor = orderActionButtonModel.getTextColor();
            arrayList.add(new OrderActionVO(hashCode, borderLessButton, textColor != null ? getTextColor(textColor) : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderActionsComponent widgetComponent$lambda$0(C7475g c7475g) {
        return OrderActionsComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<OrderActionDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new OrderActionDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<OrderActionVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderActionsDTO, d, List<OrderActionVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderActionsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OrderActionsComponent.class), new a(storage, 11));
    }
}
