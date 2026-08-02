package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import A00.a;
import Sc.r;
import Sc.s;
import U7.d;
import W10.c;
import WZ.l;
import android.content.Context;
import android.view.View;
import androidx.core.view.Y;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncModel;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GallerySyncViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.core.GalleryV5PositionUpdateKey;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5Adapter;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5LeftAlignSnapHelper;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.GalleryV5SimpleStateView;
import ru.ozon.app.android.pdpvideomolecule.data.PlayerState;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u00ad\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001_\b!\u0018\u0000 b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001bB_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0004¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010\"J)\u0010(\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001f\u0010*J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0014H\u0004¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u001e2\u0006\u00103\u001a\u0002022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u001e2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000202H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001eH\u0002¢\u0006\u0004\b;\u0010\"J\u000f\u0010<\u001a\u00020\u001eH\u0002¢\u0006\u0004\b<\u0010\"J\u000f\u0010=\u001a\u00020\u001eH\u0002¢\u0006\u0004\b=\u0010\"J\u0017\u0010?\u001a\u00020\u00142\u0006\u0010>\u001a\u00020.H\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010DR(\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e\u0018\u00010E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR&\u0010J\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u001e0E8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\"\u0010L\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bL\u0010N\"\u0004\bO\u0010-R\"\u0010P\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010M\u001a\u0004\bP\u0010N\"\u0004\bQ\u0010-R\"\u0010R\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bR\u0010N\"\u0004\bS\u0010-R\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010MR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/BaseGalleryV5ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5SimpleStateView;", "galleryView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "preCreationConfig", "Landroid/view/View;", "containerView", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayerProvider", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "gallerySyncViewModel", "", "isTextureViewEnabled", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "onboardingViewModel", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5SimpleStateView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;Landroid/view/View;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;ZLru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;)V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;Ll20/d;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;)V", "isFoldable", "setFoldable", "(Z)V", "", "galleryPosition", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;Ljava/lang/Integer;)V", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "syncItem", "updateSyncItem", "(Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "itemModel", "onItemClick", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;)V", "removeLifeCycleObserver", "updateVideoItemsIfFoldableWindowState", "saveScrollPosition", "position", "isViewFullVisible", "(I)Z", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5SimpleStateView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncViewModel;", "Lkotlin/Function1;", "onGalleryElementsVisible", "Lkotlin/jvm/functions/Function1;", "getOnGalleryElementsVisible", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "getActionHandler", "isVideoFoldable", "Z", "()Z", "setVideoFoldable", "isScrollAfterFoldable", "setScrollAfterFoldable", "isResumedState", "setResumedState", "afterRefresh", "afterSwipeRefresh", "", "galleryId", "Ljava/lang/String;", "Landroidx/lifecycle/G;", "lifecycleObserver", "Landroidx/lifecycle/G;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5Adapter;", "galleryAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5Adapter;", "ru/ozon/app/android/pdp/widgets/galleryV5/presentation/BaseGalleryV5ViewHolder$smoothScroller$1", "smoothScroller", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/BaseGalleryV5ViewHolder$smoothScroller$1;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseGalleryV5ViewHolder extends k<GalleryV5VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private boolean afterRefresh;
    private boolean afterSwipeRefresh;

    @NotNull
    private final GalleryV5Adapter galleryAdapter;
    private String galleryId;

    @NotNull
    private final GallerySyncViewModel gallerySyncViewModel;

    @NotNull
    private final GalleryV5SimpleStateView galleryView;
    private boolean isResumedState;
    private boolean isScrollAfterFoldable;
    private boolean isVideoFoldable;

    @NotNull
    private final G lifecycleObserver;
    private final Function1<Boolean, Unit> onGalleryElementsVisible;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final BaseGalleryV5ViewHolder$smoothScroller$1 smoothScroller;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<a, Unit> {
        final /* synthetic */ GalleryV5OnboardingViewModel $onboardingViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GalleryV5OnboardingViewModel galleryV5OnboardingViewModel) {
            super(1);
            this.$onboardingViewModel = galleryV5OnboardingViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a aVar) {
            if (aVar instanceof a.u.c) {
                BaseGalleryV5ViewHolder.this.afterSwipeRefresh = true;
                setTargetPosition(0);
                RecyclerView.o layoutManager = BaseGalleryV5ViewHolder.this.galleryView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(BaseGalleryV5ViewHolder.this.smoothScroller);
                    return;
                }
                return;
            }
            if (aVar instanceof a.u.b) {
                BaseGalleryV5ViewHolder.this.galleryView.scrollToPosition(0);
                BaseGalleryV5ViewHolder.this.afterRefresh = true;
                if (((a.u.b) aVar).j() != null) {
                    this.$onboardingViewModel.resetShown();
                    return;
                }
                return;
            }
            if (!(aVar instanceof a.I)) {
                if ((aVar instanceof a.C2370k) && BaseGalleryV5ViewHolder.this.afterSwipeRefresh) {
                    BaseGalleryV5ViewHolder.this.galleryAdapter.resetVideoPositions();
                    BaseGalleryV5ViewHolder.this.afterSwipeRefresh = false;
                    return;
                }
                return;
            }
            if (((a.I) aVar).e() || !BaseGalleryV5ViewHolder.this.afterRefresh) {
                return;
            }
            GalleryV5SimpleStateView galleryV5SimpleStateView = BaseGalleryV5ViewHolder.this.galleryView;
            final BaseGalleryV5ViewHolder baseGalleryV5ViewHolder = BaseGalleryV5ViewHolder.this;
            int i11 = Y.f42258g;
            if (!galleryV5SimpleStateView.isLaidOut() || galleryV5SimpleStateView.isLayoutRequested()) {
                galleryV5SimpleStateView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder$1$invoke$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        if (BaseGalleryV5ViewHolder.this.isInVisibleBounds()) {
                            BaseGalleryV5ViewHolder.this.galleryAdapter.updateVideoItems(false);
                        }
                    }
                });
            } else if (baseGalleryV5ViewHolder.isInVisibleBounds()) {
                baseGalleryV5ViewHolder.galleryAdapter.updateVideoItems(false);
            }
            BaseGalleryV5ViewHolder.this.afterRefresh = false;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/BaseGalleryV5ViewHolder$Companion;", "", "<init>", "()V", "DEFAULT_POSITION", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
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
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BaseGalleryV5ViewHolder(GalleryV5SimpleStateView galleryV5SimpleStateView, ComposerReferences composerReferences, l lVar, GalleryV5PreCreationConfig galleryV5PreCreationConfig, View view, Function0 function0, SoundController soundController, GallerySyncViewModel gallerySyncViewModel, boolean z11, GalleryV5OnboardingViewModel galleryV5OnboardingViewModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(galleryV5SimpleStateView, composerReferences, lVar, galleryV5PreCreationConfig, (i11 & 16) != 0 ? galleryV5SimpleStateView : view, function0, soundController, gallerySyncViewModel, z11, galleryV5OnboardingViewModel);
    }

    private final void bindInternal(GalleryV5VO item, Integer galleryPosition) {
        this.galleryView.updateLayoutParams(item.getPreCreationConfig());
        this.galleryAdapter.submitList(item.getPreCreationConfig(), item.getItems(), new BaseGalleryV5ViewHolder$bindInternal$1(this, item, galleryPosition));
    }

    static /* synthetic */ void bindInternal$default(BaseGalleryV5ViewHolder baseGalleryV5ViewHolder, GalleryV5VO galleryV5VO, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindInternal");
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        baseGalleryV5ViewHolder.bindInternal(galleryV5VO, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isViewFullVisible(int position) {
        Boolean bool;
        RecyclerView.o layoutManager = this.galleryView.getLayoutManager();
        if (layoutManager != null) {
            View findViewByPosition = layoutManager.findViewByPosition(position);
            if (findViewByPosition != null) {
                bool = Boolean.valueOf(findViewByPosition.getLeft() >= 0 && findViewByPosition.getRight() <= layoutManager.getWidth());
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(BaseGalleryV5ViewHolder baseGalleryV5ViewHolder, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            baseGalleryV5ViewHolder.isResumedState = false;
            baseGalleryV5ViewHolder.galleryAdapter.updateVideoItems(true);
            baseGalleryV5ViewHolder.saveScrollPosition();
        } else if (i11 == 2) {
            baseGalleryV5ViewHolder.isResumedState = true;
            baseGalleryV5ViewHolder.galleryAdapter.updateVideoItems(!baseGalleryV5ViewHolder.isInVisibleBounds());
        } else {
            if (i11 != 3) {
                return;
            }
            baseGalleryV5ViewHolder.galleryView.setAdapter(null);
            baseGalleryV5ViewHolder.removeLifeCycleObserver();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(AtomAction action, GallerySyncModel itemModel) {
        if (itemModel.getItemPosition() == -1) {
            itemModel = GallerySyncModel.copy$default(itemModel, 0, null, 2, null);
        }
        String str = this.galleryId;
        if (str != null) {
            this.gallerySyncViewModel.putSyncItem(str, itemModel);
        }
        this.actionHandler.invoke(action);
    }

    private final void removeLifeCycleObserver() {
        d.c(this.refs).e(this.lifecycleObserver);
    }

    private final void saveScrollPosition() {
        Object a11;
        RecyclerView.o layoutManager = this.galleryView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int[] iArr = new int[2];
            try {
                r.Companion companion = r.INSTANCE;
                int itemCount = linearLayoutManager.getItemCount();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= itemCount) {
                        break;
                    }
                    View childAt = linearLayoutManager.getChildAt(i12);
                    if (childAt != null) {
                        childAt.getLocationInWindow(iArr);
                        int i13 = iArr[0];
                        if (i13 < getResources().getDisplayMetrics().widthPixels / 2 && i13 > 0) {
                            i11 = this.galleryView.getChildViewHolder(childAt).getAdapterPosition();
                            break;
                        }
                    }
                    i12++;
                }
                a11 = Integer.valueOf(i11);
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            r.Companion companion3 = r.INSTANCE;
            if (a11 instanceof r.b) {
                return;
            }
            this.refs.getController().update(new GalleryV5PositionUpdateKey(((Number) a11).intValue()));
        }
    }

    private final void updateSyncItem(GallerySyncModel syncItem, GalleryV5VO item) {
        GalleryV5VO.Item item2 = item.getItems().get(syncItem.getItemPosition());
        this.gallerySyncViewModel.removeSyncItem(item.getGalleryId());
        if (C7714v.P(item.getItems()) < syncItem.getItemPosition()) {
            bindInternal$default(this, item, null, 2, null);
            return;
        }
        if (syncItem.getVideoPosition() == null || !(item2 instanceof GalleryV5VO.Item.Video)) {
            bindInternal(item, Integer.valueOf(syncItem.getItemPosition()));
            return;
        }
        GalleryV5VO.Item.Video video = (GalleryV5VO.Item.Video) item2;
        GalleryV5VO.Item.Video copy$default = GalleryV5VO.Item.Video.copy$default(video, 0, 0L, 0, null, null, null, VideoMolecule.copy$default(video.getVideo(), null, null, false, PlayerState.copy$default(video.getVideo().getPlayerState(), syncItem.getVideoPosition().longValue(), null, false, false, 14, null), 7, null), null, false, null, 959, null);
        ArrayList W02 = C7714v.W0(item.getItems());
        W02.set(syncItem.getItemPosition(), copy$default);
        bindInternal(GalleryV5VO.copy$default(item, 0L, W02, null, null, null, null, null, null, null, 509, null), Integer.valueOf(syncItem.getItemPosition()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVideoItemsIfFoldableWindowState() {
        if (this.isVideoFoldable) {
            this.galleryAdapter.updateVideoItems(false);
            this.isVideoFoldable = false;
        }
    }

    @NotNull
    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    protected Function1<Boolean, Unit> getOnGalleryElementsVisible() {
        return this.onGalleryElementsVisible;
    }

    /* renamed from: isResumedState, reason: from getter */
    protected final boolean getIsResumedState() {
        return this.isResumedState;
    }

    /* renamed from: isScrollAfterFoldable, reason: from getter */
    protected final boolean getIsScrollAfterFoldable() {
        return this.isScrollAfterFoldable;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        if (this.afterRefresh) {
            return;
        }
        this.galleryAdapter.updateVideoItems(false);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        this.galleryAdapter.updateVideoItems(true);
    }

    protected final void setFoldable(boolean isFoldable) {
        this.isVideoFoldable = isFoldable;
        this.isScrollAfterFoldable = isFoldable;
    }

    protected final void setScrollAfterFoldable(boolean z11) {
        this.isScrollAfterFoldable = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v10, types: [ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder$smoothScroller$1] */
    public BaseGalleryV5ViewHolder(@NotNull GalleryV5SimpleStateView galleryView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GalleryV5PreCreationConfig preCreationConfig, @NotNull View containerView, @NotNull Function0<GalleryVideoPlayer> videoPlayerProvider, @NotNull SoundController soundController, @NotNull GallerySyncViewModel gallerySyncViewModel, boolean z11, @NotNull GalleryV5OnboardingViewModel onboardingViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(galleryView, "galleryView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(preCreationConfig, "preCreationConfig");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(videoPlayerProvider, "videoPlayerProvider");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(gallerySyncViewModel, "gallerySyncViewModel");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        this.galleryView = galleryView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.gallerySyncViewModel = gallerySyncViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        this.isResumedState = true;
        G g10 = new G() { // from class: aE.a
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                BaseGalleryV5ViewHolder.lifecycleObserver$lambda$0(BaseGalleryV5ViewHolder.this, j11, aVar);
            }
        };
        this.lifecycleObserver = g10;
        GalleryV5Adapter galleryV5Adapter = new GalleryV5Adapter(preCreationConfig, this, z11, galleryView.getPreCreationGalleryResources(), buildHandler, videoPlayerProvider, soundController, new BaseGalleryV5ViewHolder$galleryAdapter$1(this), tokenizedAnalytics, new BaseGalleryV5ViewHolder$galleryAdapter$2(this), new BaseGalleryV5ViewHolder$galleryAdapter$3(this), new BaseGalleryV5ViewHolder$galleryAdapter$4(this), refs);
        this.galleryAdapter = galleryV5Adapter;
        final Context context = getContext();
        this.smoothScroller = new androidx.recyclerview.widget.r(context) { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.BaseGalleryV5ViewHolder$smoothScroller$1
            @Override // androidx.recyclerview.widget.r
            protected int getHorizontalSnapPreference() {
                return -1;
            }
        };
        refs.getController().getEvents().observe(refs.getContainer().g(), new BaseGalleryV5ViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(onboardingViewModel)));
        refs.getContainer().g().getLifecycle().a(g10);
        new GalleryV5LeftAlignSnapHelper().attachToRecyclerView(galleryView);
        galleryView.setAdapter(galleryV5Adapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public final void bind(@NotNull GalleryV5VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bind(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull GalleryV5VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getEvent());
    }

    public void bind(@NotNull GalleryV5VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.galleryId = item.getGalleryId();
        GallerySyncModel findSyncItem = this.gallerySyncViewModel.findSyncItem(item.getGalleryId());
        if (findSyncItem == null) {
            bindInternal$default(this, item, null, 2, null);
        } else {
            updateSyncItem(findSyncItem, item);
        }
    }
}
