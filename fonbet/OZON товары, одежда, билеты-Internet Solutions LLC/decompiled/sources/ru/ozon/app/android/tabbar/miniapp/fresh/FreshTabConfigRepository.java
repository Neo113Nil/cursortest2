package ru.ozon.app.android.tabbar.miniapp.fresh;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepository;", "", "", "", "freshCategory", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "getNewTabsData", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getDefaultTabs", "()Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FreshTabConfigRepository {
    @NotNull
    FreshTabData getDefaultTabs();

    Object getNewTabsData(@NotNull Map<String, String> map, @NotNull d<? super FreshTabData> dVar);
}
