package com.squareup.wire;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.duf;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B%\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J(\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/squareup/wire/MapEntryProtoAdapter;", PlayerKt.AMERICAN_FOOTBALL_KICKER, "V", "Lcom/squareup/wire/ProtoAdapter;", "", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "getKeyAdapter$wire_runtime", "()Lcom/squareup/wire/ProtoAdapter;", "getValueAdapter$wire_runtime", "encodedSize", "", U3.i.X, "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<? extends K, ? extends V>> {

    @NotNull
    private final ProtoAdapter<K> keyAdapter;

    @NotNull
    private final ProtoAdapter<V> valueAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntryProtoAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        super(FieldEncoding.LENGTH_DELIMITED, duf.a.getOrCreateKotlinClass(Map.Entry.class), null, protoAdapter2.getSyntax(), null, null, 48, null);
        protoAdapter.getClass();
        protoAdapter2.getClass();
        this.keyAdapter = protoAdapter;
        this.valueAdapter = protoAdapter2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Map.Entry<K, V> decode(@NotNull ProtoReader reader) {
        reader.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ProtoWriter writer, @NotNull Map.Entry<? extends K, ? extends V> value) {
        writer.getClass();
        value.getClass();
        this.keyAdapter.encodeWithTag(writer, 1, (int) value.getKey());
        this.valueAdapter.encodeWithTag(writer, 2, (int) value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(@NotNull Map.Entry<? extends K, ? extends V> value) {
        value.getClass();
        return this.valueAdapter.encodedSizeWithTag(2, value.getValue()) + this.keyAdapter.encodedSizeWithTag(1, value.getKey());
    }

    @NotNull
    public final ProtoAdapter<K> getKeyAdapter$wire_runtime() {
        return this.keyAdapter;
    }

    @NotNull
    public final ProtoAdapter<V> getValueAdapter$wire_runtime() {
        return this.valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Map.Entry<K, V> redact(@NotNull Map.Entry<? extends K, ? extends V> value) {
        value.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ReverseProtoWriter writer, @NotNull Map.Entry<? extends K, ? extends V> value) {
        writer.getClass();
        value.getClass();
        this.valueAdapter.encodeWithTag(writer, 2, (int) value.getValue());
        this.keyAdapter.encodeWithTag(writer, 1, (int) value.getKey());
    }
}
