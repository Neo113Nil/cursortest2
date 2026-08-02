package com.squareup.wire;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.fpf0;

/* compiled from: ProtoAdapter.kt */
/* loaded from: classes14.dex */
public final class PackedProtoAdapter<E> extends ProtoAdapter<List<? extends E>> {
    private final ProtoAdapter<E> originalAdapter;

    public PackedProtoAdapter(ProtoAdapter<E> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, fpf0.a(List.class), (String) null, protoAdapter.getSyntax(), EmptyList.b);
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
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.originalAdapter.encodedSize(list.get(i2));
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, List<? extends E> list) {
        if (list == 0 || list.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(i, (int) list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, List<? extends E> list) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.originalAdapter.encode(protoWriter, (ProtoWriter) list.get(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter protoWriter, int i, List<? extends E> list) throws IOException {
        if (list == 0 || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(protoWriter, i, (int) list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter reverseProtoWriter, List<? extends E> list) throws IOException {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            this.originalAdapter.encode(reverseProtoWriter, (ReverseProtoWriter) list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, List<? extends E> list) throws IOException {
        if (list == 0 || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(reverseProtoWriter, i, (int) list);
    }
}
