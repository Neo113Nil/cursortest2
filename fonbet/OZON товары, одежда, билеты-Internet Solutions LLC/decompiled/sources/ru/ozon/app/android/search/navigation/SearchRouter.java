package ru.ozon.app.android.search.navigation;

import android.app.Activity;
import android.text.Spanned;
import androidx.fragment.app.G;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.meta.DesignType;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/navigation/SearchRouter;", "", "Landroidx/fragment/app/G;", "childFragmentManager", "", "image", "Landroid/text/Spanned;", "description", "Lru/ozon/app/android/search/catalog/components/meta/DesignType;", "designType", "", "showMeta", "(Landroidx/fragment/app/G;Ljava/lang/String;Landroid/text/Spanned;Lru/ozon/app/android/search/catalog/components/meta/DesignType;)V", "Landroid/app/Activity;", "activity", "message", "share", "(Landroid/app/Activity;Ljava/lang/String;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchRouter {
    void share(@NotNull Activity activity, @NotNull String message);

    void showMeta(@NotNull G childFragmentManager, String image, Spanned description, @NotNull DesignType designType);
}
