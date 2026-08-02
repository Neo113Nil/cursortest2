package ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.presentation;

import Sc.InterfaceC4008j;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR`\u0010#\u001aN\u0012\u0004\u0012\u00020\u001d\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001fj\u0002` 0\u001ej\f\u0012\b\u0012\u00060\u001fj\u0002` `!0\u001cj&\u0012\u0004\u0012\u00020\u001d\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\u001fj\u0002` 0\u001ej\f\u0012\b\u0012\u00060\u001fj\u0002` `!`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\b¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarPlaceholderController;", "", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "createNestedWidgetsManager", "()Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "Landroid/view/ViewGroup;", "placeholderContainer", "", "setContainer", "(Landroid/view/ViewGroup;)V", "detachNestedViewHolders", "()V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewItem", "addNestedWidgets", "(Lru/ozon/composer/ui/widget/l;)V", "Ll10/i;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Ljava/util/HashMap;", "", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "nestedWidgetsManager$delegate", "LSc/j;", "getNestedWidgetsManager", "nestedWidgetsManager", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoundedNavBarPlaceholderController {

    @NotNull
    private final i container;

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;

    /* renamed from: nestedWidgetsManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j nestedWidgetsManager;

    @NotNull
    private final PlaceholderParser placeholderParser;

    public RoundedNavBarPlaceholderController(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        this.placeholderParser = new PlaceholderParser("content");
        this.currentViewHolders = new HashMap<>();
        this.nestedWidgetsManager = UtilsKt.unsafeLazy(new RoundedNavBarPlaceholderController$nestedWidgetsManager$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NestedWidgetsManager createNestedWidgetsManager() {
        i iVar = this.container;
        return new NestedWidgetsManager(iVar, iVar.d0(), this.container.c0());
    }

    private final NestedWidgetsManager getNestedWidgetsManager() {
        return (NestedWidgetsManager) this.nestedWidgetsManager.getValue();
    }

    public final void addNestedWidgets(l viewItem) {
        this.currentPlaceholder = this.placeholderParser.parsePlaceholders(viewItem, this.currentPlaceholder);
        getNestedWidgetsManager().addNestedWidgets(this.currentPlaceholder, this.currentViewHolders);
    }

    public final void detachNestedViewHolders() {
        getNestedWidgetsManager().detachNestedViewHolders(this.currentViewHolders);
    }

    public final void setContainer(@NotNull ViewGroup placeholderContainer) {
        Intrinsics.checkNotNullParameter(placeholderContainer, "placeholderContainer");
        getNestedWidgetsManager().setContainer(placeholderContainer);
    }
}
