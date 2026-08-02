package oi;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class a implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21225b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f21226c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f21227d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f21228e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f21229f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f21230g = new a(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21231a;

    public /* synthetic */ a(int i5) {
        this.f21231a = i5;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new o(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(int i5, Method method) {
        return "parameter #" + (i5 + 1);
    }

    public Object d(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX WARN: Finally extract failed */
    @Override // oi.m
    public Object e(Object obj) {
        switch (this.f21231a) {
            case 0:
                return obj.toString();
            case 1:
                gh.r0 r0Var = (gh.r0) obj;
                try {
                    Buffer content = new Buffer();
                    r0Var.m0().readAll(content);
                    gh.b0 n9 = r0Var.n();
                    long k6 = r0Var.k();
                    gh.q0 q0Var = gh.r0.f10297b;
                    Intrinsics.checkNotNullParameter(content, "content");
                    Intrinsics.checkNotNullParameter(content, "<this>");
                    gh.q0 q0Var2 = new gh.q0(n9, k6, content);
                    r0Var.close();
                    return q0Var2;
                } catch (Throwable th2) {
                    r0Var.close();
                    throw th2;
                }
            case 2:
                return (gh.m0) obj;
            case 3:
                return (gh.r0) obj;
            case 4:
                ((gh.r0) obj).close();
                return Unit.f19194a;
            default:
                ((gh.r0) obj).close();
                return null;
        }
    }

    public boolean f(Method method) {
        return false;
    }
}
