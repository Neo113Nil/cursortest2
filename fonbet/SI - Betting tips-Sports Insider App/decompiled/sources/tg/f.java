package tg;

import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f implements qg.g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f23943b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final String f23944c = "kotlinx.serialization.json.JsonArray";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.c f23945a;

    public f() {
        o element = o.f23954a;
        Intrinsics.checkNotNullParameter(element, "elementSerializer");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        qg.g elementDesc = element.d();
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f23945a = new sg.c(elementDesc);
    }

    @Override // qg.g
    public final String a() {
        return f23944c;
    }

    @Override // qg.g
    public final boolean c() {
        this.f23945a.getClass();
        return false;
    }

    @Override // qg.g
    public final int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f23945a.d(name);
    }

    @Override // qg.g
    public final a.a e() {
        this.f23945a.getClass();
        return qg.k.f22179f;
    }

    @Override // qg.g
    public final int f() {
        this.f23945a.getClass();
        return 1;
    }

    @Override // qg.g
    public final String g(int i5) {
        this.f23945a.getClass();
        return String.valueOf(i5);
    }

    @Override // qg.g
    public final List getAnnotations() {
        this.f23945a.getClass();
        return e0.f19204a;
    }

    @Override // qg.g
    public final List h(int i5) {
        return this.f23945a.h(i5);
    }

    @Override // qg.g
    public final qg.g i(int i5) {
        return this.f23945a.i(i5);
    }

    @Override // qg.g
    public final boolean isInline() {
        this.f23945a.getClass();
        return false;
    }

    @Override // qg.g
    public final boolean j(int i5) {
        this.f23945a.j(i5);
        return false;
    }
}
