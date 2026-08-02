package tg;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import sg.e1;
import sg.g0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class z implements qg.g {

    /* renamed from: b, reason: collision with root package name */
    public static final z f23964b = new z();

    /* renamed from: c, reason: collision with root package name */
    public static final String f23965c = "kotlinx.serialization.json.JsonObject";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f23966a;

    public z() {
        ci.c.X(StringCompanionObject.INSTANCE);
        e1 e1Var = e1.f23623a;
        o oVar = o.f23954a;
        e1 keySerializer = e1.f23623a;
        o valueSerializer = o.f23954a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        e1 kSerializer = e1.f23623a;
        o vSerializer = o.f23954a;
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.f23966a = new g0(e1.f23624b, o.f23955b);
    }

    @Override // qg.g
    public final String a() {
        return f23965c;
    }

    @Override // qg.g
    public final boolean c() {
        this.f23966a.getClass();
        return false;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f23966a.d(name);
    }

    @Override // qg.g
    public final a.a e() {
        this.f23966a.getClass();
        return qg.k.f22180g;
    }

    @Override // qg.g
    public final int f() {
        this.f23966a.getClass();
        return 2;
    }

    @Override // qg.g
    public final String g(int i5) {
        this.f23966a.getClass();
        return String.valueOf(i5);
    }

    @Override // qg.g
    public final List getAnnotations() {
        this.f23966a.getClass();
        return e0.f19204a;
    }

    @Override // qg.g
    public final List h(int i5) {
        return this.f23966a.h(i5);
    }

    @Override // qg.g
    public final qg.g i(int i5) {
        return this.f23966a.i(i5);
    }

    @Override // qg.g
    public final boolean isInline() {
        this.f23966a.getClass();
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        this.f23966a.j(i5);
        return false;
    }
}
