package ru.ozon.app.android.storefront.stories.playstories.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.StoriesRequest;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/deeplink/StoriesDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoriesDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "stories") && route.e().containsKey("stories") && route.e().containsKey("selected_story_index") && route.e().containsKey("preview");
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        PlayStoriesActivity.Companion companion = PlayStoriesActivity.INSTANCE;
        Object obj = route.e().get("stories");
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule>");
        Object obj2 = route.e().get("selected_story_index");
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = route.e().get("preview");
        Intrinsics.g(obj3, "null cannot be cast to non-null type android.view.View");
        StoriesRequest request = companion.getRequest(context, (List) obj, intValue, (View) obj3);
        return new C8880a(request.getIntent(), Integer.valueOf(request.getRequestCode()), request.getOptions());
    }
}
