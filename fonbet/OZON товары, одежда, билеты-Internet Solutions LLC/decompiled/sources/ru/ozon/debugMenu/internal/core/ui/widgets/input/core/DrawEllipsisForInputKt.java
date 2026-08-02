package ru.ozon.debugMenu.internal.core.ui.widgets.input.core;

import K1.K;
import K1.M;
import K1.P;
import K1.T;
import P9.a;
import com.google.android.gms.location.GeofenceStatusCodes;
import k1.C7459e;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a;\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0018\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001d\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ln1/e;", "LK1/K;", "textLayoutResult", "Lu0/x;", "contentPadding", "LK1/M;", "textMeasurer", "LK1/T;", "finalTextStyle", "Ll1/Z;", "backgroundColor", "", "drawEllipsisForInput-kKL39v8", "(Ln1/e;LK1/K;Lu0/x;LK1/M;LK1/T;J)V", "drawEllipsisForInput", "", "lastVisibleCharOffset", "ellipsisWidth", "Lk1/e;", "calculateEllipsisUnderlayOffset", "(Ln1/e;IILK1/K;)J", "ellipsisUnderlayOffset", "drawEllipsisUnderlay-ovu08d8", "(Ln1/e;JJ)V", "drawEllipsisUnderlay", "color", "underlayOffset", "drawEllipsis-N4PQSlQ", "(Ln1/e;LK1/K;JJ)V", "drawEllipsis", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawEllipsisForInputKt {
    private static final long calculateEllipsisUnderlayOffset(InterfaceC8412e interfaceC8412e, int i11, int i12, K k11) {
        float f7 = C7464j.f(interfaceC8412e.i());
        while (-1 < i11 && C7464j.f(interfaceC8412e.i()) - f7 < i12) {
            f7 = k11.d(i11).n();
            i11--;
        }
        return a.a(f7, 0.0f);
    }

    /* renamed from: drawEllipsis-N4PQSlQ, reason: not valid java name */
    private static final void m1623drawEllipsisN4PQSlQ(InterfaceC8412e interfaceC8412e, K k11, long j11, long j12) {
        P.a(interfaceC8412e, k11, j11, j12);
    }

    /* renamed from: drawEllipsisForInput-kKL39v8, reason: not valid java name */
    public static final void m1624drawEllipsisForInputkKL39v8(@NotNull InterfaceC8412e drawEllipsisForInput, @NotNull K textLayoutResult, @NotNull InterfaceC9914x contentPadding, @NotNull M textMeasurer, @NotNull T finalTextStyle, long j11) {
        Intrinsics.checkNotNullParameter(drawEllipsisForInput, "$this$drawEllipsisForInput");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(finalTextStyle, "finalTextStyle");
        float v12 = drawEllipsisForInput.v1(androidx.compose.foundation.layout.T.d(contentPadding, drawEllipsisForInput.getLayoutDirection()));
        float d11 = C7464j.d(drawEllipsisForInput.i()) - ((int) (textLayoutResult.A() & 4294967295L));
        float v13 = drawEllipsisForInput.v1(androidx.compose.foundation.layout.T.c(contentPadding, drawEllipsisForInput.getLayoutDirection()));
        drawEllipsisForInput.w0().f().c(v12, d11, v13, 0.0f);
        try {
            if (((int) (textLayoutResult.A() >> 32)) > C7464j.f(drawEllipsisForInput.i())) {
                int w11 = textLayoutResult.w(a.a(C7464j.f(drawEllipsisForInput.i()), 1.0f)) - 1;
                K a11 = M.a(textMeasurer, "…", finalTextStyle, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
                long calculateEllipsisUnderlayOffset = calculateEllipsisUnderlayOffset(drawEllipsisForInput, w11, (int) (a11.A() >> 32), textLayoutResult);
                m1625drawEllipsisUnderlayovu08d8(drawEllipsisForInput, j11, calculateEllipsisUnderlayOffset);
                m1623drawEllipsisN4PQSlQ(drawEllipsisForInput, a11, finalTextStyle.f(), calculateEllipsisUnderlayOffset);
            }
        } finally {
            drawEllipsisForInput.w0().f().c(-v12, -d11, -v13, -0.0f);
        }
    }

    /* renamed from: drawEllipsisUnderlay-ovu08d8, reason: not valid java name */
    private static final void m1625drawEllipsisUnderlayovu08d8(InterfaceC8412e interfaceC8412e, long j11, long j12) {
        InterfaceC8412e.Q(interfaceC8412e, j11, j12, C7465k.a(C7464j.f(interfaceC8412e.i()) - C7459e.g(j12), C7464j.d(interfaceC8412e.i())), 0.0f, null, 120);
    }
}
