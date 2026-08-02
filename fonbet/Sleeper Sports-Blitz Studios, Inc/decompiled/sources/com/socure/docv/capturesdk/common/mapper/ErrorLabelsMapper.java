package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.Mapper;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ErrorLabels;
import com.socure.docv.capturesdk.models.ErrorLabelsModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ErrorLabelsMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/ErrorLabelsMapper;", "Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "Lcom/socure/docv/capturesdk/models/ErrorLabelsModel;", "()V", "map", MetricTracker.Object.INPUT, "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ErrorLabelsMapper implements Mapper<ErrorLabels, ErrorLabelsModel> {
    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(List<? extends ErrorLabels> list, Continuation<? super List<? extends ErrorLabelsModel>> continuation) {
        return Mapper.DefaultImpls.map(this, list, continuation);
    }

    @Override // com.socure.docv.capturesdk.common.mapper.Mapper
    public Object map(ErrorLabels errorLabels, Continuation<? super ErrorLabelsModel> continuation) {
        String str;
        String str2;
        String str3;
        String str4;
        String desktop = errorLabels != null ? errorLabels.getDesktop() : null;
        if (desktop == null) {
            desktop = "";
        }
        String captureTypeNotSupported = errorLabels != null ? errorLabels.getCaptureTypeNotSupported() : null;
        if (captureTypeNotSupported == null) {
            captureTypeNotSupported = "";
        }
        String minimumResolution = errorLabels != null ? errorLabels.getMinimumResolution() : null;
        if (minimumResolution == null) {
            minimumResolution = "";
        }
        String cameraPermission = errorLabels != null ? errorLabels.getCameraPermission() : null;
        if (cameraPermission == null) {
            cameraPermission = "";
        }
        String unknown = errorLabels != null ? errorLabels.getUnknown() : null;
        if (unknown == null) {
            String str5 = cameraPermission;
            str4 = "";
            str = captureTypeNotSupported;
            str2 = minimumResolution;
            str3 = str5;
        } else {
            str = captureTypeNotSupported;
            str2 = minimumResolution;
            str3 = cameraPermission;
            str4 = unknown;
        }
        return new ErrorLabelsModel(desktop, str, str2, str3, str4);
    }
}
