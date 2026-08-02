package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async;

import Sc.InterfaceC4008j;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.uikit.view.skeleton.SkeletonPlaceholderView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/uikit/view/skeleton/SkeletonPlaceholderView;", "skeletonPlaceholderViewTop$delegate", "LSc/j;", "getSkeletonPlaceholderViewTop", "()Lru/ozon/app/android/uikit/view/skeleton/SkeletonPlaceholderView;", "skeletonPlaceholderViewTop", "skeletonPlaceholderViewBottom$delegate", "getSkeletonPlaceholderViewBottom", "skeletonPlaceholderViewBottom", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6AsyncPlaceholderView extends ConstraintLayout {

    /* renamed from: skeletonPlaceholderViewBottom$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j skeletonPlaceholderViewBottom;

    /* renamed from: skeletonPlaceholderViewTop$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j skeletonPlaceholderViewTop;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderView$1, reason: invalid class name */
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
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewTop());
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewTop());
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewTop());
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(updateConstraints, DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewBottom());
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewBottom());
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewBottom());
            ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewBottom(), DeliveryV6AsyncPlaceholderView.this.getSkeletonPlaceholderViewTop());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6AsyncPlaceholderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.skeletonPlaceholderViewTop = DelegatesKt.lazyUnsafe(new DeliveryV6AsyncPlaceholderView$skeletonPlaceholderViewTop$2(context));
        this.skeletonPlaceholderViewBottom = DelegatesKt.lazyUnsafe(new DeliveryV6AsyncPlaceholderView$skeletonPlaceholderViewBottom$2(context));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(getSkeletonPlaceholderViewTop());
        addView(getSkeletonPlaceholderViewBottom());
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkeletonPlaceholderView getSkeletonPlaceholderViewBottom() {
        return (SkeletonPlaceholderView) this.skeletonPlaceholderViewBottom.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkeletonPlaceholderView getSkeletonPlaceholderViewTop() {
        return (SkeletonPlaceholderView) this.skeletonPlaceholderViewTop.getValue();
    }
}
