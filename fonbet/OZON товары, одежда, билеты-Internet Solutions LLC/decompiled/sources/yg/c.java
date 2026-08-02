package yg;

import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f106600a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<f> f106601b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f106602c;

    /* renamed from: d, reason: collision with root package name */
    private final long f106603d;

    public c(@NotNull String boundary, @NotNull List<f> parts) {
        long j11;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f106600a = boundary;
        this.f106601b = parts;
        this.f106602c = "multipart/form-data; boundary=".concat(boundary);
        List<f> list = parts;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C10897a) ((f) it.next()).a()).d() < 0) {
                    j11 = -1;
                    break;
                }
            }
        }
        List<f> list2 = this.f106601b;
        bArr = e.f106606b;
        long length = bArr.length + e.d(this.f106600a);
        bArr2 = e.f106605a;
        long length2 = length + bArr2.length;
        for (f fVar : list2) {
            bArr3 = e.f106606b;
            long length3 = length2 + bArr3.length + e.d(this.f106600a);
            bArr4 = e.f106605a;
            length2 = length3 + bArr4.length + fVar.b();
        }
        j11 = length2;
        this.f106603d = j11;
    }

    @Override // yg.h
    @NotNull
    public final String c() {
        return this.f106602c;
    }

    @Override // yg.h
    public final long d() {
        return this.f106603d;
    }

    @Override // yg.h
    public final void writeTo(@NotNull OutputStream stream) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Intrinsics.checkNotNullParameter(stream, "stream");
        Iterator<f> it = this.f106601b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = this.f106600a;
            if (!hasNext) {
                bArr = e.f106606b;
                stream.write(bArr);
                e.e(stream, str);
                bArr2 = e.f106606b;
                stream.write(bArr2);
                return;
            }
            f next = it.next();
            bArr3 = e.f106606b;
            stream.write(bArr3);
            e.e(stream, str);
            bArr4 = e.f106605a;
            stream.write(bArr4);
            next.c(stream);
        }
    }
}
