package ru.ozon.app.android.storefront.stories.story.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment;
import ru.ozon.app.android.video.di.VideoComponentApi;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/di/StoryMoleculeComponent;", "", "Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaFragment;", "mediaFragment", "", "inject", "(Lru/ozon/app/android/storefront/stories/story/presentation/media/StoryMediaFragment;)V", "Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollFragment;", "pollFragment", "(Lru/ozon/app/android/storefront/stories/story/presentation/poll/StoryPollFragment;)V", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaFragment;", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/StoryV3MediaFragment;)V", "Factory", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface StoryMoleculeComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/di/StoryMoleculeComponent$Factory;", "", "create", "Lru/ozon/app/android/storefront/stories/story/di/StoryMoleculeComponent;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        StoryMoleculeComponent create(@NotNull VideoComponentApi videoComponentApi, @NotNull ComposerComponentApi composerComponentApi);
    }

    void inject(@NotNull StoryV3MediaFragment mediaFragment);

    void inject(@NotNull StoryMediaFragment mediaFragment);

    void inject(@NotNull StoryPollFragment pollFragment);
}
