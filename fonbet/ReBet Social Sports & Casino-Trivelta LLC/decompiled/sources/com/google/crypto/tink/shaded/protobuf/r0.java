package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface r0 {

    public enum a {
        ASCENDING,
        DESCENDING
    }

    void a(int i10, H.a aVar, Map map);

    void b(int i10, Object obj, e0 e0Var);

    void c(int i10, List list, e0 e0Var);

    void d(int i10, AbstractC3476h abstractC3476h);

    void e(int i10, Object obj, e0 e0Var);

    void f(int i10, List list, e0 e0Var);

    a fieldOrder();

    void writeBool(int i10, boolean z10);

    void writeBoolList(int i10, List list, boolean z10);

    void writeBytesList(int i10, List list);

    void writeDouble(int i10, double d10);

    void writeDoubleList(int i10, List list, boolean z10);

    void writeEndGroup(int i10);

    void writeEnum(int i10, int i11);

    void writeEnumList(int i10, List list, boolean z10);

    void writeFixed32(int i10, int i11);

    void writeFixed32List(int i10, List list, boolean z10);

    void writeFixed64(int i10, long j10);

    void writeFixed64List(int i10, List list, boolean z10);

    void writeFloat(int i10, float f10);

    void writeFloatList(int i10, List list, boolean z10);

    void writeInt32(int i10, int i11);

    void writeInt32List(int i10, List list, boolean z10);

    void writeInt64(int i10, long j10);

    void writeInt64List(int i10, List list, boolean z10);

    void writeMessageSetItem(int i10, Object obj);

    void writeSFixed32(int i10, int i11);

    void writeSFixed32List(int i10, List list, boolean z10);

    void writeSFixed64(int i10, long j10);

    void writeSFixed64List(int i10, List list, boolean z10);

    void writeSInt32(int i10, int i11);

    void writeSInt32List(int i10, List list, boolean z10);

    void writeSInt64(int i10, long j10);

    void writeSInt64List(int i10, List list, boolean z10);

    void writeStartGroup(int i10);

    void writeString(int i10, String str);

    void writeStringList(int i10, List list);

    void writeUInt32(int i10, int i11);

    void writeUInt32List(int i10, List list, boolean z10);

    void writeUInt64(int i10, long j10);

    void writeUInt64List(int i10, List list, boolean z10);
}
