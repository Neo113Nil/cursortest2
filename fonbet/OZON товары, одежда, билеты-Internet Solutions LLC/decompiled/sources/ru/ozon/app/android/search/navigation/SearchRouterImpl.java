package ru.ozon.app.android.search.navigation;

import android.app.Activity;
import android.text.Spanned;
import androidx.core.app.t;
import androidx.fragment.app.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.catalog.components.meta.DesignType;
import ru.ozon.app.android.search.catalog.components.meta.MetaFragment;
import ru.ozon.app.android.uikit.R$string;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/navigation/SearchRouterImpl;", "Lru/ozon/app/android/search/navigation/SearchRouter;", "<init>", "()V", "Landroidx/fragment/app/G;", "childFragmentManager", "", "image", "Landroid/text/Spanned;", "description", "Lru/ozon/app/android/search/catalog/components/meta/DesignType;", "designType", "", "showMeta", "(Landroidx/fragment/app/G;Ljava/lang/String;Landroid/text/Spanned;Lru/ozon/app/android/search/catalog/components/meta/DesignType;)V", "Landroid/app/Activity;", "activity", "message", "share", "(Landroid/app/Activity;Ljava/lang/String;)V", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchRouterImpl implements SearchRouter {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/navigation/SearchRouterImpl$Companion;", "", "<init>", "()V", "SHARE_DATA_TYPE", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.app.android.search.navigation.SearchRouter
    public void share(@NotNull Activity activity, @NotNull String message) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        t.a b11 = t.a.b(activity);
        b11.g("text/plain");
        b11.f(message);
        b11.c(R$string.common_action_share);
        b11.h();
    }

    @Override // ru.ozon.app.android.search.navigation.SearchRouter
    public void showMeta(@NotNull G childFragmentManager, String image, Spanned description, @NotNull DesignType designType) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(designType, "designType");
        MetaFragment.INSTANCE.newInstance(image, description, designType).show(childFragmentManager, "MetaFragment");
    }
}
