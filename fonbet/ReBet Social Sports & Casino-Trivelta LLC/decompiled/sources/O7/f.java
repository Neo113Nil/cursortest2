package O7;

import C7.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f8348a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8349b;

    /* renamed from: c, reason: collision with root package name */
    public final d f8350c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f8351d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8352e;

    public f(int i10, boolean z10, d dVar, Integer num, boolean z11) {
        this.f8348a = i10;
        this.f8349b = z10;
        this.f8350c = dVar;
        this.f8351d = num;
        this.f8352e = z11;
    }

    public final c a(u7.c cVar, boolean z10) {
        d dVar = this.f8350c;
        if (dVar != null) {
            return dVar.createImageTranscoder(cVar, z10);
        }
        return null;
    }

    public final c b(u7.c cVar, boolean z10) {
        Integer num = this.f8351d;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return c(cVar, z10);
        }
        if (num == null || num.intValue() != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return d(cVar, z10);
    }

    public final c c(u7.c cVar, boolean z10) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f8348a, this.f8349b, this.f8352e).createImageTranscoder(cVar, z10);
    }

    @Override // O7.d
    public c createImageTranscoder(u7.c imageFormat, boolean z10) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        c a10 = a(imageFormat, z10);
        if (a10 == null) {
            a10 = b(imageFormat, z10);
        }
        if (a10 == null && z.a()) {
            a10 = c(imageFormat, z10);
        }
        return a10 == null ? d(imageFormat, z10) : a10;
    }

    public final c d(u7.c cVar, boolean z10) {
        c createImageTranscoder = new h(this.f8348a).createImageTranscoder(cVar, z10);
        Intrinsics.checkNotNullExpressionValue(createImageTranscoder, "createImageTranscoder(...)");
        return createImageTranscoder;
    }
}
