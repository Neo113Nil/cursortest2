package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframeNew;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameViewNew;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/oneframeNew/OneFrameViewNew;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "singleFrameViewNew", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameViewNew;", "setOnAction", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bind", "frame", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneFrameViewNew extends FrameLayout {

    @NotNull
    private final FrameViewNew singleFrameViewNew;

    public /* synthetic */ OneFrameViewNew(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull FrameVO frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.singleFrameViewNew.bind(frame, true);
    }

    public final void setOnAction(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.singleFrameViewNew.setOnAction(actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneFrameViewNew(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameViewNew frameViewNew = new FrameViewNew(context, null, 0, 6, null);
        frameViewNew.setLayoutParams(new FrameLayout.LayoutParams(-1, NaviBlocksDTO.INSTANCE.getSINGLE_BLOCK_HEIGHT()));
        frameViewNew.setRippleEnabled(true);
        frameViewNew.setClipToOutline(true);
        this.singleFrameViewNew = frameViewNew;
        addView(frameViewNew);
    }
}
