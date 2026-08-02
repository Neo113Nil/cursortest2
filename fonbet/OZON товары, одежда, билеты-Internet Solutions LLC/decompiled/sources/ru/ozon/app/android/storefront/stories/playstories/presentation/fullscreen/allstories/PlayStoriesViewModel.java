package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import a00.C4911f;
import a00.h;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H&¢\u0006\u0004\b\u001a\u0010\u0018R&\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001f¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesViewModel;", "", "", "link", "", "bind", "(Ljava/lang/String;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "initComposerWorkAround", "(Landroidx/lifecycle/J;La00/h;La00/f;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "currentStoryPosition", "onCloseClicked", "(I)V", "position", "storyIsViewed", "Landroidx/lifecycle/P;", "Lkotlin/Pair;", "Lru/ozon/app/android/storefront/stories/playstories/data/PlayStoriesVO;", "getStories", "()Landroidx/lifecycle/P;", "stories", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/ViewedStories;", "getCloseEvent", "closeEvent", "Ljava/lang/Void;", "getForceClose", "forceClose", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlayStoriesViewModel {
    void bind(@NotNull String link);

    @NotNull
    P<ViewedStories> getCloseEvent();

    @NotNull
    P<Void> getForceClose();

    @NotNull
    P<Pair<PlayStoriesVO, Integer>> getStories();

    void handleAction(@NotNull AtomAction atomAction);

    void initComposerWorkAround(@NotNull J lifecycleOwner, @NotNull h viewModelOwnerProvider, @NotNull C4911f ownerContainer);

    void onCloseClicked(int currentStoryPosition);

    void storyIsViewed(int position);
}
