package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.data.TopTravelModalDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.data.TopTravelModalMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.di.TopTravelModalComponent;
import ru.ozon.app.android.travel.utils.fullScreenWidget.FullScreenController;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/di/TopTravelModalComponent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", "getNavigationBarBottomHeight", "(Landroidx/fragment/app/m;)I", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "originalStatusBarColor", "Ljava/lang/Integer;", "originalNavBarColor", "uiVisibility", "Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;", "fullScreenController$delegate", "LSc/j;", "getFullScreenController", "()Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;", "fullScreenController", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/data/TopTravelModalMapper;", "mapper", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopTravelModalViewMapper extends WidgetViewMapper2<TopTravelModalComponent, TopTravelModalDTO, TopTravelModalVO> {

    /* renamed from: fullScreenController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fullScreenController = LazyUtilsKt.unsafeLazy(TopTravelModalViewMapper$fullScreenController$2.INSTANCE);

    @NotNull
    private final Function2<View, ComposerReferences, TopTravelModalWidgetViewHolder> holderProducer = new TopTravelModalViewMapper$holderProducer$1(this);
    private Integer originalNavBarColor;
    private Integer originalStatusBarColor;
    private Integer uiVisibility;

    /* JADX INFO: Access modifiers changed from: private */
    public final FullScreenController getFullScreenController() {
        return (FullScreenController) this.fullScreenController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNavigationBarBottomHeight(ComponentCallbacksC5392m fragment) {
        WindowInsets rootWindowInsets;
        int navigationBars;
        Insets insets;
        int i11;
        if (Build.VERSION.SDK_INT < 30 || (rootWindowInsets = fragment.requireActivity().getWindow().getDecorView().getRootWindowInsets()) == null) {
            return 0;
        }
        navigationBars = WindowInsets.Type.navigationBars();
        insets = rootWindowInsets.getInsets(navigationBars);
        if (insets == null) {
            return 0;
        }
        i11 = insets.bottom;
        return i11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull final i container, @NotNull l viewItem) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        super.constructLayout(container, viewItem);
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalViewMapper$constructLayout$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                FullScreenController fullScreenController;
                Window window;
                Window window2;
                Window window3;
                View decorView;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ComponentCallbacksC5392m h11 = i.this.K().h();
                TopTravelModalViewMapper topTravelModalViewMapper = this;
                r activity = h11.getActivity();
                Integer num = null;
                topTravelModalViewMapper.uiVisibility = (activity == null || (window3 = activity.getWindow()) == null || (decorView = window3.getDecorView()) == null) ? null : Integer.valueOf(decorView.getSystemUiVisibility());
                TopTravelModalViewMapper topTravelModalViewMapper2 = this;
                r activity2 = h11.getActivity();
                topTravelModalViewMapper2.originalStatusBarColor = (activity2 == null || (window2 = activity2.getWindow()) == null) ? null : Integer.valueOf(window2.getStatusBarColor());
                TopTravelModalViewMapper topTravelModalViewMapper3 = this;
                r activity3 = h11.getActivity();
                if (activity3 != null && (window = activity3.getWindow()) != null) {
                    num = Integer.valueOf(window.getNavigationBarColor());
                }
                topTravelModalViewMapper3.originalNavBarColor = num;
                fullScreenController = this.getFullScreenController();
                FullScreenController.clearWindow$default(fullScreenController, h11, true, false, 4, null);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                FullScreenController fullScreenController;
                Intrinsics.checkNotNullParameter(owner, "owner");
                fullScreenController = this.getFullScreenController();
                fullScreenController.restoreWindow(i.this.K().h());
            }
        };
        ComponentCallbacksC5392m b11 = container.K().b();
        if (b11 == null || (lifecycle = b11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(defaultLifecycleObserver);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TopTravelModalView topTravelModalView = new TopTravelModalView(context);
        topTravelModalView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return topTravelModalView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TopTravelModalWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TopTravelModalComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TopTravelModalComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public TopTravelModalMapper getMapper() {
        return component().getMapper();
    }
}
