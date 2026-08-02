package d0;

import android.media.MediaCodec;
import androidx.annotation.NonNull;

/* renamed from: d0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6014z implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5981A f60947a;

    C6014z(C5981A c5981a) {
        this.f60947a = c5981a;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        boolean z11 = th2 instanceof MediaCodec.CodecException;
        C5981A c5981a = this.f60947a;
        if (!z11) {
            c5981a.f60773a.s(0, th2.getMessage(), th2);
            return;
        }
        J j11 = c5981a.f60773a;
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
        j11.getClass();
        j11.s(1, codecException.getMessage(), codecException);
    }

    @Override // I.c
    public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
    }
}
