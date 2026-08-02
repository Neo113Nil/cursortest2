package ru.ozon.app.android.regulardraw.widgets.daily.presentation.compose;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import k1.C7455a;
import k1.C7459e;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7845v;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\r\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/e;", "dailyRewardsBackground", "(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;", "Ln1/e;", "Lk1/e;", "offset", "Lk1/a;", "cornerRadius", "Landroid/graphics/Paint;", "paint", "", "dropShadowInside-GeI9l2I", "(Ln1/e;JJLandroid/graphics/Paint;)V", "dropShadowInside", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyRewardsBackgroundKt {
    @NotNull
    public static final e dailyRewardsBackground(@NotNull e eVar) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        b11 = c.b(eVar, C5236c1.a(), DailyRewardsBackgroundKt$dailyRewardsBackground$1.INSTANCE);
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dropShadowInside-GeI9l2I, reason: not valid java name */
    public static final void m944dropShadowInsideGeI9l2I(InterfaceC8412e interfaceC8412e, long j11, long j12, Paint paint) {
        Canvas b11 = C7845v.b(interfaceC8412e.w0().a());
        int saveLayer = b11.saveLayer(0.0f, 0.0f, b11.getWidth(), b11.getHeight(), null);
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, C7464j.f(interfaceC8412e.i()), C7464j.d(interfaceC8412e.i())), C7455a.d(j12), C7455a.e(j12), Path.Direction.CCW);
        b11.clipPath(path);
        float f7 = 2;
        float g10 = C7459e.g(j11) / f7;
        float h11 = C7459e.h(j11) / f7;
        float g11 = C7459e.g(j11);
        if (g11 < 0.0f) {
            g11 = 0.0f;
        }
        float f11 = C7464j.f(interfaceC8412e.i()) + (g11 * f7);
        float h12 = C7459e.h(j11);
        b11.drawRoundRect(g10, h11, f11, C7464j.d(interfaceC8412e.i()) + ((h12 >= 0.0f ? h12 : 0.0f) * f7), C7455a.d(j12), C7455a.e(j12), paint);
        b11.restoreToCount(saveLayer);
    }
}
