package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.swmansion.rnscreens.ScreenContentWrapper;
import com.swmansion.rnscreens.bottomsheet.BottomSheetBehaviorExtKt;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.bottomsheet.SheetDetents;
import com.swmansion.rnscreens.bottomsheet.SheetUtilsKt;
import com.swmansion.rnscreens.events.HeaderHeightChangeEvent;
import com.swmansion.rnscreens.events.SheetDetentChangedEvent;
import com.swmansion.rnscreens.ext.FragmentExtKt;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import com.swmansion.rnscreens.utils.DecorViewInsetsUtilsKt;
import io.sentry.protocol.Request;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ê\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\få\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000bH\u0016J7\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00172\u0007\u0010\u0088\u0001\u001a\u00020B2\u0007\u0010\u0089\u0001\u001a\u00020B2\u0007\u0010\u008a\u0001\u001a\u00020B2\u0007\u0010\u008b\u0001\u001a\u00020BH\u0016J+\u0010\u008c\u0001\u001a\u00030\u0086\u00012\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0007\u0010\u008e\u0001\u001a\u00020B2\u0007\u0010\u008f\u0001\u001a\u00020BH\u0002J\"\u0010\u0090\u0001\u001a\u00030\u0086\u00012\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0007\u0010\u0091\u0001\u001a\u00020BH\u0002J\"\u0010\u0092\u0001\u001a\u00030\u0086\u00012\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0007\u0010\u0091\u0001\u001a\u00020BH\u0002J\u0012\u0010\u0093\u0001\u001a\u00030\u0086\u00012\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001J\u001a\u0010\u0096\u0001\u001a\u00030\u0086\u00012\u000e\u0010\"\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u0001H\u0014J\u001a\u0010\u0099\u0001\u001a\u00030\u0086\u00012\u000e\u0010\"\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u0001H\u0014J7\u0010\u009a\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u00172\u0007\u0010\u009b\u0001\u001a\u00020B2\u0007\u0010\u009c\u0001\u001a\u00020B2\u0007\u0010\u009d\u0001\u001a\u00020B2\u0007\u0010\u009e\u0001\u001a\u00020BH\u0014J\u0019\u0010\u009f\u0001\u001a\u00030\u0086\u00012\u0007\u0010 \u0001\u001a\u00020\u0017H\u0000¢\u0006\u0003\b¡\u0001J\u0010\u0010¢\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0003\b£\u0001J\u0010\u0010¤\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0003\b¥\u0001J\u001c\u0010¦\u0001\u001a\u00030\u0086\u00012\u0007\u0010§\u0001\u001a\u00020B2\u0007\u0010\u0091\u0001\u001a\u00020BH\u0002J%\u0010¨\u0001\u001a\u00030\u0086\u00012\u0007\u0010§\u0001\u001a\u00020B2\u0007\u0010\u0091\u0001\u001a\u00020B2\u0007\u0010©\u0001\u001a\u00020BH\u0002J\u0011\u0010±\u0001\u001a\u00030\u0086\u00012\u0007\u0010²\u0001\u001a\u00020\u0017J\u0007\u0010³\u0001\u001a\u00020\u0017J\u0013\u0010´\u0001\u001a\u00020\u00172\b\u0010µ\u0001\u001a\u00030¶\u0001H\u0002J\u001f\u0010·\u0001\u001a\u00030\u0086\u00012\u0007\u0010¸\u0001\u001a\u00020B2\n\u0010¹\u0001\u001a\u0005\u0018\u00010º\u0001H\u0016J\u0010\u0010»\u0001\u001a\u00030\u0086\u00012\u0006\u0010*\u001a\u00020)J\u0012\u0010¼\u0001\u001a\u00030\u0086\u00012\b\u0010C\u001a\u0004\u0018\u00010HJ\u0011\u0010½\u0001\u001a\u00030\u0086\u00012\u0007\u0010¾\u0001\u001a\u00020BJ\b\u0010Ë\u0001\u001a\u00030\u0086\u0001J\b\u0010Ì\u0001\u001a\u00030\u0086\u0001J\u0014\u0010Í\u0001\u001a\u00030\u0086\u00012\b\u0010Î\u0001\u001a\u00030¶\u0001H\u0002J\u0016\u0010Ï\u0001\u001a\u00030\u0086\u00012\n\u0010Î\u0001\u001a\u0005\u0018\u00010¶\u0001H\u0002J\u0015\u0010Ð\u0001\u001a\u00020\u00172\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ò\u0001H\u0017J\u0019\u0010Ó\u0001\u001a\u00030\u0086\u00012\u0007\u0010Ô\u0001\u001a\u00020BH\u0000¢\u0006\u0003\bÕ\u0001J\"\u0010Ö\u0001\u001a\u00030\u0086\u00012\u0007\u0010×\u0001\u001a\u00020B2\u0007\u0010Ø\u0001\u001a\u00020\u0017H\u0000¢\u0006\u0003\bÙ\u0001J\u0010\u0010Ú\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0003\bÛ\u0001J\u0018\u0010Ü\u0001\u001a\u0005\u0018\u00010Ý\u00012\n\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u0001H\u0016J\n\u0010ß\u0001\u001a\u00030\u0086\u0001H\u0014J\u001c\u0010à\u0001\u001a\u00030\u0086\u00012\u0007\u0010×\u0001\u001a\u00020B2\u0007\u0010Ø\u0001\u001a\u00020\u0017H\u0002J\u0010\u0010á\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0003\bâ\u0001J\u0010\u0010ã\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0003\bä\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010*\u001a\u0004\u0018\u00010)2\b\u0010(\u001a\u0004\u0018\u00010)@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010\u001bR$\u0010C\u001a\u0004\u0018\u00010B2\b\u0010(\u001a\u0004\u0018\u00010B@BX\u0086\u000e¢\u0006\n\n\u0002\u0010F\u001a\u0004\bD\u0010ER\u001c\u0010G\u001a\u0004\u0018\u00010HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010M\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0019\"\u0004\bS\u0010\u001bR\u001a\u0010T\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0019\"\u0004\bU\u0010\u001bR\u000e\u0010V\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010X\u001a\u00020W2\u0006\u0010(\u001a\u00020W@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0019\"\u0004\b_\u0010\u001bR\u001a\u0010`\u001a\u00020aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010f\u001a\u00020BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u0010k\u001a\u00020BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR\u001a\u0010n\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0019\"\u0004\bp\u0010\u001bR\u001a\u0010q\u001a\u00020WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010Z\"\u0004\bs\u0010\\R\u001a\u0010t\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0019\"\u0004\bv\u0010\u001bR\u001a\u0010w\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u0019\"\u0004\by\u0010\u001bR\u001a\u0010z\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u0019\"\u0004\b|\u0010\u001bR+\u0010~\u001a\u0004\u0018\u00010}2\b\u0010(\u001a\u0004\u0018\u00010}@FX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0019R\u0017\u0010ª\u0001\u001a\u0005\u0018\u00010«\u00018F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010®\u0001\u001a\u0005\u0018\u00010\u0095\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R,\u0010¿\u0001\u001a\u0004\u0018\u00010H2\t\u0010¿\u0001\u001a\u0004\u0018\u00010H@FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0001\u0010J\"\u0005\bÁ\u0001\u0010LR.\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e¢\u0006\u0012\n\u0002\u0010Q\u001a\u0005\bÃ\u0001\u0010N\"\u0005\bÄ\u0001\u0010PR.\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00172\t\u0010Å\u0001\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e¢\u0006\u0012\n\u0002\u0010Q\u001a\u0005\bÆ\u0001\u0010N\"\u0005\bÇ\u0001\u0010PR\u001d\u0010È\u0001\u001a\u00020\u0017X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0001\u0010\u0019\"\u0005\bÊ\u0001\u0010\u001b¨\u0006ë\u0001"}, d2 = {"Lcom/swmansion/rnscreens/Screen;", "Lcom/swmansion/rnscreens/FabricEnabledViewGroup;", "Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;", "Lcom/swmansion/rnscreens/gamma/common/FragmentProviding;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", Request.JsonKeys.FRAGMENT, "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "sheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "reactEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "insetsApplied", "", "getInsetsApplied", "()Z", "setInsetsApplied", "(Z)V", "fragmentWrapper", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "getFragmentWrapper", "()Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "setFragmentWrapper", "(Lcom/swmansion/rnscreens/ScreenFragmentWrapper;)V", "container", "Lcom/swmansion/rnscreens/ScreenContainer;", "getContainer", "()Lcom/swmansion/rnscreens/ScreenContainer;", "setContainer", "(Lcom/swmansion/rnscreens/ScreenContainer;)V", "value", "Lcom/swmansion/rnscreens/Screen$ActivityState;", "activityState", "getActivityState", "()Lcom/swmansion/rnscreens/Screen$ActivityState;", "isTransitioning", "stackPresentation", "Lcom/swmansion/rnscreens/Screen$StackPresentation;", "getStackPresentation", "()Lcom/swmansion/rnscreens/Screen$StackPresentation;", "setStackPresentation", "(Lcom/swmansion/rnscreens/Screen$StackPresentation;)V", "replaceAnimation", "Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;", "getReplaceAnimation", "()Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;", "setReplaceAnimation", "(Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;)V", "stackAnimation", "Lcom/swmansion/rnscreens/Screen$StackAnimation;", "getStackAnimation", "()Lcom/swmansion/rnscreens/Screen$StackAnimation;", "setStackAnimation", "(Lcom/swmansion/rnscreens/Screen$StackAnimation;)V", "isGestureEnabled", "setGestureEnabled", "", "screenOrientation", "getScreenOrientation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "screenId", "", "getScreenId", "()Ljava/lang/String;", "setScreenId", "(Ljava/lang/String;)V", "isStatusBarAnimated", "()Ljava/lang/Boolean;", "setStatusBarAnimated", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isBeingRemoved", "setBeingRemoved", "isSheetGrabberVisible", "setSheetGrabberVisible", "shouldUpdateSheetCornerRadius", "", "sheetCornerRadius", "getSheetCornerRadius", "()F", "setSheetCornerRadius", "(F)V", "sheetExpandsWhenScrolledToEdge", "getSheetExpandsWhenScrolledToEdge", "setSheetExpandsWhenScrolledToEdge", "sheetDetents", "Lcom/swmansion/rnscreens/bottomsheet/SheetDetents;", "getSheetDetents", "()Lcom/swmansion/rnscreens/bottomsheet/SheetDetents;", "setSheetDetents", "(Lcom/swmansion/rnscreens/bottomsheet/SheetDetents;)V", "sheetLargestUndimmedDetentIndex", "getSheetLargestUndimmedDetentIndex", "()I", "setSheetLargestUndimmedDetentIndex", "(I)V", "sheetInitialDetentIndex", "getSheetInitialDetentIndex", "setSheetInitialDetentIndex", "sheetClosesOnTouchOutside", "getSheetClosesOnTouchOutside", "setSheetClosesOnTouchOutside", "sheetElevation", "getSheetElevation", "setSheetElevation", "sheetShouldOverflowTopInset", "getSheetShouldOverflowTopInset", "setSheetShouldOverflowTopInset", "sheetDefaultResizeAnimationEnabled", "getSheetDefaultResizeAnimationEnabled", "setSheetDefaultResizeAnimationEnabled", "shouldTriggerPostponedTransitionAfterLayout", "getShouldTriggerPostponedTransitionAfterLayout", "setShouldTriggerPostponedTransitionAfterLayout", "Lcom/swmansion/rnscreens/ScreenFooter;", "footer", "getFooter", "()Lcom/swmansion/rnscreens/ScreenFooter;", "setFooter", "(Lcom/swmansion/rnscreens/ScreenFooter;)V", "isNativeStackScreen", "getAssociatedFragment", "onContentWrapperLayout", "", "changed", "left", "top", "right", "bottom", "updateSheetContentHeightWithAnimation", "behavior", "oldHeight", "newHeight", "updateSheetContentHeightWithoutAnimation", "height", "setupInitialSheetContentHeight", "registerLayoutCallbackForWrapper", "wrapper", "Lcom/swmansion/rnscreens/ScreenContentWrapper;", "dispatchSaveInstanceState", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchRestoreInstanceState", "onLayout", CmcdData.STREAM_TYPE_LIVE, "t", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "b", "onBottomSheetBehaviorDidLayout", "coordinatorLayoutDidChange", "onBottomSheetBehaviorDidLayout$react_native_screens_release", "requestTriggeringPostponedEnterTransition", "requestTriggeringPostponedEnterTransition$react_native_screens_release", "triggerPostponedEnterTransitionIfNeeded", "triggerPostponedEnterTransitionIfNeeded$react_native_screens_release", "updateScreenSizePaper", "width", "dispatchShadowStateUpdate", "offsetY", "headerConfig", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "contentWrapper", "getContentWrapper", "()Lcom/swmansion/rnscreens/ScreenContentWrapper;", "setTransitioning", "transitioning", "isTranslucent", "hasWebView", "viewGroup", "Landroid/view/ViewGroup;", "setLayerType", "layerType", "paint", "Landroid/graphics/Paint;", "setActivityState", "setScreenOrientation", "changeAccessibilityMode", "mode", "statusBarStyle", "getStatusBarStyle", "setStatusBarStyle", "statusBarHidden", "isStatusBarHidden", "setStatusBarHidden", "navigationBarHidden", "isNavigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "getNativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "startRemovalTransition", "endRemovalTransition", "endTransitionRecursive", "parent", "startTransitionRecursive", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "notifyHeaderHeightChange", "headerHeight", "notifyHeaderHeightChange$react_native_screens_release", "onSheetDetentChanged", "detentIndex", "isStable", "onSheetDetentChanged$react_native_screens_release", "onSheetYTranslationChanged", "onSheetYTranslationChanged$react_native_screens_release", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "onAttachedToWindow", "dispatchSheetDetentChanged", "onFinalizePropsUpdate", "onFinalizePropsUpdate$react_native_screens_release", "onSheetCornerRadiusChange", "onSheetCornerRadiusChange$react_native_screens_release", "StackPresentation", "StackAnimation", "ReplaceAnimation", "ActivityState", "WindowTraits", "Companion", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Screen extends FabricEnabledViewGroup implements ScreenContentWrapper.OnLayoutCallback, FragmentProviding {
    public static final String TAG = "Screen";
    private ActivityState activityState;
    private ScreenContainer container;
    private ScreenFooter footer;
    private ScreenFragmentWrapper fragmentWrapper;
    private boolean insetsApplied;
    private boolean isBeingRemoved;
    private boolean isGestureEnabled;
    private Boolean isNavigationBarHidden;
    private boolean isSheetGrabberVisible;
    private Boolean isStatusBarAnimated;
    private Boolean isStatusBarHidden;
    private boolean isTransitioning;
    private boolean nativeBackButtonDismissalEnabled;
    private final ThemedReactContext reactContext;
    private ReplaceAnimation replaceAnimation;
    private String screenId;
    private Integer screenOrientation;
    private boolean sheetClosesOnTouchOutside;
    private float sheetCornerRadius;
    private boolean sheetDefaultResizeAnimationEnabled;
    private SheetDetents sheetDetents;
    private float sheetElevation;
    private boolean sheetExpandsWhenScrolledToEdge;
    private int sheetInitialDetentIndex;
    private int sheetLargestUndimmedDetentIndex;
    private boolean sheetShouldOverflowTopInset;
    private boolean shouldTriggerPostponedTransitionAfterLayout;
    private boolean shouldUpdateSheetCornerRadius;
    private StackAnimation stackAnimation;
    private StackPresentation stackPresentation;
    private String statusBarStyle;

    /* compiled from: Screen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StackPresentation.values().length];
            try {
                iArr[StackPresentation.TRANSPARENT_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StackPresentation.FORM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.View
    public void setLayerType(int layerType, Paint paint) {
    }

    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Screen(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.stackPresentation = StackPresentation.PUSH;
        this.replaceAnimation = ReplaceAnimation.POP;
        this.stackAnimation = StackAnimation.DEFAULT;
        this.isGestureEnabled = true;
        this.sheetExpandsWhenScrolledToEdge = true;
        this.sheetDetents = new SheetDetents(CollectionsKt.listOf(Double.valueOf(1.0d)));
        this.sheetLargestUndimmedDetentIndex = -1;
        this.sheetClosesOnTouchOutside = true;
        this.sheetElevation = 24.0f;
        this.sheetDefaultResizeAnimationEnabled = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.nativeBackButtonDismissalEnabled = true;
    }

    public final Fragment getFragment() {
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getFragment();
        }
        return null;
    }

    public final BottomSheetBehavior<Screen> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        return null;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, getId());
    }

    public final boolean getInsetsApplied() {
        return this.insetsApplied;
    }

    public final void setInsetsApplied(boolean z) {
        this.insetsApplied = z;
    }

    public final ScreenFragmentWrapper getFragmentWrapper() {
        return this.fragmentWrapper;
    }

    public final void setFragmentWrapper(ScreenFragmentWrapper screenFragmentWrapper) {
        this.fragmentWrapper = screenFragmentWrapper;
    }

    public final ScreenContainer getContainer() {
        return this.container;
    }

    public final void setContainer(ScreenContainer screenContainer) {
        this.container = screenContainer;
    }

    public final ActivityState getActivityState() {
        return this.activityState;
    }

    public final StackPresentation getStackPresentation() {
        return this.stackPresentation;
    }

    public final void setStackPresentation(StackPresentation stackPresentation) {
        Intrinsics.checkNotNullParameter(stackPresentation, "<set-?>");
        this.stackPresentation = stackPresentation;
    }

    public final ReplaceAnimation getReplaceAnimation() {
        return this.replaceAnimation;
    }

    public final void setReplaceAnimation(ReplaceAnimation replaceAnimation) {
        Intrinsics.checkNotNullParameter(replaceAnimation, "<set-?>");
        this.replaceAnimation = replaceAnimation;
    }

    public final StackAnimation getStackAnimation() {
        return this.stackAnimation;
    }

    public final void setStackAnimation(StackAnimation stackAnimation) {
        Intrinsics.checkNotNullParameter(stackAnimation, "<set-?>");
        this.stackAnimation = stackAnimation;
    }

    /* renamed from: isGestureEnabled, reason: from getter */
    public final boolean getIsGestureEnabled() {
        return this.isGestureEnabled;
    }

    public final void setGestureEnabled(boolean z) {
        this.isGestureEnabled = z;
    }

    public final Integer getScreenOrientation() {
        return this.screenOrientation;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public final void setScreenId(String str) {
        this.screenId = str;
    }

    /* renamed from: isStatusBarAnimated, reason: from getter */
    public final Boolean getIsStatusBarAnimated() {
        return this.isStatusBarAnimated;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.isStatusBarAnimated = bool;
    }

    /* renamed from: isBeingRemoved, reason: from getter */
    public final boolean getIsBeingRemoved() {
        return this.isBeingRemoved;
    }

    public final void setBeingRemoved(boolean z) {
        this.isBeingRemoved = z;
    }

    /* renamed from: isSheetGrabberVisible, reason: from getter */
    public final boolean getIsSheetGrabberVisible() {
        return this.isSheetGrabberVisible;
    }

    public final void setSheetGrabberVisible(boolean z) {
        this.isSheetGrabberVisible = z;
    }

    public final float getSheetCornerRadius() {
        return this.sheetCornerRadius;
    }

    public final void setSheetCornerRadius(float f) {
        if (this.sheetCornerRadius == f) {
            return;
        }
        this.sheetCornerRadius = f;
        this.shouldUpdateSheetCornerRadius = true;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.sheetExpandsWhenScrolledToEdge;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z) {
        this.sheetExpandsWhenScrolledToEdge = z;
    }

    public final SheetDetents getSheetDetents() {
        return this.sheetDetents;
    }

    public final void setSheetDetents(SheetDetents sheetDetents) {
        Intrinsics.checkNotNullParameter(sheetDetents, "<set-?>");
        this.sheetDetents = sheetDetents;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.sheetLargestUndimmedDetentIndex;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i) {
        this.sheetLargestUndimmedDetentIndex = i;
    }

    public final int getSheetInitialDetentIndex() {
        return this.sheetInitialDetentIndex;
    }

    public final void setSheetInitialDetentIndex(int i) {
        this.sheetInitialDetentIndex = i;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.sheetClosesOnTouchOutside;
    }

    public final void setSheetClosesOnTouchOutside(boolean z) {
        this.sheetClosesOnTouchOutside = z;
    }

    public final float getSheetElevation() {
        return this.sheetElevation;
    }

    public final void setSheetElevation(float f) {
        this.sheetElevation = f;
    }

    public final boolean getSheetShouldOverflowTopInset() {
        return this.sheetShouldOverflowTopInset;
    }

    public final void setSheetShouldOverflowTopInset(boolean z) {
        this.sheetShouldOverflowTopInset = z;
    }

    public final boolean getSheetDefaultResizeAnimationEnabled() {
        return this.sheetDefaultResizeAnimationEnabled;
    }

    public final void setSheetDefaultResizeAnimationEnabled(boolean z) {
        this.sheetDefaultResizeAnimationEnabled = z;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.shouldTriggerPostponedTransitionAfterLayout;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z) {
        this.shouldTriggerPostponedTransitionAfterLayout = z;
    }

    public final ScreenFooter getFooter() {
        return this.footer;
    }

    public final void setFooter(ScreenFooter screenFooter) {
        BottomSheetBehavior<Screen> sheetBehavior;
        if (screenFooter == null && this.footer != null) {
            BottomSheetBehavior<Screen> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                ScreenFooter screenFooter2 = this.footer;
                Intrinsics.checkNotNull(screenFooter2);
                screenFooter2.unregisterWithSheetBehavior(sheetBehavior2);
            }
        } else if (screenFooter != null && (sheetBehavior = getSheetBehavior()) != null) {
            screenFooter.registerWithSheetBehavior(sheetBehavior);
        }
        this.footer = screenFooter;
    }

    private final boolean isNativeStackScreen() {
        return this.container instanceof ScreenStack;
    }

    @Override // com.swmansion.rnscreens.gamma.common.FragmentProviding
    public Fragment getAssociatedFragment() {
        return getFragment();
    }

    @Override // com.swmansion.rnscreens.ScreenContentWrapper.OnLayoutCallback
    public void onContentWrapperLayout(boolean changed, int left, int top, int right, int bottom) {
        int i = bottom - top;
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (SheetUtilsKt.usesFormSheetPresentation(this) && SheetUtilsKt.isSheetFitToContents(this) && sheetBehavior != null) {
            int maxHeight = sheetBehavior.getMaxHeight();
            boolean z = maxHeight == 0;
            if (maxHeight != i) {
                if (z) {
                    setupInitialSheetContentHeight(sheetBehavior, i);
                } else if (this.sheetDefaultResizeAnimationEnabled) {
                    updateSheetContentHeightWithAnimation(sheetBehavior, maxHeight, i);
                } else {
                    updateSheetContentHeightWithoutAnimation(sheetBehavior, i);
                }
            }
        }
    }

    private final void updateSheetContentHeightWithAnimation(final BottomSheetBehavior<Screen> behavior, int oldHeight, final int newHeight) {
        float f = newHeight - oldHeight;
        if (f > 0.0f) {
            setTranslationY(f);
            animate().translationY(0.0f).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.Screen$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Screen.updateSheetContentHeightWithAnimation$lambda$2(BottomSheetBehavior.this, newHeight, this);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.Screen$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Screen.updateSheetContentHeightWithAnimation$lambda$3(Screen.this);
                }
            }).start();
        } else {
            animate().translationY(-f).withStartAction(new Runnable() { // from class: com.swmansion.rnscreens.Screen$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    Screen.updateSheetContentHeightWithAnimation$lambda$4(BottomSheetBehavior.this, newHeight);
                }
            }).withEndAction(new Runnable() { // from class: com.swmansion.rnscreens.Screen$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    Screen.updateSheetContentHeightWithAnimation$lambda$5(Screen.this, newHeight);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSheetContentHeightWithAnimation$lambda$2(BottomSheetBehavior bottomSheetBehavior, int i, Screen screen) {
        BottomSheetBehaviorExtKt.updateMetrics$default(bottomSheetBehavior, Integer.valueOf(i), null, 2, null);
        screen.layout(screen.getLeft(), screen.getBottom() - i, screen.getRight(), screen.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSheetContentHeightWithAnimation$lambda$3(Screen screen) {
        screen.getParent().requestLayout();
        screen.onSheetYTranslationChanged$react_native_screens_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSheetContentHeightWithAnimation$lambda$4(BottomSheetBehavior bottomSheetBehavior, int i) {
        BottomSheetBehaviorExtKt.updateMetrics$default(bottomSheetBehavior, Integer.valueOf(i), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSheetContentHeightWithAnimation$lambda$5(Screen screen, int i) {
        screen.layout(screen.getLeft(), screen.getBottom() - i, screen.getRight(), screen.getBottom());
        screen.setTranslationY(0.0f);
        screen.getParent().requestLayout();
        screen.onSheetYTranslationChanged$react_native_screens_release();
    }

    private final void updateSheetContentHeightWithoutAnimation(BottomSheetBehavior<Screen> behavior, int height) {
        BottomSheetBehaviorExtKt.updateMetrics$default(behavior, Integer.valueOf(height), null, 2, null);
        layout(getLeft(), getBottom() - height, getRight(), getBottom());
        getParent().requestLayout();
        updateScreenSizeFabric(getWidth(), height, getTop() + ((int) getTranslationY()));
    }

    private final void setupInitialSheetContentHeight(BottomSheetBehavior<Screen> behavior, int height) {
        BottomSheetBehaviorExtKt.useSingleDetent$default(behavior, Integer.valueOf(height), false, 2, null);
        requestLayout();
    }

    public final void registerLayoutCallbackForWrapper(ScreenContentWrapper wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        ScreenStackHeaderConfig headerConfig;
        ScreenStackHeaderConfig headerConfig2;
        Window window;
        if (changed && isNativeStackScreen() && !SheetUtilsKt.usesFormSheetPresentation(this)) {
            int i = r - l;
            int i2 = b - t;
            if (!this.insetsApplied && (headerConfig = getHeaderConfig()) != null && !headerConfig.getIsHeaderHidden() && (headerConfig2 = getHeaderConfig()) != null && !headerConfig2.getIsHeaderTranslucent()) {
                Activity currentActivity = this.reactContext.getCurrentActivity();
                View decorView = (currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView();
                if (decorView == null) {
                    throw new IllegalArgumentException("[RNScreens] DecorView is required for applying inset correction, but was null.".toString());
                }
                int decorViewTopInset = DecorViewInsetsUtilsKt.getDecorViewTopInset(decorView);
                dispatchShadowStateUpdate(i, i2 - decorViewTopInset, t + decorViewTopInset);
                return;
            }
            dispatchShadowStateUpdate(i, i2, t);
        }
    }

    public final void onBottomSheetBehaviorDidLayout$react_native_screens_release(boolean coordinatorLayoutDidChange) {
        if (SheetUtilsKt.usesFormSheetPresentation(this) && isNativeStackScreen()) {
            if (SheetUtilsKt.isSheetFitToContents(this)) {
                requestLayout();
            }
            if (coordinatorLayoutDidChange) {
                dispatchShadowStateUpdate(getWidth(), getHeight(), getTop());
            }
            ScreenFooter screenFooter = this.footer;
            if (screenFooter != null) {
                int left = getLeft();
                int top = getTop();
                int right = getRight();
                int bottom = getBottom();
                ScreenContainer screenContainer = this.container;
                Intrinsics.checkNotNull(screenContainer);
                screenFooter.onParentLayout(coordinatorLayoutDidChange, left, top, right, bottom, screenContainer.getHeight());
            }
        }
    }

    public final void requestTriggeringPostponedEnterTransition$react_native_screens_release() {
        if (this.sheetShouldOverflowTopInset) {
            return;
        }
        this.shouldTriggerPostponedTransitionAfterLayout = true;
    }

    public final void triggerPostponedEnterTransitionIfNeeded$react_native_screens_release() {
        if (this.shouldTriggerPostponedTransitionAfterLayout) {
            this.shouldTriggerPostponedTransitionAfterLayout = false;
            Fragment fragment = getFragment();
            if (fragment != null) {
                fragment.startPostponedEnterTransition();
            }
        }
    }

    private final void updateScreenSizePaper(final int width, final int height) {
        ThemedReactContext themedReactContext = this.reactContext;
        final JSExceptionHandler exceptionHandler = themedReactContext.getExceptionHandler();
        themedReactContext.runOnNativeModulesQueueThread(new GuardedRunnable(width, height, exceptionHandler) { // from class: com.swmansion.rnscreens.Screen$updateScreenSizePaper$1
            final /* synthetic */ int $height;
            final /* synthetic */ int $width;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(exceptionHandler);
                Intrinsics.checkNotNull(exceptionHandler);
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) Screen.this.getReactContext().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(Screen.this.getId(), this.$width, this.$height);
                }
            }
        });
    }

    private final void dispatchShadowStateUpdate(int width, int height, int offsetY) {
        updateScreenSizeFabric(width, height, offsetY);
    }

    public final ScreenStackHeaderConfig getHeaderConfig() {
        View view;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            view = it.next();
            if (view instanceof ScreenStackHeaderConfig) {
                break;
            }
        }
        if (view instanceof ScreenStackHeaderConfig) {
            return (ScreenStackHeaderConfig) view;
        }
        return null;
    }

    public final ScreenContentWrapper getContentWrapper() {
        View view;
        Iterator<View> it = ViewGroupKt.getChildren(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            view = it.next();
            if (view instanceof ScreenContentWrapper) {
                break;
            }
        }
        if (view instanceof ScreenContentWrapper) {
            return (ScreenContentWrapper) view;
        }
        return null;
    }

    public final void setTransitioning(boolean transitioning) {
        if (this.isTransitioning == transitioning) {
            return;
        }
        this.isTransitioning = transitioning;
        boolean hasWebView = hasWebView(this);
        if (!hasWebView || getLayerType() == 2) {
            super.setLayerType((!transitioning || hasWebView) ? 0 : 2, null);
        }
    }

    public final boolean isTranslucent() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.stackPresentation.ordinal()];
        return i == 1 || i == 2;
    }

    private final boolean hasWebView(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && hasWebView((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public final void setActivityState(ActivityState activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        ActivityState activityState2 = this.activityState;
        if (activityState == activityState2) {
            return;
        }
        if ((this.container instanceof ScreenStack) && activityState2 != null) {
            Intrinsics.checkNotNull(activityState2);
            if (activityState.compareTo(activityState2) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.activityState = activityState;
        ScreenContainer screenContainer = this.container;
        if (screenContainer != null) {
            screenContainer.onChildUpdate();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setScreenOrientation(String screenOrientation) {
        int i;
        if (screenOrientation == null) {
            this.screenOrientation = null;
            return;
        }
        ScreenWindowTraits.INSTANCE.applyDidSetOrientation$react_native_screens_release();
        switch (screenOrientation.hashCode()) {
            case -1894896954:
                if (screenOrientation.equals("portrait_down")) {
                    i = 9;
                    break;
                }
                i = -1;
                break;
            case 96673:
                if (screenOrientation.equals("all")) {
                    i = 10;
                    break;
                }
                i = -1;
                break;
            case 729267099:
                if (screenOrientation.equals("portrait")) {
                    i = 7;
                    break;
                }
                i = -1;
                break;
            case 1430647483:
                if (screenOrientation.equals("landscape")) {
                    i = 6;
                    break;
                }
                i = -1;
                break;
            case 1651658175:
                if (screenOrientation.equals("portrait_up")) {
                    i = 1;
                    break;
                }
                i = -1;
                break;
            case 1730732811:
                if (screenOrientation.equals("landscape_left")) {
                    i = 8;
                    break;
                }
                i = -1;
                break;
            case 2118770584:
                if (screenOrientation.equals("landscape_right")) {
                    i = 0;
                    break;
                }
                i = -1;
                break;
            default:
                i = -1;
                break;
        }
        this.screenOrientation = Integer.valueOf(i);
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setOrientation$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void changeAccessibilityMode(int mode) {
        CustomToolbar toolbar;
        setImportantForAccessibility(mode);
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig == null || (toolbar = headerConfig.getToolbar()) == null) {
            return;
        }
        toolbar.setImportantForAccessibility(mode);
    }

    public final String getStatusBarStyle() {
        return this.statusBarStyle;
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.statusBarStyle = str;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setStyle$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    /* renamed from: isStatusBarHidden, reason: from getter */
    public final Boolean getIsStatusBarHidden() {
        return this.isStatusBarHidden;
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetStatusBarAppearance$react_native_screens_release();
        }
        this.isStatusBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setHidden$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    /* renamed from: isNavigationBarHidden, reason: from getter */
    public final Boolean getIsNavigationBarHidden() {
        return this.isNavigationBarHidden;
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            ScreenWindowTraits.INSTANCE.applyDidSetNavigationBarAppearance$react_native_screens_release();
        }
        this.isNavigationBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            ScreenWindowTraits.INSTANCE.setNavigationBarHidden$react_native_screens_release(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.nativeBackButtonDismissalEnabled;
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z) {
        this.nativeBackButtonDismissalEnabled = z;
    }

    public final void startRemovalTransition() {
        if (this.isBeingRemoved) {
            return;
        }
        this.isBeingRemoved = true;
        startTransitionRecursive(this);
    }

    public final void endRemovalTransition() {
        if (this.isBeingRemoved) {
            this.isBeingRemoved = false;
            endTransitionRecursive(this);
        }
    }

    private final void endTransitionRecursive(ViewGroup parent) {
        for (View view : ViewGroupKt.getChildren(parent)) {
            parent.endViewTransition(view);
            if (view instanceof ScreenStackHeaderConfig) {
                endTransitionRecursive(((ScreenStackHeaderConfig) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                endTransitionRecursive((ViewGroup) view);
            }
        }
    }

    private final void startTransitionRecursive(ViewGroup parent) {
        if (parent != null) {
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                if ((parent instanceof SwipeRefreshLayout) && (childAt instanceof ImageView)) {
                    parent.addView(new View(getContext()), i);
                } else if (childAt != null) {
                    parent.startViewTransition(childAt);
                }
                if (childAt instanceof ScreenStackHeaderConfig) {
                    startTransitionRecursive(((ScreenStackHeaderConfig) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    startTransitionRecursive((ViewGroup) childAt);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (SheetUtilsKt.usesFormSheetPresentation(this)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void notifyHeaderHeightChange$react_native_screens_release(int headerHeight) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new HeaderHeightChangeEvent(surfaceId, getId(), PixelUtil.toDIPFromPixel(headerHeight)));
        }
    }

    public final void onSheetDetentChanged$react_native_screens_release(int detentIndex, boolean isStable) {
        dispatchSheetDetentChanged(detentIndex, isStable);
        if (isStable) {
            onSheetYTranslationChanged$react_native_screens_release();
        }
    }

    public final void onSheetYTranslationChanged$react_native_screens_release() {
        updateScreenSizeFabric(getWidth(), getHeight(), getTop() + ((int) getTranslationY()));
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        this.insetsApplied = true;
        return super.onApplyWindowInsets(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Fragment fragment;
        ScreenStackFragment asScreenStackFragment;
        SheetDelegate sheetDelegate;
        super.onAttachedToWindow();
        if (!SheetUtilsKt.usesFormSheetPresentation(this) || (fragment = getFragment()) == null || (asScreenStackFragment = FragmentExtKt.asScreenStackFragment(fragment)) == null || (sheetDelegate = asScreenStackFragment.getSheetDelegate()) == null) {
            return;
        }
        InsetsObserverProxy.INSTANCE.addOnApplyWindowInsetsListener(sheetDelegate);
    }

    private final void dispatchSheetDetentChanged(int detentIndex, boolean isStable) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.reactContext);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new SheetDetentChangedEvent(surfaceId, getId(), detentIndex, isStable));
        }
    }

    public final void onFinalizePropsUpdate$react_native_screens_release() {
        if (this.shouldUpdateSheetCornerRadius) {
            this.shouldUpdateSheetCornerRadius = false;
            onSheetCornerRadiusChange$react_native_screens_release();
        }
    }

    public final void onSheetCornerRadiusChange$react_native_screens_release() {
        if (this.stackPresentation != StackPresentation.FORM_SHEET || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        MaterialShapeDrawable materialShapeDrawable = background instanceof MaterialShapeDrawable ? (MaterialShapeDrawable) background : null;
        if (materialShapeDrawable != null) {
            float max = Math.max(PixelUtil.toDIPFromPixel(this.sheetCornerRadius), 0.0f);
            ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
            builder.setTopLeftCorner(0, max);
            builder.setTopRightCorner(0, max);
            materialShapeDrawable.setShapeAppearanceModel(builder.build());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/rnscreens/Screen$StackPresentation;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "MODAL", "TRANSPARENT_MODAL", "FORM_SHEET", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StackPresentation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StackPresentation[] $VALUES;
        public static final StackPresentation PUSH = new StackPresentation("PUSH", 0);
        public static final StackPresentation MODAL = new StackPresentation("MODAL", 1);
        public static final StackPresentation TRANSPARENT_MODAL = new StackPresentation("TRANSPARENT_MODAL", 2);
        public static final StackPresentation FORM_SHEET = new StackPresentation("FORM_SHEET", 3);

        private static final /* synthetic */ StackPresentation[] $values() {
            return new StackPresentation[]{PUSH, MODAL, TRANSPARENT_MODAL, FORM_SHEET};
        }

        public static EnumEntries<StackPresentation> getEntries() {
            return $ENTRIES;
        }

        private StackPresentation(String str, int i) {
        }

        static {
            StackPresentation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static StackPresentation valueOf(String str) {
            return (StackPresentation) Enum.valueOf(StackPresentation.class, str);
        }

        public static StackPresentation[] values() {
            return (StackPresentation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/Screen$StackAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "NONE", "FADE", "SLIDE_FROM_BOTTOM", "SLIDE_FROM_RIGHT", "SLIDE_FROM_LEFT", "FADE_FROM_BOTTOM", "IOS_FROM_RIGHT", "IOS_FROM_LEFT", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StackAnimation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StackAnimation[] $VALUES;
        public static final StackAnimation DEFAULT = new StackAnimation("DEFAULT", 0);
        public static final StackAnimation NONE = new StackAnimation("NONE", 1);
        public static final StackAnimation FADE = new StackAnimation("FADE", 2);
        public static final StackAnimation SLIDE_FROM_BOTTOM = new StackAnimation("SLIDE_FROM_BOTTOM", 3);
        public static final StackAnimation SLIDE_FROM_RIGHT = new StackAnimation("SLIDE_FROM_RIGHT", 4);
        public static final StackAnimation SLIDE_FROM_LEFT = new StackAnimation("SLIDE_FROM_LEFT", 5);
        public static final StackAnimation FADE_FROM_BOTTOM = new StackAnimation("FADE_FROM_BOTTOM", 6);
        public static final StackAnimation IOS_FROM_RIGHT = new StackAnimation("IOS_FROM_RIGHT", 7);
        public static final StackAnimation IOS_FROM_LEFT = new StackAnimation("IOS_FROM_LEFT", 8);

        private static final /* synthetic */ StackAnimation[] $values() {
            return new StackAnimation[]{DEFAULT, NONE, FADE, SLIDE_FROM_BOTTOM, SLIDE_FROM_RIGHT, SLIDE_FROM_LEFT, FADE_FROM_BOTTOM, IOS_FROM_RIGHT, IOS_FROM_LEFT};
        }

        public static EnumEntries<StackAnimation> getEntries() {
            return $ENTRIES;
        }

        private StackAnimation(String str, int i) {
        }

        static {
            StackAnimation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static StackAnimation valueOf(String str) {
            return (StackAnimation) Enum.valueOf(StackAnimation.class, str);
        }

        public static StackAnimation[] values() {
            return (StackAnimation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/swmansion/rnscreens/Screen$ReplaceAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "PUSH", "POP", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReplaceAnimation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReplaceAnimation[] $VALUES;
        public static final ReplaceAnimation PUSH = new ReplaceAnimation("PUSH", 0);
        public static final ReplaceAnimation POP = new ReplaceAnimation("POP", 1);

        private static final /* synthetic */ ReplaceAnimation[] $values() {
            return new ReplaceAnimation[]{PUSH, POP};
        }

        public static EnumEntries<ReplaceAnimation> getEntries() {
            return $ENTRIES;
        }

        private ReplaceAnimation(String str, int i) {
        }

        static {
            ReplaceAnimation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static ReplaceAnimation valueOf(String str) {
            return (ReplaceAnimation) Enum.valueOf(ReplaceAnimation.class, str);
        }

        public static ReplaceAnimation[] values() {
            return (ReplaceAnimation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/Screen$ActivityState;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "TRANSITIONING_OR_BELOW_TOP", "ON_TOP", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivityState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActivityState[] $VALUES;
        public static final ActivityState INACTIVE = new ActivityState("INACTIVE", 0);
        public static final ActivityState TRANSITIONING_OR_BELOW_TOP = new ActivityState("TRANSITIONING_OR_BELOW_TOP", 1);
        public static final ActivityState ON_TOP = new ActivityState("ON_TOP", 2);

        private static final /* synthetic */ ActivityState[] $values() {
            return new ActivityState[]{INACTIVE, TRANSITIONING_OR_BELOW_TOP, ON_TOP};
        }

        public static EnumEntries<ActivityState> getEntries() {
            return $ENTRIES;
        }

        private ActivityState(String str, int i) {
        }

        static {
            ActivityState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static ActivityState valueOf(String str) {
            return (ActivityState) Enum.valueOf(ActivityState.class, str);
        }

        public static ActivityState[] values() {
            return (ActivityState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Screen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/Screen$WindowTraits;", "", "<init>", "(Ljava/lang/String;I)V", "ORIENTATION", "STYLE", "HIDDEN", "ANIMATED", "NAVIGATION_BAR_HIDDEN", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WindowTraits {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WindowTraits[] $VALUES;
        public static final WindowTraits ORIENTATION = new WindowTraits("ORIENTATION", 0);
        public static final WindowTraits STYLE = new WindowTraits("STYLE", 1);
        public static final WindowTraits HIDDEN = new WindowTraits("HIDDEN", 2);
        public static final WindowTraits ANIMATED = new WindowTraits("ANIMATED", 3);
        public static final WindowTraits NAVIGATION_BAR_HIDDEN = new WindowTraits("NAVIGATION_BAR_HIDDEN", 4);

        private static final /* synthetic */ WindowTraits[] $values() {
            return new WindowTraits[]{ORIENTATION, STYLE, HIDDEN, ANIMATED, NAVIGATION_BAR_HIDDEN};
        }

        public static EnumEntries<WindowTraits> getEntries() {
            return $ENTRIES;
        }

        private WindowTraits(String str, int i) {
        }

        static {
            WindowTraits[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static WindowTraits valueOf(String str) {
            return (WindowTraits) Enum.valueOf(WindowTraits.class, str);
        }

        public static WindowTraits[] values() {
            return (WindowTraits[]) $VALUES.clone();
        }
    }
}
