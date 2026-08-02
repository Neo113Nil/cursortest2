package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import Ib.b;
import Pc.a;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

/* loaded from: classes2.dex */
public final class StoryV3MediaFragment_MembersInjector implements b<StoryV3MediaFragment> {
    public static void injectPViewModel(StoryV3MediaFragment storyV3MediaFragment, a<PlayStoriesV3ViewModel> aVar) {
        storyV3MediaFragment.pViewModel = aVar;
    }

    public static void injectProvider(StoryV3MediaFragment storyV3MediaFragment, a<StoryV3MediaViewModel> aVar) {
        storyV3MediaFragment.provider = aVar;
    }

    public static void injectVideoController(StoryV3MediaFragment storyV3MediaFragment, VideoController videoController) {
        storyV3MediaFragment.videoController = videoController;
    }
}
