package ru.ozon.app.android.storefront.navBar;

import GZ.g;
import Hy.RunnableC3170a;
import Tl.b;
import YJ.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalytics;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.navBar.NavBarColors;
import ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder;
import ru.ozon.app.android.storefront.navBar.NavBarVO;
import ru.ozon.app.android.storefront.navBar.databinding.WidgetNavbarBinding;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;
import ru.ozon.composer.ui.widget.a;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import v10.j;

@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\t*\u0004\u009b\u0001\u009e\u0001\u0018\u0000 ¤\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004¤\u0001¥\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010\u0019J\u000f\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b*\u0010\u0019J\u000f\u0010+\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010\u0019J\u0019\u0010/\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J+\u00109\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020705H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u001eH\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u00172\u0006\u00102\u001a\u00020?2\u0006\u0010@\u001a\u00020\"H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0017H\u0002¢\u0006\u0004\bF\u0010\u0019J\u0017\u0010H\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u001eH\u0002¢\u0006\u0004\bH\u0010!J/\u0010N\u001a\u00020\u00172\u0006\u0010J\u001a\u00020I2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\u0006\u0010G\u001a\u00020\u001eH\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020L2\u0006\u0010G\u001a\u00020\u001eH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\bS\u0010\u001cJ\u001a\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010T\u001a\u00020\u0005H\u0082@¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020\u0017*\u00020IH\u0002¢\u0006\u0004\bX\u0010YJ\u0019\u0010[\u001a\u0004\u0018\u00010I2\u0006\u0010Z\u001a\u00020\"H\u0002¢\u0006\u0004\b[\u0010\\J5\u0010`\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0012\u0010^\u001a\u000e\u0012\b\u0012\u00060-j\u0002`]\u0018\u00010K2\u0006\u0010_\u001a\u00020IH\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\"H\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\"H\u0002¢\u0006\u0004\be\u0010cJ\u0019\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00050K*\u00020IH\u0002¢\u0006\u0004\bf\u0010gJ3\u0010j\u001a\u00020\"2\u0010\u0010h\u001a\f\u0012\b\u0012\u00060-j\u0002`]0K2\u0010\u0010i\u001a\f\u0012\b\u0012\u00060-j\u0002`]0KH\u0002¢\u0006\u0004\bj\u0010kJ'\u0010n\u001a\u00020\"2\n\u0010l\u001a\u00060-j\u0002`]2\n\u0010m\u001a\u00060-j\u0002`]H\u0002¢\u0006\u0004\bn\u0010oJ'\u0010p\u001a\u00020\"2\n\u0010l\u001a\u00060-j\u0002`]2\n\u0010m\u001a\u00060-j\u0002`]H\u0002¢\u0006\u0004\bp\u0010oR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010qR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010uR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010vR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010wR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010xR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010yR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010zR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u007f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\u007f\u0010r\u001a\u0005\b\u0080\u0001\u0010tR\"\u0010\u0083\u0001\u001a\r \u0082\u0001*\u0005\u0018\u00010\u0081\u00010\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0090\u0001\u001a\u0002068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001Rq\u0010\u0098\u0001\u001a\\\u0012\u0004\u0012\u00020\u001e\u0012\"\u0012 \u0012\n\u0012\b0\u0094\u0001j\u0003`\u0095\u00010\u0093\u0001j\u000f\u0012\n\u0012\b0\u0094\u0001j\u0003`\u0095\u0001`\u0096\u00010\u0092\u0001j-\u0012\u0004\u0012\u00020\u001e\u0012\"\u0012 \u0012\n\u0012\b0\u0094\u0001j\u0003`\u0095\u00010\u0093\u0001j\u000f\u0012\n\u0012\b0\u0094\u0001j\u0003`\u0095\u0001`\u0096\u0001`\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R5\u0010\u009a\u0001\u001a \u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u0092\u0001j\u000f\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207`\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010£\u0001\u001a\u00020\"8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006¦\u0001"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/storefront/navBar/NavBarVO;", "Ll10/i;", "uiContainer", "Landroid/view/View;", "containerView", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbar", "Lcom/google/android/material/appbar/AppBarLayout;", "appBar", "LGZ/g;", "router", "Lru/ozon/composer/ui/widget/a;", "widgetsFactory", "Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "widgetTokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Ll10/i;Landroid/view/View;Landroidx/appcompat/widget/Toolbar;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Lcom/google/android/material/appbar/AppBarLayout;LGZ/g;Lru/ozon/composer/ui/widget/a;Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/storefront/navBar/NavBarVO;)V", "onWidgetDestroyed", "", "color", "setStatusBarColors", "(I)V", "", "isColorDark", "(I)Z", "updatePlaceholderMargins", "addToToolbar", "removeToolbar", "disableFullScreenForExpanding", "disableExpanding", "detachNestedViewHolders", "observeLifecycle", "observeBusEvents", "Lru/ozon/composer/ui/widget/l;", "viewItem", "parsePlaceholders", "(Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/storefront/navBar/NavBarColors;", "colors", "applyColors", "(Lru/ozon/app/android/storefront/navBar/NavBarVO;Lru/ozon/app/android/storefront/navBar/NavBarColors;)V", "", "", "Lru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$VisiblePlaceholders;", "placeholders", "isExpanded", "(Lru/ozon/app/android/storefront/navBar/NavBarVO;Ljava/util/Map;)Z", "toolbarColor", "statusBarColor", "setNavBarColor", "(II)V", "Lru/ozon/app/android/storefront/navBar/NavBarColors$Expanded;", "isHiding", "enableExpanding", "(Lru/ozon/app/android/storefront/navBar/NavBarColors$Expanded;Z)V", "composerAppbar", "observeSystemInsets", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "setNavBarNavigationIcon", "iconColor", "setIconsColor", "Landroid/view/ViewGroup;", "container", "", "Lru/ozon/app/android/storefront/navBar/NavBarVO$Action;", "actionPoints", "createActionPoints", "(Landroid/view/ViewGroup;Ljava/util/List;I)V", "action", "createImageAction", "(Lru/ozon/app/android/storefront/navBar/NavBarVO$Action;I)Landroid/view/View;", "addNestedWidgets", "view", "Landroid/graphics/Bitmap;", "provideSnapshot", "(Landroid/view/View;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeViewsIfNotEmpty", "(Landroid/view/ViewGroup;)V", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "getExpandedContainerOrNull", "(Z)Landroid/view/ViewGroup;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObjects", "parent", "addNestedWidgetsIntoViewGroup", "(Lru/ozon/app/android/storefront/navBar/NavBarVO;Ljava/util/List;Landroid/view/ViewGroup;)V", "setScrollingBehaviour", "(Z)V", "enabled", "setFullScreen", "getAllChildrenColorFilterable", "(Landroid/view/ViewGroup;)Ljava/util/List;", "composerObjects", "visiblePlaceholderObjects", "areObjectsTheSame", "(Ljava/util/List;Ljava/util/List;)Z", "oldItem", "newItem", "areItemsTheSame", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/composer/ui/widget/l;)Z", "areContentsTheSame", "Ll10/i;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Landroidx/appcompat/widget/Toolbar;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "LGZ/g;", "Lru/ozon/composer/ui/widget/a;", "Lru/ozon/app/android/analytics/modules/tokenized/WidgetTokenizedAnalytics;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/storefront/navBar/databinding/WidgetNavbarBinding;", "binding", "Lru/ozon/app/android/storefront/navBar/databinding/WidgetNavbarBinding;", "metricView", "getMetricView", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "dataItem", "Lru/ozon/app/android/storefront/navBar/NavBarVO;", "", "toolbarPaddings", "[I", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lru/ozon/app/android/storefront/navBar/NavBarColorHelper;", "navBarColorHelper", "Lru/ozon/app/android/storefront/navBar/NavBarColorHelper;", "disabledColorFilteringTag", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "currentPlaceholders", "ru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$expandedOffsetListener$1", "expandedOffsetListener", "Lru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$expandedOffsetListener$1;", "ru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$scrollListener$1;", "getHasLeftPlaceholder", "()Z", "hasLeftPlaceholder", "Companion", "VisiblePlaceholders", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarOverlayViewHolder extends AbstractC6065b<NavBarVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int toolbarHeight = ResourceExtKt.toPx(56);
    private final AppBarLayout appBar;

    @NotNull
    private final WidgetNavbarBinding binding;
    private final CollapsingToolbarLayout collapsingToolbar;

    @NotNull
    private final View containerView;
    private final Context context;

    @NotNull
    private final HashMap<String, VisiblePlaceholders> currentPlaceholders;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;
    private NavBarVO dataItem;

    @NotNull
    private final String disabledColorFilteringTag;

    @NotNull
    private final NavBarOverlayViewHolder$expandedOffsetListener$1 expandedOffsetListener;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final Handler handler;

    @NotNull
    private final View metricView;

    @NotNull
    private final NavBarColorHelper navBarColorHelper;

    @NotNull
    private final g router;

    @NotNull
    private final NavBarOverlayViewHolder$scrollListener$1 scrollListener;
    private final Toolbar toolbar;
    private int[] toolbarPaddings;

    @NotNull
    private final i uiContainer;

    @NotNull
    private final WidgetTokenizedAnalytics widgetTokenizedAnalytics;

    @NotNull
    private final a widgetsFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$Companion;", "", "<init>", "()V", "", "COMPOSER_TOOLBAR_TOP_PADDING", "I", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR!\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$VisiblePlaceholders;", "", "", "placeholderKey", "", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "placeholders", "", "areContentTheSame", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lru/ozon/app/android/storefront/navBar/NavBarOverlayViewHolder$VisiblePlaceholders;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholderKey", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "Z", "getAreContentTheSame", "()Z", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class VisiblePlaceholders {
        private final boolean areContentTheSame;

        @NotNull
        private final String placeholderKey;

        @NotNull
        private final List<l> placeholders;

        public VisiblePlaceholders(@NotNull String placeholderKey, @NotNull List<l> placeholders, boolean z11) {
            Intrinsics.checkNotNullParameter(placeholderKey, "placeholderKey");
            Intrinsics.checkNotNullParameter(placeholders, "placeholders");
            this.placeholderKey = placeholderKey;
            this.placeholders = placeholders;
            this.areContentTheSame = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VisiblePlaceholders copy$default(VisiblePlaceholders visiblePlaceholders, String str, List list, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = visiblePlaceholders.placeholderKey;
            }
            if ((i11 & 2) != 0) {
                list = visiblePlaceholders.placeholders;
            }
            if ((i11 & 4) != 0) {
                z11 = visiblePlaceholders.areContentTheSame;
            }
            return visiblePlaceholders.copy(str, list, z11);
        }

        @NotNull
        public final VisiblePlaceholders copy(@NotNull String placeholderKey, @NotNull List<l> placeholders, boolean areContentTheSame) {
            Intrinsics.checkNotNullParameter(placeholderKey, "placeholderKey");
            Intrinsics.checkNotNullParameter(placeholders, "placeholders");
            return new VisiblePlaceholders(placeholderKey, placeholders, areContentTheSame);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisiblePlaceholders)) {
                return false;
            }
            VisiblePlaceholders visiblePlaceholders = (VisiblePlaceholders) other;
            return Intrinsics.d(this.placeholderKey, visiblePlaceholders.placeholderKey) && Intrinsics.d(this.placeholders, visiblePlaceholders.placeholders) && this.areContentTheSame == visiblePlaceholders.areContentTheSame;
        }

        public final boolean getAreContentTheSame() {
            return this.areContentTheSame;
        }

        @NotNull
        public final List<l> getPlaceholders() {
            return this.placeholders;
        }

        public int hashCode() {
            return Boolean.hashCode(this.areContentTheSame) + G.g.b(this.placeholderKey.hashCode() * 31, 31, this.placeholders);
        }

        @NotNull
        public String toString() {
            String str = this.placeholderKey;
            List<l> list = this.placeholders;
            return Pk0.a.a(")", b.f("VisiblePlaceholders(placeholderKey=", str, ", placeholders=", ", areContentTheSame=", list), this.areContentTheSame);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$expandedOffsetListener$1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$scrollListener$1] */
    public NavBarOverlayViewHolder(@NotNull i uiContainer, @NotNull View containerView, Toolbar toolbar, CollapsingToolbarLayout collapsingToolbarLayout, AppBarLayout appBarLayout, @NotNull g router, @NotNull a widgetsFactory, @NotNull WidgetTokenizedAnalytics widgetTokenizedAnalytics, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(uiContainer, "uiContainer");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(widgetsFactory, "widgetsFactory");
        Intrinsics.checkNotNullParameter(widgetTokenizedAnalytics, "widgetTokenizedAnalytics");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.uiContainer = uiContainer;
        this.containerView = containerView;
        this.toolbar = toolbar;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.appBar = appBarLayout;
        this.router = router;
        this.widgetsFactory = widgetsFactory;
        this.widgetTokenizedAnalytics = widgetTokenizedAnalytics;
        this.featureChecker = featureChecker;
        WidgetNavbarBinding bind = WidgetNavbarBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.metricView = containerView;
        Context context = containerView.getContext();
        this.context = context;
        this.handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.navBarColorHelper = new NavBarColorHelper(context);
        this.disabledColorFilteringTag = StringProvider.getString(R$string.commonwidgets_navbar_disable_color_filtering);
        this.currentViewHolders = new HashMap<>();
        this.currentPlaceholders = new HashMap<>();
        this.expandedOffsetListener = new AppBarLayout.f() { // from class: ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$expandedOffsetListener$1
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public void onOffsetChanged(AppBarLayout appBarLayout2, int verticalOffset) {
                CollapsingToolbarLayout collapsingToolbarLayout2;
                NavBarColorHelper navBarColorHelper;
                NavBarColors expandedColors;
                i iVar;
                NavBarColorHelper navBarColorHelper2;
                Intrinsics.checkNotNullParameter(appBarLayout2, "appBarLayout");
                collapsingToolbarLayout2 = NavBarOverlayViewHolder.this.collapsingToolbar;
                if (collapsingToolbarLayout2 == null) {
                    return;
                }
                if (collapsingToolbarLayout2.getHeight() + verticalOffset < collapsingToolbarLayout2.b()) {
                    navBarColorHelper2 = NavBarOverlayViewHolder.this.navBarColorHelper;
                    expandedColors = navBarColorHelper2.defaultColors();
                } else {
                    navBarColorHelper = NavBarOverlayViewHolder.this.navBarColorHelper;
                    expandedColors = navBarColorHelper.expandedColors();
                }
                if (expandedColors == null) {
                    return;
                }
                StatusBarController statusBarController = StatusBarController.INSTANCE;
                iVar = NavBarOverlayViewHolder.this.uiContainer;
                StatusBarController.setStatusBarContentColor$default(statusBarController, iVar.K().b(), StatusBarController.UpdateReason.NewState.INSTANCE, expandedColors.getIsBgColorDark(), false, 8, null);
                NavBarOverlayViewHolder.this.setIconsColor(expandedColors.getIconColor());
            }
        };
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                AppBarLayout appBarLayout2;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                recyclerView.removeOnScrollListener(this);
                appBarLayout2 = NavBarOverlayViewHolder.this.appBar;
                if (appBarLayout2 != null) {
                    appBarLayout2.t(recyclerView.computeVerticalScrollOffset() <= 0, false);
                }
            }
        };
        observeBusEvents();
        observeLifecycle();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void addNestedWidgets(NavBarVO item) {
        ViewGroup viewGroup;
        for (Map.Entry<String, VisiblePlaceholders> entry : this.currentPlaceholders.entrySet()) {
            String key = entry.getKey();
            VisiblePlaceholders value = entry.getValue();
            switch (key.hashCode()) {
                case -1939100487:
                    if (key.equals(NavBarDTO.NESTED_PLACEHOLDER_EXPANDED)) {
                        viewGroup = getExpandedContainerOrNull(item.getIsExpanded());
                        break;
                    }
                    viewGroup = null;
                    break;
                case 3317767:
                    if (key.equals("left")) {
                        viewGroup = this.binding.actionPointsLeftLL;
                        break;
                    }
                    viewGroup = null;
                    break;
                case 108511772:
                    if (key.equals("right")) {
                        LinearLayout linearLayout = this.binding.actionPointsRightLL;
                        Intrinsics.f(linearLayout);
                        ViewExtKt.updatePadding$default(linearLayout, 0, 0, ResourceExtKt.toPx(10), 0, 11, null);
                        viewGroup = linearLayout;
                        break;
                    }
                    viewGroup = null;
                    break;
                case 1544803905:
                    if (key.equals("default")) {
                        viewGroup = this.binding.placeholderFl;
                        break;
                    }
                    viewGroup = null;
                    break;
                default:
                    viewGroup = null;
                    break;
            }
            if (viewGroup != null && !value.getAreContentTheSame()) {
                List<l> placeholders = value.getPlaceholders();
                if (!(placeholders instanceof Collection) || !placeholders.isEmpty()) {
                    Iterator<T> it = placeholders.iterator();
                    while (it.hasNext()) {
                        if (((l) it.next()).d() instanceof Savable) {
                            addNestedWidgetsIntoViewGroup(item, value.getPlaceholders(), viewGroup);
                        }
                    }
                }
                removeViewsIfNotEmpty(viewGroup);
                addNestedWidgetsIntoViewGroup(item, value.getPlaceholders(), viewGroup);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addNestedWidgetsIntoViewGroup(NavBarVO item, List<l> viewObjects, ViewGroup parent) {
        int iconColor;
        Integer num;
        this.binding.actionPointsLeftLL.setMinimumWidth(ResourceExtKt.toPx(12));
        this.binding.actionPointsRightLL.setMinimumWidth(ResourceExtKt.toPx(12));
        ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(parent, this.uiContainer);
        if (viewObjects != null) {
            for (l lVar : viewObjects) {
                if ((lVar.d() instanceof Savable) && this.currentViewHolders.containsKey(Integer.valueOf(lVar.j()))) {
                    k<c> kVar = this.currentViewHolders.get(Integer.valueOf(lVar.j()));
                    if (kVar == null) {
                        return;
                    } else {
                        k.bindItem$default(kVar, lVar.d(), lVar.c(), null, 4, null);
                    }
                } else {
                    int j11 = lVar.j();
                    this.widgetsFactory.c(iVar, lVar);
                    k<c> f7 = this.widgetsFactory.f(iVar, lVar.j());
                    if (f7 != 0) {
                        if ((f7 instanceof NavBarSearchRedesignProvider) && this.featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE)) {
                            this.binding.actionPointsLeftLL.setMinimumWidth(ResourceExtKt.toPx(8));
                            this.binding.actionPointsRightLL.setMinimumWidth(ResourceExtKt.toPx(8));
                        }
                        f7.bindTrackingData(lVar, lVar.n(), this.uiContainer.c0());
                        f7.track(lVar);
                        f7.bindPlaceholders(lVar.g(), lVar.h());
                        k.bindItem$default(f7, lVar.d(), lVar.c(), null, 4, null);
                        f7.setLifecycleState(AbstractC5434v.b.RESUMED);
                        if (f7 instanceof NavBarModelProvider) {
                            ((NavBarModelProvider) f7).provideNavBarModelListener(new NavBarOverlayViewHolder$addNestedWidgetsIntoViewGroup$1$1$1(this, null));
                        }
                        if (item != null) {
                            boolean isExpanded = isExpanded(item, this.currentPlaceholders);
                            NavBarColors defaultColors = this.navBarColorHelper.defaultColors();
                            NavBarColors expandedColors = this.navBarColorHelper.expandedColors();
                            if (isExpanded) {
                                if (expandedColors != null) {
                                    iconColor = expandedColors.getIconColor();
                                    num = Integer.valueOf(iconColor);
                                }
                                num = null;
                            } else {
                                if (defaultColors != null) {
                                    iconColor = defaultColors.getIconColor();
                                    num = Integer.valueOf(iconColor);
                                }
                                num = null;
                            }
                            if (num != null && !Intrinsics.d(f7.itemView.getTag(), this.disabledColorFilteringTag)) {
                                View view = f7.itemView;
                                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                                if (imageView != null) {
                                    imageView.setColorFilter(num.intValue());
                                }
                            }
                        }
                        this.currentViewHolders.put(Integer.valueOf(j11), f7);
                        parent.addView(f7.itemView);
                    }
                }
            }
        }
    }

    private final void addToToolbar() {
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (collapsingToolbarLayout != null) {
            ViewExtKt.show(collapsingToolbarLayout);
        }
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            this.toolbarPaddings = new int[]{toolbar.getPaddingLeft(), toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom()};
            toolbar.setPadding(0, ResourceExtKt.toPx(8), 0, 0);
            toolbar.removeAllViews();
            toolbar.addView(this.containerView);
            ViewExtKt.show(toolbar);
        }
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(this.uiContainer.Z());
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.requestLayout();
        }
    }

    private final void applyColors(NavBarVO item, NavBarColors colors) {
        StatusBarController.setStatusBarContentColor$default(StatusBarController.INSTANCE, this.uiContainer.K().b(), StatusBarController.UpdateReason.NewState.INSTANCE, colors.getIsBgColorDark(), false, 8, null);
        setNavBarColor(colors.getBackgroundColor(), colors.getStatusBarColor());
        LinearLayout actionPointsRightLL = this.binding.actionPointsRightLL;
        Intrinsics.checkNotNullExpressionValue(actionPointsRightLL, "actionPointsRightLL");
        createActionPoints(actionPointsRightLL, item.getActionPointsRight(), colors.getIconColor());
        LinearLayout actionPointsLeftLL = this.binding.actionPointsLeftLL;
        Intrinsics.checkNotNullExpressionValue(actionPointsLeftLL, "actionPointsLeftLL");
        createActionPoints(actionPointsLeftLL, item.getActionPointsLeft(), colors.getIconColor());
    }

    private final boolean areContentsTheSame(l oldItem, l newItem) {
        return Intrinsics.d(oldItem.d(), newItem.d()) && Intrinsics.d(oldItem.g(), newItem.g());
    }

    private final boolean areItemsTheSame(l oldItem, l newItem) {
        return oldItem.j() == newItem.j() && ((oldItem.d().getId() > newItem.d().getId() ? 1 : (oldItem.d().getId() == newItem.d().getId() ? 0 : -1)) == 0);
    }

    private final boolean areObjectsTheSame(List<l> composerObjects, List<l> visiblePlaceholderObjects) {
        int size = composerObjects.size();
        for (int i11 = 0; i11 < size; i11++) {
            l lVar = (l) C7714v.Q(i11, visiblePlaceholderObjects);
            if (lVar == null) {
                return false;
            }
            l lVar2 = composerObjects.get(i11);
            if (!areItemsTheSame(lVar, lVar2) || !areContentsTheSame(lVar, lVar2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(NavBarOverlayViewHolder navBarOverlayViewHolder) {
        ComposerListBehavior composerListBehavior = ComposerViewExtensionKt.composerListBehavior(navBarOverlayViewHolder.uiContainer.Z());
        if (composerListBehavior != null) {
            composerListBehavior.x();
        }
    }

    private final void createActionPoints(ViewGroup container, List<NavBarVO.Action> actionPoints, int iconColor) {
        if (actionPoints == null) {
            return;
        }
        for (NavBarVO.Action action : actionPoints) {
            if (action.getType() == NavBarVO.ActionType.ACTION) {
                container.addView(createImageAction(action, iconColor));
            }
        }
    }

    private final View createImageAction(NavBarVO.Action action, int iconColor) {
        View inflate = View.inflate(this.containerView.getContext(), R$layout.widget_navbar_action, null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) inflate;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int dim = ResourceExtKt.dim(context, R$dimen.navbar_action_points_size);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(dim, dim));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ImageViewExtKt.load$default(imageView, action.getImage(), null, null, null, null, false, null, 126, null);
        imageView.setColorFilter(iconColor);
        imageView.setOnClickListener(new EE.b(1, action, this));
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createImageAction$lambda$33$lambda$32(NavBarVO.Action action, NavBarOverlayViewHolder navBarOverlayViewHolder, View view) {
        String deeplink = action.getDeeplink();
        if (deeplink != null) {
            g.a.a(navBarOverlayViewHolder.router, deeplink, null, null, 6);
            navBarOverlayViewHolder.widgetTokenizedAnalytics.click(navBarOverlayViewHolder.getTrackingData());
        }
    }

    private final void detachNestedViewHolders() {
        Collection<k<c>> values = this.currentViewHolders.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((k) it.next()).setLifecycleState(AbstractC5434v.b.DESTROYED);
        }
        this.currentViewHolders.clear();
    }

    private final void disableExpanding() {
        setFullScreen(false);
        AppBarLayout appBarLayout = this.appBar;
        if (appBarLayout != null) {
            appBarLayout.q(this.expandedOffsetListener);
        }
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            if (!(layoutParams instanceof CollapsingToolbarLayout.a)) {
                layoutParams = null;
            }
            CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
            if (aVar != null) {
                ((FrameLayout.LayoutParams) aVar).topMargin = 0;
                aVar.a(0);
            }
        }
        final CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setBackground(null);
            collapsingToolbarLayout.d(null);
            collapsingToolbarLayout.g(null);
            ViewGroup.LayoutParams layoutParams2 = collapsingToolbarLayout.getLayoutParams();
            AppBarLayout.d dVar = layoutParams2 instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams2 : null;
            if (dVar != null) {
                dVar.b(0);
            }
            ConstraintLayout composerExpandedContainer = ComposerViewExtensionKt.composerExpandedContainer(collapsingToolbarLayout);
            if (composerExpandedContainer != null) {
                composerExpandedContainer.setBackground(null);
                composerExpandedContainer.removeAllViews();
                ViewExtKt.gone(composerExpandedContainer);
            }
            collapsingToolbarLayout.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: YJ.d
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i11) {
                    NavBarOverlayViewHolder.disableExpanding$lambda$16$lambda$15(CollapsingToolbarLayout.this, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disableExpanding$lambda$16$lambda$15(CollapsingToolbarLayout collapsingToolbarLayout, int i11) {
        collapsingToolbarLayout.post(new e(collapsingToolbarLayout, 0));
    }

    private final void disableFullScreenForExpanding() {
        NavBarVO navBarVO = this.dataItem;
        if (navBarVO == null || !isExpanded(navBarVO, this.currentPlaceholders)) {
            return;
        }
        setFullScreen(false);
    }

    private final void enableExpanding(NavBarColors.Expanded colors, boolean isHiding) {
        int i11;
        setFullScreen(true);
        AppBarLayout appBarLayout = this.appBar;
        if (appBarLayout != null) {
            observeSystemInsets(appBarLayout);
            appBarLayout.q(this.expandedOffsetListener);
            appBarLayout.d(this.expandedOffsetListener);
        }
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            if (!(layoutParams instanceof CollapsingToolbarLayout.a)) {
                layoutParams = null;
            }
            CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
            if (aVar != null) {
                aVar.a(!isHiding ? 1 : 0);
            }
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (collapsingToolbarLayout != null) {
            ConstraintLayout composerExpandedContainer = ComposerViewExtensionKt.composerExpandedContainer(collapsingToolbarLayout);
            Intrinsics.f(composerExpandedContainer);
            ViewGroup.LayoutParams layoutParams2 = composerExpandedContainer.getLayoutParams();
            if (!(layoutParams2 instanceof CollapsingToolbarLayout.a)) {
                layoutParams2 = null;
            }
            CollapsingToolbarLayout.a aVar2 = (CollapsingToolbarLayout.a) layoutParams2;
            if (aVar2 != null) {
                if (isHiding) {
                    i11 = 0;
                } else {
                    aVar2.b(0.9f);
                    i11 = 2;
                }
                aVar2.a(i11);
            }
            composerExpandedContainer.setBackgroundColor(colors.getBackgroundColor());
            ViewExtKt.show(composerExpandedContainer);
            Integer scrimColor = colors.getScrimColor();
            if (scrimColor != null) {
                int intValue = scrimColor.intValue();
                collapsingToolbarLayout.d(new ColorDrawable(intValue));
                collapsingToolbarLayout.g(new ColorDrawable(intValue));
            }
            collapsingToolbarLayout.f();
            int i12 = isHiding ? 8 : 2;
            ViewGroup.LayoutParams layoutParams3 = collapsingToolbarLayout.getLayoutParams();
            AppBarLayout.d dVar = layoutParams3 instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams3 : null;
            if (dVar != null) {
                dVar.b(i12 | 17);
            }
            collapsingToolbarLayout.setOnSystemUiVisibilityChangeListener(null);
        }
    }

    private final List<View> getAllChildrenColorFilterable(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = C5316f0.b(viewGroup).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return arrayList;
            }
            View view = (View) c5314e0.next();
            if (!Intrinsics.d(view.getTag(), StringProvider.getString(R$string.commonwidgets_navbar_disable_color_filtering))) {
                arrayList.add(view);
                if (view instanceof ViewGroup) {
                    arrayList.addAll(getAllChildrenColorFilterable((ViewGroup) view));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getExpandedContainerOrNull(boolean expanded) {
        if (expanded) {
            return ComposerViewExtensionKt.composerExpandedContainer(this.uiContainer.Z());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasLeftPlaceholder() {
        return this.currentPlaceholders.containsKey("left");
    }

    private final boolean isColorDark(int color) {
        return ((double) 1) - (((((double) Color.blue(color)) * 0.114d) + ((((double) Color.green(color)) * 0.587d) + (((double) Color.red(color)) * 0.299d))) / ((double) 255)) >= 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isExpanded(NavBarVO item, Map<String, VisiblePlaceholders> placeholders) {
        List<l> placeholders2;
        if (item.getIsExpanded()) {
            VisiblePlaceholders visiblePlaceholders = placeholders.get(NavBarDTO.NESTED_PLACEHOLDER_EXPANDED);
            if ((visiblePlaceholders == null || (placeholders2 = visiblePlaceholders.getPlaceholders()) == null) ? false : !placeholders2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final void observeBusEvents() {
        this.uiContainer.M().getEvents().observe(this.uiContainer.K().f(), new NavBarOverlayViewHolder$sam$androidx_lifecycle_Observer$0(new NavBarOverlayViewHolder$observeBusEvents$1(this)));
    }

    private final void observeLifecycle() {
        this.uiContainer.K().f().getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder$observeLifecycle$1
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
            
                r0 = r3.appBar;
             */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onDestroy(J owner) {
                i iVar;
                AppBarLayout appBarLayout;
                NavBarOverlayViewHolder$expandedOffsetListener$1 navBarOverlayViewHolder$expandedOffsetListener$1;
                Intrinsics.checkNotNullParameter(owner, "owner");
                NavBarOverlayViewHolder navBarOverlayViewHolder = NavBarOverlayViewHolder.this;
                NavBarVO navBarVO = navBarOverlayViewHolder.dataItem;
                if (navBarVO != null && navBarOverlayViewHolder.isExpanded(navBarVO, navBarOverlayViewHolder.currentPlaceholders) && appBarLayout != null) {
                    navBarOverlayViewHolder$expandedOffsetListener$1 = navBarOverlayViewHolder.expandedOffsetListener;
                    appBarLayout.q(navBarOverlayViewHolder$expandedOffsetListener$1);
                }
                iVar = NavBarOverlayViewHolder.this.uiContainer;
                iVar.K().f().getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                NavBarOverlayViewHolder navBarOverlayViewHolder = NavBarOverlayViewHolder.this;
                NavBarVO navBarVO = navBarOverlayViewHolder.dataItem;
                if (navBarVO == null || !navBarOverlayViewHolder.isExpanded(navBarVO, navBarOverlayViewHolder.currentPlaceholders)) {
                    return;
                }
                navBarOverlayViewHolder.setFullScreen(true);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                NavBarOverlayViewHolder navBarOverlayViewHolder = NavBarOverlayViewHolder.this;
                NavBarVO navBarVO = navBarOverlayViewHolder.dataItem;
                if (navBarVO == null || !navBarOverlayViewHolder.isExpanded(navBarVO, navBarOverlayViewHolder.currentPlaceholders)) {
                    return;
                }
                navBarOverlayViewHolder.setFullScreen(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeSystemInsets(AppBarLayout composerAppbar) {
        composerAppbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: YJ.c
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets observeSystemInsets$lambda$26;
                observeSystemInsets$lambda$26 = NavBarOverlayViewHolder.observeSystemInsets$lambda$26(NavBarOverlayViewHolder.this, view, windowInsets);
                return observeSystemInsets$lambda$26;
            }
        });
        composerAppbar.requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets observeSystemInsets$lambda$26(NavBarOverlayViewHolder navBarOverlayViewHolder, View view, WindowInsets insets) {
        WindowInsets replaceSystemWindowInsets;
        Insets of2;
        WindowInsets.Builder systemWindowInsets;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Toolbar toolbar = navBarOverlayViewHolder.toolbar;
        if (toolbar != null) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = insets.getSystemWindowInsetTop();
            }
        }
        int systemWindowInsetLeft = insets.getSystemWindowInsetLeft();
        int systemWindowInsetTop = insets.getSystemWindowInsetTop();
        Toolbar toolbar2 = navBarOverlayViewHolder.toolbar;
        Rect rect = new Rect(systemWindowInsetLeft, systemWindowInsetTop + (toolbar2 != null ? toolbar2.getMeasuredHeight() : 0), insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 29) {
            WindowInsets.Builder a11 = C0.a(insets);
            of2 = Insets.of(rect);
            systemWindowInsets = a11.setSystemWindowInsets(of2);
            replaceSystemWindowInsets = systemWindowInsets.build();
        } else {
            replaceSystemWindowInsets = insets.replaceSystemWindowInsets(rect);
        }
        Intrinsics.f(replaceSystemWindowInsets);
        ViewGroup expandedContainerOrNull = navBarOverlayViewHolder.getExpandedContainerOrNull(true);
        if (expandedContainerOrNull != null) {
            expandedContainerOrNull.dispatchApplyWindowInsets(replaceSystemWindowInsets);
        }
        return replaceSystemWindowInsets.consumeSystemWindowInsets();
    }

    private final void parsePlaceholders(l viewItem) {
        Map<String, List<l>> g10;
        VisiblePlaceholders visiblePlaceholders;
        if (viewItem == null || (g10 = viewItem.g()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d11 = Intrinsics.d(viewItem.d(), this.dataItem);
        for (Map.Entry<String, List<l>> entry : g10.entrySet()) {
            String key = entry.getKey();
            List<l> value = entry.getValue();
            VisiblePlaceholders visiblePlaceholders2 = this.currentPlaceholders.get(key);
            List<l> placeholders = visiblePlaceholders2 != null ? visiblePlaceholders2.getPlaceholders() : null;
            boolean areObjectsTheSame = (!d11 || placeholders == null || Intrinsics.d(key, "left") || Intrinsics.d(key, "right")) ? false : areObjectsTheSame(value, placeholders);
            if (!areObjectsTheSame && placeholders != null) {
                for (l lVar : placeholders) {
                    if (!(lVar.d() instanceof Savable)) {
                        k<c> kVar = this.currentViewHolders.get(Integer.valueOf(lVar.j()));
                        if (kVar != null) {
                            kVar.setLifecycleState(AbstractC5434v.b.DESTROYED);
                        }
                        this.currentViewHolders.remove(Integer.valueOf(lVar.j()));
                    }
                }
            }
            if (visiblePlaceholders2 == null || (visiblePlaceholders = VisiblePlaceholders.copy$default(visiblePlaceholders2, null, value, areObjectsTheSame, 1, null)) == null) {
                visiblePlaceholders = new VisiblePlaceholders(key, value, false);
            }
            linkedHashMap.put(key, visiblePlaceholders);
        }
        this.currentPlaceholders.clear();
        this.currentPlaceholders.putAll(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object provideSnapshot(View view, d<? super Bitmap> dVar) {
        Window window = this.uiContainer.K().g().getWindow();
        Intrinsics.f(window);
        return j.c(view, window, this.uiContainer.K().h(), dVar);
    }

    private final void removeToolbar() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            int[] iArr = this.toolbarPaddings;
            if (iArr != null) {
                toolbar.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            this.toolbarPaddings = null;
            toolbar.removeAllViews();
            ViewExtKt.gone(toolbar);
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        if (collapsingToolbarLayout != null) {
            ViewExtKt.gone(collapsingToolbarLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeViewsIfNotEmpty(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFullScreen(boolean enabled) {
        this.uiContainer.Z().setFitsSystemWindows(!enabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIconsColor(int iconColor) {
        LinearLayout actionPointsLeftLL = this.binding.actionPointsLeftLL;
        Intrinsics.checkNotNullExpressionValue(actionPointsLeftLL, "actionPointsLeftLL");
        List<View> allChildrenColorFilterable = getAllChildrenColorFilterable(actionPointsLeftLL);
        LinearLayout actionPointsRightLL = this.binding.actionPointsRightLL;
        Intrinsics.checkNotNullExpressionValue(actionPointsRightLL, "actionPointsRightLL");
        ArrayList p02 = C7714v.p0(getAllChildrenColorFilterable(actionPointsRightLL), allChildrenColorFilterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ImageView) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ImageView) it2.next()).setColorFilter(iconColor);
        }
    }

    private final void setNavBarColor(int toolbarColor, int statusBarColor) {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.setBackgroundColor(toolbarColor);
        }
        setStatusBarColors(statusBarColor);
    }

    private final void setNavBarNavigationIcon() {
        Drawable navigationIcon;
        Toolbar toolbar = this.toolbar;
        if (toolbar == null || (navigationIcon = toolbar.getNavigationIcon()) == null) {
            return;
        }
        View inflate = LayoutInflater.from(this.containerView.getContext()).inflate(R$layout.widget_navbar_back, (ViewGroup) this.binding.actionPointsLeftLL, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) inflate;
        imageView.setImageDrawable(navigationIcon);
        imageView.setOnClickListener(new DN.a(this, 7));
        LinearLayout actionPointsLeftLL = this.binding.actionPointsLeftLL;
        Intrinsics.checkNotNullExpressionValue(actionPointsLeftLL, "actionPointsLeftLL");
        removeViewsIfNotEmpty(actionPointsLeftLL);
        this.binding.actionPointsLeftLL.addView(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNavBarNavigationIcon$lambda$28$lambda$27(NavBarOverlayViewHolder navBarOverlayViewHolder, View view) {
        Context L11 = navBarOverlayViewHolder.uiContainer.L();
        androidx.appcompat.app.g gVar = L11 instanceof androidx.appcompat.app.g ? (androidx.appcompat.app.g) L11 : null;
        if (gVar != null) {
            gVar.onSupportNavigateUp();
        }
    }

    private final void setScrollingBehaviour(boolean isHiding) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.collapsingToolbar;
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout != null ? collapsingToolbarLayout.getLayoutParams() : null;
        AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
        if (dVar == null) {
            return;
        }
        if (isHiding) {
            dVar.b(5);
        } else {
            dVar.b(0);
        }
    }

    private final void setStatusBarColors(int color) {
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        ComponentCallbacksC5392m b11 = this.uiContainer.K().b();
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(b11, newState, color);
        statusBarController.setStatusBarContentColor(this.uiContainer.K().b(), newState, isColorDark(color), true);
    }

    private final void updatePlaceholderMargins() {
        List<l> placeholders;
        VisiblePlaceholders visiblePlaceholders = this.currentPlaceholders.get("default");
        if (visiblePlaceholders == null || (placeholders = visiblePlaceholders.getPlaceholders()) == null) {
            return;
        }
        Iterator<T> it = placeholders.iterator();
        while (it.hasNext()) {
            if (((l) it.next()).d() instanceof NavTitleCenteredInterface) {
                LinearLayout actionPointsLeftLL = this.binding.actionPointsLeftLL;
                Intrinsics.checkNotNullExpressionValue(actionPointsLeftLL, "actionPointsLeftLL");
                MeasureExtKt.measureUnspecified(actionPointsLeftLL);
                LinearLayout actionPointsRightLL = this.binding.actionPointsRightLL;
                Intrinsics.checkNotNullExpressionValue(actionPointsRightLL, "actionPointsRightLL");
                MeasureExtKt.measureUnspecified(actionPointsRightLL);
                int measuredWidth = this.binding.actionPointsLeftLL.getMeasuredWidth();
                int measuredWidth2 = this.binding.actionPointsRightLL.getMeasuredWidth();
                FrameLayout placeholderFl = this.binding.placeholderFl;
                Intrinsics.checkNotNullExpressionValue(placeholderFl, "placeholderFl");
                ViewGroup.LayoutParams layoutParams = placeholderFl.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (measuredWidth == 0 && measuredWidth2 > 0) {
                    layoutParams2.leftMargin = measuredWidth2;
                } else if (measuredWidth2 == 0 && measuredWidth > 0) {
                    layoutParams2.rightMargin = measuredWidth;
                } else if (measuredWidth2 > 0 && measuredWidth > 0 && measuredWidth2 > measuredWidth) {
                    layoutParams2.leftMargin = measuredWidth2 - measuredWidth;
                } else if (measuredWidth2 > 0 && measuredWidth > 0 && measuredWidth2 < measuredWidth) {
                    layoutParams2.rightMargin = measuredWidth - measuredWidth2;
                }
                placeholderFl.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        addToToolbar();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        removeToolbar();
        if (getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            disableFullScreenForExpanding();
        }
        disableExpanding();
        detachNestedViewHolders();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull NavBarVO item) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        Intrinsics.checkNotNullParameter(item, "item");
        this.handler.post(new RunnableC3170a(this, 3));
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            Object tag = toolbar.getTag();
            if (!Intrinsics.d(tag instanceof Boolean ? (Boolean) tag : null, Boolean.TRUE)) {
                toolbar = null;
            }
            if (toolbar != null) {
                parsePlaceholders(getViewItem());
                this.dataItem = item;
                Toolbar toolbar2 = this.toolbar;
                ViewGroup.LayoutParams layoutParams = toolbar2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int i11 = toolbarHeight;
                layoutParams.height = i11;
                toolbar2.setLayoutParams(layoutParams);
                LinearLayout actionPointsLeftLL = this.binding.actionPointsLeftLL;
                Intrinsics.checkNotNullExpressionValue(actionPointsLeftLL, "actionPointsLeftLL");
                removeViewsIfNotEmpty(actionPointsLeftLL);
                LinearLayout actionPointsRightLL = this.binding.actionPointsRightLL;
                Intrinsics.checkNotNullExpressionValue(actionPointsRightLL, "actionPointsRightLL");
                removeViewsIfNotEmpty(actionPointsRightLL);
                boolean isExpanded = isExpanded(item, this.currentPlaceholders);
                this.navBarColorHelper.parseNavBarColors(item.getStates(), isExpanded);
                addNestedWidgets(item);
                if (isExpanded) {
                    RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(this.uiContainer.Z());
                    if (composerRecyclerViewOrNull != null) {
                        composerRecyclerViewOrNull.addOnScrollListener(this.scrollListener);
                    }
                    NavBarColors expandedColors = this.navBarColorHelper.expandedColors();
                    if (expandedColors instanceof NavBarColors.Expanded) {
                        enableExpanding((NavBarColors.Expanded) expandedColors, item.getIsHiding());
                        applyColors(item, expandedColors);
                        if (!getHasLeftPlaceholder()) {
                            setNavBarNavigationIcon();
                        }
                    }
                } else {
                    NavBarColors defaultColors = this.navBarColorHelper.defaultColors();
                    disableExpanding();
                    CollapsingToolbarLayout collapsingToolbarLayout2 = this.collapsingToolbar;
                    if ((collapsingToolbarLayout2 == null || collapsingToolbarLayout2.getHeight() != i11) && (collapsingToolbarLayout = this.collapsingToolbar) != null) {
                        ViewGroup.LayoutParams layoutParams2 = collapsingToolbarLayout.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams2.height = i11;
                        collapsingToolbarLayout.setLayoutParams(layoutParams2);
                    }
                    setScrollingBehaviour(item.getIsHiding());
                    if (defaultColors != null) {
                        applyColors(item, defaultColors);
                        if (!getHasLeftPlaceholder()) {
                            setNavBarNavigationIcon();
                        }
                    }
                }
                updatePlaceholderMargins();
            }
        }
    }
}
