package ru.ozon.fintech.features.camera.domain;

import R30.a;
import Sc.s;
import We.C;
import We.D;
import We.H;
import We.J;
import We.K;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import d40.InterfaceC6083a;
import e40.C6293a;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.camera.network.CameraNetwork;
import ru.ozon.fintech.features.camera.network.models.CameraVideoUploadResponse;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import u2.C9923b;
import xe.C10727i;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0011\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b%\u0010&J \u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.¨\u00060"}, d2 = {"Lru/ozon/fintech/features/camera/domain/CameraInteractor;", "", "Ld40/a;", "exchanger", "Lru/ozon/fintech/features/camera/network/CameraNetwork;", "cameraNetwork", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "externalFintechSettings", "LR30/a;", "appCoroutineScopes", "<init>", "(Ld40/a;Lru/ozon/fintech/features/camera/network/CameraNetwork;Lru/ozon/fintech/settings/domain/ExternalFintechSettings;LR30/a;)V", "Landroid/net/Uri;", "photoFileUri", "", "forUniqueUuid", "videoFileKey", "", "sendConfirmedPhoto", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "", "byQrButton", "sendClosedByUser", "(Ljava/lang/String;Z)V", "qrValueString", "qrRawDataBase64", "sendQrResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "filePathUri", "clearPhotoFile", "(Landroid/net/Uri;)V", "", "result", "sendScanPhoneResult", "(Ljava/util/List;Ljava/lang/String;)V", "sendScanBankCardResult", "(Ljava/lang/String;Ljava/lang/String;)V", "ensureTestCookie", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "savedImageURI", "source", "uploadVideo", "(Landroid/net/Uri;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ld40/a;", "Lru/ozon/fintech/features/camera/network/CameraNetwork;", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "LR30/a;", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraInteractor {

    @NotNull
    private static final String MIME_MULTIPART = "multipart/form-data";

    @NotNull
    private final a appCoroutineScopes;

    @NotNull
    private final CameraNetwork cameraNetwork;

    @NotNull
    private final InterfaceC6083a exchanger;

    @NotNull
    private final ExternalFintechSettings externalFintechSettings;

    public CameraInteractor(@NotNull InterfaceC6083a exchanger, @NotNull CameraNetwork cameraNetwork, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull a appCoroutineScopes) {
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(cameraNetwork, "cameraNetwork");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        this.exchanger = exchanger;
        this.cameraNetwork = cameraNetwork;
        this.externalFintechSettings = externalFintechSettings;
        this.appCoroutineScopes = appCoroutineScopes;
    }

    public static /* synthetic */ void sendClosedByUser$default(CameraInteractor cameraInteractor, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cameraInteractor.sendClosedByUser(str, z11);
    }

    public final void clearPhotoFile(@NotNull Uri filePathUri) {
        Intrinsics.checkNotNullParameter(filePathUri, "filePathUri");
        C10727i.c(this.appCoroutineScopes.b(), null, null, new CameraInteractor$clearPhotoFile$1(filePathUri, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        L80.a.b("VIDEO_UPLOAD", "Error set test cookie e=" + r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureTestCookie(@NotNull d<? super Unit> dVar) {
        CameraInteractor$ensureTestCookie$1 cameraInteractor$ensureTestCookie$1;
        int i11;
        if (dVar instanceof CameraInteractor$ensureTestCookie$1) {
            cameraInteractor$ensureTestCookie$1 = (CameraInteractor$ensureTestCookie$1) dVar;
            int i12 = cameraInteractor$ensureTestCookie$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cameraInteractor$ensureTestCookie$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cameraInteractor$ensureTestCookie$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cameraInteractor$ensureTestCookie$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    JSONObject put = new JSONObject().put("filter", new JSONObject().put("featureNameLike", "mob_onboarding_text")).put("page", 0).put("perPage", 1);
                    CameraNetwork cameraNetwork = this.cameraNetwork;
                    String c11 = this.externalFintechSettings.getFeatureFlagsConfig().c();
                    K.Companion companion = K.INSTANCE;
                    String jSONObject = put.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                    companion.getClass();
                    J b11 = K.Companion.b(jSONObject, null);
                    cameraInteractor$ensureTestCookie$1.label = 1;
                    if (cameraNetwork.postForCachingTestCookie(c11, b11, cameraInteractor$ensureTestCookie$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        cameraInteractor$ensureTestCookie$1 = new CameraInteractor$ensureTestCookie$1(this, dVar);
        Object obj2 = cameraInteractor$ensureTestCookie$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cameraInteractor$ensureTestCookie$1.label;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public final void sendClosedByUser(String forUniqueUuid, boolean byQrButton) {
        this.exchanger.c(new C6293a(null, null, null, null, null, null, byQrButton, 119), U7.d.e(forUniqueUuid, C6293a.class.getSimpleName()));
    }

    public final void sendConfirmedPhoto(@NotNull Uri photoFileUri, String forUniqueUuid, String videoFileKey) {
        Intrinsics.checkNotNullParameter(photoFileUri, "photoFileUri");
        String encodedPath = photoFileUri.getEncodedPath();
        if (encodedPath != null) {
            File file = new File(encodedPath);
            if (file.exists()) {
                try {
                    this.exchanger.c(new C6293a(file, null, null, null, null, videoFileKey, false, 190), forUniqueUuid + C6293a.class.getSimpleName());
                } catch (Exception e11) {
                    L80.a.g(e11);
                }
            }
        }
    }

    public final void sendQrResult(String qrValueString, String qrRawDataBase64, String forUniqueUuid) {
        this.exchanger.c(new C6293a(null, qrValueString, qrRawDataBase64, null, null, null, false, 249), U7.d.e(forUniqueUuid, C6293a.class.getSimpleName()));
    }

    public final void sendScanBankCardResult(@NotNull String result, String forUniqueUuid) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.exchanger.c(new C6293a(null, null, null, null, result, null, false, 223), U7.d.e(forUniqueUuid, C6293a.class.getSimpleName()));
    }

    public final void sendScanPhoneResult(@NotNull List<String> result, String forUniqueUuid) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.exchanger.c(new C6293a(null, null, null, result, null, null, false, 239), U7.d.e(forUniqueUuid, C6293a.class.getSimpleName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadVideo(@NotNull Uri uri, @NotNull String str, @NotNull d<? super String> dVar) {
        CameraInteractor$uploadVideo$1 cameraInteractor$uploadVideo$1;
        int i11;
        if (dVar instanceof CameraInteractor$uploadVideo$1) {
            cameraInteractor$uploadVideo$1 = (CameraInteractor$uploadVideo$1) dVar;
            int i12 = cameraInteractor$uploadVideo$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cameraInteractor$uploadVideo$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cameraInteractor$uploadVideo$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cameraInteractor$uploadVideo$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    File a11 = C9923b.a(uri);
                    K.Companion companion = K.INSTANCE;
                    C.f33536g.getClass();
                    C b11 = C.a.b(MIME_MULTIPART);
                    companion.getClass();
                    H a12 = K.Companion.a(a11, b11);
                    D.c.a aVar2 = D.c.f33553c;
                    String name = a11.getName();
                    aVar2.getClass();
                    D.c b12 = D.c.a.b("video", name, a12);
                    CameraNetwork cameraNetwork = this.cameraNetwork;
                    cameraInteractor$uploadVideo$1.label = 1;
                    obj = cameraNetwork.uploadVideo(str, b12, cameraInteractor$uploadVideo$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                CameraVideoUploadResponse cameraVideoUploadResponse = (CameraVideoUploadResponse) obj;
                L80.a.a("VIDEO_UPLOAD", "cameraVideoUploadResponse=" + cameraVideoUploadResponse);
                return cameraVideoUploadResponse.getFileKey();
            }
        }
        cameraInteractor$uploadVideo$1 = new CameraInteractor$uploadVideo$1(this, dVar);
        Object obj2 = cameraInteractor$uploadVideo$1.result;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cameraInteractor$uploadVideo$1.label;
        if (i11 != 0) {
        }
        CameraVideoUploadResponse cameraVideoUploadResponse2 = (CameraVideoUploadResponse) obj2;
        L80.a.a("VIDEO_UPLOAD", "cameraVideoUploadResponse=" + cameraVideoUploadResponse2);
        return cameraVideoUploadResponse2.getFileKey();
    }
}
