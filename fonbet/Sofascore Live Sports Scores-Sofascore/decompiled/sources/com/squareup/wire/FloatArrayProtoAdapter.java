package com.squareup.wire;

import com.ironsource.U3;
import defpackage.duf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/FloatArrayProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "originalAdapter", "", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "encodeWithTag", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "tag", "", U3.i.X, "Lcom/squareup/wire/ReverseProtoWriter;", "encodedSize", "encodedSizeWithTag", "encode", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "Lcom/squareup/wire/ProtoReader32;", "redact", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatArrayProtoAdapter extends ProtoAdapter<float[]> {

    @NotNull
    private final ProtoAdapter<Float> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatArrayProtoAdapter(@NotNull ProtoAdapter<Float> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, duf.a.getOrCreateKotlinClass(float[].class), null, protoAdapter.getSyntax(), new float[0], null, 32, null);
        protoAdapter.getClass();
        this.originalAdapter = protoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public float[] decode(@NotNull ProtoReader reader) {
        reader.getClass();
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ProtoWriter writer, @NotNull float[] value) {
        writer.getClass();
        value.getClass();
        for (float f : value) {
            this.originalAdapter.encode(writer, (ProtoWriter) Float.valueOf(f));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(@NotNull ProtoWriter writer, int tag, @Nullable float[] value) {
        writer.getClass();
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.encodeWithTag(writer, tag, (int) value);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(@NotNull float[] value) {
        value.getClass();
        int i = 0;
        for (float f : value) {
            i += this.originalAdapter.encodedSize(Float.valueOf(f));
        }
        return i;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int tag, @Nullable float[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(tag, (int) value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public float[] redact(@NotNull float[] value) {
        value.getClass();
        return new float[0];
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(@NotNull ReverseProtoWriter writer, int tag, @Nullable float[] value) {
        writer.getClass();
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.encodeWithTag(writer, tag, (int) value);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public float[] decode(@NotNull ProtoReader32 reader) {
        reader.getClass();
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ReverseProtoWriter writer, @NotNull float[] value) {
        writer.getClass();
        value.getClass();
        int length = value.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                writer.writeFixed32(Float.floatToIntBits(value[length]));
            }
        }
    }
}
