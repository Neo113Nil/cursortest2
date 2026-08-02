package L0;

import I0.A;
import I0.C1339d;
import L0.f;
import androidx.datastore.preferences.f;
import androidx.datastore.preferences.g;
import androidx.datastore.preferences.h;
import androidx.datastore.preferences.protobuf.AbstractC2132g;
import androidx.datastore.preferences.protobuf.AbstractC2147w;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements A {

    /* renamed from: a, reason: collision with root package name */
    public static final h f6751a = new h();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // I0.A
    public Object b(InputStream inputStream, Continuation continuation) {
        androidx.datastore.preferences.f a10 = androidx.datastore.preferences.d.f19388a.a(inputStream);
        c b10 = g.b(new f.b[0]);
        Map N10 = a10.N();
        Intrinsics.checkNotNullExpressionValue(N10, "preferencesProto.preferencesMap");
        for (Map.Entry entry : N10.entrySet()) {
            String name = (String) entry.getKey();
            androidx.datastore.preferences.h value = (androidx.datastore.preferences.h) entry.getValue();
            h hVar = f6751a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            hVar.c(name, value, b10);
        }
        return b10.e();
    }

    public final void c(String str, androidx.datastore.preferences.h hVar, c cVar) {
        h.b c02 = hVar.c0();
        switch (c02 == null ? -1 : a.$EnumSwitchMapping$0[c02.ordinal()]) {
            case -1:
                throw new C1339d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                cVar.k(i.a(str), Boolean.valueOf(hVar.T()));
                return;
            case 2:
                cVar.k(i.d(str), Float.valueOf(hVar.X()));
                return;
            case 3:
                cVar.k(i.c(str), Double.valueOf(hVar.W()));
                return;
            case 4:
                cVar.k(i.e(str), Integer.valueOf(hVar.Y()));
                return;
            case 5:
                cVar.k(i.f(str), Long.valueOf(hVar.Z()));
                return;
            case 6:
                f.a g10 = i.g(str);
                String a02 = hVar.a0();
                Intrinsics.checkNotNullExpressionValue(a02, "value.string");
                cVar.k(g10, a02);
                return;
            case 7:
                f.a h10 = i.h(str);
                List P10 = hVar.b0().P();
                Intrinsics.checkNotNullExpressionValue(P10, "value.stringSet.stringsList");
                cVar.k(h10, CollectionsKt.toSet(P10));
                return;
            case 8:
                f.a b10 = i.b(str);
                byte[] o10 = hVar.U().o();
                Intrinsics.checkNotNullExpressionValue(o10, "value.bytes.toByteArray()");
                cVar.k(b10, o10);
                return;
            case 9:
                throw new C1339d("Value not set.", null, 2, null);
        }
    }

    @Override // I0.A
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f getDefaultValue() {
        return g.a();
    }

    public final androidx.datastore.preferences.h e(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC2147w e10 = androidx.datastore.preferences.h.d0().m(((Boolean) obj).booleanValue()).e();
            Intrinsics.checkNotNullExpressionValue(e10, "newBuilder().setBoolean(value).build()");
            return (androidx.datastore.preferences.h) e10;
        }
        if (obj instanceof Float) {
            AbstractC2147w e11 = androidx.datastore.preferences.h.d0().p(((Number) obj).floatValue()).e();
            Intrinsics.checkNotNullExpressionValue(e11, "newBuilder().setFloat(value).build()");
            return (androidx.datastore.preferences.h) e11;
        }
        if (obj instanceof Double) {
            AbstractC2147w e12 = androidx.datastore.preferences.h.d0().o(((Number) obj).doubleValue()).e();
            Intrinsics.checkNotNullExpressionValue(e12, "newBuilder().setDouble(value).build()");
            return (androidx.datastore.preferences.h) e12;
        }
        if (obj instanceof Integer) {
            AbstractC2147w e13 = androidx.datastore.preferences.h.d0().q(((Number) obj).intValue()).e();
            Intrinsics.checkNotNullExpressionValue(e13, "newBuilder().setInteger(value).build()");
            return (androidx.datastore.preferences.h) e13;
        }
        if (obj instanceof Long) {
            AbstractC2147w e14 = androidx.datastore.preferences.h.d0().r(((Number) obj).longValue()).e();
            Intrinsics.checkNotNullExpressionValue(e14, "newBuilder().setLong(value).build()");
            return (androidx.datastore.preferences.h) e14;
        }
        if (obj instanceof String) {
            AbstractC2147w e15 = androidx.datastore.preferences.h.d0().s((String) obj).e();
            Intrinsics.checkNotNullExpressionValue(e15, "newBuilder().setString(value).build()");
            return (androidx.datastore.preferences.h) e15;
        }
        if (obj instanceof Set) {
            h.a d02 = androidx.datastore.preferences.h.d0();
            g.a Q10 = androidx.datastore.preferences.g.Q();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC2147w e16 = d02.t(Q10.m((Set) obj)).e();
            Intrinsics.checkNotNullExpressionValue(e16, "newBuilder()\n           …                 .build()");
            return (androidx.datastore.preferences.h) e16;
        }
        if (obj instanceof byte[]) {
            AbstractC2147w e17 = androidx.datastore.preferences.h.d0().n(AbstractC2132g.f((byte[]) obj)).e();
            Intrinsics.checkNotNullExpressionValue(e17, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (androidx.datastore.preferences.h) e17;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // I0.A
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(f fVar, OutputStream outputStream, Continuation continuation) {
        Map a10 = fVar.a();
        f.a Q10 = androidx.datastore.preferences.f.Q();
        for (Map.Entry entry : a10.entrySet()) {
            Q10.m(((f.a) entry.getKey()).a(), e(entry.getValue()));
        }
        ((androidx.datastore.preferences.f) Q10.e()).e(outputStream);
        return Unit.INSTANCE;
    }
}
