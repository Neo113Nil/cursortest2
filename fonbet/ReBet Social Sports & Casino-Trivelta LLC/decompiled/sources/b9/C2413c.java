package b9;

import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2413c extends AbstractC2411a {
    public /* synthetic */ C2413c(GPHVideoPlayerView gPHVideoPlayerView, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gPHVideoPlayerView, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? true : z11);
    }

    public void A(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
    }

    @Override // U8.b
    public long c() {
        return 0L;
    }

    @Override // U8.b
    public long d() {
        return 0L;
    }

    @Override // U8.b
    public float j() {
        return 0.0f;
    }

    @Override // U8.b
    public boolean k() {
        return false;
    }

    @Override // U8.b
    public void v(GPHVideoPlayerView playerView, boolean z10) {
        Intrinsics.checkNotNullParameter(playerView, "playerView");
    }

    public C2413c(GPHVideoPlayerView gPHVideoPlayerView, boolean z10, boolean z11) {
        super(gPHVideoPlayerView, z10, z11);
    }

    @Override // U8.b
    public void b() {
    }

    @Override // U8.b
    public void s(long j10) {
    }

    @Override // U8.b
    public void u(float f10) {
    }
}
