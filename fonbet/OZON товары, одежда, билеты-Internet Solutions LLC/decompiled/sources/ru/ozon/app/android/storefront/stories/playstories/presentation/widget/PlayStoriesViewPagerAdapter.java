package ru.ozon.app.android.storefront.stories.playstories.presentation.widget;

import Z4.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryMoleculeFragmentFactory;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewPagerAdapter;", "LZ4/a;", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "items", "", "span", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "factory", "Landroidx/fragment/app/G;", "fragmentManager", "Landroidx/lifecycle/v;", "lifecycle", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;Landroidx/fragment/app/G;Landroidx/lifecycle/v;)V", "getItemCount", "()I", "position", "Landroidx/fragment/app/m;", "createFragment", "(I)Landroidx/fragment/app/m;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Integer;", "getSpan", "()Ljava/lang/Integer;", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "getFactory", "()Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "Landroidx/fragment/app/G;", "getFragmentManager", "()Landroidx/fragment/app/G;", "Landroidx/lifecycle/v;", "getLifecycle", "()Landroidx/lifecycle/v;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesViewPagerAdapter extends a {

    @NotNull
    private final StoryMoleculeFragmentFactory factory;

    @NotNull
    private final G fragmentManager;

    @NotNull
    private final List<StoryCommonMolecule> items;

    @NotNull
    private final AbstractC5434v lifecycle;
    private final Integer span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayStoriesViewPagerAdapter(@NotNull List<StoryCommonMolecule> items, Integer num, @NotNull StoryMoleculeFragmentFactory factory, @NotNull G fragmentManager, @NotNull AbstractC5434v lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.items = items;
        this.span = num;
        this.factory = factory;
        this.fragmentManager = fragmentManager;
        this.lifecycle = lifecycle;
    }

    @Override // Z4.a
    @NotNull
    public ComponentCallbacksC5392m createFragment(int position) {
        return this.factory.create(this.items.get(position), this.span);
    }

    @NotNull
    public final G getFragmentManager() {
        return this.fragmentManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }
}
