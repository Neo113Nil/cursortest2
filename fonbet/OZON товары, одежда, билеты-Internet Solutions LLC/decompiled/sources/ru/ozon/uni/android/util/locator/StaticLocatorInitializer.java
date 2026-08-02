package ru.ozon.uni.android.util.locator;

import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/util/locator/StaticLocatorInitializer;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "viewName", "parentViewTag", "", "setViewFormattedLocator", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "", "namedViews", "setStaticLocators$uni_release", "(Ljava/util/Map;Ljava/lang/String;)V", "setStaticLocators", "setStaticLocator$uni_release", "setStaticLocator", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StaticLocatorInitializer {

    @NotNull
    public static final StaticLocatorInitializer INSTANCE = new StaticLocatorInitializer();

    private StaticLocatorInitializer() {
    }

    private final void setViewFormattedLocator(View view, String viewName, String parentViewTag) {
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription() && view != null) {
            view.setContentDescription(parentViewTag + "." + viewName);
        }
    }

    public final void setStaticLocator$uni_release(View view, @NotNull String viewName, @NotNull String parentViewTag) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        Intrinsics.checkNotNullParameter(parentViewTag, "parentViewTag");
        setViewFormattedLocator(view, viewName, parentViewTag);
    }

    public final void setStaticLocators$uni_release(@NotNull Map<View, String> namedViews, @NotNull String parentViewTag) {
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        Intrinsics.checkNotNullParameter(parentViewTag, "parentViewTag");
        for (Map.Entry<View, String> entry : namedViews.entrySet()) {
            INSTANCE.setViewFormattedLocator(entry.getKey(), entry.getValue(), parentViewTag);
        }
    }
}
