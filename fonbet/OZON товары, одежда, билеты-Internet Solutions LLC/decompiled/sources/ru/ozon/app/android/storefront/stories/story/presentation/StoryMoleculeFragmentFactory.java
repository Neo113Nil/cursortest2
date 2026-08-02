package ru.ozon.app.android.storefront.stories.story.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "", "create", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "molecule", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "span", "", "(Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface StoryMoleculeFragmentFactory {
    @NotNull
    BaseStoryFragment<?> create(@NotNull StoryCommonMolecule molecule, Integer span);
}
