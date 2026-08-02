package ru.ozon.app.android.regulardraw.ui;

import G1.h;
import S0.InterfaceC3967k;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.m;
import org.joda.time.format.n;
import ru.ozon.app.android.pdp.ui.compose.time.StablePeriod;
import ru.ozon.app.android.regulardraw.R$plurals;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;", "period", "", "roundToDays", "", "timeUnitsDelimiter", "rememberHumanReadableFormattedPeriod", "(Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;ZLjava/lang/String;LS0/k;II)Ljava/lang/String;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormattingKt {
    @NotNull
    public static final String rememberHumanReadableFormattedPeriod(@NotNull StablePeriod period, boolean z11, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        String e11;
        Intrinsics.checkNotNullParameter(period, "period");
        interfaceC3967k.o(-1398696741);
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        if ((i12 & 4) != 0) {
            str = ProductContainerDTO.RATIO_DELIMITER;
        }
        interfaceC3967k.o(1683229879);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            n nVar = new n();
            nVar.q();
            nVar.r();
            nVar.d();
            nVar.e(str);
            nVar.f();
            nVar.e(str);
            nVar.h();
            C11 = nVar.t();
            interfaceC3967k.x(C11);
        }
        m mVar = (m) C11;
        interfaceC3967k.k();
        if (!z11 || period.getDays() < 1) {
            e11 = mVar.e(period);
            Intrinsics.f(e11);
        } else {
            e11 = h.a(interfaceC3967k).getQuantityString(R$plurals.regular_draw_days, period.getDays(), Arrays.copyOf(new Object[]{Integer.valueOf(period.getDays())}, 1));
        }
        interfaceC3967k.k();
        return e11;
    }
}
