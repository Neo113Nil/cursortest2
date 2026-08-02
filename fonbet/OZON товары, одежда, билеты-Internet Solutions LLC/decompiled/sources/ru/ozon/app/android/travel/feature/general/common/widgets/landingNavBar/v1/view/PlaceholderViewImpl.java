package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.view;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R`\u0010\u001b\u001aN\u0012\u0004\u0012\u00020\u0015\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u0016j\f\u0012\b\u0012\u00060\u0017j\u0002`\u0018`\u00190\u0014j&\u0012\u0004\u0012\u00020\u0015\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u0016j\f\u0012\b\u0012\u00060\u0017j\u0002`\u0018`\u0019`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/view/PlaceholderViewImpl;", "", "Landroid/content/Context;", "context", "", "contentKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Ll10/i;", "container", "", "setupNestedWidgetManager", "(Ll10/i;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bind", "(Lru/ozon/composer/ui/widget/l;)V", "Ljava/util/HashMap;", "", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "Landroid/widget/LinearLayout;", "placeholderView", "Landroid/widget/LinearLayout;", "getPlaceholderView", "()Landroid/widget/LinearLayout;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class PlaceholderViewImpl {

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;
    private NestedWidgetsManager nestedWidgetsManager;

    @NotNull
    private PlaceholderParser placeholderParser;

    @NotNull
    private final LinearLayout placeholderView;

    public PlaceholderViewImpl(@NotNull Context context, @NotNull String contentKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentKey, "contentKey");
        this.currentViewHolders = new HashMap<>();
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        this.placeholderParser = new PlaceholderParser(contentKey);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.placeholderView = linearLayout;
    }

    public void bind(l viewItem) {
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(viewItem, this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.addNestedWidgets(parsePlaceholders, this.currentViewHolders);
        }
    }

    @NotNull
    public final LinearLayout getPlaceholderView() {
        return this.placeholderView;
    }

    public void onWidgetCreated() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.setContainer(this.placeholderView);
        }
    }

    public void onWidgetDestroyed() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        if (nestedWidgetsManager != null) {
            nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        }
        this.currentViewHolders.clear();
        this.nestedWidgetsManager = null;
    }

    public void setupNestedWidgetManager(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.nestedWidgetsManager = new NestedWidgetsManager(container, container.d0(), container.c0());
    }
}
