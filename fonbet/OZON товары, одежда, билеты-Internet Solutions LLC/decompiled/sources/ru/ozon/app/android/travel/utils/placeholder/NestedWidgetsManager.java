package ru.ozon.app.android.travel.utils.placeholder;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.a;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJI\u0010\u0017\u001a\u00020\u00162\u0012\u0010\r\u001a\u000e\u0012\b\u0012\u00060\u000bj\u0002`\f\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140\u00120\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b26\u0010\u0015\u001a2\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140\u00120\u001dj\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140\u0012`\u001e¢\u0006\u0004\b\u001f\u0010 JE\u0010!\u001a\u00020\u001626\u0010\u0015\u001a2\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140\u00120\u001dj\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140\u0012`\u001e¢\u0006\u0004\b!\u0010\"J?\u0010#\u001a\u00020\u00162\u0012\u0010\r\u001a\u000e\u0012\b\u0012\u00060\u000bj\u0002`\f\u0018\u00010\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140\u00120\u0010¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/a;", "widgetsFactory", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "<init>", "(Ll10/i;Lru/ozon/composer/ui/widget/a;Lru/ozon/composer/ui/widget/f;)V", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObjects", "Landroid/view/ViewGroup;", "parent", "", "", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "currentViewHolders", "", "addNestedWidgetsIntoViewGroup", "(Ljava/util/List;Landroid/view/ViewGroup;Ljava/util/Map;)V", "setContainer", "(Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "addNestedWidgets", "(Lru/ozon/app/android/travel/utils/placeholder/Placeholder;Ljava/util/HashMap;)V", "detachNestedViewHolders", "(Ljava/util/HashMap;)V", "updateNestedWidgets", "(Ljava/util/List;Ljava/util/Map;)V", "Ll10/i;", "Lru/ozon/composer/ui/widget/a;", "Lru/ozon/composer/ui/widget/f;", "contentContainer", "Landroid/view/ViewGroup;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NestedWidgetsManager {

    @NotNull
    private final i container;
    private ViewGroup contentContainer;

    @NotNull
    private final f viewedPond;

    @NotNull
    private final a widgetsFactory;

    public NestedWidgetsManager(@NotNull i container, @NotNull a widgetsFactory, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetsFactory, "widgetsFactory");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        this.container = container;
        this.widgetsFactory = widgetsFactory;
        this.viewedPond = viewedPond;
    }

    private final void addNestedWidgetsIntoViewGroup(List<l> viewObjects, ViewGroup parent, Map<Integer, k<c>> currentViewHolders) {
        ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(parent, this.container);
        if (viewObjects != null) {
            for (l lVar : viewObjects) {
                int j11 = lVar.j();
                this.widgetsFactory.c(iVar, lVar);
                k<c> f7 = this.widgetsFactory.f(iVar, j11);
                if (f7 != null) {
                    f7.setLifecycleState(AbstractC5434v.b.CREATED);
                    f7.bindTrackingData(lVar, lVar.n(), this.viewedPond);
                    f7.track(lVar);
                    f7.bindPlaceholders(lVar.g(), lVar.h());
                    k.bindItem$default(f7, lVar.d(), lVar.c(), null, 4, null);
                    f7.setLifecycleState(AbstractC5434v.b.RESUMED);
                    currentViewHolders.put(Integer.valueOf(j11), f7);
                    parent.addView(f7.itemView);
                }
            }
        }
    }

    public final void addNestedWidgets(@NotNull Placeholder currentPlaceholder, @NotNull HashMap<Integer, k<c>> currentViewHolders) {
        Intrinsics.checkNotNullParameter(currentPlaceholder, "currentPlaceholder");
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        ViewGroup viewGroup = this.contentContainer;
        if (viewGroup == null || currentPlaceholder.getAreContentsTheSame()) {
            return;
        }
        detachNestedViewHolders(currentViewHolders);
        if (viewGroup.getChildCount() != 0) {
            viewGroup.removeAllViews();
        }
        addNestedWidgetsIntoViewGroup(currentPlaceholder.getViewObjects(), viewGroup, currentViewHolders);
    }

    public final void detachNestedViewHolders(@NotNull HashMap<Integer, k<c>> currentViewHolders) {
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        Collection<k<c>> values = currentViewHolders.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((k) it.next()).setLifecycleState(AbstractC5434v.b.DESTROYED);
        }
        currentViewHolders.clear();
    }

    public final void setContainer(ViewGroup container) {
        this.contentContainer = container;
    }

    public final void updateNestedWidgets(List<l> viewObjects, @NotNull Map<Integer, k<c>> currentViewHolders) {
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        if (viewObjects != null) {
            for (l lVar : viewObjects) {
                k<c> kVar = currentViewHolders.get(Integer.valueOf(lVar.j()));
                if (kVar != null) {
                    k.bindItem$default(kVar, lVar.d(), lVar.c(), null, 4, null);
                }
            }
        }
    }
}
