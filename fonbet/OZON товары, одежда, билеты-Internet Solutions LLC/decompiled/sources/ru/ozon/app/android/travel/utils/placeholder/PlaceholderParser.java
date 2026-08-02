package ru.ozon.app.android.travel.utils.placeholder;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "", "", "contentKey", "<init>", "(Ljava/lang/String;)V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "composerViewObject", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "parsePlaceholders", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/travel/utils/placeholder/Placeholder;)Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Ljava/lang/String;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderComparator;", "placeholderComparator", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderComparator;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlaceholderParser {

    @NotNull
    private final String contentKey;

    @NotNull
    private final PlaceholderComparator placeholderComparator;

    public PlaceholderParser(@NotNull String contentKey) {
        Intrinsics.checkNotNullParameter(contentKey, "contentKey");
        this.contentKey = contentKey;
        this.placeholderComparator = new PlaceholderComparator();
    }

    @NotNull
    public final Placeholder parsePlaceholders(l composerViewObject, @NotNull Placeholder currentPlaceholder) {
        Map<String, List<l>> g10;
        Intrinsics.checkNotNullParameter(currentPlaceholder, "currentPlaceholder");
        List<l> list = (composerViewObject == null || (g10 = composerViewObject.g()) == null) ? null : g10.get(this.contentKey);
        boolean areObjectsTheSame = list != null ? this.placeholderComparator.areObjectsTheSame(currentPlaceholder.getViewObjects(), list) : false;
        if (list == null) {
            list = K.f71697a;
        }
        return new Placeholder(list, areObjectsTheSame);
    }
}
