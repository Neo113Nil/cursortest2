package ru.ozon.app.android.mediaupload.video;

import Sc.s;
import Wc.a;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import ru.ozon.app.android.mediaupload.video.dto.VideoValidationError;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationEvent;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationWebSocket;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent;", "Ljava/io/FileInputStream;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$validationResult$2", f = "VideoNetworkDataStore.kt", l = {226, 241}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoNetworkDataStore$validate$validationResult$2 extends j implements Function2<Pair<? extends VideoValidationEvent, ? extends FileInputStream>, d<? super Unit>, Object> {
    final /* synthetic */ L $contentLength;
    final /* synthetic */ VideoValidationWebSocket $socket;
    final /* synthetic */ long $startMs;
    final /* synthetic */ String $uploadProcessId;
    final /* synthetic */ String $uploadRequestId;
    final /* synthetic */ String $videoType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoNetworkDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoNetworkDataStore$validate$validationResult$2(VideoValidationWebSocket videoValidationWebSocket, String str, VideoNetworkDataStore videoNetworkDataStore, String str2, L l11, String str3, long j11, d<? super VideoNetworkDataStore$validate$validationResult$2> dVar) {
        super(2, dVar);
        this.$socket = videoValidationWebSocket;
        this.$videoType = str;
        this.this$0 = videoNetworkDataStore;
        this.$uploadProcessId = str2;
        this.$contentLength = l11;
        this.$uploadRequestId = str3;
        this.$startMs = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        VideoNetworkDataStore$validate$validationResult$2 videoNetworkDataStore$validate$validationResult$2 = new VideoNetworkDataStore$validate$validationResult$2(this.$socket, this.$videoType, this.this$0, this.$uploadProcessId, this.$contentLength, this.$uploadRequestId, this.$startMs, dVar);
        videoNetworkDataStore$validate$validationResult$2.L$0 = obj;
        return videoNetworkDataStore$validate$validationResult$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        if (r15.addMetric(r1, r3, r14) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VideoUploadMetricsManager videoUploadMetricsManager;
        VideoUploadMetricsManager videoUploadMetricsManager2;
        VideoValidationEvent videoValidationEvent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                videoValidationEvent = (VideoValidationEvent) this.L$0;
                s.b(obj);
                throw new VideoValidationError(((VideoValidationEvent.ValidResult.ValidError) videoValidationEvent).getUserMessage());
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
        s.b(obj);
        Pair pair = (Pair) this.L$0;
        VideoValidationEvent videoValidationEvent2 = (VideoValidationEvent) pair.a();
        FileInputStream fileInputStream = (FileInputStream) pair.b();
        if (Intrinsics.d(videoValidationEvent2, VideoValidationEvent.Connected.INSTANCE)) {
            this.$socket.sendVideoType(this.$videoType);
        } else {
            if (!(videoValidationEvent2 instanceof VideoValidationEvent.NextPart)) {
                if (videoValidationEvent2 instanceof VideoValidationEvent.ValidResult.ValidError) {
                    videoUploadMetricsManager2 = this.this$0.videoUploadMetricsManager;
                    String str = this.$uploadProcessId;
                    UploadMetricEvent.UploadStep uploadStep = new UploadMetricEvent.UploadStep(new UploadMetricEvent.EventType.Validate(this.$contentLength.f71786a), this.$uploadRequestId, this.$startMs, 0, 0L, 16, null);
                    this.L$0 = videoValidationEvent2;
                    this.label = 1;
                    if (videoUploadMetricsManager2.addMetric(str, uploadStep, this) != aVar) {
                        videoValidationEvent = videoValidationEvent2;
                        throw new VideoValidationError(((VideoValidationEvent.ValidResult.ValidError) videoValidationEvent).getUserMessage());
                    }
                } else if (videoValidationEvent2 instanceof VideoValidationEvent.Error) {
                    videoUploadMetricsManager = this.this$0.videoUploadMetricsManager;
                    String str2 = this.$uploadProcessId;
                    UploadMetricEvent.UploadStep uploadStep2 = new UploadMetricEvent.UploadStep(new UploadMetricEvent.EventType.Validate(this.$contentLength.f71786a), this.$uploadRequestId, this.$startMs, 0, 0L, 16, null);
                    this.label = 2;
                }
                return aVar;
            }
            VideoValidationEvent.NextPart nextPart = (VideoValidationEvent.NextPart) videoValidationEvent2;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nextPart.getSize());
            L l11 = this.$contentLength;
            VideoValidationWebSocket videoValidationWebSocket = this.$socket;
            fileInputStream.getChannel().position(nextPart.getFrom());
            l11.f71786a += fileInputStream.getChannel().read(allocateDirect);
            allocateDirect.rewind();
            byte[] bArr = new byte[nextPart.getSize()];
            allocateDirect.get(bArr);
            videoValidationWebSocket.nextPart(bArr);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends VideoValidationEvent, ? extends FileInputStream> pair, d<? super Unit> dVar) {
        return ((VideoNetworkDataStore$validate$validationResult$2) create(pair, dVar)).invokeSuspend(Unit.f71690a);
    }
}
