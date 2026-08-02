package com.squareup.wire;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import xsna.fpf0;
import xsna.jgp;
import xsna.on00;
import xsna.rl3;

/* compiled from: ProtoAdapter.kt */
/* loaded from: classes14.dex */
public final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, ? extends V>> {
    private final MapEntryProtoAdapter<K, V> entryAdapter;

    public MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        super(FieldEncoding.LENGTH_DELIMITED, fpf0.a(Map.class), (String) null, protoAdapter2.getSyntax(), jgp.b);
        this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> decode(ProtoReader protoReader) throws IOException {
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(protoReader);
            } else if (nextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(protoReader);
            }
        }
        protoReader.endMessageAndGetUnknownFields(beginMessage);
        if (identity == null) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (identity2 != null) {
            return on00.f(new Pair(identity, identity2));
        }
        throw new IllegalStateException("Map entry with null value");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Map<K, ? extends V> map) {
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, Map<K, ? extends V> map) {
        int i2 = 0;
        if (map == null) {
            return 0;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            i2 += this.entryAdapter.encodedSizeWithTag(i, it.next());
        }
        return i2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> redact(Map<K, ? extends V> map) {
        return jgp.b;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, Map<K, ? extends V> map) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter protoWriter, int i, Map<K, ? extends V> map) throws IOException {
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.encodeWithTag(protoWriter, i, (int) it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter reverseProtoWriter, Map<K, ? extends V> map) {
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Map<K, ? extends V> map) throws IOException {
        if (map == null) {
            return;
        }
        int i2 = 0;
        Object[] array = map.entrySet().toArray(new Map.Entry[0]);
        if (array != null) {
            Map.Entry[] entryArr = (Map.Entry[]) array;
            rl3.k0(entryArr);
            int length = entryArr.length;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                i2++;
                this.entryAdapter.encodeWithTag(reverseProtoWriter, i, (int) entry);
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
