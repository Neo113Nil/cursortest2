package ru.ozon.app.android.checkoutcomposer.discountcode.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.DiscountCodeDTO;
import ru.ozon.app.android.checkoutcomposer.discountcode.data.DiscountCodeVO;
import ru.ozon.app.android.checkoutcomposer.discountcode.di.DiscountCodeWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR2\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R2\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/discountcode/presentation/DiscountCodeViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeDTO;", "Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;", "Lru/ozon/app/android/checkoutcomposer/discountcode/di/DiscountCodeWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/discountcode/di/DiscountCodeWidgetComponent;)V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;Lru/ozon/app/android/checkoutcomposer/discountcode/data/DiscountCodeVO;)Ljava/lang/Object;", "Lru/ozon/app/android/checkoutcomposer/discountcode/di/DiscountCodeWidgetComponent;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountCodeViewMapper extends WidgetViewMapper<DiscountCodeDTO, DiscountCodeVO> {

    @NotNull
    private final DiscountCodeWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<DiscountCodeVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<DiscountCodeDTO, d, List<DiscountCodeVO>> mapper;

    public DiscountCodeViewMapper(@NotNull DiscountCodeWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = DiscountCodeViewMapper$mapper$1.INSTANCE;
        this.layout = R$layout.widget_discount_code;
        this.holderProducer = new DiscountCodeViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DiscountCodeVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DiscountCodeDTO, d, List<DiscountCodeVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull DiscountCodeVO oldItem, @NotNull DiscountCodeVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }
}
