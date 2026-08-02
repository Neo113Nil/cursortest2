package ru.ozon.app.android.fresh.common.widgets.placeholdersUtils;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/PlaceholderParser;", "", "<init>", "()V", "", "Lru/ozon/composer/ui/widget/l;", "placeholderWidgetList", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;", "currentPlaceholder", "parsePlaceholders", "(Ljava/util/List;Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;)Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/Placeholder;", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/PlaceholderComparator;", "placeholderComparator", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/PlaceholderComparator;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaceholderParser {

    @NotNull
    private final PlaceholderComparator placeholderComparator = new PlaceholderComparator();

    @NotNull
    public final Placeholder parsePlaceholders(List<l> placeholderWidgetList, @NotNull Placeholder currentPlaceholder) {
        Intrinsics.checkNotNullParameter(currentPlaceholder, "currentPlaceholder");
        boolean areObjectsTheSame = placeholderWidgetList != null ? this.placeholderComparator.areObjectsTheSame(currentPlaceholder.getViewObjects(), placeholderWidgetList) : false;
        if (placeholderWidgetList == null) {
            placeholderWidgetList = K.f71697a;
        }
        return new Placeholder(placeholderWidgetList, areObjectsTheSame);
    }
}
