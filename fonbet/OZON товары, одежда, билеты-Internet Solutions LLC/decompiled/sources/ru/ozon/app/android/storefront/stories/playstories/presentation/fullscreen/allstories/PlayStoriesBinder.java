package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import a00.C4911f;
import a00.h;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.playstories.data.PlayStoriesVO;
import ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesBinder;
import ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u000eJ\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesBinder;", "", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesViewModel;", "viewModel", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouter;", "router", "<init>", "(Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesViewModel;Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouter;)V", "", "closeWithoutTransition", "()V", "", "currentPosition", "onCloseClicked", "(I)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "bindLifecycle", "(Landroidx/lifecycle/J;La00/h;La00/f;)V", "Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder;", "viewHolder", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoryType;", "dataSourceType", "init", "(Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder;Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoryType;)V", "", "link", "bind", "(Ljava/lang/String;)V", "onBackPressed", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "position", "onStoryViewed", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesViewModel;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouter;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoryType;", "getDataSourceType", "()Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoryType;", "setDataSourceType", "(Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoryType;)V", "Lru/ozon/app/android/storefront/stories/playstories/presentation/widget/PlayStoriesViewHolder;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesBinder {

    @NotNull
    private StoryType dataSourceType;

    @NotNull
    private final StoriesRouter router;
    private PlayStoriesViewHolder viewHolder;

    @NotNull
    private final PlayStoriesViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryType.values().length];
            try {
                iArr[StoryType.FROM_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryType.FROM_LINK_WITHOUT_TRANSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PlayStoriesBinder(@NotNull PlayStoriesViewModel viewModel, @NotNull StoriesRouter router) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.viewModel = viewModel;
        this.router = router;
        this.dataSourceType = StoryType.SET_OF_STORIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLifecycle$lambda$0(PlayStoriesBinder playStoriesBinder, Pair pair) {
        if (((PlayStoriesVO) pair.e()).getStories().isEmpty()) {
            playStoriesBinder.router.close();
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[playStoriesBinder.dataSourceType.ordinal()];
        if (i11 == 1) {
            PlayStoriesViewHolder playStoriesViewHolder = playStoriesBinder.viewHolder;
            if (playStoriesViewHolder != null) {
                playStoriesViewHolder.bind((PlayStoriesVO) pair.e(), (Integer) pair.f());
                return;
            } else {
                Intrinsics.n("viewHolder");
                throw null;
            }
        }
        if (i11 != 2) {
            return;
        }
        PlayStoriesViewHolder playStoriesViewHolder2 = playStoriesBinder.viewHolder;
        if (playStoriesViewHolder2 != null) {
            playStoriesViewHolder2.bind((PlayStoriesVO) pair.e(), (Integer) pair.f());
        } else {
            Intrinsics.n("viewHolder");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithoutTransition() {
        this.router.close();
    }

    private final void onCloseClicked(int currentPosition) {
        this.viewModel.onCloseClicked(currentPosition);
    }

    public final void bind(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.viewModel.bind(link);
        this.router.setOpenScreenStoryPosition(0);
    }

    public final void bindLifecycle(@NotNull J lifecycleOwner, @NotNull h viewModelOwnerProvider, @NotNull C4911f ownerContainer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        this.viewModel.initComposerWorkAround(lifecycleOwner, viewModelOwnerProvider, ownerContainer);
        this.viewModel.getStories().observe(lifecycleOwner, new W() { // from class: dK.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                PlayStoriesBinder.bindLifecycle$lambda$0(PlayStoriesBinder.this, (Pair) obj);
            }
        });
        this.viewModel.getCloseEvent().observe(lifecycleOwner, new PlayStoriesBinder$sam$androidx_lifecycle_Observer$0(new PlayStoriesBinder$bindLifecycle$2(this)));
        this.viewModel.getForceClose().observe(lifecycleOwner, new PlayStoriesBinder$sam$androidx_lifecycle_Observer$0(new PlayStoriesBinder$bindLifecycle$3(this)));
    }

    public final void handleAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.viewModel.handleAction(action);
    }

    public final void init(@NotNull PlayStoriesViewHolder viewHolder, @NotNull StoryType dataSourceType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dataSourceType, "dataSourceType");
        this.viewHolder = viewHolder;
        this.dataSourceType = dataSourceType;
    }

    public final void onBackPressed(int currentPosition) {
        PlayStoriesViewHolder playStoriesViewHolder = this.viewHolder;
        if (playStoriesViewHolder != null) {
            if (playStoriesViewHolder == null) {
                Intrinsics.n("viewHolder");
                throw null;
            }
            playStoriesViewHolder.onCloseClicked();
        }
        onCloseClicked(currentPosition);
    }

    public final void onStoryViewed(int position) {
        this.viewModel.storyIsViewed(position);
    }
}
