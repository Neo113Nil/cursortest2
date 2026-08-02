package ru.ozon.app.android.orderdetails.customsfees.core;

import HT.a;
import android.content.Context;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.customsfees.data.CustomsFeesDTO;
import ru.ozon.app.android.orderdetails.customsfees.di.CustomsFeesComponent;
import ru.ozon.app.android.orderdetails.customsfees.presentation.FeeVO;
import ru.ozon.app.android.orderdetails.customsfees.presentation.FeeViewHolder;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/orderdetails/customsfees/core/CustomsFeesViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/orderdetails/customsfees/di/CustomsFeesComponent;", "Lru/ozon/app/android/orderdetails/customsfees/data/CustomsFeesDTO;", "Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeVO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/orderdetails/customsfees/core/FeeDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/orderdetails/customsfees/presentation/FeeViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/orderdetails/customsfees/core/CustomsFeesMapper;", "getMapper", "()Lru/ozon/app/android/orderdetails/customsfees/core/CustomsFeesMapper;", "mapper", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomsFeesViewMapper extends WidgetViewMapper2<CustomsFeesComponent, CustomsFeesDTO, FeeVO> {
    private final int layout = R$layout.widget_fee;

    @NotNull
    private final Function2<View, ComposerReferences, FeeViewHolder> holderProducer = new CustomsFeesViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomsFeesComponent widgetComponent$lambda$0(C7475g c7475g) {
        return CustomsFeesComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<FeeDecorator> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new FeeDecorator(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, FeeViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CustomsFeesComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CustomsFeesComponent.class), new a(storage, 8));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CustomsFeesMapper getMapper() {
        return component().getMapper();
    }
}
