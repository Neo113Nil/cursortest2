package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/WidgetRfbsSplitView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "leftIconIv", "Landroid/widget/ImageView;", "getLeftIconIv", "()Landroid/widget/ImageView;", "headerSAL", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getHeaderSAL", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "controlsLIBV", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;", "getControlsLIBV", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;", "subHeaderSAL", "getSubHeaderSAL", "productsRv", "Landroidx/recyclerview/widget/RecyclerView;", "getProductsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "dynamicElementsRV", "getDynamicElementsRV", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetRfbsSplitView extends ConstraintLayout {

    @NotNull
    private final LargeIconButtonView controlsLIBV;

    @NotNull
    private final RecyclerView dynamicElementsRV;

    @NotNull
    private final SingleAtom headerSAL;

    @NotNull
    private final ImageView leftIconIv;

    @NotNull
    private final RecyclerView productsRv;

    @NotNull
    private final SingleAtom subHeaderSAL;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_4 = ResourceExtKt.toPx(4);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_16 = ResourceExtKt.toPx(16);
    private static final int DP_24 = ResourceExtKt.toPx(24);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.WidgetRfbsSplitView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            updateConstraints.t(WidgetRfbsSplitView.this.getLeftIconIv().getId(), 6, 0, 6, WidgetRfbsSplitView.Companion.getDP_16());
            updateConstraints.s(WidgetRfbsSplitView.this.getLeftIconIv().getId(), 3, WidgetRfbsSplitView.this.getHeaderSAL().getId(), 3);
            updateConstraints.s(WidgetRfbsSplitView.this.getLeftIconIv().getId(), 4, WidgetRfbsSplitView.this.getSubHeaderSAL().getId(), 3);
            updateConstraints.f0(0.0f, WidgetRfbsSplitView.this.getLeftIconIv().getId());
            updateConstraints.t(WidgetRfbsSplitView.this.getHeaderSAL().getId(), 6, WidgetRfbsSplitView.this.getLeftIconIv().getId(), 7, WidgetRfbsSplitView.Companion.getDP_8());
            updateConstraints.t(WidgetRfbsSplitView.this.getHeaderSAL().getId(), 3, 0, 3, WidgetRfbsSplitView.Companion.getDP_16());
            updateConstraints.s(WidgetRfbsSplitView.this.getHeaderSAL().getId(), 7, WidgetRfbsSplitView.this.getControlsLIBV().getId(), 6);
            updateConstraints.c0(0.0f, WidgetRfbsSplitView.this.getHeaderSAL().getId());
            updateConstraints.s(WidgetRfbsSplitView.this.getControlsLIBV().getId(), 3, 0, 3);
            updateConstraints.s(WidgetRfbsSplitView.this.getControlsLIBV().getId(), 7, 0, 7);
            updateConstraints.s(WidgetRfbsSplitView.this.getControlsLIBV().getId(), 4, WidgetRfbsSplitView.this.getHeaderSAL().getId(), 4);
            updateConstraints.f0(0.0f, WidgetRfbsSplitView.this.getControlsLIBV().getId());
            updateConstraints.t(WidgetRfbsSplitView.this.getSubHeaderSAL().getId(), 6, 0, 6, WidgetRfbsSplitView.Companion.getDP_16());
            updateConstraints.t(WidgetRfbsSplitView.this.getSubHeaderSAL().getId(), 3, WidgetRfbsSplitView.this.getHeaderSAL().getId(), 4, WidgetRfbsSplitView.Companion.getDP_4());
            updateConstraints.t(WidgetRfbsSplitView.this.getSubHeaderSAL().getId(), 7, 0, 7, WidgetRfbsSplitView.Companion.getDP_16());
            updateConstraints.Z(WidgetRfbsSplitView.this.getSubHeaderSAL().getId(), 7, WidgetRfbsSplitView.Companion.getDP_16());
            updateConstraints.s(WidgetRfbsSplitView.this.getProductsRv().getId(), 6, 0, 6);
            updateConstraints.t(WidgetRfbsSplitView.this.getProductsRv().getId(), 3, WidgetRfbsSplitView.this.getSubHeaderSAL().getId(), 4, WidgetRfbsSplitView.Companion.getDP_24());
            updateConstraints.s(WidgetRfbsSplitView.this.getProductsRv().getId(), 7, 0, 7);
            updateConstraints.B(WidgetRfbsSplitView.this.getProductsRv().getId());
            updateConstraints.s(WidgetRfbsSplitView.this.getDynamicElementsRV().getId(), 6, 0, 6);
            updateConstraints.t(WidgetRfbsSplitView.this.getDynamicElementsRV().getId(), 3, WidgetRfbsSplitView.this.getProductsRv().getId(), 4, WidgetRfbsSplitView.Companion.getDP_8());
            updateConstraints.s(WidgetRfbsSplitView.this.getDynamicElementsRV().getId(), 7, 0, 7);
            updateConstraints.t(WidgetRfbsSplitView.this.getDynamicElementsRV().getId(), 4, 0, 4, WidgetRfbsSplitView.Companion.getDP_16());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/WidgetRfbsSplitView$Companion;", "", "<init>", "()V", "DP_4", "", "getDP_4", "()I", "DP_8", "getDP_8", "DP_16", "getDP_16", "DP_24", "getDP_24", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_16() {
            return WidgetRfbsSplitView.DP_16;
        }

        public final int getDP_24() {
            return WidgetRfbsSplitView.DP_24;
        }

        public final int getDP_4() {
            return WidgetRfbsSplitView.DP_4;
        }

        public final int getDP_8() {
            return WidgetRfbsSplitView.DP_8;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetRfbsSplitView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final LargeIconButtonView getControlsLIBV() {
        return this.controlsLIBV;
    }

    @NotNull
    public final RecyclerView getDynamicElementsRV() {
        return this.dynamicElementsRV;
    }

    @NotNull
    public final SingleAtom getHeaderSAL() {
        return this.headerSAL;
    }

    @NotNull
    public final ImageView getLeftIconIv() {
        return this.leftIconIv;
    }

    @NotNull
    public final RecyclerView getProductsRv() {
        return this.productsRv;
    }

    @NotNull
    public final SingleAtom getSubHeaderSAL() {
        return this.subHeaderSAL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRfbsSplitView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int i13 = DP_24;
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(i13, i13));
        appCompatImageView.setId(View.generateViewId());
        this.leftIconIv = appCompatImageView;
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setLayoutParams(new ConstraintLayout.b(0, -2));
        singleAtom.setId(View.generateViewId());
        this.headerSAL = singleAtom;
        LargeIconButtonView largeIconButtonView = new LargeIconButtonView(context, null, 0, 6, null);
        largeIconButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        largeIconButtonView.setId(R$id.controlsLIBV);
        this.controlsLIBV = largeIconButtonView;
        SingleAtom singleAtom2 = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom2.setLayoutParams(new ConstraintLayout.b(0, -2));
        singleAtom2.setId(View.generateViewId());
        this.subHeaderSAL = singleAtom2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setId(R$id.productsRv);
        recyclerView.setNestedScrollingEnabled(false);
        this.productsRv = recyclerView;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView2.setId(View.generateViewId());
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setItemAnimator(null);
        this.dynamicElementsRV = recyclerView2;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(appCompatImageView);
        addView(singleAtom);
        addView(largeIconButtonView);
        addView(singleAtom2);
        addView(recyclerView);
        addView(recyclerView2);
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
    }
}
