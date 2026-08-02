package ru.ozon.app.android.ordertracking.v4.presentation.rv;

import Ae.C2399j;
import Ae.C2408n0;
import Fs.ViewOnClickListenerC3059a;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.Y;
import androidx.lifecycle.K;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.orderTracking.data.BarcodeTimerManager;
import ru.ozon.app.android.ordertracking.R$color;
import ru.ozon.app.android.ordertracking.databinding.ItemOrderTrackingV4BarcodeBinding;
import ru.ozon.app.android.ordertracking.v4.presentation.model.BarcodeVO;
import ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import xe.B0;

@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u001f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4BarcodeViewHolder;", "Ljk0/j;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "barcodeTimerManager", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4BarcodeBinding;", "binding", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4BarcodeBinding;LWZ/l;)V", "startDelayedAnimation", "(Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/ordertracking/v4/presentation/model/BarcodeVO;", "item", "bind", "(Lru/ozon/app/android/ordertracking/v4/presentation/model/BarcodeVO;)V", "Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "Lru/ozon/app/android/ordertracking/databinding/ItemOrderTrackingV4BarcodeBinding;", "LWZ/l;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/BarcodeVO;", "Lxe/B0;", "animationJob", "Lxe/B0;", "ru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4BarcodeViewHolder$stretchListener$1", "stretchListener", "Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4BarcodeViewHolder$stretchListener$1;", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderTrackingV4BarcodeViewHolder extends j {
    private B0 animationJob;
    private final BarcodeTimerManager barcodeTimerManager;

    @NotNull
    private final ItemOrderTrackingV4BarcodeBinding binding;
    private BarcodeVO item;

    @NotNull
    private OrderTrackingV4BarcodeViewHolder$stretchListener$1 stretchListener;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static int BARCODE_HARDOCDED_WIDTH = ResourceExtKt.toPx(50);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/rv/OrderTrackingV4BarcodeViewHolder$Companion;", "", "<init>", "()V", "BARCODE_HARDOCDED_WIDTH", "", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v1, types: [ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4BarcodeViewHolder$stretchListener$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderTrackingV4BarcodeViewHolder(@NotNull Function1<? super AtomAction, Unit> actionHandler, BarcodeTimerManager barcodeTimerManager, @NotNull ItemOrderTrackingV4BarcodeBinding binding, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        StretchFrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.barcodeTimerManager = barcodeTimerManager;
        this.binding = binding;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.stretchListener = new StretchFrameLayout.StretchListener() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4BarcodeViewHolder$stretchListener$1
            @Override // ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout.StretchListener
            public void onViewStartStretching() {
                BarcodeTimerManager barcodeTimerManager2;
                barcodeTimerManager2 = OrderTrackingV4BarcodeViewHolder.this.barcodeTimerManager;
                if (barcodeTimerManager2 != null) {
                    barcodeTimerManager2.pauseTimer();
                }
            }

            @Override // ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout.StretchListener
            public void onViewStopStretching() {
                BarcodeTimerManager barcodeTimerManager2;
                barcodeTimerManager2 = OrderTrackingV4BarcodeViewHolder.this.barcodeTimerManager;
                if (barcodeTimerManager2 != null) {
                    barcodeTimerManager2.resumeTimer();
                }
            }
        };
        StretchFrameLayout constraintLayout2 = binding.getConstraintLayout();
        constraintLayout2.setOnClickListener(new ViewOnClickListenerC3059a(1, this, actionHandler));
        constraintLayout2.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(OrderTrackingV4BarcodeViewHolder orderTrackingV4BarcodeViewHolder, Function1 function1, View view) {
        AtomAction action;
        BarcodeVO barcodeVO = orderTrackingV4BarcodeViewHolder.item;
        if (barcodeVO == null || (action = barcodeVO.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void startDelayedAnimation(BarcodeTimerManager barcodeTimerManager) {
        StretchFrameLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = BARCODE_HARDOCDED_WIDTH;
        constraintLayout.setLayoutParams(layoutParams);
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.animationJob = C2399j.C(new C2408n0(barcodeTimerManager.getTicks(), new OrderTrackingV4BarcodeViewHolder$startDelayedAnimation$2(this, null)), K.a(this));
    }

    public final void bind(@NotNull BarcodeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        ItemOrderTrackingV4BarcodeBinding itemOrderTrackingV4BarcodeBinding = this.binding;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = itemOrderTrackingV4BarcodeBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getIcon().getBackgroundColor(), R$color.order_tracking_barcode_background);
        Context context2 = itemOrderTrackingV4BarcodeBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CommonAtomIconDTO icon = item.getIcon().getIcon();
        int parseColor2 = styleParser.parseColor(context2, icon != null ? icon.getTintColor() : null, R$color.order_tracking_barcode_image_tint);
        StretchFrameLayout constraintLayout = itemOrderTrackingV4BarcodeBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Y.F(constraintLayout, ColorStateList.valueOf(parseColor));
        itemOrderTrackingV4BarcodeBinding.getConstraintLayout().setStretchListener(this.stretchListener);
        AppCompatImageView barcodeBtn = itemOrderTrackingV4BarcodeBinding.barcodeBtn;
        Intrinsics.checkNotNullExpressionValue(barcodeBtn, "barcodeBtn");
        CommonAtomIconDTO icon2 = item.getIcon().getIcon();
        ImageViewExtKt.load$default(barcodeBtn, icon2 != null ? icon2.getIcon() : null, null, null, null, null, false, null, 126, null);
        AppCompatImageView barcodeBtn2 = itemOrderTrackingV4BarcodeBinding.barcodeBtn;
        Intrinsics.checkNotNullExpressionValue(barcodeBtn2, "barcodeBtn");
        ThemeExtKt.tint(barcodeBtn2, Integer.valueOf(parseColor2));
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        BarcodeTimerManager barcodeTimerManager = this.barcodeTimerManager;
        if (barcodeTimerManager != null) {
            startDelayedAnimation(barcodeTimerManager);
        }
        BarcodeVO barcodeVO = this.item;
        if (barcodeVO == null || (tokenizedEvent = barcodeVO.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, tokenizedEvent, null);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        B0 b02 = this.animationJob;
        if (b02 != null) {
            b02.j(null);
        }
    }
}
