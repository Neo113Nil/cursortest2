package ru.ozon.app.android.storefront.stories.story.di;

import Jb.j;
import Pc.a;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel_Factory;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.StoryV3UpdateStore_Factory;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment_MembersInjector;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaViewModel_Factory;
import ru.ozon.app.android.storefront.stories.story.cache.StoryImageMemoryCache_Factory;
import ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment_MembersInjector;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaViewModel_Factory;
import ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment_MembersInjector;
import ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollViewModel_Factory;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.app.android.video.player.soundservice.SoundService;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

/* loaded from: classes2.dex */
public final class DaggerStoryMoleculeComponent {

    private static final class Factory implements StoryMoleculeComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent.Factory
        public StoryMoleculeComponent create(VideoComponentApi videoComponentApi, ComposerComponentApi composerComponentApi) {
            videoComponentApi.getClass();
            composerComponentApi.getClass();
            return new StoryMoleculeComponentImpl(videoComponentApi, composerComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class StoryMoleculeComponentImpl implements StoryMoleculeComponent {
        private a<SoundService> getSoundServiceProvider;
        private a<PlayStoriesV3ViewModel> playStoriesV3ViewModelProvider;
        private a<SoundController> provideSoundController$storefront_prodGoogleAllVendorsReleaseProvider;
        private a<StoryMediaViewModel> storyMediaViewModelProvider;
        private final StoryMoleculeComponentImpl storyMoleculeComponentImpl;
        private a<StoryPollViewModel> storyPollViewModelProvider;
        private a<StoryV3MediaViewModel> storyV3MediaViewModelProvider;
        private final VideoComponentApi videoComponentApi;

        private static final class GetSoundServiceProvider implements a<SoundService> {
            private final VideoComponentApi videoComponentApi;

            GetSoundServiceProvider(VideoComponentApi videoComponentApi) {
                this.videoComponentApi = videoComponentApi;
            }

            @Override // Pc.a
            public SoundService get() {
                SoundService soundService = this.videoComponentApi.getSoundService();
                j.c(soundService);
                return soundService;
            }
        }

        /* synthetic */ StoryMoleculeComponentImpl(VideoComponentApi videoComponentApi, ComposerComponentApi composerComponentApi, int i11) {
            this(videoComponentApi, composerComponentApi);
        }

        private void initialize(VideoComponentApi videoComponentApi, ComposerComponentApi composerComponentApi) {
            this.playStoriesV3ViewModelProvider = PlayStoriesV3ViewModel_Factory.create(StoryV3UpdateStore_Factory.create());
            GetSoundServiceProvider getSoundServiceProvider = new GetSoundServiceProvider(videoComponentApi);
            this.getSoundServiceProvider = getSoundServiceProvider;
            this.provideSoundController$storefront_prodGoogleAllVendorsReleaseProvider = StoriesMoleculeModule_Companion_ProvideSoundController$storefront_prodGoogleAllVendorsReleaseFactory.create(getSoundServiceProvider);
            this.storyMediaViewModelProvider = StoryMediaViewModel_Factory.create(StoryImageMemoryCache_Factory.create(), this.provideSoundController$storefront_prodGoogleAllVendorsReleaseProvider);
            this.storyPollViewModelProvider = StoryPollViewModel_Factory.create(StoryImageMemoryCache_Factory.create());
            this.storyV3MediaViewModelProvider = StoryV3MediaViewModel_Factory.create(StoryImageMemoryCache_Factory.create(), this.provideSoundController$storefront_prodGoogleAllVendorsReleaseProvider);
        }

        private StoryMediaFragment injectStoryMediaFragment(StoryMediaFragment storyMediaFragment) {
            StoryMediaFragment_MembersInjector.injectProvider(storyMediaFragment, this.storyMediaViewModelProvider);
            VideoController videoController = this.videoComponentApi.getVideoController();
            j.c(videoController);
            StoryMediaFragment_MembersInjector.injectVideoController(storyMediaFragment, videoController);
            return storyMediaFragment;
        }

        private StoryPollFragment injectStoryPollFragment(StoryPollFragment storyPollFragment) {
            StoryPollFragment_MembersInjector.injectProvider(storyPollFragment, this.storyPollViewModelProvider);
            return storyPollFragment;
        }

        private StoryV3MediaFragment injectStoryV3MediaFragment(StoryV3MediaFragment storyV3MediaFragment) {
            StoryV3MediaFragment_MembersInjector.injectProvider(storyV3MediaFragment, this.storyV3MediaViewModelProvider);
            StoryV3MediaFragment_MembersInjector.injectPViewModel(storyV3MediaFragment, this.playStoriesV3ViewModelProvider);
            VideoController videoController = this.videoComponentApi.getVideoController();
            j.c(videoController);
            StoryV3MediaFragment_MembersInjector.injectVideoController(storyV3MediaFragment, videoController);
            return storyV3MediaFragment;
        }

        @Override // ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent
        public void inject(StoryMediaFragment storyMediaFragment) {
            injectStoryMediaFragment(storyMediaFragment);
        }

        private StoryMoleculeComponentImpl(VideoComponentApi videoComponentApi, ComposerComponentApi composerComponentApi) {
            this.storyMoleculeComponentImpl = this;
            this.videoComponentApi = videoComponentApi;
            initialize(videoComponentApi, composerComponentApi);
        }

        @Override // ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent
        public void inject(StoryPollFragment storyPollFragment) {
            injectStoryPollFragment(storyPollFragment);
        }

        @Override // ru.ozon.app.android.storefront.stories.story.di.StoryMoleculeComponent
        public void inject(StoryV3MediaFragment storyV3MediaFragment) {
            injectStoryV3MediaFragment(storyV3MediaFragment);
        }
    }

    public static StoryMoleculeComponent.Factory factory() {
        return new Factory(0);
    }
}
