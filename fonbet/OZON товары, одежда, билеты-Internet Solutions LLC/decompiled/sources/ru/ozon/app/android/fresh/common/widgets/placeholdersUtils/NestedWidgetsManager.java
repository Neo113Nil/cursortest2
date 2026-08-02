package ru.ozon.app.android.fresh.common.widgets.placeholdersUtils;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import b20.C5521a;
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

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u0013\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000e0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016JW\u0010\u0019\u001a\u00020\u00122\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000626\u0010\u0011\u001a2\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000e0\u0017j\u0018\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000e`\u0018¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u001b\u001a\u00020\u001226\u0010\u0011\u001a2\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000e0\u0017j\u0018\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000e`\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001d\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u00060\u0007j\u0002`\b\u0018\u00010\u00062\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000e0\f¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/NestedWidgetsManager;", "", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObjects", "Landroid/view/ViewGroup;", "parent", "", "", "Lb20/a;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "currentViewHolders", "", "addNestedWidgetsIntoViewGroup", "(Ljava/util/List;Landroid/view/ViewGroup;Ljava/util/Map;)V", "setContainer", "(Landroid/view/ViewGroup;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "addNestedWidgets", "(Ljava/util/List;Ljava/util/HashMap;)V", "detachNestedViewHolders", "(Ljava/util/HashMap;)V", "updateNestedWidgets", "(Ljava/util/List;Ljava/util/Map;)V", "Ll10/i;", "contentContainer", "Landroid/view/ViewGroup;", "Lru/ozon/composer/ui/widget/a;", "getWidgetsFactory", "()Lru/ozon/composer/ui/widget/a;", "widgetsFactory", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "viewedPond", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NestedWidgetsManager {

    @NotNull
    private final i container;
    private ViewGroup contentContainer;

    public NestedWidgetsManager(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addNestedWidgetsIntoViewGroup(List<l> viewObjects, ViewGroup parent, Map<Long, C5521a<c>> currentViewHolders) {
        ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(parent, this.container);
        if (viewObjects != null) {
            for (l widgetViewItem : viewObjects) {
                getWidgetsFactory().c(iVar, widgetViewItem);
                k<c> source = getWidgetsFactory().f(iVar, widgetViewItem.j());
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    C5521a.c(source, AbstractC5434v.b.CREATED);
                    Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
                    source.track(widgetViewItem);
                    C5521a.a(source, widgetViewItem, getViewedPond());
                    C5521a.c(source, AbstractC5434v.b.RESUMED);
                    currentViewHolders.put(Long.valueOf(widgetViewItem.d().getId()), C5521a.b(source));
                    if (parent instanceof PlaceholderContainer) {
                        View itemView = source.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        ((PlaceholderContainer) parent).customAddView(itemView);
                    } else {
                        parent.addView(source.itemView);
                    }
                }
            }
        }
    }

    private final f getViewedPond() {
        return this.container.c0();
    }

    private final a getWidgetsFactory() {
        return this.container.d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addNestedWidgets(@NotNull List<l> viewObjects, @NotNull HashMap<Long, C5521a<c>> currentViewHolders) {
        Intrinsics.checkNotNullParameter(viewObjects, "viewObjects");
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        ViewGroup viewGroup = this.contentContainer;
        if (viewGroup == 0) {
            return;
        }
        detachNestedViewHolders(currentViewHolders);
        if (viewGroup.getChildCount() != 0) {
            if (viewGroup instanceof PlaceholderContainer) {
                ((PlaceholderContainer) viewGroup).customRemoveAllViews();
            } else {
                viewGroup.removeAllViews();
            }
        }
        addNestedWidgetsIntoViewGroup(viewObjects, viewGroup, currentViewHolders);
    }

    public final void detachNestedViewHolders(@NotNull HashMap<Long, C5521a<c>> currentViewHolders) {
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        Collection<C5521a<c>> values = currentViewHolders.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            C5521a.c(((C5521a) it.next()).d(), AbstractC5434v.b.DESTROYED);
        }
        currentViewHolders.clear();
    }

    public final void setContainer(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.contentContainer = container;
    }

    public final void updateNestedWidgets(List<l> viewObjects, @NotNull Map<Long, C5521a<c>> currentViewHolders) {
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        if (viewObjects != null) {
            for (l lVar : viewObjects) {
                C5521a<c> c5521a = currentViewHolders.get(Long.valueOf(lVar.d().getId()));
                k d11 = c5521a != null ? c5521a.d() : null;
                if (d11 != null) {
                    C5521a.a(d11, lVar, getViewedPond());
                }
            }
        }
    }
}
