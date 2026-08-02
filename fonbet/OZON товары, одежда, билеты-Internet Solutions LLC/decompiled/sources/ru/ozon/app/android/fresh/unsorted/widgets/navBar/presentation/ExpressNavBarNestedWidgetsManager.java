package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetExpressNavBarBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.navTitle.presentation.ExpressNavTitleVO;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation.SearchBarVO;
import ru.ozon.app.android.storefront.navBar.NavBarModelProvider;
import ru.ozon.composer.ui.widget.a;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u007f\u0010\u001f\u001a\u00020\r2\u0012\u0010\u0014\u001a\u000e\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00152R\u0010\u001e\u001aN\u0012\u0004\u0012\u00020\u0018\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019j\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b`\u001c0\u0017j&\u0012\u0004\u0012\u00020\u0018\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019j\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b`\u001c`\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\u00020\r2\n\u0010!\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\r*\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010%J\u0087\u0001\u0010+\u001a\u00020\r2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0017j\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'`\u001d2R\u0010\u001e\u001aN\u0012\u0004\u0012\u00020\u0018\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019j\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b`\u001c0\u0017j&\u0012\u0004\u0012\u00020\u0018\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019j\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b`\u001c`\u001dH\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010.\u001a\u00020\rH\u0000¢\u0006\u0004\b,\u0010-Jc\u00101\u001a\u00020\r2R\u0010\u001e\u001aN\u0012\u0004\u0012\u00020\u0018\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019j\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b`\u001c0\u0017j&\u0012\u0004\u0012\u00020\u0018\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u0019j\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b`\u001c`\u001dH\u0000¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0014\u00107\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarNestedWidgetsManager;", "", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;", "binding", "Lru/ozon/composer/ui/widget/a;", "widgetsFactory", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "Lkotlin/Function1;", "Lru/ozon/app/android/storefront/navBar/NavBarModelProvider;", "", "navBarModelListenerProvider", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;Lru/ozon/composer/ui/widget/a;Lru/ozon/composer/ui/widget/f;Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObjects", "Landroid/view/ViewGroup;", "parent", "Ljava/util/HashMap;", "", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "addNestedWidgetsIntoViewGroup", "(Ljava/util/List;Landroid/view/ViewGroup;Ljava/util/HashMap;)V", "vo", "setMargins", "(Lru/ozon/composer/ui/widget/l;Landroid/view/ViewGroup;)V", "removeViewsIfNotEmpty", "(Landroid/view/ViewGroup;)V", "", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/VisiblePlaceholders;", "currentPlaceholders", "addNestedWidgets$widgets_unsorted_prodGoogleAllVendorsRelease", "(Ljava/util/HashMap;Ljava/util/HashMap;)V", "addNestedWidgets", "removeNestedWidgets$widgets_unsorted_prodGoogleAllVendorsRelease", "()V", "removeNestedWidgets", "detachNestedViewHolders$widgets_unsorted_prodGoogleAllVendorsRelease", "(Ljava/util/HashMap;)V", "detachNestedViewHolders", "Ll10/i;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetExpressNavBarBinding;", "Lru/ozon/composer/ui/widget/a;", "Lru/ozon/composer/ui/widget/f;", "Lkotlin/jvm/functions/Function1;", "navTitleGoneMargin", "I", "searchBarGoneMargin", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressNavBarNestedWidgetsManager {

    @NotNull
    private final WidgetExpressNavBarBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final Function1<NavBarModelProvider, Unit> navBarModelListenerProvider;
    private final int navTitleGoneMargin;
    private final int searchBarGoneMargin;

    @NotNull
    private final f viewedPond;

    @NotNull
    private final a widgetsFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpressNavBarNestedWidgetsManager(@NotNull i container, @NotNull WidgetExpressNavBarBinding binding, @NotNull a widgetsFactory, @NotNull f viewedPond, @NotNull Function1<? super NavBarModelProvider, Unit> navBarModelListenerProvider) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(widgetsFactory, "widgetsFactory");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Intrinsics.checkNotNullParameter(navBarModelListenerProvider, "navBarModelListenerProvider");
        this.container = container;
        this.binding = binding;
        this.widgetsFactory = widgetsFactory;
        this.viewedPond = viewedPond;
        this.navBarModelListenerProvider = navBarModelListenerProvider;
        this.navTitleGoneMargin = ResourceExtKt.toPx(42);
        this.searchBarGoneMargin = ResourceExtKt.toPx(6);
    }

    private final void addNestedWidgetsIntoViewGroup(List<l> viewObjects, ViewGroup parent, HashMap<Integer, k<c>> currentViewHolders) {
        ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(parent, this.container);
        if (viewObjects != null) {
            for (l lVar : viewObjects) {
                int j11 = lVar.j();
                this.widgetsFactory.c(iVar, lVar);
                k<c> f7 = this.widgetsFactory.f(iVar, lVar.j());
                if (f7 != null) {
                    f7.setLifecycleState(AbstractC5434v.b.CREATED);
                    f7.bindTrackingData(lVar, lVar.n(), this.viewedPond);
                    f7.track(lVar);
                    f7.bindPlaceholders(lVar.g(), lVar.h());
                    k.bindItem$default(f7, lVar.d(), lVar.c(), null, 4, null);
                    setMargins(lVar, parent);
                    currentViewHolders.put(Integer.valueOf(j11), f7);
                    if (f7 instanceof NavBarModelProvider) {
                        this.navBarModelListenerProvider.invoke(f7);
                    }
                    parent.addView(f7.itemView);
                }
            }
        }
    }

    private final void removeViewsIfNotEmpty(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
    }

    private final void setMargins(l vo, ViewGroup parent) {
        c d11 = vo.d();
        if (d11 instanceof ExpressNavTitleVO) {
            ViewGroup.LayoutParams layoutParams = parent.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            int i11 = this.navTitleGoneMargin;
            bVar.f41595B = i11;
            bVar.f41594A = i11;
            parent.setLayoutParams(bVar);
            return;
        }
        if (d11 instanceof SearchBarVO) {
            ViewGroup.LayoutParams layoutParams2 = parent.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            int i12 = this.searchBarGoneMargin;
            bVar2.f41595B = i12;
            bVar2.f41594A = i12;
            parent.setLayoutParams(bVar2);
        }
    }

    public final void addNestedWidgets$widgets_unsorted_prodGoogleAllVendorsRelease(@NotNull HashMap<String, VisiblePlaceholders> currentPlaceholders, @NotNull HashMap<Integer, k<c>> currentViewHolders) {
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(currentPlaceholders, "currentPlaceholders");
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        for (Map.Entry<String, VisiblePlaceholders> entry : currentPlaceholders.entrySet()) {
            String key = entry.getKey();
            VisiblePlaceholders value = entry.getValue();
            int hashCode = key.hashCode();
            if (hashCode == 3317767) {
                if (key.equals("left")) {
                    linearLayout = this.binding.leftContainer;
                }
                linearLayout = null;
            } else if (hashCode != 108511772) {
                if (hashCode == 1544803905 && key.equals("default")) {
                    linearLayout = this.binding.defaultContainer;
                }
                linearLayout = null;
            } else {
                if (key.equals("right")) {
                    linearLayout = this.binding.rightContainer;
                }
                linearLayout = null;
            }
            if (linearLayout != null && !value.getAreContentTheSame()) {
                removeViewsIfNotEmpty(linearLayout);
                addNestedWidgetsIntoViewGroup(value.getPlaceholders(), linearLayout, currentViewHolders);
            }
        }
    }

    public final void detachNestedViewHolders$widgets_unsorted_prodGoogleAllVendorsRelease(@NotNull HashMap<Integer, k<c>> currentViewHolders) {
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        Collection<k<c>> values = currentViewHolders.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((k) it.next()).setLifecycleState(AbstractC5434v.b.DESTROYED);
        }
        currentViewHolders.clear();
    }

    public final void removeNestedWidgets$widgets_unsorted_prodGoogleAllVendorsRelease() {
        LinearLayout leftContainer = this.binding.leftContainer;
        Intrinsics.checkNotNullExpressionValue(leftContainer, "leftContainer");
        removeViewsIfNotEmpty(leftContainer);
        LinearLayout rightContainer = this.binding.rightContainer;
        Intrinsics.checkNotNullExpressionValue(rightContainer, "rightContainer");
        removeViewsIfNotEmpty(rightContainer);
    }
}
