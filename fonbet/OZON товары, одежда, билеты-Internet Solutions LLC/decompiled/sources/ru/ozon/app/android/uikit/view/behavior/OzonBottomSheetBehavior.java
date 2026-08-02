package ru.ozon.app.android.uikit.view.behavior;

import O2.a;
import P2.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C5316f0;
import androidx.core.view.Y;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.primitives.e;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.uikit.R$styleable;
import ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000f*\u0002¦\u0001\b\u0016\u0018\u0000 ±\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006±\u0001²\u0001³\u0001B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u0005J'\u0010!\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010\"J7\u0010(\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J?\u0010.\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0001H\u0016¢\u0006\u0004\b0\u00101J7\u00105\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u00012\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010;\u001a\u000202H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010;\u001a\u000202H\u0000¢\u0006\u0004\b?\u0010=J\u0017\u0010D\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0015H\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010H\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0017H\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0004¢\u0006\u0004\bI\u0010CJ\u0017\u0010J\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0001H\u0004¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0014¢\u0006\u0004\bL\u0010MJ'\u0010O\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u0015H\u0014¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u0015H\u0015¢\u0006\u0004\bS\u0010TJ\u001f\u0010V\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010U\u001a\u000202H\u0015¢\u0006\u0004\bV\u0010WJ\u0019\u0010Y\u001a\u0004\u0018\u00010\u00012\u0006\u0010X\u001a\u00020\u0001H\u0014¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b[\u0010\u0005J\u001f\u0010]\u001a\u00020\u00172\u0006\u0010X\u001a\u00020\u00012\u0006\u0010\\\u001a\u00020\u0015H\u0002¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010TJ/\u0010c\u001a\u00020\u00172\u0006\u0010`\u001a\u00020\u000b2\u0006\u0010X\u001a\u00020\u00012\u0006\u0010a\u001a\u00020\u00152\u0006\u0010b\u001a\u00020\u0015H\u0002¢\u0006\u0004\bc\u0010dR$\u0010f\u001a\u00020\u00152\u0006\u0010e\u001a\u00020\u00158A@BX\u0080\u000e¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\"\u0010j\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010g\u001a\u0004\bk\u0010i\"\u0004\bl\u0010CR\"\u0010m\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010g\u001a\u0004\bn\u0010i\"\u0004\bo\u0010CR\"\u0010p\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010g\u001a\u0004\bq\u0010i\"\u0004\br\u0010CR\"\u0010s\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bs\u0010u\"\u0004\bv\u0010GR\"\u0010w\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010t\u001a\u0004\bx\u0010u\"\u0004\by\u0010GR(\u0010z\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bz\u0010g\u0012\u0004\b}\u0010\u0005\u001a\u0004\b{\u0010i\"\u0004\b|\u0010CR)\u0010\u007f\u001a\u0004\u0018\u00010~8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0085\u0001\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010g\u001a\u0005\b\u0086\u0001\u0010i\"\u0005\b\u0087\u0001\u0010CR2\u0010\u0089\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R2\u0010\u008f\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u008a\u0001\u001a\u0006\b\u0090\u0001\u0010\u008c\u0001\"\u0006\b\u0091\u0001\u0010\u008e\u0001R&\u0010\u0092\u0001\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010g\u001a\u0005\b\u0093\u0001\u0010i\"\u0005\b\u0094\u0001\u0010CR&\u0010\u0095\u0001\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010t\u001a\u0005\b\u0096\u0001\u0010u\"\u0005\b\u0097\u0001\u0010GR\u0017\u0010\u0098\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010gR\u0018\u0010\u009b\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010tR\u0018\u0010\u009c\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010tR\u0018\u0010\u009d\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010gR\u0018\u0010\u009e\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010tR#\u0010 \u0001\u001a\f\u0012\u0005\u0012\u00030\u009f\u0001\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u008a\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010gR\u0018\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R(\u0010©\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bª\u0001\u0010i\"\u0005\b«\u0001\u0010CR&\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¬\u0001\u0010i\"\u0005\b\u00ad\u0001\u0010CR\u0017\u0010°\u0001\u001a\u0002028BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001¨\u0006´\u0001"}, d2 = {"Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/os/Parcelable;", "onSaveInstanceState", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;", "state", "", "onRestoreInstanceState", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V", "", "layoutDirection", "", "onLayoutChild", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;", "layoutParams", "onAttachedToLayoutParams", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;)V", "onDetachedFromLayoutParams", "Landroid/view/MotionEvent;", "event", "onInterceptTouchEvent", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onTouchEvent", "coordinatorLayout", "directTargetChild", "target", "nestedScrollAxes", "onStartNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;I)Z", "dx", "dy", "", "consumed", "onNestedPreScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[I)V", "onStopNestedScroll", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)V", "", "velocityX", "velocityY", "onNestedPreFling", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "callback", "setBottomSheetCallback", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V", "yvel", "shouldHide$ui_kit_prodGoogleAllVendorsRelease", "(Landroid/view/View;F)Z", "shouldHide", "shouldHideOrExpand$ui_kit_prodGoogleAllVendorsRelease", "shouldHideOrExpand", "top", "dispatchOnSlide$ui_kit_prodGoogleAllVendorsRelease", "(I)V", "dispatchOnSlide", "enableCurtainMovement", "setMaxOffset$ui_kit_prodGoogleAllVendorsRelease", "(Z)V", "setMaxOffset", "setStateInternal", "stopSettlingAnimation", "(Landroid/view/View;)V", "calculatePeekHeight", "(Landroid/view/View;Landroid/view/View;)I", "maxOffset", "dispatchDragging", "(III)V", "bottomSheet", "newState", "onStateChanged", "(Landroid/view/View;I)V", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "view", "findScrollingChild", "(Landroid/view/View;)Landroid/view/View;", "reset", "direction", "checkNestedViewsCanScrollVertically", "(Landroid/view/View;I)Z", "startSettlingAnimation", "container", "initialX", "mInitialY", "checkViewOverlapped", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;II)Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "peekHeightMin", "I", "getPeekHeightMin$ui_kit_prodGoogleAllVendorsRelease", "()I", "mMinOffset", "getMMinOffset$ui_kit_prodGoogleAllVendorsRelease", "setMMinOffset$ui_kit_prodGoogleAllVendorsRelease", "mMaxOffset", "getMMaxOffset$ui_kit_prodGoogleAllVendorsRelease", "setMMaxOffset$ui_kit_prodGoogleAllVendorsRelease", "startState", "getStartState", "setStartState", "isHideable", "Z", "()Z", "setHideable", "skipCollapsed", "getSkipCollapsed", "setSkipCollapsed", "mState", "getMState$ui_kit_prodGoogleAllVendorsRelease", "setMState$ui_kit_prodGoogleAllVendorsRelease", "getMState$ui_kit_prodGoogleAllVendorsRelease$annotations", "LP2/b;", "mViewDragHelper", "LP2/b;", "getMViewDragHelper$ui_kit_prodGoogleAllVendorsRelease", "()LP2/b;", "setMViewDragHelper$ui_kit_prodGoogleAllVendorsRelease", "(LP2/b;)V", "mParentHeight", "getMParentHeight$ui_kit_prodGoogleAllVendorsRelease", "setMParentHeight$ui_kit_prodGoogleAllVendorsRelease", "Ljava/lang/ref/WeakReference;", "mViewRef", "Ljava/lang/ref/WeakReference;", "getMViewRef$ui_kit_prodGoogleAllVendorsRelease", "()Ljava/lang/ref/WeakReference;", "setMViewRef$ui_kit_prodGoogleAllVendorsRelease", "(Ljava/lang/ref/WeakReference;)V", "mNestedScrollingChildRef", "getMNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease", "setMNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease", "mActivePointerId", "getMActivePointerId$ui_kit_prodGoogleAllVendorsRelease", "setMActivePointerId$ui_kit_prodGoogleAllVendorsRelease", "mTouchingScrollingChild", "getMTouchingScrollingChild$ui_kit_prodGoogleAllVendorsRelease", "setMTouchingScrollingChild$ui_kit_prodGoogleAllVendorsRelease", "mMaximumVelocity", "F", "mPeekHeight", "mPeekHeightAuto", "mIgnoreEvents", "mLastNestedScrollDy", "mNestedScrolled", "Landroidx/viewpager/widget/ViewPager;", "innerViewPagerRef", "mCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/VelocityTracker;", "mVelocityTracker", "Landroid/view/VelocityTracker;", "ru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior$mDragCallback$1", "mDragCallback", "Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior$mDragCallback$1;", "peekHeight", "getPeekHeight", "setPeekHeight", "getState", "setState", "getYVelocity", "()F", "yVelocity", "Companion", "SavedState", "SettleRunnable", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OzonBottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private WeakReference<ViewPager> innerViewPagerRef;
    private boolean isHideable;
    private int mActivePointerId;
    private BottomSheetBehavior.f mCallback;

    @NotNull
    private final OzonBottomSheetBehavior$mDragCallback$1 mDragCallback;
    private boolean mIgnoreEvents;
    private int mInitialY;
    private int mLastNestedScrollDy;
    private int mMaxOffset;
    private final float mMaximumVelocity;
    private int mMinOffset;
    private boolean mNestedScrolled;
    private WeakReference<View> mNestedScrollingChildRef;
    private int mParentHeight;
    private int mPeekHeight;
    private boolean mPeekHeightAuto;
    private int mState;
    private boolean mTouchingScrollingChild;
    private VelocityTracker mVelocityTracker;
    private b mViewDragHelper;
    private WeakReference<V> mViewRef;
    private int peekHeightMin;
    private boolean skipCollapsed;
    private int startState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final float HIDE_FRICTION = 0.1f;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\b\b\u0001\u0010\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u0002H\u0010¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior$Companion;", "", "<init>", "()V", "STATE_DRAGGING", "", "STATE_SETTLING", "STATE_EXPANDED", "STATE_COLLAPSED", "STATE_HIDDEN", "PEEK_HEIGHT_AUTO", "HIDE_THRESHOLD", "", "HIDE_FRICTION", "from", "Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "V", "Landroid/view/View;", "view", "(Landroid/view/View;)Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <V extends View> OzonBottomSheetBehavior<V> from(@NotNull V view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            if (fVar == null) {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            CoordinatorLayout.c c11 = fVar.c();
            OzonBottomSheetBehavior<V> ozonBottomSheetBehavior = c11 instanceof OzonBottomSheetBehavior ? (OzonBottomSheetBehavior) c11 : null;
            if (ozonBottomSheetBehavior != null) {
                return ozonBottomSheetBehavior;
            }
            throw new IllegalArgumentException("The view is not associated with OzonBottomSheetBehavior");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0085\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior$SavedState;", "Landroid/os/Parcelable;", "superState", "", "state", "<init>", "(Landroid/os/Parcelable;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcelable;", "getSuperState", "()Landroid/os/Parcelable;", "I", "getState", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final /* data */ class SavedState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final int state;
        private final Parcelable superState;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable, int i11) {
            this.superState = parcelable;
            this.state = i11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.d(this.superState, savedState.superState) && this.state == savedState.state;
        }

        public final int getState() {
            return this.state;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            return Integer.hashCode(this.state) + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SavedState(superState=" + this.superState + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.superState, flags);
            dest.writeInt(this.state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior$SettleRunnable;", "Ljava/lang/Runnable;", "mView", "Landroid/view/View;", "mTargetState", "", "<init>", "(Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;Landroid/view/View;I)V", "run", "", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class SettleRunnable implements Runnable {
        private final int mTargetState;

        @NotNull
        private final View mView;
        final /* synthetic */ OzonBottomSheetBehavior<V> this$0;

        public SettleRunnable(@NotNull OzonBottomSheetBehavior ozonBottomSheetBehavior, View mView, int i11) {
            Intrinsics.checkNotNullParameter(mView, "mView");
            this.this$0 = ozonBottomSheetBehavior;
            this.mView = mView;
            this.mTargetState = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b mViewDragHelper = this.this$0.getMViewDragHelper();
            if (mViewDragHelper == null || !mViewDragHelper.f()) {
                this.this$0.setStateInternal(this.mTargetState);
                return;
            }
            View view = this.mView;
            int i11 = Y.f42258g;
            view.postOnAnimation(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior$mDragCallback$1] */
    public OzonBottomSheetBehavior() {
        this.startState = 4;
        this.mState = 3;
        this.mDragCallback = new b.c(this) { // from class: ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior$mDragCallback$1
            final /* synthetic */ OzonBottomSheetBehavior<V> this$0;

            {
                this.this$0 = this;
            }

            @Override // P2.b.c
            public int clampViewPositionHorizontal(View child, int left, int dx) {
                Intrinsics.checkNotNullParameter(child, "child");
                return child.getLeft();
            }

            @Override // P2.b.c
            public int clampViewPositionVertical(View child, int top, int dy) {
                Intrinsics.checkNotNullParameter(child, "child");
                return e.b(top, this.this$0.getMMinOffset(), this.this$0.getIsHideable() ? this.this$0.getMParentHeight() : this.this$0.getMMaxOffset());
            }

            @Override // P2.b.c
            public int getViewVerticalDragRange(View child) {
                int mMaxOffset;
                int mMinOffset;
                Intrinsics.checkNotNullParameter(child, "child");
                if (this.this$0.getIsHideable()) {
                    mMaxOffset = this.this$0.getMParentHeight();
                    mMinOffset = this.this$0.getMMinOffset();
                } else {
                    mMaxOffset = this.this$0.getMMaxOffset();
                    mMinOffset = this.this$0.getMMinOffset();
                }
                return mMaxOffset - mMinOffset;
            }

            @Override // P2.b.c
            public void onViewDragStateChanged(int state) {
                if (state == 1) {
                    this.this$0.setStateInternal(1);
                }
            }

            @Override // P2.b.c
            public void onViewPositionChanged(View changedView, int left, int top, int dx, int dy) {
                Intrinsics.checkNotNullParameter(changedView, "changedView");
                this.this$0.dispatchOnSlide$ui_kit_prodGoogleAllVendorsRelease(top);
                OzonBottomSheetBehavior<V> ozonBottomSheetBehavior = this.this$0;
                ozonBottomSheetBehavior.dispatchDragging(dy, top, ozonBottomSheetBehavior.getMMaxOffset());
            }

            @Override // P2.b.c
            public void onViewReleased(View releasedChild, float xvel, float yvel) {
                int mMaxOffset;
                Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
                int top = releasedChild.getTop();
                int i11 = 3;
                if (yvel < 0.0f) {
                    mMaxOffset = this.this$0.getMMinOffset();
                } else if (this.this$0.getSkipCollapsed()) {
                    if (this.this$0.shouldHideOrExpand$ui_kit_prodGoogleAllVendorsRelease(releasedChild, yvel)) {
                        mMaxOffset = this.this$0.getMMinOffset();
                    } else {
                        mMaxOffset = this.this$0.getMParentHeight();
                        i11 = 5;
                    }
                } else if (this.this$0.getIsHideable() && this.this$0.shouldHide$ui_kit_prodGoogleAllVendorsRelease(releasedChild, yvel)) {
                    mMaxOffset = this.this$0.getMParentHeight();
                    i11 = 5;
                } else {
                    if (yvel != 0.0f) {
                        mMaxOffset = this.this$0.getMMaxOffset();
                    } else if (Math.abs(top - this.this$0.getMMinOffset()) < Math.abs(top - this.this$0.getMMaxOffset())) {
                        mMaxOffset = this.this$0.getMMinOffset();
                    } else {
                        mMaxOffset = this.this$0.getMMaxOffset();
                    }
                    i11 = 4;
                }
                b mViewDragHelper = this.this$0.getMViewDragHelper();
                if (mViewDragHelper == null || !mViewDragHelper.r(releasedChild.getLeft(), mMaxOffset)) {
                    this.this$0.setStateInternal(i11);
                    return;
                }
                this.this$0.setStateInternal(2);
                OzonBottomSheetBehavior.SettleRunnable settleRunnable = new OzonBottomSheetBehavior.SettleRunnable(this.this$0, releasedChild, i11);
                int i12 = Y.f42258g;
                releasedChild.postOnAnimation(settleRunnable);
            }

            @Override // P2.b.c
            public boolean tryCaptureView(View child, int pointerId) {
                Intrinsics.checkNotNullParameter(child, "child");
                if (this.this$0.getMState() == 1 || this.this$0.getMTouchingScrollingChild()) {
                    return false;
                }
                if (this.this$0.getMState() == 3 && this.this$0.getMActivePointerId() == pointerId) {
                    WeakReference<View> mNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease = this.this$0.getMNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease();
                    View view = mNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease != null ? mNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease.get() : null;
                    if (view != null && view.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference mViewRef$ui_kit_prodGoogleAllVendorsRelease = this.this$0.getMViewRef$ui_kit_prodGoogleAllVendorsRelease();
                return (mViewRef$ui_kit_prodGoogleAllVendorsRelease != null ? (View) mViewRef$ui_kit_prodGoogleAllVendorsRelease.get() : null) == child;
            }
        };
        this.mMaximumVelocity = 0.0f;
    }

    private final boolean checkNestedViewsCanScrollVertically(View view, int direction) {
        Iterable<View> children;
        if (view.canScrollVertically(direction)) {
            return true;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupExtKt.children(viewGroup)) == null || ((children instanceof Collection) && ((Collection) children).isEmpty())) {
            return false;
        }
        Iterator<View> it = children.iterator();
        while (it.hasNext()) {
            if (checkNestedViewsCanScrollVertically(it.next(), direction)) {
                return true;
            }
        }
        return false;
    }

    private final boolean checkViewOverlapped(CoordinatorLayout container, View view, int initialX, int mInitialY) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            throw new IllegalStateException("Can't check overlap for a view without parent");
        }
        if (view.equals(ViewGroupExtKt.last(viewGroup))) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                i11 = -1;
                break;
            }
            if (C5316f0.a(viewGroup, i11).equals(view)) {
                break;
            }
            i11++;
        }
        int childCount2 = viewGroup.getChildCount();
        for (int i12 = i11 + 1; i12 < childCount2; i12++) {
            View a11 = C5316f0.a(viewGroup, i12);
            if (ViewExtKt.isVisible(a11) && a11.isClickable() && container.isPointInChildBounds(C5316f0.a(viewGroup, i12), initialX, mInitialY)) {
                return true;
            }
        }
        return false;
    }

    private final float getYVelocity() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
        return velocityTracker.getXVelocity(this.mActivePointerId);
    }

    private final void reset() {
        this.mActivePointerId = -1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSettlingAnimation(View child, int state) {
        int i11;
        if (state == 4) {
            i11 = this.mMaxOffset;
        } else if (state == 3) {
            i11 = this.mMinOffset;
        } else {
            if (!this.isHideable || state != 5) {
                throw new IllegalArgumentException(Ej.b.a(state, "Illegal state argument: "));
            }
            i11 = this.mParentHeight;
        }
        b bVar = this.mViewDragHelper;
        if (bVar == null || !bVar.t(child, child.getLeft(), i11)) {
            setStateInternal(state);
            return;
        }
        setStateInternal(2);
        SettleRunnable settleRunnable = new SettleRunnable(this, child, state);
        int i12 = Y.f42258g;
        child.postOnAnimation(settleRunnable);
    }

    protected int calculatePeekHeight(@NotNull View parent, @NotNull View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (!this.mPeekHeightAuto) {
            return this.mPeekHeight;
        }
        if (this.peekHeightMin == 0) {
            this.peekHeightMin = parent.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
        }
        WindowInsets rootWindowInsets = parent.getRootWindowInsets();
        return Math.max(this.peekHeightMin, (this.mParentHeight - (rootWindowInsets != null ? rootWindowInsets.getStableInsetTop() : 0)) - ((parent.getWidth() * 9) / 16));
    }

    protected void dispatchDragging(int dy, int top, int maxOffset) {
    }

    public final void dispatchOnSlide$ui_kit_prodGoogleAllVendorsRelease(int top) {
        WeakReference<V> weakReference = this.mViewRef;
        V v11 = weakReference != null ? weakReference.get() : null;
        if (v11 != null) {
            if (top > this.mMaxOffset) {
                onSlide(v11, (r1 - top) / (this.mParentHeight - r1));
            } else {
                onSlide(v11, (r1 - top) / (r1 - this.mMinOffset));
            }
        }
    }

    protected View findScrollingChild(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Y.s(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            this.innerViewPagerRef = new WeakReference<>(view);
            ViewPager viewPager = (ViewPager) view;
            View childAt = viewPager.getChildAt(viewPager.getCurrentItem());
            Intrinsics.f(childAt);
            View findScrollingChild = findScrollingChild(childAt);
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
            return null;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = viewGroup.getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
            View findScrollingChild2 = findScrollingChild(childAt2);
            if (findScrollingChild2 != null) {
                return findScrollingChild2;
            }
        }
        return null;
    }

    /* renamed from: getMActivePointerId$ui_kit_prodGoogleAllVendorsRelease, reason: from getter */
    public final int getMActivePointerId() {
        return this.mActivePointerId;
    }

    /* renamed from: getMMaxOffset$ui_kit_prodGoogleAllVendorsRelease, reason: from getter */
    public final int getMMaxOffset() {
        return this.mMaxOffset;
    }

    /* renamed from: getMMinOffset$ui_kit_prodGoogleAllVendorsRelease, reason: from getter */
    public final int getMMinOffset() {
        return this.mMinOffset;
    }

    public final WeakReference<View> getMNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease() {
        return this.mNestedScrollingChildRef;
    }

    /* renamed from: getMParentHeight$ui_kit_prodGoogleAllVendorsRelease, reason: from getter */
    public final int getMParentHeight() {
        return this.mParentHeight;
    }

    /* renamed from: getMState$ui_kit_prodGoogleAllVendorsRelease, reason: from getter */
    public final int getMState() {
        return this.mState;
    }

    /* renamed from: getMTouchingScrollingChild$ui_kit_prodGoogleAllVendorsRelease, reason: from getter */
    public final boolean getMTouchingScrollingChild() {
        return this.mTouchingScrollingChild;
    }

    /* renamed from: getMViewDragHelper$ui_kit_prodGoogleAllVendorsRelease, reason: from getter */
    public final b getMViewDragHelper() {
        return this.mViewDragHelper;
    }

    public final WeakReference<V> getMViewRef$ui_kit_prodGoogleAllVendorsRelease() {
        return this.mViewRef;
    }

    public final int getPeekHeight() {
        if (this.mPeekHeightAuto) {
            return -1;
        }
        return this.mPeekHeight;
    }

    public final boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public final int getState() {
        return this.mState;
    }

    /* renamed from: isHideable, reason: from getter */
    public final boolean getIsHideable() {
        return this.isHideable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(@NotNull CoordinatorLayout.f layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        super.onAttachedToLayoutParams(layoutParams);
        this.mViewRef = null;
        this.mViewDragHelper = null;
        this.mNestedScrollingChildRef = null;
        this.innerViewPagerRef = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.mViewRef = null;
        this.mViewDragHelper = null;
        this.mNestedScrollingChildRef = null;
        this.innerViewPagerRef = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull MotionEvent event) {
        final ViewPager viewPager;
        b bVar;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!child.isShown()) {
            this.mIgnoreEvents = true;
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        if (getState() == 1 || getState() == 2) {
            return true;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        if (actionMasked == 0) {
            int x11 = (int) event.getX();
            this.mInitialY = (int) event.getY();
            WeakReference<ViewPager> weakReference = this.innerViewPagerRef;
            if (weakReference != null && (viewPager = weakReference.get()) != null) {
                viewPager.addOnPageChangeListener(new ViewPager.m(this) { // from class: ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior$onInterceptTouchEvent$1$1
                    final /* synthetic */ OzonBottomSheetBehavior<V> this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // androidx.viewpager.widget.ViewPager.j
                    public void onPageSelected(int position) {
                        this.this$0.setMNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease(new WeakReference<>(this.this$0.findScrollingChild(viewPager)));
                    }
                });
            }
            WeakReference<View> weakReference2 = this.mNestedScrollingChildRef;
            View view = weakReference2 != null ? weakReference2.get() : null;
            if (view != null && parent.isPointInChildBounds(view, x11, this.mInitialY) && checkNestedViewsCanScrollVertically(view, -1) && !checkViewOverlapped(parent, view, x11, this.mInitialY)) {
                this.mActivePointerId = event.getPointerId(event.getActionIndex());
                this.mTouchingScrollingChild = true;
            }
            this.mIgnoreEvents = this.mActivePointerId == -1 && !parent.isPointInChildBounds(child, x11, this.mInitialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.mTouchingScrollingChild = false;
            this.mActivePointerId = -1;
            if (this.mIgnoreEvents) {
                this.mIgnoreEvents = false;
                return false;
            }
        }
        if (!this.mIgnoreEvents && (bVar = this.mViewDragHelper) != null && bVar.s(event)) {
            return true;
        }
        WeakReference<View> weakReference3 = this.mNestedScrollingChildRef;
        View view2 = weakReference3 != null ? weakReference3.get() : null;
        b bVar2 = this.mViewDragHelper;
        return (actionMasked != 2 || view2 == null || this.mIgnoreEvents || this.mState == 1 || parent.isPointInChildBounds(view2, (int) event.getX(), (int) event.getY()) || bVar2 == null || Math.abs(((float) this.mInitialY) - event.getY()) <= ((float) bVar2.k())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NotNull CoordinatorLayout parent, @NotNull V child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        int i11 = Y.f42258g;
        if (parent.getFitsSystemWindows() && !child.getFitsSystemWindows()) {
            child.setFitsSystemWindows(true);
        }
        int top = child.getTop();
        parent.onLayoutChild(child, layoutDirection);
        this.mParentHeight = parent.getHeight();
        int calculatePeekHeight = calculatePeekHeight(parent, child);
        int max = Math.max(0, this.mParentHeight - child.getHeight());
        this.mMinOffset = max;
        int max2 = Math.max(this.mParentHeight - calculatePeekHeight, max);
        this.mMaxOffset = max2;
        int i12 = this.mState;
        if (i12 == 3) {
            child.offsetTopAndBottom(this.mMinOffset);
        } else if (this.isHideable && i12 == 5) {
            child.offsetTopAndBottom(this.mParentHeight);
        } else if (i12 == 4) {
            child.offsetTopAndBottom(max2);
        } else if (i12 == 1 || i12 == 2) {
            child.offsetTopAndBottom(top - child.getTop());
        }
        if (this.mViewDragHelper == null) {
            this.mViewDragHelper = b.g(parent, this.mDragCallback);
        }
        this.mViewRef = new WeakReference<>(child);
        this.mNestedScrollingChildRef = new WeakReference<>(findScrollingChild(child));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View target, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        WeakReference<View> weakReference = this.mNestedScrollingChildRef;
        if (target == (weakReference != null ? weakReference.get() : null)) {
            return this.mState != 3 || super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View target, int dx, int dy, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        WeakReference<View> weakReference = this.mNestedScrollingChildRef;
        if (target != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = child.getTop();
        int i11 = top - dy;
        if (dy > 0) {
            int i12 = this.mMinOffset;
            if (i11 < i12) {
                int i13 = top - i12;
                consumed[1] = i13;
                int i14 = Y.f42258g;
                child.offsetTopAndBottom(-i13);
                setStateInternal(3);
            } else {
                consumed[1] = dy;
                int i15 = Y.f42258g;
                child.offsetTopAndBottom(-dy);
                setStateInternal(1);
            }
        } else if (dy < 0 && !target.canScrollVertically(-1)) {
            int i16 = this.mMaxOffset;
            if (i11 <= i16 || this.isHideable || this.skipCollapsed) {
                consumed[1] = dy;
                int i17 = Y.f42258g;
                child.offsetTopAndBottom(-dy);
                setStateInternal(1);
            } else {
                int i18 = top - i16;
                consumed[1] = i18;
                int i19 = Y.f42258g;
                child.offsetTopAndBottom(-i18);
                setStateInternal(4);
            }
        }
        dispatchOnSlide$ui_kit_prodGoogleAllVendorsRelease(child.getTop());
        this.mLastNestedScrollDy = dy;
        this.mNestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState == null) {
            super.onRestoreInstanceState(parent, child, a.f19867b);
            return;
        }
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(parent, child, savedState.getSuperState());
        }
        this.mState = (savedState.getState() == 1 || savedState.getState() == 2) ? this.startState : savedState.getState();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NotNull
    public Parcelable onSaveInstanceState(@NotNull CoordinatorLayout parent, @NotNull V child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return new SavedState(super.onSaveInstanceState(parent, child), this.mState);
    }

    protected void onSlide(@NotNull View bottomSheet, float slideOffset) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        BottomSheetBehavior.f fVar = this.mCallback;
        if (fVar != null) {
            fVar.onSlide(bottomSheet, slideOffset);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View directTargetChild, @NotNull View target, int nestedScrollAxes) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        this.mLastNestedScrollDy = 0;
        this.mNestedScrolled = false;
        return (nestedScrollAxes & 2) != 0;
    }

    protected void onStateChanged(@NotNull View bottomSheet, int newState) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        BottomSheetBehavior.f fVar = this.mCallback;
        if (fVar != null) {
            fVar.onStateChanged(bottomSheet, newState);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V child, @NotNull View target) {
        int i11;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        int i12 = 3;
        if (child.getTop() == this.mMinOffset && getState() != 1) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.mNestedScrollingChildRef;
        if (target == (weakReference != null ? weakReference.get() : null) && this.mNestedScrolled) {
            if (this.mLastNestedScrollDy > 0) {
                i11 = this.mMinOffset;
            } else {
                boolean z11 = this.skipCollapsed;
                int i13 = 5;
                if (!z11) {
                    if (this.isHideable && (z11 || shouldHide$ui_kit_prodGoogleAllVendorsRelease(child, getYVelocity()))) {
                        i11 = this.mParentHeight;
                    } else {
                        i13 = 4;
                        if (this.mLastNestedScrollDy == 0) {
                            int top = child.getTop();
                            if (Math.abs(top - this.mMinOffset) < Math.abs(top - this.mMaxOffset)) {
                                i11 = this.mMinOffset;
                            } else {
                                i11 = this.mMaxOffset;
                            }
                        } else {
                            i11 = this.mMaxOffset;
                        }
                    }
                    i12 = i13;
                } else if (shouldHideOrExpand$ui_kit_prodGoogleAllVendorsRelease(child, getYVelocity())) {
                    i11 = this.mMinOffset;
                } else {
                    i11 = this.mParentHeight;
                    i12 = i13;
                }
            }
            b bVar = this.mViewDragHelper;
            if (bVar == null || !bVar.t(child, child.getLeft(), i11)) {
                setStateInternal(i12);
            } else {
                setStateInternal(2);
                SettleRunnable settleRunnable = new SettleRunnable(this, child, i12);
                int i14 = Y.f42258g;
                child.postOnAnimation(settleRunnable);
            }
            this.mNestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(@NotNull CoordinatorLayout parent, @NotNull V child, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!child.isShown()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (this.mState == 1 && actionMasked == 0) {
            return true;
        }
        try {
            b bVar = this.mViewDragHelper;
            if (bVar != null) {
                bVar.m(event);
            }
        } catch (IllegalArgumentException unused) {
        }
        if (actionMasked == 0) {
            reset();
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.mVelocityTracker = velocityTracker;
        }
        velocityTracker.addMovement(event);
        b bVar2 = this.mViewDragHelper;
        if (bVar2 != null && actionMasked == 2 && !this.mIgnoreEvents && Math.abs(this.mInitialY - event.getY()) > bVar2.k()) {
            bVar2.b(event.getPointerId(event.getActionIndex()), child);
        }
        return !this.mIgnoreEvents;
    }

    public final void setBottomSheetCallback(BottomSheetBehavior.f callback) {
        this.mCallback = callback;
    }

    public final void setHideable(boolean z11) {
        this.isHideable = z11;
    }

    public final void setMNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease(WeakReference<View> weakReference) {
        this.mNestedScrollingChildRef = weakReference;
    }

    public final void setMaxOffset$ui_kit_prodGoogleAllVendorsRelease(boolean enableCurtainMovement) {
        this.mMaxOffset = enableCurtainMovement ? Math.max(this.mParentHeight - getPeekHeight(), this.mMinOffset) : 0;
    }

    public final void setPeekHeight(int i11) {
        WeakReference<V> weakReference;
        V v11;
        if (i11 == -1) {
            if (this.mPeekHeightAuto) {
                return;
            } else {
                this.mPeekHeightAuto = true;
            }
        } else {
            if (!this.mPeekHeightAuto && this.mPeekHeight == i11) {
                return;
            }
            this.mPeekHeightAuto = false;
            this.mPeekHeight = Math.max(0, i11);
            this.mMaxOffset = this.mParentHeight - i11;
        }
        if (this.mState != 4 || (weakReference = this.mViewRef) == null || weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        v11.requestLayout();
    }

    public final void setSkipCollapsed(boolean z11) {
        this.skipCollapsed = z11;
    }

    public final void setState(final int i11) {
        if (i11 == this.mState) {
            return;
        }
        WeakReference<V> weakReference = this.mViewRef;
        if (weakReference == null) {
            if (i11 == 4 || i11 == 3 || (this.isHideable && i11 == 5)) {
                this.mState = i11;
                return;
            }
            return;
        }
        final V v11 = weakReference.get();
        if (v11 == null) {
            return;
        }
        ViewParent parent = v11.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            int i12 = Y.f42258g;
            if (v11.isAttachedToWindow()) {
                v11.post(new Runnable() { // from class: wX.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        OzonBottomSheetBehavior.this.startSettlingAnimation(v11, i11);
                    }
                });
                return;
            }
        }
        startSettlingAnimation(v11, i11);
    }

    protected final void setStateInternal(int state) {
        V v11;
        if (this.mState == state) {
            return;
        }
        this.mState = state;
        WeakReference<V> weakReference = this.mViewRef;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        onStateChanged(v11, state);
    }

    public final boolean shouldHide$ui_kit_prodGoogleAllVendorsRelease(@NotNull View child, float yvel) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.skipCollapsed) {
            return true;
        }
        if (child.getTop() < this.mMaxOffset) {
            return false;
        }
        return Math.abs(((yvel * HIDE_FRICTION) + ((float) child.getTop())) - ((float) this.mMaxOffset)) / ((float) this.mPeekHeight) > HIDE_THRESHOLD;
    }

    public final boolean shouldHideOrExpand$ui_kit_prodGoogleAllVendorsRelease(@NotNull View child, float yvel) {
        Intrinsics.checkNotNullParameter(child, "child");
        float top = (yvel * HIDE_FRICTION) + child.getTop();
        int i11 = this.mParentHeight;
        return (((float) i11) - top) / ((float) i11) > HIDE_THRESHOLD;
    }

    protected final void stopSettlingAnimation(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        b bVar = this.mViewDragHelper;
        if (bVar != null) {
            bVar.t(child, child.getLeft(), child.getTop());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior$mDragCallback$1] */
    public OzonBottomSheetBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.startState = 4;
        this.mState = 3;
        this.mDragCallback = new b.c(this) { // from class: ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior$mDragCallback$1
            final /* synthetic */ OzonBottomSheetBehavior<V> this$0;

            {
                this.this$0 = this;
            }

            @Override // P2.b.c
            public int clampViewPositionHorizontal(View child, int left, int dx) {
                Intrinsics.checkNotNullParameter(child, "child");
                return child.getLeft();
            }

            @Override // P2.b.c
            public int clampViewPositionVertical(View child, int top, int dy) {
                Intrinsics.checkNotNullParameter(child, "child");
                return e.b(top, this.this$0.getMMinOffset(), this.this$0.getIsHideable() ? this.this$0.getMParentHeight() : this.this$0.getMMaxOffset());
            }

            @Override // P2.b.c
            public int getViewVerticalDragRange(View child) {
                int mMaxOffset;
                int mMinOffset;
                Intrinsics.checkNotNullParameter(child, "child");
                if (this.this$0.getIsHideable()) {
                    mMaxOffset = this.this$0.getMParentHeight();
                    mMinOffset = this.this$0.getMMinOffset();
                } else {
                    mMaxOffset = this.this$0.getMMaxOffset();
                    mMinOffset = this.this$0.getMMinOffset();
                }
                return mMaxOffset - mMinOffset;
            }

            @Override // P2.b.c
            public void onViewDragStateChanged(int state) {
                if (state == 1) {
                    this.this$0.setStateInternal(1);
                }
            }

            @Override // P2.b.c
            public void onViewPositionChanged(View changedView, int left, int top, int dx, int dy) {
                Intrinsics.checkNotNullParameter(changedView, "changedView");
                this.this$0.dispatchOnSlide$ui_kit_prodGoogleAllVendorsRelease(top);
                OzonBottomSheetBehavior<V> ozonBottomSheetBehavior = this.this$0;
                ozonBottomSheetBehavior.dispatchDragging(dy, top, ozonBottomSheetBehavior.getMMaxOffset());
            }

            @Override // P2.b.c
            public void onViewReleased(View releasedChild, float xvel, float yvel) {
                int mMaxOffset;
                Intrinsics.checkNotNullParameter(releasedChild, "releasedChild");
                int top = releasedChild.getTop();
                int i112 = 3;
                if (yvel < 0.0f) {
                    mMaxOffset = this.this$0.getMMinOffset();
                } else if (this.this$0.getSkipCollapsed()) {
                    if (this.this$0.shouldHideOrExpand$ui_kit_prodGoogleAllVendorsRelease(releasedChild, yvel)) {
                        mMaxOffset = this.this$0.getMMinOffset();
                    } else {
                        mMaxOffset = this.this$0.getMParentHeight();
                        i112 = 5;
                    }
                } else if (this.this$0.getIsHideable() && this.this$0.shouldHide$ui_kit_prodGoogleAllVendorsRelease(releasedChild, yvel)) {
                    mMaxOffset = this.this$0.getMParentHeight();
                    i112 = 5;
                } else {
                    if (yvel != 0.0f) {
                        mMaxOffset = this.this$0.getMMaxOffset();
                    } else if (Math.abs(top - this.this$0.getMMinOffset()) < Math.abs(top - this.this$0.getMMaxOffset())) {
                        mMaxOffset = this.this$0.getMMinOffset();
                    } else {
                        mMaxOffset = this.this$0.getMMaxOffset();
                    }
                    i112 = 4;
                }
                b mViewDragHelper = this.this$0.getMViewDragHelper();
                if (mViewDragHelper == null || !mViewDragHelper.r(releasedChild.getLeft(), mMaxOffset)) {
                    this.this$0.setStateInternal(i112);
                    return;
                }
                this.this$0.setStateInternal(2);
                OzonBottomSheetBehavior.SettleRunnable settleRunnable = new OzonBottomSheetBehavior.SettleRunnable(this.this$0, releasedChild, i112);
                int i12 = Y.f42258g;
                releasedChild.postOnAnimation(settleRunnable);
            }

            @Override // P2.b.c
            public boolean tryCaptureView(View child, int pointerId) {
                Intrinsics.checkNotNullParameter(child, "child");
                if (this.this$0.getMState() == 1 || this.this$0.getMTouchingScrollingChild()) {
                    return false;
                }
                if (this.this$0.getMState() == 3 && this.this$0.getMActivePointerId() == pointerId) {
                    WeakReference<View> mNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease = this.this$0.getMNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease();
                    View view = mNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease != null ? mNestedScrollingChildRef$ui_kit_prodGoogleAllVendorsRelease.get() : null;
                    if (view != null && view.canScrollVertically(-1)) {
                        return false;
                    }
                }
                WeakReference mViewRef$ui_kit_prodGoogleAllVendorsRelease = this.this$0.getMViewRef$ui_kit_prodGoogleAllVendorsRelease();
                return (mViewRef$ui_kit_prodGoogleAllVendorsRelease != null ? (View) mViewRef$ui_kit_prodGoogleAllVendorsRelease.get() : null) == child;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.OzonBottomSheetBehavior_Layout);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        TypedValue peekValue = obtainStyledAttributes.peekValue(R$styleable.OzonBottomSheetBehavior_Layout_behavior_sheetPeekHeight);
        setPeekHeight((peekValue == null || (i11 = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(R$styleable.OzonBottomSheetBehavior_Layout_behavior_sheetPeekHeight, -1) : i11);
        this.isHideable = obtainStyledAttributes.getBoolean(R$styleable.OzonBottomSheetBehavior_Layout_behavior_hideable, false);
        this.skipCollapsed = obtainStyledAttributes.getBoolean(R$styleable.OzonBottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        int i12 = obtainStyledAttributes.getInt(R$styleable.OzonBottomSheetBehavior_Layout_behavior_defaultState, 3);
        this.startState = i12;
        this.mState = i12;
        obtainStyledAttributes.recycle();
        this.mMaximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
