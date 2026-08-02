package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f16148a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaMuxer f16149b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16150c;

    /* renamed from: d, reason: collision with root package name */
    public int f16151d;

    /* renamed from: e, reason: collision with root package name */
    public int f16152e;

    /* renamed from: f, reason: collision with root package name */
    public long f16153f;

    public b(String path, float f6) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f16148a = (long) (TimeUnit.SECONDS.toMicros(1L) / f6);
        this.f16149b = new MediaMuxer(path, 0);
    }
}
