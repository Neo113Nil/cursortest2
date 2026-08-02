package ru.ozon.uni.android.component.sheet;

import Cm.e;
import Hn.b;
import Ql.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.w;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.d;
import androidx.core.view.C5305a;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.UniBottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.common.ComponentExtKt;
import ru.ozon.uni.android.common.ComponentExtKt$createSheetCloseButton$1;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.databinding.SheetDialogUniBinding;
import xk0.a;
import y2.q;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0002 \u0001\b\u0017\u0018\u0000 ¤\u00012\u00020\u0001:\u0002¤\u0001B£\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\u001a\u0010!J\u0019\u0010$\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0019H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\u0019H\u0014¢\u0006\u0004\b,\u0010)J\u0017\u0010-\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010'J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J-\u00107\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b9\u0010\u001eJ\u0019\u0010;\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010\u001bJ\u000f\u0010?\u001a\u00020\u0019H\u0002¢\u0006\u0004\b?\u0010)J\u0019\u0010@\u001a\u0004\u0018\u00010/2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010AJ\u0013\u0010C\u001a\u00020B*\u00020/H\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u00020\u0019*\u00020/2\u0006\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u0004\u0018\u00010/2\u0006\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010AJ\u0013\u0010K\u001a\u00020J*\u00020/H\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010N\u001a\u00020\u0019*\u00020/2\u0006\u0010M\u001a\u00020\u0004H\u0002¢\u0006\u0004\bN\u0010GJ\u001b\u0010P\u001a\u0004\u0018\u00010/2\b\u0010O\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bP\u0010QJ\u001b\u0010S\u001a\u00020R*\u00020/2\u0006\u0010O\u001a\u00020\u000bH\u0002¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u00020\u0019*\u00020/2\u0006\u0010U\u001a\u00020\u0004H\u0002¢\u0006\u0004\bV\u0010GJ\u001b\u0010X\u001a\u00020\u0019*\u00020/2\u0006\u0010W\u001a\u00020\u0004H\u0002¢\u0006\u0004\bX\u0010GJ\u0019\u0010Y\u001a\u0004\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030.H\u0002¢\u0006\u0004\bY\u0010ZR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010[\u0012\u0004\b]\u0010)\u001a\u0004\b\\\u00103R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010^\u001a\u0004\b_\u0010`R,\u0010b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010i\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010\u001bR*\u0010\t\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010[\u001a\u0004\bn\u00103\"\u0004\bo\u0010'R*\u0010\u0011\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010[\u001a\u0004\bp\u00103\"\u0004\bq\u0010'R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010[\u001a\u0004\br\u00103\"\u0004\bs\u0010'R*\u0010\n\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010[\u001a\u0004\bt\u00103\"\u0004\bu\u0010'R*\u0010v\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010<R*\u0010{\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010w\u001a\u0004\b|\u0010y\"\u0004\b}\u0010<R.\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010h\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010w\u001a\u0004\b~\u0010y\"\u0004\b\u007f\u0010<R0\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010h\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b\r\u0010w\u001a\u0005\b\u0080\u0001\u0010y\"\u0005\b\u0081\u0001\u0010<R0\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010h\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b\u0010\u0010w\u001a\u0005\b\u0082\u0001\u0010y\"\u0005\b\u0083\u0001\u0010<R,\u0010\u0012\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b\u0012\u0010j\u001a\u0005\b\u0084\u0001\u0010l\"\u0005\b\u0085\u0001\u0010\u001bR,\u0010\u000f\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b\u000f\u0010[\u001a\u0005\b\u0086\u0001\u00103\"\u0005\b\u0087\u0001\u0010'R&\u0010\u0088\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010[\u001a\u0005\b\u0089\u0001\u00103\"\u0005\b\u008a\u0001\u0010'R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010[R\"\u0010\u0095\u0001\u001a\u000b\u0012\u0004\u0012\u00020/\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010[R\u0018\u0010\u009b\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010[R\u0016\u0010\u009c\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010jR\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010£\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b£\u0001\u0010j¨\u0006¥\u0001"}, d2 = {"Lru/ozon/uni/android/component/sheet/SheetDialog;", "Landroidx/appcompat/app/w;", "Landroid/content/Context;", "context", "", "theme", "", "adjustResize", "startState", "wrapContent", "showCloseButton", "", "navBarTitle", "navBarTitleColor", "showHandle", "scrollableContent", "backgroundColor", "allowResizeByGesture", "minimalHeight", "cancelable", "Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "softInputMode", "<init>", "(Landroid/content/Context;IZIZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZIZLru/ozon/uni/android/component/sheet/SheetSoftInputMode;)V", "layoutResId", "", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "setCancelable", "(Z)V", "onStart", "()V", "onAttachedToWindow", "cancel", "onStop", "setCanceledOnTouchOutside", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "shouldWindowCloseOnTouchOutside", "()Z", "Landroid/widget/FrameLayout;", "ensureContainerAndBehavior", "()Landroid/widget/FrameLayout;", "wrapInBottomSheet", "(ILandroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/View;", "handleAccessibilityEvents", "colorToken", "setSheetBackgroundColor", "(Ljava/lang/String;)V", "height", "setupMinHeight", "wrapSheetContent", "showOrGoneTongue", "(Z)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/component/sheet/SheetTongueView;", "addTongueView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)Lru/ozon/uni/android/component/sheet/SheetTongueView;", "id", "updateTongueConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;I)V", "show", "showOrGoneButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "addCloseButton", "(Landroidx/constraintlayout/widget/ConstraintLayout;)Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "buttonId", "updateButtonConstraints", "headerText", "showOrGoneHeader", "(Ljava/lang/String;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "addHeader", "(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "headerId", "updateHeaderConstraints", "viewId", "updateContentConstraints", "setPeekHeight", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)Lkotlin/Unit;", "Z", "getAdjustResize", "getAdjustResize$annotations", "Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "getSoftInputMode", "()Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "Lkotlin/Function0;", "onDismiss", "Lkotlin/jvm/functions/Function0;", "getOnDismiss", "()Lkotlin/jvm/functions/Function0;", "setOnDismiss", "(Lkotlin/jvm/functions/Function0;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "sheetState", "I", "getSheetState", "()I", "setSheetState", "getWrapContent", "setWrapContent", "getAllowResizeByGesture", "setAllowResizeByGesture", "getShowHandle", "setShowHandle", "getShowCloseButton", "setShowCloseButton", "closeButtonBgColor", "Ljava/lang/String;", "getCloseButtonBgColor", "()Ljava/lang/String;", "setCloseButtonBgColor", "closeButtonIconColor", "getCloseButtonIconColor", "setCloseButtonIconColor", "getNavBarTitle", "setNavBarTitle", "getNavBarTitleColor", "setNavBarTitleColor", "getBackgroundColor", "setBackgroundColor", "getMinimalHeight", "setMinimalHeight", "getScrollableContent", "setScrollableContent", "dismissWithAnimation", "getDismissWithAnimation", "setDismissWithAnimation", "closeButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "headerTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "wrappedView", "Landroid/view/View;", "tongueView", "Lru/ozon/uni/android/component/sheet/SheetTongueView;", "mCancelable", "Lcom/google/android/material/bottomsheet/UniBottomSheetBehavior;", "behavior", "Lcom/google/android/material/bottomsheet/UniBottomSheetBehavior;", "Lru/ozon/uni/databinding/SheetDialogUniBinding;", "binding", "Lru/ozon/uni/databinding/SheetDialogUniBinding;", "canceledOnTouchOutside", "canceledOnTouchOutsideSet", "defBgColor", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "bottomSheetCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "ru/ozon/uni/android/component/sheet/SheetDialog$cornersOutline$1", "cornersOutline", "Lru/ozon/uni/android/component/sheet/SheetDialog$cornersOutline$1;", "contentMargin", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SheetDialog extends w {
    private final boolean adjustResize;
    private boolean allowResizeByGesture;
    private String backgroundColor;
    private UniBottomSheetBehavior<ConstraintLayout> behavior;
    private SheetDialogUniBinding binding;

    @NotNull
    private final BottomSheetBehavior.f bottomSheetCallback;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;

    @NotNull
    private String closeButtonBgColor;

    @NotNull
    private String closeButtonIconColor;
    private IconButtonV3View closeButtonView;
    private final int contentMargin;

    @NotNull
    private final SheetDialog$cornersOutline$1 cornersOutline;
    private final int defBgColor;
    private boolean dismissWithAnimation;
    private TextAtomV2View headerTextView;
    private boolean mCancelable;
    private int minimalHeight;
    private String navBarTitle;
    private String navBarTitleColor;
    private Function0<Unit> onDismiss;
    private boolean scrollableContent;
    private int sheetState;
    private boolean showCloseButton;
    private boolean showHandle;

    @NotNull
    private final SheetSoftInputMode softInputMode;
    private SheetTongueView tongueView;
    private boolean wrapContent;
    private View wrappedView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/component/sheet/SheetDialog$Companion;", "", "<init>", "()V", "getThemeResId", "", "themeId", "softInputMode", "Lru/ozon/uni/android/component/sheet/SheetSoftInputMode;", "SHEET_MIN_HEIGHT_DEFAULT", "WINDOW_DECOR_FLAGS", "BUTTON_MARGIN_WITH_HEADER", "CONTENT_MARGIN", "SHEET_CORNER_RADIUS", "TEXT_MARGIN_END", "TEXT_MARGIN_START", "TONGUE_MARGIN_TOP", "TONGUE_MARGIN_BOTTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getThemeResId(int themeId, SheetSoftInputMode softInputMode) {
            return themeId != 0 ? themeId : softInputMode == SheetSoftInputMode.ADJUST_RESIZE ? R$style.SheetDialog_AdjustResize : softInputMode == SheetSoftInputMode.ADJUST_PAN ? R$style.SheetDialog_AdjustPan : R$style.SheetDialog;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SheetDialog(Context context, int i11, boolean z11, int i12, boolean z12, boolean z13, String str, String str2, boolean z14, boolean z15, String str3, boolean z16, int i13, boolean z17, SheetSoftInputMode sheetSoftInputMode, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r1, r3, r4, r5, r6, r7, r9, r10, r11, r8, r2, r12, r13, r31);
        SheetSoftInputMode sheetSoftInputMode2;
        int i15 = (i14 & 2) != 0 ? 0 : i11;
        boolean z18 = (i14 & 4) != 0 ? false : z11;
        int i16 = (i14 & 8) != 0 ? 3 : i12;
        boolean z19 = (i14 & 16) != 0 ? false : z12;
        boolean z21 = (i14 & 32) != 0 ? false : z13;
        String str4 = (i14 & 64) != 0 ? null : str;
        String str5 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str2;
        boolean z22 = (i14 & 256) != 0 ? false : z14;
        boolean z23 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z15;
        String str6 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? str3 : null;
        boolean z24 = (i14 & 2048) == 0 ? z16 : false;
        int i17 = (i14 & 4096) != 0 ? 98 : i13;
        boolean z25 = (i14 & 8192) != 0 ? true : z17;
        if ((i14 & 16384) != 0) {
            sheetSoftInputMode2 = z18 ? SheetSoftInputMode.ADJUST_RESIZE : SheetSoftInputMode.UNSPECIFIED;
        } else {
            sheetSoftInputMode2 = sheetSoftInputMode;
        }
    }

    private final IconButtonV3View addCloseButton(ConstraintLayout constraintLayout) {
        IconButtonV3View createSheetCloseButton;
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        createSheetCloseButton = ComponentExtKt.createSheetCloseButton(context, (r23 & 2) != 0 ? R$id.sheetDialogCloseButton : 0, (r23 & 4) != 0 ? new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, "graphicSecondary", "bgOverlap", null, null, null, null, null, null, null, 16272, null) : null, (r23 & 8) != 0 ? ComponentExtKt$createSheetCloseButton$1.INSTANCE : new SheetDialog$addCloseButton$1(this));
        this.closeButtonView = createSheetCloseButton;
        constraintLayout.addView(createSheetCloseButton, -2, -2);
        return createSheetCloseButton;
    }

    private final TextAtomV2View addHeader(ConstraintLayout constraintLayout, String str) {
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View createSheetHeader$default = ComponentExtKt.createSheetHeader$default(context, 0, str, this.navBarTitleColor, 2, null);
        constraintLayout.addView(createSheetHeader$default, 0, -2);
        this.headerTextView = createSheetHeader$default;
        return createSheetHeader$default;
    }

    private final SheetTongueView addTongueView(ConstraintLayout constraintLayout) {
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SheetTongueView sheetTongueView = new SheetTongueView(context);
        this.tongueView = sheetTongueView;
        constraintLayout.addView(sheetTongueView);
        return sheetTongueView;
    }

    private final FrameLayout ensureContainerAndBehavior() {
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding == null) {
            sheetDialogUniBinding = SheetDialogUniBinding.inflate(LayoutInflater.from(getContext()));
            this.binding = sheetDialogUniBinding;
            Intrinsics.checkNotNullExpressionValue(sheetDialogUniBinding, "apply(...)");
        }
        ConstraintLayout view = sheetDialogUniBinding.designBottomSheet;
        if (!this.wrapContent) {
            view.getLayoutParams().height = -1;
        }
        setupMinHeight(this.minimalHeight);
        view.setOutlineProvider(this.cornersOutline);
        view.setClipToOutline(true);
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar == null) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c c11 = fVar.c();
        UniBottomSheetBehavior<ConstraintLayout> uniBottomSheetBehavior = c11 instanceof UniBottomSheetBehavior ? (UniBottomSheetBehavior) c11 : null;
        if (uniBottomSheetBehavior == null) {
            throw new IllegalArgumentException("The view is not associated with DsBottomSheetBehavior");
        }
        uniBottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        uniBottomSheetBehavior.setHideable(this.mCancelable);
        uniBottomSheetBehavior.setFitToContents(this.wrapContent);
        this.behavior = uniBottomSheetBehavior;
        FrameLayout container = sheetDialogUniBinding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        return container;
    }

    private final void handleAccessibilityEvents(View view) {
        Y.C(view, new C5305a() { // from class: ru.ozon.uni.android.component.sheet.SheetDialog$handleAccessibilityEvents$1
            @Override // androidx.core.view.C5305a
            public void onInitializeAccessibilityNodeInfo(View host, q info) {
                boolean z11;
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                z11 = SheetDialog.this.mCancelable;
                if (!z11) {
                    info.Q(false);
                } else {
                    info.a(1048576);
                    info.Q(true);
                }
            }

            @Override // androidx.core.view.C5305a
            public boolean performAccessibilityAction(View host, int action, Bundle args) {
                boolean z11;
                Intrinsics.checkNotNullParameter(host, "host");
                if (action == 1048576) {
                    z11 = SheetDialog.this.mCancelable;
                    if (z11) {
                        SheetDialog.this.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(host, action, args);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 onAttachedToWindow$lambda$4$lambda$3(SheetDialog sheetDialog, final View view, C5353y0 c5353y0) {
        final d a11 = c.a(view, "view", c5353y0, "windowInsets", 7);
        Intrinsics.checkNotNullExpressionValue(a11, "getInsets(...)");
        final int i11 = sheetDialog.softInputMode == SheetSoftInputMode.ADJUST_RESIZE ? c5353y0.f(8).f42129d : 0;
        final int i12 = sheetDialog.scrollableContent ? 0 : a11.f42129d;
        view.post(new Runnable() { // from class: xk0.c
            @Override // java.lang.Runnable
            public final void run() {
                SheetDialog.onAttachedToWindow$lambda$4$lambda$3$lambda$2(view, i12, i11, a11);
            }
        });
        return Y.u(view, c5353y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$4$lambda$3$lambda$2(View view, int i11, int i12, d dVar) {
        Intrinsics.f(view);
        if (i11 < i12) {
            i11 = i12;
        }
        view.setPadding(view.getPaddingLeft(), dVar.f42127b, view.getPaddingRight(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setPeekHeight(final BottomSheetBehavior<?> bottomSheetBehavior) {
        View view;
        if (this.allowResizeByGesture) {
            view = this.wrappedView;
        } else {
            SheetDialogUniBinding sheetDialogUniBinding = this.binding;
            view = sheetDialogUniBinding != null ? sheetDialogUniBinding.designBottomSheet : null;
        }
        if (view == null) {
            return null;
        }
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.uni.android.component.sheet.SheetDialog$setPeekHeight$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    Integer valueOf = Integer.valueOf(view2.getHeight());
                    if (valueOf.intValue() <= BottomSheetBehavior.this.getPeekHeight()) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        BottomSheetBehavior.this.setPeekHeight(valueOf.intValue(), false);
                    }
                }
            });
        } else {
            Integer valueOf = Integer.valueOf(view.getHeight());
            Integer num = valueOf.intValue() > bottomSheetBehavior.getPeekHeight() ? valueOf : null;
            if (num != null) {
                bottomSheetBehavior.setPeekHeight(num.intValue(), false);
            }
        }
        return Unit.f71690a;
    }

    private final void setSheetBackgroundColor(String colorToken) {
        ConstraintLayout constraintLayout;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, colorToken, R$color.layer_floor_1);
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding != null && (constraintLayout = sheetDialogUniBinding.designBottomSheet) != null) {
            constraintLayout.setBackgroundColor(parseColor);
        }
        Window window = getWindow();
        if (window != null) {
            window.setNavigationBarColor(parseColor);
        }
    }

    private final void setupMinHeight(int height) {
        SheetDialogUniBinding sheetDialogUniBinding;
        ConstraintLayout constraintLayout;
        if (!this.wrapContent || (sheetDialogUniBinding = this.binding) == null || (constraintLayout = sheetDialogUniBinding.designBottomSheet) == null) {
            return;
        }
        int px = UiExtKt.toPx(height);
        View view = this.wrappedView;
        int height2 = view != null ? view.getHeight() : 0;
        if (px < height2) {
            px = height2;
        }
        constraintLayout.setMinHeight(px);
    }

    private final ConstraintLayout showOrGoneButton(boolean show) {
        ConstraintLayout constraintLayout;
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding == null || (constraintLayout = sheetDialogUniBinding.designBottomSheet) == null) {
            return null;
        }
        if (!show) {
            IconButtonV3View iconButtonV3View = this.closeButtonView;
            if (iconButtonV3View != null) {
                ViewExtKt.gone(iconButtonV3View);
            }
            return constraintLayout;
        }
        IconButtonV3View iconButtonV3View2 = this.closeButtonView;
        if (iconButtonV3View2 == null) {
            iconButtonV3View2 = addCloseButton(constraintLayout);
        }
        ViewExtKt.show(iconButtonV3View2);
        updateButtonConstraints(constraintLayout, iconButtonV3View2.getId());
        return constraintLayout;
    }

    private final ConstraintLayout showOrGoneHeader(String headerText) {
        ConstraintLayout constraintLayout;
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding == null || (constraintLayout = sheetDialogUniBinding.designBottomSheet) == null) {
            return null;
        }
        if (headerText == null || headerText.length() == 0) {
            TextAtomV2View textAtomV2View = this.headerTextView;
            if (textAtomV2View != null) {
                ViewExtKt.gone(textAtomV2View);
            }
        } else {
            TextAtomV2View textAtomV2View2 = this.headerTextView;
            if (textAtomV2View2 == null) {
                textAtomV2View2 = addHeader(constraintLayout, headerText);
            }
            TextAtomV2View.setUnellipsizedText$default(textAtomV2View2, headerText, null, 2, null);
            ViewExtKt.show(textAtomV2View2);
            updateHeaderConstraints(constraintLayout, textAtomV2View2.getId());
        }
        View view = this.wrappedView;
        if (view != null) {
            updateContentConstraints(constraintLayout, view.getId());
        }
        return constraintLayout;
    }

    private final ConstraintLayout showOrGoneTongue(boolean showHandle) {
        ConstraintLayout constraintLayout;
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding == null || (constraintLayout = sheetDialogUniBinding.designBottomSheet) == null) {
            return null;
        }
        if (showHandle) {
            SheetTongueView sheetTongueView = this.tongueView;
            if (sheetTongueView == null) {
                sheetTongueView = addTongueView(constraintLayout);
            }
            ViewExtKt.show(sheetTongueView);
            updateTongueConstraints(constraintLayout, sheetTongueView.getId());
        } else {
            SheetTongueView sheetTongueView2 = this.tongueView;
            if (sheetTongueView2 != null) {
                ViewExtKt.gone(sheetTongueView2);
            }
        }
        View view = this.wrappedView;
        if (view != null) {
            updateContentConstraints(constraintLayout, view.getId());
        }
        return constraintLayout;
    }

    private final void updateButtonConstraints(ConstraintLayout constraintLayout, int i11) {
        int i12;
        androidx.constraintlayout.widget.d b11 = e.b(constraintLayout);
        String str = this.navBarTitle;
        if (str == null || str.length() == 0) {
            i12 = this.contentMargin;
        } else {
            int i13 = R$id.sheetDialogHeader;
            ConstraintSetExtKt.layoutConstraintEndToStartOf(b11, i13, i11);
            b11.e0(i13, 7, UiExtKt.toPx(8));
            b11.e0(i13, 6, UiExtKt.toPx(50));
            i12 = UiExtKt.toPx(10);
        }
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(b11, i11);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(b11, i11);
        b11.e0(i11, 3, i12);
        b11.e0(i11, 7, i12);
        b11.f(constraintLayout);
    }

    private final void updateContentConstraints(ConstraintLayout constraintLayout, int i11) {
        androidx.constraintlayout.widget.d b11 = e.b(constraintLayout);
        String str = this.navBarTitle;
        if (str != null && str.length() != 0) {
            ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, i11, R$id.sheetDialogHeader);
        } else if (this.showHandle) {
            ConstraintSetExtKt.layoutConstraintTopToBottomOf(b11, i11, R$id.sheetDialogTongue, UiExtKt.toPx(5));
        } else {
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(b11, i11, 0);
        }
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(b11, i11);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(b11, i11);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(b11, i11, 0);
        if (this.wrapContent) {
            b11.B(i11);
        }
        b11.f0(0.0f, i11);
        b11.f(constraintLayout);
    }

    private final void updateHeaderConstraints(ConstraintLayout constraintLayout, int i11) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, i11);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, i11);
        if (this.showCloseButton) {
            int px = UiExtKt.toPx(10);
            ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, i11, R$id.sheetDialogCloseButton);
            dVar.e0(R$id.sheetDialogCloseButton, 3, px);
            dVar.e0(R$id.sheetDialogCloseButton, 7, px);
        } else {
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, i11);
        }
        int px2 = this.showCloseButton ? UiExtKt.toPx(8) : 0;
        int px3 = this.showCloseButton ? UiExtKt.toPx(50) : 0;
        dVar.e0(i11, 7, px2);
        dVar.e0(i11, 6, px3);
        dVar.f(constraintLayout);
    }

    private final void updateTongueConstraints(ConstraintLayout constraintLayout, int i11) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, i11);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, i11);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, i11);
        dVar.e0(i11, 3, UiExtKt.toPx(12));
        dVar.f(constraintLayout);
    }

    private final View wrapInBottomSheet(int layoutResId, View view, ViewGroup.LayoutParams params) {
        View view2;
        ConstraintLayout constraintLayout;
        ensureContainerAndBehavior();
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding != null && (constraintLayout = sheetDialogUniBinding.designBottomSheet) != null) {
            setSheetBackgroundColor(this.backgroundColor);
            showOrGoneTongue(this.showHandle);
            showOrGoneHeader(this.navBarTitle);
            constraintLayout.setPadding(0, 0, 0, !this.wrapContent ? this.contentMargin : 0);
            if (layoutResId != 0 && view == null) {
                LayoutInflater layoutInflater = getLayoutInflater();
                SheetDialogUniBinding sheetDialogUniBinding2 = this.binding;
                view = layoutInflater.inflate(layoutResId, sheetDialogUniBinding2 != null ? sheetDialogUniBinding2.designBottomSheet : null, false);
            }
            this.wrappedView = view;
            if (view != null) {
                int i11 = this.wrapContent ? -2 : 0;
                if (params == null) {
                    params = new ConstraintLayout.b(-1, i11);
                }
                constraintLayout.addView(view, params);
                updateContentConstraints(constraintLayout, view.getId());
            }
            showOrGoneButton(this.showCloseButton);
            handleAccessibilityEvents(constraintLayout);
            constraintLayout.setOnTouchListener(new a());
        }
        SheetDialogUniBinding sheetDialogUniBinding3 = this.binding;
        if (sheetDialogUniBinding3 != null && (view2 = sheetDialogUniBinding3.touchOutside) != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: xk0.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SheetDialog.wrapInBottomSheet$lambda$13(SheetDialog.this, view3);
                }
            });
        }
        SheetDialogUniBinding sheetDialogUniBinding4 = this.binding;
        if (sheetDialogUniBinding4 != null) {
            return sheetDialogUniBinding4.container;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wrapInBottomSheet$lambda$12$lambda$11(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wrapInBottomSheet$lambda$13(SheetDialog sheetDialog, View view) {
        if (sheetDialog.mCancelable && sheetDialog.isShowing() && sheetDialog.shouldWindowCloseOnTouchOutside()) {
            sheetDialog.cancel();
        }
    }

    private final void wrapSheetContent() {
        ConstraintLayout constraintLayout;
        UniBottomSheetBehavior<ConstraintLayout> uniBottomSheetBehavior = this.behavior;
        if (uniBottomSheetBehavior != null) {
            uniBottomSheetBehavior.setFitToContents(this.wrapContent);
            if (this.wrapContent && this.allowResizeByGesture) {
                uniBottomSheetBehavior.setState(4);
            }
        }
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding == null || (constraintLayout = sheetDialogUniBinding.designBottomSheet) == null) {
            return;
        }
        constraintLayout.post(new L2.c(6, constraintLayout, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wrapSheetContent$lambda$18$lambda$17(ConstraintLayout constraintLayout, SheetDialog sheetDialog) {
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = (!sheetDialog.wrapContent || sheetDialog.allowResizeByGesture) ? -1 : -2;
        constraintLayout.setLayoutParams(layoutParams);
        constraintLayout.setPadding(0, 0, 0, !sheetDialog.wrapContent ? sheetDialog.contentMargin : 0);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<ConstraintLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @NotNull
    public final BottomSheetBehavior<ConstraintLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        UniBottomSheetBehavior<ConstraintLayout> uniBottomSheetBehavior = this.behavior;
        Intrinsics.f(uniBottomSheetBehavior);
        return uniBottomSheetBehavior;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        FrameLayout frameLayout;
        SheetDialogUniBinding sheetDialogUniBinding = this.binding;
        if (sheetDialogUniBinding == null || (frameLayout = sheetDialogUniBinding.container) == null) {
            return;
        }
        Y.J(frameLayout, new b(this));
        frameLayout.requestApplyInsets();
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.s, android.app.Dialog
    protected void onStart() {
        super.onStart();
        UniBottomSheetBehavior<ConstraintLayout> uniBottomSheetBehavior = this.behavior;
        if (uniBottomSheetBehavior != null) {
            uniBottomSheetBehavior.setState(this.sheetState);
        }
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    protected void onStop() {
        this.binding = null;
        this.headerTextView = null;
        this.wrappedView = null;
        this.closeButtonView = null;
        this.tongueView = null;
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
        super.onStop();
    }

    public final void setAllowResizeByGesture(boolean z11) {
        this.allowResizeByGesture = z11;
        wrapSheetContent();
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
        setSheetBackgroundColor(str);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
        if (this.mCancelable != cancelable) {
            this.mCancelable = cancelable;
            UniBottomSheetBehavior<ConstraintLayout> uniBottomSheetBehavior = this.behavior;
            if (uniBottomSheetBehavior != null) {
                uniBottomSheetBehavior.setHideable(cancelable);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean cancel) {
        super.setCanceledOnTouchOutside(cancel);
        if (cancel && !this.mCancelable) {
            this.mCancelable = true;
        }
        this.canceledOnTouchOutside = cancel;
        this.canceledOnTouchOutsideSet = true;
    }

    public final void setCloseButtonBgColor(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.closeButtonBgColor = value;
        IconButtonV3View iconButtonV3View = this.closeButtonView;
        if (iconButtonV3View != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iconButtonV3View.setBackColor(new Color.Solid(styleParser.parseColor(context, this.closeButtonBgColor, UniColors.BG_OVERLAP.getResId())));
        }
    }

    public final void setCloseButtonIconColor(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.closeButtonIconColor = value;
        IconButtonV3View iconButtonV3View = this.closeButtonView;
        if (iconButtonV3View != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iconButtonV3View.setIconColor(styleParser.parseColor(context, this.closeButtonIconColor, UniColors.GRAPHIC_SECONDARY.getResId()));
        }
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public void setContentView(int layoutResId) {
        View wrapInBottomSheet = wrapInBottomSheet(layoutResId, null, null);
        Intrinsics.f(wrapInBottomSheet);
        super.setContentView(wrapInBottomSheet);
    }

    public final void setMinimalHeight(int i11) {
        this.minimalHeight = i11;
        setupMinHeight(i11);
    }

    public final void setNavBarTitle(String str) {
        this.navBarTitle = str;
        if (str != null && str.length() != 0) {
            setShowHandle(false);
        }
        showOrGoneHeader(this.navBarTitle);
    }

    public final void setNavBarTitleColor(String str) {
        this.navBarTitleColor = str;
        TextAtomV2View textAtomV2View = this.headerTextView;
        if (textAtomV2View != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textAtomV2View.setTextColor(styleParser.parseColor(context, this.navBarTitleColor, UniColors.TEXT_PRIMARY.getResId()));
        }
    }

    public final void setOnDismiss(Function0<Unit> function0) {
        this.onDismiss = function0;
    }

    public final void setScrollableContent(boolean z11) {
        UniBottomSheetBehavior<ConstraintLayout> uniBottomSheetBehavior;
        int parseColorInt;
        this.scrollableContent = z11;
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(this.scrollableContent ? UserVerificationMethods.USER_VERIFY_NONE : 16);
            if (this.scrollableContent) {
                parseColorInt = 0;
            } else {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = window.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                parseColorInt = styleParser.parseColorInt(context, this.backgroundColor, this.defBgColor);
            }
            window.setNavigationBarColor(parseColorInt);
        }
        if (!this.wrapContent || (uniBottomSheetBehavior = this.behavior) == null) {
            return;
        }
        setPeekHeight(uniBottomSheetBehavior);
    }

    public final void setSheetState(int i11) {
        if (this.sheetState != i11) {
            this.sheetState = i11;
            UniBottomSheetBehavior<ConstraintLayout> uniBottomSheetBehavior = this.behavior;
            if (uniBottomSheetBehavior != null) {
                uniBottomSheetBehavior.setState(i11);
            }
        }
    }

    public final void setShowCloseButton(boolean z11) {
        this.showCloseButton = z11;
        showOrGoneButton(z11);
    }

    public final void setShowHandle(boolean z11) {
        this.showHandle = z11;
        showOrGoneTongue(z11);
    }

    public final void setWrapContent(boolean z11) {
        this.wrapContent = z11;
        wrapSheetContent();
    }

    public final boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View wrapInBottomSheet = wrapInBottomSheet(0, view, null);
        Intrinsics.f(wrapInBottomSheet);
        super.setContentView(wrapInBottomSheet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [ru.ozon.uni.android.component.sheet.SheetDialog$cornersOutline$1] */
    public SheetDialog(@NotNull Context context, int i11, boolean z11, int i12, final boolean z12, boolean z13, String str, String str2, boolean z14, boolean z15, String str3, boolean z16, int i13, boolean z17, @NotNull SheetSoftInputMode softInputMode) {
        super(context, INSTANCE.getThemeResId(i11, softInputMode));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(softInputMode, "softInputMode");
        this.adjustResize = z11;
        this.softInputMode = softInputMode;
        this.sheetState = i12;
        this.wrapContent = z12;
        this.allowResizeByGesture = z16;
        this.showHandle = z14;
        this.showCloseButton = z13;
        this.closeButtonBgColor = UniColors.BG_OVERLAP.getToken();
        this.closeButtonIconColor = UniColors.GRAPHIC_SECONDARY.getToken();
        this.navBarTitle = str;
        this.navBarTitleColor = str2;
        this.backgroundColor = str3;
        this.minimalHeight = i13;
        this.scrollableContent = z15;
        this.canceledOnTouchOutside = true;
        this.defBgColor = androidx.core.content.a.getColor(context, R$color.layer_floor_1);
        this.bottomSheetCallback = new BottomSheetBehavior.f() { // from class: ru.ozon.uni.android.component.sheet.SheetDialog$bottomSheetCallback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
            
                r2 = r1.this$0.behavior;
             */
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onStateChanged(View bottomSheet, int newState) {
                UniBottomSheetBehavior uniBottomSheetBehavior;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (newState == 5) {
                    SheetDialog.this.cancel();
                }
                if (newState == 4 && z12 && uniBottomSheetBehavior != null) {
                    SheetDialog.this.setPeekHeight(uniBottomSheetBehavior);
                }
            }
        };
        this.cornersOutline = new ViewOutlineProvider() { // from class: ru.ozon.uni.android.component.sheet.SheetDialog$cornersOutline$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null) {
                    return;
                }
                float pxF = UiExtKt.toPxF(24);
                if (outline != null) {
                    outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + pxF), pxF);
                }
            }
        };
        this.contentMargin = UiExtKt.toPx(16);
        supportRequestWindowFeature(1);
        this.mCancelable = z17;
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public void setContentView(@NotNull View view, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        View wrapInBottomSheet = wrapInBottomSheet(0, view, params);
        Intrinsics.f(wrapInBottomSheet);
        super.setContentView(wrapInBottomSheet);
    }
}
