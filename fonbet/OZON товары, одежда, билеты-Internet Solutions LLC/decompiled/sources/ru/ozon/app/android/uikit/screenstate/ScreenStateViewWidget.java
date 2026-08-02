package ru.ozon.app.android.uikit.screenstate;

import AI.b;
import CC.a;
import EX.c;
import En.ViewOnClickListenerC2972a;
import Go.e;
import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.databinding.ViewScreenStateBinding;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.app.android.utils.ViewUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\r\u001a\u00020\f*\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\f*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\f*\u00020\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010#\u001a\u00020\f*\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00062\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$J=\u0010#\u001a\u00020\f*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00192\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010%R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R0\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R2\u00106\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00100\"\u0004\b8\u00102R*\u00109\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u000eR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010IR\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010I¨\u0006O"}, d2 = {"Lru/ozon/app/android/uikit/screenstate/ScreenStateViewWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "state", "", "showState", "(Lru/ozon/app/android/uikit/screenstate/ScreenState;)V", "", "showBlank", "(Lru/ozon/app/android/uikit/screenstate/ScreenState;Z)V", "color", "setBlankColor", "(Ljava/lang/Integer;)V", "Lru/ozon/app/android/uikit/databinding/ViewScreenStateBinding;", "(Lru/ozon/app/android/uikit/databinding/ViewScreenStateBinding;Lru/ozon/app/android/uikit/screenstate/ScreenState;Z)V", "setButton", "(Lru/ozon/app/android/uikit/databinding/ViewScreenStateBinding;)V", "", ImagesContract.URL, "setSecondaryButton", "(Lru/ozon/app/android/uikit/databinding/ViewScreenStateBinding;Ljava/lang/String;)V", "Landroid/widget/TextView;", "description", "Lkotlin/Function1;", "Landroid/text/Spanned;", "stringToHtml", "hasAction", "bindText", "(Landroid/widget/TextView;ILkotlin/jvm/functions/Function1;Z)V", "(Landroid/widget/TextView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Z)V", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function0;", "getListener", "()Lkotlin/jvm/functions/Function0;", "setListener", "(Lkotlin/jvm/functions/Function0;)V", "secondaryListener", "Lkotlin/jvm/functions/Function1;", "getSecondaryListener", "()Lkotlin/jvm/functions/Function1;", "setSecondaryListener", "(Lkotlin/jvm/functions/Function1;)V", "incidentListener", "getIncidentListener", "setIncidentListener", "onStateChanged", "getOnStateChanged", "setOnStateChanged", "errorSummaryClickListener", "getErrorSummaryClickListener", "setErrorSummaryClickListener", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "progressBar", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "getProgressBar", "()Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "setProgressBar", "(Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;)V", "lastState", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "getLastState", "()Lru/ozon/app/android/uikit/screenstate/ScreenState;", "setLastState", "defaultSize", "I", "buttonsListItemMargin", "binding", "Lru/ozon/app/android/uikit/databinding/ViewScreenStateBinding;", "defaultBlankColor", "blankColor", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenStateViewWidget extends ConstraintLayout {

    @NotNull
    private final ViewScreenStateBinding binding;
    private int blankColor;
    private final int buttonsListItemMargin;
    private final int defaultBlankColor;
    private final int defaultSize;
    private Function0<Unit> errorSummaryClickListener;
    private Function1<? super String, Unit> incidentListener;
    private ScreenState lastState;
    private Function0<Unit> listener;
    private Function1<? super ScreenState, Unit> onStateChanged;
    public DelayedVisibilityHandler progressBar;
    private Function1<? super String, Unit> secondaryListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenStateViewWidget(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ScreenStateViewWidget screenStateViewWidget, View view) {
        Function0<Unit> function0 = screenStateViewWidget.listener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ScreenStateViewWidget screenStateViewWidget, View view) {
        Function0<Unit> function0 = screenStateViewWidget.errorSummaryClickListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void bindText(TextView textView, int i11, Function1<? super String, ? extends Spanned> function1, boolean z11) {
        bindText(textView, StringProvider.getString(i11), function1, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void bindText$default(ScreenStateViewWidget screenStateViewWidget, TextView textView, int i11, Function1 function1, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            function1 = null;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        screenStateViewWidget.bindText(textView, i11, (Function1<? super String, ? extends Spanned>) function1, z11);
    }

    private final void setButton(ViewScreenStateBinding viewScreenStateBinding) {
        SmallButtonView smallButtonView = viewScreenStateBinding.screenStateActionBtn;
        smallButtonView.setText(StringProvider.getString(R$string.error_common_error_action_button));
        smallButtonView.setOnClickListener(new a(this, 13));
        ViewExtKt.show(smallButtonView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setButton$lambda$13$lambda$12(ScreenStateViewWidget screenStateViewWidget, View view) {
        Function0<Unit> function0 = screenStateViewWidget.listener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void setSecondaryButton(ViewScreenStateBinding viewScreenStateBinding, String str) {
        if (str == null) {
            SmallButtonView screenStateSecondaryActionBtn = viewScreenStateBinding.screenStateSecondaryActionBtn;
            Intrinsics.checkNotNullExpressionValue(screenStateSecondaryActionBtn, "screenStateSecondaryActionBtn");
            ViewExtKt.gone(screenStateSecondaryActionBtn);
        } else {
            SmallButtonView smallButtonView = viewScreenStateBinding.screenStateSecondaryActionBtn;
            smallButtonView.setText(StringProvider.getString(R$string.error_antibot_support_button_android));
            smallButtonView.setOnClickListener(new ViewOnClickListenerC2972a(4, this, str));
            ViewExtKt.show(smallButtonView);
        }
    }

    static /* synthetic */ void setSecondaryButton$default(ScreenStateViewWidget screenStateViewWidget, ViewScreenStateBinding viewScreenStateBinding, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        screenStateViewWidget.setSecondaryButton(viewScreenStateBinding, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSecondaryButton$lambda$16$lambda$15$lambda$14(ScreenStateViewWidget screenStateViewWidget, String str, View view) {
        Function1<? super String, Unit> function1 = screenStateViewWidget.secondaryListener;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showState$lambda$2(ScreenStateViewWidget screenStateViewWidget, View view) {
        Function0<Unit> function0 = screenStateViewWidget.listener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showState$lambda$4$lambda$3(ScreenStateViewWidget screenStateViewWidget, ScreenState screenState, View view) {
        Function1<? super String, Unit> function1 = screenStateViewWidget.incidentListener;
        if (function1 != null) {
            function1.invoke(((ScreenState.AntibotAlert) screenState).getIncidentId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showState$lambda$5(ScreenStateViewWidget screenStateViewWidget, View view) {
        Function0<Unit> function0 = screenStateViewWidget.listener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showState$lambda$7$lambda$6(ScreenState screenState, View view) {
        ((ScreenState.Custom) screenState).getOnDescriptionClickAction().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showState$lambda$9(ScreenState screenState, ScreenStateViewWidget screenStateViewWidget, View view) {
        Function0<Unit> actionButtonClickListener = ((ScreenState.Custom) screenState).getActionButtonClickListener();
        if (actionButtonClickListener != null) {
            actionButtonClickListener.invoke();
            return;
        }
        Function0<Unit> function0 = screenStateViewWidget.listener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final ScreenState getLastState() {
        return this.lastState;
    }

    @NotNull
    public final DelayedVisibilityHandler getProgressBar() {
        DelayedVisibilityHandler delayedVisibilityHandler = this.progressBar;
        if (delayedVisibilityHandler != null) {
            return delayedVisibilityHandler;
        }
        Intrinsics.n("progressBar");
        throw null;
    }

    public final void setBlankColor(Integer color) {
        int intValue = color != null ? color.intValue() : this.defaultBlankColor;
        this.blankColor = intValue;
        setBackgroundColor(intValue);
    }

    public final void setListener(Function0<Unit> function0) {
        this.listener = function0;
    }

    public final void setProgressBar(@NotNull DelayedVisibilityHandler delayedVisibilityHandler) {
        Intrinsics.checkNotNullParameter(delayedVisibilityHandler, "<set-?>");
        this.progressBar = delayedVisibilityHandler;
    }

    public final void showState(ScreenState state) {
        showState(state, true);
    }

    public /* synthetic */ ScreenStateViewWidget(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindText(TextView textView, String str, Function1<? super String, ? extends Spanned> function1, boolean z11) {
        if (function1 == null) {
            ViewUtilsKt.disableFocusable(textView);
            TextViewExtKt.setTextOrGone(textView, str);
            return;
        }
        TextViewExtKt.setTextOrGone(textView, function1.invoke(str));
        if (z11) {
            ViewUtilsKt.enableFocusable(textView);
        } else {
            ViewUtilsKt.disableFocusable(textView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void bindText$default(ScreenStateViewWidget screenStateViewWidget, TextView textView, String str, Function1 function1, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        screenStateViewWidget.bindText(textView, str, (Function1<? super String, ? extends Spanned>) function1, z11);
    }

    public final void showState(ScreenState state, boolean showBlank) {
        showState(this.binding, state, showBlank);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenStateViewWidget(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultSize = getResources().getDimensionPixelSize(R$dimen.error_size_icon);
        this.buttonsListItemMargin = ResourceExtKt.toPx(8);
        int color = androidx.core.content.a.getColor(context, R$color.oz_semantic_bg_secondary);
        this.defaultBlankColor = color;
        this.blankColor = color;
        ViewScreenStateBinding bind = ViewScreenStateBinding.bind(View.inflate(context, R$layout.view_screen_state, this));
        this.binding = bind;
        if (isInEditMode()) {
            return;
        }
        setClickable(true);
        setFocusable(true);
        setBackgroundColor(color);
        bind.screenStateActionBtn.setOnClickListener(new Il.a(this, 15));
        bind.errorSummaryBtn.setOnClickListener(new e(this, 13));
        MaterialProgressBar progress = bind.progress;
        Intrinsics.checkNotNullExpressionValue(progress, "progress");
        setProgressBar(new DelayedVisibilityHandler(progress, 0L, 2, null));
    }

    private final void showState(ViewScreenStateBinding viewScreenStateBinding, ScreenState screenState, boolean z11) {
        ScreenStateViewWidget screenStateViewWidget;
        if (z11) {
            setBackgroundColor(this.blankColor);
        } else {
            setBackground(null);
        }
        this.lastState = screenState;
        Function1<? super ScreenState, Unit> function1 = this.onStateChanged;
        if (function1 != null) {
            function1.invoke(screenState);
        }
        if (screenState instanceof ScreenState.NoConnection) {
            ImageView errorLogoIv = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv, "errorLogoIv");
            ImageViewExtKt.setVectorDrawable(errorLogoIv, R$drawable.ic_no_network_state);
            ImageView errorLogoIv2 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv2, "errorLogoIv");
            ViewExtKt.show(errorLogoIv2);
            TextView errorTitleTv = viewScreenStateBinding.errorTitleTv;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv, "errorTitleTv");
            TextViewExtKt.setTextOrGone(errorTitleTv, Integer.valueOf(R$string.error_common_error_no_connection_title));
            viewScreenStateBinding.errorTitleTv.setGravity(17);
            TextView errorDescTv = viewScreenStateBinding.errorDescTv;
            Intrinsics.checkNotNullExpressionValue(errorDescTv, "errorDescTv");
            bindText$default(this, errorDescTv, R$string.error_common_error_no_connection_description, (Function1) null, false, 6, (Object) null);
            viewScreenStateBinding.errorDescTv.setGravity(17);
            viewScreenStateBinding.errorDescTv.setTextIsSelectable(false);
            viewScreenStateBinding.errorDescTv.setOnClickListener(null);
            setButton(viewScreenStateBinding);
            setSecondaryButton$default(this, viewScreenStateBinding, null, 1, null);
            getProgressBar().hide();
            ViewExtKt.show(this);
            return;
        }
        if (screenState instanceof ScreenState.ServerIssue) {
            ImageView errorLogoIv3 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv3, "errorLogoIv");
            ImageViewExtKt.setVectorDrawable(errorLogoIv3, R$drawable.ic_errors_state);
            ImageView errorLogoIv4 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv4, "errorLogoIv");
            ViewExtKt.show(errorLogoIv4);
            TextView errorTitleTv2 = viewScreenStateBinding.errorTitleTv;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv2, "errorTitleTv");
            TextViewExtKt.setTextOrGone(errorTitleTv2, Integer.valueOf(R$string.error_common_error_technical_error_title));
            viewScreenStateBinding.errorTitleTv.setGravity(17);
            ScreenState.ServerIssue serverIssue = (ScreenState.ServerIssue) screenState;
            String traceId = serverIssue.getTraceId();
            if (traceId != null && !h.K(traceId) && !serverIssue.getIsResponseEmpty()) {
                TextView errorDescTv2 = viewScreenStateBinding.errorDescTv;
                Intrinsics.checkNotNullExpressionValue(errorDescTv2, "errorDescTv");
                bindText$default(this, errorDescTv2, StringProvider.getString(R$string.error_uikit_error_trace_description, serverIssue.getTraceId()), (Function1) ScreenStateViewWidget$showState$1.INSTANCE, false, 4, (Object) null);
                viewScreenStateBinding.errorDescTv.setTextIsSelectable(true);
                screenStateViewWidget = this;
            } else {
                TextView errorDescTv3 = viewScreenStateBinding.errorDescTv;
                Intrinsics.checkNotNullExpressionValue(errorDescTv3, "errorDescTv");
                screenStateViewWidget = this;
                bindText$default(screenStateViewWidget, errorDescTv3, R$string.error_uikit_error_technical_error_description, (Function1) null, false, 6, (Object) null);
                viewScreenStateBinding.errorDescTv.setTextIsSelectable(false);
            }
            viewScreenStateBinding.errorDescTv.setOnClickListener(null);
            viewScreenStateBinding.errorDescTv.setGravity(17);
            SmallButtonView errorSummaryBtn = viewScreenStateBinding.errorSummaryBtn;
            Intrinsics.checkNotNullExpressionValue(errorSummaryBtn, "errorSummaryBtn");
            errorSummaryBtn.setVisibility(serverIssue.getIsTestUser() ? 0 : 8);
            setButton(viewScreenStateBinding);
            setSecondaryButton$default(screenStateViewWidget, viewScreenStateBinding, null, 1, null);
            viewScreenStateBinding.screenStateActionBtn.setOnClickListener(new c(screenStateViewWidget, 10));
            screenStateViewWidget.getProgressBar().hide();
            ViewExtKt.show(screenStateViewWidget);
            return;
        }
        if (screenState instanceof ScreenState.AntibotAlert) {
            ImageView errorLogoIv5 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv5, "errorLogoIv");
            ImageViewExtKt.setVectorDrawable(errorLogoIv5, R$drawable.ic_errors_state);
            ImageView errorLogoIv6 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv6, "errorLogoIv");
            ViewExtKt.show(errorLogoIv6);
            ViewGroup.LayoutParams layoutParams = viewScreenStateBinding.errorLogoIv.getLayoutParams();
            int i11 = this.defaultSize;
            layoutParams.width = i11;
            layoutParams.height = i11;
            viewScreenStateBinding.errorLogoIv.setLayoutParams(layoutParams);
            viewScreenStateBinding.errorLogoIv.setOnClickListener(null);
            TextView errorTitleTv3 = viewScreenStateBinding.errorTitleTv;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv3, "errorTitleTv");
            TextViewExtKt.setTextOrGone(errorTitleTv3, Integer.valueOf(R$string.error_antibot_title_android));
            viewScreenStateBinding.errorTitleTv.setGravity(8388611);
            TextView textView = viewScreenStateBinding.errorDescTv;
            ScreenState.AntibotAlert antibotAlert = (ScreenState.AntibotAlert) screenState;
            String incidentId = antibotAlert.getIncidentId();
            if (incidentId != null && incidentId.length() != 0) {
                Intrinsics.f(textView);
                bindText(textView, StringProvider.getString(R$string.error_antibot_description_short_android, antibotAlert.getIncidentId()), ScreenStateViewWidget$showState$3$1.INSTANCE, this.incidentListener != null);
                textView.setClickable(true);
                textView.setOnClickListener(new XU.a(1, this, (ScreenState.AntibotAlert) screenState));
                textView.setTextIsSelectable(false);
                textView.setGravity(8388611);
            } else {
                Intrinsics.f(textView);
                bindText$default(this, textView, R$string.error_uikit_error_technical_error_description, (Function1) null, false, 6, (Object) null);
            }
            setButton(viewScreenStateBinding);
            setSecondaryButton$default(this, viewScreenStateBinding, null, 1, null);
            viewScreenStateBinding.screenStateActionBtn.setOnClickListener(new AI.a(this, 13));
            getProgressBar().hide();
            ViewExtKt.show(this);
            return;
        }
        if (screenState instanceof ScreenState.Custom) {
            ImageView errorLogoIv7 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv7, "errorLogoIv");
            ScreenState.Custom custom = (ScreenState.Custom) screenState;
            Integer icon = custom.getIcon();
            ImageViewExtKt.setVectorDrawable(errorLogoIv7, icon != null ? icon.intValue() : R$drawable.ic_errors_state);
            viewScreenStateBinding.errorLogoIv.setOnClickListener(null);
            ViewGroup.LayoutParams layoutParams2 = viewScreenStateBinding.errorLogoIv.getLayoutParams();
            int i12 = this.defaultSize;
            layoutParams2.width = i12;
            layoutParams2.height = i12;
            viewScreenStateBinding.errorLogoIv.setLayoutParams(layoutParams2);
            ImageView errorLogoIv8 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv8, "errorLogoIv");
            ViewExtKt.show(errorLogoIv8);
            TextView errorTitleTv4 = viewScreenStateBinding.errorTitleTv;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv4, "errorTitleTv");
            TextViewExtKt.setTextOrGone(errorTitleTv4, custom.getTitle());
            viewScreenStateBinding.errorTitleTv.setGravity(17);
            String description = custom.getDescription();
            if (description != null) {
                TextView errorDescTv4 = viewScreenStateBinding.errorDescTv;
                Intrinsics.checkNotNullExpressionValue(errorDescTv4, "errorDescTv");
                ViewExtKt.show(errorDescTv4);
                TextView errorDescTv5 = viewScreenStateBinding.errorDescTv;
                Intrinsics.checkNotNullExpressionValue(errorDescTv5, "errorDescTv");
                bindText(errorDescTv5, description, new ScreenStateViewWidget$showState$5$1(description), custom.getOnDescriptionClickAction() != null);
                viewScreenStateBinding.errorDescTv.setTextIsSelectable(false);
                if (custom.getOnDescriptionClickAction() != null) {
                    viewScreenStateBinding.errorDescTv.setOnClickListener(new b((ScreenState.Custom) screenState, 17));
                } else {
                    viewScreenStateBinding.errorDescTv.setOnClickListener(null);
                }
                viewScreenStateBinding.errorDescTv.setGravity(17);
            } else {
                TextView errorDescTv6 = viewScreenStateBinding.errorDescTv;
                Intrinsics.checkNotNullExpressionValue(errorDescTv6, "errorDescTv");
                ViewExtKt.gone(errorDescTv6);
            }
            String buttonText = custom.getButtonText();
            if (buttonText != null) {
                viewScreenStateBinding.screenStateActionBtn.setText(buttonText);
                SmallButtonView screenStateActionBtn = viewScreenStateBinding.screenStateActionBtn;
                Intrinsics.checkNotNullExpressionValue(screenStateActionBtn, "screenStateActionBtn");
                ViewExtKt.show(screenStateActionBtn);
            } else {
                SmallButtonView screenStateActionBtn2 = viewScreenStateBinding.screenStateActionBtn;
                Intrinsics.checkNotNullExpressionValue(screenStateActionBtn2, "screenStateActionBtn");
                ViewExtKt.gone(screenStateActionBtn2);
            }
            viewScreenStateBinding.screenStateActionBtn.setOnClickListener(new IW.a(9, (ScreenState.Custom) screenState, this));
            viewScreenStateBinding.screenStateBtnList.removeAllViews();
            for (ButtonV3Atom.SmallButton smallButton : custom.getButtons()) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                int i13 = this.buttonsListItemMargin;
                layoutParams3.setMargins(((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, i13, ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, i13);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                SmallButtonView smallButtonView = new SmallButtonView(context, null, 0, 6, null);
                WrappedButtonHolderKt.bind(smallButtonView, smallButton, custom.getButtonsActionHandler());
                viewScreenStateBinding.screenStateBtnList.addView(smallButtonView, layoutParams3);
            }
            setSecondaryButton$default(this, viewScreenStateBinding, null, 1, null);
            getProgressBar().hide();
            ViewExtKt.show(this);
            return;
        }
        if (screenState instanceof ScreenState.CustomDefault) {
            ImageView errorLogoIv9 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv9, "errorLogoIv");
            ImageViewExtKt.setVectorDrawable(errorLogoIv9, R$drawable.ic_errors_state);
            viewScreenStateBinding.errorLogoIv.setOnClickListener(null);
            ScreenState.CustomDefault customDefault = (ScreenState.CustomDefault) screenState;
            String title = customDefault.getTitle();
            if (title == null) {
                title = StringProvider.getString(R$string.error_common_error_technical_error_title);
            }
            String description2 = customDefault.getDescription();
            if (description2 == null) {
                description2 = StringProvider.getString(R$string.error_uikit_error_technical_error_description);
            }
            TextView errorTitleTv5 = viewScreenStateBinding.errorTitleTv;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv5, "errorTitleTv");
            TextViewExtKt.setTextOrGone(errorTitleTv5, title);
            viewScreenStateBinding.errorTitleTv.setGravity(17);
            String str = description2;
            TextView errorDescTv7 = viewScreenStateBinding.errorDescTv;
            Intrinsics.checkNotNullExpressionValue(errorDescTv7, "errorDescTv");
            bindText$default(this, errorDescTv7, str, (Function1) null, false, 6, (Object) null);
            viewScreenStateBinding.errorDescTv.setTextIsSelectable(false);
            viewScreenStateBinding.errorDescTv.setOnClickListener(null);
            viewScreenStateBinding.errorDescTv.setGravity(17);
            setButton(viewScreenStateBinding);
            setSecondaryButton$default(this, viewScreenStateBinding, null, 1, null);
            getProgressBar().hide();
            ViewExtKt.show(this);
            return;
        }
        if (screenState instanceof ScreenState.SecurityIssue) {
            ImageView errorLogoIv10 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv10, "errorLogoIv");
            ImageViewExtKt.setVectorDrawable(errorLogoIv10, R$drawable.ic_errors_state);
            viewScreenStateBinding.errorLogoIv.setOnClickListener(null);
            String string = StringProvider.getString(R$string.error_common_error_technical_error_title);
            String string2 = StringProvider.getString(R$string.error_uikit_error_technical_error_description);
            TextView errorTitleTv6 = viewScreenStateBinding.errorTitleTv;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv6, "errorTitleTv");
            TextViewExtKt.setTextOrGone(errorTitleTv6, string);
            viewScreenStateBinding.errorTitleTv.setGravity(17);
            TextView errorDescTv8 = viewScreenStateBinding.errorDescTv;
            Intrinsics.checkNotNullExpressionValue(errorDescTv8, "errorDescTv");
            bindText$default(this, errorDescTv8, string2, (Function1) null, false, 6, (Object) null);
            viewScreenStateBinding.errorDescTv.setTextIsSelectable(false);
            viewScreenStateBinding.errorDescTv.setOnClickListener(null);
            viewScreenStateBinding.errorDescTv.setGravity(17);
            setButton(viewScreenStateBinding);
            setSecondaryButton$default(this, viewScreenStateBinding, null, 1, null);
            getProgressBar().hide();
            ViewExtKt.show(this);
            return;
        }
        if (screenState instanceof ScreenState.Loading) {
            ImageView errorLogoIv11 = viewScreenStateBinding.errorLogoIv;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv11, "errorLogoIv");
            ViewExtKt.gone(errorLogoIv11);
            TextView errorTitleTv7 = viewScreenStateBinding.errorTitleTv;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv7, "errorTitleTv");
            ViewExtKt.gone(errorTitleTv7);
            TextView errorDescTv9 = viewScreenStateBinding.errorDescTv;
            Intrinsics.checkNotNullExpressionValue(errorDescTv9, "errorDescTv");
            ViewExtKt.gone(errorDescTv9);
            SmallButtonView screenStateActionBtn3 = viewScreenStateBinding.screenStateActionBtn;
            Intrinsics.checkNotNullExpressionValue(screenStateActionBtn3, "screenStateActionBtn");
            ViewExtKt.gone(screenStateActionBtn3);
            getProgressBar().show();
            setSecondaryButton$default(this, viewScreenStateBinding, null, 1, null);
            ViewExtKt.show(this);
            return;
        }
        if (screenState instanceof ScreenState.NoScreen) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.gone(this);
        }
    }
}
