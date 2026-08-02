package ru.ozon.app.android.storefront.widgets.navbarv2.presentation;

import A00.a;
import B90.t0;
import I1.w;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.G;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import id.c;
import id.f;
import j10.InterfaceC7238a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.ShellNavBarDTO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornerManager;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarFloorManager;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarKeyboardManager;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.placeholder.ShellNavBarPlaceholderMapper;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarBgView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarFloorViewGroup;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ShellNavBarScrollFloorView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views.ThirdFloorView;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.RichPromoSettings;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarSpacings;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarTeethVO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarVO;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000e*\u0002\u008d\u0001\b\u0001\u0018\u0000 \u0099\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0099\u0001Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010!J#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&2\u0006\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010\u001eJ\u000f\u0010,\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010\u001eJ\u000f\u0010-\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010\u001eJ\u000f\u00100\u001a\u00020\u001cH\u0002¢\u0006\u0004\b0\u0010\u001eJ\u0017\u00101\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b1\u0010!J\u0017\u00102\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u0010!J\u0017\u00103\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u0010!J\u0017\u00105\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u001c2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u00020\u001c2\b\u0010;\u001a\u0004\u0018\u00010'2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\bB\u0010!J\u0017\u0010D\u001a\u00020<2\u0006\u0010C\u001a\u00020<H\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u0004\u0018\u00010G*\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020<H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\bL\u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010TR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010UR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010VR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010WR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010XR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010YR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010ZR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010s\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010oR\u0016\u0010y\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001b\u0010\u007f\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010|\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R1\u0010\u0088\u0001\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020<8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010K\"\u0005\b\u0089\u0001\u0010AR\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001f\u0010\u0090\u0001\u001a\u00020F8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u0002078BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010;\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009a\u0001"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;", "Ll10/i;", "container", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;", "backgroundView", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper;", "placeholderMapper", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarViewModel;", "viewModel", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornerManager;", "cornersManager", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarFloorManager;", "floorManager", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "composerStore", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Ll10/i;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;Landroidx/appcompat/widget/Toolbar;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Lcom/google/android/material/appbar/AppBarLayout;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarViewModel;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornerManager;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarFloorManager;Lj10/a;LWZ/l;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarVO;)V", "onRefresh", "onWidgetDestroyed", "bindAfterMeasuredWhenReady", "viewItem", "", "", "Landroid/view/ViewGroup;", "mapFloors", "(Lru/ozon/composer/ui/widget/l;)Ljava/util/Map;", "setToolbarIfNeeded", "removeNavbar", "addToToolbar", "removeToolbar", "detachNestedViewHolders", "measureFloors", "bindAfterMeasured", "configureViews", "setCollapsingToolbarBackground", "composerAppbar", "observeSystemInsets", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "", "offset", "setAppBarOffset", "(I)V", "backgroundImage", "", "isPromoScroll", "setBackgroundImageWithoutZeroFloor", "(Ljava/lang/String;Z)V", "setBackgroundImageWithZeroFloor", "(Z)V", "setOverlayColor", "newBgColorValue", "forceBgColorDark", "(Z)Z", "Landroid/view/View;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "createImageSize", "(Landroid/view/View;)Lru/ozon/app/android/pikazon/image/ImageSize;", "isBackgroundColorDark", "()Z", "setRichPromoSettings", "Ll10/i;", "getContainer", "()Ll10/i;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;", "getBackgroundView", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarBgView;", "Landroidx/appcompat/widget/Toolbar;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/placeholder/ShellNavBarPlaceholderMapper;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarViewModel;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarCornerManager;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/managers/ShellNavBarFloorManager;", "Lj10/a;", "LWZ/l;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup;", "zeroFloor", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup;", "firstFloor", "secondFloor", "secondCollapsedFloor", "Landroid/widget/FrameLayout;", "secondFloorsContainer", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ThirdFloorView;", "thirdFloor", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ThirdFloorView;", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarScrollFloorView;", "scrollFloor", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarScrollFloorView;", "isRichPromoAfterRefresh", "Z", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/RichPromoSettings;", "prevRichPromoSettings", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/RichPromoSettings;", "prevOffset", "Ljava/lang/Integer;", "", "toolbarPaddings", "[I", "isContainersReAddNeeded", "stickyContainer", "Landroid/view/ViewGroup;", "scrollDefaultArray$delegate", "LSc/j;", "getScrollDefaultArray", "()[I", "scrollDefaultArray", "Landroid/graphics/drawable/Drawable;", "roundedCornersDrawable$delegate", "getRoundedCornersDrawable", "()Landroid/graphics/drawable/Drawable;", "roundedCornersDrawable", "<set-?>", "isBgColorDark$delegate", "Lid/f;", "isBgColorDark", "setBgColorDark", "Lcom/google/android/material/appbar/AppBarLayout$f;", "expandedOffsetListener", "Lcom/google/android/material/appbar/AppBarLayout$f;", "ru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarOverlayViewHolder$observer$1", "observer", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarOverlayViewHolder$observer$1;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "getStatusBarHeight", "()I", "statusBarHeight", "getBackgroundImage", "()Ljava/lang/String;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarOverlayViewHolder extends AbstractC6065b<ShellNavBarVO> {

    @NotNull
    private final AppBarLayout appBar;

    @NotNull
    private final ShellNavBarBgView backgroundView;

    @NotNull
    private final CollapsingToolbarLayout collapsingToolbar;

    @NotNull
    private final InterfaceC7238a<l> composerStore;

    @NotNull
    private final i container;

    @NotNull
    private final ShellNavBarCornerManager cornersManager;

    @NotNull
    private final AppBarLayout.f expandedOffsetListener;
    private ShellNavBarFloorViewGroup firstFloor;

    @NotNull
    private final ShellNavBarFloorManager floorManager;

    @NotNull
    private final Handler handler;

    /* renamed from: isBgColorDark$delegate, reason: from kotlin metadata */
    @NotNull
    private final f isBgColorDark;
    private boolean isContainersReAddNeeded;
    private boolean isRichPromoAfterRefresh;

    @NotNull
    private final View metricView;

    @NotNull
    private final ShellNavBarOverlayViewHolder$observer$1 observer;
    private ShellNavBarPlaceholderMapper placeholderMapper;
    private Integer prevOffset;
    private RichPromoSettings prevRichPromoSettings;

    /* renamed from: roundedCornersDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j roundedCornersDrawable;

    /* renamed from: scrollDefaultArray$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scrollDefaultArray;
    private ShellNavBarScrollFloorView scrollFloor;
    private ShellNavBarFloorViewGroup secondCollapsedFloor;
    private ShellNavBarFloorViewGroup secondFloor;
    private FrameLayout secondFloorsContainer;
    private final ViewGroup stickyContainer;
    private ThirdFloorView thirdFloor;

    @NotNull
    private final WZ.l tokenizedAnalytics;

    @NotNull
    private final Toolbar toolbar;
    private int[] toolbarPaddings;

    @NotNull
    private final ShellNavBarViewModel viewModel;
    private ShellNavBarFloorViewGroup zeroFloor;
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {w.c(ShellNavBarOverlayViewHolder.class, "isBgColorDark", "isBgColorDark()Z", 0)};

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "navBar", "", "teeth", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Integer, Integer, Unit> {
        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11, int i12) {
            ShellNavBarOverlayViewHolder.this.composerStore.c(new a.F(i12));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/ShellNavBarOverlayViewHolder$Companion;", "", "<init>", "()V", "MAX_ALPHA", "", "TRIGGER_ALPHA_VALUE", "", "ZERO_OFFSET", "", "FIRST_VIEW_POSITION", "LUMINANCE_THRESHOLD", "BLOGGER_LANDING_DEEPLINK", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.I, ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$observer$1] */
    public ShellNavBarOverlayViewHolder(@NotNull i container, @NotNull ShellNavBarBgView backgroundView, @NotNull final Toolbar toolbar, @NotNull CollapsingToolbarLayout collapsingToolbar, @NotNull AppBarLayout appBar, ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper, @NotNull ShellNavBarViewModel viewModel, @NotNull ShellNavBarCornerManager cornersManager, @NotNull ShellNavBarFloorManager floorManager, @NotNull InterfaceC7238a<l> composerStore, @NotNull WZ.l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(backgroundView, "backgroundView");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(collapsingToolbar, "collapsingToolbar");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(cornersManager, "cornersManager");
        Intrinsics.checkNotNullParameter(floorManager, "floorManager");
        Intrinsics.checkNotNullParameter(composerStore, "composerStore");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.container = container;
        this.backgroundView = backgroundView;
        this.toolbar = toolbar;
        this.collapsingToolbar = collapsingToolbar;
        this.appBar = appBar;
        this.placeholderMapper = shellNavBarPlaceholderMapper;
        this.viewModel = viewModel;
        this.cornersManager = cornersManager;
        this.floorManager = floorManager;
        this.composerStore = composerStore;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.handler = new Handler(Looper.getMainLooper());
        this.isContainersReAddNeeded = true;
        this.stickyContainer = ComposerViewExtensionKt.composerStickyContainer(container.Y());
        this.scrollDefaultArray = LazyUtilsKt.unsafeLazy(ShellNavBarOverlayViewHolder$scrollDefaultArray$2.INSTANCE);
        this.roundedCornersDrawable = LazyUtilsKt.unsafeLazy(new ShellNavBarOverlayViewHolder$roundedCornersDrawable$2(this));
        final Boolean bool = Boolean.TRUE;
        this.isBgColorDark = new c<Boolean>(bool) { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$special$$inlined$observable$1
            @Override // id.c
            protected void afterChange(m<?> property, Boolean oldValue, Boolean newValue) {
                boolean forceBgColorDark;
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = newValue.booleanValue();
                if (oldValue.booleanValue() != booleanValue) {
                    forceBgColorDark = this.forceBgColorDark(booleanValue);
                    if (forceBgColorDark) {
                        return;
                    }
                    StatusBarController.INSTANCE.setStatusBarContentColor(this.getContainer().K().b(), StatusBarController.UpdateReason.NewState.INSTANCE, booleanValue, true);
                }
            }
        };
        this.expandedOffsetListener = new AppBarLayout.f() { // from class: gL.a
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                ShellNavBarOverlayViewHolder.expandedOffsetListener$lambda$1(ShellNavBarOverlayViewHolder.this, appBarLayout, i11);
            }
        };
        ?? r32 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                boolean isBgColorDark;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStart(owner);
                StatusBarController statusBarController = StatusBarController.INSTANCE;
                ComponentCallbacksC5392m b11 = ShellNavBarOverlayViewHolder.this.getContainer().K().b();
                StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
                isBgColorDark = ShellNavBarOverlayViewHolder.this.isBgColorDark();
                statusBarController.setStatusBarContentColor(b11, newState, isBgColorDark, true);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Integer num;
                ShellNavBarViewModel shellNavBarViewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                num = ShellNavBarOverlayViewHolder.this.prevOffset;
                if (num != null) {
                    ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder = ShellNavBarOverlayViewHolder.this;
                    int intValue = num.intValue();
                    shellNavBarViewModel = shellNavBarOverlayViewHolder.viewModel;
                    shellNavBarViewModel.setVerticalOffset(intValue);
                }
            }
        };
        this.observer = r32;
        this.metricView = collapsingToolbar;
        container.K().f().getLifecycle().a(r32);
        observeSystemInsets(appBar);
        G.a(toolbar, new Runnable() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                Integer num;
                ShellNavBarViewModel shellNavBarViewModel;
                ShellNavBarViewModel shellNavBarViewModel2;
                num = this.prevOffset;
                shellNavBarViewModel = this.viewModel;
                int verticalOffset = shellNavBarViewModel.getVerticalOffset();
                if (num != null && num.intValue() == verticalOffset) {
                    return;
                }
                ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder = this;
                shellNavBarViewModel2 = shellNavBarOverlayViewHolder.viewModel;
                shellNavBarOverlayViewHolder.setAppBarOffset(shellNavBarViewModel2.getVerticalOffset());
            }
        });
        ShellNavBarKeyboardManager.INSTANCE.setup(container);
        floorManager.setOnHeightUpdated(new AnonymousClass2());
    }

    private final void addToToolbar() {
        Map<String, ViewGroup> floorContainers;
        Map<String, ViewGroup> floorContainers2;
        Map<String, ViewGroup> floorContainers3;
        ViewGroup viewGroup;
        Map<String, ViewGroup> floorContainers4;
        ViewGroup viewGroup2;
        Map<String, ViewGroup> floorContainers5;
        ViewGroup viewGroup3;
        Map<String, ViewGroup> floorContainers6;
        ViewGroup viewGroup4;
        if (this.isContainersReAddNeeded) {
            CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
            collapsingToolbarLayout.setClipChildren(false);
            collapsingToolbarLayout.setClipToPadding(false);
            ShellNavBarVO boundData = getBoundData();
            int i11 = (boundData != null ? boundData.getShowFullNavbarMode() : null) == ShellNavBarDTO.ShowFullNavBarMode.ANY_POINT ? 4 : 1;
            collapsingToolbarLayout.addView(this.backgroundView, 0);
            ShellNavBarVO boundData2 = getBoundData();
            if (boundData2 != null && (floorContainers6 = boundData2.getFloorContainers()) != null && (viewGroup4 = floorContainers6.get("zero")) != null) {
                collapsingToolbarLayout.addView(viewGroup4, 0);
            }
            ShellNavBarVO boundData3 = getBoundData();
            if (boundData3 != null && (floorContainers5 = boundData3.getFloorContainers()) != null && (viewGroup3 = floorContainers5.get("top")) != null) {
                collapsingToolbarLayout.addView(viewGroup3, 2);
            }
            ShellNavBarVO boundData4 = getBoundData();
            if (boundData4 != null && (floorContainers4 = boundData4.getFloorContainers()) != null && (viewGroup2 = floorContainers4.get("scroll")) != null) {
                collapsingToolbarLayout.addView(viewGroup2, 1);
            }
            ShellNavBarVO boundData5 = getBoundData();
            if (boundData5 != null && (floorContainers3 = boundData5.getFloorContainers()) != null && (viewGroup = floorContainers3.get("third")) != null) {
                collapsingToolbarLayout.addView(viewGroup, 3);
            }
            ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
            AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
            if (dVar != null) {
                dVar.b(i11 | 3);
            }
            ViewExtKt.show(collapsingToolbarLayout);
            Toolbar toolbar = this.toolbar;
            this.toolbarPaddings = new int[]{toolbar.getPaddingLeft(), toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom()};
            toolbar.setPadding(0, 0, 0, 0);
            toolbar.setClipChildren(false);
            toolbar.setClipToPadding(false);
            ShellNavBarVO boundData6 = getBoundData();
            ViewGroup viewGroup5 = (boundData6 == null || (floorContainers2 = boundData6.getFloorContainers()) == null) ? null : floorContainers2.get("second");
            ShellNavBarVO boundData7 = getBoundData();
            ViewGroup viewGroup6 = (boundData7 == null || (floorContainers = boundData7.getFloorContainers()) == null) ? null : floorContainers.get("secondCollapsed");
            if (viewGroup5 != null && viewGroup6 != null) {
                FrameLayout frameLayout = new FrameLayout(toolbar.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                this.secondFloorsContainer = frameLayout;
                viewGroup5.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                FrameLayout frameLayout2 = this.secondFloorsContainer;
                if (frameLayout2 != null) {
                    frameLayout2.addView(viewGroup5);
                }
                viewGroup6.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                FrameLayout frameLayout3 = this.secondFloorsContainer;
                if (frameLayout3 != null) {
                    frameLayout3.addView(viewGroup6);
                }
                toolbar.addView(this.secondFloorsContainer, 0);
            } else if (viewGroup5 != null) {
                this.secondFloorsContainer = null;
                toolbar.addView(viewGroup5, 0);
            } else if (viewGroup6 != null) {
                this.secondFloorsContainer = null;
                toolbar.addView(viewGroup6, 0);
            }
            ViewExtKt.show(toolbar);
            this.isContainersReAddNeeded = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindAfterMeasured(ShellNavBarVO item) {
        configureViews(item);
        setBgColorDark(isBackgroundColorDark());
        StatusBarController.INSTANCE.setStatusBarContentColor(this.container.K().b(), StatusBarController.UpdateReason.NewState.INSTANCE, isBgColorDark(), true);
        setAppBarOffset(this.viewModel.getVerticalOffset());
        this.cornersManager.onBind(item);
        ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper = this.placeholderMapper;
        if (shellNavBarPlaceholderMapper != null) {
            View view = this.thirdFloor;
            shellNavBarPlaceholderMapper.onFloorAlphaChanged((view == null && (view = this.scrollFloor) == null) ? 1.0f : view.getAlpha());
        }
    }

    private final void bindAfterMeasuredWhenReady(final ShellNavBarVO item) {
        final AppBarLayout appBarLayout = this.appBar;
        if (!appBarLayout.isAttachedToWindow()) {
            appBarLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$bindAfterMeasuredWhenReady$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    appBarLayout.removeOnAttachStateChangeListener(this);
                    if (this.getBoundData() == item) {
                        this.measureFloors();
                        this.bindAfterMeasured(item);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                }
            });
        } else if (getBoundData() == item) {
            measureFloors();
            bindAfterMeasured(item);
        }
    }

    private final void configureViews(ShellNavBarVO item) {
        Integer num = this.prevOffset;
        int intValue = num != null ? num.intValue() : this.viewModel.getVerticalOffset();
        if (intValue == 0 && this.viewModel.getVerticalOffset() != 0) {
            intValue = this.viewModel.getVerticalOffset();
        }
        this.floorManager.configViews(item, getStatusBarHeight(), this.backgroundView, this.thirdFloor, intValue);
        StatusBarController.INSTANCE.setStatusBarBackgroundColor(this.container.K().b(), StatusBarController.UpdateReason.NewState.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSize createImageSize(View view) {
        int i11 = 0;
        int width = view.getWidth() > 0 ? view.getWidth() : view.getMeasuredWidth() > 0 ? view.getMeasuredWidth() : 0;
        if (view.getHeight() > 0) {
            i11 = view.getHeight();
        } else if (view.getMeasuredHeight() > 0) {
            i11 = view.getMeasuredHeight();
        }
        if (width <= 0 || i11 <= 0) {
            return null;
        }
        return new ImageSize(width, i11);
    }

    private final void detachNestedViewHolders() {
        this.cornersManager.onViewDetached();
        this.floorManager.onViewDetached();
        ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper = this.placeholderMapper;
        if (shellNavBarPlaceholderMapper != null) {
            shellNavBarPlaceholderMapper.detachNestedViewHolders();
        }
        Y.J(this.appBar, null);
        this.container.K().f().getLifecycle().e(this.observer);
        this.appBar.q(this.expandedOffsetListener);
        this.appBar.requestApplyInsets();
        StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, this.container.K().b(), StatusBarController.UpdateReason.Recovery.INSTANCE, false, false, 8, null);
        this.handler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if ((r1 != null ? r1.getAlpha() : 1.0f) >= 0.3d) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if ((r6.thirdFloor != null ? r7.getAlpha() : 1.0f) >= 0.3d) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void expandedOffsetListener$lambda$1(ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder, AppBarLayout appBarLayout, int i11) {
        Integer num = shellNavBarOverlayViewHolder.prevOffset;
        boolean z11 = false;
        int intValue = i11 - (num != null ? num.intValue() : 0);
        if (intValue == 0) {
            return;
        }
        if (shellNavBarOverlayViewHolder.prevOffset == null) {
            intValue = Math.abs(shellNavBarOverlayViewHolder.viewModel.getVerticalOffset()) - Math.abs(intValue);
        }
        shellNavBarOverlayViewHolder.prevOffset = Integer.valueOf(i11);
        shellNavBarOverlayViewHolder.viewModel.setVerticalOffset(i11);
        shellNavBarOverlayViewHolder.cornersManager.onNavbarOffsetChanged(i11, intValue);
        shellNavBarOverlayViewHolder.floorManager.onNavbarOffsetChanged(i11);
        String backgroundImage = shellNavBarOverlayViewHolder.getBackgroundImage();
        boolean z12 = backgroundImage == null || backgroundImage.length() == 0;
        ShellNavBarScrollFloorView shellNavBarScrollFloorView = shellNavBarOverlayViewHolder.scrollFloor;
        if (shellNavBarScrollFloorView == null) {
            if (!z12) {
            }
            shellNavBarOverlayViewHolder.setBgColorDark(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean forceBgColorDark(boolean newBgColorValue) {
        ShellNavBarVO boundData;
        if (newBgColorValue || (boundData = getBoundData()) == null || !boundData.getForceWhiteStatusBar()) {
            Context L11 = this.container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            if (!ThemeExtKt.isDarkThemeActive(L11)) {
                return false;
            }
        }
        setBgColorDark(true);
        return true;
    }

    private final String getBackgroundImage() {
        String darkBackgroundImage;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        if (!ThemeExtKt.isDarkThemeActive(L11)) {
            ShellNavBarVO boundData = getBoundData();
            if (boundData != null) {
                return boundData.getBackgroundImage();
            }
            return null;
        }
        ShellNavBarVO boundData2 = getBoundData();
        if (boundData2 != null && (darkBackgroundImage = boundData2.getDarkBackgroundImage()) != null) {
            return darkBackgroundImage;
        }
        ShellNavBarVO boundData3 = getBoundData();
        if (boundData3 != null) {
            return boundData3.getBackgroundImage();
        }
        return null;
    }

    private final Drawable getRoundedCornersDrawable() {
        return (Drawable) this.roundedCornersDrawable.getValue();
    }

    private final int[] getScrollDefaultArray() {
        return (int[]) this.scrollDefaultArray.getValue();
    }

    private final int getStatusBarHeight() {
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        int statusBarHeight = ResourceExtKt.getStatusBarHeight(L11);
        ShellNavBarVO boundData = getBoundData();
        return statusBarHeight + (boundData != null ? boundData.getStatusBarBottomMargin() : 0);
    }

    private final boolean isBackgroundColorDark() {
        String str;
        String b11;
        RichPromoSettings richPromoSettings;
        ShellNavBarVO boundData = getBoundData();
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 == null || (str = c11.getTag()) == null) {
            str = "";
        }
        b11 = PZ.a.b(str, false);
        if (!Intrinsics.d(b11, "ozon://my/referalPrograms")) {
            if (!((boundData == null || (richPromoSettings = boundData.getRichPromoSettings()) == null) ? false : richPromoSettings.getIsPromoScrolled())) {
                if (boundData == null || !boundData.getIsSelectApp()) {
                    if (this.scrollFloor == null) {
                        String backgroundImage = getBackgroundImage();
                        if (!(backgroundImage == null || backgroundImage.length() == 0)) {
                            if ((this.thirdFloor != null ? r0.getAlpha() : 1.0f) >= 0.3d) {
                            }
                        }
                    } else if (r0.getAlpha() >= 0.3d) {
                    }
                } else {
                    StyleParser styleParser = StyleParser.INSTANCE;
                    Context context = this.backgroundView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (Color.luminance(styleParser.parseColor(context, boundData.getBackgroundColor(), UniColors.BG_DARK_KEY.getResId())) < 0.5f) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isBgColorDark() {
        return ((Boolean) this.isBgColorDark.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final Map<String, ViewGroup> mapFloors(l viewItem) {
        Map<String, ViewGroup> c11;
        ShellNavBarVO boundData;
        ShellNavBarSpacings spacings;
        Map<String, ViewGroup> floorContainers;
        ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper = this.placeholderMapper;
        if (shellNavBarPlaceholderMapper == null || (c11 = shellNavBarPlaceholderMapper.parsePlaceholders(viewItem)) == null) {
            c11 = U.c();
        }
        ShellNavBarVO boundData2 = getBoundData();
        if (!Intrinsics.d((boundData2 == null || (floorContainers = boundData2.getFloorContainers()) == null) ? null : floorContainers.keySet(), c11.keySet())) {
            this.isContainersReAddNeeded = true;
        }
        ShellNavBarVO boundData3 = getBoundData();
        if (boundData3 != null) {
            boundData3.setFloorContainers(c11);
        }
        ShellNavBarVO boundData4 = getBoundData();
        if (boundData4 != null) {
            int i11 = 0;
            if (c11.get("top") != null && (boundData = getBoundData()) != null && (spacings = boundData.getSpacings()) != null) {
                i11 = spacings.getLevel1BottomSpacing();
            }
            boundData4.setFirstFloorBottomMargin(i11);
        }
        return c11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void measureFloors() {
        ShellNavBarFloorViewGroup shellNavBarFloorViewGroup = this.zeroFloor;
        if (shellNavBarFloorViewGroup != null) {
            MeasureExtKt.measureUnspecified(shellNavBarFloorViewGroup);
        }
        ShellNavBarFloorViewGroup shellNavBarFloorViewGroup2 = this.firstFloor;
        if (shellNavBarFloorViewGroup2 != null) {
            MeasureExtKt.measureUnspecified(shellNavBarFloorViewGroup2);
        }
        ShellNavBarScrollFloorView shellNavBarScrollFloorView = this.scrollFloor;
        if (shellNavBarScrollFloorView != null) {
            MeasureExtKt.measureUnspecified(shellNavBarScrollFloorView);
        }
        ShellNavBarFloorViewGroup shellNavBarFloorViewGroup3 = this.secondFloor;
        if (shellNavBarFloorViewGroup3 != null) {
            MeasureExtKt.measureUnspecified(shellNavBarFloorViewGroup3);
        }
        ShellNavBarFloorViewGroup shellNavBarFloorViewGroup4 = this.secondCollapsedFloor;
        if (shellNavBarFloorViewGroup4 != null) {
            MeasureExtKt.measureUnspecified(shellNavBarFloorViewGroup4);
        }
        ShellNavBarFloorViewGroup shellNavBarFloorViewGroup5 = this.secondFloor;
        int measuredHeight = shellNavBarFloorViewGroup5 != null ? shellNavBarFloorViewGroup5.getMeasuredHeight() : 0;
        MeasureExtKt.measure(this.toolbar, 0, 0, measuredHeight, measuredHeight == 0 ? 0 : 1073741824);
        ThirdFloorView thirdFloorView = this.thirdFloor;
        if (thirdFloorView != null) {
            MeasureExtKt.measureUnspecified(thirdFloorView);
        }
    }

    private final void observeSystemInsets(AppBarLayout composerAppbar) {
        composerAppbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: gL.b
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets observeSystemInsets$lambda$24;
                observeSystemInsets$lambda$24 = ShellNavBarOverlayViewHolder.observeSystemInsets$lambda$24(ShellNavBarOverlayViewHolder.this, view, windowInsets);
                return observeSystemInsets$lambda$24;
            }
        });
        composerAppbar.requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets observeSystemInsets$lambda$24(ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder, View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        shellNavBarOverlayViewHolder.handler.post(new t0(shellNavBarOverlayViewHolder, 3));
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeSystemInsets$lambda$24$lambda$23(ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder) {
        ShellNavBarVO boundData = shellNavBarOverlayViewHolder.getBoundData();
        if (boundData != null) {
            shellNavBarOverlayViewHolder.floorManager.onInsetsUpdated(boundData, shellNavBarOverlayViewHolder.getStatusBarHeight(), shellNavBarOverlayViewHolder.backgroundView);
        }
    }

    private final void removeNavbar() {
        a.F f7;
        removeToolbar();
        detachNestedViewHolders();
        ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper = this.placeholderMapper;
        if (shellNavBarPlaceholderMapper != null) {
            shellNavBarPlaceholderMapper.removeBusEventObserver();
        }
        this.placeholderMapper = null;
        ShellNavBarVO boundData = getBoundData();
        if (boundData != null) {
            boundData.setFloorContainers(null);
        }
        InterfaceC7238a<l> interfaceC7238a = this.composerStore;
        f7 = a.F.f190b;
        interfaceC7238a.c(f7);
    }

    private final void removeToolbar() {
        Map<String, ViewGroup> floorContainers;
        ViewGroup viewGroup;
        Map<String, ViewGroup> floorContainers2;
        ViewGroup viewGroup2;
        Map<String, ViewGroup> floorContainers3;
        ViewGroup viewGroup3;
        Map<String, ViewGroup> floorContainers4;
        ViewGroup viewGroup4;
        this.isContainersReAddNeeded = true;
        Toolbar toolbar = this.toolbar;
        int[] iArr = this.toolbarPaddings;
        if (iArr != null) {
            toolbar.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        this.toolbarPaddings = null;
        FrameLayout frameLayout = this.secondFloorsContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.secondFloorsContainer = null;
        toolbar.removeAllViews();
        ViewExtKt.gone(toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        ShellNavBarVO boundData = getBoundData();
        if (boundData != null && (floorContainers4 = boundData.getFloorContainers()) != null && (viewGroup4 = floorContainers4.get("zero")) != null) {
            collapsingToolbarLayout.removeView(viewGroup4);
        }
        ShellNavBarVO boundData2 = getBoundData();
        if (boundData2 != null && (floorContainers3 = boundData2.getFloorContainers()) != null && (viewGroup3 = floorContainers3.get("top")) != null) {
            collapsingToolbarLayout.removeView(viewGroup3);
        }
        ShellNavBarVO boundData3 = getBoundData();
        if (boundData3 != null && (floorContainers2 = boundData3.getFloorContainers()) != null && (viewGroup2 = floorContainers2.get("scroll")) != null) {
            collapsingToolbarLayout.removeView(viewGroup2);
        }
        ShellNavBarVO boundData4 = getBoundData();
        if (boundData4 != null && (floorContainers = boundData4.getFloorContainers()) != null && (viewGroup = floorContainers.get("third")) != null) {
            collapsingToolbarLayout.removeView(viewGroup);
        }
        collapsingToolbarLayout.removeView(this.backgroundView);
        ViewExtKt.gone(collapsingToolbarLayout);
        this.secondCollapsedFloor = null;
        ConstraintLayout composerExpandedContainer = ComposerViewExtensionKt.composerExpandedContainer(this.container.Z());
        if (composerExpandedContainer != null) {
            composerExpandedContainer.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppBarOffset(int offset) {
        ViewGroup.LayoutParams layoutParams = this.appBar.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar == null) {
            return;
        }
        CoordinatorLayout.c c11 = fVar.c();
        AppBarLayout.Behavior behavior = c11 instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) c11 : null;
        if (behavior == null) {
            return;
        }
        ViewParent parent = this.appBar.getParent();
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        if (coordinatorLayout == null) {
            return;
        }
        int abs = Math.abs(offset);
        behavior.e(0);
        behavior.p(coordinatorLayout, this.appBar, ComposerViewExtensionKt.composerRecyclerView(this.container.Z()), abs, getScrollDefaultArray());
        ViewGroup viewGroup = this.stickyContainer;
        ViewGroup.LayoutParams layoutParams2 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        CoordinatorLayout.f fVar2 = layoutParams2 instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams2 : null;
        CoordinatorLayout.c c12 = fVar2 != null ? fVar2.c() : null;
        ViewGroup viewGroup2 = this.stickyContainer;
        Object parent2 = viewGroup2 != null ? viewGroup2.getParent() : null;
        CoordinatorLayout coordinatorLayout2 = parent2 instanceof CoordinatorLayout ? (CoordinatorLayout) parent2 : null;
        if (coordinatorLayout2 == null || c12 == null) {
            return;
        }
        c12.onDependentViewChanged(coordinatorLayout2, this.stickyContainer, this.appBar);
    }

    private final void setBackgroundImageWithZeroFloor(boolean isPromoScroll) {
        if (getBackgroundImage() == null || isPromoScroll) {
            return;
        }
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        ContextExtKt.load(L11, getBackgroundImage(), (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$setBackgroundImageWithZeroFloor$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                CollapsingToolbarLayout collapsingToolbarLayout;
                if (resource != null) {
                    collapsingToolbarLayout = ShellNavBarOverlayViewHolder.this.collapsingToolbar;
                    collapsingToolbarLayout.setBackground(resource);
                }
            }
        }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : null);
    }

    private final void setBackgroundImageWithoutZeroFloor(final String backgroundImage, boolean isPromoScroll) {
        if (backgroundImage == null || backgroundImage.length() == 0 || isPromoScroll) {
            this.backgroundView.setBackground(null);
            return;
        }
        final ShellNavBarBgView shellNavBarBgView = this.backgroundView;
        shellNavBarBgView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$setBackgroundImageWithoutZeroFloor$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ImageSize createImageSize;
                if (shellNavBarBgView.getMeasuredWidth() <= 0 || shellNavBarBgView.getMeasuredHeight() <= 0) {
                    return;
                }
                shellNavBarBgView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Context L11 = this.getContainer().L();
                Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
                String str = backgroundImage;
                final ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder = this;
                PikazonLoaderCallback<Drawable> pikazonLoaderCallback = new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder$setBackgroundImageWithoutZeroFloor$1$1
                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadFailed(Exception exc) {
                        PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                    }

                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadSuccessful(Drawable resource) {
                        RichPromoSettings richPromoSettings;
                        if (resource != null) {
                            richPromoSettings = ShellNavBarOverlayViewHolder.this.prevRichPromoSettings;
                            if (richPromoSettings == null || !richPromoSettings.getIsPromoScrolled()) {
                                ShellNavBarOverlayViewHolder.this.getBackgroundView().setBackground(resource);
                            }
                        }
                    }
                };
                ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder2 = this;
                createImageSize = shellNavBarOverlayViewHolder2.createImageSize(shellNavBarOverlayViewHolder2.getBackgroundView());
                ContextExtKt.load(L11, str, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : pikazonLoaderCallback, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : createImageSize);
            }
        });
    }

    private final void setBgColorDark(boolean z11) {
        this.isBgColorDark.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    private final void setCollapsingToolbarBackground(ShellNavBarVO item) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        int parseColor = styleParser.parseColor(L11, item.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (this.zeroFloor == null) {
            collapsingToolbarLayout.setBackgroundColor(0);
            this.backgroundView.setBackgroundColor(parseColor);
            setBackgroundImageWithoutZeroFloor(getBackgroundImage(), item.getRichPromoSettings().getIsPromoScrolled());
        } else {
            collapsingToolbarLayout.setBackgroundColor(parseColor);
            collapsingToolbarLayout.setLayerType(2, null);
            setBackgroundImageWithZeroFloor(item.getRichPromoSettings().getIsPromoScrolled());
            setOverlayColor(item);
        }
    }

    private final void setOverlayColor(ShellNavBarVO item) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        getRoundedCornersDrawable().setTint(styleParser.parseColor(L11, item.getOverlayColor(), UniColors.LAYER_FLOOR_1.getResId()));
        this.backgroundView.setBackground(getRoundedCornersDrawable());
    }

    private final void setRichPromoSettings(ShellNavBarVO item) {
        if (this.isRichPromoAfterRefresh && (item.getRichPromoSettings().getIsPromoScrolled() || item.getRichPromoSettings().getIsRichPromoEnabled())) {
            ShellNavBarVO boundData = getBoundData();
            if (boundData != null) {
                boundData.setRichPromoSettings(new RichPromoSettings(item.getRichPromoSettings().getIsRichPromoEnabled(), item.getRichPromoSettings().getIsPromoScrolled()));
            }
        } else if (this.isRichPromoAfterRefresh) {
            ShellNavBarVO boundData2 = getBoundData();
            if (boundData2 != null) {
                RichPromoSettings richPromoSettings = this.prevRichPromoSettings;
                if (richPromoSettings == null) {
                    richPromoSettings = new RichPromoSettings(false, false);
                }
                boundData2.setRichPromoSettings(richPromoSettings);
            }
            this.isRichPromoAfterRefresh = false;
        } else {
            ShellNavBarVO boundData3 = getBoundData();
            if (boundData3 != null) {
                boundData3.setRichPromoSettings(new RichPromoSettings(item.getRichPromoSettings().getIsRichPromoEnabled(), item.getRichPromoSettings().getIsPromoScrolled()));
            }
        }
        if (item.getRichPromoSettings().getIsRichPromoEnabled()) {
            ShellNavBarVO boundData4 = getBoundData();
            this.prevRichPromoSettings = boundData4 != null ? boundData4.getRichPromoSettings() : null;
        }
    }

    private final void setToolbarIfNeeded() {
        if (this.isContainersReAddNeeded) {
            removeToolbar();
            addToToolbar();
        }
    }

    @NotNull
    public final ShellNavBarBgView getBackgroundView() {
        return this.backgroundView;
    }

    @NotNull
    public final i getContainer() {
        return this.container;
    }

    @Override // d20.AbstractC6065b
    @NotNull
    /* renamed from: getMetricView, reason: from getter */
    public View getView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onRefresh() {
        RichPromoSettings richPromoSettings;
        super.onRefresh();
        ShellNavBarViewModel shellNavBarViewModel = this.viewModel;
        Integer num = this.prevOffset;
        shellNavBarViewModel.setVerticalOffset(num != null ? num.intValue() : shellNavBarViewModel.getVerticalOffset());
        ShellNavBarVO boundData = getBoundData();
        this.isRichPromoAfterRefresh = (boundData == null || (richPromoSettings = boundData.getRichPromoSettings()) == null) ? false : richPromoSettings.getIsRichPromoEnabled();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        AppBarLayout appBarLayout = this.appBar;
        appBarLayout.setFitsSystemWindows(true);
        appBarLayout.setBackgroundColor(0);
        appBarLayout.q(this.expandedOffsetListener);
        appBarLayout.d(this.expandedOffsetListener);
        ShellNavBarVO boundData = getBoundData();
        if (boundData != null) {
            i iVar = this.container;
            ShellNavBarTeethVO teeth = boundData.getTeeth();
            iVar.i0(teeth != null ? teeth.getTeethHeight() : 0);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        removeNavbar();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ShellNavBarVO item) {
        ShellNavBarFloorViewGroup shellNavBarFloorViewGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        l viewItem = getViewItem();
        Map<String, ViewGroup> mapFloors = viewItem != null ? mapFloors(viewItem) : null;
        if (mapFloors == null || mapFloors.isEmpty()) {
            removeNavbar();
        } else {
            setToolbarIfNeeded();
            item.setFloorContainers(mapFloors);
        }
        Integer num = this.prevOffset;
        if (num != null && num.intValue() == 0 && (shellNavBarFloorViewGroup = this.firstFloor) != null) {
            shellNavBarFloorViewGroup.setAlpha(1.0f);
        }
        setRichPromoSettings(item);
        ShellNavBarPlaceholderMapper shellNavBarPlaceholderMapper = this.placeholderMapper;
        if (shellNavBarPlaceholderMapper != null) {
            shellNavBarPlaceholderMapper.addPlaceholderWidgets(item, new ShellNavBarOverlayViewHolder$bind$1(item, this));
        }
        Map<String, ViewGroup> floorContainers = item.getFloorContainers();
        ViewGroup viewGroup = floorContainers != null ? floorContainers.get("zero") : null;
        this.zeroFloor = viewGroup instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) viewGroup : null;
        setCollapsingToolbarBackground(item);
        Map<String, ViewGroup> floorContainers2 = item.getFloorContainers();
        ViewGroup viewGroup2 = floorContainers2 != null ? floorContainers2.get("top") : null;
        this.firstFloor = viewGroup2 instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) viewGroup2 : null;
        Map<String, ViewGroup> floorContainers3 = item.getFloorContainers();
        ViewGroup viewGroup3 = floorContainers3 != null ? floorContainers3.get("second") : null;
        this.secondFloor = viewGroup3 instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) viewGroup3 : null;
        Map<String, ViewGroup> floorContainers4 = item.getFloorContainers();
        ViewGroup viewGroup4 = floorContainers4 != null ? floorContainers4.get("secondCollapsed") : null;
        this.secondCollapsedFloor = viewGroup4 instanceof ShellNavBarFloorViewGroup ? (ShellNavBarFloorViewGroup) viewGroup4 : null;
        Map<String, ViewGroup> floorContainers5 = item.getFloorContainers();
        ViewGroup viewGroup5 = floorContainers5 != null ? floorContainers5.get("scroll") : null;
        this.scrollFloor = viewGroup5 instanceof ShellNavBarScrollFloorView ? (ShellNavBarScrollFloorView) viewGroup5 : null;
        Map<String, ViewGroup> floorContainers6 = item.getFloorContainers();
        ViewParent viewParent = floorContainers6 != null ? (ViewGroup) floorContainers6.get("third") : null;
        this.thirdFloor = viewParent instanceof ThirdFloorView ? (ThirdFloorView) viewParent : null;
        bindAfterMeasuredWhenReady(item);
    }
}
