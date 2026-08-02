package Tg;

import Tg.u;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(String url, Long l10) {
        super(r0.toString());
        Intrinsics.checkNotNullParameter(url, "url");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        sb2.append(l10 == null ? "unknown" : l10);
        sb2.append(" ms]");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(Wg.c request) {
        this(r0, r3 != null ? r3.d() : null);
        Intrinsics.checkNotNullParameter(request, "request");
        String c10 = request.i().c();
        u.a aVar = (u.a) request.f(u.f11967d);
    }
}
