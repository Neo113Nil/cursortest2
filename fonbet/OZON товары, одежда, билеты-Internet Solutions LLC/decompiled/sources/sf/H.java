package sf;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f98670a;

    /* renamed from: b, reason: collision with root package name */
    public int f98671b;

    /* renamed from: c, reason: collision with root package name */
    public int f98672c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f98673d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f98674e;

    /* renamed from: f, reason: collision with root package name */
    public H f98675f;

    /* renamed from: g, reason: collision with root package name */
    public H f98676g;

    public H() {
        this.f98670a = new byte[8192];
        this.f98674e = true;
        this.f98673d = false;
    }

    public final H a() {
        H h11 = this.f98675f;
        if (h11 == this) {
            h11 = null;
        }
        H h12 = this.f98676g;
        Intrinsics.f(h12);
        h12.f98675f = this.f98675f;
        H h13 = this.f98675f;
        Intrinsics.f(h13);
        h13.f98676g = this.f98676g;
        this.f98675f = null;
        this.f98676g = null;
        return h11;
    }

    @NotNull
    public final void b(@NotNull H segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f98676g = this;
        segment.f98675f = this.f98675f;
        H h11 = this.f98675f;
        Intrinsics.f(h11);
        h11.f98676g = segment;
        this.f98675f = segment;
    }

    @NotNull
    public final H c() {
        this.f98673d = true;
        return new H(this.f98670a, this.f98671b, this.f98672c, true, false);
    }

    public final void d(@NotNull H sink, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f98674e) {
            throw new IllegalStateException("only owner can write");
        }
        int i12 = sink.f98672c;
        int i13 = i12 + i11;
        byte[] bArr = sink.f98670a;
        if (i13 > 8192) {
            if (sink.f98673d) {
                throw new IllegalArgumentException();
            }
            int i14 = sink.f98671b;
            if (i13 - i14 > 8192) {
                throw new IllegalArgumentException();
            }
            C7705l.s(i14, i12, 2, bArr, bArr);
            sink.f98672c -= sink.f98671b;
            sink.f98671b = 0;
        }
        int i15 = sink.f98672c;
        int i16 = this.f98671b;
        C7705l.o(i15, i16, i16 + i11, this.f98670a, bArr);
        sink.f98672c += i11;
        this.f98671b += i11;
    }

    public H(@NotNull byte[] data, int i11, int i12, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f98670a = data;
        this.f98671b = i11;
        this.f98672c = i12;
        this.f98673d = z11;
        this.f98674e = z12;
    }
}
