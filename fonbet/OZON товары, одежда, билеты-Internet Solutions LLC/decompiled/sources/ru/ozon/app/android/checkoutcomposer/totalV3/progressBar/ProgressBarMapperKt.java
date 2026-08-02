package ru.ozon.app.android.checkoutcomposer.totalV3.progressBar;

import Ih.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;", "Ll20/d;", "info", "Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/totalV3/progressBar/ProgressBarVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressBarMapperKt {
    @NotNull
    public static final ProgressBarVO toVO(@NotNull ProgressBarDTO progressBarDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(progressBarDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        return new ProgressBarVO(a.a("ProgressBar-", info.d()), progressBarDTO.getDuration(), progressBarDTO.getTitle(), progressBarDTO.isInfinite());
    }
}
