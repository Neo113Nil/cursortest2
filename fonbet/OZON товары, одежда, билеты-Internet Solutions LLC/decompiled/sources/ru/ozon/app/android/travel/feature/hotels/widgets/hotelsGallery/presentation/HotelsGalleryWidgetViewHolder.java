package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import Ae.B0;
import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Fm0.d;
import QI.a;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.m;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryItemAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.buttons.ButtonsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.buttons.ButtonsItemDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.pagerIndicator.LinePagerIndicator;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.view.HotelsGalleryView;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.VideoPosition;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u008a\u00012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0002\u008a\u0001BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010\u0019J-\u0010-\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010'2\u0012\u0010,\u001a\u000e\u0012\b\u0012\u00060*j\u0002`+\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u0010\u0019J\u0019\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00172\u0006\u00105\u001a\u000202H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0017H\u0003¢\u0006\u0004\b8\u0010\u0019J\u000f\u00109\u001a\u00020\u0017H\u0002¢\u0006\u0004\b9\u0010\u0019J\u0017\u0010<\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00172\u0006\u0010?\u001a\u00020>2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020>H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00172\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010O\u001a\u00020\u00172\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ-\u0010S\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010K2\b\b\u0002\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bS\u0010TJ\u0013\u0010V\u001a\u00020\u0017*\u00020UH\u0002¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010YR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ZR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010[R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\\R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010]R\u0016\u0010^\u001a\u00020M8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u00170c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR`\u0010|\u001aN\u0012\u0004\u0012\u00020>\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060yj\u0002`z0\u0001j\f\u0012\b\u0012\u00060yj\u0002`z`\u00030xj&\u0012\u0004\u0012\u00020>\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060yj\u0002`z0\u0001j\f\u0012\b\u0012\u00060yj\u0002`z`\u0003`{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u00105\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0080\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/view/HotelsGalleryView;", "view", "Lru/ozon/app/android/video/player/soundservice/SoundController;", "soundController", "Lkotlin/Function0;", "Lru/ozon/app/android/travel/feature/hotels/shared/player/HotelsGalleryVideoPlayer;", "galleryVideoPlayerProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryRouter;", "galleryRouter", "Ll10/i;", "composerScreenUiContainer", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/view/HotelsGalleryView;Lru/ozon/app/android/video/player/soundservice/SoundController;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryRouter;Ll10/i;LWZ/l;)V", "", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onRecycle", "onDetach", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "lastPlaceholder", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "lastAsyncState", "resolvePlaceholderState", "(Lru/ozon/app/android/travel/utils/placeholder/Placeholder;Ljava/util/List;)V", "initViews", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;", "indicatorType", "Landroid/view/View;", "setupIndicator", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;)Landroid/view/View;", "indicatorView", "attachIndicatorView", "(Landroid/view/View;)V", "setGestureDetector", "observeBusEvents", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Settings;", "settings", "decorateNestedWidgetContainer", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Settings;)V", "", "margin", "setIndicatorMargin", "(ILru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;)V", "newPosition", "onViewPagerPageSelected", "(I)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;", "photo", "onPhotoItemClicked", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;", "video", "", "position", "", "isFillScreen", "onVideoItemClicked", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Video;JZ)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;", "videoPosition", "navigateToGalleryDetails", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$GalleryItem;Ljava/lang/Long;Z)V", "Landroidx/viewpager2/widget/ViewPager2;", "removeOnPageChangeCallback", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/view/HotelsGalleryView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryViewModel;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryRouter;", "Ll10/i;", "LWZ/l;", "isTest", "Z", "dp12", "I", "dp28", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/viewpager2/widget/ViewPager2$g;", "onPageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemAdapter;", "galleryAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/adapter/HotelsGalleryItemAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonsAdapter;", "buttonsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/buttons/ButtonsAdapter;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Ljava/util/HashMap;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Landroid/view/GestureDetector;", "gestureDetector$delegate", "LSc/j;", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "indicatorView$delegate", "getIndicatorView", "()Landroid/view/View;", "getComposerContainer", "()Ll10/i;", "composerContainer", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryWidgetViewHolder extends k<HotelsGalleryVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonsAdapter buttonsAdapter;
    private final i composerScreenUiContainer;

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;
    private final int dp12;
    private final int dp28;

    @NotNull
    private final HotelsGalleryItemAdapter galleryAdapter;

    @NotNull
    private final GalleryRouter galleryRouter;

    /* renamed from: gestureDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gestureDetector;

    /* renamed from: indicatorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j indicatorView;
    private boolean isTest;

    @NotNull
    private final NestedWidgetsManager nestedWidgetsManager;
    private ViewPager2.g onPageChangeCallback;

    @NotNull
    private final PlaceholderParser placeholderParser;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsGalleryView view;

    @NotNull
    private final HotelsGalleryViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryWidgetViewHolder(@NotNull HotelsGalleryView view, @NotNull SoundController soundController, @NotNull Function0<HotelsGalleryVideoPlayer> galleryVideoPlayerProvider, @NotNull ComposerReferences refs, @NotNull HotelsGalleryViewModel viewModel, @NotNull GalleryRouter galleryRouter, i iVar, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(soundController, "soundController");
        Intrinsics.checkNotNullParameter(galleryVideoPlayerProvider, "galleryVideoPlayerProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(galleryRouter, "galleryRouter");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.refs = refs;
        this.viewModel = viewModel;
        this.galleryRouter = galleryRouter;
        this.composerScreenUiContainer = iVar;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.dp12 = UiExtKt.toPx(12, getContext());
        this.dp28 = UiExtKt.toPx(28, getContext());
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new HotelsGalleryWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.galleryAdapter = new HotelsGalleryItemAdapter(this, refs, galleryVideoPlayerProvider, soundController, viewModel, new HotelsGalleryWidgetViewHolder$galleryAdapter$1(this), tokenizedAnalytics);
        this.buttonsAdapter = new ButtonsAdapter(this, soundController, buildHandler);
        this.placeholderParser = new PlaceholderParser("islandPlaceholder");
        NestedWidgetsManager nestedWidgetsManager = new NestedWidgetsManager(getComposerContainer(), refs.getWidgetsFactory(), getComposerContainer().c0());
        nestedWidgetsManager.setContainer(view.getNestedContainerLL());
        this.nestedWidgetsManager = nestedWidgetsManager;
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        this.currentViewHolders = new HashMap<>();
        this.gestureDetector = LazyUtilsKt.unsafeLazy(new HotelsGalleryWidgetViewHolder$gestureDetector$2(this));
        this.indicatorView = LazyUtilsKt.unsafeLazy(new HotelsGalleryWidgetViewHolder$indicatorView$2(this));
        initViews();
    }

    private final void attachIndicatorView(View indicatorView) {
        if (indicatorView instanceof ScrollingPagerIndicator) {
            ((ScrollingPagerIndicator) indicatorView).c(this.view.getHotelsGalleryVp(), new d());
        } else if (indicatorView instanceof LinePagerIndicator) {
            ((LinePagerIndicator) indicatorView).attachToPager(this.view.getHotelsGalleryVp());
        }
        setGestureDetector();
    }

    private final void decorateNestedWidgetContainer(final HotelsGalleryVO.Settings settings) {
        final int islandRadius = (int) settings.getIslandRadius();
        setIndicatorMargin(islandRadius, settings.getPageControl().getIndicatorType());
        LinearLayout nestedContainerLL = this.view.getNestedContainerLL();
        nestedContainerLL.setMinimumHeight(islandRadius);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = nestedContainerLL.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nestedContainerLL.setBackgroundColor(styleParser.parseColor(context, settings.getIslandBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        nestedContainerLL.setPadding(0, settings.getIslandTopPadding(), 0, 0);
        nestedContainerLL.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryWidgetViewHolder$decorateNestedWidgetContainer$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + islandRadius, settings.getIslandRadius());
            }
        });
        nestedContainerLL.setClipToOutline(true);
    }

    private final i getComposerContainer() {
        i iVar = this.composerScreenUiContainer;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("ComposerScreenUiContainer is null");
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.gestureDetector.getValue();
    }

    private final View getIndicatorView() {
        return (View) this.indicatorView.getValue();
    }

    private final void initViews() {
        HotelsGalleryView hotelsGalleryView = this.view;
        hotelsGalleryView.getHotelsGalleryVp().s(this.galleryAdapter);
        hotelsGalleryView.getHotelsGalleryVp().v(-1);
        hotelsGalleryView.getHotelsGalleryButtonsRv().setAdapter(this.buttonsAdapter);
        RecyclerView hotelsGalleryButtonsRv = hotelsGalleryView.getHotelsGalleryButtonsRv();
        Context context = hotelsGalleryView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hotelsGalleryButtonsRv.addItemDecoration(new ButtonsItemDecoration(context));
        hotelsGalleryView.getHotelsGalleryButtonsRv().setRecycledViewPool(this.refs.getComposerViewPoolProvider().getViewPool());
    }

    private final void navigateToGalleryDetails(HotelsGalleryVO.GalleryItem item, Long videoPosition, boolean isFillScreen) {
        VideoPosition videoPosition2;
        HotelsGalleryVO boundData = getBoundData();
        if (boundData != null) {
            GalleryRouter galleryRouter = this.galleryRouter;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int f7 = this.view.getHotelsGalleryVp().f();
            if (videoPosition != null) {
                long longValue = videoPosition.longValue();
                Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO.Video");
                videoPosition2 = new VideoPosition(((HotelsGalleryVO.Video) item).getVideo().getLink(), longValue);
            } else {
                videoPosition2 = null;
            }
            galleryRouter.navigateToDetailedGallery(context, boundData, f7, isFillScreen, videoPosition2, "travel.hotelsGallery");
        }
    }

    static /* synthetic */ void navigateToGalleryDetails$default(HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder, HotelsGalleryVO.GalleryItem galleryItem, Long l11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        hotelsGalleryWidgetViewHolder.navigateToGalleryDetails(galleryItem, l11, z11);
    }

    private final void observeBusEvents() {
        C2399j.C(new C2408n0(this.refs.getController().getEventsFlow(), new HotelsGalleryWidgetViewHolder$observeBusEvents$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPhotoItemClicked(HotelsGalleryVO.Photo photo) {
        this.viewModel.savePosition(this.view.getHotelsGalleryVp().f());
        AtomAction action = photo.getAction();
        if (action != null) {
            if (!(action instanceof AtomAction.Click)) {
                this.actionHandler.invoke(photo.getAction());
            } else if (Intrinsics.d(((AtomAction.Click) photo.getAction()).getId(), "openFullGallery")) {
                TokenizedAnalyticsExtKt.processClickEvents(this.tokenizedAnalytics, photo.getTrackingInfo());
                navigateToGalleryDetails$default(this, photo, null, false, 6, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoItemClicked(HotelsGalleryVO.Video video, long position, boolean isFillScreen) {
        this.viewModel.savePosition(this.view.getHotelsGalleryVp().f());
        AtomAction action = video.getAction();
        if (action != null) {
            if (!(action instanceof AtomAction.Click)) {
                this.actionHandler.invoke(video.getAction());
            } else if (Intrinsics.d(((AtomAction.Click) video.getAction()).getId(), "openFullGallery")) {
                TokenizedAnalyticsExtKt.processClickEvents(this.tokenizedAnalytics, video.getTrackingInfo());
                navigateToGalleryDetails(video, Long.valueOf(position), isFillScreen);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onViewPagerPageSelected(int newPosition) {
        List<HotelsGalleryVO.GalleryItem> currentList = this.galleryAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        HotelsGalleryVO.GalleryItem galleryItem = (HotelsGalleryVO.GalleryItem) C7714v.Q(newPosition, currentList);
        if (galleryItem == null) {
            List<HotelsGalleryVO.GalleryItem> currentList2 = this.galleryAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
            galleryItem = (HotelsGalleryVO.GalleryItem) C7714v.M(currentList2);
        }
        this.view.getHotelsGalleryButtonsRv().setVisibility(this.isTest || (galleryItem instanceof HotelsGalleryVO.Video) ? 0 : 8);
    }

    private final void removeOnPageChangeCallback(ViewPager2 viewPager2) {
        ViewPager2.g gVar = this.onPageChangeCallback;
        if (gVar != null) {
            viewPager2.A(gVar);
        }
        this.onPageChangeCallback = null;
    }

    private final void resolvePlaceholderState(Placeholder lastPlaceholder, List<ru.ozon.composer.ui.widget.l> lastAsyncState) {
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(getViewItem(), this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        if (lastAsyncState == null || !Intrinsics.d(parsePlaceholders, lastPlaceholder)) {
            this.nestedWidgetsManager.addNestedWidgets(this.currentPlaceholder, this.currentViewHolders);
        } else {
            this.nestedWidgetsManager.addNestedWidgets(new Placeholder(lastAsyncState, false), this.currentViewHolders);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setGestureDetector() {
        this.view.getHotelsGalleryVp().getChildAt(0).setOnTouchListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setGestureDetector$lambda$6(HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder, View view, MotionEvent motionEvent) {
        hotelsGalleryWidgetViewHolder.getGestureDetector().onTouchEvent(motionEvent);
        return false;
    }

    private final void setIndicatorMargin(int margin, HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType indicatorType) {
        FrameLayout hotelsGalleryIndicatorContainer = this.view.getHotelsGalleryIndicatorContainer();
        ViewGroup.LayoutParams layoutParams = hotelsGalleryIndicatorContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = margin + (indicatorType == HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType.INDICATOR_TYPE_LINE ? this.dp28 : this.dp12);
        hotelsGalleryIndicatorContainer.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View setupIndicator(HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType indicatorType) {
        View view;
        HotelsGalleryView hotelsGalleryView = this.view;
        hotelsGalleryView.getHotelsGalleryIndicatorContainer().removeAllViews();
        if (indicatorType == HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType.INDICATOR_TYPE_LINE) {
            Context context = hotelsGalleryView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view = new LinePagerIndicator(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            View inflate = LayoutInflater.from(hotelsGalleryView.getContext()).inflate(R$layout.view_hotels_gallery_dots_indicator, (ViewGroup) hotelsGalleryView.getHotelsGalleryIndicatorContainer(), false);
            Intrinsics.g(inflate, "null cannot be cast to non-null type ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator");
            view = (ScrollingPagerIndicator) inflate;
        }
        hotelsGalleryView.getHotelsGalleryIndicatorContainer().addView(view);
        return view;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeBusEvents();
        attachIndicatorView(getIndicatorView());
        ViewPager2 hotelsGalleryVp = this.view.getHotelsGalleryVp();
        ViewPager2.g gVar = new ViewPager2.g() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryWidgetViewHolder$onAttach$$inlined$onPageSelected$1
            private int prevPosition;

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (positionOffset == 0.0f && position == 0) {
                    HotelsGalleryWidgetViewHolder.this.onViewPagerPageSelected(position);
                    this.prevPosition = 0;
                    return;
                }
                int i11 = this.prevPosition;
                if (i11 == position && positionOffset > 0.5d && positionOffset != 0.0f) {
                    int i12 = position + 1;
                    this.prevPosition = i12;
                    HotelsGalleryWidgetViewHolder.this.onViewPagerPageSelected(i12);
                } else {
                    if (i11 <= position || positionOffset >= 0.5d || positionOffset == 0.0f) {
                        return;
                    }
                    HotelsGalleryWidgetViewHolder.this.onViewPagerPageSelected(position);
                    this.prevPosition = position;
                }
            }
        };
        hotelsGalleryVp.p(gVar);
        this.onPageChangeCallback = gVar;
        B0<GalleryAction> action = this.viewModel.getAction();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C(new C2408n0(C5427n.a(action, lifecycle, bVar), new HotelsGalleryWidgetViewHolder$onAttach$2(this, null)), new HotelsGalleryWidgetViewHolder$onAttach$3(null)), H.a(getLifecycle()));
        C2399j.C(new C(new C2408n0(C5427n.a(this.viewModel.getSavedPosition(), getLifecycle(), bVar), new HotelsGalleryWidgetViewHolder$onAttach$4(this, null)), new HotelsGalleryWidgetViewHolder$onAttach$5(null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        HotelsGalleryVO boundData = getBoundData();
        if (boundData != null) {
            boundData.setLastPlaceholder(this.currentPlaceholder);
        }
        View indicatorView = getIndicatorView();
        ScrollingPagerIndicator scrollingPagerIndicator = indicatorView instanceof ScrollingPagerIndicator ? (ScrollingPagerIndicator) indicatorView : null;
        if (scrollingPagerIndicator != null) {
            scrollingPagerIndicator.e();
        }
        removeOnPageChangeCallback(this.view.getHotelsGalleryVp());
        super.onDetach();
    }

    @Override // jk0.j
    public void onRecycle() {
        this.nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        View indicatorView = getIndicatorView();
        ScrollingPagerIndicator scrollingPagerIndicator = indicatorView instanceof ScrollingPagerIndicator ? (ScrollingPagerIndicator) indicatorView : null;
        if (scrollingPagerIndicator != null) {
            scrollingPagerIndicator.e();
        }
        removeOnPageChangeCallback(this.view.getHotelsGalleryVp());
        HotelsGalleryVO boundData = getBoundData();
        if (boundData != null) {
            boundData.setLastPlaceholder(this.currentPlaceholder);
        }
        super.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsGalleryVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        resolvePlaceholderState(item.getLastPlaceholder(), item.getLastAsyncUpdatedState());
        decorateNestedWidgetContainer(item.getMobileSettings());
        this.view.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getMobileSettings().getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        this.galleryAdapter.submitList(item.getItems());
        this.buttonsAdapter.submitList(item.getButtons());
        BadgeHolderKt.bindOrGone(this.view.getHotelsGalleryBadge(), item.getMobileSettings().getBadge(), this.actionHandler);
        String galleryAspectRatio = item.getMobileSettings().getGalleryAspectRatio();
        if (galleryAspectRatio != null) {
            ConstraintLayoutExtKt.updateConstraints(this.view, new HotelsGalleryWidgetViewHolder$bind$1$1(this, galleryAspectRatio));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsGalleryVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsGalleryWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
