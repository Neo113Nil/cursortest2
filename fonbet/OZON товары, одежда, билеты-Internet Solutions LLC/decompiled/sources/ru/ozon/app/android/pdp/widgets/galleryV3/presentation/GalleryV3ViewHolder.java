package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import B90.u0;
import L3.m;
import Sc.InterfaceC4008j;
import Sc.o;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.gallery.GalleryTokenizedAnalyticsExtKt;
import ru.ozon.app.android.gallery.StorageAnalytic;
import ru.ozon.app.android.pdp.databinding.PdpStubClassifiedGalleryV3Binding;
import ru.ozon.app.android.pdp.databinding.PdpWidgetProductGalleryV3Binding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.PdpGalleryPagerIndicator;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapperKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModel;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.view.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.buttons.GalleryButtonsAdapter;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.GalleryRecyclerAdapter;
import ru.ozon.app.android.pdp.widgets.galleryV3.utils.GalleryV3ItemsDetectorExt;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.video.TokenizedVideoEvents;
import ru.ozon.app.android.video.VideoPosition;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ñ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n*\u0001e\b\u0001\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001mBM\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u0004\u0018\u00010\u00182\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020!H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u0010\u001aJ\u0017\u00109\u001a\u00020\u00182\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020!H\u0002¢\u0006\u0004\b;\u00105J'\u0010<\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020!2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00180N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010TR\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001b\u0010l\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bh\u0010i*\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/utils/GalleryV3ItemsDetectorExt;", "Landroid/view/View;", "containerView", "Lkotlin/Function0;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "galleryVideoPlayerProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryAnalytics;", "galleryAnalytics", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryRouter;", "router", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryAnalytics;Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryRouter;Lru/ozon/app/android/video/player/soundservice/SoundController;Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;)V", "", "onAttach", "()V", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;Ll20/d;)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;", "", "videoPosition", "", "fullScreen", "navigateToGalleryDetails", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;Ljava/lang/Long;Z)V", "Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3Binding;", "binding", "setupUi", "(Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3Binding;)V", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "state", "updateVideoState", "(Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;)Lkotlin/Unit;", "", "newPosition", "onViewPagerPageSelected", "(I)V", "renderButtons", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;)V", "updateSoundButton", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;", "classifiedDetails", "bindClassified", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$ClassifiedDetails;)V", "onItemClickListener", "onVideoClicked", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;JZ)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryAnalytics;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryRouter;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModel;", "vo", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "screenWidth", "I", "Lru/ozon/app/android/pdp/databinding/PdpWidgetProductGalleryV3Binding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/databinding/PdpStubClassifiedGalleryV3Binding;", "classifiedBinding$delegate", "LSc/j;", "getClassifiedBinding", "()Lru/ozon/app/android/pdp/databinding/PdpStubClassifiedGalleryV3Binding;", "classifiedBinding", "Ljava/lang/Runnable;", "videoButtonsRunnable", "Ljava/lang/Runnable;", "otherButtonsRunnable", "LSc/j;", "Landroid/os/Handler;", "buttonsLazyHandler", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter;", "galleryAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/GalleryRecyclerAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonsAdapter;", "buttonsAdapter", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/buttons/GalleryButtonsAdapter;", "ru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3ViewHolder$containerLifecycleObserver$1", "containerLifecycleObserver", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3ViewHolder$containerLifecycleObserver$1;", "getButtonsHandler", "()Landroid/os/Handler;", "getButtonsHandler$delegate", "(Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3ViewHolder;)Ljava/lang/Object;", "buttonsHandler", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV3ViewHolder extends k<GalleryV3VO> implements GalleryV3ItemsDetectorExt {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final PdpWidgetProductGalleryV3Binding binding;

    @NotNull
    private final GalleryButtonsAdapter buttonsAdapter;

    @NotNull
    private final InterfaceC4008j<Handler> buttonsLazyHandler;

    /* renamed from: classifiedBinding$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j classifiedBinding;

    @NotNull
    private final GalleryV3ViewHolder$containerLifecycleObserver$1 containerLifecycleObserver;

    @NotNull
    private final View containerView;

    @NotNull
    private final GalleryRecyclerAdapter galleryAdapter;

    @NotNull
    private final GalleryAnalytics galleryAnalytics;

    @NotNull
    private final Runnable otherButtonsRunnable;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final GalleryRouter router;
    private final int screenWidth;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Runnable videoButtonsRunnable;

    @NotNull
    private final GalleryV3ViewModel viewModel;
    private GalleryV3VO vo;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.lifecycle.I, ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3ViewHolder$containerLifecycleObserver$1] */
    public GalleryV3ViewHolder(@NotNull View containerView, @NotNull Function0<GalleryVideoPlayer> galleryVideoPlayerProvider, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull GalleryAnalytics galleryAnalytics, @NotNull GalleryRouter router, @NotNull SoundController soundController, @NotNull GalleryV3ViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(galleryVideoPlayerProvider, "galleryVideoPlayerProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(galleryAnalytics, "galleryAnalytics");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.galleryAnalytics = galleryAnalytics;
        this.router = router;
        this.viewModel = viewModel;
        this.screenWidth = getContext().getResources().getDisplayMetrics().widthPixels;
        PdpWidgetProductGalleryV3Binding bind = PdpWidgetProductGalleryV3Binding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        this.classifiedBinding = DelegatesKt.lazyUnsafe(new GalleryV3ViewHolder$classifiedBinding$2(this));
        int i11 = 1;
        this.videoButtonsRunnable = new u0(this, i11);
        this.otherButtonsRunnable = new m(this, i11);
        this.buttonsLazyHandler = DelegatesKt.lazyUnsafe(GalleryV3ViewHolder$buttonsLazyHandler$1.INSTANCE);
        this.galleryAdapter = new GalleryRecyclerAdapter(refs, this, galleryVideoPlayerProvider, new GalleryV3ViewHolder$galleryAdapter$1(this), soundController, new GalleryV3ViewHolder$galleryAdapter$2(this), viewModel, new GalleryV3ViewHolder$galleryAdapter$3(this));
        this.buttonsAdapter = new GalleryButtonsAdapter(buildHandler, soundController, new GalleryV3ViewHolder$buttonsAdapter$1(this));
        ?? r02 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3ViewHolder$containerLifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                GalleryRecyclerAdapter galleryRecyclerAdapter;
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(owner, "owner");
                galleryRecyclerAdapter = GalleryV3ViewHolder.this.galleryAdapter;
                galleryRecyclerAdapter.clearAdapter();
                composerReferences = GalleryV3ViewHolder.this.refs;
                composerReferences.getContainer().g().getLifecycle().e(this);
            }
        };
        this.containerLifecycleObserver = r02;
        setupUi(bind);
        refs.getContainer().g().getLifecycle().a(r02);
    }

    private final void bindClassified(GalleryV3VO.ClassifiedDetails classifiedDetails) {
        PdpStubClassifiedGalleryV3Binding classifiedBinding = getClassifiedBinding();
        boolean isClassified = classifiedDetails.getIsClassified();
        WaveView waveV = classifiedBinding.waveV;
        Intrinsics.checkNotNullExpressionValue(waveV, "waveV");
        waveV.setVisibility(isClassified ? 0 : 8);
        if (isClassified) {
            WaveView waveV2 = getClassifiedBinding().waveV;
            Intrinsics.checkNotNullExpressionValue(waveV2, "waveV");
            ViewExtKt.bind(waveV2, this.screenWidth / 12);
        }
        TextAtomV2View classifiedTv = classifiedBinding.classifiedTv;
        Intrinsics.checkNotNullExpressionValue(classifiedTv, "classifiedTv");
        TextHolderKt.bindOrGone$default(classifiedTv, classifiedDetails.getClassifiedText(), null, 2, null);
        View view = classifiedBinding.classifiedBackgroundV;
        Intrinsics.f(view);
        view.setVisibility(classifiedDetails.getClassifiedText() == null ? 8 : 0);
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(styleParser.parseColor(context, classifiedDetails.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        }
        view.setAlpha(classifiedDetails.getBackgroundAlpha());
    }

    private final Handler getButtonsHandler() {
        return this.buttonsLazyHandler.getValue();
    }

    private final PdpStubClassifiedGalleryV3Binding getClassifiedBinding() {
        return (PdpStubClassifiedGalleryV3Binding) this.classifiedBinding.getValue();
    }

    private final void navigateToGalleryDetails(GalleryV3VO.Item item, Long videoPosition, boolean fullScreen) {
        VideoPosition videoPosition2;
        GalleryV3VO galleryV3VO = this.vo;
        if (galleryV3VO != null) {
            t tokenizedEvent = item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtKt.processNonViewEvents(this.tokenizedAnalytics, tokenizedEvent);
            }
            StorageAnalytic.INSTANCE.setTokenizedAnalytics(this.tokenizedAnalytics);
            GalleryRouter galleryRouter = this.router;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int f7 = this.binding.galleryVp.f();
            if (videoPosition != null) {
                videoPosition2 = new VideoPosition(((GalleryV3VO.Item.OzonVideo) item).getVideo().getLink(), videoPosition.longValue());
            } else {
                videoPosition2 = null;
            }
            galleryRouter.navigateToDetailedGallery(context, galleryV3VO, f7, fullScreen, videoPosition2, "pdp.gallery");
        }
    }

    static /* synthetic */ void navigateToGalleryDetails$default(GalleryV3ViewHolder galleryV3ViewHolder, GalleryV3VO.Item item, Long l11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        galleryV3ViewHolder.navigateToGalleryDetails(item, l11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClickListener(GalleryV3VO.Item item) {
        navigateToGalleryDetails$default(this, item, null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoClicked(GalleryV3VO.Item item, long videoPosition, boolean fullScreen) {
        navigateToGalleryDetails(item, Long.valueOf(videoPosition), fullScreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewPagerPageSelected(int newPosition) {
        GalleryRecyclerAdapter galleryRecyclerAdapter = this.galleryAdapter;
        GalleryV3VO.Item item = (GalleryV3VO.Item) C7714v.Q(newPosition, galleryRecyclerAdapter.getItems());
        if (item == null) {
            item = (GalleryV3VO.Item) C7714v.K(galleryRecyclerAdapter.getItems());
        }
        renderButtons(item);
        this.galleryAnalytics.trackGalleryItemViewEvent(item, this.refs.getTokenizedAnalytics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void otherButtonsRunnable$lambda$1(GalleryV3ViewHolder galleryV3ViewHolder) {
        GalleryV3VO.Buttons buttons;
        GalleryButtonsAdapter galleryButtonsAdapter = galleryV3ViewHolder.buttonsAdapter;
        GalleryV3VO galleryV3VO = galleryV3ViewHolder.vo;
        galleryButtonsAdapter.submitList((galleryV3VO == null || (buttons = galleryV3VO.getButtons()) == null) ? null : buttons.getOtherButtons());
    }

    private final void renderButtons(GalleryV3VO.Item item) {
        GalleryV3VO galleryV3VO = this.vo;
        if (galleryV3VO == null || galleryV3VO.getButtons() == null) {
            RecyclerView buttonsRv = this.binding.buttonsRv;
            Intrinsics.checkNotNullExpressionValue(buttonsRv, "buttonsRv");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(buttonsRv);
            return;
        }
        RecyclerView buttonsRv2 = this.binding.buttonsRv;
        Intrinsics.checkNotNullExpressionValue(buttonsRv2, "buttonsRv");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(buttonsRv2);
        if ((item instanceof GalleryV3VO.Item.OzonVideo) && ((GalleryV3VO.Item.OzonVideo) item).getIsAutoPlay()) {
            getButtonsHandler().removeCallbacks(this.otherButtonsRunnable);
            getButtonsHandler().post(this.videoButtonsRunnable);
        } else {
            getButtonsHandler().removeCallbacks(this.videoButtonsRunnable);
            getButtonsHandler().post(this.otherButtonsRunnable);
        }
    }

    private final void setupUi(PdpWidgetProductGalleryV3Binding binding) {
        binding.buttonsRv.setAdapter(this.buttonsAdapter);
        binding.buttonsRv.setItemAnimator(null);
        binding.galleryVp.s(this.galleryAdapter);
        binding.galleryVp.v(-1);
        ViewPager2 galleryVp = binding.galleryVp;
        Intrinsics.checkNotNullExpressionValue(galleryVp, "galleryVp");
        galleryVp.p(new ViewPager2.g() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3ViewHolder$setupUi$lambda$10$$inlined$onPageSelected$1
            private int prevPosition;

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (positionOffset == 0.0f && position == 0) {
                    GalleryV3ViewHolder.this.onViewPagerPageSelected(position);
                    this.prevPosition = position;
                    return;
                }
                int i11 = this.prevPosition;
                if (i11 == position && positionOffset > 0.5d && positionOffset != 0.0f) {
                    int i12 = position + 1;
                    this.prevPosition = i12;
                    GalleryV3ViewHolder.this.onViewPagerPageSelected(i12);
                } else {
                    if (i11 <= position || positionOffset >= 0.5d || positionOffset == 0.0f) {
                        return;
                    }
                    GalleryV3ViewHolder.this.onViewPagerPageSelected(position);
                    this.prevPosition = position;
                }
            }
        });
        binding.atomBadgeLayout.setAdapter(this.atomsAdapter);
        this.atomsAdapter.setOnAction(this.actionHandler);
    }

    private final void updateSoundButton() {
        GalleryV3VO.Buttons buttons;
        GalleryV3VO.VideoButtons videoButtons;
        GalleryV3VO galleryV3VO = this.vo;
        if (galleryV3VO == null || (buttons = galleryV3VO.getButtons()) == null || (videoButtons = buttons.getVideoButtons()) == null) {
            return;
        }
        this.buttonsAdapter.notifyItemChanged(videoButtons.getSoundButtonPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit updateVideoState(GalleryV3VideoState state) {
        TokenizedVideoEvents event = state.getEvent();
        if (state instanceof GalleryV3VideoState.Open) {
            return GalleryTokenizedAnalyticsExtKt.openView(event, this.tokenizedAnalytics);
        }
        if (state instanceof GalleryV3VideoState.Start) {
            return GalleryTokenizedAnalyticsExtKt.startVideo(event, this.tokenizedAnalytics);
        }
        if (state instanceof GalleryV3VideoState.End) {
            return GalleryTokenizedAnalyticsExtKt.endVideo(event, this.tokenizedAnalytics);
        }
        if (!(state instanceof GalleryV3VideoState.SoundMute)) {
            throw new o();
        }
        updateSoundButton();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void videoButtonsRunnable$lambda$0(GalleryV3ViewHolder galleryV3ViewHolder) {
        GalleryV3VO.Buttons buttons;
        GalleryV3VO.VideoButtons videoButtons;
        GalleryButtonsAdapter galleryButtonsAdapter = galleryV3ViewHolder.buttonsAdapter;
        GalleryV3VO galleryV3VO = galleryV3ViewHolder.vo;
        galleryButtonsAdapter.submitList((galleryV3VO == null || (buttons = galleryV3VO.getButtons()) == null || (videoButtons = buttons.getVideoButtons()) == null) ? null : videoButtons.getButtons());
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    public boolean isDisplayedInGallery(@NotNull GalleryV3VO.Item item) {
        return GalleryV3ItemsDetectorExt.DefaultImpls.isDisplayedInGallery(this, item);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getAction().observe(this, new GalleryV3ViewHolderKt$sam$androidx_lifecycle_Observer$0(new GalleryV3ViewHolder$onAttach$1(this)));
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        if (this.buttonsLazyHandler.isInitialized()) {
            getButtonsHandler().removeCallbacks(this.videoButtonsRunnable);
            getButtonsHandler().removeCallbacks(this.otherButtonsRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull GalleryV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PdpWidgetProductGalleryV3Binding pdpWidgetProductGalleryV3Binding = this.binding;
        this.vo = item;
        List<GalleryV3VO.Item> items = item.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (isDisplayedInGallery((GalleryV3VO.Item) obj)) {
                arrayList.add(obj);
            }
        }
        this.galleryAdapter.setItems(arrayList);
        PdpGalleryPagerIndicator pagerIndicator = pdpWidgetProductGalleryV3Binding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator, "pagerIndicator");
        ViewPager2 galleryVp = pdpWidgetProductGalleryV3Binding.galleryVp;
        Intrinsics.checkNotNullExpressionValue(galleryVp, "galleryVp");
        ViewPagerWrapperKt.setViewPager2(pagerIndicator, galleryVp);
        PdpGalleryPagerIndicator pagerIndicator2 = pdpWidgetProductGalleryV3Binding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator2, "pagerIndicator");
        pagerIndicator2.setVisibility(arrayList.size() > 1 ? 0 : 8);
        ViewPager2 galleryVp2 = pdpWidgetProductGalleryV3Binding.galleryVp;
        Intrinsics.checkNotNullExpressionValue(galleryVp2, "galleryVp");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(galleryVp2, Boolean.valueOf(!arrayList.isEmpty()));
        HorizontalFlexAtomsLayout atomBadgeLayout = pdpWidgetProductGalleryV3Binding.atomBadgeLayout;
        Intrinsics.checkNotNullExpressionValue(atomBadgeLayout, "atomBadgeLayout");
        atomBadgeLayout.setVisibility(item.getBadges().isEmpty() ? 8 : 0);
        this.atomsAdapter.bind(getContext(), item.getBadges());
        GalleryV3VO.ClassifiedDetails classifiedDetails = item.getClassifiedDetails();
        if (classifiedDetails != null) {
            bindClassified(classifiedDetails);
        }
        Float ratio = item.getRatio();
        if (ratio != null) {
            float floatValue = ratio.floatValue();
            ViewPager2 galleryVp3 = pdpWidgetProductGalleryV3Binding.galleryVp;
            Intrinsics.checkNotNullExpressionValue(galleryVp3, "galleryVp");
            ViewGroup.LayoutParams layoutParams = galleryVp3.getLayoutParams();
            int i11 = layoutParams.height;
            int i12 = (int) (this.screenWidth * floatValue);
            layoutParams.height = i12;
            if (i11 != i12) {
                galleryVp3.setLayoutParams(layoutParams);
            }
        }
        this.galleryAnalytics.trackGalleryViewEvent(item, this.tokenizedAnalytics);
    }
}
