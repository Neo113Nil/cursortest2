package ru.ozon.app.android.mediaupload.video;

import Ae.InterfaceC2395h;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import xe.B0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/mediaupload/video/VideoUploadRepository;", "", "", "actionName", "Landroid/net/Uri;", "videoUri", "videoType", "", "isRetryWithoutCheckSum", "LAe/h;", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "newUpload", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lxe/B0;", "job", "", "saveUploadJob", "(Landroid/net/Uri;Lxe/B0;)V", "cancel", "(Landroid/net/Uri;)V", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface VideoUploadRepository {
    void cancel(@NotNull Uri videoUri);

    Object newUpload(String str, @NotNull Uri uri, @NotNull String str2, boolean z11, @NotNull d<? super InterfaceC2395h<UploadingProgress>> dVar);

    void saveUploadJob(@NotNull Uri videoUri, @NotNull B0 job);
}
