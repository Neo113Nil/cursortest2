package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryVO;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/views/SideButtonsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onLeftButtonClick", "onRightButtonClick", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryVO$SideButtonsVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "leftButtonView$delegate", "LSc/j;", "getLeftButtonView", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "leftButtonView", "rightButtonView$delegate", "getRightButtonView", "rightButtonView", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SideButtonsView extends FrameLayout {

    /* renamed from: leftButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j leftButtonView;

    /* renamed from: rightButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rightButtonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideButtonsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.leftButtonView = DelegatesKt.lazyUnsafe(new SideButtonsView$special$$inlined$lazyView$1(this, context));
        this.rightButtonView = DelegatesKt.lazyUnsafe(new SideButtonsView$special$$inlined$lazyView$2(this, context));
    }

    public final void bind(ReviewGalleryVO.SideButtonsVO vo, @NotNull Function1<? super AtomAction, Unit> onLeftButtonClick, @NotNull Function1<? super AtomAction, Unit> onRightButtonClick) {
        Intrinsics.checkNotNullParameter(onLeftButtonClick, "onLeftButtonClick");
        Intrinsics.checkNotNullParameter(onRightButtonClick, "onRightButtonClick");
        if (vo == null) {
            ViewExtKt.gone(this);
            return;
        }
        setPadding(vo.getLeftMarginPx(), getPaddingTop(), vo.getRightMarginPx(), getPaddingBottom());
        IconButtonV3DTO leftButton = vo.getLeftButton();
        if (leftButton != null) {
            IconButtonV3HolderKt.bindOrGone(getLeftButtonView(), leftButton, onLeftButtonClick);
        }
        IconButtonV3DTO rightButton = vo.getRightButton();
        if (rightButton != null) {
            IconButtonV3HolderKt.bindOrGone(getRightButtonView(), rightButton, onRightButtonClick);
        }
    }

    @NotNull
    public final IconButtonV3View getLeftButtonView() {
        return (IconButtonV3View) this.leftButtonView.getValue();
    }

    @NotNull
    public final IconButtonV3View getRightButtonView() {
        return (IconButtonV3View) this.rightButtonView.getValue();
    }
}
