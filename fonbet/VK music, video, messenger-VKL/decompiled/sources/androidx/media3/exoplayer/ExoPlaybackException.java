package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.i;
import java.io.IOException;
import xsna.fxc0;
import xsna.pzl;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class ExoPlaybackException extends PlaybackException {
    final boolean isRecoverable;

    @Nullable
    public final i.b mediaPeriodId;

    @Nullable
    public final androidx.media3.common.a rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @Nullable
    public final String rendererName;
    public final int type;

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, null, i2, null, -1, null, 4, null, false);
    }

    @CheckResult
    public final ExoPlaybackException e(@Nullable i.b bVar) {
        String message = getMessage();
        String str = y2r0.a;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, bVar, this.timestampMs, this.isRecoverable);
    }

    public final IOException g() {
        fxc0.z(this.type == 0);
        Throwable cause = getCause();
        cause.getClass();
        return (IOException) cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable androidx.media3.common.a aVar, int i4, @Nullable i.b bVar, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        fxc0.p(!z || i2 == 1);
        fxc0.p(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = aVar;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = bVar;
        this.isRecoverable = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExoPlaybackException(int i, @Nullable Exception exc, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable androidx.media3.common.a aVar, int i4, @Nullable i.b bVar, boolean z) {
        this(TextUtils.isEmpty(str) ? r0 : pzl.b(r0, ": ", str), exc, i2, i, r5, r6, r7, i4, bVar, SystemClock.elapsedRealtime(), z);
        String str3;
        int i5;
        androidx.media3.common.a aVar2;
        String str4;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            aVar2 = aVar;
            str4 = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                str4 = "Unexpected runtime error";
            } else {
                str4 = "Remote error";
            }
            str3 = str2;
            i5 = i3;
            aVar2 = aVar;
        } else {
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            aVar2 = aVar;
            sb.append(aVar2);
            sb.append(", format_supported=");
            sb.append(y2r0.C(i4));
            str4 = sb.toString();
        }
    }
}
