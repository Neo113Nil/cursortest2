package ru.ozon.app.android.storefront.stories.story.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;
import ru.ozon.app.android.storefront.stories.story.data.StoryMedia;
import ru.ozon.app.android.storefront.stories.story.data.StoryType;
import ru.ozon.app.android.storefront.stories.story.data.StoryWithPoll;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactoryImpl;", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "<init>", "()V", "create", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "molecule", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "span", "", "(Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryMoleculeFragmentFactoryImpl implements StoryMoleculeFragmentFactory {
    @Override // ru.ozon.app.android.storefront.stories.story.presentation.StoryMoleculeFragmentFactory
    @NotNull
    public BaseStoryFragment<?> create(@NotNull StoryCommonMolecule molecule, Integer span) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        StoryType data = molecule.getData();
        if (data instanceof StoryMedia) {
            return StoryMediaFragment.INSTANCE.newInstance(molecule, span);
        }
        if (data instanceof StoryWithPoll) {
            return StoryPollFragment.INSTANCE.newInstance(molecule, span);
        }
        throw new o();
    }
}
