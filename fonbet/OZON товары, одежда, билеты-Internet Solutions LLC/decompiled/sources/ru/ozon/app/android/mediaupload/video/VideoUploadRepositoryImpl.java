package ru.ozon.app.android.mediaupload.video;

import Ae.C;
import Ae.C2399j;
import Ae.C2425z;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import He.b;
import P4.f;
import Sc.s;
import Wc.a;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.networkStateMonitor.NetworkStateMonitor;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import ru.ozon.app.android.mediaupload.video.metrics.manager.VideoUploadMetricsManager;
import xe.B0;
import xe.C10720e0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/mediaupload/video/VideoUploadRepositoryImpl;", "Lru/ozon/app/android/mediaupload/video/VideoUploadRepository;", "Lru/ozon/app/android/mediaupload/video/VideoNetworkDataStore;", "networkDataStore", "Lru/ozon/app/android/mediaupload/networkStateMonitor/NetworkStateMonitor;", "networkMonitor", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "videoUploadMetricsManager", "<init>", "(Lru/ozon/app/android/mediaupload/video/VideoNetworkDataStore;Lru/ozon/app/android/mediaupload/networkStateMonitor/NetworkStateMonitor;Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;)V", "Landroid/net/Uri;", "videoUri", "", "uploadId", "uploadProcessId", "", "retryChunksUploadWithFallback", "LAe/h;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "upload", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)LAe/h;", "actionName", "videoType", "isRetryWithoutCheckSum", "newUpload", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lxe/B0;", "job", "", "saveUploadJob", "(Landroid/net/Uri;Lxe/B0;)V", "cancel", "(Landroid/net/Uri;)V", "Lru/ozon/app/android/mediaupload/video/VideoNetworkDataStore;", "Lru/ozon/app/android/mediaupload/networkStateMonitor/NetworkStateMonitor;", "Lru/ozon/app/android/mediaupload/video/metrics/manager/VideoUploadMetricsManager;", "", "uploadJobs", "Ljava/util/Map;", "uploadIds", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoUploadRepositoryImpl implements VideoUploadRepository {

    @NotNull
    private final VideoNetworkDataStore networkDataStore;

    @NotNull
    private final NetworkStateMonitor networkMonitor;

    @NotNull
    private final Map<Uri, String> uploadIds;

    @NotNull
    private final Map<Uri, B0> uploadJobs;

    @NotNull
    private final VideoUploadMetricsManager videoUploadMetricsManager;

    public VideoUploadRepositoryImpl(@NotNull VideoNetworkDataStore networkDataStore, @NotNull NetworkStateMonitor networkMonitor, @NotNull VideoUploadMetricsManager videoUploadMetricsManager) {
        Intrinsics.checkNotNullParameter(networkDataStore, "networkDataStore");
        Intrinsics.checkNotNullParameter(networkMonitor, "networkMonitor");
        Intrinsics.checkNotNullParameter(videoUploadMetricsManager, "videoUploadMetricsManager");
        this.networkDataStore = networkDataStore;
        this.networkMonitor = networkMonitor;
        this.videoUploadMetricsManager = videoUploadMetricsManager;
        this.uploadJobs = new LinkedHashMap();
        this.uploadIds = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<UploadingProgress> upload(Uri videoUri, final String uploadId, String uploadProcessId, boolean retryChunksUploadWithFallback) {
        final InterfaceC2395h<UploadingProgress> upload = this.networkDataStore.upload(videoUri, uploadId, uploadProcessId, retryChunksUploadWithFallback);
        C2425z c2425z = new C2425z(new InterfaceC2395h<UploadingProgress>() { // from class: ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$upload$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$upload$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ String $uploadId$inlined;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$upload$$inlined$map$1$2", f = "VideoUploadRepository.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.mediaupload.video.VideoUploadRepositoryImpl$upload$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, String str) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.$uploadId$inlined = str;
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
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                UploadingProgress copy$default = UploadingProgress.copy$default((UploadingProgress) obj, this.$uploadId$inlined, false, null, 6, null);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(copy$default, anonymousClass1) == aVar) {
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
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super UploadingProgress> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, uploadId), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new VideoUploadRepositoryImpl$upload$2(this, videoUri, null));
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C2399j.B(c2425z, b.f10879b);
    }

    @Override // ru.ozon.app.android.mediaupload.video.VideoUploadRepository
    public void cancel(@NotNull Uri videoUri) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        B0 b02 = this.uploadJobs.get(videoUri);
        if (b02 != null) {
            b02.j(null);
        }
        this.uploadJobs.remove(videoUri);
        this.uploadIds.remove(videoUri);
    }

    @Override // ru.ozon.app.android.mediaupload.video.VideoUploadRepository
    public Object newUpload(String str, @NotNull Uri uri, @NotNull String str2, boolean z11, @NotNull d<? super InterfaceC2395h<UploadingProgress>> dVar) {
        String str3 = this.uploadIds.get(uri);
        String b11 = f.b("toString(...)");
        return new C2425z(new C(C2399j.Q(this.networkMonitor.networkStateFlow(), new VideoUploadRepositoryImpl$newUpload$$inlined$flatMapLatest$1(null, str3, z11, this, uri, b11, str2, str)), new VideoUploadRepositoryImpl$newUpload$3(this, b11, null)), new VideoUploadRepositoryImpl$newUpload$4(this, b11, null));
    }

    @Override // ru.ozon.app.android.mediaupload.video.VideoUploadRepository
    public void saveUploadJob(@NotNull Uri videoUri, @NotNull B0 job) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(job, "job");
        B0 b02 = this.uploadJobs.get(videoUri);
        if (b02 != null) {
            b02.j(null);
        }
        this.uploadJobs.put(videoUri, job);
    }
}
