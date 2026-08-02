package ru.ozon.app.android.mediaupload.video.dto;

import Kk.C3532b;
import Ve.C4636t5;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "", "", "uploadingId", "", "isDone", "Lio/reactivex/p;", "", "progress", "<init>", "(Ljava/lang/String;ZLio/reactivex/p;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lio/reactivex/p;", "copy", "(Ljava/lang/String;ZLio/reactivex/p;)Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadingId", "Z", "Lio/reactivex/p;", "getProgress", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadingProgress {
    private final boolean isDone;

    @NotNull
    private final p<Integer> progress;
    private final String uploadingId;

    public UploadingProgress(String str, boolean z11, @NotNull p<Integer> progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.uploadingId = str;
        this.isDone = z11;
        this.progress = progress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadingProgress copy$default(UploadingProgress uploadingProgress, String str, boolean z11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadingProgress.uploadingId;
        }
        if ((i11 & 2) != 0) {
            z11 = uploadingProgress.isDone;
        }
        if ((i11 & 4) != 0) {
            pVar = uploadingProgress.progress;
        }
        return uploadingProgress.copy(str, z11, pVar);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUploadingId() {
        return this.uploadingId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDone() {
        return this.isDone;
    }

    @NotNull
    public final p<Integer> component3() {
        return this.progress;
    }

    @NotNull
    public final UploadingProgress copy(String uploadingId, boolean isDone, @NotNull p<Integer> progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new UploadingProgress(uploadingId, isDone, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadingProgress)) {
            return false;
        }
        UploadingProgress uploadingProgress = (UploadingProgress) other;
        return Intrinsics.d(this.uploadingId, uploadingProgress.uploadingId) && this.isDone == uploadingProgress.isDone && Intrinsics.d(this.progress, uploadingProgress.progress);
    }

    public int hashCode() {
        String str = this.uploadingId;
        return this.progress.hashCode() + C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isDone);
    }

    public final boolean isDone() {
        return this.isDone;
    }

    @NotNull
    public String toString() {
        String str = this.uploadingId;
        boolean z11 = this.isDone;
        p<Integer> pVar = this.progress;
        StringBuilder b11 = C4636t5.b("UploadingProgress(uploadingId=", str, ", isDone=", ", progress=", z11);
        b11.append(pVar);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ UploadingProgress(String str, boolean z11, p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? false : z11, pVar);
    }
}
