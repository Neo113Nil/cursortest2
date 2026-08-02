package b;

import java.io.InputStream;

/* renamed from: b.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2322s extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f24142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24143b;

    public AbstractC2322s(InputStream inputStream, int i10) {
        this.f24142a = inputStream;
        this.f24143b = i10;
    }

    public final void d() {
        InputStream inputStream = this.f24142a;
        if (inputStream instanceof C2314k) {
            C2314k c2314k = (C2314k) inputStream;
            c2314k.f24128g = true;
            c2314k.k();
        }
    }
}
