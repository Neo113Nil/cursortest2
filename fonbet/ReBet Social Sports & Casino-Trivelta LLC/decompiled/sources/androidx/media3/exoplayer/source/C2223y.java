package androidx.media3.exoplayer.source;

import android.net.Uri;
import h1.C4418n;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: androidx.media3.exoplayer.source.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2223y {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLong f21887h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f21888a;

    /* renamed from: b, reason: collision with root package name */
    public final C4418n f21889b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f21890c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f21891d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21892e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21893f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21894g;

    public C2223y(long j10, C4418n c4418n, long j11) {
        this(j10, c4418n, c4418n.f47554a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f21887h.getAndIncrement();
    }

    public C2223y(long j10, C4418n c4418n, Uri uri, Map map, long j11, long j12, long j13) {
        this.f21888a = j10;
        this.f21889b = c4418n;
        this.f21890c = uri;
        this.f21891d = map;
        this.f21892e = j11;
        this.f21893f = j12;
        this.f21894g = j13;
    }
}
