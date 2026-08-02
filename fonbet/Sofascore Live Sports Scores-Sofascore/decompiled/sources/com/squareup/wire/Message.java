package com.squareup.wire;

import com.ironsource.L6;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import defpackage.gc2;
import defpackage.k62;
import defpackage.x52;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000 .*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002/.B\u001f\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0018\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0018\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\"R \u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b$\u0010%\u001a\u0004\b\b\u0010\u001dR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b-\u0010(¨\u00060"}, d2 = {"Lcom/squareup/wire/Message;", PlayerKt.FOOTBALL_MIDFIELDER, "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/io/Serializable;", "Lcom/squareup/wire/ProtoAdapter;", L6.G1, "Lgc2;", "unknownFields", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lgc2;)V", "newBuilder", "()Lcom/squareup/wire/Message$Builder;", "withoutUnknownFields", "()Lcom/squareup/wire/Message;", "", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "Lk62;", "sink", "", "encode", "(Lk62;)V", "", "()[B", "encodeByteString", "()Lgc2;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;)V", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "Lgc2;", "unknownFields$annotations", "()V", "", "cachedSerializedSize", "I", "getCachedSerializedSize$wire_runtime", "()I", "setCachedSerializedSize$wire_runtime", "(I)V", "hashCode", "Companion", "Builder", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @NotNull
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;

    @NotNull
    private final transient gc2 unknownFields;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/Message;", PlayerKt.FOOTBALL_MIDFIELDER, "B", "", "<init>", "()V", "", "prepareForNewUnknownFields", "Lgc2;", "unknownFields", "addUnknownFields", "(Lgc2;)Lcom/squareup/wire/Message$Builder;", "", "tag", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", U3.i.X, "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)Lcom/squareup/wire/Message$Builder;", "clearUnknownFields", "()Lcom/squareup/wire/Message$Builder;", "buildUnknownFields", "()Lgc2;", "build", "()Lcom/squareup/wire/Message;", "unknownFieldsByteString", "Lgc2;", "getUnknownFieldsByteString$wire_runtime", "setUnknownFieldsByteString$wire_runtime", "(Lgc2;)V", "Lx52;", "unknownFieldsBuffer", "Lx52;", "getUnknownFieldsBuffer$wire_runtime", "()Lx52;", "setUnknownFieldsBuffer$wire_runtime", "(Lx52;)V", "Lcom/squareup/wire/ProtoWriter;", "unknownFieldsWriter", "Lcom/squareup/wire/ProtoWriter;", "getUnknownFieldsWriter$wire_runtime", "()Lcom/squareup/wire/ProtoWriter;", "setUnknownFieldsWriter$wire_runtime", "(Lcom/squareup/wire/ProtoWriter;)V", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {

        @Nullable
        private transient x52 unknownFieldsBuffer;

        @NotNull
        private transient gc2 unknownFieldsByteString = gc2.d;

        @Nullable
        private transient ProtoWriter unknownFieldsWriter;

        private final void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new x52();
                x52 x52Var = this.unknownFieldsBuffer;
                x52Var.getClass();
                ProtoWriter protoWriter = new ProtoWriter(x52Var);
                this.unknownFieldsWriter = protoWriter;
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = gc2.d;
            }
        }

        @NotNull
        public final Builder<M, B> addUnknownField(int tag, @NotNull FieldEncoding fieldEncoding, @Nullable Object value) {
            fieldEncoding.getClass();
            prepareForNewUnknownFields();
            ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
            rawProtoAdapter.getClass();
            ProtoWriter protoWriter = this.unknownFieldsWriter;
            protoWriter.getClass();
            rawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
            return this;
        }

        @NotNull
        public final Builder<M, B> addUnknownFields(@NotNull gc2 unknownFields) {
            unknownFields.getClass();
            if (unknownFields.h() > 0) {
                prepareForNewUnknownFields();
                ProtoWriter protoWriter = this.unknownFieldsWriter;
                protoWriter.getClass();
                protoWriter.writeBytes(unknownFields);
            }
            return this;
        }

        @NotNull
        public abstract M build();

        @NotNull
        public final gc2 buildUnknownFields() {
            x52 x52Var = this.unknownFieldsBuffer;
            if (x52Var != null) {
                x52Var.getClass();
                this.unknownFieldsByteString = x52Var.l0(x52Var.b);
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        @NotNull
        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = gc2.d;
            x52 x52Var = this.unknownFieldsBuffer;
            if (x52Var != null) {
                x52Var.getClass();
                x52Var.k();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        @Nullable
        /* renamed from: getUnknownFieldsBuffer$wire_runtime, reason: from getter */
        public final x52 getUnknownFieldsBuffer() {
            return this.unknownFieldsBuffer;
        }

        @NotNull
        /* renamed from: getUnknownFieldsByteString$wire_runtime, reason: from getter */
        public final gc2 getUnknownFieldsByteString() {
            return this.unknownFieldsByteString;
        }

        @Nullable
        /* renamed from: getUnknownFieldsWriter$wire_runtime, reason: from getter */
        public final ProtoWriter getUnknownFieldsWriter() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(@Nullable x52 x52Var) {
            this.unknownFieldsBuffer = x52Var;
        }

        public final void setUnknownFieldsByteString$wire_runtime(@NotNull gc2 gc2Var) {
            gc2Var.getClass();
            this.unknownFieldsByteString = gc2Var;
        }

        public final void setUnknownFieldsWriter$wire_runtime(@Nullable ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    public Message(@NotNull ProtoAdapter<M> protoAdapter, @NotNull gc2 gc2Var) {
        protoAdapter.getClass();
        gc2Var.getClass();
        this.adapter = protoAdapter;
        this.unknownFields = gc2Var;
    }

    @NotNull
    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(@NotNull k62 sink) throws IOException {
        sink.getClass();
        this.adapter.encode(sink, (k62) this);
    }

    @NotNull
    public final gc2 encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    /* renamed from: getCachedSerializedSize$wire_runtime, reason: from getter */
    public final int getCachedSerializedSize() {
        return this.cachedSerializedSize;
    }

    @NotNull
    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    @NotNull
    public String toString() {
        return this.adapter.toString(this);
    }

    @NotNull
    public gc2 unknownFields() {
        gc2 gc2Var = this.unknownFields;
        return gc2Var == null ? gc2.d : gc2Var;
    }

    @NotNull
    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    @NotNull
    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/squareup/wire/Message$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getSerialVersionUID$annotations", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private static /* synthetic */ void getSerialVersionUID$annotations() {
        }
    }

    @NotNull
    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(@NotNull OutputStream stream) throws IOException {
        stream.getClass();
        this.adapter.encode(stream, (OutputStream) this);
    }

    public static /* synthetic */ void unknownFields$annotations() {
    }
}
