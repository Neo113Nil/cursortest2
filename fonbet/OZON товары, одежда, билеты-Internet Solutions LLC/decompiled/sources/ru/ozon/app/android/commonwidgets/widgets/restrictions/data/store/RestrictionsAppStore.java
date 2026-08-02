package ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0016R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsAppStore;", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/store/RestrictionsStore;", "<init>", "()V", "shownRestrictions", "", "", "", "", "getShownRestrictions", "()Ljava/util/Map;", "put", "", "key", "hashCode", "isTokenExist", "", "token", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestrictionsAppStore implements RestrictionsStore {

    @NotNull
    private final Map<String, Set<Integer>> shownRestrictions = new LinkedHashMap();

    @NotNull
    public Map<String, Set<Integer>> getShownRestrictions() {
        return this.shownRestrictions;
    }

    @Override // ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsStore
    public boolean isTokenExist(@NotNull String token, int hashCode) {
        Intrinsics.checkNotNullParameter(token, "token");
        Set<Integer> set = getShownRestrictions().get(token);
        if (set == null) {
            return false;
        }
        return set.contains(Integer.valueOf(hashCode));
    }

    @Override // ru.ozon.app.android.commonwidgets.widgets.restrictions.data.store.RestrictionsStore
    public void put(@NotNull String key, int hashCode) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Set<Integer>> shownRestrictions = getShownRestrictions();
        Set<Integer> set = getShownRestrictions().get(key);
        Integer valueOf = Integer.valueOf(hashCode);
        if (set != null) {
            set.add(valueOf);
        } else {
            set = e0.e(valueOf);
        }
        shownRestrictions.put(key, set);
    }
}
