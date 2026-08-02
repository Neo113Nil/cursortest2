package ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.data.EnableNotificationWithReplacementButtonDTO;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.di.EnableNotificationWithReplacementButtonDiComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR2\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R,\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO;", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO;", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/di/EnableNotificationWithReplacementButtonDiComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/di/EnableNotificationWithReplacementButtonDiComponent;)V", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/di/EnableNotificationWithReplacementButtonDiComponent;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnableNotificationWithReplacementButtonViewMapper extends WidgetViewMapper<EnableNotificationWithReplacementButtonDTO, EnableNotificationWithReplacementButtonVO> {

    @NotNull
    private final EnableNotificationWithReplacementButtonDiComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<EnableNotificationWithReplacementButtonVO>> holderProducer;
    private final int layout;

    public EnableNotificationWithReplacementButtonViewMapper(@NotNull EnableNotificationWithReplacementButtonDiComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.layout = R$layout.widget_enable_notification_with_replacement_button;
        this.holderProducer = new EnableNotificationWithReplacementButtonViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<EnableNotificationWithReplacementButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<EnableNotificationWithReplacementButtonDTO, d, List<EnableNotificationWithReplacementButtonVO>> getMapper() {
        return this.component.getMapper();
    }
}
