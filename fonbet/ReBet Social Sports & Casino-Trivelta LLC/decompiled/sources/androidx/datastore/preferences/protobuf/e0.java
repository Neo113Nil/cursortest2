package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface e0 {
    void a(Object obj, f0 f0Var, C2140o c2140o);

    void b(List list, f0 f0Var, C2140o c2140o);

    void c(Map map, I.a aVar, C2140o c2140o);

    void d(Object obj, f0 f0Var, C2140o c2140o);

    void e(List list, f0 f0Var, C2140o c2140o);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List list);

    AbstractC2132g readBytes();

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
