package lh;

import gh.i0;
import gh.o0;
import gh.z;
import java.util.ArrayList;
import kh.p;
import kh.s;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f20089a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20091c;

    /* renamed from: d, reason: collision with root package name */
    public final kh.h f20092d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f20093e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20094f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20095g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20096h;

    /* renamed from: i, reason: collision with root package name */
    public int f20097i;

    public h(p call, ArrayList interceptors, int i5, kh.h hVar, i0 request, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f20089a = call;
        this.f20090b = interceptors;
        this.f20091c = i5;
        this.f20092d = hVar;
        this.f20093e = request;
        this.f20094f = i10;
        this.f20095g = i11;
        this.f20096h = i12;
    }

    public static h a(h hVar, int i5, kh.h hVar2, i0 i0Var, int i10) {
        if ((i10 & 1) != 0) {
            i5 = hVar.f20091c;
        }
        int i11 = i5;
        if ((i10 & 2) != 0) {
            hVar2 = hVar.f20092d;
        }
        kh.h hVar3 = hVar2;
        if ((i10 & 4) != 0) {
            i0Var = hVar.f20093e;
        }
        i0 request = i0Var;
        int i12 = hVar.f20094f;
        int i13 = hVar.f20095g;
        int i14 = hVar.f20096h;
        Intrinsics.checkNotNullParameter(request, "request");
        return new h(hVar.f20089a, hVar.f20090b, i11, hVar3, request, i12, i13, i14);
    }

    public final o0 b(i0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f20090b;
        int size = arrayList.size();
        int i5 = this.f20091c;
        if (i5 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f20097i++;
        kh.h hVar = this.f20092d;
        if (hVar != null) {
            if (!((s) ((kh.i) hVar.f19121d).c()).f(request.f10206a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i5 - 1) + " must retain the same host and port").toString());
            }
            if (this.f20097i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i5 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i5 + 1;
        h a7 = a(this, i10, null, request, 58);
        z zVar = (z) arrayList.get(i5);
        o0 a10 = zVar.a(a7);
        if (a10 == null) {
            throw new NullPointerException("interceptor " + zVar + " returned null");
        }
        if (hVar == null || i10 >= arrayList.size() || a7.f20097i == 1) {
            return a10;
        }
        throw new IllegalStateException(("network interceptor " + zVar + " must call proceed() exactly once").toString());
    }
}
