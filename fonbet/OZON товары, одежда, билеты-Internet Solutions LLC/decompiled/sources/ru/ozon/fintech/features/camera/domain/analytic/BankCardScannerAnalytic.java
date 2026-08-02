package ru.ozon.fintech.features.camera.domain.analytic;

import G.g;
import g30.InterfaceC6618a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/fintech/features/camera/domain/analytic/BankCardScannerAnalytic;", "", "Lg30/a;", "fintechAnalyticInteractor", "<init>", "(Lg30/a;)V", "", "startCameraScanner", "()V", "", "errors", "saveError", "(Ljava/lang/String;)V", "", "isSuccess", "isFromOnDestroy", "endCameraScanner", "(ZZ)V", "Lg30/a;", "", "startTime", "Ljava/lang/Long;", "isClosed", "Z", "error", "Ljava/lang/String;", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BankCardScannerAnalytic {
    private static final int FLUCTUATION_LIMIT_SECONDS = 2;
    private static final int MILLS = 1000;
    private String error;

    @NotNull
    private final InterfaceC6618a fintechAnalyticInteractor;
    private boolean isClosed;
    private Long startTime;

    public BankCardScannerAnalytic(@NotNull InterfaceC6618a fintechAnalyticInteractor) {
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.fintechAnalyticInteractor = fintechAnalyticInteractor;
    }

    public static /* synthetic */ void endCameraScanner$default(BankCardScannerAnalytic bankCardScannerAnalytic, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        bankCardScannerAnalytic.endCameraScanner(z11, z12);
    }

    public final void endCameraScanner(boolean isSuccess, boolean isFromOnDestroy) {
        if (this.isClosed) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l11 = this.startTime;
        long longValue = (currentTimeMillis - (l11 != null ? l11.longValue() : 0L)) / 1000;
        if (isFromOnDestroy && longValue <= 2) {
            this.isClosed = true;
        } else {
            this.fintechAnalyticInteractor.x0(isSuccess, this.error, Long.valueOf(longValue));
            this.isClosed = true;
        }
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

    public final void startCameraScanner() {
        this.isClosed = false;
        this.startTime = Long.valueOf(System.currentTimeMillis());
    }
}
