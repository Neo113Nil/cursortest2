package ru.ozon.app.android.mediaupload.video;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import He.b;
import P4.f;
import Pc.a;
import Sc.s;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.ranges.IntRange;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import retrofit2.Response;
import ru.ozon.app.android.mediaupload.di.factory.ChunksUploaderFactory;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingComposerApi;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationEvent;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationWebSocket;
import ru.ozon.app.android.utils.UriExtKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u001c\u0010\u001eJB\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b%\u0010&J3\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\"¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/mediaupload/video/VideoNetworkDataStore;", "", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingComposerApi;", "composerUploadingApi", "LPc/a;", "Lru/ozon/app/android/mediaupload/video/validation/VideoValidationWebSocket;", "socketsProvider", "Lru/ozon/app/android/mediaupload/di/factory/ChunksUploaderFactory;", "chunksUploader", "Landroid/content/Context;", "appContext", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "videoUploadMetricsManager", "<init>", "(Lru/ozon/app/android/mediaupload/video/api/VideoUploadingComposerApi;LPc/a;Lru/ozon/app/android/mediaupload/di/factory/ChunksUploaderFactory;Landroid/content/Context;Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;)V", "Ljava/security/MessageDigest;", "digest", "Landroid/net/Uri;", "videoUri", "", "getFileChecksum", "(Ljava/security/MessageDigest;Landroid/net/Uri;)Ljava/lang/String;", "socket", "Ljava/io/FileInputStream;", "inputStream", "videoType", "uploadProcessId", "Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent$ValidResult$ValidOk;", "validate", "(Lru/ozon/app/android/mediaupload/video/validation/VideoValidationWebSocket;Ljava/io/FileInputStream;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "actionName", "Lorg/json/JSONObject;", "ffprobe", "", "sendWithoutChecksum", "Lru/ozon/app/android/mediaupload/video/NewUploadingResponse;", "getUploadingId", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "fileUri", "uploadingId", "retryChunksUploadWithFallback", "LAe/h;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "upload", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)LAe/h;", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingComposerApi;", "LPc/a;", "Lru/ozon/app/android/mediaupload/di/factory/ChunksUploaderFactory;", "Landroid/content/Context;", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoNetworkDataStore {

    @NotNull
    private final Context appContext;

    @NotNull
    private final ChunksUploaderFactory chunksUploader;

    @NotNull
    private final VideoUploadingComposerApi composerUploadingApi;

    @NotNull
    private final a<VideoValidationWebSocket> socketsProvider;

    @NotNull
    private final VideoUploadMetricsManager videoUploadMetricsManager;

    public VideoNetworkDataStore(@NotNull VideoUploadingComposerApi composerUploadingApi, @NotNull a<VideoValidationWebSocket> socketsProvider, @NotNull ChunksUploaderFactory chunksUploader, @NotNull Context appContext, @NotNull VideoUploadMetricsManager videoUploadMetricsManager) {
        Intrinsics.checkNotNullParameter(composerUploadingApi, "composerUploadingApi");
        Intrinsics.checkNotNullParameter(socketsProvider, "socketsProvider");
        Intrinsics.checkNotNullParameter(chunksUploader, "chunksUploader");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(videoUploadMetricsManager, "videoUploadMetricsManager");
        this.composerUploadingApi = composerUploadingApi;
        this.socketsProvider = socketsProvider;
        this.chunksUploader = chunksUploader;
        this.appContext = appContext;
        this.videoUploadMetricsManager = videoUploadMetricsManager;
    }

    private final String getFileChecksum(MessageDigest digest, Uri videoUri) {
        InputStream openInputStream = this.appContext.getContentResolver().openInputStream(videoUri);
        if (openInputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    Unit unit = Unit.f71690a;
                    openInputStream.close();
                    byte[] digest2 = digest.digest();
                    Intrinsics.f(digest2);
                    Intrinsics.checkNotNullParameter(digest2, "<this>");
                    Intrinsics.checkNotNullParameter(digest2, "<this>");
                    return C7714v.V(new IntRange(0, digest2.length - 1, 1), "", null, null, new VideoNetworkDataStore$getFileChecksum$2(digest2), 30);
                }
                digest.update(bArr, 0, read);
            }
        } finally {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|8|(2:55|(1:(1:(1:(3:60|25|26)(2:61|62))(2:63|64))(4:65|66|67|50))(4:68|69|70|18))(8:10|(1:12)(1:54)|13|(3:39|40|(1:42)(8:43|44|45|46|47|(2:49|50)|30|31))|15|(2:17|18)|30|31)|19|20|(1:22)(1:28)|23))|74|6|7|8|(0)(0)|19|20|(0)(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0131, code lost:
    
        if (r2 != r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore] */
    /* JADX WARN: Type inference failed for: r11v12, types: [ru.ozon.app.android.mediaupload.video.api.VideoUploadingComposerApi] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v10, types: [ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent, ru.ozon.app.android.mediaupload.video.metrics.data.UploadMetricEvent$UploadStep] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [ru.ozon.app.android.mediaupload.video.api.VideoUploadingComposerApi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUploadingId(String str, @NotNull JSONObject jSONObject, @NotNull String str2, @NotNull Uri uri, @NotNull String str3, boolean z11, @NotNull d<? super NewUploadingResponse> dVar) {
        VideoNetworkDataStore$getUploadingId$1 videoNetworkDataStore$getUploadingId$1;
        ?? r52;
        long j11;
        String str4;
        VideoUploadMetricsManager videoUploadMetricsManager;
        UploadMetricEvent.UploadStep uploadStep;
        long j12;
        long j13;
        long j14;
        NewUploadingResponse newUploadingResponse;
        VideoNetworkDataStore videoNetworkDataStore;
        String str5;
        Response response;
        VideoNetworkDataStore videoNetworkDataStore2;
        String str6;
        String fileChecksum;
        String str7 = str3;
        if (dVar instanceof VideoNetworkDataStore$getUploadingId$1) {
            videoNetworkDataStore$getUploadingId$1 = (VideoNetworkDataStore$getUploadingId$1) dVar;
            int i11 = videoNetworkDataStore$getUploadingId$1.label;
            if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                videoNetworkDataStore$getUploadingId$1.label = i11 - LinearLayoutManager.INVALID_OFFSET;
                VideoNetworkDataStore$getUploadingId$1 videoNetworkDataStore$getUploadingId$12 = videoNetworkDataStore$getUploadingId$1;
                Object obj = videoNetworkDataStore$getUploadingId$12.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                r52 = videoNetworkDataStore$getUploadingId$12.label;
                ?? r11 = 1;
                ?? r112 = 1;
                if (r52 != 0) {
                    s.b(obj);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    if (z11) {
                        fileChecksum = null;
                    } else {
                        Intrinsics.f(messageDigest);
                        fileChecksum = getFileChecksum(messageDigest, uri);
                    }
                    r52 = f.b("toString(...)");
                    j12 = System.currentTimeMillis();
                    if (str != null) {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (!h.K(str)) {
                            ?? r113 = this.composerUploadingApi;
                            NewUploadingRequest newUploadingRequest = new NewUploadingRequest(jSONObject, str2, fileChecksum);
                            videoNetworkDataStore$getUploadingId$12.L$0 = this;
                            videoNetworkDataStore$getUploadingId$12.L$1 = str7;
                            videoNetworkDataStore$getUploadingId$12.L$2 = r52;
                            videoNetworkDataStore$getUploadingId$12.J$0 = j12;
                            videoNetworkDataStore$getUploadingId$12.label = 2;
                            try {
                                Object newUploading = r113.newUploading(str7, r52, str, newUploadingRequest, videoNetworkDataStore$getUploadingId$12);
                                String str8 = r52;
                                r52 = str8;
                                j12 = j12;
                                if (newUploading != aVar) {
                                    obj = newUploading;
                                    videoNetworkDataStore = this;
                                    str5 = str8;
                                    j14 = j12;
                                    response = (Response) obj;
                                    r52 = str5;
                                    r11 = videoNetworkDataStore;
                                    j12 = j14;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r52 = r52;
                                r11 = this;
                                str4 = r52;
                                j11 = j12;
                                r112 = r11;
                                videoUploadMetricsManager = r112.videoUploadMetricsManager;
                                uploadStep = new UploadMetricEvent.UploadStep(new UploadMetricEvent.EventType.CreateUploadId(null), str4, j11, 0, 0L, 16, null);
                                videoNetworkDataStore$getUploadingId$12.L$0 = th;
                                videoNetworkDataStore$getUploadingId$12.L$1 = null;
                                videoNetworkDataStore$getUploadingId$12.L$2 = null;
                                videoNetworkDataStore$getUploadingId$12.label = 3;
                                if (videoUploadMetricsManager.addMetric(str7, uploadStep, videoNetworkDataStore$getUploadingId$12) != aVar) {
                                }
                            }
                            return aVar;
                        }
                    }
                    ?? r62 = this.composerUploadingApi;
                    NewUploadingRequest newUploadingRequest2 = new NewUploadingRequest(jSONObject, str2, fileChecksum);
                    videoNetworkDataStore$getUploadingId$12.L$0 = this;
                    videoNetworkDataStore$getUploadingId$12.L$1 = str7;
                    videoNetworkDataStore$getUploadingId$12.L$2 = r52;
                    videoNetworkDataStore$getUploadingId$12.J$0 = j12;
                    videoNetworkDataStore$getUploadingId$12.label = 1;
                    obj = r62.newUploading(str7, r52, newUploadingRequest2, videoNetworkDataStore$getUploadingId$12);
                    r52 = r52;
                    j12 = j12;
                    if (obj != aVar) {
                        videoNetworkDataStore2 = this;
                        str6 = r52;
                        j13 = j12;
                        response = (Response) obj;
                        r52 = str6;
                        r11 = videoNetworkDataStore2;
                        j12 = j13;
                    }
                    return aVar;
                }
                try {
                    if (r52 == 1) {
                        long j15 = videoNetworkDataStore$getUploadingId$12.J$0;
                        String str9 = (String) videoNetworkDataStore$getUploadingId$12.L$2;
                        String str10 = (String) videoNetworkDataStore$getUploadingId$12.L$1;
                        VideoNetworkDataStore videoNetworkDataStore3 = (VideoNetworkDataStore) videoNetworkDataStore$getUploadingId$12.L$0;
                        s.b(obj);
                        j13 = j15;
                        str7 = str10;
                        str6 = str9;
                        videoNetworkDataStore2 = videoNetworkDataStore3;
                        response = (Response) obj;
                        r52 = str6;
                        r11 = videoNetworkDataStore2;
                        j12 = j13;
                    } else {
                        if (r52 != 2) {
                            if (r52 == 3) {
                                Throwable th4 = (Throwable) videoNetworkDataStore$getUploadingId$12.L$0;
                                s.b(obj);
                                throw th4;
                            }
                            if (r52 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            newUploadingResponse = (NewUploadingResponse) videoNetworkDataStore$getUploadingId$12.L$0;
                            s.b(obj);
                            Intrinsics.f(newUploadingResponse);
                            return newUploadingResponse;
                        }
                        long j16 = videoNetworkDataStore$getUploadingId$12.J$0;
                        String str11 = (String) videoNetworkDataStore$getUploadingId$12.L$2;
                        String str12 = (String) videoNetworkDataStore$getUploadingId$12.L$1;
                        VideoNetworkDataStore videoNetworkDataStore4 = (VideoNetworkDataStore) videoNetworkDataStore$getUploadingId$12.L$0;
                        s.b(obj);
                        j14 = j16;
                        str7 = str12;
                        str5 = str11;
                        videoNetworkDataStore = videoNetworkDataStore4;
                        response = (Response) obj;
                        r52 = str5;
                        r11 = videoNetworkDataStore;
                        j12 = j14;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j11 = str2;
                    str4 = r52;
                    str7 = 2;
                    videoUploadMetricsManager = r112.videoUploadMetricsManager;
                    uploadStep = new UploadMetricEvent.UploadStep(new UploadMetricEvent.EventType.CreateUploadId(null), str4, j11, 0, 0L, 16, null);
                    videoNetworkDataStore$getUploadingId$12.L$0 = th;
                    videoNetworkDataStore$getUploadingId$12.L$1 = null;
                    videoNetworkDataStore$getUploadingId$12.L$2 = null;
                    videoNetworkDataStore$getUploadingId$12.label = 3;
                    if (videoUploadMetricsManager.addMetric(str7, uploadStep, videoNetworkDataStore$getUploadingId$12) != aVar) {
                        return aVar;
                    }
                    throw th;
                }
                String str13 = r52;
                long j17 = j12;
                int code = response.code();
                newUploadingResponse = (NewUploadingResponse) response.body();
                String uploadId = newUploadingResponse == null ? newUploadingResponse.getUploadId() : null;
                ?? r42 = r11.videoUploadMetricsManager;
                ?? uploadStep2 = new UploadMetricEvent.UploadStep(new UploadMetricEvent.EventType.CreateUploadId(uploadId), str13, j17, code, 0L, 16, null);
                videoNetworkDataStore$getUploadingId$12.L$0 = newUploadingResponse;
                videoNetworkDataStore$getUploadingId$12.L$1 = null;
                videoNetworkDataStore$getUploadingId$12.L$2 = null;
                videoNetworkDataStore$getUploadingId$12.label = 4;
                Object addMetric = r42.addMetric(str7, uploadStep2, videoNetworkDataStore$getUploadingId$12);
                r52 = r52;
                j12 = uploadStep2;
            }
        }
        videoNetworkDataStore$getUploadingId$1 = new VideoNetworkDataStore$getUploadingId$1(this, dVar);
        VideoNetworkDataStore$getUploadingId$1 videoNetworkDataStore$getUploadingId$122 = videoNetworkDataStore$getUploadingId$1;
        Object obj2 = videoNetworkDataStore$getUploadingId$122.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        r52 = videoNetworkDataStore$getUploadingId$122.label;
        ?? r114 = 1;
        ?? r1122 = 1;
        if (r52 != 0) {
        }
        String str132 = r52;
        long j172 = j12;
        int code2 = response.code();
        newUploadingResponse = (NewUploadingResponse) response.body();
        if (newUploadingResponse == null) {
        }
        ?? r422 = r114.videoUploadMetricsManager;
        ?? uploadStep22 = new UploadMetricEvent.UploadStep(new UploadMetricEvent.EventType.CreateUploadId(uploadId), str132, j172, code2, 0L, 16, null);
        videoNetworkDataStore$getUploadingId$122.L$0 = newUploadingResponse;
        videoNetworkDataStore$getUploadingId$122.L$1 = null;
        videoNetworkDataStore$getUploadingId$122.L$2 = null;
        videoNetworkDataStore$getUploadingId$122.label = 4;
        Object addMetric2 = r422.addMetric(str7, uploadStep22, videoNetworkDataStore$getUploadingId$122);
        r52 = r52;
        j12 = uploadStep22;
    }

    @NotNull
    public final InterfaceC2395h<UploadingProgress> upload(@NotNull Uri fileUri, @NotNull String uploadingId, @NotNull String uploadProcessId, boolean retryChunksUploadWithFallback) {
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(uploadingId, "uploadingId");
        Intrinsics.checkNotNullParameter(uploadProcessId, "uploadProcessId");
        ContentResolver contentResolver = this.appContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        long fileSize = UriExtKt.getFileSize(fileUri, contentResolver);
        if (fileSize != -1) {
            return new C2408n0(this.chunksUploader.create(uploadingId, uploadProcessId, fileUri, fileSize, retryChunksUploadWithFallback).startUploadByChunks(), new VideoNetworkDataStore$upload$2(this, uploadProcessId, null));
        }
        throw new IllegalArgumentException("Invalid file size");
    }

    public final Object validate(@NotNull Uri uri, @NotNull String str, @NotNull String str2, @NotNull d<? super VideoValidationEvent.ValidResult.ValidOk> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new VideoNetworkDataStore$validate$2(this, uri, str, str2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0160, code lost:
    
        if (r2 != r4) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validate(VideoValidationWebSocket videoValidationWebSocket, FileInputStream fileInputStream, String str, String str2, d<? super VideoValidationEvent.ValidResult.ValidOk> dVar) {
        VideoNetworkDataStore$validate$3 videoNetworkDataStore$validate$3;
        Wc.a aVar;
        int i11;
        VideoValidationWebSocket videoValidationWebSocket2;
        VideoNetworkDataStore videoNetworkDataStore;
        Object obj;
        String str3;
        String str4;
        VideoUploadMetricsManager videoUploadMetricsManager;
        UploadMetricEvent.InitStep initStep;
        VideoNetworkDataStore videoNetworkDataStore2;
        VideoValidationWebSocket videoValidationWebSocket3;
        String str5;
        final FileInputStream fileInputStream2;
        String str6;
        long j11;
        VideoNetworkDataStore videoNetworkDataStore3;
        String str7;
        L l11;
        String str8;
        long j12;
        FileInputStream fileInputStream3 = fileInputStream;
        if (dVar instanceof VideoNetworkDataStore$validate$3) {
            videoNetworkDataStore$validate$3 = (VideoNetworkDataStore$validate$3) dVar;
            int i12 = videoNetworkDataStore$validate$3.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                videoNetworkDataStore$validate$3.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = videoNetworkDataStore$validate$3.result;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = videoNetworkDataStore$validate$3.label;
                if (i11 != 0) {
                    s.b(obj2);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    VideoNetworkDataStore$validate$fileSize$1 videoNetworkDataStore$validate$fileSize$1 = new VideoNetworkDataStore$validate$fileSize$1(fileInputStream3, null);
                    videoNetworkDataStore$validate$3.L$0 = this;
                    videoValidationWebSocket2 = videoValidationWebSocket;
                    videoNetworkDataStore$validate$3.L$1 = videoValidationWebSocket2;
                    videoNetworkDataStore$validate$3.L$2 = fileInputStream3;
                    videoNetworkDataStore$validate$3.L$3 = str;
                    videoNetworkDataStore$validate$3.L$4 = str2;
                    videoNetworkDataStore$validate$3.label = 1;
                    Object f7 = C10727i.f(bVar, videoNetworkDataStore$validate$fileSize$1, videoNetworkDataStore$validate$3);
                    if (f7 != aVar) {
                        videoNetworkDataStore = this;
                        obj = f7;
                        str3 = str2;
                        str4 = str;
                    }
                }
                if (i11 == 1) {
                    String str9 = (String) videoNetworkDataStore$validate$3.L$4;
                    String str10 = (String) videoNetworkDataStore$validate$3.L$3;
                    FileInputStream fileInputStream4 = (FileInputStream) videoNetworkDataStore$validate$3.L$2;
                    videoValidationWebSocket2 = (VideoValidationWebSocket) videoNetworkDataStore$validate$3.L$1;
                    VideoNetworkDataStore videoNetworkDataStore4 = (VideoNetworkDataStore) videoNetworkDataStore$validate$3.L$0;
                    s.b(obj2);
                    str4 = str10;
                    obj = obj2;
                    str3 = str9;
                    fileInputStream3 = fileInputStream4;
                    videoNetworkDataStore = videoNetworkDataStore4;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            VideoValidationEvent.ValidResult.ValidOk validOk = (VideoValidationEvent.ValidResult.ValidOk) videoNetworkDataStore$validate$3.L$0;
                            s.b(obj2);
                            return validOk;
                        }
                        j12 = videoNetworkDataStore$validate$3.J$0;
                        l11 = (L) videoNetworkDataStore$validate$3.L$3;
                        str8 = (String) videoNetworkDataStore$validate$3.L$2;
                        str7 = (String) videoNetworkDataStore$validate$3.L$1;
                        videoNetworkDataStore3 = (VideoNetworkDataStore) videoNetworkDataStore$validate$3.L$0;
                        s.b(obj2);
                        String str11 = str8;
                        long j13 = j12;
                        VideoValidationEvent.ValidResult.ValidOk validOk2 = (VideoValidationEvent.ValidResult.ValidOk) obj2;
                        VideoUploadMetricsManager videoUploadMetricsManager2 = videoNetworkDataStore3.videoUploadMetricsManager;
                        UploadMetricEvent.UploadStep uploadStep = new UploadMetricEvent.UploadStep(new UploadMetricEvent.EventType.Validate(l11.f71786a), str11, j13, 0, 0L, 16, null);
                        videoNetworkDataStore$validate$3.L$0 = validOk2;
                        videoNetworkDataStore$validate$3.L$1 = null;
                        videoNetworkDataStore$validate$3.L$2 = null;
                        videoNetworkDataStore$validate$3.L$3 = null;
                        videoNetworkDataStore$validate$3.label = 4;
                        return videoUploadMetricsManager2.addMetric(str7, uploadStep, videoNetworkDataStore$validate$3) == aVar ? aVar : validOk2;
                    }
                    j11 = videoNetworkDataStore$validate$3.J$0;
                    str6 = (String) videoNetworkDataStore$validate$3.L$4;
                    String str12 = (String) videoNetworkDataStore$validate$3.L$3;
                    fileInputStream2 = (FileInputStream) videoNetworkDataStore$validate$3.L$2;
                    videoValidationWebSocket3 = (VideoValidationWebSocket) videoNetworkDataStore$validate$3.L$1;
                    VideoNetworkDataStore videoNetworkDataStore5 = (VideoNetworkDataStore) videoNetworkDataStore$validate$3.L$0;
                    s.b(obj2);
                    str5 = str12;
                    videoNetworkDataStore2 = videoNetworkDataStore5;
                    String b11 = f.b("toString(...)");
                    Map<String, String> j14 = U.j(new Pair("x-o3-vua-request-id", b11), new Pair("x-o3-vua-process-id", str6));
                    L l12 = new L();
                    long currentTimeMillis = System.currentTimeMillis();
                    final InterfaceC2395h<VideoValidationEvent> startValidation = videoValidationWebSocket3.startValidation(j11, j14);
                    String str13 = str6;
                    videoNetworkDataStore3 = videoNetworkDataStore2;
                    str7 = str13;
                    l11 = l12;
                    str8 = b11;
                    j12 = currentTimeMillis;
                    final C2408n0 c2408n0 = new C2408n0(new InterfaceC2395h<Pair<? extends VideoValidationEvent, ? extends FileInputStream>>() { // from class: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC2397i {
                            final /* synthetic */ FileInputStream $inputStream$inlined;
                            final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1$2", f = "VideoNetworkDataStore.kt", l = {50}, m = "emit")
                            /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends c {
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(d dVar) {
                                    super(dVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= LinearLayoutManager.INVALID_OFFSET;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(InterfaceC2397i interfaceC2397i, FileInputStream fileInputStream) {
                                this.$this_unsafeFlow = interfaceC2397i;
                                this.$inputStream$inlined = fileInputStream;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // Ae.InterfaceC2397i
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, d dVar) {
                                AnonymousClass1 anonymousClass1;
                                int i11;
                                if (dVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) dVar;
                                    int i12 = anonymousClass1.label;
                                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                        anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                        Object obj2 = anonymousClass1.result;
                                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                        i11 = anonymousClass1.label;
                                        if (i11 != 0) {
                                            s.b(obj2);
                                            InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                            Pair pair = new Pair((VideoValidationEvent) obj, this.$inputStream$inlined);
                                            anonymousClass1.label = 1;
                                            if (interfaceC2397i.emit(pair, anonymousClass1) == aVar) {
                                                return aVar;
                                            }
                                        } else {
                                            if (i11 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            s.b(obj2);
                                        }
                                        return Unit.f71690a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(dVar);
                                Object obj22 = anonymousClass1.result;
                                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                }
                                return Unit.f71690a;
                            }
                        }

                        @Override // Ae.InterfaceC2395h
                        public Object collect(InterfaceC2397i<? super Pair<? extends VideoValidationEvent, ? extends FileInputStream>> interfaceC2397i, d dVar2) {
                            Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, fileInputStream2), dVar2);
                            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                        }
                    }, new VideoNetworkDataStore$validate$validationResult$2(videoValidationWebSocket3, str5, videoNetworkDataStore2, str13, l12, b11, currentTimeMillis, null));
                    final InterfaceC2395h<VideoValidationEvent> interfaceC2395h = new InterfaceC2395h<VideoValidationEvent>() { // from class: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC2397i {
                            final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2$2", f = "VideoNetworkDataStore.kt", l = {50}, m = "emit")
                            /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends c {
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(d dVar) {
                                    super(dVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= LinearLayoutManager.INVALID_OFFSET;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                                this.$this_unsafeFlow = interfaceC2397i;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // Ae.InterfaceC2397i
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, d dVar) {
                                AnonymousClass1 anonymousClass1;
                                int i11;
                                if (dVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) dVar;
                                    int i12 = anonymousClass1.label;
                                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                        anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                        Object obj2 = anonymousClass1.result;
                                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                        i11 = anonymousClass1.label;
                                        if (i11 != 0) {
                                            s.b(obj2);
                                            InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                            VideoValidationEvent videoValidationEvent = (VideoValidationEvent) ((Pair) obj).a();
                                            anonymousClass1.label = 1;
                                            if (interfaceC2397i.emit(videoValidationEvent, anonymousClass1) == aVar) {
                                                return aVar;
                                            }
                                        } else {
                                            if (i11 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            s.b(obj2);
                                        }
                                        return Unit.f71690a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(dVar);
                                Object obj22 = anonymousClass1.result;
                                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                }
                                return Unit.f71690a;
                            }
                        }

                        @Override // Ae.InterfaceC2395h
                        public Object collect(InterfaceC2397i<? super VideoValidationEvent> interfaceC2397i, d dVar2) {
                            Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar2);
                            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                        }
                    };
                    InterfaceC2395h<Object> interfaceC2395h2 = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC2397i {
                            final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1$2", f = "VideoNetworkDataStore.kt", l = {50}, m = "emit")
                            /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends c {
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(d dVar) {
                                    super(dVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= LinearLayoutManager.INVALID_OFFSET;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                                this.$this_unsafeFlow = interfaceC2397i;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // Ae.InterfaceC2397i
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, d dVar) {
                                AnonymousClass1 anonymousClass1;
                                int i11;
                                if (dVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) dVar;
                                    int i12 = anonymousClass1.label;
                                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                        anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                        Object obj2 = anonymousClass1.result;
                                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                        i11 = anonymousClass1.label;
                                        if (i11 != 0) {
                                            s.b(obj2);
                                            InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                            if (obj instanceof VideoValidationEvent.ValidResult.ValidOk) {
                                                anonymousClass1.label = 1;
                                                if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                                    return aVar;
                                                }
                                            }
                                        } else {
                                            if (i11 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            s.b(obj2);
                                        }
                                        return Unit.f71690a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(dVar);
                                Object obj22 = anonymousClass1.result;
                                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                }
                                return Unit.f71690a;
                            }
                        }

                        @Override // Ae.InterfaceC2395h
                        public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar2) {
                            Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar2);
                            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                        }
                    };
                    videoNetworkDataStore$validate$3.L$0 = videoNetworkDataStore3;
                    videoNetworkDataStore$validate$3.L$1 = str7;
                    videoNetworkDataStore$validate$3.L$2 = str8;
                    videoNetworkDataStore$validate$3.L$3 = l11;
                    videoNetworkDataStore$validate$3.L$4 = null;
                    videoNetworkDataStore$validate$3.J$0 = j12;
                    videoNetworkDataStore$validate$3.label = 3;
                    obj2 = C2399j.u(interfaceC2395h2, videoNetworkDataStore$validate$3);
                }
                long longValue = ((Number) obj).longValue();
                videoUploadMetricsManager = videoNetworkDataStore.videoUploadMetricsManager;
                initStep = new UploadMetricEvent.InitStep(str4, 0L, 2, null);
                videoNetworkDataStore$validate$3.L$0 = videoNetworkDataStore;
                videoNetworkDataStore$validate$3.L$1 = videoValidationWebSocket2;
                videoNetworkDataStore$validate$3.L$2 = fileInputStream3;
                videoNetworkDataStore$validate$3.L$3 = str4;
                videoNetworkDataStore$validate$3.L$4 = str3;
                videoNetworkDataStore$validate$3.J$0 = longValue;
                videoNetworkDataStore$validate$3.label = 2;
                if (videoUploadMetricsManager.addMetric(str3, initStep, videoNetworkDataStore$validate$3) != aVar) {
                    videoNetworkDataStore2 = videoNetworkDataStore;
                    videoValidationWebSocket3 = videoValidationWebSocket2;
                    str5 = str4;
                    fileInputStream2 = fileInputStream3;
                    str6 = str3;
                    j11 = longValue;
                    String b112 = f.b("toString(...)");
                    Map<String, String> j142 = U.j(new Pair("x-o3-vua-request-id", b112), new Pair("x-o3-vua-process-id", str6));
                    L l122 = new L();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    final InterfaceC2395h startValidation2 = videoValidationWebSocket3.startValidation(j11, j142);
                    String str132 = str6;
                    videoNetworkDataStore3 = videoNetworkDataStore2;
                    str7 = str132;
                    l11 = l122;
                    str8 = b112;
                    j12 = currentTimeMillis2;
                    final InterfaceC2395h c2408n02 = new C2408n0(new InterfaceC2395h<Pair<? extends VideoValidationEvent, ? extends FileInputStream>>() { // from class: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC2397i {
                            final /* synthetic */ FileInputStream $inputStream$inlined;
                            final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1$2", f = "VideoNetworkDataStore.kt", l = {50}, m = "emit")
                            /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends c {
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(d dVar) {
                                    super(dVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= LinearLayoutManager.INVALID_OFFSET;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(InterfaceC2397i interfaceC2397i, FileInputStream fileInputStream) {
                                this.$this_unsafeFlow = interfaceC2397i;
                                this.$inputStream$inlined = fileInputStream;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // Ae.InterfaceC2397i
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, d dVar) {
                                AnonymousClass1 anonymousClass1;
                                int i11;
                                if (dVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) dVar;
                                    int i12 = anonymousClass1.label;
                                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                        anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                        Object obj22 = anonymousClass1.result;
                                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                                        i11 = anonymousClass1.label;
                                        if (i11 != 0) {
                                            s.b(obj22);
                                            InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                            Pair pair = new Pair((VideoValidationEvent) obj, this.$inputStream$inlined);
                                            anonymousClass1.label = 1;
                                            if (interfaceC2397i.emit(pair, anonymousClass1) == aVar2) {
                                                return aVar2;
                                            }
                                        } else {
                                            if (i11 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            s.b(obj22);
                                        }
                                        return Unit.f71690a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(dVar);
                                Object obj222 = anonymousClass1.result;
                                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                }
                                return Unit.f71690a;
                            }
                        }

                        @Override // Ae.InterfaceC2395h
                        public Object collect(InterfaceC2397i<? super Pair<? extends VideoValidationEvent, ? extends FileInputStream>> interfaceC2397i, d dVar2) {
                            Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, fileInputStream2), dVar2);
                            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                        }
                    }, new VideoNetworkDataStore$validate$validationResult$2(videoValidationWebSocket3, str5, videoNetworkDataStore2, str132, l122, b112, currentTimeMillis2, null));
                    final InterfaceC2395h interfaceC2395h3 = new InterfaceC2395h<VideoValidationEvent>() { // from class: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC2397i {
                            final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2$2", f = "VideoNetworkDataStore.kt", l = {50}, m = "emit")
                            /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$map$2$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends c {
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(d dVar) {
                                    super(dVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= LinearLayoutManager.INVALID_OFFSET;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                                this.$this_unsafeFlow = interfaceC2397i;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // Ae.InterfaceC2397i
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, d dVar) {
                                AnonymousClass1 anonymousClass1;
                                int i11;
                                if (dVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) dVar;
                                    int i12 = anonymousClass1.label;
                                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                        anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                        Object obj22 = anonymousClass1.result;
                                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                                        i11 = anonymousClass1.label;
                                        if (i11 != 0) {
                                            s.b(obj22);
                                            InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                            VideoValidationEvent videoValidationEvent = (VideoValidationEvent) ((Pair) obj).a();
                                            anonymousClass1.label = 1;
                                            if (interfaceC2397i.emit(videoValidationEvent, anonymousClass1) == aVar2) {
                                                return aVar2;
                                            }
                                        } else {
                                            if (i11 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            s.b(obj22);
                                        }
                                        return Unit.f71690a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(dVar);
                                Object obj222 = anonymousClass1.result;
                                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                }
                                return Unit.f71690a;
                            }
                        }

                        @Override // Ae.InterfaceC2395h
                        public Object collect(InterfaceC2397i<? super VideoValidationEvent> interfaceC2397i, d dVar2) {
                            Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar2);
                            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                        }
                    };
                    InterfaceC2395h<Object> interfaceC2395h22 = new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements InterfaceC2397i {
                            final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1$2", f = "VideoNetworkDataStore.kt", l = {50}, m = "emit")
                            /* renamed from: ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends c {
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(d dVar) {
                                    super(dVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.a
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= LinearLayoutManager.INVALID_OFFSET;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                                this.$this_unsafeFlow = interfaceC2397i;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // Ae.InterfaceC2397i
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, d dVar) {
                                AnonymousClass1 anonymousClass1;
                                int i11;
                                if (dVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) dVar;
                                    int i12 = anonymousClass1.label;
                                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                        anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                        Object obj22 = anonymousClass1.result;
                                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                                        i11 = anonymousClass1.label;
                                        if (i11 != 0) {
                                            s.b(obj22);
                                            InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                            if (obj instanceof VideoValidationEvent.ValidResult.ValidOk) {
                                                anonymousClass1.label = 1;
                                                if (interfaceC2397i.emit(obj, anonymousClass1) == aVar2) {
                                                    return aVar2;
                                                }
                                            }
                                        } else {
                                            if (i11 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            s.b(obj22);
                                        }
                                        return Unit.f71690a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(dVar);
                                Object obj222 = anonymousClass1.result;
                                Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                }
                                return Unit.f71690a;
                            }
                        }

                        @Override // Ae.InterfaceC2395h
                        public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar2) {
                            Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar2);
                            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                        }
                    };
                    videoNetworkDataStore$validate$3.L$0 = videoNetworkDataStore3;
                    videoNetworkDataStore$validate$3.L$1 = str7;
                    videoNetworkDataStore$validate$3.L$2 = str8;
                    videoNetworkDataStore$validate$3.L$3 = l11;
                    videoNetworkDataStore$validate$3.L$4 = null;
                    videoNetworkDataStore$validate$3.J$0 = j12;
                    videoNetworkDataStore$validate$3.label = 3;
                    obj2 = C2399j.u(interfaceC2395h22, videoNetworkDataStore$validate$3);
                }
            }
        }
        videoNetworkDataStore$validate$3 = new VideoNetworkDataStore$validate$3(this, dVar);
        Object obj22 = videoNetworkDataStore$validate$3.result;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = videoNetworkDataStore$validate$3.label;
        if (i11 != 0) {
        }
        long longValue2 = ((Number) obj).longValue();
        videoUploadMetricsManager = videoNetworkDataStore.videoUploadMetricsManager;
        initStep = new UploadMetricEvent.InitStep(str4, 0L, 2, null);
        videoNetworkDataStore$validate$3.L$0 = videoNetworkDataStore;
        videoNetworkDataStore$validate$3.L$1 = videoValidationWebSocket2;
        videoNetworkDataStore$validate$3.L$2 = fileInputStream3;
        videoNetworkDataStore$validate$3.L$3 = str4;
        videoNetworkDataStore$validate$3.L$4 = str3;
        videoNetworkDataStore$validate$3.J$0 = longValue2;
        videoNetworkDataStore$validate$3.label = 2;
        if (videoUploadMetricsManager.addMetric(str3, initStep, videoNetworkDataStore$validate$3) != aVar) {
        }
    }
}
