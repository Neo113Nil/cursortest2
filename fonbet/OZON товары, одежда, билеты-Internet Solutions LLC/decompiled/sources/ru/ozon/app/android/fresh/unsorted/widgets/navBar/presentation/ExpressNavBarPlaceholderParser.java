package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation;

import androidx.lifecycle.AbstractC5434v;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jí\u0001\u0010\u0016\u001av\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\tj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013`\u000f\u0012P\u0012N\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\fj\u0002`\r0\u000bj\f\u0012\b\u0012\u00060\fj\u0002`\r`\u000e0\tj&\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\fj\u0002`\r0\u000bj\f\u0012\b\u0012\u00060\fj\u0002`\r`\u000e`\u000f0\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072R\u0010\u0010\u001aN\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\fj\u0002`\r0\u000bj\f\u0012\b\u0012\u00060\fj\u0002`\r`\u000e0\tj&\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060\fj\u0002`\r0\u000bj\f\u0012\b\u0012\u00060\fj\u0002`\r`\u000e`\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarPlaceholderParser;", "", "<init>", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;", "dataItem", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "composerViewObject", "Ljava/util/HashMap;", "", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Lkotlin/Pair;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/VisiblePlaceholders;", "parsePlaceholders$widgets_unsorted_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarVO;Lru/ozon/composer/ui/widget/l;Ljava/util/HashMap;)Lkotlin/Pair;", "parsePlaceholders", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressPlaceholderComparator;", "placeholderComparator", "Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressPlaceholderComparator;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressNavBarPlaceholderParser {

    @NotNull
    private final ExpressPlaceholderComparator placeholderComparator = new ExpressPlaceholderComparator();

    @NotNull
    public final Pair<HashMap<String, VisiblePlaceholders>, HashMap<Integer, k<c>>> parsePlaceholders$widgets_unsorted_prodGoogleAllVendorsRelease(ExpressNavBarVO dataItem, @NotNull l composerViewObject, @NotNull HashMap<Integer, k<c>> currentViewHolders) {
        VisiblePlaceholders visiblePlaceholders;
        Intrinsics.checkNotNullParameter(composerViewObject, "composerViewObject");
        Intrinsics.checkNotNullParameter(currentViewHolders, "currentViewHolders");
        HashMap hashMap = new HashMap();
        Map<String, List<l>> g10 = composerViewObject.g();
        if (g10 == null) {
            return new Pair<>(hashMap, currentViewHolders);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d11 = Intrinsics.d(composerViewObject.d(), dataItem);
        for (Map.Entry<String, List<l>> entry : g10.entrySet()) {
            String key = entry.getKey();
            List<l> value = entry.getValue();
            VisiblePlaceholders visiblePlaceholders2 = (VisiblePlaceholders) hashMap.get(key);
            List<l> placeholders = visiblePlaceholders2 != null ? visiblePlaceholders2.getPlaceholders() : null;
            boolean areObjectsTheSame$widgets_unsorted_prodGoogleAllVendorsRelease = (d11 && placeholders != null && Intrinsics.d(key, "default")) ? this.placeholderComparator.areObjectsTheSame$widgets_unsorted_prodGoogleAllVendorsRelease(value, placeholders) : false;
            if (!areObjectsTheSame$widgets_unsorted_prodGoogleAllVendorsRelease && placeholders != null) {
                for (l lVar : placeholders) {
                    k<c> kVar = currentViewHolders.get(Integer.valueOf(lVar.j()));
                    if (kVar != null) {
                        kVar.setLifecycleState(AbstractC5434v.b.DESTROYED);
                    }
                    currentViewHolders.remove(Integer.valueOf(lVar.j()));
                }
            }
            if (visiblePlaceholders2 == null || (visiblePlaceholders = VisiblePlaceholders.copy$default(visiblePlaceholders2, null, value, areObjectsTheSame$widgets_unsorted_prodGoogleAllVendorsRelease, 1, null)) == null) {
                visiblePlaceholders = new VisiblePlaceholders(key, value, false);
            }
            linkedHashMap.put(key, visiblePlaceholders);
        }
        hashMap.clear();
        hashMap.putAll(linkedHashMap);
        return new Pair<>(hashMap, currentViewHolders);
    }
}
