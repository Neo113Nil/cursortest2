package yg;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10897a f106607a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f106608b;

    public f(@NotNull String name, String str, String str2, @NotNull C10897a body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f106607a = body;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Content-Disposition: form-data; name=");
        e.a(name, sb2);
        if (str != null) {
            sb2.append("; filename=");
            e.a(str, sb2);
        }
        sb2.append("\r\n");
        if (str2 != null) {
            sb2.append("Content-Type: ");
            sb2.append(str2);
            sb2.append("\r\n");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f106608b = sb3;
    }

    @NotNull
    public final h a() {
        return this.f106607a;
    }

    public final long b() {
        byte[] bArr;
        byte[] bArr2;
        C10897a c10897a = this.f106607a;
        if (c10897a.d() < 0) {
            return -1L;
        }
        int d11 = e.d(this.f106608b);
        bArr = e.f106605a;
        long d12 = c10897a.d() + d11 + bArr.length;
        bArr2 = e.f106605a;
        return d12 + bArr2.length;
    }

    public final void c(@NotNull OutputStream stream) {
        byte[] bArr;
        byte[] bArr2;
        Intrinsics.checkNotNullParameter(stream, "stream");
        e.e(stream, this.f106608b);
        bArr = e.f106605a;
        stream.write(bArr);
        this.f106607a.writeTo(stream);
        bArr2 = e.f106605a;
        stream.write(bArr2);
    }
}
