package ru.ozon.app.android.mediaupload.video.metrics.manager;

import P4.f;
import Sc.o;
import Sc.s;
import Sg.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.L;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingMetricsApi;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricsRequestBody;
import ru.ozon.app.android.mediaupload.video.metrics.network.VideoUploadServerTimingsParser;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManagerImpl$sendPerfMetrics$1", f = "VideoUploadMetricsManagerImpl.kt", l = {144}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoUploadMetricsManagerImpl$sendPerfMetrics$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<UploadMetricEvent> $metricsList;
    final /* synthetic */ String $uploadProcessId;
    int label;
    final /* synthetic */ VideoUploadMetricsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VideoUploadMetricsManagerImpl$sendPerfMetrics$1(VideoUploadMetricsManagerImpl videoUploadMetricsManagerImpl, List<? extends UploadMetricEvent> list, String str, d<? super VideoUploadMetricsManagerImpl$sendPerfMetrics$1> dVar) {
        super(2, dVar);
        this.this$0 = videoUploadMetricsManagerImpl;
        this.$metricsList = list;
        this.$uploadProcessId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoUploadMetricsManagerImpl$sendPerfMetrics$1(this.this$0, this.$metricsList, this.$uploadProcessId, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        VideoUploadingMetricsApi videoUploadingMetricsApi;
        String str;
        String str2;
        VideoUploadServerTimingsParser videoUploadServerTimingsParser;
        Rg.a a11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ArrayList arrayList = new ArrayList();
            aVar = this.this$0.analyticsScreenStorage;
            a d11 = aVar.d();
            String c11 = (d11 == null || (a11 = d11.a()) == null) ? null : a11.c();
            String str3 = "";
            String str4 = c11 == null ? "" : c11;
            I i12 = new I();
            I i13 = new I();
            kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            m11.f71787a = "";
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            m12.f71787a = "";
            L l11 = new L();
            L l12 = new L();
            L l13 = new L();
            List<UploadMetricEvent> list = this.$metricsList;
            VideoUploadMetricsManagerImpl videoUploadMetricsManagerImpl = this.this$0;
            for (UploadMetricEvent uploadMetricEvent : list) {
                if (uploadMetricEvent instanceof UploadMetricEvent.FinishStep) {
                    UploadMetricEvent.FinishStep finishStep = (UploadMetricEvent.FinishStep) uploadMetricEvent;
                    str2 = str3;
                    l12.f71786a = finishStep.getEndMs();
                    i12.f71783a = finishStep.getIsCanceled();
                    i13.f71783a = finishStep.getIsFinished();
                } else {
                    str2 = str3;
                    if (uploadMetricEvent instanceof UploadMetricEvent.InitStep) {
                        UploadMetricEvent.InitStep initStep = (UploadMetricEvent.InitStep) uploadMetricEvent;
                        l11.f71786a = initStep.getStartMs();
                        m12.f71787a = initStep.getVideoType();
                    } else {
                        if (!(uploadMetricEvent instanceof UploadMetricEvent.UploadStep)) {
                            throw new o();
                        }
                        UploadMetricEvent.UploadStep uploadStep = (UploadMetricEvent.UploadStep) uploadMetricEvent;
                        String eventTypeName = uploadStep.getEventType().getEventTypeName();
                        String uploadRequestId = uploadStep.getUploadRequestId();
                        long startMs = uploadStep.getStartMs();
                        long endMs = uploadStep.getEndMs();
                        Long requestContentLength = uploadStep.getRequestContentLength();
                        int responseCode = uploadStep.getResponseCode();
                        videoUploadServerTimingsParser = videoUploadMetricsManagerImpl.serverTimingParser;
                        arrayList.add(new UploadMetricsRequestBody.Event(eventTypeName, uploadRequestId, startMs, endMs, requestContentLength, responseCode, videoUploadServerTimingsParser.parseServerTimings(uploadStep.getRawServerTimings())));
                        UploadMetricEvent.EventType eventType = uploadStep.getEventType();
                        if (eventType instanceof UploadMetricEvent.EventType.CreateUploadId) {
                            String uploadId = ((UploadMetricEvent.EventType.CreateUploadId) uploadStep.getEventType()).getUploadId();
                            T t2 = uploadId;
                            if (uploadId == null) {
                                t2 = str2;
                            }
                            m11.f71787a = t2;
                        } else if (eventType instanceof UploadMetricEvent.EventType.Validate) {
                            l13.f71786a = ((UploadMetricEvent.EventType.Validate) uploadStep.getEventType()).getRequestContentLength() + l13.f71786a;
                        } else if (eventType instanceof UploadMetricEvent.EventType.UploadV2) {
                            l13.f71786a = ((UploadMetricEvent.EventType.UploadV2) uploadStep.getEventType()).getRequestContentLength() + l13.f71786a;
                        }
                    }
                }
                str3 = str2;
            }
            arrayList.add(new UploadMetricsRequestBody.Event("Total", f.b("toString(...)"), l11.f71786a, l12.f71786a, new Long(l13.f71786a), 0, null));
            videoUploadingMetricsApi = this.this$0.uploadingMetricsApi;
            String str5 = (String) m11.f71787a;
            String str6 = this.$uploadProcessId;
            String str7 = (String) m12.f71787a;
            str = this.this$0.domain;
            UploadMetricsRequestBody uploadMetricsRequestBody = new UploadMetricsRequestBody(str5, str6, "android_bx_uploader", "1.0", "review", str7, str, str4, i13.f71783a, i12.f71783a, arrayList);
            this.label = 1;
            if (videoUploadingMetricsApi.sendUploadMetrics(uploadMetricsRequestBody, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VideoUploadMetricsManagerImpl$sendPerfMetrics$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
