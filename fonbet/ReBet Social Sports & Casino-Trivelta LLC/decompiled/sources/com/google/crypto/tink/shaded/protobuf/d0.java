package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface d0 {
    void a(Object obj, e0 e0Var, C3484p c3484p);

    void b(Map map, H.a aVar, C3484p c3484p);

    void c(Object obj, e0 e0Var, C3484p c3484p);

    void d(List list, e0 e0Var, C3484p c3484p);

    void e(List list, e0 e0Var, C3484p c3484p);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List list);

    AbstractC3476h readBytes();

    void readBytesList(List list);

    double readDouble();

    void readDoubleList(List list);

    int readEnum();

    void readEnumList(List list);

    int readFixed32();

    void readFixed32List(List list);

    long readFixed64();

    void readFixed64List(List list);

    float readFloat();

    void readFloatList(List list);

    int readInt32();

    void readInt32List(List list);

    long readInt64();

    void readInt64List(List list);

    int readSFixed32();

    void readSFixed32List(List list);

    long readSFixed64();

    void readSFixed64List(List list);

    int readSInt32();

    void readSInt32List(List list);

    long readSInt64();

    void readSInt64List(List list);

    String readString();

    void readStringList(List list);

    void readStringListRequireUtf8(List list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List list);

    long readUInt64();

    void readUInt64List(List list);

    boolean skipField();
}
