package ru.ozon.app.android.ads.widgets.advPageStay.presentation;

import WZ.l;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayVO;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewModel;", "Landroidx/lifecycle/w0;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(LWZ/l;)V", "", "Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayVO$AdvEvent;", "events", "", "startTimer", "(Ljava/util/List;)V", "pauseTimer", "()V", "LWZ/l;", "", "isPaused", "Z", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvPageStayViewModel extends w0 {
    private boolean isPaused;

    @NotNull
    private final l tokenizedAnalytics;

    public AdvPageStayViewModel(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final void pauseTimer() {
        this.isPaused = true;
    }

    public final void startTimer(@NotNull List<AdvPageStayVO.AdvEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.isPaused = false;
        ArrayList arrayList = new ArrayList();
        for (Object obj : events) {
            if (((AdvPageStayVO.AdvEvent) obj).getDelayMS() > 0) {
                arrayList.add(obj);
            }
        }
        C10727i.c(x0.a(this), null, null, new AdvPageStayViewModel$startTimer$1(arrayList, this, null), 3);
    }
}
