package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item;

import Bi.a;
import Hj.C3143a;
import Lt.b;
import Lt.c;
import Sc.o;
import WZ.t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteProxy;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteState;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 ¯\u00012\u00020\u00012\u00020\u0002:\u0002¯\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J[\u0010+\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020!2\u0016\u0010%\u001a\u0012\u0012\b\u0012\u00060#j\u0002`$\u0012\u0004\u0012\u00020\u00180\"2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00180&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00180\"¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J+\u00107\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u0001032\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000103¢\u0006\u0004\b7\u00108J\u001f\u0010<\u001a\u00020\u00182\u0006\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u00020\r¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0018¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020\u00182\b\u0010@\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0018H\u0002¢\u0006\u0004\bC\u0010?J\u0017\u0010D\u001a\u00020\u00182\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0018H\u0002¢\u0006\u0004\bF\u0010?J\u000f\u0010G\u001a\u00020\u0018H\u0002¢\u0006\u0004\bG\u0010?J\u0017\u0010I\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ)\u0010P\u001a\u00020\u00182\u0006\u0010N\u001a\u00020K2\u0010\b\u0002\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001dH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00182\u0006\u0010R\u001a\u00020KH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0018H\u0002¢\u0006\u0004\bU\u0010?J\u000f\u0010V\u001a\u00020\u0018H\u0002¢\u0006\u0004\bV\u0010?J\u0017\u0010W\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0018H\u0002¢\u0006\u0004\bY\u0010?J\u001f\u0010\\\u001a\u00020\r2\u0006\u0010Z\u001a\u00020K2\u0006\u0010[\u001a\u00020KH\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020K2\u0006\u0010^\u001a\u00020K2\u0006\u0010_\u001a\u00020KH\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020KH\u0002¢\u0006\u0004\bb\u0010MJ\u000f\u0010c\u001a\u00020KH\u0002¢\u0006\u0004\bc\u0010MJ\u000f\u0010d\u001a\u00020KH\u0002¢\u0006\u0004\bd\u0010MJ\u000f\u0010e\u001a\u00020KH\u0002¢\u0006\u0004\be\u0010MJ\u000f\u0010f\u001a\u00020KH\u0002¢\u0006\u0004\bf\u0010MJ\u000f\u0010g\u001a\u00020\rH\u0002¢\u0006\u0004\bg\u0010\u0012J\u000f\u0010h\u001a\u00020\rH\u0002¢\u0006\u0004\bh\u0010\u0012J'\u0010l\u001a\u00020K2\u0006\u0010i\u001a\u00020K2\u0006\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020KH\u0002¢\u0006\u0004\bl\u0010mR0\u0010n\u001a\u0010\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0018\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR0\u0010t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0018\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010o\u001a\u0004\bu\u0010q\"\u0004\bv\u0010sR*\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010x\u001a\u0004\b~\u0010z\"\u0004\b\u007f\u0010|R&\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0018\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010oR\u0017\u0010\u0081\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0082\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0019\u0010\u0095\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0094\u0001R\u0019\u0010\u0096\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0094\u0001R\u0019\u0010\u0097\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0094\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0082\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u009e\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010 \u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009f\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010¤\u0001R\u0019\u0010§\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u009a\u0001R\u0019\u0010¨\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u009a\u0001R\u0016\u0010ª\u0001\u001a\u00020K8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010MR\u0016\u0010¬\u0001\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\u0012R\u0016\u0010®\u0001\u001a\u00020K8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010M¨\u0006°\u0001"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/SwipeTileLayout;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteProxy;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "performClick", "()Z", "changed", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "item", "Lkotlin/Function0;", "onClick", "bindOrGoneFavorite", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onClickEvent", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "cartPickerUpdateCallback", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemView;", "view", "Landroid/widget/FrameLayout$LayoutParams;", "params", "setTileContent", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemView;Landroid/widget/FrameLayout$LayoutParams;)V", "", "icon", "selected", "unselected", "setupIcon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "state", "animate", "renderState", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;Z)V", "cancelSwipeAnimation", "()V", "favoriteState", "renderFavoriteState", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;)V", "settleAfterRelease", "animateToState", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;)V", "settleToClosed", "settleToRevealed", "isTap", "animateDelete", "(Z)V", "", "deleteAnimationProgress", "()F", "targetOffset", "onEnd", "animateToOffset", "(FLkotlin/jvm/functions/Function0;)V", "rawOffset", "setOffset", "(F)V", "layoutActionAreas", "positionActionButtons", "handleGestureDown", "(Landroid/view/MotionEvent;)V", "finishGesture", "dx", "dy", "tryStartHorizontalDrag", "(FF)Z", "startOffset", "endOffset", "progressBetweenOffsets", "(FF)F", "actionSlotPx", "revealedOffsetPx", "visualRatio", "maxOffsetPx", "deleteTargetOffsetPx", "isFavoriteVisibleOnScreen", "isDeleteAreaVisibleOnScreen", "start", "end", "progress", "lerp", "(FFF)F", "onStateChanged", "Lkotlin/jvm/functions/Function1;", "getOnStateChanged", "()Lkotlin/jvm/functions/Function1;", "setOnStateChanged", "(Lkotlin/jvm/functions/Function1;)V", "onDeleteRequested", "getOnDeleteRequested", "setOnDeleteRequested", "onButtonsRevealed", "Lkotlin/jvm/functions/Function0;", "getOnButtonsRevealed", "()Lkotlin/jvm/functions/Function0;", "setOnButtonsRevealed", "(Lkotlin/jvm/functions/Function0;)V", "onSwipeStartedFromClosed", "getOnSwipeStartedFromClosed", "setOnSwipeStartedFromClosed", "onFavoriteClicked", "touchSlop", "I", "Landroid/view/animation/DecelerateInterpolator;", "animationInterpolator", "Landroid/view/animation/DecelerateInterpolator;", "deleteButtonSizePx", "actionsLayer", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "favoriteArea", "Landroid/view/View;", "deleteArea", "Landroid/widget/ImageButton;", "favoriteButton", "Landroid/widget/ImageButton;", "deleteButton", "contentView", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemView;", "offsetPx", "F", "startOffsetPx", "downX", "downY", "activePointerId", "isDragging", "Z", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "currentState", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "pendingState", "favoriteValue", "Ljava/lang/Boolean;", "heartIcon", "Ljava/lang/String;", "unselectedHeartIconColor", "selectedHeartIconColor", "gestureStartedFromClosed", "swipeStartedCallbackDispatched", "getMinDeleteRevealPx", "minDeleteRevealPx", "getHasFavoriteAction", "hasFavoriteAction", "getReleaseRevealThreshold", "releaseRevealThreshold", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwipeTileLayout extends FrameLayout implements FreshFavoriteProxy {

    @NotNull
    private final FrameLayout actionsLayer;
    private int activePointerId;

    @NotNull
    private final DecelerateInterpolator animationInterpolator;
    private ValueAnimator animator;
    private CartTileItemView contentView;

    @NotNull
    private CartTileVO.TileItem.SwipeTileState currentState;

    @NotNull
    private final View deleteArea;

    @NotNull
    private final ImageButton deleteButton;
    private final int deleteButtonSizePx;
    private float downX;
    private float downY;

    @NotNull
    private final View favoriteArea;

    @NotNull
    private final ImageButton favoriteButton;
    private Boolean favoriteValue;
    private boolean gestureStartedFromClosed;
    private String heartIcon;
    private boolean isDragging;
    private float offsetPx;
    private Function0<Unit> onButtonsRevealed;
    private Function1<? super Boolean, Unit> onDeleteRequested;
    private Function1<? super Boolean, Unit> onFavoriteClicked;
    private Function1<? super CartTileVO.TileItem.SwipeTileState, Unit> onStateChanged;
    private Function0<Unit> onSwipeStartedFromClosed;
    private CartTileVO.TileItem.SwipeTileState pendingState;
    private String selectedHeartIconColor;
    private float startOffsetPx;
    private boolean swipeStartedCallbackDispatched;
    private final int touchSlop;
    private String unselectedHeartIconColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final HapticToken hapticToken = HapticToken.SOFT;
    private static final int defaultUnselectedHeartIconColor = UniColors.GRAPHIC_TERTIARY.getResId();
    private static final int defaultSelectedHeartIconColor = UniColors.GRAPHIC_NEGATIVE_PRIMARY.getResId();
    private static final int binIconColor = UniColors.WHITE.getResId();

    @NotNull
    private static final UniColors defaultSwipeBackground = UniColors.BG_NEGATIVE_PRIMARY;

    @NotNull
    private static final UniColors defaultFavoriteBackground = UniColors.BG_SECONDARY;

    @NotNull
    private static final UniColors defaultFavoriteBaseBackground = UniColors.LAYER_FLOOR_1;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/SwipeTileLayout$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/haptic/HapticToken;", "hapticToken", "Lru/ozon/uni/android/haptic/HapticToken;", "getHapticToken", "()Lru/ozon/uni/android/haptic/HapticToken;", "", "DELETE_ONLY_CLOSE_THRESHOLD", "F", "FAVORITE_CLOSE_THRESHOLD", "DELETE_THRESHOLD", "", "ACTION_SLOT_WIDTH_DP", "I", "DELETE_ONLY_REVEAL_RATIO", "FAVORITE_AND_DELETE_REVEAL_RATIO", "DELETE_BUTTON_SIZE", "INVALID_POINTER_ID", "", "BIN_ICON_TOKEN", "Ljava/lang/String;", "HEART_ICON_TOKEN", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HapticToken getHapticToken() {
            return SwipeTileLayout.hapticToken;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartTileVO.TileItem.SwipeTileState.values().length];
            try {
                iArr[CartTileVO.TileItem.SwipeTileState.Closed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartTileVO.TileItem.SwipeTileState.Revealed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SwipeTileLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final float actionSlotPx() {
        return UiExtKt.toPxF(80);
    }

    private final void animateDelete(boolean isTap) {
        if (getWidth() == 0) {
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        animateToOffset(deleteTargetOffsetPx(), new SwipeTileLayout$animateDelete$1(isTap, this));
    }

    private final void animateToOffset(final float targetOffset, final Function0<Unit> onEnd) {
        int i11 = 0;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = this.offsetPx;
        if (Math.abs(targetOffset - f7) < 1.0f) {
            setOffset(targetOffset);
            if (onEnd != null) {
                onEnd.invoke();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, targetOffset);
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(this.animationInterpolator);
        ofFloat.addUpdateListener(new b(this, i11));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.SwipeTileLayout$animateToOffset$1$2
            private boolean cancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.cancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.cancelled) {
                    return;
                }
                SwipeTileLayout.this.setOffset(targetOffset);
                Function0<Unit> function0 = onEnd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        ofFloat.start();
        this.animator = ofFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void animateToOffset$default(SwipeTileLayout swipeTileLayout, float f7, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        swipeTileLayout.animateToOffset(f7, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToOffset$lambda$9$lambda$8(SwipeTileLayout swipeTileLayout, ValueAnimator valueAnimator) {
        swipeTileLayout.setOffset(((Float) a.b(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final void animateToState(CartTileVO.TileItem.SwipeTileState state) {
        float f7;
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            f7 = 0.0f;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            f7 = revealedOffsetPx();
        }
        animateToOffset$default(this, f7, null, 2, null);
    }

    private final float deleteAnimationProgress() {
        if (getWidth() == 0) {
            return 0.0f;
        }
        float width = getWidth() * 0.6f;
        float deleteTargetOffsetPx = deleteTargetOffsetPx();
        if (deleteTargetOffsetPx <= width) {
            return 1.0f;
        }
        return h.d((this.offsetPx - width) / (deleteTargetOffsetPx - width), 0.0f, 1.0f);
    }

    private final float deleteTargetOffsetPx() {
        return getHasFavoriteAction() ? getWidth() + actionSlotPx() : getWidth();
    }

    private final void finishGesture() {
        this.activePointerId = -1;
        this.isDragging = false;
        this.gestureStartedFromClosed = false;
        this.swipeStartedCallbackDispatched = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    private final boolean getHasFavoriteAction() {
        return this.favoriteValue != null;
    }

    private final float getMinDeleteRevealPx() {
        return getContext().getResources().getDisplayMetrics().density * 2.0f;
    }

    private final float getReleaseRevealThreshold() {
        return getHasFavoriteAction() ? 0.37f : 0.17f;
    }

    private final void handleGestureDown(MotionEvent event) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.activePointerId = event.getPointerId(0);
        this.downX = event.getX();
        this.downY = event.getY();
        this.startOffsetPx = this.offsetPx;
        this.isDragging = false;
        this.gestureStartedFromClosed = this.currentState == CartTileVO.TileItem.SwipeTileState.Closed;
        this.swipeStartedCallbackDispatched = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    private final boolean isDeleteAreaVisibleOnScreen() {
        if (getWidth() == 0) {
            return false;
        }
        if (getHasFavoriteAction()) {
            return ((float) getWidth()) - ((((float) getWidth()) - this.offsetPx) + actionSlotPx()) > getMinDeleteRevealPx();
        }
        return this.offsetPx > 0.5f;
    }

    private final boolean isFavoriteVisibleOnScreen() {
        if (getHasFavoriteAction() && getWidth() != 0) {
            float actionSlotPx = actionSlotPx();
            float width = getWidth();
            float f7 = this.offsetPx;
            float f11 = width - f7;
            float f12 = actionSlotPx + f11;
            if (f7 > 0.5f && f12 > 0.0f && f11 < getWidth()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3(ImageButton imageButton, SwipeTileLayout swipeTileLayout, View view) {
        Function1<? super Boolean, Unit> function1;
        HapticVibrator.INSTANCE.vibrate(imageButton, hapticToken);
        Boolean bool = swipeTileLayout.favoriteValue;
        if (bool == null || (function1 = swipeTileLayout.onFavoriteClicked) == null) {
            return;
        }
        function1.invoke(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(ImageButton imageButton, SwipeTileLayout swipeTileLayout, View view) {
        HapticVibrator.INSTANCE.vibrate(imageButton, hapticToken);
        swipeTileLayout.animateDelete(true);
    }

    private final void layoutActionAreas() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        if (this.offsetPx <= 0.5f) {
            this.favoriteArea.setVisibility(8);
            this.favoriteArea.layout(0, 0, 0, height);
            this.deleteArea.setVisibility(8);
            this.deleteArea.layout(width, 0, width, height);
            return;
        }
        int c11 = C6915b.c(actionSlotPx());
        float f7 = width;
        float f11 = f7 - this.offsetPx;
        if (!getHasFavoriteAction()) {
            this.favoriteArea.setVisibility(8);
            this.favoriteArea.layout(0, 0, 0, height);
            int c12 = C6915b.c(h.d(f11, 0.0f, f7));
            this.deleteArea.setVisibility(0);
            this.deleteArea.layout(c12, 0, width, height);
            return;
        }
        int c13 = C6915b.c(f11);
        int i11 = c11 + c13;
        if (i11 <= 0 || c13 >= width) {
            this.favoriteArea.setVisibility(8);
            this.favoriteArea.layout(0, 0, 0, height);
        } else {
            this.favoriteArea.setVisibility(0);
            this.favoriteArea.layout(c13, 0, i11, height);
        }
        float f12 = i11;
        if (f7 - f12 <= getMinDeleteRevealPx()) {
            this.deleteArea.setVisibility(8);
            this.deleteArea.layout(width, 0, width, height);
        } else {
            int c14 = C6915b.c(h.d(f12, 0.0f, f7));
            this.deleteArea.setVisibility(0);
            this.deleteArea.layout(c14, 0, width, height);
        }
    }

    private final float lerp(float start, float end, float progress) {
        return C3143a.d(end, start, progress, start);
    }

    private final float maxOffsetPx() {
        return getHasFavoriteAction() ? getWidth() + actionSlotPx() : getWidth();
    }

    private final void positionActionButtons() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        float actionSlotPx = actionSlotPx();
        int width = this.deleteButton.getWidth() > 0 ? this.deleteButton.getWidth() : this.deleteButtonSizePx;
        int height = this.deleteButton.getHeight() > 0 ? this.deleteButton.getHeight() : this.deleteButtonSizePx;
        int width2 = this.favoriteButton.getWidth() > 0 ? this.favoriteButton.getWidth() : this.deleteButtonSizePx;
        int height2 = this.favoriteButton.getHeight() > 0 ? this.favoriteButton.getHeight() : this.deleteButtonSizePx;
        float width3 = getWidth();
        float f7 = width;
        float f11 = -f7;
        float f12 = actionSlotPx / 2.0f;
        float width4 = (getWidth() - f12) - (f7 / 2.0f);
        float height3 = (getHeight() / 2.0f) - (height / 2.0f);
        float height4 = (getHeight() / 2.0f) - (height2 / 2.0f);
        float width5 = getWidth() * 0.6f;
        if (!getHasFavoriteAction()) {
            float f13 = this.offsetPx;
            if (f13 < actionSlotPx) {
                width4 = lerp(width3, width4, h.d(f13 / actionSlotPx, 0.0f, 1.0f));
            } else if (f13 >= width5) {
                width4 = lerp(width4, f11, deleteAnimationProgress());
            }
            this.deleteButton.setX(width4);
            this.deleteButton.setY(height3);
            return;
        }
        this.favoriteButton.setX(((getWidth() - this.offsetPx) + f12) - (width2 / 2.0f));
        this.favoriteButton.setY(height4);
        float f14 = 2.0f * actionSlotPx;
        float f15 = this.offsetPx;
        if (f15 > actionSlotPx) {
            width3 = f15 < f14 ? lerp(width3, width4, progressBetweenOffsets(actionSlotPx, f14)) : f15 < width5 ? width4 : lerp(width4, f11, deleteAnimationProgress());
        }
        this.deleteButton.setX(width3);
        this.deleteButton.setY(height3);
    }

    private final float progressBetweenOffsets(float startOffset, float endOffset) {
        if (endOffset <= startOffset) {
            return 1.0f;
        }
        return h.d((this.offsetPx - startOffset) / (endOffset - startOffset), 0.0f, 1.0f);
    }

    private final void renderFavoriteState(FreshFavoriteState favoriteState) {
        int parseColor;
        int intValue;
        this.favoriteValue = favoriteState != null ? Boolean.valueOf(favoriteState.getIsFavorite()) : null;
        if (favoriteState == null) {
            this.favoriteButton.setVisibility(8);
            this.favoriteArea.setVisibility(8);
        } else {
            if (favoriteState.getIsFavorite()) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                parseColor = styleParser.parseColor(context, this.selectedHeartIconColor, defaultSelectedHeartIconColor);
            } else {
                StyleParser styleParser2 = StyleParser.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                parseColor = styleParser2.parseColor(context2, this.unselectedHeartIconColor, defaultUnselectedHeartIconColor);
            }
            ImageButton imageButton = this.favoriteButton;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer iconResByToken = TokensExtKt.getIconResByToken(context3, this.heartIcon);
            if (iconResByToken != null) {
                intValue = iconResByToken.intValue();
            } else {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                Integer iconResByToken2 = TokensExtKt.getIconResByToken(context4, "ic_m_heart_filled");
                intValue = iconResByToken2 != null ? iconResByToken2.intValue() : 0;
            }
            imageButton.setImageResource(intValue);
            this.favoriteButton.setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        setOffset(this.offsetPx);
    }

    private final float revealedOffsetPx() {
        float actionSlotPx = actionSlotPx();
        return getHasFavoriteAction() ? actionSlotPx * 2.0f : actionSlotPx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float rawOffset) {
        CartTileItemView cartTileItemView = this.contentView;
        if (cartTileItemView == null) {
            return;
        }
        if (getWidth() == 0 || getHeight() == 0) {
            this.offsetPx = 0.0f;
            return;
        }
        float d11 = h.d(rawOffset, 0.0f, maxOffsetPx());
        this.offsetPx = d11;
        cartTileItemView.setTranslationX(-d11);
        float visualRatio = visualRatio();
        boolean z11 = false;
        this.actionsLayer.setVisibility(this.offsetPx > 0.5f ? 0 : 4);
        layoutActionAreas();
        positionActionButtons();
        if (getHasFavoriteAction()) {
            this.favoriteButton.setVisibility(isFavoriteVisibleOnScreen() ? 0 : 8);
            this.deleteButton.setVisibility(isDeleteAreaVisibleOnScreen() ? 0 : 8);
        } else {
            this.favoriteButton.setVisibility(8);
            this.favoriteButton.setAlpha(0.0f);
            this.deleteButton.setVisibility(this.offsetPx > 0.5f ? 0 : 8);
        }
        this.favoriteButton.setAlpha(1.0f);
        this.favoriteButton.setImageAlpha(255);
        this.deleteButton.setAlpha(1.0f);
        this.deleteButton.setImageAlpha(255);
        boolean z12 = this.offsetPx >= revealedOffsetPx() && visualRatio < 0.6f;
        this.favoriteButton.setEnabled(getHasFavoriteAction() && z12);
        ImageButton imageButton = this.favoriteButton;
        if (getHasFavoriteAction() && z12) {
            z11 = true;
        }
        imageButton.setClickable(z11);
        this.deleteButton.setEnabled(z12);
        this.deleteButton.setClickable(z12);
    }

    public static /* synthetic */ void setTileContent$default(SwipeTileLayout swipeTileLayout, CartTileItemView cartTileItemView, FrameLayout.LayoutParams layoutParams, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        swipeTileLayout.setTileContent(cartTileItemView, layoutParams);
    }

    private final void settleAfterRelease() {
        if (getWidth() == 0) {
            return;
        }
        float width = this.offsetPx / getWidth();
        if (width < getReleaseRevealThreshold()) {
            settleToClosed();
        } else if (width < 0.6f) {
            settleToRevealed();
        } else {
            animateDelete(false);
        }
    }

    private final void settleToClosed() {
        this.currentState = CartTileVO.TileItem.SwipeTileState.Closed;
        animateToOffset(0.0f, new SwipeTileLayout$settleToClosed$1(this));
    }

    private final void settleToRevealed() {
        this.currentState = CartTileVO.TileItem.SwipeTileState.Revealed;
        animateToOffset(revealedOffsetPx(), new SwipeTileLayout$settleToRevealed$1(this));
    }

    private final boolean tryStartHorizontalDrag(float dx, float dy) {
        if (this.isDragging) {
            return true;
        }
        if (Math.abs(dx) <= this.touchSlop || Math.abs(dx) <= Math.abs(dy)) {
            return false;
        }
        this.isDragging = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (this.gestureStartedFromClosed && !this.swipeStartedCallbackDispatched) {
            this.swipeStartedCallbackDispatched = true;
            Function0<Unit> function0 = this.onSwipeStartedFromClosed;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return true;
    }

    private final float visualRatio() {
        if (getWidth() == 0) {
            return 0.0f;
        }
        return h.d(this.offsetPx / getWidth(), 0.0f, 1.0f);
    }

    public final void bind(@NotNull CartTileVO.TileItem item, @NotNull Function1<? super t, Unit> onClickEvent, @NotNull Function2<? super AtomAction, ? super CartTileVO.TileItem, Unit> actionHandler, @NotNull Function1<? super CartPickerVO, Unit> cartPickerUpdateCallback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(cartPickerUpdateCallback, "cartPickerUpdateCallback");
        View view = this.deleteArea;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(styleParser.parseColor(context, item.getSwipeBackgroundColor(), defaultSwipeBackground.getResId()));
        CartTileItemView cartTileItemView = this.contentView;
        if (cartTileItemView != null) {
            cartTileItemView.bind(item, onClickEvent, actionHandler, cartPickerUpdateCallback);
        }
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteProxy
    public void bindOrGoneFavorite(FreshFavoriteState item, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        renderFavoriteState(item);
        this.onFavoriteClicked = new SwipeTileLayout$bindOrGoneFavorite$1(onClick);
    }

    public final void cancelSwipeAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
        this.isDragging = false;
        this.activePointerId = -1;
    }

    public final Function0<Unit> getOnButtonsRevealed() {
        return this.onButtonsRevealed;
    }

    public final Function1<Boolean, Unit> getOnDeleteRequested() {
        return this.onDeleteRequested;
    }

    public final Function1<CartTileVO.TileItem.SwipeTileState, Unit> getOnStateChanged() {
        return this.onStateChanged;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r0 != 3) goto L24;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.contentView != null && isEnabled()) {
            int actionMasked = event.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        int findPointerIndex = event.findPointerIndex(this.activePointerId);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        if (tryStartHorizontalDrag(event.getX(findPointerIndex) - this.downX, event.getY(findPointerIndex) - this.downY)) {
                            return true;
                        }
                    }
                }
                finishGesture();
            } else {
                handleGestureDown(event);
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        float f7;
        super.onLayout(changed, left, top, right, bottom);
        if (this.contentView == null || this.isDragging) {
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            CartTileVO.TileItem.SwipeTileState swipeTileState = this.pendingState;
            if (swipeTileState == null) {
                swipeTileState = this.currentState;
            }
            this.pendingState = null;
            int i11 = WhenMappings.$EnumSwitchMapping$0[swipeTileState.ordinal()];
            if (i11 == 1) {
                f7 = 0.0f;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                f7 = revealedOffsetPx();
            }
            setOffset(f7);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.contentView == null || !isEnabled()) {
            return super.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            handleGestureDown(event);
            return true;
        }
        if (actionMasked == 1) {
            if (this.isDragging) {
                settleAfterRelease();
                finishGesture();
                return true;
            }
            finishGesture();
            performClick();
            return true;
        }
        if (actionMasked == 2) {
            int findPointerIndex = event.findPointerIndex(this.activePointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            float x11 = event.getX(findPointerIndex);
            if (tryStartHorizontalDrag(x11 - this.downX, event.getY(findPointerIndex) - this.downY)) {
                setOffset(this.startOffsetPx + (this.downX - x11));
            }
        } else if (actionMasked == 3) {
            animateToState(this.currentState);
            finishGesture();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public final void renderState(@NotNull CartTileVO.TileItem.SwipeTileState state, boolean animate) {
        float f7;
        Intrinsics.checkNotNullParameter(state, "state");
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentState = state;
        if (getWidth() == 0 || getHeight() == 0 || this.contentView == null) {
            this.pendingState = state;
            return;
        }
        if (animate) {
            animateToState(state);
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            f7 = 0.0f;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            f7 = revealedOffsetPx();
        }
        setOffset(f7);
    }

    public final void setOnButtonsRevealed(Function0<Unit> function0) {
        this.onButtonsRevealed = function0;
    }

    public final void setOnDeleteRequested(Function1<? super Boolean, Unit> function1) {
        this.onDeleteRequested = function1;
    }

    public final void setOnStateChanged(Function1<? super CartTileVO.TileItem.SwipeTileState, Unit> function1) {
        this.onStateChanged = function1;
    }

    public final void setOnSwipeStartedFromClosed(Function0<Unit> function0) {
        this.onSwipeStartedFromClosed = function0;
    }

    public final void setTileContent(@NotNull CartTileItemView view, @NotNull FrameLayout.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(params, "params");
        CartTileItemView cartTileItemView = this.contentView;
        if (cartTileItemView != null) {
            removeView(cartTileItemView);
        }
        this.contentView = view;
        addView(view, params);
        renderState(this.currentState, false);
    }

    public final void setupIcon(String icon, String selected, String unselected) {
        this.heartIcon = icon;
        this.selectedHeartIconColor = selected;
        this.unselectedHeartIconColor = unselected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeTileLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.animationInterpolator = new DecelerateInterpolator();
        int px = UiExtKt.toPx(48);
        this.deleteButtonSizePx = px;
        this.activePointerId = -1;
        this.currentState = CartTileVO.TileItem.SwipeTileState.Closed;
        setClipChildren(true);
        setClipToPadding(true);
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setVisibility(4);
        frameLayout.setClickable(false);
        frameLayout.setClipChildren(true);
        frameLayout.setClipToPadding(true);
        this.actionsLayer = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(context.getColor(defaultSwipeBackground.getResId()));
        frameLayout2.setVisibility(8);
        frameLayout2.setElevation(-1.0f);
        this.deleteArea = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackground(new LayerDrawable(new ColorDrawable[]{new ColorDrawable(context.getColor(defaultFavoriteBaseBackground.getResId())), new ColorDrawable(context.getColor(defaultFavoriteBackground.getResId()))}));
        frameLayout3.setVisibility(8);
        this.favoriteArea = frameLayout3;
        ImageButton imageButton = new ImageButton(context);
        Integer iconResByToken = TokensExtKt.getIconResByToken(context, "ic_m_heart_filled");
        imageButton.setImageResource(iconResByToken != null ? iconResByToken.intValue() : 0);
        int color = context.getColor(defaultUnselectedHeartIconColor);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(color, mode);
        imageButton.setBackground(null);
        imageButton.setVisibility(8);
        imageButton.setEnabled(false);
        imageButton.setOnClickListener(new EE.a(2, imageButton, this));
        this.favoriteButton = imageButton;
        ImageButton imageButton2 = new ImageButton(context);
        Integer iconResByToken2 = TokensExtKt.getIconResByToken(context, "ic_m_trash_bin_filled");
        imageButton2.setImageResource(iconResByToken2 != null ? iconResByToken2.intValue() : 0);
        imageButton2.setColorFilter(context.getColor(binIconColor), mode);
        imageButton2.setBackground(null);
        imageButton2.setVisibility(8);
        imageButton2.setEnabled(false);
        imageButton2.setOnClickListener(new c(0, imageButton2, this));
        this.deleteButton = imageButton2;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(imageButton, new FrameLayout.LayoutParams(px, px));
        frameLayout.addView(imageButton2, new FrameLayout.LayoutParams(px, px));
        frameLayout2.setTranslationZ(0.0f);
        frameLayout3.setTranslationZ(1.0f);
        imageButton.setTranslationZ(2.0f);
        imageButton2.setTranslationZ(2.0f);
    }
}
