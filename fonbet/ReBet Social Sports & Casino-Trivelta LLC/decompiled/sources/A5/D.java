package A5;

import android.widget.VideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class D extends y {

    /* renamed from: x, reason: collision with root package name */
    public final VideoView f68x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(VideoView videoView) {
        super(videoView);
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f68x = videoView;
    }

    @Override // A5.y, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && Intrinsics.areEqual(this.f68x, ((D) obj).f68x);
    }

    @Override // A5.y, A5.H
    public int hashCode() {
        return this.f68x.hashCode();
    }

    @Override // A5.y, A5.H
    public String toString() {
        return "VideoViewMetadata(videoView=" + this.f68x + ")";
    }
}
