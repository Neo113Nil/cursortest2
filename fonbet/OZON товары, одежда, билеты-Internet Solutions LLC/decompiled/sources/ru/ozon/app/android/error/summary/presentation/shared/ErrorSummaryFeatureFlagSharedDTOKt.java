package ru.ozon.app.android.error.summary.presentation.shared;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.FeatureFlag;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapToSharedDto", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryFeatureFlagSharedDTO;", "Lru/ozon/app/android/abtool/FeatureFlag;", "error-summary_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryFeatureFlagSharedDTOKt {
    @NotNull
    public static final ErrorSummaryFeatureFlagSharedDTO mapToSharedDto(@NotNull FeatureFlag featureFlag) {
        Intrinsics.checkNotNullParameter(featureFlag, "<this>");
        return new ErrorSummaryFeatureFlagSharedDTO(featureFlag.getServiceName(), featureFlag.getName(), featureFlag.getValue(), featureFlag.getLocalValue(), featureFlag.getUpdateStrategy());
    }
}
