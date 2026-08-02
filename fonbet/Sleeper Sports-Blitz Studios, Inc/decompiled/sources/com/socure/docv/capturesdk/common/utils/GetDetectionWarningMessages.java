package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/GetDetectionWarningMessages;", "", "getAdjustLightingMessage", "", "getBarcodeNotFoundMessage", "getBlurMessage", "getCornerDetectionFailedMessage", "getGuidingMessage", "detectionCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "getKeepSteadyMessage", "getLowBrightnessMessage", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface GetDetectionWarningMessages {
    String getAdjustLightingMessage();

    String getBarcodeNotFoundMessage();

    String getBlurMessage();

    String getCornerDetectionFailedMessage();

    String getGuidingMessage(DetectionCallback detectionCallback);

    String getKeepSteadyMessage();

    String getLowBrightnessMessage();
}
