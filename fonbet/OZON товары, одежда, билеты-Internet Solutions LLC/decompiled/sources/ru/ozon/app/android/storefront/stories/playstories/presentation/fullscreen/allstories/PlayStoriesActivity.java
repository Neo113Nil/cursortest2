package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import E.r;
import EZ.h;
import Pc.a;
import Sc.InterfaceC4008j;
import a00.C4906a;
import a00.C4911f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.g;
import androidx.core.app.c;
import androidx.core.app.u;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.di.ComposerFragmentComponentDependencies;
import ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$1;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$2;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.databinding.ActivityStoriesBinding;
import ru.ozon.app.android.storefront.stories.playstories.core.NoStoryLinkException;
import ru.ozon.app.android.storefront.stories.playstories.core.NoStoryTypeException;
import ru.ozon.app.android.storefront.stories.playstories.di.DaggerPlayStoriesComponent;
import ru.ozon.app.android.storefront.stories.playstories.di.PlayStoriesComponent;
import ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewHolder;
import ru.ozon.app.android.storefront.stories.playstories.presentation.widget.PlayStoriesViewPagerAdapter;
import ru.ozon.app.android.storefront.stories.story.data.Alignment;
import ru.ozon.app.android.storefront.stories.story.data.StoryCommonMolecule;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryMoleculeFragmentFactory;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryMoleculeFragmentFactoryImpl;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import yZ.f;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesActivity;", "Landroidx/appcompat/app/g;", "LyZ/f;", "<init>", "()V", "", "preloadFirstImage", "configureSystemUi", "bindLink", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "LPc/a;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesViewModelImpl;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "setViewModelProvider", "(LPc/a;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "storyMoleculeFragmentFactory", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryMoleculeFragmentFactory;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouter;", "storiesRouter$delegate", "LSc/j;", "getStoriesRouter", "()Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRouter;", "storiesRouter", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesBinder;", "binder", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesBinder;", "Lru/ozon/app/android/storefront/databinding/ActivityStoriesBinding;", "binding", "Lru/ozon/app/android/storefront/databinding/ActivityStoriesBinding;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesActivity extends g implements f {
    private static ImageSize imageSize;
    private PlayStoriesBinder binder;
    private ActivityStoriesBinding binding;
    public h navigatorHolder;
    public GZ.g ozonRouter;
    public a<PlayStoriesViewModelImpl> viewModelProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int requestCode = Math.abs(20540514) >> 16;

    @NotNull
    private final StoryMoleculeFragmentFactory storyMoleculeFragmentFactory = new StoryMoleculeFragmentFactoryImpl();

    /* renamed from: storiesRouter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j storiesRouter = LazyUtilsKt.unsafeLazy(new PlayStoriesActivity$storiesRouter$2(this));

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J9\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesActivity$Companion;", "", "<init>", "()V", "KEY_STORIES", "", "KEY_SELECTED_STORY_INDEX", "THEME_ID", "STORIES_TYPE", "STORIES_LINK", "STORIES_FIRST_IMAGE_URL", "STORIES_FIRST_IMAGE_ALIGN", "requestCode", "", "imageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "getRequest", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRequest;", "context", "Landroid/content/Context;", "stories", "", "Lru/ozon/app/android/storefront/stories/story/data/StoryCommonMolecule;", "selectedStoryIndex", "preview", "Landroid/view/View;", "getLinkRequest", "link", "firstImageUrl", "firstImageAlign", "(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoriesRequest;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StoryType.values().length];
                try {
                    iArr[StoryType.FROM_LINK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
        
            if (r5 == null) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final StoriesRequest getLinkRequest(@NotNull Context context, @NotNull String link, View preview, String firstImageUrl, Integer firstImageAlign) {
            Bundle a11;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(link, "link");
            int themeId = context instanceof ThemeResIdProvider ? ((ThemeResIdProvider) context).getThemeId() : R$style.OzonTheme;
            StoryType storyType = preview != null ? StoryType.FROM_LINK : StoryType.FROM_LINK_WITHOUT_TRANSITION;
            Intent intent = new Intent(context, (Class<?>) PlayStoriesActivity.class);
            intent.putExtra("theme_id", themeId);
            intent.putExtra("key:stories_link", link);
            intent.putExtra("key:stories_type", storyType.name());
            intent.putExtra("key:first_image_url", firstImageUrl);
            intent.putExtra("key:first_image_align", firstImageAlign);
            Activity activity = (Activity) context;
            if (preview != null) {
                a11 = WhenMappings.$EnumSwitchMapping$0[storyType.ordinal()] == 1 ? c.b(activity, preview, preview.getTransitionName()).c() : d.a();
            }
            a11 = d.a();
            return new StoriesRequest(intent, PlayStoriesActivity.requestCode, a11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final StoriesRequest getRequest(@NotNull Context context, @NotNull List<StoryCommonMolecule> stories, int selectedStoryIndex, @NotNull View preview) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stories, "stories");
            Intrinsics.checkNotNullParameter(preview, "preview");
            int themeId = context instanceof ThemeResIdProvider ? ((ThemeResIdProvider) context).getThemeId() : R$style.OzonTheme;
            Intent intent = new Intent(context, (Class<?>) PlayStoriesActivity.class);
            intent.putParcelableArrayListExtra("key_stories", (ArrayList) stories);
            intent.putExtra("key_selected_story_index", selectedStoryIndex);
            intent.putExtra("theme_id", themeId);
            intent.putExtra("key:stories_type", "SET_OF_STORIES");
            c b11 = c.b((Activity) context, preview, preview.getTransitionName());
            Intrinsics.checkNotNullExpressionValue(b11, "makeSceneTransitionAnimation(...)");
            return new StoriesRequest(intent, PlayStoriesActivity.requestCode, b11.c());
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryType.values().length];
            try {
                iArr[StoryType.FROM_LINK_WITHOUT_TRANSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryType.FROM_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindLink() {
        String stringExtra = getIntent().getStringExtra("key:stories_link");
        if (stringExtra == null) {
            Lm0.a.f17149a.e(NoStoryLinkException.INSTANCE);
            finish();
            return;
        }
        PlayStoriesBinder playStoriesBinder = this.binder;
        if (playStoriesBinder != null) {
            playStoriesBinder.bind(stringExtra);
        } else {
            Intrinsics.n("binder");
            throw null;
        }
    }

    private final void configureSystemUi() {
        Window window = getWindow();
        window.setFlags(134217728, 134217728);
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
    }

    private final StoriesRouter getStoriesRouter() {
        return (StoriesRouter) this.storiesRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$6$lambda$5(ViewPager2 viewPager2) {
        viewPager2.b();
        viewPager2.c();
    }

    private final void preloadFirstImage() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("key:first_image_url");
        if (stringExtra == null) {
            return;
        }
        Alignment alignment = Alignment.BOTTOM;
        int intExtra = intent.getIntExtra("key:first_image_align", alignment.ordinal());
        ContextExtKt.loadAsBitmapInscribedSize(this, stringExtra, (r14 & 2) != 0 ? K.f71697a : C7714v.a0(new ImageTransformation.FitWidthCropHeight(intExtra == Alignment.TOP.ordinal() ? ImageTransformation.FitWidthCropHeight.CropType.TOP : intExtra == alignment.ordinal() ? ImageTransformation.FitWidthCropHeight.CropType.BOTTOM : ImageTransformation.FitWidthCropHeight.CropType.CENTER)), (r14 & 4) != 0 ? null : imageSize, (r14 & 8) != 0 ? LoadPriority.NORMAL : null, (r14 & 16) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : InscribedUrlProcessor.InscribedWidth.INSTANCE, (r14 & 32) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$1.INSTANCE : null, (r14 & 64) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$2.INSTANCE : null);
    }

    @NotNull
    public final h getNavigatorHolder() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    @NotNull
    public final GZ.g getOzonRouter() {
        GZ.g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
        throw null;
    }

    @NotNull
    public final a<PlayStoriesViewModelImpl> getViewModelProvider() {
        a<PlayStoriesViewModelImpl> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        PlayStoriesBinder playStoriesBinder = this.binder;
        if (playStoriesBinder == null) {
            Intrinsics.n("binder");
            throw null;
        }
        ActivityStoriesBinding activityStoriesBinding = this.binding;
        if (activityStoriesBinding != null) {
            playStoriesBinder.onBackPressed(activityStoriesBinding.storiesWidgetVP.f());
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.g, androidx.activity.ActivityC5043j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ActivityStoriesBinding activityStoriesBinding = this.binding;
        if (activityStoriesBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ViewPager2 viewPager2 = activityStoriesBinding.storiesWidgetVP;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            RecyclerView.g adapter = recyclerView.getAdapter();
            if (adapter != null) {
                if (viewPager2.f() == adapter.getCardsCount() - 1) {
                    recyclerView.scrollBy(-1, 0);
                }
            }
            recyclerView.scrollBy(1, 0);
        }
        viewPager2.post(new r(viewPager2, 4));
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        StoryType valueOf;
        setTheme(getIntent().getIntExtra("theme_id", R$style.OzonTheme));
        configureSystemUi();
        PlayStoriesComponent.Factory factory = DaggerPlayStoriesComponent.factory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        if (ComposerFragmentComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerFragmentComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, ComposerFragmentComponentDependencies.class).getDependencyStorage();
        if (ComposerFragmentComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerFragmentComponentDependencies is not DiComponent");
        }
        ComposerFragmentComponentDependencies composerFragmentComponentDependencies = (ComposerFragmentComponentDependencies) dependencyStorage2.b(ComposerFragmentComponentDependencies.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        factory.create(navigationComponentApi, composerFragmentComponentDependencies, (ContextComponentDependencies) dependencyStorage3.b(ContextComponentDependencies.class)).inject(this);
        super.onCreate(savedInstanceState);
        setRequestedOrientation(14);
        postponeEnterTransition();
        ActivityStoriesBinding inflate = ActivityStoriesBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(inflate.getConstraintLayout());
        Object a11 = new z0(this, new z0.c() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PlayStoriesViewModelImpl playStoriesViewModelImpl = PlayStoriesActivity.this.getViewModelProvider().get();
                Intrinsics.g(playStoriesViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return playStoriesViewModelImpl;
            }
        }).a(PlayStoriesViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        this.binder = new PlayStoriesBinder((PlayStoriesViewModel) a11, getStoriesRouter());
        yZ.h.a(new PlayStoriesNavigator(this), getNavigatorHolder(), this);
        imageSize = new ImageSize(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - ResourceExtKt.getStatusBarHeight(this));
        String stringExtra = getIntent().getStringExtra("key:stories_type");
        if (stringExtra == null || (valueOf = StoryType.valueOf(stringExtra)) == null) {
            Lm0.a.f17149a.e(NoStoryTypeException.INSTANCE);
            finish();
            return;
        }
        ActivityStoriesBinding activityStoriesBinding = this.binding;
        if (activityStoriesBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout stubStoryContainer = activityStoriesBinding.stubStoryContainer;
        Intrinsics.checkNotNullExpressionValue(stubStoryContainer, "stubStoryContainer");
        StoryMoleculeFragmentFactory storyMoleculeFragmentFactory = this.storyMoleculeFragmentFactory;
        G supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC5434v lifecycle = getLifecycle();
        PlayStoriesBinder playStoriesBinder = this.binder;
        if (playStoriesBinder == null) {
            Intrinsics.n("binder");
            throw null;
        }
        PlayStoriesViewHolder playStoriesViewHolder = new PlayStoriesViewHolder(stubStoryContainer, storyMoleculeFragmentFactory, supportFragmentManager, lifecycle, playStoriesBinder);
        PlayStoriesBinder playStoriesBinder2 = this.binder;
        if (playStoriesBinder2 == null) {
            Intrinsics.n("binder");
            throw null;
        }
        playStoriesBinder2.init(playStoriesViewHolder, valueOf);
        PlayStoriesBinder playStoriesBinder3 = this.binder;
        if (playStoriesBinder3 == null) {
            Intrinsics.n("binder");
            throw null;
        }
        playStoriesBinder3.bindLifecycle(this, new C4906a(this), new C4911f(this));
        int i11 = WhenMappings.$EnumSwitchMapping$0[valueOf.ordinal()];
        if (i11 == 1 || i11 == 2) {
            preloadFirstImage();
            if (valueOf == StoryType.FROM_LINK) {
                final Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
                Intrinsics.checkNotNullExpressionValue(sharedElementEnterTransition, "getSharedElementEnterTransition(...)");
                sharedElementEnterTransition.addListener(new Transition.TransitionListener() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity$onCreate$$inlined$doOnStart$1
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        sharedElementEnterTransition.removeListener(this);
                        this.bindLink();
                    }
                });
                startPostponedEnterTransition();
            } else {
                bindLink();
            }
        }
        setEnterSharedElementCallback(new u() { // from class: ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories.PlayStoriesActivity$onCreate$3
            private final void stubSharedContainer(List<String> names, Map<String, View> sharedElements) {
                ActivityStoriesBinding activityStoriesBinding2;
                if (names == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (sharedElements == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str = (String) C7714v.M(names);
                if (str != null) {
                    activityStoriesBinding2 = PlayStoriesActivity.this.binding;
                    if (activityStoriesBinding2 != null) {
                        sharedElements.put(str, activityStoriesBinding2.stubStoryContainer);
                    } else {
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
            }

            @Override // androidx.core.app.u
            public void onMapSharedElements(List<String> names, Map<String, View> sharedElements) {
                ActivityStoriesBinding activityStoriesBinding2;
                G fragmentManager;
                activityStoriesBinding2 = PlayStoriesActivity.this.binding;
                ComponentCallbacksC5392m componentCallbacksC5392m = null;
                if (activityStoriesBinding2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (activityStoriesBinding2.storiesWidgetVP.e() == null) {
                    stubSharedContainer(names, sharedElements);
                    return;
                }
                RecyclerView.g e11 = activityStoriesBinding2.storiesWidgetVP.e();
                PlayStoriesViewPagerAdapter playStoriesViewPagerAdapter = e11 instanceof PlayStoriesViewPagerAdapter ? (PlayStoriesViewPagerAdapter) e11 : null;
                if (playStoriesViewPagerAdapter != null && (fragmentManager = playStoriesViewPagerAdapter.getFragmentManager()) != null) {
                    componentCallbacksC5392m = fragmentManager.g0("f" + activityStoriesBinding2.storiesWidgetVP.f());
                }
                if (componentCallbacksC5392m == null || !componentCallbacksC5392m.isAdded()) {
                    stubSharedContainer(names, sharedElements);
                    return;
                }
                View view = componentCallbacksC5392m.getView();
                if (view == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                StoryItemClickableLayout storyItemClickableLayout = (StoryItemClickableLayout) view.findViewById(R$id.rootSICL);
                if (names == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (sharedElements == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (storyItemClickableLayout == null) {
                    LoggerExtKt.sendNonFatal$default(null, "Incorrect stories animation. Fragment transition view is null", null, null, 13, null);
                    stubSharedContainer(names, sharedElements);
                } else {
                    String str = (String) C7714v.M(names);
                    if (str != null) {
                        sharedElements.put(str, storyItemClickableLayout);
                    }
                }
            }
        });
    }
}
