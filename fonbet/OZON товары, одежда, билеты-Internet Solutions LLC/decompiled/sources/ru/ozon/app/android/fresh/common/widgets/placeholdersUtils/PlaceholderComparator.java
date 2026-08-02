package ru.ozon.app.android.fresh.common.widgets.placeholdersUtils;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\nJ1\u0010\u000f\u001a\u00020\b2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\f2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/PlaceholderComparator;", "", "<init>", "()V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/composer/ui/widget/l;)Z", "areContentsTheSame", "", "oldList", "newList", "areObjectsTheSame", "(Ljava/util/List;Ljava/util/List;)Z", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaceholderComparator {
    private final boolean areContentsTheSame(l oldItem, l newItem) {
        return Intrinsics.d(oldItem.d(), newItem.d()) && Intrinsics.d(oldItem.g(), newItem.g());
    }

    private final boolean areItemsTheSame(l oldItem, l newItem) {
        return oldItem.j() == newItem.j() && oldItem.d().getId() == newItem.d().getId();
    }

    public final boolean areObjectsTheSame(@NotNull List<l> oldList, @NotNull List<l> newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        int i11 = 0;
        for (Object obj : newList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            l lVar = (l) obj;
            l lVar2 = (l) C7714v.Q(i11, oldList);
            if (lVar2 == null || !areItemsTheSame(lVar2, lVar) || !areContentsTheSame(lVar2, lVar)) {
                return false;
            }
            i11 = i12;
        }
        return true;
    }
}
