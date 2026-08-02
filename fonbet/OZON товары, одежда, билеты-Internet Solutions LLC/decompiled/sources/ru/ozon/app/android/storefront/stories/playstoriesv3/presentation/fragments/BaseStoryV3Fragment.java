package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import Bc.r;
import Hs.c;
import Hs.d;
import Hs.e;
import Mc.a;
import Sc.InterfaceC4008j;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.ComponentCallbacksC5392m;
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
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.BaseStoryV3ViewModel;
import ru.ozon.app.android.storefront.stories.story.presentation.blur.StoriesBlur;
import ru.ozon.app.android.storefront.stories.story.presentation.layoutstrategy.v3.LayoutV3Strategy;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b!\u0018\u0000 =*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000e\u0010\u0005J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0005J\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0005J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0005J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0005J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u0006*\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0005R$\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020%8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020%8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R$\u0010-\u001a\u0004\u0018\u00010,8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/BaseStoryV3Fragment;", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/BaseStoryV3ViewModel;", "T", "Landroidx/fragment/app/m;", "<init>", "()V", "", "attachClickableLayoutListener", "detachClickableLayoutListener", "trackVideoWatched", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "startStory", "restartStory", "pauseStory", "resetStory", "closeStory", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "getTransformation", "()Ljava/util/List;", "Landroid/widget/ImageView;", "Landroid/graphics/Bitmap;", "bitmap", "setBlurredBackground", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "lockOrientationIfNeed", "unlockOrientationIfNeed", "viewModel", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/BaseStoryV3ViewModel;", "getViewModel", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/BaseStoryV3ViewModel;", "setViewModel", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/BaseStoryV3ViewModel;)V", "", "isTablet$delegate", "LSc/j;", "isTablet", "()Z", "isSmallPhone$delegate", "isSmallPhone", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "layoutStrategy", "Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "getLayoutStrategy", "()Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;", "setLayoutStrategy", "(Lru/ozon/app/android/storefront/stories/story/presentation/layoutstrategy/v3/LayoutV3Strategy;)V", "Lnc/b;", "disposable", "Lnc/b;", "Lru/ozon/app/android/storefront/stories/story/presentation/blur/StoriesBlur;", "storiesBlur", "Lru/ozon/app/android/storefront/stories/story/presentation/blur/StoriesBlur;", "", "getOrientation", "()I", "orientation", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseStoryV3Fragment<T extends BaseStoryV3ViewModel> extends ComponentCallbacksC5392m {
    private InterfaceC8487b disposable;
    private LayoutV3Strategy layoutStrategy;
    private T viewModel;

    @NotNull
    protected static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: isTablet$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isTablet = LazyUtilsKt.unsafeLazy(new BaseStoryV3Fragment$isTablet$2(this));

    /* renamed from: isSmallPhone$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isSmallPhone = LazyUtilsKt.unsafeLazy(new BaseStoryV3Fragment$isSmallPhone$2(this));

    @NotNull
    private final StoriesBlur storiesBlur = new StoriesBlur(5.0f, 25.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/BaseStoryV3Fragment$Companion;", "", "<init>", "()V", "BLUR_RADIUS", "", "BLUR_SAMPLING", "SCREEN_RATIO_THRESHOLD", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void lockOrientationIfNeed() {
        if (isTablet()) {
            requireActivity().setRequestedOrientation(14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap setBlurredBackground$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Bitmap) function1.invoke(p02);
    }

    private final void unlockOrientationIfNeed() {
        if (isTablet()) {
            requireActivity().setRequestedOrientation(13);
        }
    }

    public abstract void attachClickableLayoutListener();

    public final void closeStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.closeStory();
        }
    }

    public abstract void detachClickableLayoutListener();

    protected final LayoutV3Strategy getLayoutStrategy() {
        return this.layoutStrategy;
    }

    protected final int getOrientation() {
        return getResources().getConfiguration().orientation;
    }

    @NotNull
    protected final List<ImageTransformation> getTransformation() {
        return C7714v.a0(ImageTransformation.CenterCrop.INSTANCE);
    }

    protected final T getViewModel() {
        return this.viewModel;
    }

    protected final boolean isSmallPhone() {
        return ((Boolean) this.isSmallPhone.getValue()).booleanValue();
    }

    protected final boolean isTablet() {
        return ((Boolean) this.isTablet.getValue()).booleanValue();
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

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        super.onStart();
        lockOrientationIfNeed();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onStop() {
        super.onStop();
        unlockOrientationIfNeed();
    }

    public final void pauseStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.pauseStory();
        }
    }

    public final void resetStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.resetStory();
        }
    }

    public final void restartStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.restartStory();
        }
    }

    protected final void setBlurredBackground(@NotNull ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        int i11 = 6;
        this.disposable = new r(y.f(bitmap), new c(new BaseStoryV3Fragment$setBlurredBackground$1(this), 6)).j(a.a()).g(C8125a.a()).h(new d(new BaseStoryV3Fragment$setBlurredBackground$2(imageView), i11), new e(new BaseStoryV3Fragment$setBlurredBackground$3(imageView), i11));
    }

    protected final void setLayoutStrategy(LayoutV3Strategy layoutV3Strategy) {
        this.layoutStrategy = layoutV3Strategy;
    }

    protected final void setViewModel(T t2) {
        this.viewModel = t2;
    }

    public final void startStory() {
        T t2 = this.viewModel;
        if (t2 != null) {
            t2.startStory();
        }
    }

    public abstract void trackVideoWatched();
}
