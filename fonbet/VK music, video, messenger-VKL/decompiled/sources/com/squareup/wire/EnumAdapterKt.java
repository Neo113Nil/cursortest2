package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import xsna.izs;

/* compiled from: EnumAdapter.kt */
/* loaded from: classes14.dex */
public final class EnumAdapterKt {
    public static final <E extends WireEnum> E commonDecode(EnumAdapter<E> enumAdapter, ProtoReader protoReader, izs<? super Integer, ? extends E> izsVar) {
        int readVarint32 = protoReader.readVarint32();
        E invoke = izsVar.invoke(Integer.valueOf(readVarint32));
        if (invoke != null) {
            return invoke;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, enumAdapter.getType());
    }

    public static final <E extends WireEnum> void commonEncode(ProtoWriter protoWriter, E e) {
        protoWriter.writeVarint32(e.getValue());
    }

    public static final <E extends WireEnum> int commonEncodedSize(E e) {
        return ProtoWriter.Companion.varint32Size$wire_runtime(e.getValue());
    }

    public static final <E extends WireEnum> E commonRedact(E e) {
        throw new UnsupportedOperationException();
    }

    public static final <E extends WireEnum> void commonEncode(ReverseProtoWriter reverseProtoWriter, E e) {
        reverseProtoWriter.writeVarint32(e.getValue());
    }
}
