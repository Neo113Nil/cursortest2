package com.squareup.wire;

import com.ironsource.U3;
import defpackage.duf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/squareup/wire/DoubleProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "encodedSize", "", U3.i.X, "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Double;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/lang/Double;", "redact", "(D)Ljava/lang/Double;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoubleProtoAdapter extends ProtoAdapter<Double> {
    public DoubleProtoAdapter() {
        super(FieldEncoding.FIXED64, duf.a.getOrCreateKotlinClass(Double.TYPE), null, Syntax.PROTO_2, Double.valueOf(0.0d), null, 32, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Double decode(@NotNull ProtoReader reader) {
        reader.getClass();
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }

    public void encode(@NotNull ProtoWriter writer, double value) {
        writer.getClass();
        writer.writeFixed64(Double.doubleToLongBits(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Double d) {
        return encodedSize(d.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Double redact(Double d) {
        return redact(d.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Double d) {
        encode(reverseProtoWriter, d.doubleValue());
    }

    public int encodedSize(double value) {
        return 8;
    }

    @NotNull
    public Double redact(double value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Double d) {
        encode(protoWriter, d.doubleValue());
    }

    public void encode(@NotNull ReverseProtoWriter writer, double value) {
        writer.getClass();
        writer.writeFixed64(Double.doubleToLongBits(value));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Double decode(@NotNull ProtoReader32 reader) {
        reader.getClass();
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }
}
