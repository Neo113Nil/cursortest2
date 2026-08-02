package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import xsna.dcy;
import xsna.fpf0;
import xsna.pfc;

/* compiled from: EnumAdapter.kt */
/* loaded from: classes14.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    public EnumAdapter(dcy<E> dcyVar, Syntax syntax) {
        this(dcyVar, syntax, Internal.getIdentityOrNull(((pfc) dcyVar).a()));
    }

    public abstract E fromValue(int i);

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader protoReader) throws IOException {
        int readVarint32 = protoReader.readVarint32();
        E fromValue = fromValue(readVarint32);
        if (fromValue != null) {
            return fromValue;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(E e) {
        return ProtoWriter.Companion.varint32Size$wire_runtime(e.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E redact(E e) {
        throw new UnsupportedOperationException();
    }

    public EnumAdapter(dcy<E> dcyVar, Syntax syntax, E e) {
        super(FieldEncoding.VARINT, (dcy<?>) dcyVar, (String) null, syntax, e);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, E e) throws IOException {
        protoWriter.writeVarint32(e.getValue());
    }

    public EnumAdapter(dcy<E> dcyVar) {
        this(dcyVar, Syntax.PROTO_2, Internal.getIdentityOrNull(((pfc) dcyVar).a()));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter reverseProtoWriter, E e) {
        reverseProtoWriter.writeVarint32(e.getValue());
    }

    public EnumAdapter(Class<E> cls) {
        this(fpf0.a(cls), Syntax.PROTO_2, Internal.getIdentityOrNull(cls));
    }

    public EnumAdapter(Class<E> cls, Syntax syntax) {
        this(fpf0.a(cls), syntax, Internal.getIdentityOrNull(cls));
    }

    public EnumAdapter(Class<E> cls, Syntax syntax, E e) {
        this(fpf0.a(cls), syntax, e);
    }
}
