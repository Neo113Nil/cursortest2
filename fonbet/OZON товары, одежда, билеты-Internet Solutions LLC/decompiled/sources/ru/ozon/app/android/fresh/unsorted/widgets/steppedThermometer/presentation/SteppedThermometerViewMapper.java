package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import A00.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.SteppedThermometerDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR<\u0010#\u001a$\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040!j\b\u0012\u0004\u0012\u00020\u0004`\"0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00170\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/di/SteppedThermometerComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/SteppedThermometerDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;)Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerStateUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "getMapper", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SteppedThermometerViewMapper extends WidgetViewMapper2<SteppedThermometerComponent, SteppedThermometerDTO, SteppedThermometerVO> {
    private final int layout = R$layout.widget_stepped_thermometer;

    @NotNull
    private final List<Class<SteppedThermometerStateUpdate>> supportedUpdates = C7714v.a0(SteppedThermometerStateUpdate.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<SteppedThermometerVO>> holderProducer = new SteppedThermometerViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SteppedThermometerVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SteppedThermometerDTO, d, List<SteppedThermometerVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SteppedThermometerStateUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SteppedThermometerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SteppedThermometerComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public SteppedThermometerVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SteppedThermometerVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SteppedThermometerStateUpdate) {
            return ((SteppedThermometerStateUpdate) update).getState();
        }
        return null;
    }
}
