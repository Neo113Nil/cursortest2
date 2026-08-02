package ru.ozon.fintech.features.camera.domain.analytic;

import G.g;
import g30.InterfaceC6618a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ-\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/PhoneScannerAnalytic;", "", "Lg30/a;", "fintechAnalyticInteractor", "<init>", "(Lg30/a;)V", "", "phoneReg", "", "startCameraScanner", "(Ljava/lang/String;)V", "errors", "saveError", "", "isSuccess", "isFromOnDestroy", "", "result", "endCameraScanner", "(ZZLjava/util/List;)V", "Lg30/a;", "", "startTime", "Ljava/lang/Long;", "phoneRegex", "Ljava/lang/String;", "isClosed", "Z", "error", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneScannerAnalytic {
    private static final int FLUCTUATION_LIMIT_SECONDS = 2;
    private static final int MILLS = 1000;
    private String error;

    @NotNull
    private final InterfaceC6618a fintechAnalyticInteractor;
    private boolean isClosed;
    private String phoneRegex;
    private Long startTime;

    public PhoneScannerAnalytic(@NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.fintechAnalyticInteractor = fintechAnalyticInteractor;
    }

    public static /* synthetic */ void endCameraScanner$default(PhoneScannerAnalytic phoneScannerAnalytic, boolean z11, boolean z12, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        phoneScannerAnalytic.endCameraScanner(z11, z12, list);
    }

    public final void endCameraScanner(boolean isSuccess, boolean isFromOnDestroy, @NotNull List<String> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.isClosed) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l11 = this.startTime;
        long longValue = (currentTimeMillis - (l11 != null ? l11.longValue() : 0L)) / 1000;
        if (isFromOnDestroy && longValue <= 2) {
            this.isClosed = true;
            return;
        }
        InterfaceC6618a interfaceC6618a = this.fintechAnalyticInteractor;
        String str = this.phoneRegex;
        if (str == null) {
            str = "";
        }
        interfaceC6618a.K(str, isSuccess, result, this.error, Long.valueOf(longValue));
        this.isClosed = true;
    }

    public final void saveError(@NotNull String errors) {
        String c11;
        Intrinsics.checkNotNullParameter(errors, "errors");
        String str = this.error;
        if (str != null && (c11 = g.c(str, "; ", errors)) != null) {
            errors = c11;
        }
        this.error = errors;
    }

    public final void startCameraScanner(String phoneReg) {
        this.isClosed = false;
        this.startTime = Long.valueOf(System.currentTimeMillis());
        this.phoneRegex = phoneReg;
    }
}
