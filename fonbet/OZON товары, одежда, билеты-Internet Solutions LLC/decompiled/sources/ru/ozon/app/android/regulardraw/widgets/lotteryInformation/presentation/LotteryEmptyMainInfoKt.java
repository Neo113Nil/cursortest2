package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.t;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.utils.AnalyticsKt;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$EmptyMainInfo;", "mainInfo", "Landroidx/compose/ui/e;", "modifier", "", "LotteryEmptyMainInfo", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$EmptyMainInfo;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryEmptyMainInfoKt {
    public static final void LotteryEmptyMainInfo(@NotNull LotteryInformationVI.EmptyMainInfo mainInfo, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j11;
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        C3969l u11 = interfaceC3967k.u(-1617561416);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(mainInfo) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = 2 & i12;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            t tokenizedEvent = mainInfo.getTokenizedEvent();
            u11.o(-192935733);
            if (tokenizedEvent != null) {
                AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            j11 = C7807Z.f72249c;
            Ag0.e.a(mainInfo.getImagePath(), C5182e.a(a0.t(PreviewKt.m942previewBackgroundRPmYEkk(eVar, j11, u11, ((i13 >> 3) & 14) | 48), 0.0f, 482, 1), 0.92f, false), null, null, null, 0.0f, null, u11, 3072, 244);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LotteryEmptyMainInfoKt$LotteryEmptyMainInfo$2(mainInfo, eVar, i11, i12));
        }
    }
}
