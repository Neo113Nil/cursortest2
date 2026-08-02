package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetExpressNavBarBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.data.ExpressNavBarDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarColorsHelper;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarNestedWidgetsManager;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarVO;
import ru.ozon.app.android.storefront.navBar.NavBarModelProvider;
import v10.j;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u001b*\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00020%j\b\u0012\u0004\u0012\u00020\u0002`&2\n\u0010$\u001a\u00060\"j\u0002`#H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u00100J)\u00105\u001a\b\u0012\u0004\u0012\u00020\u0004042\u0006\u0010-\u001a\u00020\u00032\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/overlay/ExpressNavBarOverlayMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/di/ExpressNavBarComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/data/ExpressNavBarDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createLayoutView", "(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;", "navBarColorsHelper", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarNestedWidgetsManager;", "provideNestedWidgetManager", "(Ll10/i;Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;)Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarNestedWidgetsManager;", "provideNavBarColorsHelper", "(Ll10/i;Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;)Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider;", "Ll10/t;", "container", "", "provideNavBarModelListener", "(Lru/ozon/app/android/storefront/navBar/NavBarModelProvider;Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColorsHelper;Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;Ll10/t;)V", "view", "Landroid/graphics/Bitmap;", "provideSnapshot", "(Ll10/t;Landroid/view/View;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/fresh/unsorted/widgets/navBar/data/ExpressNavBarDTO;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarMapper;", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpressNavBarOverlayMapper extends OverlayWidgetScreenViewItemMapper2<ExpressNavBarComponent, ExpressNavBarDTO, ExpressNavBarVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final View createLayoutView(Context context, ViewGroup parent) {
        View inflate = LayoutInflater.from(context).inflate(R$layout.widget_express_nav_bar, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final ExpressNavBarMapper getMapper() {
        return component().getMapper();
    }

    private final ExpressNavBarColorsHelper provideNavBarColorsHelper(i iVar, WidgetExpressNavBarBinding widgetExpressNavBarBinding) {
        return new ExpressNavBarColorsHelper(widgetExpressNavBarBinding, ComposerViewExtensionKt.composerToolbar(iVar.Z()), iVar.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void provideNavBarModelListener(NavBarModelProvider navBarModelProvider, ExpressNavBarColorsHelper expressNavBarColorsHelper, WidgetExpressNavBarBinding widgetExpressNavBarBinding, t tVar) {
        navBarModelProvider.provideNavBarModelListener(new ExpressNavBarOverlayMapper$provideNavBarModelListener$1(tVar, expressNavBarColorsHelper, this, widgetExpressNavBarBinding, null));
    }

    private final ExpressNavBarNestedWidgetsManager provideNestedWidgetManager(i iVar, ExpressNavBarColorsHelper expressNavBarColorsHelper, WidgetExpressNavBarBinding widgetExpressNavBarBinding) {
        return new ExpressNavBarNestedWidgetsManager(iVar, widgetExpressNavBarBinding, iVar.d0(), iVar.c0(), new ExpressNavBarOverlayMapper$provideNestedWidgetManager$1(this, expressNavBarColorsHelper, widgetExpressNavBarBinding, iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object provideSnapshot(t tVar, View view, d<? super Bitmap> dVar) {
        Window window = tVar.g().getWindow();
        Intrinsics.f(window);
        return j.c(view, window, tVar.h(), dVar);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ExpressNavBarDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ExpressNavBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        Context context = Z11.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WidgetExpressNavBarBinding bind = WidgetExpressNavBarBinding.bind(createLayoutView(context, ComposerViewExtensionKt.composerToolbar(Z11)));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        ExpressNavBarColorsHelper provideNavBarColorsHelper = provideNavBarColorsHelper(container, bind);
        return new ExpressNavBarOverlayHolder(container, component().getTokenizedAnalytics(), component().getComposerUpdateMapper(), bind, component().getPlaceholderParser(), provideNavBarColorsHelper, provideNestedWidgetManager(container, provideNavBarColorsHelper, bind), Z11);
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ExpressNavBarComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ExpressNavBarComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ExpressNavBarVO> map(@NotNull ExpressNavBarDTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
