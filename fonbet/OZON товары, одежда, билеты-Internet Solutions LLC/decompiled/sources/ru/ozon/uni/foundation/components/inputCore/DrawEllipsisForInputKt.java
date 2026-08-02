package ru.ozon.uni.foundation.components.inputCore;

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
import l1.C7807Z;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.foundation.components.input.FoundationInputKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a3\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u001b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ln1/e;", "LK1/K;", "textLayoutResult", "LK1/M;", "textMeasurer", "LK1/T;", "finalTextStyle", "Ll1/Z;", "backgroundColor", "", "drawEllipsisForInput-xwkQ0AY", "(Ln1/e;LK1/K;LK1/M;LK1/T;J)V", "drawEllipsisForInput", "", "lastVisibleCharOffset", "ellipsisWidth", "Lk1/e;", "calculateEllipsisUnderlayOffset", "(Ln1/e;IILK1/K;)J", "ellipsisUnderlayOffset", "drawEllipsisUnderlay-ovu08d8", "(Ln1/e;JJ)V", "drawEllipsisUnderlay", "color", "underlayOffset", "drawEllipsis-N4PQSlQ", "(Ln1/e;LK1/K;JJ)V", "drawEllipsis", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
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
    private static final void m3011drawEllipsisN4PQSlQ(InterfaceC8412e interfaceC8412e, K k11, long j11, long j12) {
        P.a(interfaceC8412e, k11, j11, j12);
    }

    /* renamed from: drawEllipsisForInput-xwkQ0AY, reason: not valid java name */
    public static final void m3012drawEllipsisForInputxwkQ0AY(@NotNull InterfaceC8412e drawEllipsisForInput, @NotNull K textLayoutResult, @NotNull M textMeasurer, @NotNull T finalTextStyle, long j11) {
        long j12;
        long j13;
        long j14;
        Intrinsics.checkNotNullParameter(drawEllipsisForInput, "$this$drawEllipsisForInput");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(finalTextStyle, "finalTextStyle");
        if (FoundationInputKt.getCustomEllipsisDebug()) {
            j14 = C7807Z.f72253g;
            InterfaceC8412e.Q(drawEllipsisForInput, j14, 0L, 0L, 0.4f, null, 118);
        }
        float s11 = textLayoutResult.s(0);
        if (FoundationInputKt.getCustomEllipsisDebug()) {
            j13 = C7807Z.f72252f;
            drawEllipsisForInput.U(j13, a.a(s11, 0.0f), a.a(s11, C7464j.d(drawEllipsisForInput.i())), drawEllipsisForInput.v1(2), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        }
        if (s11 <= C7464j.f(drawEllipsisForInput.i())) {
            if (FoundationInputKt.getCustomEllipsisDebug()) {
                j12 = C7807Z.f72254h;
                InterfaceC8412e.m1(drawEllipsisForInput, C7807Z.o(0.8f, j12), 7.0f, a.a(7.0f, 7.0f), 120);
                return;
            }
            return;
        }
        int w11 = textLayoutResult.w(a.a(C7464j.f(drawEllipsisForInput.i()), 1.0f)) - 1;
        K a11 = M.a(textMeasurer, "…", finalTextStyle, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        long calculateEllipsisUnderlayOffset = calculateEllipsisUnderlayOffset(drawEllipsisForInput, w11, (int) (a11.A() >> 32), textLayoutResult);
        m3013drawEllipsisUnderlayovu08d8(drawEllipsisForInput, j11, calculateEllipsisUnderlayOffset);
        m3011drawEllipsisN4PQSlQ(drawEllipsisForInput, a11, finalTextStyle.f(), calculateEllipsisUnderlayOffset);
    }

    /* renamed from: drawEllipsisUnderlay-ovu08d8, reason: not valid java name */
    private static final void m3013drawEllipsisUnderlayovu08d8(InterfaceC8412e interfaceC8412e, long j11, long j12) {
        long j13;
        if (FoundationInputKt.getCustomEllipsisDebug()) {
            j13 = C7807Z.f72257k;
            j11 = C7807Z.o(0.6f, j13);
        }
        InterfaceC8412e.Q(interfaceC8412e, j11, j12, C7465k.a(C7464j.f(interfaceC8412e.i()) - C7459e.g(j12), C7464j.d(interfaceC8412e.i())), 0.0f, null, 120);
    }
}
