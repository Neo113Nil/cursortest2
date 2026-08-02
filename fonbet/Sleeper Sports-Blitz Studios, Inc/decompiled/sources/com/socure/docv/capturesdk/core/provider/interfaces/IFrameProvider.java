package com.socure.docv.capturesdk.core.provider.interfaces;

import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import io.sentry.protocol.SentryThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: IFrameProvider.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0011\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u000eH&J\b\u0010\u0013\u001a\u00020\u000eH&J(\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006RD\u0010\u0007\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/socure/docv/capturesdk/core/provider/interfaces/IFrameProvider;", "", "cropViewCoordinates", "", "", "getCropViewCoordinates", "()Ljava/util/List;", "frameListener", "Lkotlin/Function2;", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "Lkotlin/ParameterName;", "name", "previous", SentryThread.JsonKeys.CURRENT, "", "getFrameListener", "()Lkotlin/jvm/functions/Function2;", "freeze", "startGeneratingFrame", "stopGeneratingFrame", "takePicture", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "currentCount", "", "viewDimensions", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "captureListener", "Lcom/socure/docv/capturesdk/core/provider/interfaces/CaptureListener;", "toggleAnalysisMode", "enable", "", "updateViewDimensions", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IFrameProvider {
    void freeze();

    List<List<Double>> getCropViewCoordinates();

    Function2<ExtractedImageData, ExtractedImageData, Unit> getFrameListener();

    void startGeneratingFrame();

    void stopGeneratingFrame();

    void takePicture(CaptureType captureType, int currentCount, ViewDimensions viewDimensions, CaptureListener captureListener);

    void toggleAnalysisMode(boolean enable);

    void updateViewDimensions(ViewDimensions viewDimensions);
}
