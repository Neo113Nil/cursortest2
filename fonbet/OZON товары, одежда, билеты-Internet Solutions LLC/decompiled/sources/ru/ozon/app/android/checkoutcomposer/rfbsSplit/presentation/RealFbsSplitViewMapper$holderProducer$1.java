package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import Vg.d;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.checkoutcomposer.flags.RfbsSplitMultiFrameBindingEnabledFlag;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVH;", "view", "Landroid/view/View;", "reference", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RealFbsSplitViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, RealFbsSplitVH> {
    final /* synthetic */ RealFbsSplitViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealFbsSplitViewMapper$holderProducer$1(RealFbsSplitViewMapper realFbsSplitViewMapper) {
        super(2);
        this.this$0 = realFbsSplitViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final RealFbsSplitVH invoke(View view, ComposerReferences reference) {
        RealFbsSplitWidgetComponent realFbsSplitWidgetComponent;
        RealFbsSplitWidgetComponent realFbsSplitWidgetComponent2;
        RealFbsSplitWidgetComponent realFbsSplitWidgetComponent3;
        RealFbsSplitWidgetComponent realFbsSplitWidgetComponent4;
        RealFbsSplitWidgetComponent realFbsSplitWidgetComponent5;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(reference, "reference");
        realFbsSplitWidgetComponent = this.this$0.component;
        FrameBinder frameBinder = realFbsSplitWidgetComponent.getFeatureChecker().isEnabled(RfbsSplitMultiFrameBindingEnabledFlag.INSTANCE) ? reference.getFrameBinderProvider().get() : null;
        WidgetRfbsSplitView widgetRfbsSplitView = (WidgetRfbsSplitView) view;
        realFbsSplitWidgetComponent2 = this.this$0.component;
        HandlersInhibitor handlersInhibitor = realFbsSplitWidgetComponent2.getHandlersInhibitor();
        realFbsSplitWidgetComponent3 = this.this$0.component;
        ActionSheetEventHandler actionSheetEventHandler = realFbsSplitWidgetComponent3.getActionSheetEventHandler();
        realFbsSplitWidgetComponent4 = this.this$0.component;
        d customActionHandlersStoreFactory = realFbsSplitWidgetComponent4.getCustomActionHandlersStoreFactory();
        YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModelImpl = (YandexSearchSheetSharedViewModelImpl) new z0(reference.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new YandexSearchSheetSharedViewModelImpl();
            }
        }).a(YandexSearchSheetSharedViewModelImpl.class);
        realFbsSplitWidgetComponent5 = this.this$0.component;
        return new RealFbsSplitVH(widgetRfbsSplitView, reference, actionSheetEventHandler, frameBinder, yandexSearchSheetSharedViewModelImpl, customActionHandlersStoreFactory, handlersInhibitor, realFbsSplitWidgetComponent5.getAppType());
    }
}
