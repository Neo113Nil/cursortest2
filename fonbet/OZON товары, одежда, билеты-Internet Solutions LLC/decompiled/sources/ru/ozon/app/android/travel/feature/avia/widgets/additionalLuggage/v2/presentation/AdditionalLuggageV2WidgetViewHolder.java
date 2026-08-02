package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import Bi.a;
import Fy.ViewOnLayoutChangeListenerC3067e;
import LS.c;
import Sc.o;
import Vg.d;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import i10.l;
import java.util.List;
import java.util.Map;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetAdditionalLuggageV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2OptionClickKey;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2WidgetViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.AdditionalLuggageV2FlightsAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.FlightLuggageSelectionPayload;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs.AdditionalLuggageV2TabDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs.AdditionalLuggageV2TabsAdapter;
import ru.ozon.app.android.travel.utils.CenterSmoothScroller;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u008d\u0001\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B7\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010\"\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b\"\u0010$J\u001d\u0010'\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010\u0016J!\u00105\u001a\u00020\u00142\b\b\u0001\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J!\u00107\u001a\u00020\u00142\b\b\u0001\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u0014H\u0002¢\u0006\u0004\b8\u0010\u0016J\u000f\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b9\u0010\u0016J\u001f\u0010<\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020:2\u0006\u0010;\u001a\u000201H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0014H\u0002¢\u0006\u0004\bA\u0010\u0016J\u000f\u0010B\u001a\u00020\u0014H\u0002¢\u0006\u0004\bB\u0010\u0016J\u000f\u0010C\u001a\u00020\u0014H\u0002¢\u0006\u0004\bC\u0010\u0016J\u0017\u0010E\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010N\u001a\u00020\u00142\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJG\u0010V\u001a\u00020\u00142\u0006\u0010P\u001a\u0002032\u0006\u0010Q\u001a\u0002032\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00140R2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00140TH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00142\u0006\u0010X\u001a\u000201H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010X\u001a\u000201H\u0002¢\u0006\u0004\b[\u0010ZJ\u0017\u0010^\u001a\u00020\u00142\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00142\u0006\u0010]\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u0014H\u0002¢\u0006\u0004\bc\u0010\u0016J\u0017\u0010e\u001a\u00020\u00142\u0006\u0010d\u001a\u00020LH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u0014H\u0002¢\u0006\u0004\bg\u0010\u0016J\u000f\u0010h\u001a\u00020\u0014H\u0002¢\u0006\u0004\bh\u0010\u0016J\u000f\u0010i\u001a\u00020\u0014H\u0002¢\u0006\u0004\bi\u0010\u0016J\u000f\u0010j\u001a\u00020\u0014H\u0002¢\u0006\u0004\bj\u0010\u0016J\u000f\u0010k\u001a\u00020\u0014H\u0002¢\u0006\u0004\bk\u0010\u0016J\u000f\u0010l\u001a\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010mR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010nR\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010oR\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010zR\u0014\u0010{\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R%\u0010\u0085\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u00140\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0092\u0001R\u001a\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0098\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel;LWZ/l;LVg/d;)V", "", "onAttach", "()V", "onDetach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;Ll20/d;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "setUpRoot", "", "color", "", "radius", "setUpAppBarBackground", "(IF)V", "setUpActionPaneBackground", "setUpPassengerTabsRecyclerView", "setUpFlightsRecyclerView", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "selectedTabPosition", "bindAppBar", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;I)V", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "bindActionPane", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;)V", "addFlightsOnTouchListener", "addFlightsSwipeListener", "removeFlightsSwipeListener", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateTabBorder;", "updateTabBorder", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateTabBorder;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick;", "updateOptionClick", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick;)V", "", "formattedPrice", "", "isPriceDecreased", "updatePrice", "(Ljava/lang/CharSequence;Z)V", "firstAnimationEnd", "secondAnimationStart", "Lkotlin/Function2;", "update", "Lkotlin/Function0;", "onSecondAnimationStart", "animatePriceChange", "(FFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "position", "scrollToTabPosition", "(I)V", "checkAppBarElevation", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult;", "result", "handleSaveLuggageResult", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult$Success;", "trackActionAnalytics", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult$Success;)V", "showError", "isVisible", "setProgressVisibility", "(Z)V", "disableSwipeToRefresh", "addAppBarLayoutChangeListener", "removeAppBarLayoutChangeListener", "addActionPaneChangeListener", "removeActionPaneChangeListener", "observeLiveData", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel;", "LWZ/l;", "LVg/d;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetAdditionalLuggageV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetAdditionalLuggageV2Binding;", "", "animationDuration", "J", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "defaultInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "F", "backgroundColor", "I", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/tabs/AdditionalLuggageV2TabsAdapter;", "tabsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/tabs/AdditionalLuggageV2TabsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/AdditionalLuggageV2FlightsAdapter;", "flightsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/AdditionalLuggageV2FlightsAdapter;", "Landroidx/recyclerview/widget/x;", "pagerSnapHelper", "Landroidx/recyclerview/widget/x;", "ru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewHolder$flightsScrollListener$1", "flightsScrollListener", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewHolder$flightsScrollListener$1;", "Landroid/view/View$OnLayoutChangeListener;", "appBarLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "actionPaneLayoutChangeListener", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2WidgetViewModel;", "widgetViewModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2WidgetViewHolder extends k<AdditionalLuggageV2VO> implements AsyncWidgetCallbacks<AdditionalLuggageV2VO.LuggageContent> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View.OnLayoutChangeListener actionPaneLayoutChangeListener;
    private final long animationDuration;

    @NotNull
    private final View.OnLayoutChangeListener appBarLayoutChangeListener;
    private final int backgroundColor;

    @NotNull
    private final RoundedBackgroundProducer backgroundProducer;

    @NotNull
    private final WidgetAdditionalLuggageV2Binding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final AccelerateDecelerateInterpolator defaultInterpolator;

    @NotNull
    private final AdditionalLuggageV2FlightsAdapter flightsAdapter;

    @NotNull
    private final AdditionalLuggageV2WidgetViewHolder$flightsScrollListener$1 flightsScrollListener;

    @NotNull
    private final x pagerSnapHelper;
    private final float radius;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final AdditionalLuggageV2TabsAdapter tabsAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AdditionalLuggageV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r7v4, types: [ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2WidgetViewHolder$flightsScrollListener$1] */
    public AdditionalLuggageV2WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull AdditionalLuggageV2ViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        WidgetAdditionalLuggageV2Binding bind = WidgetAdditionalLuggageV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.animationDuration = getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.defaultInterpolator = new AccelerateDecelerateInterpolator();
        float pxF = ResourceExtKt.toPxF(16, getContext());
        this.radius = pxF;
        int themeColor = ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        this.backgroundProducer = new RoundedBackgroundProducer();
        this.tabsAdapter = new AdditionalLuggageV2TabsAdapter(new AdditionalLuggageV2WidgetViewHolder$tabsAdapter$1(viewModel));
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new AdditionalLuggageV2WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.flightsAdapter = new AdditionalLuggageV2FlightsAdapter(K.a(this), new RecyclerView.u(), new AdditionalLuggageV2WidgetViewHolder$flightsAdapter$1(viewModel), new AdditionalLuggageV2WidgetViewHolder$flightsAdapter$2(bind.additionalLuggageV2AppBarRoot), (int) pxF);
        this.pagerSnapHelper = new x();
        this.flightsScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2WidgetViewHolder$flightsScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                RecyclerView.o layoutManager;
                x xVar;
                int position;
                AdditionalLuggageV2ViewModel additionalLuggageV2ViewModel;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState != 0 || (layoutManager = recyclerView.getLayoutManager()) == null) {
                    return;
                }
                xVar = AdditionalLuggageV2WidgetViewHolder.this.pagerSnapHelper;
                View findSnapView = xVar.findSnapView(layoutManager);
                if (findSnapView == null || (position = layoutManager.getPosition(findSnapView)) == -1) {
                    return;
                }
                additionalLuggageV2ViewModel = AdditionalLuggageV2WidgetViewHolder.this.viewModel;
                additionalLuggageV2ViewModel.onFlightSwiped(position);
            }
        };
        this.appBarLayoutChangeListener = new ViewOnLayoutChangeListenerC3067e(this, 3);
        this.actionPaneLayoutChangeListener = new c(this, 1);
        setUpRoot();
        setUpAppBarBackground(themeColor, pxF);
        setUpActionPaneBackground(themeColor, pxF);
        setUpPassengerTabsRecyclerView();
        setUpFlightsRecyclerView();
        disableSwipeToRefresh();
        addFlightsOnTouchListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void actionPaneLayoutChangeListener$lambda$1(AdditionalLuggageV2WidgetViewHolder additionalLuggageV2WidgetViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        RecyclerView additionalLuggageV2FlightsRecyclerView = additionalLuggageV2WidgetViewHolder.binding.additionalLuggageV2FlightsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2FlightsRecyclerView, "additionalLuggageV2FlightsRecyclerView");
        ViewExtKt.updatePadding$default(additionalLuggageV2FlightsRecyclerView, 0, 0, 0, (i14 - i12) - ((int) additionalLuggageV2WidgetViewHolder.radius), 7, null);
    }

    private final void addActionPaneChangeListener() {
        this.binding.additionalLuggageV2ActionPaneRoot.addOnLayoutChangeListener(this.actionPaneLayoutChangeListener);
    }

    private final void addAppBarLayoutChangeListener() {
        this.binding.additionalLuggageV2AppBarRoot.addOnLayoutChangeListener(this.appBarLayoutChangeListener);
    }

    private final void addFlightsOnTouchListener() {
        RecyclerView additionalLuggageV2FlightsRecyclerView = this.binding.additionalLuggageV2FlightsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2FlightsRecyclerView, "additionalLuggageV2FlightsRecyclerView");
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(additionalLuggageV2FlightsRecyclerView, true);
    }

    private final void addFlightsSwipeListener() {
        this.binding.additionalLuggageV2FlightsRecyclerView.addOnScrollListener(this.flightsScrollListener);
    }

    private final void animatePriceChange(float firstAnimationEnd, final float secondAnimationStart, final Function2<? super Float, ? super Float, Unit> update, final Function0<Unit> onSecondAnimationStart) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, firstAnimationEnd);
        final float f7 = firstAnimationEnd - 0.0f;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jM.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AdditionalLuggageV2WidgetViewHolder.animatePriceChange$lambda$9$lambda$8(f7, 0.0f, update, valueAnimator);
            }
        });
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(secondAnimationStart, 0.0f);
        final float f11 = 0.0f - secondAnimationStart;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jM.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AdditionalLuggageV2WidgetViewHolder.animatePriceChange$lambda$11$lambda$10(secondAnimationStart, f11, update, valueAnimator);
            }
        });
        ofFloat2.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2WidgetViewHolder$animatePriceChange$secondAnimation$1$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                ofFloat2.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                ofFloat2.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                onSecondAnimationStart.invoke();
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(this.defaultInterpolator);
        animatorSet.setDuration(this.animationDuration);
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animatePriceChange$lambda$11$lambda$10(float f7, float f11, Function2 function2, ValueAnimator valueAnimator) {
        Float f12 = (Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float");
        function2.invoke(f12, Float.valueOf((f12.floatValue() - f7) / f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animatePriceChange$lambda$9$lambda$8(float f7, float f11, Function2 function2, ValueAnimator valueAnimator) {
        Float f12 = (Float) a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float");
        function2.invoke(f12, Float.valueOf((f7 - (f12.floatValue() - f11)) / f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appBarLayoutChangeListener$lambda$0(AdditionalLuggageV2WidgetViewHolder additionalLuggageV2WidgetViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        RecyclerView additionalLuggageV2FlightsRecyclerView = additionalLuggageV2WidgetViewHolder.binding.additionalLuggageV2FlightsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2FlightsRecyclerView, "additionalLuggageV2FlightsRecyclerView");
        ViewExtKt.updatePadding$default(additionalLuggageV2FlightsRecyclerView, 0, (i14 - i12) - ((int) additionalLuggageV2WidgetViewHolder.radius), 0, 0, 13, null);
    }

    private final void bindActionPane(AdditionalLuggageV2VO.ActionPaneVO item) {
        TextAtomView additionalLuggageV2LuggageLabelTextView = this.binding.additionalLuggageV2LuggageLabelTextView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2LuggageLabelTextView, "additionalLuggageV2LuggageLabelTextView");
        TextAtomHolderKt.bind$default(additionalLuggageV2LuggageLabelTextView, item.getPriceDescription(), null, 2, null);
        SmallIconButtonView additionalLuggageV2InfoButton = this.binding.additionalLuggageV2InfoButton;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2InfoButton, "additionalLuggageV2InfoButton");
        WrappedIconButtonHolderKt.bindOrGone(additionalLuggageV2InfoButton, item.getDetailsButton(), new AdditionalLuggageV2WidgetViewHolder$bindActionPane$1(this.viewModel));
        LargeButtonView additionalLuggageV2SaveButton = this.binding.additionalLuggageV2SaveButton;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2SaveButton, "additionalLuggageV2SaveButton");
        LargeButtonHolderKt.bind(additionalLuggageV2SaveButton, item.getSaveButton(), new AdditionalLuggageV2WidgetViewHolder$bindActionPane$2(this.viewModel));
        this.binding.additionalLuggageV2LuggagePriceTextView.setText(item.getFormattedTotalPrice());
    }

    private final void bindAppBar(AdditionalLuggageV2VO.AppBarVO item, int selectedTabPosition) {
        Group shimmerGroup = this.binding.shimmerGroup;
        Intrinsics.checkNotNullExpressionValue(shimmerGroup, "shimmerGroup");
        int i11 = 8;
        shimmerGroup.setVisibility(item.getIsShimmerVisible() ? 0 : 8);
        TextAtomView additionalLuggageV2TitleTextView = this.binding.additionalLuggageV2TitleTextView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2TitleTextView, "additionalLuggageV2TitleTextView");
        TextAtomHolderKt.bind$default(additionalLuggageV2TitleTextView, item.getTitle(), null, 2, null);
        TextAtomView additionalLuggageV2TitleTextView2 = this.binding.additionalLuggageV2TitleTextView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2TitleTextView2, "additionalLuggageV2TitleTextView");
        additionalLuggageV2TitleTextView2.setVisibility(!item.getIsShimmerVisible() ? 0 : 8);
        RecyclerView additionalLuggageV2TabsRecyclerView = this.binding.additionalLuggageV2TabsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2TabsRecyclerView, "additionalLuggageV2TabsRecyclerView");
        if (item.getArePassengerTabsVisible() && !item.getIsShimmerVisible()) {
            i11 = 0;
        }
        additionalLuggageV2TabsRecyclerView.setVisibility(i11);
        this.tabsAdapter.submitList(K.a(this), item.getPassengerTabs(), new AdditionalLuggageV2WidgetViewHolder$bindAppBar$1(this, selectedTabPosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAppBarElevation(int position) {
        this.flightsAdapter.notifyItemChanged(position, "FlightElevationPayload");
    }

    private final void disableSwipeToRefresh() {
        ViewGroup rootView;
        SwipeRefreshLayout composerSwipeRefresh;
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(rootView)) == null) {
            return;
        }
        composerSwipeRefresh.setEnabled(false);
    }

    private final AdditionalLuggageV2WidgetViewModel getWidgetViewModel() {
        return (AdditionalLuggageV2WidgetViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSaveLuggageResult(AdditionalLuggageV2ViewModel.SaveLuggageResult result) {
        if (Intrinsics.d(result, AdditionalLuggageV2ViewModel.SaveLuggageResult.Error.INSTANCE)) {
            showError();
        } else {
            if (!(result instanceof AdditionalLuggageV2ViewModel.SaveLuggageResult.Success)) {
                throw new o();
            }
            AdditionalLuggageV2ViewModel.SaveLuggageResult.Success success = (AdditionalLuggageV2ViewModel.SaveLuggageResult.Success) result;
            trackActionAnalytics(success);
            this.actionHandler.invoke(success.getAction());
        }
    }

    private final void observeLiveData() {
        AdditionalLuggageV2ViewModel additionalLuggageV2ViewModel = this.viewModel;
        additionalLuggageV2ViewModel.updateTabBorderLiveData().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$1(this)));
        additionalLuggageV2ViewModel.updateOptionClick().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$2(this)));
        additionalLuggageV2ViewModel.scrollFlightToPositionLiveData().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$3(this.binding.additionalLuggageV2FlightsRecyclerView)));
        additionalLuggageV2ViewModel.scrollTabToPosition().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$4(this)));
        additionalLuggageV2ViewModel.checkAppBarElevation().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$5(this)));
        additionalLuggageV2ViewModel.openPriceDetailsScreenLiveData().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$6(this.actionHandler)));
        additionalLuggageV2ViewModel.saveLuggageResultLiveData().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$7(this)));
        additionalLuggageV2ViewModel.progressLiveData().observe(this, new AdditionalLuggageV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AdditionalLuggageV2WidgetViewHolder$observeLiveData$1$8(this)));
    }

    private final void removeActionPaneChangeListener() {
        this.binding.additionalLuggageV2ActionPaneRoot.removeOnLayoutChangeListener(this.actionPaneLayoutChangeListener);
    }

    private final void removeAppBarLayoutChangeListener() {
        this.binding.additionalLuggageV2AppBarRoot.removeOnLayoutChangeListener(this.appBarLayoutChangeListener);
    }

    private final void removeFlightsSwipeListener() {
        this.binding.additionalLuggageV2FlightsRecyclerView.removeOnScrollListener(this.flightsScrollListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToTabPosition(int position) {
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(getContext());
        centerSmoothScroller.setTargetPosition(position);
        RecyclerView.o layoutManager = this.binding.additionalLuggageV2TabsRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(centerSmoothScroller);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgressVisibility(boolean isVisible) {
        InterfaceC7851b controller = this.references.getController();
        if (isVisible) {
            controller.e(new l.a.C1079a(0L, null, 3));
        } else {
            controller.hideLoader();
        }
    }

    private final void setUpActionPaneBackground(int color, float radius) {
        this.binding.additionalLuggageV2ActionPaneRoot.setBackground(RoundedBackgroundProducer.produce$default(this.backgroundProducer, color, radius, radius, 0.0f, 0.0f, 24, null));
    }

    private final void setUpAppBarBackground(int color, float radius) {
        this.binding.additionalLuggageV2AppBarRoot.setBackground(RoundedBackgroundProducer.produce$default(this.backgroundProducer, color, 0.0f, 0.0f, radius, radius, 6, null));
    }

    private final void setUpFlightsRecyclerView() {
        RecyclerView recyclerView = this.binding.additionalLuggageV2FlightsRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.flightsAdapter);
        this.pagerSnapHelper.attachToRecyclerView(recyclerView);
    }

    private final void setUpPassengerTabsRecyclerView() {
        RecyclerView recyclerView = this.binding.additionalLuggageV2TabsRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.tabsAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new AdditionalLuggageV2TabDecoration(context));
    }

    private final void setUpRoot() {
        this.binding.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    private final void showError() {
        ViewGroup rootView;
        C4911f container = this.references.getContainer();
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    private final void trackActionAnalytics(AdditionalLuggageV2ViewModel.SaveLuggageResult.Success result) {
        t tokenizedEvent$default;
        AdditionalLuggageV2VO boundData = getBoundData();
        if (boundData != null) {
            long id2 = boundData.getId();
            Map<String, String> trackingPayloads = result.getTrackingPayloads();
            if (trackingPayloads != null) {
                this.tokenizedAnalytics.e(trackingPayloads);
            }
            Map<String, TokenizedTrackingInfo> trackingInfo = result.getTrackingInfo();
            if (trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null)) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processComposerEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOptionClick(AdditionalLuggageV2ViewModel.UpdateOptionClick info) {
        InterfaceC7851b controller = this.references.getController();
        AdditionalLuggageV2ViewModel.UpdateOptionClick.Indicator indicator = info.getIndicator();
        controller.update(new AdditionalLuggageV2OptionClickKey(indicator != null ? new AdditionalLuggageV2OptionClickKey.Indicator(indicator.getPosition(), indicator.getHasAddedLuggage()) : null, info.getLuggage().getPassengerPosition(), info.getLuggage().getLuggagePosition(), info.getLuggage().getIsSelected(), info.getPrice().getPrice(), info.getPrice().getFormattedPrice(), info.getAddedLuggage()));
    }

    private final void updatePrice(CharSequence formattedPrice, boolean isPriceDecreased) {
        AppCompatTextView additionalLuggageV2LuggagePriceTextView = this.binding.additionalLuggageV2LuggagePriceTextView;
        Intrinsics.checkNotNullExpressionValue(additionalLuggageV2LuggagePriceTextView, "additionalLuggageV2LuggagePriceTextView");
        float height = additionalLuggageV2LuggagePriceTextView.getHeight();
        float f7 = isPriceDecreased ? height : -height;
        if (isPriceDecreased) {
            height = -height;
        }
        animatePriceChange(f7, height, new AdditionalLuggageV2WidgetViewHolder$updatePrice$1(additionalLuggageV2LuggagePriceTextView), new AdditionalLuggageV2WidgetViewHolder$updatePrice$2(additionalLuggageV2LuggagePriceTextView, formattedPrice));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTabBorder(AdditionalLuggageV2ViewModel.UpdateTabBorder item) {
        this.references.getController().update(new AdditionalLuggageV2PassengerClickKey(item.getOldPosition(), item.getNewPosition()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<AdditionalLuggageV2VO.LuggageContent> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.references.getController().update(new AdditionalLuggageV2PassengerAsyncKey(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        AdditionalLuggageV2VO.LuggageContent content;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        AdditionalLuggageV2VO boundData = getBoundData();
        if (boundData == null || (content = boundData.getContent()) == null) {
            return;
        }
        this.references.getController().update(new AdditionalLuggageV2PassengerAsyncKey(AdditionalLuggageV2VO.LuggageContent.copy$default(content, AdditionalLuggageV2VO.AppBarVO.copy$default(content.getAppBar(), null, false, false, null, 13, null), null, null, null, null, 0, 0, false, 126, null)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
        addFlightsSwipeListener();
        addAppBarLayoutChangeListener();
        addActionPaneChangeListener();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AdditionalLuggageV2WidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        removeActionPaneChangeListener();
        removeAppBarLayoutChangeListener();
        removeFlightsSwipeListener();
        super.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewsExtensionsKt.updateHeightRegardingOverlapContainers$default(constraintLayout, info, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalLuggageV2VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof AdditionalLuggageV2TabSelectionPayload) {
            List<AdditionalLuggageV2VO.PassengerTabVO> passengerTabs = item.getContent().getAppBar().getPassengerTabs();
            AdditionalLuggageV2TabSelectionPayload additionalLuggageV2TabSelectionPayload = (AdditionalLuggageV2TabSelectionPayload) payload;
            this.tabsAdapter.updateItem(additionalLuggageV2TabSelectionPayload.getOldPosition(), new AdditionalLuggageV2WidgetViewHolder$bind$1(passengerTabs, payload), "PassengerTabPayloadBorder");
            this.tabsAdapter.updateItem(additionalLuggageV2TabSelectionPayload.getNewPosition(), new AdditionalLuggageV2WidgetViewHolder$bind$2(passengerTabs, payload), "PassengerTabPayloadBorder");
            return;
        }
        if (payload instanceof AdditionalLuggageV2OptionSelectionPayload) {
            List<AdditionalLuggageV2VO.PassengerTabVO> passengerTabs2 = item.getContent().getAppBar().getPassengerTabs();
            AdditionalLuggageV2OptionSelectionPayload additionalLuggageV2OptionSelectionPayload = (AdditionalLuggageV2OptionSelectionPayload) payload;
            Integer updatedIndicatorTabPosition = additionalLuggageV2OptionSelectionPayload.getUpdatedIndicatorTabPosition();
            if (updatedIndicatorTabPosition != null) {
                int intValue = updatedIndicatorTabPosition.intValue();
                this.tabsAdapter.updateItem(intValue, new AdditionalLuggageV2WidgetViewHolder$bind$3$1(passengerTabs2, intValue), "PassengerTabPayloadIndicator");
            }
            this.flightsAdapter.updateItem(additionalLuggageV2OptionSelectionPayload.getPassengerPosition(), new AdditionalLuggageV2WidgetViewHolder$bind$4(item, payload), new FlightLuggageSelectionPayload(additionalLuggageV2OptionSelectionPayload.getOptionItemPosition()));
            updatePrice(additionalLuggageV2OptionSelectionPayload.getFormattedPrice(), additionalLuggageV2OptionSelectionPayload.getIsPriceDecreased());
            return;
        }
        bind(item, info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalLuggageV2VO item, @NotNull l20.d info) {
        AdditionalLuggageV2WidgetViewModel widgetViewModel;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AdditionalLuggageV2VO.LuggageContent content = item.getContent();
        if (content.getShouldFetchState() && item.getAsyncData() != null && (widgetViewModel = getWidgetViewModel()) != null) {
            widgetViewModel.fetchWidget(item.getAsyncData());
        }
        this.viewModel.bind(item);
        bindAppBar(content.getAppBar(), content.getSelectedTabPosition());
        bindActionPane(content.getActionPane());
        this.flightsAdapter.submitList(K.a(this), (content.getShouldFetchState() || content.getEmptyState() == null) ? content.getFlights() : C7714v.a0(content.getEmptyState()), new AdditionalLuggageV2WidgetViewHolder$bind$5$1(this, content));
    }
}
