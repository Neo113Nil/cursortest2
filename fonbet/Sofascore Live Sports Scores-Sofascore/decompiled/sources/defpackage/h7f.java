package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class h7f {
    public static final ltb a;

    static {
        ltb ltbVar = new ltb();
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(String.class);
        l98.h0(phi.a);
        ltbVar.put(orCreateKotlinClass, uhi.a);
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(Character.TYPE);
        wo2.a.getClass();
        ltbVar.put(orCreateKotlinClass2, sp2.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(char[].class), vo2.c);
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(Double.TYPE);
        a75.a.getClass();
        ltbVar.put(orCreateKotlinClass3, h75.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(double[].class), u65.c);
        KClass orCreateKotlinClass4 = fufVar.getOrCreateKotlinClass(Float.TYPE);
        x78.a.getClass();
        ltbVar.put(orCreateKotlinClass4, c88.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(float[].class), w78.c);
        KClass orCreateKotlinClass5 = fufVar.getOrCreateKotlinClass(Long.TYPE);
        rjb.a.getClass();
        ltbVar.put(orCreateKotlinClass5, lkb.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(long[].class), qjb.c);
        KClass orCreateKotlinClass6 = fufVar.getOrCreateKotlinClass(e8k.class);
        e8k.b.getClass();
        ltbVar.put(orCreateKotlinClass6, i8k.a);
        KClass orCreateKotlinClass7 = fufVar.getOrCreateKotlinClass(Integer.TYPE);
        i6a.a.getClass();
        ltbVar.put(orCreateKotlinClass7, a7a.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(int[].class), h6a.c);
        KClass orCreateKotlinClass8 = fufVar.getOrCreateKotlinClass(y7k.class);
        y7k.b.getClass();
        ltbVar.put(orCreateKotlinClass8, c8k.a);
        KClass orCreateKotlinClass9 = fufVar.getOrCreateKotlinClass(Short.TYPE);
        kfh.a.getClass();
        ltbVar.put(orCreateKotlinClass9, lfh.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(short[].class), jfh.c);
        KClass orCreateKotlinClass10 = fufVar.getOrCreateKotlinClass(q8k.class);
        q8k.b.getClass();
        ltbVar.put(orCreateKotlinClass10, u8k.a);
        KClass orCreateKotlinClass11 = fufVar.getOrCreateKotlinClass(Byte.TYPE);
        ab2.a.getClass();
        ltbVar.put(orCreateKotlinClass11, qb2.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(byte[].class), w92.c);
        KClass orCreateKotlinClass12 = fufVar.getOrCreateKotlinClass(p7k.class);
        p7k.b.getClass();
        ltbVar.put(orCreateKotlinClass12, t7k.a);
        KClass orCreateKotlinClass13 = fufVar.getOrCreateKotlinClass(Boolean.TYPE);
        fz1.a.getClass();
        ltbVar.put(orCreateKotlinClass13, gz1.a);
        ltbVar.put(fufVar.getOrCreateKotlinClass(boolean[].class), ez1.c);
        KClass orCreateKotlinClass14 = fufVar.getOrCreateKotlinClass(Unit.class);
        Unit.a.getClass();
        ltbVar.put(orCreateKotlinClass14, zak.b);
        ltbVar.put(fufVar.getOrCreateKotlinClass(Void.class), ted.a);
        try {
            KClass orCreateKotlinClass15 = fufVar.getOrCreateKotlinClass(xd5.class);
            xd5.b.getClass();
            ltbVar.put(orCreateKotlinClass15, ae5.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            ltbVar.put(duf.a.getOrCreateKotlinClass(f8k.class), h8k.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            ltbVar.put(duf.a.getOrCreateKotlinClass(z7k.class), b8k.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            ltbVar.put(duf.a.getOrCreateKotlinClass(r8k.class), t8k.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            ltbVar.put(duf.a.getOrCreateKotlinClass(q7k.class), s7k.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            KClass orCreateKotlinClass16 = duf.a.getOrCreateKotlinClass(jjk.class);
            jjk.c.getClass();
            ltbVar.put(orCreateKotlinClass16, ojk.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            KClass orCreateKotlinClass17 = duf.a.getOrCreateKotlinClass(o5a.class);
            o5a o5aVar = o5a.c;
            ltbVar.put(orCreateKotlinClass17, u5a.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        a = ltbVar.d();
    }

    public static final void a(String str) {
        str.getClass();
        Iterator it = ((otb) a.values()).iterator();
        while (it.hasNext()) {
            KSerializer kSerializer = (KSerializer) it.next();
            if (str.equals(kSerializer.getDescriptor().h())) {
                StringBuilder q = wt3.q("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                q.append(duf.a.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName());
                q.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                a70.p(dii.c(q.toString()));
                return;
            }
        }
    }
}
