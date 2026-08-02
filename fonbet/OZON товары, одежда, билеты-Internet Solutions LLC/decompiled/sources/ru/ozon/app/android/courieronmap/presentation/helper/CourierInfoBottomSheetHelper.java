package ru.ozon.app.android.courieronmap.presentation.helper;

import B90.C2622y;
import B90.C2623z;
import E.r;
import Sc.InterfaceC4008j;
import Sc.k;
import Xr.a;
import android.graphics.RectF;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.courieronmap.databinding.WidgetCourierOnMapBinding;
import ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper;
import y7.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper;", "", "Lru/ozon/app/android/courieronmap/databinding/WidgetCourierOnMapBinding;", "binding", "Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lru/ozon/app/android/courieronmap/databinding/WidgetCourierOnMapBinding;Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper$Listener;)V", "", "updateBtnLocation", "()V", "setCornerRadius", "observeStateChange", "init", "onRemoveView", "Lru/ozon/app/android/courieronmap/databinding/WidgetCourierOnMapBinding;", "Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper$Listener;", "", "topOffsetDefault$delegate", "LSc/j;", "getTopOffsetDefault", "()I", "topOffsetDefault", "", "cardCornerRadius$delegate", "getCardCornerRadius", "()F", "cardCornerRadius", "Lkotlin/Function0;", "popupPostCallback", "Lkotlin/jvm/functions/Function0;", "Landroid/view/View$OnLayoutChangeListener;", "popupStateChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/card/MaterialCardView;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "", "initStateSet", "Z", "Companion", "Listener", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierInfoBottomSheetHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private BottomSheetBehavior<MaterialCardView> behavior;

    @NotNull
    private final WidgetCourierOnMapBinding binding;

    /* renamed from: cardCornerRadius$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cardCornerRadius;
    private boolean initStateSet;

    @NotNull
    private final Listener listener;

    @NotNull
    private final Function0<Unit> popupPostCallback;

    @NotNull
    private final View.OnLayoutChangeListener popupStateChangeListener;

    /* renamed from: topOffsetDefault$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j topOffsetDefault;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper$Companion;", "", "<init>", "()V", "HALF_EXPANDED_RATIO", "", "TOP_OFFSET_DEFAULT_DP", "", "CARD_CORNER_RADIUS", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J!\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/helper/CourierInfoBottomSheetHelper$Listener;", "", "onSlide", "", "onPopupStateChange", "getHeaderHeight", "", "getCallCourierContainerHeight", "setPositionToCallCourierContainer", "x", "", "y", "(Ljava/lang/Float;Ljava/lang/Float;)V", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        int getCallCourierContainerHeight();

        int getHeaderHeight();

        void onPopupStateChange();

        void onSlide();

        void setPositionToCallCourierContainer(Float x11, Float y11);
    }

    public CourierInfoBottomSheetHelper(@NotNull WidgetCourierOnMapBinding binding, @NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.binding = binding;
        this.listener = listener;
        this.topOffsetDefault = k.b(CourierInfoBottomSheetHelper$topOffsetDefault$2.INSTANCE);
        this.cardCornerRadius = k.b(CourierInfoBottomSheetHelper$cardCornerRadius$2.INSTANCE);
        this.popupPostCallback = new CourierInfoBottomSheetHelper$popupPostCallback$1(this);
        this.popupStateChangeListener = new View.OnLayoutChangeListener() { // from class: Xr.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CourierInfoBottomSheetHelper.popupStateChangeListener$lambda$2(CourierInfoBottomSheetHelper.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
    }

    private final float getCardCornerRadius() {
        return ((Number) this.cardCornerRadius.getValue()).floatValue();
    }

    private final int getTopOffsetDefault() {
        return ((Number) this.topOffsetDefault.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popupStateChangeListener$lambda$2(CourierInfoBottomSheetHelper courierInfoBottomSheetHelper, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        WidgetCourierOnMapBinding widgetCourierOnMapBinding = courierInfoBottomSheetHelper.binding;
        int headerHeight = courierInfoBottomSheetHelper.listener.getHeaderHeight();
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior = courierInfoBottomSheetHelper.behavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.n("behavior");
            throw null;
        }
        bottomSheetBehavior.setPeekHeight(headerHeight);
        boolean z11 = ((float) widgetCourierOnMapBinding.getRoot().getHeight()) * 0.5f < ((float) widgetCourierOnMapBinding.popupContainer.getRoot().getHeight());
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior2 = courierInfoBottomSheetHelper.behavior;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.n("behavior");
            throw null;
        }
        bottomSheetBehavior2.setFitToContents(!z11);
        int height = widgetCourierOnMapBinding.getRoot().getHeight() - widgetCourierOnMapBinding.popupContainer.getRoot().getHeight();
        int topOffsetDefault = courierInfoBottomSheetHelper.getTopOffsetDefault();
        if (height < topOffsetDefault) {
            height = topOffsetDefault;
        }
        BottomSheetBehavior<MaterialCardView> bottomSheetBehavior3 = courierInfoBottomSheetHelper.behavior;
        if (bottomSheetBehavior3 == null) {
            Intrinsics.n("behavior");
            throw null;
        }
        bottomSheetBehavior3.setExpandedOffset(height);
        if (!courierInfoBottomSheetHelper.initStateSet) {
            BottomSheetBehavior<MaterialCardView> bottomSheetBehavior4 = courierInfoBottomSheetHelper.behavior;
            if (bottomSheetBehavior4 == null) {
                Intrinsics.n("behavior");
                throw null;
            }
            bottomSheetBehavior4.setState(z11 ? 6 : 3);
            courierInfoBottomSheetHelper.initStateSet = true;
        }
        widgetCourierOnMapBinding.popupContainer.getRoot().post(new r(courierInfoBottomSheetHelper.popupPostCallback, 2));
    }

    private final void setCornerRadius() {
        MaterialCardView root = this.binding.popupContainer.getRoot();
        k.a aVar = new k.a(new y7.k());
        aVar.o(0, new C2622y(this));
        aVar.s(0, new C2623z(this));
        root.setShapeAppearanceModel(aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float setCornerRadius$lambda$9$lambda$7(CourierInfoBottomSheetHelper courierInfoBottomSheetHelper, RectF it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return courierInfoBottomSheetHelper.getCardCornerRadius();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float setCornerRadius$lambda$9$lambda$8(CourierInfoBottomSheetHelper courierInfoBottomSheetHelper, RectF it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return courierInfoBottomSheetHelper.getCardCornerRadius();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBtnLocation() {
        float height = (r0.getRoot().getHeight() - this.binding.popupContainer.getRoot().getY()) - this.listener.getCallCourierContainerHeight();
        if (this.behavior == null) {
            Intrinsics.n("behavior");
            throw null;
        }
        if (height <= r0.getPeekHeight()) {
            BottomSheetBehavior<MaterialCardView> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior == null) {
                Intrinsics.n("behavior");
                throw null;
            }
            height = bottomSheetBehavior.getPeekHeight();
        }
        this.listener.setPositionToCallCourierContainer(null, Float.valueOf(height));
    }

    public final void init() {
        BottomSheetBehavior<MaterialCardView> from = BottomSheetBehavior.from(this.binding.popupContainer.getRoot());
        this.behavior = from;
        from.setState(3);
        from.setHideable(false);
        from.setHalfExpandedRatio(0.5f);
        from.addBottomSheetCallback(new BottomSheetBehavior.f() { // from class: ru.ozon.app.android.courieronmap.presentation.helper.CourierInfoBottomSheetHelper$init$1$1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View bottomSheet, float slideOffset) {
                CourierInfoBottomSheetHelper.Listener listener;
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                listener = CourierInfoBottomSheetHelper.this.listener;
                listener.onSlide();
                CourierInfoBottomSheetHelper.this.updateBtnLocation();
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onStateChanged(View bottomSheet, int newState) {
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            }
        });
        setCornerRadius();
    }

    public final void observeStateChange() {
        this.binding.popupContainer.getRoot().addOnLayoutChangeListener(this.popupStateChangeListener);
    }

    public final void onRemoveView() {
        MaterialCardView root = this.binding.popupContainer.getRoot();
        root.removeOnLayoutChangeListener(this.popupStateChangeListener);
        root.removeCallbacks(new a(this.popupPostCallback, 0));
    }
}
