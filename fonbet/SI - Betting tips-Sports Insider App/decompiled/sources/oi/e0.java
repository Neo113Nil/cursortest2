package oi;

import androidx.appcompat.widget.c1;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21251c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f21252d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21253e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21254f;

    public /* synthetic */ e0(Method method, int i5, boolean z5, int i10) {
        this.f21251c = i10;
        this.f21252d = method;
        this.f21253e = i5;
        this.f21254f = z5;
    }

    @Override // oi.z0
    public final void a(p0 p0Var, Object obj) {
        switch (this.f21251c) {
            case 0:
                Map map = (Map) obj;
                int i5 = this.f21253e;
                Method method = this.f21252d;
                if (map == null) {
                    throw z0.m(method, i5, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw z0.m(method, i5, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw z0.m(method, i5, c1.n("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String obj2 = value.toString();
                    if (obj2 == null) {
                        throw z0.m(method, i5, "Field map value '" + value + "' converted to null by " + a.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    p0Var.a(str, obj2, this.f21254f);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i10 = this.f21253e;
                Method method2 = this.f21252d;
                if (map2 == null) {
                    throw z0.m(method2, i10, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw z0.m(method2, i10, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw z0.m(method2, i10, c1.n("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    p0Var.b(str2, value2.toString(), this.f21254f);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i11 = this.f21253e;
                Method method3 = this.f21252d;
                if (map3 == null) {
                    throw z0.m(method3, i11, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw z0.m(method3, i11, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw z0.m(method3, i11, c1.n("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String obj3 = value3.toString();
                    if (obj3 == null) {
                        throw z0.m(method3, i11, "Query map value '" + value3 + "' converted to null by " + a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    p0Var.d(str3, obj3, this.f21254f);
                }
                return;
        }
    }
}
