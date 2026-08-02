package sg;

import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final hf.i f23721a;

    static {
        hf.i builder = new hf.i();
        ag.c orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        ci.c.X(StringCompanionObject.INSTANCE);
        builder.put(orCreateKotlinClass, e1.f23623a);
        ag.c orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Character.TYPE);
        Intrinsics.checkNotNullParameter(CharCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass2, n.f23660a);
        builder.put(Reflection.getOrCreateKotlinClass(char[].class), m.f23658c);
        ag.c orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Double.TYPE);
        Intrinsics.checkNotNullParameter(DoubleCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass3, r.f23678a);
        builder.put(Reflection.getOrCreateKotlinClass(double[].class), q.f23673c);
        ag.c orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Float.TYPE);
        Intrinsics.checkNotNullParameter(FloatCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass4, y.f23717a);
        builder.put(Reflection.getOrCreateKotlinClass(float[].class), x.f23715c);
        ag.c orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Long.TYPE);
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass5, l0.f23654a);
        builder.put(Reflection.getOrCreateKotlinClass(long[].class), k0.f23649c);
        ag.c orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(gf.d0.class);
        Intrinsics.checkNotNullParameter(gf.d0.f10017b, "<this>");
        builder.put(orCreateKotlinClass6, n1.f23662a);
        ag.c orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass7, f0.f23626a);
        builder.put(Reflection.getOrCreateKotlinClass(int[].class), e0.f23622c);
        ag.c orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(gf.a0.class);
        Intrinsics.checkNotNullParameter(gf.a0.f10010b, "<this>");
        builder.put(orCreateKotlinClass8, k1.f23650a);
        ag.c orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(Short.TYPE);
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass9, d1.f23618a);
        builder.put(Reflection.getOrCreateKotlinClass(short[].class), c1.f23614c);
        ag.c orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(gf.h0.class);
        Intrinsics.checkNotNullParameter(gf.h0.f10022b, "<this>");
        builder.put(orCreateKotlinClass10, q1.f23676a);
        ag.c orCreateKotlinClass11 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass11, j.f23644a);
        builder.put(Reflection.getOrCreateKotlinClass(byte[].class), i.f23640c);
        ag.c orCreateKotlinClass12 = Reflection.getOrCreateKotlinClass(gf.w.class);
        Intrinsics.checkNotNullParameter(gf.w.f10042b, "<this>");
        builder.put(orCreateKotlinClass12, h1.f23638a);
        ag.c orCreateKotlinClass13 = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(BooleanCompanionObject.INSTANCE, "<this>");
        builder.put(orCreateKotlinClass13, g.f23630a);
        builder.put(Reflection.getOrCreateKotlinClass(boolean[].class), f.f23625c);
        ag.c orCreateKotlinClass14 = Reflection.getOrCreateKotlinClass(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.f19194a, "<this>");
        builder.put(orCreateKotlinClass14, r1.f23683b);
        builder.put(Reflection.getOrCreateKotlinClass(Void.class), p0.f23670a);
        try {
            ag.c orCreateKotlinClass15 = Reflection.getOrCreateKotlinClass(cg.b.class);
            Intrinsics.checkNotNullParameter(cg.b.f3911b, "<this>");
            builder.put(orCreateKotlinClass15, s.f23685a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(gf.e0.class), m1.f23659c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(gf.b0.class), j1.f23648c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(gf.i0.class), p1.f23672c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            builder.put(Reflection.getOrCreateKotlinClass(gf.y.class), g1.f23634c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            ag.c orCreateKotlinClass16 = Reflection.getOrCreateKotlinClass(dg.b.class);
            Intrinsics.checkNotNullParameter(dg.b.f8374c, "<this>");
            builder.put(orCreateKotlinClass16, s1.f23689a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            ag.c orCreateKotlinClass17 = Reflection.getOrCreateKotlinClass(cg.g.class);
            Intrinsics.checkNotNullParameter(cg.g.f3925c, "<this>");
            builder.put(orCreateKotlinClass17, c0.f23612a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        f23721a = builder.c();
    }
}
