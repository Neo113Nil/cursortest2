package oi;

import androidx.appcompat.widget.c1;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21258c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Method f21259d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21260e;

    /* renamed from: f, reason: collision with root package name */
    public final m f21261f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21262g;

    public g0(Method method, int i5, m mVar, String str) {
        this.f21259d = method;
        this.f21260e = i5;
        this.f21261f = mVar;
        this.f21262g = str;
    }

    @Override // oi.z0
    public final void a(p0 p0Var, Object obj) {
        int i5 = this.f21258c;
        m mVar = this.f21261f;
        Object obj2 = this.f21262g;
        Method method = this.f21259d;
        int i10 = this.f21260e;
        switch (i5) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    p0Var.c((Headers) obj2, (gh.m0) mVar.e(obj));
                    return;
                } catch (IOException e7) {
                    throw z0.m(method, i10, "Unable to convert " + obj + " to RequestBody", e7);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw z0.m(method, i10, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw z0.m(method, i10, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw z0.m(method, i10, c1.n("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    p0Var.c(Headers.of("Content-Disposition", c1.n("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (gh.m0) mVar.e(value));
                }
                return;
        }
    }

    public g0(Method method, int i5, Headers headers, m mVar) {
        this.f21259d = method;
        this.f21260e = i5;
        this.f21262g = headers;
        this.f21261f = mVar;
    }
}
