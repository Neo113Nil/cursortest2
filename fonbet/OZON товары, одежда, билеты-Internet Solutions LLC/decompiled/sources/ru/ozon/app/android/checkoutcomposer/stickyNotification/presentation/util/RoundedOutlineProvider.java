package ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.util;

import Hj.C3143a;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/util/RoundedOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "radius", "", "<init>", "(I)V", "", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RoundedOutlineProvider extends ViewOutlineProvider {
    private final float radius;

    public RoundedOutlineProvider(int i11) {
        this.radius = UiExtKt.toPxF(i11);
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(@NotNull View view, @NotNull Outline outline) {
        outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), this.radius);
    }
}
