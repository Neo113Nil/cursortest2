package ru.ozon.app.android.geo.map.presentation.viewmapper;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.O0;
import Ae.x0;
import C.g0;
import Fy.ViewOnLayoutChangeListenerC3067e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentSender;
import android.graphics.Outline;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.c;
import androidx.vectordrawable.graphics.drawable.e;
import c3.C5739a;
import c3.C5741c;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import i10.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.analytics.extensions.TraceApiKt;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.geo.R$string;
import ru.ozon.app.android.geo.databinding.MapDetailsBottomSheetBinding;
import ru.ozon.app.android.geo.databinding.WidgetNouiAddressEditMapBinding;
import ru.ozon.app.android.geo.databinding.WidgetSplitShortInfoBinding;
import ru.ozon.app.android.geo.map.DetailsSheetManager;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.performance.MapPerformanceAnalyticsManager;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapMapperKt;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVOKt;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVOWithPayloads;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.PageIconsAdapter;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.banner.MapBannerContainerImpl;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.controls.v2.MapControlsContainerWithExpandedFilters;
import ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider;
import ru.ozon.app.android.geo.map.presentation.selector.SwitchButtonsLayout;
import ru.ozon.app.android.geo.map.presentation.utils.MapAnimator;
import ru.ozon.app.android.geo.map.presentation.utils.PageModifier;
import ru.ozon.app.android.geo.map.presentation.utils.SheetPageHelper;
import ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapState;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.geo.map.presentation.views.AddressEditMapView;
import ru.ozon.app.android.geo.map.utils.BottomSheetActionParams;
import ru.ozon.app.android.geo.map.utils.CameraMotionState;
import ru.ozon.app.android.geo.map.utils.UtilsKt;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.SplitShortInfoWidgetVH;
import ru.ozon.app.android.geo.splitShortInfoWidgetKey.data.SplitShortInfoVO;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.CameraUpdateReasonModel;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;
import ru.ozon.app.android.mapcommon.map.model.LogoPosition;
import ru.ozon.app.android.mapcommon.map.model.ScreenRectModel;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.permission.extension.FragmentsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.PermissionExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.tabs.TabsHolderKt;
import ru.ozon.uni.core.UniColors;
import we0.u;
import xe.B0;
import xe.Y;

@Metadata(d1 = {"\u0000\u0096\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 Ô\u00022\u00020\u0001:\u0002Ô\u0002B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00120\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0018¢\u0006\u0004\b0\u0010!J\r\u00101\u001a\u00020\u0018¢\u0006\u0004\b1\u0010!J\u0017\u00104\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0018¢\u0006\u0004\b6\u0010!J\r\u00107\u001a\u00020\u0018¢\u0006\u0004\b7\u0010!J\u0015\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;JK\u0010C\u001a\u00020\u00182\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010?\u001a\u0004\u0018\u00010>2\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0018¢\u0006\u0004\bE\u0010!J\r\u0010F\u001a\u00020\u0018¢\u0006\u0004\bF\u0010!J\r\u0010G\u001a\u00020\u0018¢\u0006\u0004\bG\u0010!J\r\u0010H\u001a\u00020\u0018¢\u0006\u0004\bH\u0010!J\r\u0010I\u001a\u00020\u0018¢\u0006\u0004\bI\u0010!J\u001d\u0010N\u001a\u00020\u00182\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0018¢\u0006\u0004\bP\u0010!J\r\u0010Q\u001a\u00020\u0018¢\u0006\u0004\bQ\u0010!J\r\u0010R\u001a\u00020\u0018¢\u0006\u0004\bR\u0010!J\u000f\u0010S\u001a\u00020\u0018H\u0002¢\u0006\u0004\bS\u0010!J\u000f\u0010T\u001a\u00020\u0018H\u0002¢\u0006\u0004\bT\u0010!J\u000f\u0010U\u001a\u00020\u0018H\u0002¢\u0006\u0004\bU\u0010!J'\u0010Z\u001a\u00020\u00182\u0006\u0010V\u001a\u00020@2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u001cH\u0002¢\u0006\u0004\bZ\u0010[JI\u0010h\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^2\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010`2\u000e\u0010e\u001a\n\u0018\u00010cj\u0004\u0018\u0001`d2\b\u0010g\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bh\u0010iJ\u0011\u0010j\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00182\u0006\u0010l\u001a\u00020\u001cH\u0002¢\u0006\u0004\bm\u0010'J\u000f\u0010n\u001a\u00020\u0018H\u0002¢\u0006\u0004\bn\u0010!J\u0017\u0010q\u001a\u00020\u00182\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\u00182\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010w\u001a\u00020\u00182\u0006\u0010v\u001a\u00020uH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020\u00182\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00182\u0006\u0010z\u001a\u00020}H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0082\u0001\u001a\u00020\u00182\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J*\u0010\u0087\u0001\u001a\u00020\u00182\u0016\u0010\u0086\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001f\u0010\u008a\u0001\u001a\u00020\u00182\u000b\b\u0002\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001JQ\u0010s\u001a\u00020\u00182\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\u0016\b\u0002\u0010A\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010H\u0002¢\u0006\u0004\bs\u0010DJ\u001e\u0010\u008e\u0001\u001a\u00020\u00182\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J8\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u00012\b\u0010=\u001a\u0004\u0018\u00010<2\u0017\b\u0002\u0010\u0090\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0094\u0001\u0010!J\u0011\u0010\u0095\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0095\u0001\u0010!J\u0011\u0010\u0096\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0096\u0001\u0010!J.\u0010\u0099\u0001\u001a\u00020\u00182\u0010\u0010\u0098\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010`2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\"\u0010\u009b\u0001\u001a\u00020\u00182\u000e\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010`H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u009d\u0001\u0010!J\u0013\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J4\u0010¦\u0001\u001a\u00020\u0018*\u00020o2\b\u0010¡\u0001\u001a\u00030\u0091\u00012\b\u0010£\u0001\u001a\u00030¢\u00012\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0011\u0010¨\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b¨\u0001\u0010!J\u0011\u0010©\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b©\u0001\u0010!J\u0011\u0010ª\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\bª\u0001\u0010!J.\u0010®\u0001\u001a\u00020\u00182\b\u0010¬\u0001\u001a\u00030«\u00012\b\u0010\u00ad\u0001\u001a\u00030\u0091\u00012\u0006\u0010Y\u001a\u00020\u001cH\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001JB\u0010³\u0001\u001a\u00020\u00182\b\u0010°\u0001\u001a\u00030\u0085\u00012\b\u0010=\u001a\u0004\u0018\u00010<2\t\u0010±\u0001\u001a\u0004\u0018\u00010J2\u000f\u0010²\u0001\u001a\n\u0018\u00010cj\u0004\u0018\u0001`dH\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001JB\u0010·\u0001\u001a\u00020\u00182\b\u0010=\u001a\u0004\u0018\u00010<2\t\u0010±\u0001\u001a\u0004\u0018\u00010J2\b\u0010¶\u0001\u001a\u00030µ\u00012\u000f\u0010²\u0001\u001a\n\u0018\u00010cj\u0004\u0018\u0001`dH\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001c\u0010º\u0001\u001a\u00020\u00182\b\u0010¹\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0011\u0010¼\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b¼\u0001\u0010!J\u0011\u0010½\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b½\u0001\u0010!J\u001a\u0010¿\u0001\u001a\u00020\u00182\u0007\u0010¾\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0005\b¿\u0001\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u001a\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000f\n\u0005\b\t\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u001a\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001a\u0010\r\u001a\u00020\f8\u0006¢\u0006\u000f\n\u0005\b\r\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000f\n\u0005\b\u000f\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R(\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00120\u00108\u0006¢\u0006\u000f\n\u0005\b\u0013\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R\u001a\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\u000f\n\u0005\b\u0015\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0006¢\u0006\u000f\n\u0005\b\u0019\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\u000f\n\u0005\b\u001b\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\r\n\u0005\b\u001d\u0010á\u0001\u001a\u0004\b\u001d\u0010$R!\u0010ç\u0001\u001a\u00030â\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R,\u0010é\u0001\u001a\u0005\u0018\u00010è\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R1\u0010ï\u0001\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010Õ\u0001\u001a\u0006\bð\u0001\u0010×\u0001\"\u0006\bñ\u0001\u0010ò\u0001R \u0010ô\u0001\u001a\u00030ó\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001R\u001a\u0010ù\u0001\u001a\u0005\u0018\u00010ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ú\u0001R\u0018\u0010ü\u0001\u001a\u00030û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0018\u0010ÿ\u0001\u001a\u00030þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001a\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0018\u0010\u0084\u0002\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001b\u0010\u0086\u0002\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0018\u0010\u0089\u0002\u001a\u00030\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0017\u0010\u008b\u0002\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010á\u0001R\u001c\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R\u001c\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u008e\u0002R\u001c\u0010\u0090\u0002\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001a\u0010\u0092\u0002\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0019\u0010\u0094\u0002\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010á\u0001R\u0019\u0010\u0095\u0002\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0002\u0010á\u0001R\u001a\u0010\u0097\u0002\u001a\u00030\u0096\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0019\u0010\u0099\u0002\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010á\u0001R\u001a\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001a\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001a\u0010 \u0002\u001a\u0005\u0018\u00010\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010\u009f\u0002R\u001c\u0010¢\u0002\u001a\u0005\u0018\u00010¡\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u0018\u0010¥\u0002\u001a\u00030¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0018\u0010¨\u0002\u001a\u00030§\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u001e\u0010«\u0002\u001a\t\u0012\u0004\u0012\u00020\u001c0ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R\u001e\u0010\u00ad\u0002\u001a\t\u0012\u0004\u0012\u00020\u001c0ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0002\u0010¬\u0002R\u0018\u0010¯\u0002\u001a\u00030®\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u0018\u0010±\u0002\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010\u0093\u0002R\u001c\u0010³\u0002\u001a\u0005\u0018\u00010²\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010´\u0002R\u0018\u0010¶\u0002\u001a\u00030µ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u0018\u0010¹\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u0018\u0010¼\u0002\u001a\u00030»\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u0018\u0010¿\u0002\u001a\u00030¾\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u001a\u0010Á\u0002\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010\u0085\u0002R\u0018\u0010Ã\u0002\u001a\u00030Â\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0002\u0010Ä\u0002R\u001c\u0010Å\u0002\u001a\u0005\u0018\u00010Â\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010Ä\u0002R\u0018\u0010Ç\u0002\u001a\u00030Æ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0002\u0010È\u0002R\u0018\u0010É\u0002\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R\u0018\u0010Ì\u0002\u001a\u00030Ë\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R\u0018\u0010Ï\u0002\u001a\u00030Î\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R\u0019\u0010Ñ\u0002\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0002\u0010á\u0001R\u001c\u0010Ò\u0002\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010Ó\u0002¨\u0006Õ\u0002"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewWrapper;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "detailsSheetManager", "Ll10/i;", "container", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsManager;", "mapPerformanceAnalyticsManager", "Lkotlin/Function0;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObjectProvider", "Landroidx/lifecycle/J;", "subscribeOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LBZ/e;", "miniAppConfigHolder", "", "isSelectApp", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/geo/map/DetailsSheetManager;Ll10/i;Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsManager;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;LBZ/e;Z)V", "onInitializeMap", "()V", "attachToContainer", "removeFromContainer", "()Z", "isRationaleNeeded", "requestLocationPermission", "(Z)V", "Lcom/google/android/gms/common/api/ResolvableApiException;", "exception", "showLocationDisabledRestriction", "(Lcom/google/android/gms/common/api/ResolvableApiException;)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;", "bannerState", "handleBannerState", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$BannerState;)V", "showLoader", "hideLoader", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "userLocationMarker", "showUserLocationPinIfNeed", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;)V", "hideDetailsSheet", "clearUserPin", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVOWithPayloads;", "pageWithPayloads", "bindState", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVOWithPayloads;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "viewPort", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$CameraState;", "cameraState", "Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;", "startAction", "endAction", "moveToPoint", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$CameraState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "onStart", "onStop", "scheduleSlideUp", "scheduleSlideDown", "setupMapController", "", ImagesContract.URL, "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "changeSelectedTab", "(Ljava/lang/String;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "startClusterizationAnimation", "stopClusterizationAnimation", "startAnalyticsObserve", "clearListeners", "slideUp", "slideDown", "position", "Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;", "reason", "isFinished", "onCameraPositionChanged", "(Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;Z)V", "Li10/h$c;", "pageRef", "Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "params", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "bottomSheetTokenizedEvent", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;", "numberPVZ", "openDetailsSheet", "(Li10/h$c;Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;Ljava/util/List;LWZ/t;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$NumberPVZ;)V", "getViewport", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "isActive", "updateActiveZone", "bindShortInfo", "Landroid/view/View;", "mapContainer", "measureCenterPinPosition", "(Landroid/view/View;)V", "centerCamera", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$CameraState;)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$NavBarState;", "navBarState", "updateNavbar", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$NavBarState;)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$AddressEditMapFlagsState;", "payload", "updateFlags", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$AddressEditMapFlagsState;)V", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BottomSheetState;", "updateBottomSheet", "(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState$BottomSheetState;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;", "centerPin", "configureCenterPin", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;)V", "Lkotlin/Pair;", "", "size", "changeMarkerPinSize", "(Lkotlin/Pair;)V", "forceShow", "setDefaultCenterPinVisibilityState", "(Ljava/lang/Boolean;)V", "Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;", "screenRect", "updateZoomFocusPoint", "(Lru/ozon/app/android/mapcommon/map/model/ScreenRectModel;)V", "activeZoneAction", "", "getZoomForViewPort", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Lkotlin/jvm/functions/Function1;)Ljava/lang/Float;", "pinFromDownToUpAnimation", "pinFromUpToDownLoadingAnimation", "removeOldMapObject", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;", "mapObjects", "configurePins", "(Ljava/util/List;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Pin;)V", "showMapObjects", "(Ljava/util/List;)V", "performSlideUp", "Landroidx/recyclerview/widget/RecyclerView;", "performSlideDown", "()Landroidx/recyclerview/widget/RecyclerView;", "targetY", "", "duration", "Landroid/animation/TimeInterpolator;", "interpolator", "animateChildTo", "(Landroid/view/View;FJLandroid/animation/TimeInterpolator;)V", "requestLocationSuccess", "showPermissionRationalErrorRestriction", "showPermissionErrorRestriction", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "target", "zoom", "processCameraEvent", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;FZ)V", "pinsCount", "link", "event", "handlePinClick", "(ILru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Ljava/lang/String;LWZ/t;)V", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;", "coordinate", "handleClusterClick", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;Ljava/lang/String;Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$Coordinate;LWZ/t;)V", "mapObject", "handleMapObjectClick", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapObject;)V", "setMapPerformanceInitStartTime", "startObserveShortInfoVisibility", "isShortInfoVisible", "updateLogoPosition", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "getDetailsSheetManager", "()Lru/ozon/app/android/geo/map/DetailsSheetManager;", "Ll10/i;", "getContainer", "()Ll10/i;", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "getOzonMapProvider", "()Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsManager;", "getMapPerformanceAnalyticsManager", "()Lru/ozon/app/android/geo/map/performance/MapPerformanceAnalyticsManager;", "Lkotlin/jvm/functions/Function0;", "getViewObjectProvider", "()Lkotlin/jvm/functions/Function0;", "Landroidx/lifecycle/J;", "getSubscribeOwner", "()Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "Z", "Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController$delegate", "LSc/j;", "getMapController", "()Lru/ozon/app/android/mapcommon/map/OzonMapController;", "mapController", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewListener;", "mapListener", "Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewListener;", "getMapListener", "()Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewListener;", "setMapListener", "(Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewListener;)V", "onBackPressed", "getOnBackPressed", "setOnBackPressed", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/geo/map/presentation/views/AddressEditMapView;", "addressEditMapView", "Lru/ozon/app/android/geo/map/presentation/views/AddressEditMapView;", "getAddressEditMapView$geo_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/geo/map/presentation/views/AddressEditMapView;", "Landroidx/fragment/app/r;", "activity", "Landroidx/fragment/app/r;", "Landroidx/fragment/app/G;", "childFragmentManager", "Landroidx/fragment/app/G;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "editMapVO", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "dp48", "I", "userPin", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$LocationMarker;", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/SplitShortInfoWidgetVH;", "shortInfoViewHolder", "Lru/ozon/app/android/geo/splitShortInfoWidgetKey/SplitShortInfoWidgetVH;", "isTabFragment", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "locationPermissionDialog", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "locationRationalPermissionDialog", "currentCoordinate", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "rotationBorder", "F", "processApplicationMove", "processInitializeMap", "Lru/ozon/app/android/geo/map/utils/CameraMotionState;", "cameraMotionState", "Lru/ozon/app/android/geo/map/utils/CameraMotionState;", "isCentralPinShowing", "Landroidx/vectordrawable/graphics/drawable/e;", "markerDrawable", "Landroidx/vectordrawable/graphics/drawable/e;", "Landroidx/vectordrawable/graphics/drawable/c;", "fromDownToUpMoving", "Landroidx/vectordrawable/graphics/drawable/c;", "fromUpToDownMoving", "Landroid/view/ViewPropertyAnimator;", "currentAnimator", "Landroid/view/ViewPropertyAnimator;", "Lc3/c;", "linearOutSlowInInterpolator", "Lc3/c;", "Lc3/a;", "fastOutLinearInInterpolator", "Lc3/a;", "LAe/x0;", "bottomSheetExpandedStateFlow", "LAe/x0;", "splitShortInfoVisibilityFlow", "Lru/ozon/app/android/geo/map/presentation/utils/PageModifier;", "pageModifier", "Lru/ozon/app/android/geo/map/presentation/utils/PageModifier;", "progressBarElevation", "Lxe/B0;", "splitShortInfoVisibilityJob", "Lxe/B0;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/controls/v2/MapControlsContainerWithExpandedFilters;", "controlsContainer", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/controls/v2/MapControlsContainerWithExpandedFilters;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainerImpl;", "bannerContainer", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/banner/MapBannerContainerImpl;", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/PageIconsAdapter;", "pageIconsAdapter", "Lru/ozon/app/android/geo/map/presentation/iconsadapter/PageIconsAdapter;", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider;", "iconProvider", "Lru/ozon/app/android/geo/map/presentation/mapicons/MapIconProvider;", "recyclerTop", "Landroid/view/View$OnLayoutChangeListener;", "bottomSheetComposerLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "recyclerTopLayoutChangeListener", "Lru/ozon/app/android/geo/databinding/MapDetailsBottomSheetBinding;", "mapDetailsBottomSheetBinding", "Lru/ozon/app/android/geo/databinding/MapDetailsBottomSheetBinding;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/geo/map/presentation/utils/MapAnimator;", "mapAnimator", "Lru/ozon/app/android/geo/map/presentation/utils/MapAnimator;", "Lru/ozon/app/android/geo/map/presentation/utils/SheetPageHelper;", "detailsPageSheet", "Lru/ozon/app/android/geo/map/presentation/utils/SheetPageHelper;", "canShowLocationDisabledRestriction", "pinsCachingZoom", "Ljava/lang/Float;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditMapViewWrapper {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final r activity;

    @NotNull
    private final AddressEditMapView addressEditMapView;

    @NotNull
    private final MapBannerContainerImpl bannerContainer;

    @NotNull
    private final View.OnLayoutChangeListener bottomSheetComposerLayoutChangeListener;

    @NotNull
    private final x0<Boolean> bottomSheetExpandedStateFlow;

    @NotNull
    private CameraMotionState cameraMotionState;
    private boolean canShowLocationDisabledRestriction;

    @NotNull
    private final G childFragmentManager;

    @NotNull
    private final RecyclerView composerRecyclerView;

    @NotNull
    private final i container;

    @NotNull
    private final Context context;

    @NotNull
    private final MapControlsContainerWithExpandedFilters controlsContainer;
    private ViewPropertyAnimator currentAnimator;
    private CoordinateModel currentCoordinate;

    @NotNull
    private final SheetPageHelper detailsPageSheet;

    @NotNull
    private final DetailsSheetManager detailsSheetManager;
    private final int dp48;
    private AddressEditMapVO editMapVO;

    @NotNull
    private final C5739a fastOutLinearInInterpolator;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;
    private final c fromDownToUpMoving;
    private final c fromUpToDownMoving;

    @NotNull
    private final MapIconProvider iconProvider;
    private boolean isCentralPinShowing;
    private final boolean isSelectApp;
    private final boolean isTabFragment;

    @NotNull
    private final C5741c linearOutSlowInInterpolator;
    private Flashbar locationPermissionDialog;
    private Flashbar locationRationalPermissionDialog;

    @NotNull
    private final MapAnimator mapAnimator;

    /* renamed from: mapController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapController;

    @NotNull
    private final MapDetailsBottomSheetBinding mapDetailsBottomSheetBinding;
    private AddressEditMapViewListener mapListener;

    @NotNull
    private final MapPerformanceAnalyticsManager mapPerformanceAnalyticsManager;
    private final e markerDrawable;

    @NotNull
    private final BZ.e miniAppConfigHolder;
    private Function0<Unit> onBackPressed;

    @NotNull
    private final OzonMapProvider ozonMapProvider;

    @NotNull
    private final PageIconsAdapter pageIconsAdapter;

    @NotNull
    private final PageModifier pageModifier;
    private Float pinsCachingZoom;
    private boolean processApplicationMove;
    private boolean processInitializeMap;
    private final float progressBarElevation;
    private int recyclerTop;
    private View.OnLayoutChangeListener recyclerTopLayoutChangeListener;
    private float rotationBorder;

    @NotNull
    private final SplitShortInfoWidgetVH shortInfoViewHolder;

    @NotNull
    private final x0<Boolean> splitShortInfoVisibilityFlow;
    private B0 splitShortInfoVisibilityJob;

    @NotNull
    private final J subscribeOwner;

    @NotNull
    private final l tokenizedAnalytics;
    private AddressEditMapVO.LocationMarker userPin;

    @NotNull
    private final Function0<ru.ozon.composer.ui.widget.l> viewObjectProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int STATUS_BAR_SPACING = ResourceExtKt.toPx(12);

    @NotNull
    private static final Pair<Integer, Integer> selectedIconPinSize = new Pair<>(Integer.valueOf(ResourceExtKt.toPx(44)), Integer.valueOf(ResourceExtKt.toPx(64)));

    @NotNull
    private static final Pair<Integer, Integer> animatedIconPinSize = new Pair<>(Integer.valueOf(ResourceExtKt.toPx(56)), Integer.valueOf(ResourceExtKt.toPx(106)));

    @NotNull
    private static final Pair<Integer, Integer> newSelectedIconPinSize = new Pair<>(Integer.valueOf(ResourceExtKt.toPx(56)), Integer.valueOf(ResourceExtKt.toPx(106)));

    @NotNull
    private static final InterfaceC4008j<Integer> tabBarHeight$delegate = k.b(AddressEditMapViewWrapper$Companion$tabBarHeight$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Integer> sheetPageOffset$delegate = k.b(AddressEditMapViewWrapper$Companion$sheetPageOffset$2.INSTANCE);

    @NotNull
    private static final InterfaceC4008j<Float> shortInfoBottomCornerRadius$delegate = k.b(AddressEditMapViewWrapper$Companion$shortInfoBottomCornerRadius$2.INSTANCE);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/geo/map/DetailsSheetManager$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/geo/map/DetailsSheetManager$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<DetailsSheetManager.Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DetailsSheetManager.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DetailsSheetManager.Action action) {
            if (!(action instanceof DetailsSheetManager.Action.Open)) {
                throw new o();
            }
            AddressEditMapViewWrapper addressEditMapViewWrapper = AddressEditMapViewWrapper.this;
            DetailsSheetManager.Action.Open open = (DetailsSheetManager.Action.Open) action;
            h.c pageRef = open.getPageRef();
            BottomSheetActionParams params = open.getParams();
            AddressEditMapVO addressEditMapVO = AddressEditMapViewWrapper.this.editMapVO;
            if (addressEditMapVO == null) {
                Intrinsics.n("editMapVO");
                throw null;
            }
            List<BadgeDTO> bottomSheetBadges = addressEditMapVO.getBottomSheetBadges();
            AddressEditMapVO addressEditMapVO2 = AddressEditMapViewWrapper.this.editMapVO;
            if (addressEditMapVO2 == null) {
                Intrinsics.n("editMapVO");
                throw null;
            }
            t bottomSheetTokenizedEvent = addressEditMapVO2.getBottomSheetTokenizedEvent();
            AddressEditMapVO addressEditMapVO3 = AddressEditMapViewWrapper.this.editMapVO;
            if (addressEditMapVO3 == null) {
                Intrinsics.n("editMapVO");
                throw null;
            }
            addressEditMapViewWrapper.openDetailsSheet(pageRef, params, bottomSheetBadges, bottomSheetTokenizedEvent, addressEditMapVO3.getNumberPVZ());
            ExtensionsKt.getExhaustive(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isShow", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$3", f = "AddressEditMapViewWrapper.kt", l = {379}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = AddressEditMapViewWrapper.this.new AnonymousClass3(dVar);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                if (!this.Z$0) {
                    AddressEditMapViewWrapper.this.slideDown();
                    return Unit.f71690a;
                }
                this.label = 1;
                if (Y.b(225L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            AddressEditMapViewWrapper.this.slideUp();
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000e\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0016\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/viewmapper/AddressEditMapViewWrapper$Companion;", "", "<init>", "()V", "Lkotlin/Pair;", "", "newSelectedIconPinSize", "Lkotlin/Pair;", "getNewSelectedIconPinSize", "()Lkotlin/Pair;", "tabBarHeight$delegate", "LSc/j;", "getTabBarHeight", "()I", "tabBarHeight", "sheetPageOffset$delegate", "getSheetPageOffset", "sheetPageOffset", "", "shortInfoBottomCornerRadius$delegate", "getShortInfoBottomCornerRadius", "()F", "shortInfoBottomCornerRadius", "", "FADE_ANIMATION_DURATION", "J", "ENTER_ANIMATION_DURATION", "EXIT_ANIMATION_DURATION", "MIN_ZOOM_DIFF", "F", "MAP_ACTIVE_ZONE_HEIGHT_COEFFICIENT", "ACTIVE_MAP_ZONE_CENTER_RATIO", "ROTATION_BORDER_COEFFICIENT", "DEFAULT_LOGO_PADDING", "I", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Pair<Integer, Integer> getNewSelectedIconPinSize() {
            return AddressEditMapViewWrapper.newSelectedIconPinSize;
        }

        public final int getSheetPageOffset() {
            return ((Number) AddressEditMapViewWrapper.sheetPageOffset$delegate.getValue()).intValue();
        }

        public final float getShortInfoBottomCornerRadius() {
            return ((Number) AddressEditMapViewWrapper.shortInfoBottomCornerRadius$delegate.getValue()).floatValue();
        }

        public final int getTabBarHeight() {
            return ((Number) AddressEditMapViewWrapper.tabBarHeight$delegate.getValue()).intValue();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditMapViewWrapper(@NotNull Context context, @NotNull DetailsSheetManager detailsSheetManager, @NotNull i container, @NotNull OzonMapProvider ozonMapProvider, @NotNull FeatureChecker featureChecker, @NotNull FeatureService featureService, @NotNull MapPerformanceAnalyticsManager mapPerformanceAnalyticsManager, @NotNull Function0<ru.ozon.composer.ui.widget.l> viewObjectProvider, @NotNull J subscribeOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull BZ.e miniAppConfigHolder, boolean z11) {
        boolean z12;
        Flashbar flashbar;
        J j11;
        Flashbar flashbar2;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detailsSheetManager, "detailsSheetManager");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(ozonMapProvider, "ozonMapProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(mapPerformanceAnalyticsManager, "mapPerformanceAnalyticsManager");
        Intrinsics.checkNotNullParameter(viewObjectProvider, "viewObjectProvider");
        Intrinsics.checkNotNullParameter(subscribeOwner, "subscribeOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.context = context;
        this.detailsSheetManager = detailsSheetManager;
        this.container = container;
        this.ozonMapProvider = ozonMapProvider;
        this.featureChecker = featureChecker;
        this.featureService = featureService;
        this.mapPerformanceAnalyticsManager = mapPerformanceAnalyticsManager;
        this.viewObjectProvider = viewObjectProvider;
        this.subscribeOwner = subscribeOwner;
        this.actionHandler = actionHandler;
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.isSelectApp = z11;
        this.mapController = k.b(new AddressEditMapViewWrapper$mapController$2(this));
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        AddressEditMapView addressEditMapView = new AddressEditMapView(L11, null, 0, 6, null);
        addressEditMapView.applyInsets$geo_prodGoogleAllVendorsRelease(!container.Y().getFitsSystemWindows());
        this.addressEditMapView = addressEditMapView;
        r a11 = container.K().a();
        this.activity = a11;
        G childFragmentManager = container.K().h().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.childFragmentManager = childFragmentManager;
        l X9 = container.X();
        this.tokenizedAnalytics = X9;
        int px = ResourceExtKt.toPx(48);
        this.dp48 = px;
        WidgetSplitShortInfoBinding bind = WidgetSplitShortInfoBinding.bind(addressEditMapView.getBinding().widgetSplitShortInfoInclude.shortInfoContainer);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.shortInfoViewHolder = new SplitShortInfoWidgetVH(bind, X9, z11);
        ComponentCallbacksC5392m b11 = container.K().b();
        boolean z13 = (b11 != null ? b11.getParentFragment() : null) instanceof NZ.d;
        this.isTabFragment = z13;
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            z12 = z13;
            flashbar = null;
        } else {
            z12 = z13;
            flashbar = FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.checkout_location_permission_via_settings_message)), null, null, Integer.valueOf(R$drawable.ic_pickup_point_red), null, null, null, new Action(StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_open_settings), true, new AddressEditMapViewWrapper$locationPermissionDialog$1$1$1(this)), null, null, null, null, "location", null, subscribeOwner, 48602, null);
        }
        this.locationPermissionDialog = flashbar;
        ComponentCallbacksC5392m c11 = container.Q().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            j11 = subscribeOwner;
            flashbar2 = null;
        } else {
            flashbar2 = FlashbarFactory.create$default(FlashbarFactory.INSTANCE, asNotificationLayoutManager$default.getParent(), null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.checkout_location_permission_via_settings_message)), null, null, Integer.valueOf(R$drawable.ic_pickup_point_red), null, null, null, new Action(StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_action_open_settings), true, new AddressEditMapViewWrapper$locationRationalPermissionDialog$1$1(this)), null, null, null, null, "location", null, subscribeOwner, 48602, null);
            j11 = subscribeOwner;
        }
        this.locationRationalPermissionDialog = flashbar2;
        this.cameraMotionState = CameraMotionState.IDLE;
        this.isCentralPinShowing = true;
        this.markerDrawable = e.a(context.getResources(), ru.ozon.app.android.geo.R$drawable.new_courier_pin_drawable, context.getTheme());
        this.fromDownToUpMoving = c.a(ru.ozon.app.android.geo.R$drawable.new_avd_anim_checkout_geo_start, context);
        this.fromUpToDownMoving = c.a(ru.ozon.app.android.geo.R$drawable.new_avd_anim_checkout_geo_end, context);
        this.linearOutSlowInInterpolator = new C5741c();
        this.fastOutLinearInInterpolator = new C5739a();
        Boolean bool = Boolean.FALSE;
        x0<Boolean> a12 = O0.a(bool);
        this.bottomSheetExpandedStateFlow = a12;
        this.splitShortInfoVisibilityFlow = O0.a(bool);
        this.pageModifier = new PageModifier(addressEditMapView);
        this.progressBarElevation = ResourceExtKt.toPxF(2);
        MapControlsContainerWithExpandedFilters mapControlsContainerWithExpandedFilters = new MapControlsContainerWithExpandedFilters(addressEditMapView, new AddressEditMapViewWrapper$controlsContainer$1(this), new AddressEditMapViewWrapper$controlsContainer$2(this), featureService, z11);
        this.controlsContainer = mapControlsContainerWithExpandedFilters;
        MapBannerContainerImpl mapBannerContainerImpl = new MapBannerContainerImpl(addressEditMapView, new AddressEditMapViewWrapper$bannerContainer$1(this), new AddressEditMapViewWrapper$bannerContainer$2(this), X9);
        this.bannerContainer = mapBannerContainerImpl;
        PageIconsAdapter pageIconsAdapter = new PageIconsAdapter(addressEditMapView, mapControlsContainerWithExpandedFilters, mapBannerContainerImpl);
        this.pageIconsAdapter = pageIconsAdapter;
        this.iconProvider = new MapIconProvider(context, getMapController(), featureChecker, featureService);
        this.bottomSheetComposerLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: Fy.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                AddressEditMapViewWrapper.bottomSheetComposerLayoutChangeListener$lambda$6(AddressEditMapViewWrapper.this, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.recyclerTopLayoutChangeListener = new ViewOnLayoutChangeListenerC3067e(this, 0);
        MapDetailsBottomSheetBinding inflate = MapDetailsBottomSheetBinding.inflate(LayoutInflater.from(context), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.mapDetailsBottomSheetBinding = inflate;
        RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(container.Z());
        this.composerRecyclerView = composerRecyclerView;
        LottieAnimationView mapAnimationView = addressEditMapView.getBinding().mapAnimationView;
        Intrinsics.checkNotNullExpressionValue(mapAnimationView, "mapAnimationView");
        this.mapAnimator = new MapAnimator(mapAnimationView, composerRecyclerView);
        AddressEditMapViewWrapper$detailsPageSheet$1 addressEditMapViewWrapper$detailsPageSheet$1 = new AddressEditMapViewWrapper$detailsPageSheet$1(this);
        AddressEditMapViewWrapper$detailsPageSheet$2 addressEditMapViewWrapper$detailsPageSheet$2 = new AddressEditMapViewWrapper$detailsPageSheet$2(this);
        AddressEditMapViewWrapper$detailsPageSheet$3 addressEditMapViewWrapper$detailsPageSheet$3 = new AddressEditMapViewWrapper$detailsPageSheet$3(this);
        AddressEditMapViewWrapper$detailsPageSheet$4 addressEditMapViewWrapper$detailsPageSheet$4 = new AddressEditMapViewWrapper$detailsPageSheet$4(this);
        CoordinatorLayout bottomSheetCoordinatorContainer = addressEditMapView.getBinding().bottomSheetCoordinatorContainer;
        Intrinsics.checkNotNullExpressionValue(bottomSheetCoordinatorContainer, "bottomSheetCoordinatorContainer");
        LinearLayout filtersContainerFl = addressEditMapView.getBinding().filtersContainerFl;
        Intrinsics.checkNotNullExpressionValue(filtersContainerFl, "filtersContainerFl");
        this.detailsPageSheet = new SheetPageHelper(inflate, px, addressEditMapViewWrapper$detailsPageSheet$1, addressEditMapViewWrapper$detailsPageSheet$2, addressEditMapViewWrapper$detailsPageSheet$3, addressEditMapViewWrapper$detailsPageSheet$4, bottomSheetCoordinatorContainer, composerRecyclerView, filtersContainerFl, featureChecker, miniAppConfigHolder, X9, actionHandler);
        this.canShowLocationDisabledRestriction = true;
        inflate.progressSpinnerMpb.setColor(ThemeExtKt.themeColor(context, R$attr.bgActionPrimary));
        addressEditMapView.getBinding().backBtn.setOnClickListener(new EI.a(this, 2));
        ViewExtKt.hide(composerRecyclerView);
        slideDown();
        pageIconsAdapter.setControlsVisible(false);
        composerRecyclerView.addOnLayoutChangeListener(this.recyclerTopLayoutChangeListener);
        composerRecyclerView.setItemAnimator(null);
        detailsSheetManager.getAction().observe(j11, new AddressEditMapViewWrapper$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
        ViewGroupExtKt.inflate(container.Z(), R$layout.view_progressbar_white_bg, true);
        if (z12) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(ComposerViewExtensionKt.composerRecyclerView(container.Z()), 0, 0, 0, -Companion.getTabBarHeight(), 7, null);
        }
        C2399j.C(new C2408n0(C5427n.a(C2399j.b(a12), j11.getLifecycle(), AbstractC5434v.b.STARTED), new AnonymousClass3(null)), K.a(j11));
        if (z11) {
            return;
        }
        FrameLayout frameLayout = addressEditMapView.getBinding().shortInfoFL;
        frameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$4$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                AddressEditMapViewWrapper.Companion companion;
                AddressEditMapViewWrapper.Companion companion2;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                companion = AddressEditMapViewWrapper.Companion;
                int i11 = -((int) companion.getShortInfoBottomCornerRadius());
                int width = view2.getWidth();
                int height = view2.getHeight();
                companion2 = AddressEditMapViewWrapper.Companion;
                outline.setRoundRect(0, i11, width, height, companion2.getShortInfoBottomCornerRadius());
            }
        });
        frameLayout.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(AddressEditMapViewWrapper addressEditMapViewWrapper, View view) {
        Function0<Unit> function0 = addressEditMapViewWrapper.onBackPressed;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void animateChildTo(final View view, final float f7, long j11, TimeInterpolator timeInterpolator) {
        this.currentAnimator = view.animate().translationY(f7).setInterpolator(timeInterpolator).setDuration(j11).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Fy.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AddressEditMapViewWrapper.animateChildTo$lambda$37(AddressEditMapViewWrapper.this, view, valueAnimator);
            }
        }).setListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$animateChildTo$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                AddressEditMapViewWrapper.this.currentAnimator = null;
                if (f7 == 0.0f) {
                    return;
                }
                view.setTranslationY(r2.getBottom());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateChildTo$lambda$37(AddressEditMapViewWrapper addressEditMapViewWrapper, View view, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        addressEditMapViewWrapper.pageIconsAdapter.onSlide(view);
    }

    private final void bindShortInfo() {
        Map<String, List<ru.ozon.composer.ui.widget.l>> g10;
        List<ru.ozon.composer.ui.widget.l> list;
        ru.ozon.composer.ui.widget.l lVar;
        ru.ozon.composer.ui.widget.l invoke = this.viewObjectProvider.invoke();
        l20.c d11 = (invoke == null || (g10 = invoke.g()) == null || (list = g10.get("splitShortInfoWidgetKey")) == null || (lVar = (ru.ozon.composer.ui.widget.l) C7714v.M(list)) == null) ? null : lVar.d();
        if (d11 instanceof SplitShortInfoVO) {
            FrameLayout shortInfoFL = this.addressEditMapView.getBinding().shortInfoFL;
            Intrinsics.checkNotNullExpressionValue(shortInfoFL, "shortInfoFL");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(shortInfoFL);
            this.shortInfoViewHolder.bind((SplitShortInfoVO) d11);
        } else {
            FrameLayout shortInfoFL2 = this.addressEditMapView.getBinding().shortInfoFL;
            Intrinsics.checkNotNullExpressionValue(shortInfoFL2, "shortInfoFL");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(shortInfoFL2);
        }
        x0<Boolean> x0Var = this.splitShortInfoVisibilityFlow;
        FrameLayout shortInfoFL3 = this.addressEditMapView.getBinding().shortInfoFL;
        Intrinsics.checkNotNullExpressionValue(shortInfoFL3, "shortInfoFL");
        x0Var.setValue(Boolean.valueOf(shortInfoFL3.getVisibility() == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomSheetComposerLayoutChangeListener$lambda$6(AddressEditMapViewWrapper addressEditMapViewWrapper, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        FrameLayout frameLayout = addressEditMapViewWrapper.mapDetailsBottomSheetBinding.addressEditMapDetailsBottomSheetContainerContent;
        frameLayout.post(new g0(1, addressEditMapViewWrapper, frameLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bottomSheetComposerLayoutChangeListener$lambda$6$lambda$5$lambda$4(AddressEditMapViewWrapper addressEditMapViewWrapper, FrameLayout frameLayout) {
        PageIconsAdapter pageIconsAdapter = addressEditMapViewWrapper.pageIconsAdapter;
        Intrinsics.f(frameLayout);
        pageIconsAdapter.onSlide(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void centerCamera(AddressEditMapState.CameraState cameraState) {
        this.rotationBorder = this.addressEditMapView.getBinding().mapContainer.getMeasuredWidth() * 0.6666667f;
        this.currentCoordinate = AddressEditMapMapperKt.toPoint(cameraState.getCenterPin().getCoordinate());
        centerCamera$default(this, cameraState.getViewPort(), cameraState, null, new AddressEditMapViewWrapper$centerCamera$1(this, cameraState), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void centerCamera$default(AddressEditMapViewWrapper addressEditMapViewWrapper, AddressEditMapVO.ViewPort viewPort, AddressEditMapState.CameraState cameraState, Function1 function1, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            viewPort = null;
        }
        if ((i11 & 2) != 0) {
            cameraState = null;
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        addressEditMapViewWrapper.centerCamera(viewPort, cameraState, function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeMarkerPinSize(Pair<Integer, Integer> size) {
        int intValue = size.a().intValue();
        int intValue2 = size.b().intValue();
        ViewGroup.LayoutParams layoutParams = this.addressEditMapView.getBinding().markerIv.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = intValue;
        }
        if (layoutParams != null) {
            layoutParams.height = intValue2;
        }
        this.addressEditMapView.getBinding().markerIv.requestLayout();
    }

    private final void clearListeners() {
        this.mapDetailsBottomSheetBinding.addressEditMapDetailsBottomSheetContainerContent.removeOnLayoutChangeListener(this.bottomSheetComposerLayoutChangeListener);
        this.composerRecyclerView.removeOnLayoutChangeListener(this.recyclerTopLayoutChangeListener);
    }

    private final void configureCenterPin(AddressEditMapVO.Pin centerPin) {
        this.iconProvider.createCenterPinMarkerBitmap(centerPin, selectedIconPinSize, new AddressEditMapViewWrapper$configureCenterPin$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurePins(List<AddressEditMapVO.MapObject> mapObjects, AddressEditMapVO.Pin centerPin) {
        TraceApiKt.beginDebugTrace("mapPinConfigure", 1);
        if (mapObjects != null) {
            this.iconProvider.setMarkerItemsCount(mapObjects.size());
            getMapController().setPinAnimationEnabledState(true);
            showMapObjects(mapObjects);
        }
        configureCenterPin(centerPin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressEditMapVO.ViewPort getViewport() {
        we0.i visibleArea = getMapController().getVisibleArea();
        if (visibleArea != null) {
            return UtilsKt.toViewPort(visibleArea);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Float getZoomForViewPort(AddressEditMapVO.ViewPort viewPort, Function1<? super Boolean, Unit> activeZoneAction) {
        if (viewPort == null) {
            CameraPositionModel cameraPosition = getMapController().getCameraPosition(null);
            if (cameraPosition != null) {
                return Float.valueOf(cameraPosition.getZoom());
            }
            return null;
        }
        BoundingBoxModel boundingBoxModel = new BoundingBoxModel(AddressEditMapVOKt.toPointModel(viewPort.getLeftBottom()), AddressEditMapVOKt.toPointModel(viewPort.getRightTop()));
        if (activeZoneAction != null) {
            activeZoneAction.invoke(Boolean.FALSE);
        }
        CameraPositionModel cameraPosition2 = getMapController().getCameraPosition(boundingBoxModel);
        if (activeZoneAction != null) {
            activeZoneAction.invoke(Boolean.TRUE);
        }
        if (cameraPosition2 != null) {
            return Float.valueOf(cameraPosition2.getZoom());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Float getZoomForViewPort$default(AddressEditMapViewWrapper addressEditMapViewWrapper, AddressEditMapVO.ViewPort viewPort, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        return addressEditMapViewWrapper.getZoomForViewPort(viewPort, function1);
    }

    private final void handleClusterClick(AddressEditMapVO.ViewPort viewPort, String link, AddressEditMapVO.Coordinate coordinate, t event) {
        this.currentCoordinate = AddressEditMapMapperKt.toPoint(coordinate);
        centerCamera$default(this, viewPort, null, null, new AddressEditMapViewWrapper$handleClusterClick$1(this, link, event), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMapObjectClick(AddressEditMapVO.MapObject mapObject) {
        Integer w02;
        if (mapObject.getType() == AddressEditMapDTO.MapObject.Type.CLUSTER) {
            handleClusterClick(mapObject.getViewport(), mapObject.getActionLink(), mapObject.getCoordinates(), mapObject.getEvent());
        } else {
            String pinsCount = mapObject.getPinsCount();
            handlePinClick((pinsCount == null || (w02 = kotlin.text.h.w0(pinsCount)) == null) ? 1 : w02.intValue(), mapObject.getViewport(), mapObject.getActionLink(), mapObject.getEvent());
        }
    }

    private final void handlePinClick(int pinsCount, AddressEditMapVO.ViewPort viewPort, String link, t event) {
        CameraPositionModel cameraPosition$default = OzonMapController.DefaultImpls.getCameraPosition$default(getMapController(), null, 1, null);
        if (cameraPosition$default != null) {
            float zoom = cameraPosition$default.getZoom();
            if (pinsCount > 1) {
                this.detailsPageSheet.hide();
            } else {
                this.detailsPageSheet.showOuterLoader();
            }
            centerCamera$default(this, viewPort, null, null, new AddressEditMapViewWrapper$handlePinClick$1(this, link, zoom, viewPort, event), 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void measureCenterPinPosition(View mapContainer) {
        LinearLayout filtersContainerFl = this.addressEditMapView.getBinding().filtersContainerFl;
        Intrinsics.checkNotNullExpressionValue(filtersContainerFl, "filtersContainerFl");
        ViewGroup.LayoutParams layoutParams = this.addressEditMapView.getBinding().guideline.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41620a = filtersContainerFl.getHeight() + ((int) (mapContainer.getHeight() * 0.35f));
        this.addressEditMapView.getBinding().guideline.setLayoutParams(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void moveToPoint$default(AddressEditMapViewWrapper addressEditMapViewWrapper, AddressEditMapVO.ViewPort viewPort, AddressEditMapState.CameraState cameraState, Function1 function1, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        addressEditMapViewWrapper.moveToPoint(viewPort, cameraState, function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraPositionChanged(CameraPositionModel position, CameraUpdateReasonModel reason, boolean isFinished) {
        if ((reason != CameraUpdateReasonModel.APPLICATION || this.processApplicationMove) && !this.processInitializeMap) {
            this.detailsPageSheet.hide();
            processCameraEvent(position.getTarget(), position.getZoom(), isFinished);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDetailsSheet(h.c pageRef, BottomSheetActionParams params, List<BadgeDTO> badges, t bottomSheetTokenizedEvent, AddressEditMapVO.NumberPVZ numberPVZ) {
        this.detailsPageSheet.load(this.childFragmentManager, pageRef, params, badges, 4, bottomSheetTokenizedEvent, numberPVZ);
        ViewGroup Z11 = this.container.Z();
        int i11 = androidx.core.view.Y.f42258g;
        if (!Z11.isLaidOut() || Z11.isLayoutRequested()) {
            Z11.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$openDetailsSheet$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    AddressEditMapViewWrapper.this.detailsPageSheet.show();
                }
            });
        } else {
            this.detailsPageSheet.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView performSlideDown() {
        RecyclerView recyclerView = this.composerRecyclerView;
        float height = recyclerView.getHeight();
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            recyclerView.clearAnimation();
        }
        animateChildTo(recyclerView, height, 225L, this.fastOutLinearInInterpolator);
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performSlideUp() {
        RecyclerView recyclerView = this.composerRecyclerView;
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(recyclerView);
        this.pageIconsAdapter.setControlsVisible(true);
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            recyclerView.clearAnimation();
        }
        recyclerView.setTranslationY(recyclerView.getHeight());
        animateChildTo(recyclerView, 0.0f, 275L, this.linearOutSlowInInterpolator);
    }

    private final void pinFromDownToUpAnimation() {
        changeMarkerPinSize(animatedIconPinSize);
        setDefaultCenterPinVisibilityState$default(this, null, 1, null);
        this.addressEditMapView.getBinding().markerIv.setImageDrawable(this.fromDownToUpMoving);
        c cVar = this.fromDownToUpMoving;
        if (cVar != null) {
            cVar.start();
        }
    }

    private final void pinFromUpToDownLoadingAnimation() {
        setDefaultCenterPinVisibilityState$default(this, null, 1, null);
        this.addressEditMapView.getBinding().markerIv.setImageDrawable(this.fromUpToDownMoving);
        c cVar = this.fromUpToDownMoving;
        if (cVar != null) {
            cVar.start();
        }
    }

    private final void processCameraEvent(CoordinateModel target, float zoom, boolean isFinished) {
        this.currentCoordinate = target;
        CameraMotionState cameraMotionState = this.cameraMotionState;
        CameraMotionState cameraMotionState2 = CameraMotionState.IDLE;
        if (cameraMotionState == cameraMotionState2) {
            AddressEditMapViewListener addressEditMapViewListener = this.mapListener;
            if (addressEditMapViewListener != null) {
                addressEditMapViewListener.onCameraStartMoveAction();
            }
            pinFromDownToUpAnimation();
            this.cameraMotionState = CameraMotionState.MOVING;
        }
        if (isFinished) {
            this.processApplicationMove = false;
            this.cameraMotionState = cameraMotionState2;
            pinFromUpToDownLoadingAnimation();
            AddressEditMapViewListener addressEditMapViewListener2 = this.mapListener;
            if (addressEditMapViewListener2 != null) {
                addressEditMapViewListener2.onCameraEndMoveAction(AddressEditMapMapperKt.toVO(target), getViewport(), zoom);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOldMapObject() {
        Iterator<T> it = getMapController().getPlacemarkObjects().iterator();
        while (it.hasNext()) {
            getMapController().removePlacemark(((u) it.next()).e());
        }
    }

    public static /* synthetic */ void requestLocationPermission$default(AddressEditMapViewWrapper addressEditMapViewWrapper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        addressEditMapViewWrapper.requestLocationPermission(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLocationSuccess() {
        Flashbar flashbar = this.locationRationalPermissionDialog;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        Flashbar flashbar2 = this.locationPermissionDialog;
        if (flashbar2 != null) {
            flashbar2.dismiss();
        }
        this.mapPerformanceAnalyticsManager.permissionViewEnd();
    }

    private final void setDefaultCenterPinVisibilityState(Boolean forceShow) {
        ImageView markerIv = this.addressEditMapView.getBinding().markerIv;
        Intrinsics.checkNotNullExpressionValue(markerIv, "markerIv");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(markerIv, Boolean.valueOf(forceShow != null ? forceShow.booleanValue() : this.isCentralPinShowing));
    }

    static /* synthetic */ void setDefaultCenterPinVisibilityState$default(AddressEditMapViewWrapper addressEditMapViewWrapper, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        addressEditMapViewWrapper.setDefaultCenterPinVisibilityState(bool);
    }

    private final void setMapPerformanceInitStartTime() {
        k.a<ru.ozon.composer.ui.widget.l> e11;
        String d11;
        if (this.editMapVO != null || (e11 = this.container.J().r().b().e()) == null || (d11 = e11.d()) == null) {
            return;
        }
        this.mapPerformanceAnalyticsManager.setInitStartTime(d11);
    }

    private final void showMapObjects(List<AddressEditMapVO.MapObject> mapObjects) {
        AddressEditMapVO addressEditMapVO = this.editMapVO;
        if (addressEditMapVO == null) {
            Intrinsics.n("editMapVO");
            throw null;
        }
        Float zoomForViewPort$default = getZoomForViewPort$default(this, addressEditMapVO.getViewPort(), null, 2, null);
        if (zoomForViewPort$default != null) {
            float floatValue = zoomForViewPort$default.floatValue();
            for (AddressEditMapVO.MapObject mapObject : mapObjects) {
                this.iconProvider.createMapObject(mapObject, floatValue, new AddressEditMapViewWrapper$showMapObjects$1$1(mapObject, this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionErrorRestriction() {
        Flashbar flashbar = this.locationRationalPermissionDialog;
        if (flashbar == null || !flashbar.isShown()) {
            Flashbar flashbar2 = this.locationPermissionDialog;
            if (flashbar2 != null) {
                flashbar2.show();
            }
        } else {
            r rVar = this.activity;
            if (rVar != null) {
                PermissionExtKt.openAppSettings(rVar);
            }
        }
        Flashbar flashbar3 = this.locationRationalPermissionDialog;
        if (flashbar3 != null) {
            flashbar3.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPermissionRationalErrorRestriction() {
        Flashbar flashbar = this.locationRationalPermissionDialog;
        if (flashbar != null) {
            flashbar.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void slideDown() {
        if (this.addressEditMapView.isLaidOut()) {
            performSlideDown();
            return;
        }
        AddressEditMapView addressEditMapView = this.addressEditMapView;
        int i11 = androidx.core.view.Y.f42258g;
        if (!addressEditMapView.isLaidOut() || addressEditMapView.isLayoutRequested()) {
            addressEditMapView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$slideDown$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    AddressEditMapViewWrapper.this.performSlideDown();
                }
            });
        } else {
            performSlideDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void slideUp() {
        RecyclerView recyclerView = this.composerRecyclerView;
        int i11 = androidx.core.view.Y.f42258g;
        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$slideUp$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    AddressEditMapViewWrapper.this.performSlideUp();
                }
            });
        } else {
            performSlideUp();
        }
    }

    private final void startObserveShortInfoVisibility() {
        B0 b02 = this.splitShortInfoVisibilityJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.splitShortInfoVisibilityJob = C2399j.C(new C2408n0(C5427n.a(C2399j.b(this.splitShortInfoVisibilityFlow), this.subscribeOwner.getLifecycle(), AbstractC5434v.b.STARTED), new AddressEditMapViewWrapper$startObserveShortInfoVisibility$1(this, null)), K.a(this.subscribeOwner));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateActiveZone(boolean isActive) {
        final ScreenRectModel screenRectModel = null;
        if (isActive) {
            Point point = new Point(0, 0);
            int height = (int) (getMapController().height() * 0.7f);
            int width = getMapController().width();
            if (height > 0 && width > 0) {
                screenRectModel = new ScreenRectModel(point, new Point(width, height));
            }
        }
        final OzonMapController mapController = getMapController();
        View contentView = mapController.getContentView();
        int i11 = androidx.core.view.Y.f42258g;
        if (!contentView.isLaidOut() || contentView.isLayoutRequested()) {
            contentView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$updateActiveZone$lambda$21$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OzonMapController.this.setFocusRect(screenRectModel);
                }
            });
        } else {
            mapController.setFocusRect(screenRectModel);
        }
    }

    private final void updateBottomSheet(AddressEditMapState.BottomSheetState payload) {
        ru.ozon.composer.ui.widget.l invoke;
        Map<String, String> h11;
        String str;
        String str2;
        TraceApiKt.beginDebugTrace("mapUpdateBottomSheet", 1);
        AtomActionDTO bottomSheetAction = payload.getBottomSheetAction();
        if (bottomSheetAction == null) {
            hideDetailsSheet();
        } else if (Intrinsics.d(bottomSheetAction.getId(), "bottomSheetAction") && (invoke = this.viewObjectProvider.invoke()) != null && (h11 = invoke.h()) != null && (str = h11.get(bottomSheetAction.getLink())) != null) {
            Map<String, String> params = bottomSheetAction.getParams();
            String str3 = params != null ? params.get(SelectionItemFormDTO.TITLE_FIELD_NAME) : null;
            Map<String, String> params2 = bottomSheetAction.getParams();
            Boolean t02 = (params2 == null || (str2 = params2.get("skipCollapsed")) == null) ? null : kotlin.text.h.t0(str2);
            Map<String, String> params3 = bottomSheetAction.getParams();
            openDetailsSheet(new h.c.b(str), new BottomSheetActionParams(str3, t02, params3 != null ? params3.get("state") : null), payload.getBottomSheetBadges(), payload.getBottomSheetTokenizedEvent(), payload.getNumberPVZ());
        }
        TraceApiKt.endDebugTrace("mapUpdateBottomSheet", 1);
    }

    private final void updateFlags(AddressEditMapState.AddressEditMapFlagsState payload) {
        TraceApiKt.beginDebugTrace("mapUpdateFlags", 1);
        this.isCentralPinShowing = payload.getShowCenterPin();
        this.processApplicationMove = payload.getProcessApplicationMove();
        this.processInitializeMap = payload.getProcessInitializeMap();
        setDefaultCenterPinVisibilityState$default(this, null, 1, null);
        TraceApiKt.endDebugTrace("mapUpdateFlags", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLogoPosition(boolean isShortInfoVisible) {
        if (!isShortInfoVisible) {
            OzonMapController.DefaultImpls.setLogoAlignment$default(getMapController(), LogoPosition.LEFT_TOP, 0, 0, 6, null);
            return;
        }
        FrameLayout shortInfoFL = this.addressEditMapView.getBinding().shortInfoFL;
        Intrinsics.checkNotNullExpressionValue(shortInfoFL, "shortInfoFL");
        int i11 = androidx.core.view.Y.f42258g;
        if (!shortInfoFL.isLaidOut() || shortInfoFL.isLayoutRequested()) {
            shortInfoFL.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$updateLogoPosition$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OzonMapController.DefaultImpls.setLogoAlignment$default(AddressEditMapViewWrapper.this.getMapController(), LogoPosition.LEFT_TOP, 0, ResourceExtKt.toDp(AddressEditMapViewWrapper.this.getAddressEditMapView().getBinding().shortInfoFL.getHeight()) + 10, 2, null);
                }
            });
        } else {
            OzonMapController.DefaultImpls.setLogoAlignment$default(getMapController(), LogoPosition.LEFT_TOP, 0, ResourceExtKt.toDp(getAddressEditMapView().getBinding().shortInfoFL.getHeight()) + 10, 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateNavbar(AddressEditMapState.NavBarState navBarState) {
        int i11;
        AddressEditMapVO.MiniAppHeader miniAppHeader;
        String navbarSubtitle;
        int themeColor;
        WidgetNouiAddressEditMapBinding binding = this.addressEditMapView.getBinding();
        TraceApiKt.beginDebugTrace("mapUpdateNavBar", 1);
        if (navBarState.getIsShowNavbarBackground()) {
            if (this.isSelectApp) {
                Integer parseColor = StyleParser.INSTANCE.parseColor(this.context, UniColors.BG_DARK_KEY.getToken());
                if (parseColor != null) {
                    themeColor = parseColor.intValue();
                }
            } else {
                themeColor = ThemeExtKt.themeColor(this.context, R$attr.layerFloor1);
            }
            i11 = themeColor;
            binding.filtersContainerFl.setBackgroundColor(i11);
            if (navBarState.getSelector() == null) {
                SwitchButtonsLayout selectorRV = binding.selectorRV;
                Intrinsics.checkNotNullExpressionValue(selectorRV, "selectorRV");
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(selectorRV);
                binding.selectorRV.createItems(navBarState.getSelector(), new AddressEditMapViewWrapper$updateNavbar$1$1$1(this), this.isSelectApp);
                TabsView dsTabs = binding.dsTabs;
                Intrinsics.checkNotNullExpressionValue(dsTabs, "dsTabs");
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(dsTabs);
            } else {
                TabsView dsTabs2 = binding.dsTabs;
                Intrinsics.checkNotNullExpressionValue(dsTabs2, "dsTabs");
                TabsHolderKt.bindOrGone(dsTabs2, navBarState.getDsTabs(), this.actionHandler);
                SwitchButtonsLayout selectorRV2 = binding.selectorRV;
                Intrinsics.checkNotNullExpressionValue(selectorRV2, "selectorRV");
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(selectorRV2);
            }
            TextView navbarTitleTv = binding.navbarTitleTv;
            Intrinsics.checkNotNullExpressionValue(navbarTitleTv, "navbarTitleTv");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navbarTitleTv, Boolean.valueOf(navBarState.getSelector() != null));
            binding.navbarTitleTv.setText(navBarState.getNavbarTitle());
            TextView navbarSubtitleTv = binding.navbarSubtitleTv;
            Intrinsics.checkNotNullExpressionValue(navbarSubtitleTv, "navbarSubtitleTv");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navbarSubtitleTv, Boolean.valueOf((navBarState.getSelector() == null || (navbarSubtitle = navBarState.getNavbarSubtitle()) == null || navbarSubtitle.length() == 0) ? false : true));
            binding.navbarSubtitleTv.setText(navBarState.getNavbarSubtitle());
            ConstraintLayout selectorContainer = binding.selectorContainer;
            Intrinsics.checkNotNullExpressionValue(selectorContainer, "selectorContainer");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(selectorContainer, Boolean.valueOf(navBarState.getMiniAppHeader() != null));
            LinearLayout navbarContainer = binding.navbarContainer;
            Intrinsics.checkNotNullExpressionValue(navbarContainer, "navbarContainer");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navbarContainer, Boolean.valueOf(navBarState.getMiniAppHeader() == null));
            IslandSeparatorView navBarRoundedSeparator = binding.navBarRoundedSeparator;
            Intrinsics.checkNotNullExpressionValue(navBarRoundedSeparator, "navBarRoundedSeparator");
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navBarRoundedSeparator, Boolean.valueOf(navBarState.getMiniAppHeader() == null || this.isSelectApp));
            miniAppHeader = navBarState.getMiniAppHeader();
            if (miniAppHeader != null) {
                int parseColor2 = StyleParser.INSTANCE.parseColor(this.context, miniAppHeader.getBackgroundColor(), R$color.transparent);
                binding.navbarContainer.setBackgroundColor(parseColor2);
                LinearLayout navbarContainer2 = binding.navbarContainer;
                Intrinsics.checkNotNullExpressionValue(navbarContainer2, "navbarContainer");
                Context L11 = this.container.L();
                Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
                ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.updatePadding$default(navbarContainer2, 0, ResourceExtKt.getStatusBarHeight(L11) + STATUS_BAR_SPACING, 0, 0, 13, null);
                binding.navBarRoundedSeparator.setViewState(new IslandSeparatorView.ViewState(false, false, 0, parseColor2, 2, null));
                binding.navBarHeader.bindIcon(miniAppHeader.getIcon());
                binding.navBarHeader.bindTitle(miniAppHeader.getTitle());
                binding.navBarHeader.bindLogo(miniAppHeader.getLogo());
                IconButtonV3View rightButton = binding.rightButton;
                Intrinsics.checkNotNullExpressionValue(rightButton, "rightButton");
                IconButtonV3HolderKt.bind(rightButton, miniAppHeader.getRightButton(), this.actionHandler);
                View view = this.container.K().h().getView();
                if (view != null) {
                    view.setFitsSystemWindows(false);
                }
                StatusBarController statusBarController = StatusBarController.INSTANCE;
                Window window = this.container.K().g().getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                statusBarController.setFullScreenWindow(window, true);
                ComponentCallbacksC5392m b11 = this.container.K().b();
                StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
                statusBarController.setStatusBarBackgroundColor(b11, newState, 0);
                StatusBarController.setStatusBarContentColor$default(statusBarController, this.container.K().b(), newState, true, false, 8, null);
                ViewGroup.LayoutParams layoutParams = binding.bottomSheetCoordinatorContainer.getLayoutParams();
                ConstraintLayout.b bVar = null;
                ConstraintLayout.b bVar2 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                if (bVar2 != null) {
                    ((ViewGroup.MarginLayoutParams) bVar2).topMargin = Companion.getSheetPageOffset();
                    bVar = bVar2;
                }
                binding.bottomSheetCoordinatorContainer.setLayoutParams(bVar);
            }
            if (this.isSelectApp) {
                binding.selectorRV.setBackgroundResource(ru.ozon.app.android.geo.R$drawable.switch_rounded_bg_select);
                binding.navBarRoundedSeparator.setViewState(new IslandSeparatorView.ViewState(false, false, ResourceExtKt.toPx(4), i11, 2, null));
                StatusBarController statusBarController2 = StatusBarController.INSTANCE;
                ComponentCallbacksC5392m b12 = this.container.K().b();
                StatusBarController.UpdateReason.NewState newState2 = StatusBarController.UpdateReason.NewState.INSTANCE;
                statusBarController2.setStatusBarBackgroundColor(b12, newState2, i11);
                StatusBarController.setStatusBarContentColor$default(statusBarController2, this.container.K().b(), newState2, true, false, 8, null);
                ImageView backBtn = binding.backBtn;
                Intrinsics.checkNotNullExpressionValue(backBtn, "backBtn");
                StyleParser styleParser = StyleParser.INSTANCE;
                ThemeExtKt.tint(backBtn, styleParser.parseColor(this.context, UniColors.GRAPHIC_TERTIARY_ON_DARK.getToken()));
                if (navBarState.getSelector() == null) {
                    TextView textView = binding.navbarTitleTv;
                    Integer parseColor3 = styleParser.parseColor(this.context, UniColors.TEXT_PRIMARY_ON_DARK.getToken());
                    textView.setTextColor(parseColor3 != null ? parseColor3.intValue() : 0);
                    TextView textView2 = binding.navbarSubtitleTv;
                    Integer parseColor4 = styleParser.parseColor(this.context, UniColors.TEXT_SECONDARY_ON_DARK.getToken());
                    textView2.setTextColor(parseColor4 != null ? parseColor4.intValue() : 0);
                }
            }
            TraceApiKt.endDebugTrace("mapUpdateNavBar", 1);
        }
        i11 = 0;
        binding.filtersContainerFl.setBackgroundColor(i11);
        if (navBarState.getSelector() == null) {
        }
        TextView navbarTitleTv2 = binding.navbarTitleTv;
        Intrinsics.checkNotNullExpressionValue(navbarTitleTv2, "navbarTitleTv");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navbarTitleTv2, Boolean.valueOf(navBarState.getSelector() != null));
        binding.navbarTitleTv.setText(navBarState.getNavbarTitle());
        TextView navbarSubtitleTv2 = binding.navbarSubtitleTv;
        Intrinsics.checkNotNullExpressionValue(navbarSubtitleTv2, "navbarSubtitleTv");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navbarSubtitleTv2, Boolean.valueOf((navBarState.getSelector() == null || (navbarSubtitle = navBarState.getNavbarSubtitle()) == null || navbarSubtitle.length() == 0) ? false : true));
        binding.navbarSubtitleTv.setText(navBarState.getNavbarSubtitle());
        ConstraintLayout selectorContainer2 = binding.selectorContainer;
        Intrinsics.checkNotNullExpressionValue(selectorContainer2, "selectorContainer");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(selectorContainer2, Boolean.valueOf(navBarState.getMiniAppHeader() != null));
        LinearLayout navbarContainer3 = binding.navbarContainer;
        Intrinsics.checkNotNullExpressionValue(navbarContainer3, "navbarContainer");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navbarContainer3, Boolean.valueOf(navBarState.getMiniAppHeader() == null));
        IslandSeparatorView navBarRoundedSeparator2 = binding.navBarRoundedSeparator;
        Intrinsics.checkNotNullExpressionValue(navBarRoundedSeparator2, "navBarRoundedSeparator");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.showOrGone(navBarRoundedSeparator2, Boolean.valueOf(navBarState.getMiniAppHeader() == null || this.isSelectApp));
        miniAppHeader = navBarState.getMiniAppHeader();
        if (miniAppHeader != null) {
        }
        if (this.isSelectApp) {
        }
        TraceApiKt.endDebugTrace("mapUpdateNavBar", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateZoomFocusPoint(ScreenRectModel screenRect) {
        if (screenRect == null) {
            return;
        }
        getMapController().setZoomFocusPoint(new Point((screenRect.getBottomRight().x - screenRect.getTopLeft().x) >> 1, (screenRect.getBottomRight().y - screenRect.getTopLeft().y) >> 1));
    }

    public final void attachToContainer() {
        this.pageModifier.attachToPage(this.container.Z());
        this.detailsPageSheet.attachToPage();
    }

    public final void bindState(@NotNull AddressEditMapVOWithPayloads pageWithPayloads) {
        Intrinsics.checkNotNullParameter(pageWithPayloads, "pageWithPayloads");
        setMapPerformanceInitStartTime();
        this.editMapVO = pageWithPayloads.getPage();
        this.isCentralPinShowing = pageWithPayloads.getPage().getShowCenterPin();
        for (final AddressEditMapState addressEditMapState : pageWithPayloads.getPayloads()) {
            if (addressEditMapState instanceof AddressEditMapState.NavBarState) {
                updateNavbar((AddressEditMapState.NavBarState) addressEditMapState);
            } else if (addressEditMapState instanceof AddressEditMapState.AddressEditMapFlagsState) {
                updateFlags((AddressEditMapState.AddressEditMapFlagsState) addressEditMapState);
            } else if (addressEditMapState instanceof AddressEditMapState.CameraState) {
                FrameLayout mapContainer = this.addressEditMapView.getBinding().mapContainer;
                Intrinsics.checkNotNullExpressionValue(mapContainer, "mapContainer");
                int i11 = androidx.core.view.Y.f42258g;
                if (!mapContainer.isLaidOut() || mapContainer.isLayoutRequested()) {
                    mapContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$bindState$lambda$13$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            Intrinsics.checkNotNullParameter(view, "view");
                            view.removeOnLayoutChangeListener(this);
                            TraceApiKt.beginDebugTrace("mapUpdateCamera", 1);
                            AddressEditMapViewWrapper.this.measureCenterPinPosition(view);
                            AddressEditMapViewWrapper.this.centerCamera((AddressEditMapState.CameraState) addressEditMapState);
                            AddressEditMapViewWrapper addressEditMapViewWrapper = AddressEditMapViewWrapper.this;
                            addressEditMapViewWrapper.updateZoomFocusPoint(addressEditMapViewWrapper.isCentralPinShowing ? AddressEditMapViewWrapper.this.getMapController().getFocusRect() : null);
                            TraceApiKt.endDebugTrace("mapUpdateCamera", 1);
                        }
                    });
                } else {
                    TraceApiKt.beginDebugTrace("mapUpdateCamera", 1);
                    measureCenterPinPosition(mapContainer);
                    centerCamera((AddressEditMapState.CameraState) addressEditMapState);
                    updateZoomFocusPoint(this.isCentralPinShowing ? getMapController().getFocusRect() : null);
                    TraceApiKt.endDebugTrace("mapUpdateCamera", 1);
                }
            } else if (addressEditMapState instanceof AddressEditMapState.BottomSheetState) {
                updateBottomSheet((AddressEditMapState.BottomSheetState) addressEditMapState);
            } else if (addressEditMapState instanceof AddressEditMapState.PageIconsState) {
                this.pageIconsAdapter.applyIconsState(((AddressEditMapState.PageIconsState) addressEditMapState).getIcons(), this.isSelectApp);
            } else {
                if (!(addressEditMapState instanceof AddressEditMapState.BannerState)) {
                    throw new o();
                }
                this.pageIconsAdapter.applyBannerState(((AddressEditMapState.BannerState) addressEditMapState).getBannerIcon(), this.isSelectApp);
            }
        }
        bindShortInfo();
    }

    public final void changeSelectedTab(@NotNull String url, @NotNull AddressEditMapDTO.Selector.Type type) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        CameraPositionModel cameraPosition$default = OzonMapController.DefaultImpls.getCameraPosition$default(getMapController(), null, 1, null);
        if (cameraPosition$default != null) {
            float zoom = cameraPosition$default.getZoom();
            AddressEditMapViewListener addressEditMapViewListener = this.mapListener;
            if (addressEditMapViewListener != null) {
                addressEditMapViewListener.onSelectorPressed(url, zoom, getViewport(), null, type);
            }
        }
    }

    public final void clearUserPin() {
        this.userPin = null;
    }

    @NotNull
    /* renamed from: getAddressEditMapView$geo_prodGoogleAllVendorsRelease, reason: from getter */
    public final AddressEditMapView getAddressEditMapView() {
        return this.addressEditMapView;
    }

    @NotNull
    public final i getContainer() {
        return this.container;
    }

    @NotNull
    public final OzonMapController getMapController() {
        return (OzonMapController) this.mapController.getValue();
    }

    public final AddressEditMapViewListener getMapListener() {
        return this.mapListener;
    }

    @NotNull
    public final MapPerformanceAnalyticsManager getMapPerformanceAnalyticsManager() {
        return this.mapPerformanceAnalyticsManager;
    }

    @NotNull
    public final OzonMapProvider getOzonMapProvider() {
        return this.ozonMapProvider;
    }

    @NotNull
    public final J getSubscribeOwner() {
        return this.subscribeOwner;
    }

    @NotNull
    public final Function0<ru.ozon.composer.ui.widget.l> getViewObjectProvider() {
        return this.viewObjectProvider;
    }

    public final void handleBannerState(@NotNull AddressEditMapViewModel.BannerState bannerState) {
        Intrinsics.checkNotNullParameter(bannerState, "bannerState");
        this.pageIconsAdapter.updateBannerState(bannerState);
    }

    public final void hideDetailsSheet() {
        this.detailsPageSheet.hide();
    }

    public final void hideLoader() {
        View findViewById = this.container.Z().findViewById(R$id.layoutBackgroundProgressBar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.fadeOut(findViewById, 150L);
    }

    public final void moveToPoint(AddressEditMapVO.ViewPort viewPort, AddressEditMapState.CameraState cameraState, Function1<? super CameraPositionModel, Unit> startAction, final Function0<Unit> endAction) {
        AddressEditMapVO.ViewPort viewPort2;
        AddressEditMapVO.Pin centerPin;
        AddressEditMapVO.Coordinate coordinate;
        CoordinateModel coordinateModel = this.currentCoordinate;
        if (coordinateModel == null) {
            coordinateModel = (cameraState == null || (centerPin = cameraState.getCenterPin()) == null || (coordinate = centerPin.getCoordinate()) == null) ? null : AddressEditMapMapperKt.toPoint(coordinate);
            if (coordinateModel == null) {
                return;
            }
        }
        CoordinateModel coordinateModel2 = coordinateModel;
        CameraPositionModel cameraPosition$default = OzonMapController.DefaultImpls.getCameraPosition$default(getMapController(), null, 1, null);
        if (cameraPosition$default == null) {
            return;
        }
        if (viewPort == null) {
            AddressEditMapVO addressEditMapVO = this.editMapVO;
            if (addressEditMapVO == null) {
                Intrinsics.n("editMapVO");
                throw null;
            }
            viewPort2 = addressEditMapVO.getViewPort();
        } else {
            viewPort2 = viewPort;
        }
        Float zoomForViewPort = getZoomForViewPort(viewPort2, new AddressEditMapViewWrapper$moveToPoint$targetZoom$1(this));
        if (zoomForViewPort != null) {
            float floatValue = zoomForViewPort.floatValue();
            if (Math.abs(floatValue - cameraPosition$default.getZoom()) < 0.01f) {
                floatValue = cameraPosition$default.getZoom();
            }
            final CameraPositionModel copy$default = CameraPositionModel.copy$default(cameraPosition$default, coordinateModel2, floatValue, 0.0f, 0.0f, 12, null);
            if (startAction != null) {
                startAction.invoke(copy$default);
            }
            final OzonMapController mapController = getMapController();
            View contentView = mapController.getContentView();
            int i11 = androidx.core.view.Y.f42258g;
            if (!contentView.isLaidOut() || contentView.isLayoutRequested()) {
                contentView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper$moveToPoint$lambda$15$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        if (AddressEditMapViewWrapper.this.cameraMotionState == CameraMotionState.IDLE) {
                            OzonMapController ozonMapController = mapController;
                            CameraPositionModel cameraPositionModel = copy$default;
                            OzonMapController.DefaultImpls.moveToAnimated$default(ozonMapController, cameraPositionModel, null, new AddressEditMapViewWrapper$moveToPoint$1$1$1(AddressEditMapViewWrapper.this, cameraPositionModel, endAction), 2, null);
                        } else {
                            Function0 function0 = endAction;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }
                    }
                });
            } else if (this.cameraMotionState == CameraMotionState.IDLE) {
                OzonMapController.DefaultImpls.moveToAnimated$default(mapController, copy$default, null, new AddressEditMapViewWrapper$moveToPoint$1$1$1(this, copy$default, endAction), 2, null);
            } else if (endAction != null) {
                endAction.invoke();
            }
        }
    }

    public final void onInitializeMap() {
        this.processInitializeMap = true;
    }

    public final void onStart() {
        getMapController().onStart();
        startObserveShortInfoVisibility();
    }

    public final void onStop() {
        getMapController().onStop();
    }

    public final boolean removeFromContainer() {
        clearListeners();
        this.detailsPageSheet.detachFromPage(this.childFragmentManager);
        this.pageIconsAdapter.detachFromPage();
        this.pageModifier.detachFromPage(this.container.Z());
        this.mapAnimator.clear();
        return true;
    }

    public final void requestLocationPermission(boolean isRationaleNeeded) {
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 != null) {
            FragmentsKt.requestPermission(b11, new AddressEditMapViewWrapper$requestLocationPermission$1(this, isRationaleNeeded));
        }
    }

    public final void scheduleSlideDown() {
        this.bottomSheetExpandedStateFlow.setValue(Boolean.FALSE);
    }

    public final void scheduleSlideUp() {
        AddressEditMapVO addressEditMapVO = this.editMapVO;
        if (addressEditMapVO != null) {
            if (addressEditMapVO == null) {
                Intrinsics.n("editMapVO");
                throw null;
            }
            if (addressEditMapVO.getBottomSheetAction() != null) {
                return;
            }
        }
        this.bottomSheetExpandedStateFlow.setValue(Boolean.TRUE);
    }

    public final void setMapListener(AddressEditMapViewListener addressEditMapViewListener) {
        this.mapListener = addressEditMapViewListener;
    }

    public final void setOnBackPressed(Function0<Unit> function0) {
        this.onBackPressed = function0;
    }

    public final void setupMapController() {
        OzonMapController mapController = getMapController();
        mapController.setRotateGesturesEnabled(false);
        mapController.setTiltGesturesEnabled(false);
        mapController.setOnSizeChanged(new AddressEditMapViewWrapper$setupMapController$1$1(this));
        mapController.setOnCameraChanged(new AddressEditMapViewWrapper$setupMapController$1$2(this));
    }

    public final void showLoader() {
        ImageView markerIv = this.addressEditMapView.getBinding().markerIv;
        Intrinsics.checkNotNullExpressionValue(markerIv, "markerIv");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(markerIv);
        View findViewById = this.container.Z().findViewById(R$id.layoutBackgroundProgressBar);
        findViewById.setElevation(this.progressBarElevation);
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.fadeIn(findViewById, 150L);
    }

    public final void showLocationDisabledRestriction(@NotNull ResolvableApiException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.canShowLocationDisabledRestriction) {
            this.canShowLocationDisabledRestriction = false;
            try {
                r rVar = this.activity;
                Intrinsics.f(rVar);
                exception.startResolutionForResult(rVar, 992);
            } catch (IntentSender.SendIntentException e11) {
                Lm0.a.f17149a.w(e11);
            }
        }
    }

    public final void showUserLocationPinIfNeed(AddressEditMapVO.LocationMarker userLocationMarker) {
        if (userLocationMarker == null || userLocationMarker.equals(this.userPin)) {
            return;
        }
        this.userPin = userLocationMarker;
        MapIconProvider mapIconProvider = this.iconProvider;
        AddressEditMapViewWrapper$showUserLocationPinIfNeed$1$1 addressEditMapViewWrapper$showUserLocationPinIfNeed$1$1 = new AddressEditMapViewWrapper$showUserLocationPinIfNeed$1$1(this, userLocationMarker);
        AddressEditMapVO.LocationMarker locationMarker = this.userPin;
        mapIconProvider.createUserLocationMarker(userLocationMarker, addressEditMapViewWrapper$showUserLocationPinIfNeed$1$1, Boolean.valueOf((locationMarker != null ? locationMarker.getTooltip() : null) != null));
    }

    public final void startAnalyticsObserve() {
        this.mapPerformanceAnalyticsManager.startObservation(this.iconProvider.getInitItemsCounterState(), getMapController().getTilesLoadingFlow(), this.subscribeOwner);
    }

    public final void startClusterizationAnimation() {
        this.mapAnimator.startAnimation();
    }

    public final void stopClusterizationAnimation() {
        this.mapAnimator.stopAnimation();
    }

    private final void centerCamera(AddressEditMapVO.ViewPort viewPort, AddressEditMapState.CameraState cameraState, Function1<? super CameraPositionModel, Unit> startAction, Function0<Unit> endAction) {
        moveToPoint(viewPort, cameraState, startAction, endAction);
    }
}
