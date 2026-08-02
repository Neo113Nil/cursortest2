package g1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import c1.e1;
import com.google.android.gms.internal.measurement.d5;
import com.sports.insider.data.repository.room.live.LiveTable;
import f1.g;
import f1.h;
import f1.i;
import gf.m;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f9708a = new f();

    public final a a(FileInputStream input) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            f1.e o3 = f1.e.o(input);
            Intrinsics.checkNotNull(o3);
            d[] pairs = new d[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            a aVar = new a(false);
            d[] pairs2 = (d[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            aVar.b();
            if (pairs2.length > 0) {
                d dVar = pairs2[0];
                throw null;
            }
            Map m6 = o3.m();
            Intrinsics.checkNotNullExpressionValue(m6, "getPreferencesMap(...)");
            for (Map.Entry entry : m6.entrySet()) {
                String name = (String) entry.getKey();
                i iVar = (i) entry.getValue();
                Intrinsics.checkNotNull(name);
                Intrinsics.checkNotNull(iVar);
                int C = iVar.C();
                switch (C == 0 ? -1 : e.$EnumSwitchMapping$0[v.f.d(C)]) {
                    case -1:
                        throw new c1.b("Value case is null.", 0);
                    case 0:
                    default:
                        throw new m();
                    case 1:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key = new c(name);
                        Boolean valueOf = Boolean.valueOf(iVar.t());
                        Intrinsics.checkNotNullParameter(key, "key");
                        aVar.f(key, valueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key2 = new c(name);
                        Float valueOf2 = Float.valueOf(iVar.x());
                        Intrinsics.checkNotNullParameter(key2, "key");
                        aVar.f(key2, valueOf2);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key3 = new c(name);
                        Double valueOf3 = Double.valueOf(iVar.w());
                        Intrinsics.checkNotNullParameter(key3, "key");
                        aVar.f(key3, valueOf3);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key4 = new c(name);
                        Integer valueOf4 = Integer.valueOf(iVar.y());
                        Intrinsics.checkNotNullParameter(key4, "key");
                        aVar.f(key4, valueOf4);
                        break;
                    case 5:
                        c key5 = d5.C(name);
                        Long valueOf5 = Long.valueOf(iVar.z());
                        Intrinsics.checkNotNullParameter(key5, "key");
                        aVar.f(key5, valueOf5);
                        break;
                    case 6:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key6 = new c(name);
                        String A = iVar.A();
                        Intrinsics.checkNotNullParameter(key6, "key");
                        aVar.f(key6, A);
                        break;
                    case 7:
                        c key7 = d5.W(name);
                        z n9 = iVar.B().n();
                        Intrinsics.checkNotNullExpressionValue(n9, "getStringsList(...)");
                        Set Z = CollectionsKt.Z(n9);
                        Intrinsics.checkNotNullParameter(key7, "key");
                        aVar.f(key7, Z);
                        break;
                    case 8:
                        Intrinsics.checkNotNullParameter(name, "name");
                        c key8 = new c(name);
                        androidx.datastore.preferences.protobuf.i u10 = iVar.u();
                        int size = u10.size();
                        if (size == 0) {
                            bArr = a0.f1573b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u10.d(size, bArr2);
                            bArr = bArr2;
                        }
                        Intrinsics.checkNotNullParameter(key8, "key");
                        aVar.f(key8, bArr);
                        break;
                    case 9:
                        throw new c1.b("Value not set.", 0);
                }
            }
            return new a(n0.j(aVar.a()), true);
        } catch (c0 e7) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", LiveTable.messageColumn);
            throw new c1.b("Unable to parse preferences proto.", e7);
        }
    }

    public final Unit b(Object obj, e1 e1Var) {
        y a7;
        Map a10 = ((a) obj).a();
        f1.c n9 = f1.e.n();
        for (Map.Entry entry : a10.entrySet()) {
            c cVar = (c) entry.getKey();
            Object value = entry.getValue();
            String str = cVar.f9707a;
            if (value instanceof Boolean) {
                h D = i.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.d();
                i.q((i) D.f1724b, booleanValue);
                a7 = D.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            } else if (value instanceof Float) {
                h D2 = i.D();
                float floatValue = ((Number) value).floatValue();
                D2.d();
                i.r((i) D2.f1724b, floatValue);
                a7 = D2.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            } else if (value instanceof Double) {
                h D3 = i.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.d();
                i.o((i) D3.f1724b, doubleValue);
                a7 = D3.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            } else if (value instanceof Integer) {
                h D4 = i.D();
                int intValue = ((Number) value).intValue();
                D4.d();
                i.s((i) D4.f1724b, intValue);
                a7 = D4.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            } else if (value instanceof Long) {
                h D5 = i.D();
                long longValue = ((Number) value).longValue();
                D5.d();
                i.l((i) D5.f1724b, longValue);
                a7 = D5.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            } else if (value instanceof String) {
                h D6 = i.D();
                D6.d();
                i.m((i) D6.f1724b, (String) value);
                a7 = D6.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            } else if (value instanceof Set) {
                h D7 = i.D();
                f1.f o3 = g.o();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o3.d();
                g.l((g) o3.f1724b, (Set) value);
                D7.d();
                i.n((i) D7.f1724b, (g) o3.a());
                a7 = D7.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                h D8 = i.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.h c2 = androidx.datastore.preferences.protobuf.i.c(bArr, 0, bArr.length);
                D8.d();
                i.p((i) D8.f1724b, c2);
                a7 = D8.a();
                Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
            }
            n9.getClass();
            str.getClass();
            n9.d();
            f1.e.l((f1.e) n9.f1724b).put(str, (i) a7);
        }
        f1.e eVar = (f1.e) n9.a();
        int a11 = eVar.a(null);
        Logger logger = o.f1660f;
        if (a11 > 4096) {
            a11 = 4096;
        }
        o oVar = new o(e1Var, a11);
        eVar.b(oVar);
        if (oVar.f1665d > 0) {
            oVar.h0();
        }
        return Unit.f19194a;
    }
}
