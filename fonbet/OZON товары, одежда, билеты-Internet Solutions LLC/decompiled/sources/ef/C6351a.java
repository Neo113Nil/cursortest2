package ef;

import We.A;
import We.B;
import We.C;
import We.C4873o;
import We.G;
import We.InterfaceC4875q;
import We.K;
import We.L;
import We.M;
import We.z;
import java.io.IOException;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.t;

/* renamed from: ef.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6351a implements B {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4875q f62216a;

    public C6351a(@NotNull InterfaceC4875q cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f62216a = cookieJar;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) throws IOException {
        boolean z11;
        M c11;
        G a11 = Ek.a.a(aVar, "chain");
        G.a aVar2 = new G.a(a11);
        K a12 = a11.a();
        if (a12 != null) {
            C contentType = a12.getContentType();
            if (contentType != null) {
                aVar2.d("Content-Type", contentType.toString());
            }
            long contentLength = a12.contentLength();
            if (contentLength != -1) {
                aVar2.d("Content-Length", String.valueOf(contentLength));
                aVar2.h("Transfer-Encoding");
            } else {
                aVar2.d("Transfer-Encoding", "chunked");
                aVar2.h("Content-Length");
            }
        }
        int i11 = 0;
        if (a11.d("Host") == null) {
            aVar2.d("Host", Ye.b.A(a11.j(), false));
        }
        if (a11.d("Connection") == null) {
            aVar2.d("Connection", "Keep-Alive");
        }
        if (a11.d("Accept-Encoding") == null && a11.d("Range") == null) {
            aVar2.d("Accept-Encoding", "gzip");
            z11 = true;
        } else {
            z11 = false;
        }
        A j11 = a11.j();
        InterfaceC4875q interfaceC4875q = this.f62216a;
        List<C4873o> loadForRequest = interfaceC4875q.loadForRequest(j11);
        if (!loadForRequest.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : loadForRequest) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                C4873o c4873o = (C4873o) obj;
                if (i11 > 0) {
                    sb2.append("; ");
                }
                sb2.append(c4873o.f());
                sb2.append('=');
                sb2.append(c4873o.i());
                i11 = i12;
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            aVar2.d("Cookie", sb3);
        }
        if (a11.d("User-Agent") == null) {
            aVar2.d("User-Agent", "okhttp/4.9.3");
        }
        L proceed = aVar.proceed(aVar2.b());
        C6355e.e(interfaceC4875q, a11.j(), proceed.r());
        L.a aVar3 = new L.a(proceed);
        aVar3.r(a11);
        if (z11 && "gzip".equalsIgnoreCase(L.q(proceed, "Content-Encoding")) && C6355e.b(proceed) && (c11 = proceed.c()) != null) {
            t tVar = new t(c11.source());
            z.a h11 = proceed.r().h();
            h11.h("Content-Encoding");
            h11.h("Content-Length");
            aVar3.j(h11.e());
            aVar3.b(new C6358h(L.q(proceed, "Content-Type"), -1L, sf.z.d(tVar)));
        }
        return aVar3.c();
    }
}
