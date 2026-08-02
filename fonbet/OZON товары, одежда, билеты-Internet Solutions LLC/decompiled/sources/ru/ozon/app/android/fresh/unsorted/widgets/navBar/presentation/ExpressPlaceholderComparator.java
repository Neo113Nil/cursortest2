package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\f2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressPlaceholderComparator;", "", "<init>", "()V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/composer/ui/widget/l;)Z", "areContentsTheSame", "", "composerObjects", "visiblePlaceholderObjects", "areObjectsTheSame$widgets_unsorted_prodGoogleAllVendorsRelease", "(Ljava/util/List;Ljava/util/List;)Z", "areObjectsTheSame", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressPlaceholderComparator {
    private final boolean areContentsTheSame(l oldItem, l newItem) {
        return Intrinsics.d(oldItem.d(), newItem.d()) && Intrinsics.d(oldItem.g(), newItem.g());
    }

    private final boolean areItemsTheSame(l oldItem, l newItem) {
        return oldItem.j() == newItem.j() && oldItem.d().getId() == newItem.d().getId();
    }

    public final boolean areObjectsTheSame$widgets_unsorted_prodGoogleAllVendorsRelease(@NotNull List<l> composerObjects, @NotNull List<l> visiblePlaceholderObjects) {
        Intrinsics.checkNotNullParameter(composerObjects, "composerObjects");
        Intrinsics.checkNotNullParameter(visiblePlaceholderObjects, "visiblePlaceholderObjects");
        int size = composerObjects.size();
        for (int i11 = 0; i11 < size; i11++) {
            l lVar = (l) C7714v.Q(i11, visiblePlaceholderObjects);
            if (lVar == null) {
                return false;
            }
            l lVar2 = composerObjects.get(i11);
            if (!areItemsTheSame(lVar, lVar2) || !areContentsTheSame(lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }
}
