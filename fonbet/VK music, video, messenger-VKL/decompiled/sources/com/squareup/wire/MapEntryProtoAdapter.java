package com.squareup.wire;

import java.io.IOException;
import java.util.Map;
import xsna.fpf0;

/* compiled from: ProtoAdapter.kt */
/* loaded from: classes14.dex */
final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<? extends K, ? extends V>> {
    private final ProtoAdapter<K> keyAdapter;
    private final ProtoAdapter<V> valueAdapter;

    public MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        super(FieldEncoding.LENGTH_DELIMITED, fpf0.a(Map.Entry.class), (String) null, protoAdapter2.getSyntax());
        this.keyAdapter = protoAdapter;
        this.valueAdapter = protoAdapter2;
    }

    public final ProtoAdapter<K> getKeyAdapter$wire_runtime() {
        return this.keyAdapter;
    }

    public final ProtoAdapter<V> getValueAdapter$wire_runtime() {
        return this.valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map.Entry<K, V> decode(ProtoReader protoReader) {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Map.Entry<? extends K, ? extends V> entry) {
        return this.valueAdapter.encodedSizeWithTag(2, entry.getValue()) + this.keyAdapter.encodedSizeWithTag(1, entry.getKey());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map.Entry<K, V> redact(Map.Entry<? extends K, ? extends V> entry) {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, Map.Entry<? extends K, ? extends V> entry) throws IOException {
        this.keyAdapter.encodeWithTag(protoWriter, 1, (int) entry.getKey());
        this.valueAdapter.encodeWithTag(protoWriter, 2, (int) entry.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter reverseProtoWriter, Map.Entry<? extends K, ? extends V> entry) throws IOException {
        this.valueAdapter.encodeWithTag(reverseProtoWriter, 2, (int) entry.getValue());
        this.keyAdapter.encodeWithTag(reverseProtoWriter, 1, (int) entry.getKey());
    }
}
