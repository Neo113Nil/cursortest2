package com.squareup.wire;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import defpackage.duf;
import defpackage.lm5;
import defpackage.ph0;
import defpackage.sub;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B%\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J&\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00142\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J.\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016J.\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0019H\u0016J(\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/wire/MapProtoAdapter;", PlayerKt.AMERICAN_FOOTBALL_KICKER, "V", "Lcom/squareup/wire/ProtoAdapter;", "", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "entryAdapter", "Lcom/squareup/wire/MapEntryProtoAdapter;", "encodedSize", "", U3.i.X, "encodedSizeWithTag", "tag", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "encodeWithTag", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "Lcom/squareup/wire/ProtoReader32;", "redact", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, ? extends V>> {

    @NotNull
    private final MapEntryProtoAdapter<K, V> entryAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MapProtoAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        super(r1, r2, null, r4, r5, null, 32, null);
        protoAdapter.getClass();
        protoAdapter2.getClass();
        FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Map.class);
        Syntax syntax = protoAdapter2.getSyntax();
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Map<K, V> decode(@NotNull ProtoReader reader) {
        reader.getClass();
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (nextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(beginMessage);
        if (identity == null) {
            a70.r("Map entry with null key");
            return null;
        }
        if (identity2 != null) {
            return sub.d(new Pair(identity, identity2));
        }
        a70.r("Map entry with null value");
        return null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ProtoWriter writer, @NotNull Map<K, ? extends V> value) {
        writer.getClass();
        value.getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(@NotNull ReverseProtoWriter writer, int tag, @Nullable Map<K, ? extends V> value) {
        writer.getClass();
        if (value == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) value.entrySet().toArray(new Map.Entry[0]);
        ph0.O(entryArr);
        for (Map.Entry entry : entryArr) {
            this.entryAdapter.encodeWithTag(writer, tag, (int) entry);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(@NotNull Map<K, ? extends V> value) {
        value.getClass();
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int tag, @Nullable Map<K, ? extends V> value) {
        int i = 0;
        if (value == null) {
            return 0;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            i += this.entryAdapter.encodedSizeWithTag(tag, it.next());
        }
        return i;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Map<K, V> redact(@NotNull Map<K, ? extends V> value) {
        value.getClass();
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ReverseProtoWriter writer, @NotNull Map<K, ? extends V> value) {
        writer.getClass();
        value.getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable Map<K, ? extends V> value) {
        writer.getClass();
        if (value == null) {
            return;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.encodeWithTag(writer, tag, (int) it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Map<K, V> decode(@NotNull ProtoReader32 reader) {
        reader.getClass();
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        int beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (nextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(beginMessage);
        if (identity == null) {
            a70.r("Map entry with null key");
            return null;
        }
        if (identity2 != null) {
            return sub.d(new Pair(identity, identity2));
        }
        a70.r("Map entry with null value");
        return null;
    }
}
