package com.squareup.wire;

import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import defpackage.duf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/squareup/wire/FloatProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", U3.i.X, "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Float;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/lang/Float;", "encodedSize", "", "redact", "(F)Ljava/lang/Float;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatProtoAdapter extends ProtoAdapter<Float> {
    public FloatProtoAdapter() {
        super(FieldEncoding.FIXED32, duf.a.getOrCreateKotlinClass(Float.TYPE), null, Syntax.PROTO_2, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null, 32, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Float decode(@NotNull ProtoReader reader) {
        reader.getClass();
        return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
    }

    public void encode(@NotNull ProtoWriter writer, float value) {
        writer.getClass();
        writer.writeFixed32(Float.floatToIntBits(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Float f) {
        return encodedSize(f.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Float redact(Float f) {
        return redact(f.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Float f) {
        encode(reverseProtoWriter, f.floatValue());
    }

    public int encodedSize(float value) {
        return 4;
    }

    @NotNull
    public Float redact(float value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Float f) {
        encode(protoWriter, f.floatValue());
    }

    public void encode(@NotNull ReverseProtoWriter writer, float value) {
        writer.getClass();
        writer.writeFixed32(Float.floatToIntBits(value));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public Float decode(@NotNull ProtoReader32 reader) {
        reader.getClass();
        return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
    }
}
