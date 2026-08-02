package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import android.content.Intent;
import androidx.appcompat.app.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouterImpl;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouter;", "Landroidx/appcompat/app/g;", "activity", "LGZ/g;", "router", "<init>", "(Landroidx/appcompat/app/g;LGZ/g;)V", "", "close", "()V", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/ViewedStories;", "viewedStories", "closeWithTransition", "(Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/ViewedStories;)V", "Landroidx/appcompat/app/g;", "getActivity", "()Landroidx/appcompat/app/g;", "LGZ/g;", "getRouter", "()LGZ/g;", "", "openScreenStoryPosition", "I", "getOpenScreenStoryPosition", "()I", "setOpenScreenStoryPosition", "(I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoriesRouterImpl implements StoriesRouter {

    @NotNull
    private final g activity;
    private int openScreenStoryPosition;

    @NotNull
    private final GZ.g router;

    public StoriesRouterImpl(@NotNull g activity, @NotNull GZ.g router) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(router, "router");
        this.activity = activity;
        this.router = router;
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.StoriesRouter
    public void close() {
        this.activity.finish();
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.StoriesRouter
    public void closeWithTransition(@NotNull ViewedStories viewedStories) {
        Intrinsics.checkNotNullParameter(viewedStories, "viewedStories");
        Intent intent = new Intent();
        List<StoryCommonMolecule> newItems = viewedStories.getNewItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : newItems) {
            if (((StoryCommonMolecule) obj).getWasViewed()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((StoryCommonMolecule) it.next()).getStoryId()));
        }
        intent.putExtra("close_screen_story_position", viewedStories.getCurrentStoryPosition());
        intent.putExtra("viewed_stories_ids", C7714v.V0(arrayList2));
        g gVar = this.activity;
        gVar.setResult(-1, intent);
        gVar.finish();
    }

    @Override // ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.StoriesRouter
    public void setOpenScreenStoryPosition(int i11) {
        this.openScreenStoryPosition = i11;
    }
}
