package ru.ozon.app.android.uikit.view.dialog;

import Sc.InterfaceC3999a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.w;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.a;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.uikit.view.behavior.OzonBottomSheetBehavior;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import y2.q;

@InterfaceC3999a
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 Y2\u00020\u0001:\u0001YBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u001bJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0014\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010 J\u0015\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010 J\u000f\u0010'\u001a\u00020\u0007H\u0005¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0015¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u0013*\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0013*\u00020+H\u0002¢\u0006\u0004\b.\u0010-J\u001b\u00100\u001a\u00020\u0013*\u00020+2\u0006\u0010/\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u00101J\u001b\u00100\u001a\u00020\u0013*\u0002022\u0006\u0010/\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u00103R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b<\u0010(R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b=\u0010(R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b>\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bB\u0010(R\"\u0010C\u001a\u00020\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bD\u0010(\"\u0004\bE\u0010 R(\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010F8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00107R\u0016\u0010N\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00107R\u001a\u0010P\u001a\u00020O8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR,\u0010U\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130T8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "Landroidx/appcompat/app/w;", "Landroid/content/Context;", "context", "", "theme", "startState", "", "showHandle", "Landroid/view/View;", "stickyView", "roundedCorners", "wrapContent", "modifyWindowFlags", "minHeightDp", "cancelable", "<init>", "(Landroid/content/Context;IIZLandroid/view/View;ZZZLjava/lang/Integer;Z)V", "layoutResId", "", "setContentView", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "setCancelable", "(Z)V", "onStart", "()V", "cancel", "setCanceledOnTouchOutside", "enableCurtainMovement", "setMaxOffset", "shouldWindowCloseOnTouchOutside", "()Z", "wrapInBottomSheet", "(ILandroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/View;", "Landroid/view/ViewGroup;", "addCorners", "(Landroid/view/ViewGroup;)V", "addHandler", "contentView", "addContent", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Landroid/widget/LinearLayout;", "(Landroid/widget/LinearLayout;Landroid/view/View;)V", "I", "getStartState", "()I", "Z", "getShowHandle", "Landroid/view/View;", "getStickyView", "()Landroid/view/View;", "getRoundedCorners", "getWrapContent", "getModifyWindowFlags", "Ljava/lang/Integer;", "getMinHeightDp", "()Ljava/lang/Integer;", "getCancelable", "mCancelable", "getMCancelable", "setMCancelable", "Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "mBehavior", "Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "getMBehavior", "()Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;", "setMBehavior", "(Lru/ozon/app/android/uikit/view/behavior/OzonBottomSheetBehavior;)V", "mCanceledOnTouchOutside", "mCanceledOnTouchOutsideSet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "bottomSheetCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "getBottomSheetCallback", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Lkotlin/Function2;", "attachViews", "Lkotlin/jvm/functions/Function2;", "getAttachViews", "()Lkotlin/jvm/functions/Function2;", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OzonBottomSheetDialog extends w {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function2<ViewGroup, View, Unit> attachViews;

    @NotNull
    private final BottomSheetBehavior.f bottomSheetCallback;
    private final boolean cancelable;
    private OzonBottomSheetBehavior<?> mBehavior;
    private boolean mCancelable;
    private boolean mCanceledOnTouchOutside;
    private boolean mCanceledOnTouchOutsideSet;
    private final Integer minHeightDp;
    private final boolean modifyWindowFlags;
    private final boolean roundedCorners;
    private final boolean showHandle;
    private final int startState;
    private final View stickyView;
    private final boolean wrapContent;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog$Companion;", "", "<init>", "()V", "HANDLE_HEIGHT", "", "CORNERS_VIEW_HEIGHT", "HANDLER_SHAPE_HEIGHT", "HANDLER_SHAPE_WIDTH", "HANDLER_SHAPE_MARGIN_TOP", "HANDLER_LOCATOR_ID", "", "getThemeResId", "themeId", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getThemeResId(int themeId) {
            Integer valueOf = Integer.valueOf(themeId);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            return valueOf != null ? valueOf.intValue() : R$style.OzonBottomSheetDialog;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OzonBottomSheetDialog(Context context, int i11, int i12, boolean z11, View view, boolean z12, boolean z13, boolean z14, Integer num, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 3 : i12, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? null : view, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? false : z13, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z14, (i13 & 256) != 0 ? null : num, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? true : z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addContent(ViewGroup viewGroup, View view) {
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, this.wrapContent ? -2 : -1);
        if (this.roundedCorners) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = ResourceExtKt.toPx(4, context);
        } else {
            i11 = 0;
        }
        marginLayoutParams.topMargin = i11;
        Unit unit = Unit.f71690a;
        viewGroup.addView(view, marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addCorners(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        view.setBackgroundResource(R$drawable.bg_white_top_rounded);
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewGroup.addView(view, new ViewGroup.MarginLayoutParams(-1, ResourceExtKt.toPx(4, context)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addHandler(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(4, context);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = ResourceExtKt.toPx(32, context2);
        Context context3 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px3 = ResourceExtKt.toPx(2, context3);
        Context context4 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px4 = ResourceExtKt.toPx(18, context4);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        View view = new View(frameLayout.getContext());
        view.setBackground(a.getDrawable(view.getContext(), R$drawable.bottom_sheet_handler));
        view.setContentDescription("HandlerView");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(px2, px);
        layoutParams.gravity = 17;
        layoutParams.topMargin = px3;
        Unit unit = Unit.f71690a;
        frameLayout.addView(view, layoutParams);
        frameLayout.setBackgroundColor(a.getColor(frameLayout.getContext(), R$color.oz_semantic_bg_secondary));
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, px4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wrapInBottomSheet$lambda$11$lambda$10$lambda$9$lambda$7(OzonBottomSheetDialog ozonBottomSheetDialog, View view) {
        if (ozonBottomSheetDialog.mCancelable && ozonBottomSheetDialog.isShowing() && ozonBottomSheetDialog.shouldWindowCloseOnTouchOutside()) {
            ozonBottomSheetDialog.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wrapInBottomSheet$lambda$11$lambda$10$lambda$9$lambda$8(View view, MotionEvent motionEvent) {
        return true;
    }

    protected final boolean getMCancelable() {
        return this.mCancelable;
    }

    public final boolean getRoundedCorners() {
        return this.roundedCorners;
    }

    public final boolean getShowHandle() {
        return this.showHandle;
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            if (this.modifyWindowFlags) {
                window.clearFlags(67108864);
                window.addFlags(LinearLayoutManager.INVALID_OFFSET);
                window.setStatusBarColor(0);
            }
            window.setLayout(-1, -1);
        }
        setCancelable(this.cancelable);
    }

    @Override // androidx.activity.s, android.app.Dialog
    protected void onStart() {
        super.onStart();
        OzonBottomSheetBehavior<?> ozonBottomSheetBehavior = this.mBehavior;
        if (ozonBottomSheetBehavior != null) {
            Intrinsics.f(ozonBottomSheetBehavior);
            ozonBottomSheetBehavior.setState(this.startState);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean cancelable) {
        super.setCancelable(cancelable);
        if (this.mCancelable != cancelable) {
            this.mCancelable = cancelable;
            OzonBottomSheetBehavior<?> ozonBottomSheetBehavior = this.mBehavior;
            if (ozonBottomSheetBehavior != null) {
                Intrinsics.f(ozonBottomSheetBehavior);
                ozonBottomSheetBehavior.setHideable(cancelable);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean cancel) {
        super.setCanceledOnTouchOutside(cancel);
        if (cancel && !this.mCancelable) {
            this.mCancelable = true;
        }
        this.mCanceledOnTouchOutside = cancel;
        this.mCanceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public void setContentView(int layoutResId) {
        super.setContentView(wrapInBottomSheet(layoutResId, null, null));
    }

    public final void setMaxOffset(boolean enableCurtainMovement) {
        OzonBottomSheetBehavior<?> ozonBottomSheetBehavior = this.mBehavior;
        if (ozonBottomSheetBehavior != null) {
            ozonBottomSheetBehavior.setMaxOffset$ui_kit_prodGoogleAllVendorsRelease(enableCurtainMovement);
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    protected final boolean shouldWindowCloseOnTouchOutside() {
        if (!this.mCanceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.mCanceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.mCanceledOnTouchOutsideSet = true;
        }
        return this.mCanceledOnTouchOutside;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    protected View wrapInBottomSheet(int layoutResId, View view, ViewGroup.LayoutParams params) {
        final View inflate = View.inflate(getContext(), R$layout.ozon_design_bottom_sheet_dialog, null);
        View findViewById = inflate.findViewById(R$id.coordinator);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById;
        if (this.wrapContent) {
            ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = -2;
            layoutParams2.weight = 0.0f;
        }
        if (view == null) {
            view = getLayoutInflater().inflate(layoutResId, (ViewGroup) findViewById, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(R$id.design_bottom_sheet);
        if (this.wrapContent) {
            ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) layoutParams3)).height = -2;
            Integer num = this.minHeightDp;
            if (num != null) {
                frameLayout.setMinimumHeight(num.intValue());
            }
        }
        OzonBottomSheetBehavior.Companion companion = OzonBottomSheetBehavior.INSTANCE;
        Intrinsics.f(frameLayout);
        final OzonBottomSheetBehavior<?> from = companion.from(frameLayout);
        from.setBottomSheetCallback(this.bottomSheetCallback);
        from.setHideable(this.mCancelable);
        from.setState(4);
        from.setSkipCollapsed(this.cancelable);
        if (!this.cancelable) {
            if (!inflate.isLaidOut() || inflate.isLayoutRequested()) {
                inflate.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog$wrapInBottomSheet$lambda$11$lambda$10$lambda$9$lambda$5$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        OzonBottomSheetBehavior.this.setPeekHeight(inflate.getHeight());
                    }
                });
            } else {
                from.setPeekHeight(inflate.getHeight());
            }
        }
        this.mBehavior = from;
        Function2<ViewGroup, View, Unit> function2 = this.attachViews;
        Intrinsics.f(view);
        function2.invoke(frameLayout, view);
        View view2 = this.stickyView;
        if (view2 != null) {
            ((LinearLayout) inflate).addView(view2, new LinearLayout.LayoutParams(-1, -2));
        }
        coordinatorLayout.findViewById(R$id.touch_outside).setOnClickListener(new CX.a(this, 12));
        Y.C(frameLayout, new C5305a() { // from class: ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog$wrapInBottomSheet$1$1$2$6
            @Override // androidx.core.view.C5305a
            public void onInitializeAccessibilityNodeInfo(View host, q info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                if (!OzonBottomSheetDialog.this.getMCancelable()) {
                    info.Q(false);
                } else {
                    info.a(1048576);
                    info.Q(true);
                }
            }

            @Override // androidx.core.view.C5305a
            public boolean performAccessibilityAction(View host, int action, Bundle args) {
                Intrinsics.checkNotNullParameter(host, "host");
                if (action != 1048576 || !OzonBottomSheetDialog.this.getMCancelable()) {
                    return super.performAccessibilityAction(host, action, args);
                }
                OzonBottomSheetDialog.this.cancel();
                return true;
            }
        });
        frameLayout.setOnTouchListener(new xX.a());
        Intrinsics.checkNotNullExpressionValue(inflate, "also(...)");
        return inflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonBottomSheetDialog(@NotNull Context context, int i11, int i12, boolean z11, View view, boolean z12, boolean z13, boolean z14, Integer num, boolean z15) {
        super(context, INSTANCE.getThemeResId(i11));
        Intrinsics.checkNotNullParameter(context, "context");
        this.startState = i12;
        this.showHandle = z11;
        this.stickyView = view;
        this.roundedCorners = z12;
        this.wrapContent = z13;
        this.modifyWindowFlags = z14;
        this.minHeightDp = num;
        this.cancelable = z15;
        this.mCancelable = true;
        this.mCanceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.f() { // from class: ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog$bottomSheetCallback$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (newState == 5) {
                    OzonBottomSheetDialog.this.cancel();
                }
            }
        };
        this.attachViews = new OzonBottomSheetDialog$attachViews$1(this, context);
        supportRequestWindowFeature(1);
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public void setContentView(@NotNull View view, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setContentView(wrapInBottomSheet(0, view, params));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addContent(LinearLayout linearLayout, View view) {
        LinearLayout.LayoutParams layoutParams;
        if (this.wrapContent) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        }
        linearLayout.addView(view, layoutParams);
    }
}
