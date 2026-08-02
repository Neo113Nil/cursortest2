package oi;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21255c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f21256d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21257e;

    public /* synthetic */ f0(Method method, int i5, int i10) {
        this.f21255c = i10;
        this.f21256d = method;
        this.f21257e = i5;
    }

    @Override // oi.z0
    public final void a(p0 p0Var, Object obj) {
        switch (this.f21255c) {
            case 0:
                Headers headers = (Headers) obj;
                if (headers == null) {
                    throw z0.m(this.f21256d, this.f21257e, "Headers parameter must not be null.", new Object[0]);
                }
                gh.v vVar = p0Var.f21292f;
                vVar.getClass();
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(vVar, "<this>");
                Intrinsics.checkNotNullParameter(headers, "headers");
                int size = headers.size();
                for (int i5 = 0; i5 < size; i5++) {
                    y4.a.i(vVar, headers.name(i5), headers.value(i5));
                }
                return;
            default:
                if (obj == null) {
                    throw z0.m(this.f21256d, this.f21257e, "@Url parameter is null.", new Object[0]);
                }
                p0Var.f21289c = obj.toString();
                return;
        }
    }
}
