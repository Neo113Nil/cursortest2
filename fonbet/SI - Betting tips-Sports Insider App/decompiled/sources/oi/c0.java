package oi;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f21244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21245d;

    /* renamed from: e, reason: collision with root package name */
    public final m f21246e;

    public c0(Method method, int i5, m mVar) {
        this.f21244c = method;
        this.f21245d = i5;
        this.f21246e = mVar;
    }

    @Override // oi.z0
    public final void a(p0 p0Var, Object obj) {
        int i5 = this.f21245d;
        Method method = this.f21244c;
        if (obj == null) {
            throw z0.m(method, i5, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            p0Var.f21296k = (gh.m0) this.f21246e.e(obj);
        } catch (IOException e7) {
            throw z0.n(method, e7, i5, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
