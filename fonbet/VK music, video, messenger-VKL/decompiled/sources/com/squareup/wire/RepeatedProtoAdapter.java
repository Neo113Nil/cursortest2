package com.squareup.wire;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.fpf0;

/* compiled from: ProtoAdapter.kt */
/* loaded from: classes14.dex */
public final class RepeatedProtoAdapter<E> extends ProtoAdapter<List<? extends E>> {
    private final ProtoAdapter<E> originalAdapter;

    public RepeatedProtoAdapter(ProtoAdapter<E> protoAdapter) {
        super(protoAdapter.getFieldEncoding$wire_runtime(), fpf0.a(List.class), (String) null, protoAdapter.getSyntax(), EmptyList.b);
        this.originalAdapter = protoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> redact(List<? extends E> list) {
        return EmptyList.b;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> decode(ProtoReader protoReader) throws IOException {
        return Collections.singletonList(this.originalAdapter.decode(protoReader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(List<? extends E> list) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, List<? extends E> list) {
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.originalAdapter.encodedSizeWithTag(i, list.get(i3));
        }
        return i2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, List<? extends E> list) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter protoWriter, int i, List<? extends E> list) throws IOException {
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.originalAdapter.encodeWithTag(protoWriter, i, (int) list.get(i2));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter reverseProtoWriter, List<? extends E> list) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, List<? extends E> list) throws IOException {
        int size;
        if (list == null || list.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            this.originalAdapter.encodeWithTag(reverseProtoWriter, i, (int) list.get(size));
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }
}
