package com.google.protobuf;

import com.google.protobuf.C5961l;
import com.google.protobuf.C5961l.b;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5958i<T extends C5961l.b<T>> {
    AbstractC5958i() {
    }

    abstract int extensionNumber(Map.Entry<?, ?> entry);

    abstract Object findExtensionByNumber(C5957h c5957h, MessageLite messageLite, int i11);

    abstract C5961l<T> getExtensions(Object obj);

    abstract C5961l<T> getMutableExtensions(Object obj);

    abstract boolean hasExtensions(MessageLite messageLite);

    abstract void makeImmutable(Object obj);

    abstract <UT, UB> UB parseExtension(Object obj, I i11, Object obj2, C5957h c5957h, C5961l<T> c5961l, UB ub2, N<UT, UB> n11) throws IOException;

    abstract void parseLengthPrefixedMessageSetItem(I i11, Object obj, C5957h c5957h, C5961l<T> c5961l) throws IOException;

    abstract void parseMessageSetItem(ByteString byteString, Object obj, C5957h c5957h, C5961l<T> c5961l) throws IOException;

    abstract void serializeExtension(T t2, Map.Entry<?, ?> entry) throws IOException;

    abstract void setExtensions(Object obj, C5961l<T> c5961l);
}
