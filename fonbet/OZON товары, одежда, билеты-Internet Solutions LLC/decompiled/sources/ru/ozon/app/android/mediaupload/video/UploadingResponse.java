package ru.ozon.app.android.mediaupload.video;

import Fm.C3051a;
import K1.G;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/mediaupload/video/UploadingResponse;", "", "finished", "", "error", "", "position", "", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;)V", "getFinished", "()Z", "getError", "()Ljava/lang/String;", "getPosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/Long;)Lru/ozon/app/android/mediaupload/video/UploadingResponse;", "equals", "other", "hashCode", "", "toString", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadingResponse {
    private final String error;
    private final boolean finished;
    private final Long position;

    public UploadingResponse(@i(name = "finished") boolean z11, @i(name = "error") String str, @i(name = "pos") Long l11) {
        this.finished = z11;
        this.error = str;
        this.position = l11;
    }

    public static /* synthetic */ UploadingResponse copy$default(UploadingResponse uploadingResponse, boolean z11, String str, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uploadingResponse.finished;
        }
        if ((i11 & 2) != 0) {
            str = uploadingResponse.error;
        }
        if ((i11 & 4) != 0) {
            l11 = uploadingResponse.position;
        }
        return uploadingResponse.copy(z11, str, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getPosition() {
        return this.position;
    }

    @NotNull
    public final UploadingResponse copy(@i(name = "finished") boolean finished, @i(name = "error") String error, @i(name = "pos") Long position) {
        return new UploadingResponse(finished, error, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadingResponse)) {
            return false;
        }
        UploadingResponse uploadingResponse = (UploadingResponse) other;
        return this.finished == uploadingResponse.finished && Intrinsics.d(this.error, uploadingResponse.error) && Intrinsics.d(this.position, uploadingResponse.position);
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getFinished() {
        return this.finished;
    }

    public final Long getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.finished) * 31;
        String str = this.error;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.position;
        return hashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.finished;
        String str = this.error;
        return C3051a.d(G.d("UploadingResponse(finished=", ", error=", str, ", position=", z11), this.position, ")");
    }
}
