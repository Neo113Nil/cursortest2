package ru.ozon.app.android.fresh.common.widgets.placeholdersUtils;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import b20.C5521a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;
import xe.B0;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0015\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\f\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRD\u0010#\u001a2\u0012\u0004\u0012\u00020\u001e\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`!0\u001f0\u001dj\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u000e\u0012\f\u0012\b\u0012\u00060 j\u0002`!0\u001f`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/SinglePlaceholderController;", "", "Ll10/i;", "container", "", "placeholderKey", "<init>", "(Ll10/i;Ljava/lang/String;)V", "", "Lru/ozon/composer/ui/widget/l;", "placeholderWidgetList", "", "handleNestedWidgets", "(Ljava/util/List;)V", "resubscribeToComposerUpdates", "()V", "Landroid/view/ViewGroup;", "placeholderContainer", "setContainer", "(Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewItem", "(Lru/ozon/composer/ui/widget/l;)V", "detachNestedViewHolders", "Ll10/i;", "Ljava/lang/String;", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/PlaceholderParser;", "Ljava/util/HashMap;", "", "Lb20/a;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/NestedWidgetsManager;", "nestedWidgetsManager$delegate", "LSc/j;", "getNestedWidgetsManager", "()Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;", "Lxe/B0;", "updatesObserver", "Lxe/B0;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SinglePlaceholderController {

    @NotNull
    private final i container;

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Long, C5521a<c>> currentViewHolders;

    /* renamed from: nestedWidgetsManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j nestedWidgetsManager;

    @NotNull
    private final String placeholderKey;

    @NotNull
    private final PlaceholderParser placeholderParser;
    private B0 updatesObserver;

    public SinglePlaceholderController(@NotNull i container, @NotNull String placeholderKey) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(placeholderKey, "placeholderKey");
        this.container = container;
        this.placeholderKey = placeholderKey;
        this.placeholderParser = new PlaceholderParser();
        this.currentViewHolders = new HashMap<>();
        this.nestedWidgetsManager = k.a(n.NONE, new SinglePlaceholderController$nestedWidgetsManager$2(this));
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        resubscribeToComposerUpdates();
    }

    private final NestedWidgetsManager getNestedWidgetsManager() {
        return (NestedWidgetsManager) this.nestedWidgetsManager.getValue();
    }

    public final void detachNestedViewHolders() {
        getNestedWidgetsManager().detachNestedViewHolders(this.currentViewHolders);
    }

    public final void handleNestedWidgets(l viewItem) {
        Map<String, List<l>> g10;
        handleNestedWidgets((viewItem == null || (g10 = viewItem.g()) == null) ? null : g10.get(this.placeholderKey));
    }

    public final void resubscribeToComposerUpdates() {
        B0 b02 = this.updatesObserver;
        if (b02 != null) {
            b02.j(null);
        }
        this.updatesObserver = C2399j.C(new C2408n0(C5427n.a(this.container.M().getEventsFlow(), this.container.K().f().getLifecycle(), AbstractC5434v.b.STARTED), new SinglePlaceholderController$resubscribeToComposerUpdates$1(this, null)), K.a(this.container.K().f()));
    }

    public final void setContainer(@NotNull ViewGroup placeholderContainer) {
        Intrinsics.checkNotNullParameter(placeholderContainer, "placeholderContainer");
        getNestedWidgetsManager().setContainer(placeholderContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNestedWidgets(List<l> placeholderWidgetList) {
        if (this.currentViewHolders.isEmpty() && !this.currentPlaceholder.getViewObjects().isEmpty()) {
            getNestedWidgetsManager().addNestedWidgets(this.currentPlaceholder.getViewObjects(), this.currentViewHolders);
            return;
        }
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(placeholderWidgetList, this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        if (parsePlaceholders.getAreContentsTheSame()) {
            getNestedWidgetsManager().updateNestedWidgets(this.currentPlaceholder.getViewObjects(), this.currentViewHolders);
        } else {
            getNestedWidgetsManager().addNestedWidgets(this.currentPlaceholder.getViewObjects(), this.currentViewHolders);
        }
    }
}
