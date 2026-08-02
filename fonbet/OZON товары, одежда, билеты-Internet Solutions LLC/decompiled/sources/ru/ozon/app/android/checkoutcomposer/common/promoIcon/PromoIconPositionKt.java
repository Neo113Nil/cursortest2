package ru.ozon.app.android.checkoutcomposer.common.promoIcon;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"setupPromoIconGravity", "", "Lru/ozon/uni/android/atom/icon/IconView;", "position", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PromoIconPositionKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PromoIconPosition.values().length];
            try {
                iArr[PromoIconPosition.BOTTOM_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoIconPosition.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoIconPosition.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void setupPromoIconGravity(@NotNull IconView iconView, PromoIconPosition promoIconPosition) {
        Intrinsics.checkNotNullParameter(iconView, "<this>");
        int i11 = promoIconPosition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[promoIconPosition.ordinal()];
        int i12 = i11 != 1 ? i11 != 2 ? i11 != 3 ? 8388691 : 8388661 : 8388659 : 8388693;
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i12;
        iconView.setLayoutParams(layoutParams2);
    }
}
