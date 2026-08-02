package ru.ozon.app.android.storefront.stories.story.presentation.media;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

/* loaded from: classes2.dex */
public final class StoryMediaFragment_MembersInjector implements b<StoryMediaFragment> {
    public static void injectProvider(StoryMediaFragment storyMediaFragment, a<StoryMediaViewModel> aVar) {
        storyMediaFragment.provider = aVar;
    }

    public static void injectVideoController(StoryMediaFragment storyMediaFragment, VideoController videoController) {
        storyMediaFragment.videoController = videoController;
    }
}
