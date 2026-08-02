package com.squareup.wire;

import com.ironsource.U3;
import defpackage.duf;
import defpackage.km5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J(\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/RepeatedProtoAdapter;", "E", "Lcom/squareup/wire/ProtoAdapter;", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "encodedSize", "", U3.i.X, "encodedSizeWithTag", "tag", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "encodeWithTag", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "Lcom/squareup/wire/ProtoReader32;", "redact", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RepeatedProtoAdapter<E> extends ProtoAdapter<List<? extends E>> {

    @NotNull
    private final ProtoAdapter<E> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatedProtoAdapter(@NotNull ProtoAdapter<E> protoAdapter) {
        super(protoAdapter.getFieldEncoding(), duf.a.getOrCreateKotlinClass(List.class), null, protoAdapter.getSyntax(), km5.a, null, 32, null);
        protoAdapter.getClass();
        this.originalAdapter = protoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public List<E> decode(@NotNull ProtoReader reader) {
        reader.getClass();
        return a.c(this.originalAdapter.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ProtoWriter writer, @NotNull List<? extends E> value) {
        writer.getClass();
        value.getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(@NotNull ReverseProtoWriter writer, int tag, @Nullable List<? extends E> value) {
        writer.getClass();
        if (value == null) {
            return;
        }
        int size = value.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.originalAdapter.encodeWithTag(writer, tag, (int) value.get(size));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(@NotNull List<? extends E> value) {
        value.getClass();
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int tag, @Nullable List<? extends E> value) {
        if (value == null) {
            return 0;
        }
        int size = value.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.originalAdapter.encodedSizeWithTag(tag, value.get(i2));
        }
        return i;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public List<E> redact(@NotNull List<? extends E> value) {
        value.getClass();
        return km5.a;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public List<E> decode(@NotNull ProtoReader32 reader) {
        reader.getClass();
        return a.c(this.originalAdapter.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ReverseProtoWriter writer, @NotNull List<? extends E> value) {
        writer.getClass();
        value.getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable List<? extends E> value) {
        writer.getClass();
        if (value == null) {
            return;
        }
        int size = value.size();
        for (int i = 0; i < size; i++) {
            this.originalAdapter.encodeWithTag(writer, tag, (int) value.get(i));
        }
    }
}
