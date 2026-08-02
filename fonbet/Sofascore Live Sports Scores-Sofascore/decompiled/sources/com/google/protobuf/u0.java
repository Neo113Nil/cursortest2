package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import defpackage.a70;
import defpackage.hml;
import defpackage.jff;
import defpackage.pk6;
import defpackage.sw9;
import defpackage.vsg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u0 extends pk6 {
    @Override // defpackage.pk6
    public final Object a(Object obj, s sVar, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, d1 d1Var, Object obj2, t2 t2Var) {
        Object f;
        ArrayList arrayList;
        CodedInputStream codedInputStream = sVar.a;
        int number = generatedExtension.getNumber();
        h1 h1Var = generatedExtension.descriptor;
        Object obj3 = null;
        if (h1Var.d && h1Var.e) {
            switch (t0.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    sVar.g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    sVar.l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    sVar.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    sVar.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    sVar.m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    sVar.k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    sVar.j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    sVar.d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    sVar.u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    sVar.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    sVar.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    sVar.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    sVar.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    sVar.h(arrayList);
                    obj2 = i2.j(obj, number, arrayList, generatedExtension.descriptor.a, obj2, t2Var);
                    break;
                default:
                    sw9.i(generatedExtension.descriptor.c, "Type cannot be packed: ");
                    return null;
            }
            d1Var.p(generatedExtension.descriptor, arrayList);
            return obj2;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (t0.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    sVar.x(1);
                    obj3 = Double.valueOf(codedInputStream.readDouble());
                    break;
                case 2:
                    sVar.x(5);
                    obj3 = Float.valueOf(codedInputStream.readFloat());
                    break;
                case 3:
                    sVar.x(0);
                    obj3 = Long.valueOf(codedInputStream.readInt64());
                    break;
                case 4:
                    sVar.x(0);
                    obj3 = Long.valueOf(codedInputStream.readUInt64());
                    break;
                case 5:
                    sVar.x(0);
                    obj3 = Integer.valueOf(codedInputStream.readInt32());
                    break;
                case 6:
                    sVar.x(1);
                    obj3 = Long.valueOf(codedInputStream.readFixed64());
                    break;
                case 7:
                    sVar.x(5);
                    obj3 = Integer.valueOf(codedInputStream.readFixed32());
                    break;
                case 8:
                    sVar.x(0);
                    obj3 = Boolean.valueOf(codedInputStream.readBool());
                    break;
                case 9:
                    sVar.x(0);
                    obj3 = Integer.valueOf(codedInputStream.readUInt32());
                    break;
                case 10:
                    sVar.x(5);
                    obj3 = Integer.valueOf(codedInputStream.readSFixed32());
                    break;
                case 11:
                    sVar.x(1);
                    obj3 = Long.valueOf(codedInputStream.readSFixed64());
                    break;
                case 12:
                    sVar.x(0);
                    obj3 = Integer.valueOf(codedInputStream.readSInt32());
                    break;
                case 13:
                    sVar.x(0);
                    obj3 = Long.valueOf(codedInputStream.readSInt64());
                    break;
                case 14:
                    a70.r("Shouldn't reach here.");
                    return null;
                case 15:
                    obj3 = sVar.e();
                    break;
                case 16:
                    sVar.x(2);
                    obj3 = codedInputStream.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object f2 = d1Var.f(generatedExtension.descriptor);
                        if (f2 instanceof GeneratedMessageLite) {
                            jff jffVar = jff.c;
                            jffVar.getClass();
                            vsg a = jffVar.a(f2.getClass());
                            if (!((GeneratedMessageLite) f2).isMutable()) {
                                Object d = a.d();
                                a.a(d, f2);
                                d1Var.p(generatedExtension.descriptor, d);
                                f2 = d;
                            }
                            sVar.x(3);
                            sVar.b(f2, a, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                    sVar.x(3);
                    vsg a2 = jff.c.a(cls);
                    obj3 = a2.d();
                    sVar.b(obj3, a2, extensionRegistryLite);
                    a2.b(obj3);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object f3 = d1Var.f(generatedExtension.descriptor);
                        if (f3 instanceof GeneratedMessageLite) {
                            jff jffVar2 = jff.c;
                            jffVar2.getClass();
                            vsg a3 = jffVar2.a(f3.getClass());
                            if (!((GeneratedMessageLite) f3).isMutable()) {
                                Object d2 = a3.d();
                                a3.a(d2, f3);
                                d1Var.p(generatedExtension.descriptor, d2);
                                f3 = d2;
                            }
                            sVar.x(2);
                            sVar.c(f3, a3, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    obj3 = sVar.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
            }
        } else {
            sVar.x(0);
            int readInt32 = codedInputStream.readInt32();
            if (generatedExtension.descriptor.a.findValueByNumber(readInt32) == null) {
                return i2.n(obj, number, readInt32, obj2, t2Var);
            }
            obj3 = Integer.valueOf(readInt32);
        }
        if (generatedExtension.isRepeated()) {
            d1Var.a(generatedExtension.descriptor, obj3);
            return obj2;
        }
        int i = t0.a[generatedExtension.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (f = d1Var.f(generatedExtension.descriptor)) != null) {
            obj3 = Internal.mergeMessage(f, obj3);
        }
        d1Var.p(generatedExtension.descriptor, obj3);
        return obj2;
    }

    @Override // defpackage.pk6
    public final void b(hml hmlVar, Map.Entry entry) {
        h1 h1Var = (h1) entry.getKey();
        boolean z = h1Var.d;
        WireFormat.FieldType fieldType = h1Var.c;
        boolean z2 = h1Var.e;
        int i = h1Var.b;
        if (z) {
            switch (t0.a[fieldType.ordinal()]) {
                case 1:
                    i2.q(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 2:
                    i2.u(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 3:
                    i2.x(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 4:
                    i2.F(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 5:
                    i2.w(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 6:
                    i2.t(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 7:
                    i2.s(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 8:
                    i2.o(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 9:
                    i2.E(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 10:
                    i2.z(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 11:
                    i2.A(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 12:
                    i2.B(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 13:
                    i2.C(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 14:
                    i2.w(i, (List) entry.getValue(), hmlVar, z2);
                    break;
                case 15:
                    i2.p(i, (List) entry.getValue(), hmlVar);
                    break;
                case 16:
                    i2.D(i, (List) entry.getValue(), hmlVar);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        i2.v(i, (List) entry.getValue(), hmlVar, jff.c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        i2.y(i, (List) entry.getValue(), hmlVar, jff.c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (t0.a[fieldType.ordinal()]) {
            case 1:
                ((z) hmlVar).a.writeDouble(i, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ((z) hmlVar).a.writeFloat(i, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                ((z) hmlVar).f(i, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((z) hmlVar).a.writeUInt64(i, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((z) hmlVar).e(i, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((z) hmlVar).c(i, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((z) hmlVar).b(i, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((z) hmlVar).a.writeBool(i, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((z) hmlVar).a.writeUInt32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((z) hmlVar).a.writeSFixed32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((z) hmlVar).a.writeSFixed64(i, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((z) hmlVar).a.writeSInt32(i, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((z) hmlVar).a.writeSInt64(i, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((z) hmlVar).e(i, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((z) hmlVar).a(i, (ByteString) entry.getValue());
                break;
            case 16:
                ((z) hmlVar).a.writeString(i, (String) entry.getValue());
                break;
            case 17:
                ((z) hmlVar).d(i, entry.getValue(), jff.c.a(entry.getValue().getClass()));
                break;
            case 18:
                ((z) hmlVar).g(i, entry.getValue(), jff.c.a(entry.getValue().getClass()));
                break;
        }
    }
}
