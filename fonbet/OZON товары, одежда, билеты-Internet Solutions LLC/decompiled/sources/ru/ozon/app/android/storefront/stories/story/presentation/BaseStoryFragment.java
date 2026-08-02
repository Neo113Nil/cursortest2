package ru.ozon.app.android.storefront.stories.story.presentation;

import B90.C2612n;
import BY.i;
import Mc.a;
import Ql.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.stories.story.data.Alignment;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.blur.StoriesBlur;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.LayoutStrategy;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001S\b'\u0018\u0000 \\*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\\B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u0005J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0005J\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0005J\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0005J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u0005J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\u0005J\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u0005J\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\b\u0010)\u001a\u0004\u0018\u00010(H\u0004¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020\u0006*\u00020.2\b\u00100\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0005R$\u00104\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010$R$\u00109\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001b\u0010B\u001a\u00020?8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020D8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR\"\u0010N\u001a\u00020D8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010F\u001a\u0004\bO\u0010H\"\u0004\bP\u0010JR\u0018\u0010Q\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment;", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryViewModel;", "T", "Landroidx/fragment/app/m;", "<init>", "()V", "", "attachClickableLayoutListener", "detachClickableLayoutListener", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "provideLayoutStrategy", "()Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "updateImageSize", "onCloseStoryScreen", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", "onTransitionStart", "onStorySwiped", "trackVideoWatched", "startStory", "restartStory", "pauseStory", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryCallback;", "newStoryCallback", "setupStoryCallback", "(Lru/ozon/app/android/storefront/stories/story/presentation/StoryCallback;)V", "removeStoryCallback", "attachTransitionListener", "detachTransitionListener", "Lru/ozon/app/android/storefront/stories/story/data/Alignment;", "alignment", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "getTransformations", "(Lru/ozon/app/android/storefront/stories/story/data/Alignment;)Ljava/util/List;", "Landroid/widget/ImageView;", "Landroid/graphics/Bitmap;", "bitmap", "setBlurredBackground", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "updateLayout", "storyCallback", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryCallback;", "getStoryCallback", "()Lru/ozon/app/android/storefront/stories/story/presentation/StoryCallback;", "setStoryCallback", "viewModel", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryViewModel;", "getViewModel", "()Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryViewModel;", "setViewModel", "(Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryViewModel;)V", "", "isTablet$delegate", "LSc/j;", "isTablet", "()Z", "", "insetTop", "I", "getInsetTop", "()I", "setInsetTop", "(I)V", "insetBottom", "getInsetBottom", "setInsetBottom", "insetRight", "getInsetRight", "setInsetRight", "layoutStrategy", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/LayoutStrategy;", "ru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment$transitionListener$1", "transitionListener", "Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment$transitionListener$1;", "Lnc/b;", "disposable", "Lnc/b;", "Lru/ozon/app/android/storefront/stories/story/presentation/blur/StoriesBlur;", "storiesBlur", "Lru/ozon/app/android/storefront/stories/story/presentation/blur/StoriesBlur;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseStoryFragment<T extends BaseStoryViewModel> extends ComponentCallbacksC5392m {
    private InterfaceC8487b disposable;
    private int insetBottom;
    private int insetRight;
    private int insetTop;
    private LayoutStrategy layoutStrategy;
    private StoryCallback storyCallback;
    private T viewModel;

    @NotNull
    protected static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: isTablet$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isTablet = k.b(new BaseStoryFragment$isTablet$2(this));

    @NotNull
    private BaseStoryFragment$transitionListener$1 transitionListener = new Transition.TransitionListener(this) { // from class: ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment$transitionListener$1
        final /* synthetic */ BaseStoryFragment<T> this$0;

        {
            this.this$0 = this;
        }

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
            this.this$0.onTransitionStart();
        }
    };

    @NotNull
    private final StoriesBlur storiesBlur = new StoriesBlur(5.0f, 25.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/BaseStoryFragment$Companion;", "", "<init>", "()V", "BLUR_RADIUS", "", "BLUR_SAMPLING", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 onViewCreated$lambda$0(BaseStoryFragment baseStoryFragment, View view, C5353y0 c5353y0) {
        d a11 = c.a(view, "<unused var>", c5353y0, "insets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        baseStoryFragment.insetTop = a11.f42127b;
        baseStoryFragment.insetBottom = a11.f42129d;
        baseStoryFragment.insetRight = a11.f42128c;
        baseStoryFragment.updateLayout();
        return c5353y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap setBlurredBackground$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Bitmap) function1.invoke(p02);
    }

    private final void updateLayout() {
        LayoutStrategy layoutStrategy = this.layoutStrategy;
        if (layoutStrategy != null) {
            layoutStrategy.updateLayout(this.insetRight, this.insetTop, this.insetBottom, requireContext().getResources().getConfiguration().orientation);
        }
        updateImageSize();
    }

    public abstract void attachClickableLayoutListener();

    public final void attachTransitionListener() {
        Window window;
        Transition enterTransition;
        r activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (enterTransition = window.getEnterTransition()) == null) {
            return;
        }
        enterTransition.addListener(this.transitionListener);
    }

    public abstract void detachClickableLayoutListener();

    public final void detachTransitionListener() {
        Window window;
        Transition enterTransition;
        r activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (enterTransition = window.getEnterTransition()) == null) {
            return;
        }
        enterTransition.removeListener(this.transitionListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final StoryCallback getStoryCallback() {
        return this.storyCallback;
    }

    @NotNull
    protected final List<ImageTransformation> getTransformations(Alignment alignment) {
        int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        return C7714v.a0(new ImageTransformation.FitWidthCropHeight(i11 != 1 ? i11 != 2 ? ImageTransformation.FitWidthCropHeight.CropType.CENTER : ImageTransformation.FitWidthCropHeight.CropType.BOTTOM : ImageTransformation.FitWidthCropHeight.CropType.TOP));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getViewModel() {
        return this.viewModel;
    }

    protected final boolean isTablet() {
        return ((Boolean) this.isTablet.getValue()).booleanValue();
    }

    public abstract void onCloseStoryScreen();

    @Override // androidx.fragment.app.ComponentCallbacksC5392m, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateLayout();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.layoutStrategy = null;
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        detachClickableLayoutListener();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        attachClickableLayoutListener();
    }

    public void onStorySwiped() {
    }

    public void onTransitionStart() {
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.layoutStrategy = provideLayoutStrategy();
        updateLayout();
        Y.J(view, new C2612n(this));
        ViewExtKt.requestApplyInsetsWhenAttached(view);
    }

    public final void pauseStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.pauseStory();
        }
    }

    @NotNull
    public abstract LayoutStrategy provideLayoutStrategy();

    public final void removeStoryCallback() {
        this.storyCallback = null;
    }

    public final void restartStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.restartStory();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setBlurredBackground(@NotNull ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.disposable = new Bc.r(y.f(bitmap), new i(new BaseStoryFragment$setBlurredBackground$1(this), 6)).j(a.a()).g(C8125a.a()).h(new H2.c(new BaseStoryFragment$setBlurredBackground$2(imageView), 8), new AJ.a(new BaseStoryFragment$setBlurredBackground$3(imageView), 5));
    }

    protected final void setViewModel(T t2) {
        this.viewModel = t2;
    }

    public final void setupStoryCallback(@NotNull StoryCallback newStoryCallback) {
        Intrinsics.checkNotNullParameter(newStoryCallback, "newStoryCallback");
        this.storyCallback = newStoryCallback;
    }

    public final void startStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.startStory();
        }
    }

    public void trackVideoWatched() {
    }

    public abstract void updateImageSize();
}
