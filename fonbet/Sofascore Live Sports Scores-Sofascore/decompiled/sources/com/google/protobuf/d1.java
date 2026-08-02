package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import defpackage.a70;
import defpackage.cp4;
import defpackage.sw9;
import defpackage.tlh;
import defpackage.uoa;
import defpackage.yg0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d1 {
    public static final d1 d = new d1(0);
    public final tlh a = new tlh(16);
    public boolean b;
    public boolean c;

    public d1(int i) {
        m();
        m();
    }

    public static int c(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return d(fieldType, obj) + computeTagSize;
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        switch (c1.b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                cp4.h("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int e(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            return c(liteType, number, obj);
        }
        List list = (List) obj;
        int i = 0;
        if (!fieldSet$FieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += c(liteType, number, it.next());
            }
            return i;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i += d(liteType, it2.next());
        }
        return CodedOutputStream.computeUInt32SizeNoTag(i) + CodedOutputStream.computeTagSize(number) + i;
    }

    public static int h(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        return (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) ? e(fieldSet$FieldDescriptorLite, value) : value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public static boolean k(Map.Entry entry) {
        boolean z;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (!fieldSet$FieldDescriptorLite.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                a70.p("Wrong object type used with protocol message reflection.");
                return false;
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof MessageLiteOrBuilder) {
                    z = ((MessageLiteOrBuilder) obj).isInitialized();
                } else {
                    if (!(obj instanceof LazyField)) {
                        a70.p("Wrong object type used with protocol message reflection.");
                        return false;
                    }
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.protobuf.LazyField) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.protobuf.Internal.EnumLite) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        Internal.checkNotNull(obj);
        boolean z = true;
        switch (c1.a[liteType.getJavaType().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof MessageLite)) {
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        sw9.n("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(fieldSet$FieldDescriptorLite.getNumber()), fieldSet$FieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()});
    }

    public static void r(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, fieldType.getWireType());
            s(codedOutputStream, fieldType, obj);
        }
    }

    public static void s(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (c1.b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    break;
                }
        }
    }

    public final void a(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        List list;
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            a70.p("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        q(fieldSet$FieldDescriptorLite, obj);
        Object f = f(fieldSet$FieldDescriptorLite);
        if (f == null) {
            list = new ArrayList();
            this.a.put(fieldSet$FieldDescriptorLite, list);
        } else {
            list = (List) f;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d1 clone() {
        tlh tlhVar;
        d1 d1Var = new d1();
        int i = 0;
        while (true) {
            tlhVar = this.a;
            if (i >= tlhVar.b.size()) {
                break;
            }
            Map.Entry d2 = tlhVar.d(i);
            d1Var.p((FieldSet$FieldDescriptorLite) d2.getKey(), d2.getValue());
            i++;
        }
        for (Map.Entry entry : tlhVar.e()) {
            d1Var.p((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        d1Var.c = this.c;
        return d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d1) {
            return this.a.equals(((d1) obj).a);
        }
        return false;
    }

    public final Object f(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj = this.a.get(fieldSet$FieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final int g() {
        tlh tlhVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            tlhVar = this.a;
            if (i >= tlhVar.b.size()) {
                break;
            }
            i2 += h(tlhVar.d(i));
            i++;
        }
        Iterator it = tlhVar.e().iterator();
        while (it.hasNext()) {
            i2 += h((Map.Entry) it.next());
        }
        return i2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        tlh tlhVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            tlhVar = this.a;
            if (i >= tlhVar.b.size()) {
                break;
            }
            Map.Entry d2 = tlhVar.d(i);
            i2 += e((FieldSet$FieldDescriptorLite) d2.getKey(), d2.getValue());
            i++;
        }
        for (Map.Entry entry : tlhVar.e()) {
            i2 += e((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final boolean j() {
        int i = 0;
        while (true) {
            tlh tlhVar = this.a;
            if (i >= tlhVar.b.size()) {
                Iterator it = tlhVar.e().iterator();
                while (it.hasNext()) {
                    if (!k((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!k(tlhVar.d(i))) {
                return false;
            }
            i++;
        }
    }

    public final Iterator l() {
        boolean z = this.c;
        tlh tlhVar = this.a;
        return z ? new uoa(((yg0) tlhVar.entrySet()).iterator(), 0) : ((yg0) tlhVar.entrySet()).iterator();
    }

    public final void m() {
        tlh tlhVar;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            tlhVar = this.a;
            if (i >= tlhVar.b.size()) {
                break;
            }
            Map.Entry d2 = tlhVar.d(i);
            if (d2.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) d2.getValue()).makeImmutable();
            }
            i++;
        }
        if (!tlhVar.d) {
            for (int i2 = 0; i2 < tlhVar.b.size(); i2++) {
                Map.Entry d3 = tlhVar.d(i2);
                if (((FieldSet$FieldDescriptorLite) d3.getKey()).isRepeated()) {
                    d3.setValue(Collections.unmodifiableList((List) d3.getValue()));
                }
            }
            for (Map.Entry entry : tlhVar.e()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!tlhVar.d) {
            tlhVar.c = tlhVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(tlhVar.c);
            tlhVar.f = tlhVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(tlhVar.f);
            tlhVar.d = true;
        }
        this.b = true;
    }

    public final void n(d1 d1Var) {
        tlh tlhVar;
        int i = 0;
        while (true) {
            int size = d1Var.a.b.size();
            tlhVar = d1Var.a;
            if (i >= size) {
                break;
            }
            o(tlhVar.d(i));
            i++;
        }
        Iterator it = tlhVar.e().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    public final void o(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean isRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        tlh tlhVar = this.a;
        if (isRepeated) {
            Object f = f(fieldSet$FieldDescriptorLite);
            if (f == null) {
                f = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) f;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            tlhVar.put(fieldSet$FieldDescriptorLite, f);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            tlhVar.put(fieldSet$FieldDescriptorLite, value);
            return;
        }
        Object f2 = f(fieldSet$FieldDescriptorLite);
        if (f2 != null) {
            tlhVar.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) f2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        tlhVar.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void p(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            q(fieldSet$FieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                a70.p("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q(fieldSet$FieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.a.put(fieldSet$FieldDescriptorLite, obj);
    }

    public d1() {
    }
}
