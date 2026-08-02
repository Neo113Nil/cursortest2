package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import He.b;
import Sc.r;
import Sc.s;
import We.C;
import We.D;
import We.K;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import bd.h;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.ImageUploadingLogger;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error;
import u2.C9923b;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploaderImpl;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "mediaFilesUploadApi", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "connectionHandler", "Lru/ozon/app/android/platform/image/ImageResizer;", "imageResizer", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "logger", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;Lru/ozon/app/android/network/networkhandler/ConnectionHandler;Lru/ozon/app/android/platform/image/ImageResizer;Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "mediaFile", "", "kotlin.jvm.PlatformType", "getEncodedFileName", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/io/File;", "resizeFile", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;)Ljava/io/File;", "file", "LWe/K;", "createRequestBody", "(Ljava/io/File;)LWe/K;", "Landroid/net/Uri;", "uri", "resizeImage", "(Landroid/net/Uri;)Ljava/lang/String;", "actionName", "LSc/r;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "uploadMediaFile-0E7RQCE", "(Ljava/lang/String;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "uploadMediaFile", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploadApi;", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "Lru/ozon/app/android/platform/image/ImageResizer;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "uploadingFileName", "Ljava/lang/String;", "", "resizedFileSize", "J", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MediaFilesUploaderImpl implements MediaFilesUploader {

    @NotNull
    private final ConnectionHandler connectionHandler;

    @NotNull
    private final ImageResizer imageResizer;

    @NotNull
    private final ImageUploadingLogger logger;

    @NotNull
    private final MediaFilesUploadApi mediaFilesUploadApi;
    private long resizedFileSize;

    @NotNull
    private String uploadingFileName;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploaderImpl$Companion;", "", "<init>", "()V", "ATTACH_BODY_PART", "", "ATTACH_IMAGE_SIZE_LIMIT", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MediaFilesUploaderImpl(@NotNull MediaFilesUploadApi mediaFilesUploadApi, @NotNull ConnectionHandler connectionHandler, @NotNull ImageResizer imageResizer, @NotNull ImageUploadingLogger logger) {
        Intrinsics.checkNotNullParameter(mediaFilesUploadApi, "mediaFilesUploadApi");
        Intrinsics.checkNotNullParameter(connectionHandler, "connectionHandler");
        Intrinsics.checkNotNullParameter(imageResizer, "imageResizer");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.mediaFilesUploadApi = mediaFilesUploadApi;
        this.connectionHandler = connectionHandler;
        this.imageResizer = imageResizer;
        this.logger = logger;
        this.uploadingFileName = "undefined";
    }

    private final K createRequestBody(File file) {
        C c11;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.i(file));
        if (mimeTypeFromExtension != null) {
            C.f33536g.getClass();
            c11 = C.a.a(mimeTypeFromExtension);
        } else {
            c11 = null;
        }
        K.INSTANCE.getClass();
        return K.Companion.a(file, c11);
    }

    private final Object getEncodedFileName(MediaFile mediaFile, d<? super String> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new MediaFilesUploaderImpl$getEncodedFileName$2(mediaFile, null), dVar);
    }

    private final File resizeFile(MediaFile mediaFile) {
        AttachmentVO.AttachedImageVO attachment = mediaFile.getAttachment();
        String resizeImage = resizeImage(attachment != null ? attachment.getMediaUri() : null);
        if (resizeImage == null) {
            AttachmentVO.AttachedImageVO attachment2 = mediaFile.getAttachment();
            String originalFilePath = attachment2 != null ? attachment2.getOriginalFilePath() : null;
            resizeImage = originalFilePath == null ? "" : originalFilePath;
        }
        return new File(resizeImage);
    }

    private final String resizeImage(Uri uri) {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            a11 = uri == null ? null : this.imageResizer.resize(uri, 1200.0f);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 == null || uri == null) {
            s.b(a11);
            return (String) a11;
        }
        File a12 = C9923b.a(uri);
        String message = b11.getMessage();
        String name = a12.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        throw new Error.Resizing(message, name, a12.length());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(11:11|12|13|14|15|(1:17)(1:61)|18|(1:22)|(3:55|56|57)|24|(4:26|(2:42|(1:47)(1:46))(1:30)|31|(5:33|(1:35)|(1:37)|38|39)(1:41))(5:48|(1:50)|(1:52)|53|54))(2:66|67))(4:68|69|70|71))(8:83|84|85|(5:87|(1:89)|90|(1:92)|75)|94|90|(0)|75)|72|73|(9:76|14|15|(0)(0)|18|(2:20|22)|(0)|24|(0)(0))|75))|97|6|7|(0)(0)|72|73|(0)|75) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e7, code lost:
    
        r10 = r0;
        r11 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploader
    /* renamed from: uploadMediaFile-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo945uploadMediaFile0E7RQCE(@NotNull String str, @NotNull MediaFile mediaFile, @NotNull d<? super r<SignedLink>> dVar) {
        MediaFilesUploaderImpl$uploadMediaFile$1 mediaFilesUploaderImpl$uploadMediaFile$1;
        Wc.a aVar;
        int i11;
        Throwable th2;
        MediaFilesUploaderImpl mediaFilesUploaderImpl;
        File resizeFile;
        String str2;
        Object encodedFileName;
        String str3;
        D.c.a aVar2;
        Object obj;
        String str4;
        MediaFilesUploaderImpl mediaFilesUploaderImpl2;
        MediaFilesUploaderImpl mediaFilesUploaderImpl3;
        Object withRetry$default;
        File file;
        Object a11;
        boolean z11;
        Pair pair;
        Object a12;
        Throwable b11;
        ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error error;
        Object a13;
        File file2;
        if (dVar instanceof MediaFilesUploaderImpl$uploadMediaFile$1) {
            mediaFilesUploaderImpl$uploadMediaFile$1 = (MediaFilesUploaderImpl$uploadMediaFile$1) dVar;
            int i12 = mediaFilesUploaderImpl$uploadMediaFile$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mediaFilesUploaderImpl$uploadMediaFile$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                MediaFilesUploaderImpl$uploadMediaFile$1 mediaFilesUploaderImpl$uploadMediaFile$12 = mediaFilesUploaderImpl$uploadMediaFile$1;
                Object obj2 = mediaFilesUploaderImpl$uploadMediaFile$12.result;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mediaFilesUploaderImpl$uploadMediaFile$12.label;
                if (i11 != 0) {
                    s.b(obj2);
                    try {
                        r.Companion companion = r.INSTANCE;
                        resizeFile = resizeFile(mediaFile);
                        this.resizedFileSize = resizeFile.length();
                        AttachmentVO.AttachedImageVO attachment = mediaFile.getAttachment();
                        if (attachment != null) {
                            str2 = attachment.getFilename();
                            if (str2 == null) {
                            }
                            this.uploadingFileName = str2;
                            D.c.a aVar3 = D.c.f33553c;
                            mediaFilesUploaderImpl$uploadMediaFile$12.L$0 = this;
                            mediaFilesUploaderImpl$uploadMediaFile$12.L$1 = str;
                            mediaFilesUploaderImpl$uploadMediaFile$12.L$2 = this;
                            mediaFilesUploaderImpl$uploadMediaFile$12.L$3 = resizeFile;
                            mediaFilesUploaderImpl$uploadMediaFile$12.L$4 = "file";
                            mediaFilesUploaderImpl$uploadMediaFile$12.L$5 = aVar3;
                            mediaFilesUploaderImpl$uploadMediaFile$12.label = 1;
                            encodedFileName = getEncodedFileName(mediaFile, mediaFilesUploaderImpl$uploadMediaFile$12);
                            if (encodedFileName != aVar) {
                                str3 = str;
                                aVar2 = aVar3;
                                obj = encodedFileName;
                                str4 = "file";
                                mediaFilesUploaderImpl2 = this;
                                mediaFilesUploaderImpl3 = mediaFilesUploaderImpl2;
                            }
                            return aVar;
                        }
                        str2 = this.uploadingFileName;
                        this.uploadingFileName = str2;
                        D.c.a aVar32 = D.c.f33553c;
                        mediaFilesUploaderImpl$uploadMediaFile$12.L$0 = this;
                        mediaFilesUploaderImpl$uploadMediaFile$12.L$1 = str;
                        mediaFilesUploaderImpl$uploadMediaFile$12.L$2 = this;
                        mediaFilesUploaderImpl$uploadMediaFile$12.L$3 = resizeFile;
                        mediaFilesUploaderImpl$uploadMediaFile$12.L$4 = "file";
                        mediaFilesUploaderImpl$uploadMediaFile$12.L$5 = aVar32;
                        mediaFilesUploaderImpl$uploadMediaFile$12.label = 1;
                        encodedFileName = getEncodedFileName(mediaFile, mediaFilesUploaderImpl$uploadMediaFile$12);
                        if (encodedFileName != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        mediaFilesUploaderImpl = this;
                        r.Companion companion2 = r.INSTANCE;
                        a11 = s.a(th2);
                        z11 = a11 instanceof r.b;
                        pair = (Pair) (!z11 ? null : a11);
                        if (pair != null) {
                        }
                        if (!z11) {
                        }
                        b11 = r.b(a11);
                        if (b11 == null) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        file = (File) mediaFilesUploaderImpl$uploadMediaFile$12.L$1;
                        mediaFilesUploaderImpl = (MediaFilesUploaderImpl) mediaFilesUploaderImpl$uploadMediaFile$12.L$0;
                        try {
                            s.b(obj2);
                            a11 = new Pair(file, obj2);
                            r.Companion companion3 = r.INSTANCE;
                        } catch (Throwable th4) {
                            th2 = th4;
                            r.Companion companion22 = r.INSTANCE;
                            a11 = s.a(th2);
                            z11 = a11 instanceof r.b;
                            pair = (Pair) (!z11 ? null : a11);
                            if (pair != null) {
                            }
                            if (!z11) {
                            }
                            b11 = r.b(a11);
                            if (b11 == null) {
                            }
                        }
                        z11 = a11 instanceof r.b;
                        pair = (Pair) (!z11 ? null : a11);
                        if (pair != null && (file2 = (File) pair.e()) != null) {
                            file2.delete();
                        }
                        if (!z11) {
                            try {
                                a12 = (UploadMediaResponse) ((Pair) a11).f();
                            } catch (Throwable th5) {
                                r.Companion companion4 = r.INSTANCE;
                                a12 = s.a(th5);
                            }
                            a11 = a12;
                        }
                        b11 = r.b(a11);
                        if (b11 == null) {
                            error = b11 instanceof ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error ? (ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error) b11 : null;
                            if (error == null) {
                                error = new Error.Uploading(b11.getMessage(), mediaFilesUploaderImpl.uploadingFileName, mediaFilesUploaderImpl.resizedFileSize);
                                error.setStackTrace(b11.getStackTrace());
                            }
                            mediaFilesUploaderImpl.logger.logError(error);
                            return s.a(new Throwable(""));
                        }
                        UploadMediaResponse uploadMediaResponse = (UploadMediaResponse) a11;
                        List<SignedLinkDTO> files = uploadMediaResponse.getFiles();
                        if (files == null || files.isEmpty()) {
                            List<String> errors = uploadMediaResponse.getErrors();
                            a13 = (errors == null || errors.isEmpty()) ? s.a(new Throwable("")) : s.a(new Error.Uploading((String) C7714v.K(uploadMediaResponse.getErrors()), mediaFilesUploaderImpl.uploadingFileName, mediaFilesUploaderImpl.resizedFileSize));
                        } else {
                            a13 = SignedLink.INSTANCE.fromDTO((SignedLinkDTO) C7714v.K(uploadMediaResponse.getFiles()));
                        }
                        Throwable b12 = r.b(a13);
                        if (b12 == null) {
                            return a13;
                        }
                        error = b12 instanceof ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error ? (ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error) b12 : null;
                        if (error == null) {
                            error = new Error.Uploading(b12.getMessage(), mediaFilesUploaderImpl.uploadingFileName, mediaFilesUploaderImpl.resizedFileSize);
                            error.setStackTrace(b12.getStackTrace());
                        }
                        mediaFilesUploaderImpl.logger.logError(error);
                        return a13;
                    }
                    aVar2 = (D.c.a) mediaFilesUploaderImpl$uploadMediaFile$12.L$5;
                    str4 = (String) mediaFilesUploaderImpl$uploadMediaFile$12.L$4;
                    File file3 = (File) mediaFilesUploaderImpl$uploadMediaFile$12.L$3;
                    mediaFilesUploaderImpl2 = (MediaFilesUploaderImpl) mediaFilesUploaderImpl$uploadMediaFile$12.L$2;
                    str3 = (String) mediaFilesUploaderImpl$uploadMediaFile$12.L$1;
                    MediaFilesUploaderImpl mediaFilesUploaderImpl4 = (MediaFilesUploaderImpl) mediaFilesUploaderImpl$uploadMediaFile$12.L$0;
                    try {
                        s.b(obj2);
                        obj = obj2;
                        resizeFile = file3;
                        mediaFilesUploaderImpl3 = mediaFilesUploaderImpl4;
                    } catch (Throwable th6) {
                        th2 = th6;
                        mediaFilesUploaderImpl = mediaFilesUploaderImpl4;
                        r.Companion companion222 = r.INSTANCE;
                        a11 = s.a(th2);
                        z11 = a11 instanceof r.b;
                        pair = (Pair) (!z11 ? null : a11);
                        if (pair != null) {
                        }
                        if (!z11) {
                        }
                        b11 = r.b(a11);
                        if (b11 == null) {
                        }
                    }
                }
                K createRequestBody = mediaFilesUploaderImpl2.createRequestBody(resizeFile);
                aVar2.getClass();
                D.c b13 = D.c.a.b(str4, (String) obj, createRequestBody);
                ConnectionHandler connectionHandler = mediaFilesUploaderImpl2.connectionHandler;
                MediaFilesUploaderImpl$uploadMediaFile$2$1 mediaFilesUploaderImpl$uploadMediaFile$2$1 = new MediaFilesUploaderImpl$uploadMediaFile$2$1(mediaFilesUploaderImpl2, str3, b13, null);
                mediaFilesUploaderImpl$uploadMediaFile$12.L$0 = mediaFilesUploaderImpl3;
                mediaFilesUploaderImpl$uploadMediaFile$12.L$1 = resizeFile;
                mediaFilesUploaderImpl$uploadMediaFile$12.L$2 = null;
                mediaFilesUploaderImpl$uploadMediaFile$12.L$3 = null;
                mediaFilesUploaderImpl$uploadMediaFile$12.L$4 = null;
                mediaFilesUploaderImpl$uploadMediaFile$12.L$5 = null;
                mediaFilesUploaderImpl$uploadMediaFile$12.label = 2;
                withRetry$default = RetryHelperKt.withRetry$default(0, connectionHandler, mediaFilesUploaderImpl$uploadMediaFile$2$1, mediaFilesUploaderImpl$uploadMediaFile$12, 1, null);
                if (withRetry$default != aVar) {
                    File file4 = resizeFile;
                    obj2 = withRetry$default;
                    file = file4;
                    mediaFilesUploaderImpl = mediaFilesUploaderImpl3;
                    a11 = new Pair(file, obj2);
                    r.Companion companion32 = r.INSTANCE;
                    z11 = a11 instanceof r.b;
                    pair = (Pair) (!z11 ? null : a11);
                    if (pair != null) {
                        file2.delete();
                    }
                    if (!z11) {
                    }
                    b11 = r.b(a11);
                    if (b11 == null) {
                    }
                }
                return aVar;
            }
        }
        mediaFilesUploaderImpl$uploadMediaFile$1 = new MediaFilesUploaderImpl$uploadMediaFile$1(this, dVar);
        MediaFilesUploaderImpl$uploadMediaFile$1 mediaFilesUploaderImpl$uploadMediaFile$122 = mediaFilesUploaderImpl$uploadMediaFile$1;
        Object obj22 = mediaFilesUploaderImpl$uploadMediaFile$122.result;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = mediaFilesUploaderImpl$uploadMediaFile$122.label;
        if (i11 != 0) {
        }
        K createRequestBody2 = mediaFilesUploaderImpl2.createRequestBody(resizeFile);
        aVar2.getClass();
        D.c b132 = D.c.a.b(str4, (String) obj, createRequestBody2);
        ConnectionHandler connectionHandler2 = mediaFilesUploaderImpl2.connectionHandler;
        MediaFilesUploaderImpl$uploadMediaFile$2$1 mediaFilesUploaderImpl$uploadMediaFile$2$12 = new MediaFilesUploaderImpl$uploadMediaFile$2$1(mediaFilesUploaderImpl2, str3, b132, null);
        mediaFilesUploaderImpl$uploadMediaFile$122.L$0 = mediaFilesUploaderImpl3;
        mediaFilesUploaderImpl$uploadMediaFile$122.L$1 = resizeFile;
        mediaFilesUploaderImpl$uploadMediaFile$122.L$2 = null;
        mediaFilesUploaderImpl$uploadMediaFile$122.L$3 = null;
        mediaFilesUploaderImpl$uploadMediaFile$122.L$4 = null;
        mediaFilesUploaderImpl$uploadMediaFile$122.L$5 = null;
        mediaFilesUploaderImpl$uploadMediaFile$122.label = 2;
        withRetry$default = RetryHelperKt.withRetry$default(0, connectionHandler2, mediaFilesUploaderImpl$uploadMediaFile$2$12, mediaFilesUploaderImpl$uploadMediaFile$122, 1, null);
        if (withRetry$default != aVar) {
        }
        return aVar;
    }
}
