package ru.ozon.app.android.error.summary.presentation.shared;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.Experiment;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapToSharedDto", "Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryExperimentSharedDTO;", "Lru/ozon/app/android/abtool/Experiment;", "error-summary_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryExperimentSharedDTOKt {
    @NotNull
    public static final ErrorSummaryExperimentSharedDTO mapToSharedDto(@NotNull Experiment experiment) {
        Intrinsics.checkNotNullParameter(experiment, "<this>");
        int id2 = experiment.getId();
        int variantId = experiment.getVariantId();
        String alias = experiment.getAlias();
        if (alias.length() <= 0) {
            alias = null;
        }
        return new ErrorSummaryExperimentSharedDTO(id2, variantId, alias);
    }
}
