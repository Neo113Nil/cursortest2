package ru.ozon.app.android.mediaupload.video.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/mediaupload/video/dto/VideoUploadingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "reuploadWithFallbackFlag", "", "<init>", "(Ljava/lang/String;Z)V", "getReuploadWithFallbackFlag", "()Z", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoUploadingError extends Exception {
    private final boolean reuploadWithFallbackFlag;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoUploadingError() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final boolean getReuploadWithFallbackFlag() {
        return this.reuploadWithFallbackFlag;
    }

    public VideoUploadingError(String str, boolean z11) {
        super(str == null ? "" : str);
        this.reuploadWithFallbackFlag = z11;
    }

    public /* synthetic */ VideoUploadingError(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11);
    }
}
