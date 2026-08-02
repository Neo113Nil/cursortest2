package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.common;

import Hj.C3143a;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/common/CarriageOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "<init>", "()V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CarriageOutlineProvider extends ViewOutlineProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float RADIUS = UiExtKt.toPxF(12.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/common/CarriageOutlineProvider$Companion;", "", "<init>", "()V", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(@NotNull View view, @NotNull Outline outline) {
        outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), RADIUS);
    }
}
