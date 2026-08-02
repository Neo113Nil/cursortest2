package oi;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21270a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f21271b;

    public /* synthetic */ i(int i5, Type type) {
        this.f21270a = i5;
        this.f21271b = type;
    }

    @Override // oi.f
    public final Type a() {
        switch (this.f21270a) {
        }
        return this.f21271b;
    }

    @Override // oi.f
    public final Object c(a0 call) {
        switch (this.f21270a) {
            case 0:
                j jVar = new j(call);
                call.o0(new h(jVar, 0));
                return jVar;
            case 1:
                j jVar2 = new j(call);
                call.o0(new h(jVar2, 1));
                return jVar2;
            default:
                Intrinsics.checkNotNullParameter(call, "call");
                eg.r a7 = eg.c0.a();
                a7.J(new fg.d(13, a7, call));
                call.o0(new com.android.billingclient.api.e(a7));
                return a7;
        }
    }

    public i(Type responseType) {
        this.f21270a = 2;
        Intrinsics.checkNotNullParameter(responseType, "responseType");
        this.f21271b = responseType;
    }
}
