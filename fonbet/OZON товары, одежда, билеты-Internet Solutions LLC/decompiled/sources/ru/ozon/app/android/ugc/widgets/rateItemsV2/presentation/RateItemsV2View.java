package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import GZ.g;
import Ge.n;
import Sc.InterfaceC4008j;
import Sc.s;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.events.RateItemsVisibleEvent;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.RateItemsDelegate;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.pdp.utils.StartSnapHelper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2Binding;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2DTO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2BottomBehavior;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.adapter.RateItemsV2Adapter;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.BaseRateItemV2ViewHolder;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.ProductItemRecyclerAnimator;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.utils.TogglingSnapHelper;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;

@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002Ut\b\u0001\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010#J\u0019\u0010'\u001a\u0004\u0018\u00010\u000e2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010#J\r\u0010*\u001a\u00020\u000e¢\u0006\u0004\b*\u0010#J'\u00100\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u000e*\u0002022\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010#J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010#J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u00020,H\u0002¢\u0006\u0004\b8\u00109J!\u0010<\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u00162\u0006\u0010;\u001a\u00020,H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u0010#J\u0019\u0010@\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u0016\u0010K\u001a\u0004\u0018\u00010J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020,0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010p\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0089\u0001"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2View;", "", "Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2Binding;", "binding", "Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsDelegate;", "rateItemsDelegate", "LGZ/g;", "router", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "ignoreActionHandler", "Lkotlin/Function2;", "", "onTimerFinish", "addReviewActionHandler", "isTeen", "", "cellActionHandler", "<init>", "(Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2Binding;Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsDelegate;LGZ/g;LWZ/l;Ll10/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;)V", "Landroid/view/View;", "view", "setBottomBorderViewToBehaviour", "(Landroid/view/View;)V", "dismiss", "()V", "removeCallBacks", "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "updateHeader", "(Lru/ozon/uni/atoms/data/text/TextDTO;)Lkotlin/Unit;", "animateIgnoreItem", "clearSentViewedItems", "deeplink", "", "ratingValue", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "rateProductItem", "openReviewFormScreen", "(Ljava/lang/String;ILru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;)V", "LWZ/t;", "processRatingClick", "(LWZ/t;I)V", "configure", "sendViewEventsForVisibleItems", "position", "sendItemViewEvent", "(I)V", "sku", "rating", "markItemRated", "(Ljava/lang/String;I)V", "expandLastItemIfNeeded", "strokeColor", "setupForeground", "(Ljava/lang/String;)V", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;", "scrollType", "setupSnapHelper", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/data/RateItemsV2DTO$ScrollType;)V", "Lru/ozon/app/android/ugc/databinding/WidgetRateItemsV2Binding;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/rateItems/RateItemsDelegate;", "LGZ/g;", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView;", "composerRv", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2BottomBehavior;", "behavior", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2BottomBehavior;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/adapter/RateItemsV2Adapter;", "rateItemsAdapter", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/adapter/RateItemsV2Adapter;", "closeIconActionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2View$showBottomSheetListener$1", "showBottomSheetListener", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2View$showBottomSheetListener$1;", "widgetPageKey", "Ljava/lang/String;", "composerRvOffset", "I", "closeTokenizedEvent", "LWZ/t;", "viewTokenizedEvent", "", "sentViewedItems", "Ljava/util/Set;", "", "widgetId", "Ljava/lang/Long;", "Landroidx/recyclerview/widget/D;", "snapHelper", "Landroidx/recyclerview/widget/D;", "Lxe/B0;", "reviewResultJob", "Lxe/B0;", "Lru/ozon/uni/core/UniColors;", "defaultStrokeColor", "Lru/ozon/uni/core/UniColors;", "Landroid/graphics/drawable/GradientDrawable;", "rateItemsForeground$delegate", "LSc/j;", "getRateItemsForeground", "()Landroid/graphics/drawable/GradientDrawable;", "rateItemsForeground", "ru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2View$onItemTouchListener$1", "onItemTouchListener", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2View$onItemTouchListener$1;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/FadeAnimRefs;", "headerAnimRefs", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/FadeAnimRefs;", "isRecyclerAnimationRunning", "Z", "", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO;", "allRateItems", "Ljava/util/List;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager$delegate", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemRecyclerAnimator;", "productItemRecyclerAnimator", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/view/utils/ProductItemRecyclerAnimator;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateItemsV2View {

    @NotNull
    private final List<RateItemsV2VO.RateItemVO> allRateItems;

    @NotNull
    private final RateItemsV2BottomBehavior behavior;

    @NotNull
    private final WidgetRateItemsV2Binding binding;

    @NotNull
    private final Function1<AtomAction, Unit> closeIconActionHandler;
    private t closeTokenizedEvent;
    private final RecyclerView composerRv;
    private int composerRvOffset;

    @NotNull
    private final UniColors defaultStrokeColor;

    @NotNull
    private final FadeAnimRefs headerAnimRefs;
    private boolean isRecyclerAnimationRunning;

    /* renamed from: layoutManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layoutManager;

    @NotNull
    private final RateItemsV2View$onItemTouchListener$1 onItemTouchListener;

    @NotNull
    private final ProductItemRecyclerAnimator productItemRecyclerAnimator;

    @NotNull
    private final RateItemsV2Adapter rateItemsAdapter;

    @NotNull
    private final RateItemsDelegate rateItemsDelegate;

    /* renamed from: rateItemsForeground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rateItemsForeground;
    private B0 reviewResultJob;

    @NotNull
    private final g router;

    @NotNull
    private final Set<Integer> sentViewedItems;

    @NotNull
    private final RateItemsV2View$showBottomSheetListener$1 showBottomSheetListener;
    private D snapHelper;

    @NotNull
    private final l tokenizedAnalytics;
    private t viewTokenizedEvent;
    private Long widgetId;
    private String widgetPageKey;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (RateItemsV2View.this.isRecyclerAnimationRunning) {
                return;
            }
            RateItemsV2View.this.isRecyclerAnimationRunning = true;
            RateItemsV2View.this.productItemRecyclerAnimator.animateRateItemsRecycler();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "deeplink", "", "nullableRating", "", "rateProductItem", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO$RateItemVO$RateProductItemVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements InterfaceC6511n<String, Integer, RateItemsV2VO.RateItemVO.RateProductItemVO, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $addReviewActionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super AtomAction, Unit> function1) {
            super(3);
            this.$addReviewActionHandler = function1;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO) {
            invoke2(str, num, rateProductItemVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String deeplink, Integer num, RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            if (rateProductItemVO == null) {
                return;
            }
            int intValue = num != null ? num.intValue() : 0;
            RateItemsV2View.this.markItemRated(rateProductItemVO.getSku(), intValue);
            List<RateItemsV2VO.RatingActionVO> ratingActions = rateProductItemVO.getRatingActions();
            if (ratingActions.isEmpty()) {
                RateItemsV2View.this.openReviewFormScreen(deeplink, intValue, rateProductItemVO);
                return;
            }
            RateItemsV2VO.RatingActionVO ratingActionVO = ratingActions.get(h.e(intValue - 1, 0, C7714v.P(ratingActions)));
            Function1<AtomAction, Unit> function1 = this.$addReviewActionHandler;
            RateItemsV2View rateItemsV2View = RateItemsV2View.this;
            RateItemsV2VO.RatingActionVO ratingActionVO2 = ratingActionVO;
            AtomAction action = ratingActionVO2.getAction();
            if (action != null) {
                function1.invoke(action);
            }
            t tracking = ratingActionVO2.getTracking();
            if (tracking != null) {
                rateItemsV2View.processRatingClick(tracking, intValue);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "sku", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function2<AtomAction, String, Unit> {
        final /* synthetic */ Function2<AtomAction, String, Unit> $cellActionHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function2<? super AtomAction, ? super String, Unit> function2) {
            super(2);
            this.$cellActionHandler = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, String str) {
            invoke2(atomAction, str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction action, String sku) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(sku, "sku");
            this.$cellActionHandler.invoke(action, sku);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<Integer, Unit> {
        final /* synthetic */ i $container;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(i iVar) {
            super(1);
            this.$container = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            RateItemsV2View.this.rateItemsDelegate.changeBehaviorState(RateItemsV2View.this.widgetPageKey, i11);
            RateItemsV2View.this.rateItemsDelegate.setRateItemsExpandedState(RateItemsV2View.this.widgetPageKey, i11 == 3, K.f71697a);
            if (i11 == 3) {
                t tVar = RateItemsV2View.this.viewTokenizedEvent;
                if (tVar != null) {
                    m.c(RateItemsV2View.this.tokenizedAnalytics, tVar, null);
                }
                RateItemsV2View.this.sendViewEventsForVisibleItems();
            }
            this.$container.M().update(new RateItemsVisibleEvent(i11 == 3));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RateItemsV2View.this.rateItemsDelegate.dismiss(RateItemsV2View.this.widgetPageKey);
            t tVar = RateItemsV2View.this.closeTokenizedEvent;
            if (tVar != null) {
                m.a(RateItemsV2View.this.tokenizedAnalytics, tVar, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "productId", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$7", f = "RateItemsV2View.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$7, reason: invalid class name */
    static final class AnonymousClass7 extends j implements Function2<Long, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass7(d<? super AnonymousClass7> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(Function1 function1, Object obj) {
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass7 anonymousClass7 = RateItemsV2View.this.new AnonymousClass7(dVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Long l11, d<? super Unit> dVar) {
            return ((AnonymousClass7) create(l11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Long l11 = (Long) this.L$0;
            List list = RateItemsV2View.this.allRateItems;
            final RateItemsV2View$7$removed$1 rateItemsV2View$7$removed$1 = new RateItemsV2View$7$removed$1(l11);
            if (!list.removeIf(new Predicate() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    boolean invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = RateItemsV2View.AnonymousClass7.invokeSuspend$lambda$0(Function1.this, obj2);
                    return invokeSuspend$lambda$0;
                }
            })) {
                return Unit.f71690a;
            }
            RateItemsV2Adapter rateItemsV2Adapter = RateItemsV2View.this.rateItemsAdapter;
            Intrinsics.f(l11);
            rateItemsV2Adapter.removeItemByProductId(l11.longValue());
            List list2 = RateItemsV2View.this.allRateItems;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((RateItemsV2VO.RateItemVO) it.next()) instanceof RateItemsV2VO.RateItemVO.RateProductItemVO) {
                        if (RateItemsV2View.this.rateItemsAdapter.getCardsCount() == 0) {
                            RateItemsV2View.this.rateItemsAdapter.setCompactMode(false);
                            RateItemsV2VO.RateItemVO rateItemVO = (RateItemsV2VO.RateItemVO) C7714v.M(RateItemsV2View.this.allRateItems);
                            if (rateItemVO != null) {
                                RateItemsV2View.this.rateItemsAdapter.addItem(rateItemVO);
                            }
                        } else {
                            RateItemsV2View.this.expandLastItemIfNeeded();
                        }
                        return Unit.f71690a;
                    }
                }
            }
            RateItemsV2View.this.dismiss();
            return Unit.f71690a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RateItemsV2DTO.ScrollType.values().length];
            try {
                iArr[RateItemsV2DTO.ScrollType.PINNED_SCROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RateItemsV2DTO.ScrollType.ONE_BY_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RateItemsV2DTO.ScrollType.ONE_BY_ONE_WITH_SCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0186, code lost:
    
        if (r6 != (r7 != null ? r7.bottomMargin : 0)) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$showBottomSheetListener$1] */
    /* JADX WARN: Type inference failed for: r5v18, types: [androidx.recyclerview.widget.RecyclerView$s, ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$onItemTouchListener$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RateItemsV2View(@NotNull WidgetRateItemsV2Binding binding, @NotNull RateItemsDelegate rateItemsDelegate, @NotNull g router, @NotNull l tokenizedAnalytics, @NotNull i container, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super AtomAction, Unit> ignoreActionHandler, @NotNull Function2<? super Boolean, ? super Boolean, Unit> onTimerFinish, @NotNull Function1<? super AtomAction, Unit> addReviewActionHandler, boolean z11, @NotNull Function2<? super AtomAction, ? super String, Unit> cellActionHandler) {
        View view;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rateItemsDelegate, "rateItemsDelegate");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(ignoreActionHandler, "ignoreActionHandler");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Intrinsics.checkNotNullParameter(addReviewActionHandler, "addReviewActionHandler");
        Intrinsics.checkNotNullParameter(cellActionHandler, "cellActionHandler");
        this.binding = binding;
        this.rateItemsDelegate = rateItemsDelegate;
        this.router = router;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ComponentCallbacksC5392m c11 = container.Q().c();
        RecyclerView composerRecyclerView = (c11 == null || (view = c11.getView()) == null) ? 0 : ComposerViewExtensionKt.composerRecyclerView(view);
        this.composerRv = composerRecyclerView;
        RateItemsV2BottomBehavior.Companion companion = RateItemsV2BottomBehavior.INSTANCE;
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        RateItemsV2BottomBehavior from = companion.from(constraintLayout);
        this.behavior = from;
        RateItemsV2Adapter rateItemsV2Adapter = new RateItemsV2Adapter(container.Q().g(), actionHandler, ignoreActionHandler, tokenizedAnalytics, new RateItemsV2View$rateItemsAdapter$1(onTimerFinish, this));
        this.rateItemsAdapter = rateItemsV2Adapter;
        this.closeIconActionHandler = new RateItemsV2View$closeIconActionHandler$1(this);
        ?? r42 = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$showBottomSheetListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                int i11;
                RateItemsV2BottomBehavior rateItemsV2BottomBehavior;
                int i12;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                RateItemsV2View rateItemsV2View = RateItemsV2View.this;
                i11 = rateItemsV2View.composerRvOffset;
                rateItemsV2View.composerRvOffset = i11 + dy;
                if (RateItemsV2View.this.rateItemsDelegate.isDismissed(RateItemsV2View.this.widgetPageKey)) {
                    return;
                }
                rateItemsV2BottomBehavior = RateItemsV2View.this.behavior;
                i12 = RateItemsV2View.this.composerRvOffset;
                rateItemsV2BottomBehavior.tryToShowBottomNavigationView(i12);
            }
        };
        this.showBottomSheetListener = r42;
        this.sentViewedItems = new LinkedHashSet();
        this.defaultStrokeColor = UniColors.GRAPHIC_STROKE_STICKY;
        this.rateItemsForeground = LazyUtilsKt.unsafeLazy(RateItemsV2View$rateItemsForeground$2.INSTANCE);
        ?? r52 = new RecyclerView.s() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$onItemTouchListener$1
            private boolean isScrolling;
            private float startX;
            private float startY;

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                if (r4 != 3) goto L21;
             */
            @Override // androidx.recyclerview.widget.RecyclerView.s
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e11) {
                RateItemsV2BottomBehavior rateItemsV2BottomBehavior;
                RateItemsV2BottomBehavior rateItemsV2BottomBehavior2;
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
                int action = e11.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            if (!this.isScrolling && Math.abs(e11.getX() - this.startX) > Math.abs(e11.getY() - this.startY)) {
                                this.isScrolling = true;
                                rateItemsV2BottomBehavior2 = RateItemsV2View.this.behavior;
                                rateItemsV2BottomBehavior2.setLocked(true);
                            }
                        }
                    }
                    if (this.isScrolling) {
                        rateItemsV2BottomBehavior = RateItemsV2View.this.behavior;
                        rateItemsV2BottomBehavior.setLocked(false);
                    }
                    this.isScrolling = false;
                } else {
                    this.startX = e11.getX();
                    this.startY = e11.getY();
                    this.isScrolling = false;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onTouchEvent(RecyclerView rv, MotionEvent e11) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e11, "e");
            }
        };
        this.onItemTouchListener = r52;
        this.headerAnimRefs = new FadeAnimRefs(null, null, 3, null);
        this.allRateItems = new ArrayList();
        this.layoutManager = LazyUtilsKt.unsafeLazy(new RateItemsV2View$layoutManager$2(this));
        RecyclerView productsRv = binding.productsRv;
        Intrinsics.checkNotNullExpressionValue(productsRv, "productsRv");
        this.productItemRecyclerAnimator = new ProductItemRecyclerAnimator(productsRv, new RateItemsV2View$productItemRecyclerAnimator$1(this), new RateItemsV2View$productItemRecyclerAnimator$2(this));
        if (composerRecyclerView != 0) {
            composerRecyclerView.addOnScrollListener(r42);
        }
        binding.title.setTextIsSelectable(false);
        rateItemsV2Adapter.setOnItemAnimationComplete(new AnonymousClass1());
        final RecyclerView recyclerView = binding.productsRv;
        recyclerView.setLayoutManager(getLayoutManager());
        recyclerView.setNestedScrollingEnabled(false);
        Dimens dimens = Dimens.INSTANCE;
        recyclerView.addItemDecoration(new MarginItemDecoration(dimens.getDP_8(), dimens.getDP_16()));
        recyclerView.setAdapter(rateItemsV2Adapter);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.bottomMargin = z11 ? dimens.getDP_16() : dimens.getDP_8();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = recyclerView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            recyclerView.setLayoutParams(marginLayoutParams);
        }
        recyclerView.addOnChildAttachStateChangeListener(new RecyclerView.q() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2View$2$2
            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void onChildViewAttachedToWindow(View view2) {
                RateItemsV2BottomBehavior rateItemsV2BottomBehavior;
                Intrinsics.checkNotNullParameter(view2, "view");
                rateItemsV2BottomBehavior = RateItemsV2View.this.behavior;
                if (rateItemsV2BottomBehavior.isShown()) {
                    RateItemsV2View.this.sendItemViewEvent(recyclerView.getChildViewHolder(view2).getAdapterPosition());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void onChildViewDetachedFromWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
            }
        });
        recyclerView.addOnItemTouchListener(r52);
        rateItemsV2Adapter.setRatingCLickListener(new AnonymousClass3(addReviewActionHandler));
        rateItemsV2Adapter.setCellCLickListener(new AnonymousClass4(cellActionHandler));
        from.setOnChangeState(new AnonymousClass5(container));
        from.setOnDismissCallback(new AnonymousClass6());
        this.reviewResultJob = C2399j.C(new C2408n0(n.a(rateItemsDelegate.observeReviewResultWithId()), new AnonymousClass7(null)), androidx.lifecycle.K.a(container.Q().g()));
    }

    private final void configure() {
        if (this.behavior.isShown()) {
            return;
        }
        this.behavior.configure(Integer.valueOf(Dimens.INSTANCE.getDP_32()));
        this.behavior.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expandLastItemIfNeeded() {
        if (this.rateItemsAdapter.getCardsCount() == 1 && this.rateItemsAdapter.getCompactMode()) {
            this.productItemRecyclerAnimator.expandItemToFullWidth();
            this.rateItemsAdapter.setCompactMode(false);
        }
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.layoutManager.getValue();
    }

    private final GradientDrawable getRateItemsForeground() {
        return (GradientDrawable) this.rateItemsForeground.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markItemRated(String sku, int rating) {
        if (sku == null) {
            return;
        }
        final RateItemsV2View$markItemRated$update$1 rateItemsV2View$markItemRated$update$1 = new RateItemsV2View$markItemRated$update$1(sku, rating);
        this.allRateItems.replaceAll(new UnaryOperator() { // from class: lW.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                RateItemsV2VO.RateItemVO markItemRated$lambda$12;
                markItemRated$lambda$12 = RateItemsV2View.markItemRated$lambda$12(Function1.this, (RateItemsV2VO.RateItemVO) obj);
                return markItemRated$lambda$12;
            }
        });
        this.rateItemsAdapter.updateItem(sku, rateItemsV2View$markItemRated$update$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RateItemsV2VO.RateItemVO markItemRated$lambda$12(Function1 function1, RateItemsV2VO.RateItemVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (RateItemsV2VO.RateItemVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openReviewFormScreen(String deeplink, int ratingValue, RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItem) {
        if (deeplink.length() == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("selectedRating", Integer.valueOf(ratingValue));
        g.a.a(this.router, deeplink, linkedHashMap, null, 4);
        t tokenizedEvent = rateProductItem.getTokenizedEvent();
        if (tokenizedEvent != null) {
            processRatingClick(tokenizedEvent, ratingValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processRatingClick(t tVar, final int i11) {
        m.a(this.tokenizedAnalytics, tVar, new WZ.e() { // from class: lW.b
            @Override // WZ.e
            public final WZ.g modifyParams(UZ.a aVar, WZ.g gVar) {
                WZ.g processRatingClick$lambda$9;
                processRatingClick$lambda$9 = RateItemsV2View.processRatingClick$lambda$9(i11, (UZ.d) aVar, gVar);
                return processRatingClick$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WZ.g processRatingClick$lambda$9(int i11, UZ.a aVar, WZ.g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return WZ.g.a(params, U.i(new Pair("rating", Integer.valueOf(i11))), null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendItemViewEvent(int position) {
        if (this.sentViewedItems.contains(Integer.valueOf(position))) {
            return;
        }
        RecyclerView.C findViewHolderForLayoutPosition = this.binding.productsRv.findViewHolderForLayoutPosition(position);
        BaseRateItemV2ViewHolder baseRateItemV2ViewHolder = findViewHolderForLayoutPosition instanceof BaseRateItemV2ViewHolder ? (BaseRateItemV2ViewHolder) findViewHolderForLayoutPosition : null;
        if (baseRateItemV2ViewHolder != null) {
            baseRateItemV2ViewHolder.trackViewEvent(this.widgetId);
        }
        this.sentViewedItems.add(Integer.valueOf(position));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendViewEventsForVisibleItems() {
        int intValue;
        RecyclerView.o layoutManager = this.binding.productsRv.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return;
        }
        int intValue2 = valueOf.intValue();
        Integer valueOf2 = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition());
        Integer num = valueOf2.intValue() != -1 ? valueOf2 : null;
        if (num == null || intValue2 > (intValue = num.intValue())) {
            return;
        }
        while (true) {
            sendItemViewEvent(intValue2);
            if (intValue2 == intValue) {
                return;
            } else {
                intValue2++;
            }
        }
    }

    private final void setupForeground(String strokeColor) {
        ConstraintLayout constraintLayout = this.binding.rateItemContainer;
        GradientDrawable rateItemsForeground = getRateItemsForeground();
        int dp_1 = Dimens.INSTANCE.getDP_1();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rateItemsForeground.setStroke(dp_1, styleParser.parseColor(context, strokeColor, this.defaultStrokeColor.getResId()));
        constraintLayout.setForeground(getRateItemsForeground());
    }

    private final void setupSnapHelper(RateItemsV2DTO.ScrollType scrollType) {
        D d11 = this.snapHelper;
        D d12 = null;
        if (d11 != null) {
            d11.attachToRecyclerView(null);
        }
        int i11 = scrollType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scrollType.ordinal()];
        if (i11 == 1) {
            d12 = new StartSnapHelper();
        } else if (i11 == 3) {
            d12 = new TogglingSnapHelper();
        }
        this.snapHelper = d12;
        if (d12 != null) {
            d12.attachToRecyclerView(this.binding.productsRv);
        }
    }

    public final void animateIgnoreItem() {
        int findLastVisibleItemPosition = getLayoutManager().findLastVisibleItemPosition();
        int i11 = findLastVisibleItemPosition + 1;
        RateItemsV2VO.RateItemVO rateItemVO = (RateItemsV2VO.RateItemVO) C7714v.Q(i11, this.allRateItems);
        if (rateItemVO != null) {
            this.rateItemsAdapter.replaceItem(findLastVisibleItemPosition, rateItemVO);
            this.allRateItems.remove(i11);
        } else if (this.rateItemsAdapter.getCardsCount() <= 1) {
            dismiss();
        } else {
            this.rateItemsAdapter.removeItem(findLastVisibleItemPosition);
            expandLastItemIfNeeded();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cd, code lost:
    
        if (r11 != (r4 != null ? r4.bottomMargin : 0)) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull RateItemsV2VO item) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextDTO title;
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetRateItemsV2Binding widgetRateItemsV2Binding = this.binding;
        if (this.rateItemsDelegate.isDismissed(item.getWidgetPageKey())) {
            return;
        }
        this.widgetId = Long.valueOf(item.getId());
        List<RateItemsV2VO.RateItemVO> items = item.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RateItemsV2VO.RateItemVO rateItemVO = (RateItemsV2VO.RateItemVO) it.next();
            RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO = rateItemVO instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) rateItemVO : 0;
            if (rateProductItemVO != 0) {
                RateItemsDelegate rateItemsDelegate = RateItemsDelegate.INSTANCE;
                String sku = rateProductItemVO.getSku();
                if (!rateItemsDelegate.isReviewed(sku != null ? Long.valueOf(Long.parseLong(sku)) : null)) {
                    marginLayoutParams = rateProductItemVO;
                }
            }
            if (marginLayoutParams != null) {
                arrayList.add(marginLayoutParams);
            }
        }
        List<RateItemsV2VO.RateItemVO> items2 = item.getItems();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : items2) {
            if (obj instanceof RateItemsV2VO.RateItemVO.RateReviewsItemVO) {
                arrayList2.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            dismiss();
            return;
        }
        setupForeground(item.getStrokeColor());
        ArrayList p02 = C7714v.p0(arrayList2, arrayList);
        this.allRateItems.clear();
        this.allRateItems.addAll(p02);
        this.widgetPageKey = item.getWidgetPageKey();
        this.viewTokenizedEvent = item.getTokenizedEvent();
        this.closeTokenizedEvent = item.getTokenizedEvent();
        if (this.rateItemsDelegate.isExpanded(item.getWidgetPageKey())) {
            widgetRateItemsV2Binding.getConstraintLayout().requestLayout();
            this.behavior.showFullBottomNavigationView();
            RateItemsDelegate rateItemsDelegate2 = this.rateItemsDelegate;
            String widgetPageKey = item.getWidgetPageKey();
            ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String sku2 = ((RateItemsV2VO.RateItemVO.RateProductItemVO) it2.next()).getSku();
                arrayList3.add(Long.valueOf(sku2 != null ? Long.parseLong(sku2) : 0L));
            }
            rateItemsDelegate2.setRateItemsExpandedState(widgetPageKey, true, arrayList3);
        }
        configure();
        Object M11 = C7714v.M(item.getItems());
        RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO2 = M11 instanceof RateItemsV2VO.RateItemVO.RateProductItemVO ? (RateItemsV2VO.RateItemVO.RateProductItemVO) M11 : null;
        if (rateProductItemVO2 == null || (title = rateProductItemVO2.getHeaderTitle()) == null) {
            RateItemsV2VO.RateItemsHeaderVO header = item.getHeader();
            title = header != null ? header.getTitle() : null;
        }
        updateHeader(title);
        IconButtonV3View closeSheetIconButton = widgetRateItemsV2Binding.closeSheetIconButton;
        Intrinsics.checkNotNullExpressionValue(closeSheetIconButton, "closeSheetIconButton");
        RateItemsV2VO.RateItemsHeaderVO header2 = item.getHeader();
        IconButtonV3HolderKt.bindOrGone(closeSheetIconButton, header2 != null ? header2.getIconButton() : null, this.closeIconActionHandler);
        RecyclerView productsRv = widgetRateItemsV2Binding.productsRv;
        Intrinsics.checkNotNullExpressionValue(productsRv, "productsRv");
        ViewExtKt.showOrGone(productsRv, Boolean.valueOf(!item.getItems().isEmpty()));
        Integer separatorHeight = item.getSeparatorHeight();
        if (separatorHeight != null) {
            int intValue = separatorHeight.intValue();
            RecyclerView productsRv2 = widgetRateItemsV2Binding.productsRv;
            Intrinsics.checkNotNullExpressionValue(productsRv2, "productsRv");
            ViewGroup.LayoutParams layoutParams = productsRv2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                int i11 = marginLayoutParams2.leftMargin;
                int i12 = marginLayoutParams2.topMargin;
                int i13 = marginLayoutParams2.rightMargin;
                int i14 = marginLayoutParams2.bottomMargin;
                marginLayoutParams2.topMargin = UiExtKt.toPx(intValue);
                if (i11 == marginLayoutParams2.leftMargin) {
                    ViewGroup.LayoutParams layoutParams2 = productsRv2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = productsRv2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i13 == (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = productsRv2.getLayoutParams();
                            marginLayoutParams = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        }
                    }
                }
                productsRv2.setLayoutParams(marginLayoutParams2);
            }
        }
        setupSnapHelper(item.getScrollType());
        int i15 = WhenMappings.$EnumSwitchMapping$0[item.getScrollType().ordinal()];
        if (i15 == 1) {
            this.rateItemsAdapter.submitList(p02);
            return;
        }
        if (i15 == 2) {
            this.rateItemsAdapter.submitList(C7714v.c0(C7714v.M(p02)));
        } else {
            if (i15 != 3) {
                return;
            }
            if (widgetRateItemsV2Binding.productsRv.getItemDecorationCount() > 0) {
                widgetRateItemsV2Binding.productsRv.removeItemDecorationAt(0);
            }
            this.rateItemsAdapter.submitList(C7714v.c0(C7714v.M(p02)));
        }
    }

    public final void clearSentViewedItems() {
        this.sentViewedItems.clear();
    }

    public final void dismiss() {
        this.behavior.setState(5);
    }

    public final void removeCallBacks() {
        RecyclerView recyclerView = this.composerRv;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.showBottomSheetListener);
        }
        this.binding.productsRv.setAdapter(null);
        this.headerAnimRefs.cancel();
        B0 b02 = this.reviewResultJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.reviewResultJob = null;
    }

    public final void setBottomBorderViewToBehaviour(View view) {
        this.behavior.setBottomBorderView(view);
    }

    public final Unit updateHeader(TextDTO header) {
        TextAtomV2View textAtomV2View = this.binding.title;
        Intrinsics.f(textAtomV2View);
        if (ViewExtKt.isVisible(textAtomV2View)) {
            if (!Intrinsics.d(header != null ? header.getText() : null, textAtomV2View.getText())) {
                return ru.ozon.app.android.ugc.view.ViewExtKt.animateFadeOutAndBack$default(textAtomV2View, this.headerAnimRefs, 0L, new RateItemsV2View$updateHeader$1$1(textAtomV2View, header), 2, null);
            }
        }
        TextHolderKt.bindOrGone$default(textAtomV2View, header, null, 2, null);
        return Unit.f71690a;
    }
}
