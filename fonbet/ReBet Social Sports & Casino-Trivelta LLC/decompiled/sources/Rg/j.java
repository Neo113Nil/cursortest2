package Rg;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import ti.G;
import ti.InterfaceC6479i;
import ti.t;

/* loaded from: classes3.dex */
public final class j extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final Long f10303a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f10304b;

    public j(Long l10, Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f10303a = l10;
        this.f10304b = block;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        Long l10 = this.f10303a;
        if (l10 != null) {
            return l10.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType getContentType() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return true;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC6479i sink) {
        Long l10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            Throwable th2 = null;
            G k10 = t.k(io.ktor.utils.io.jvm.javaio.b.d((io.ktor.utils.io.f) this.f10304b.invoke(), null, 1, null));
            try {
                l10 = Long.valueOf(sink.Y(k10));
            } catch (Throwable th3) {
                th2 = th3;
                l10 = null;
            }
            if (k10 != null) {
                try {
                    k10.close();
                } catch (Throwable th4) {
                    if (th2 == null) {
                        th2 = th4;
                    } else {
                        ExceptionsKt.addSuppressed(th2, th4);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.checkNotNull(l10);
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable th5) {
            throw new i(th5);
        }
    }
}
