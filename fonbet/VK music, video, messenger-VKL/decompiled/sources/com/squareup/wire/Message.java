package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.ByteString;
import xsna.an8;
import xsna.vl8;
import xsna.zcl;

/* compiled from: Message.kt */
/* loaded from: classes14.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    /* compiled from: Message.kt */
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        private transient vl8 unknownFieldsBuffer;
        private transient ByteString unknownFieldsByteString = ByteString.d;
        private transient ProtoWriter unknownFieldsWriter;

        private final void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new vl8();
                ProtoWriter protoWriter = new ProtoWriter(this.unknownFieldsBuffer);
                this.unknownFieldsWriter = protoWriter;
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.d;
            }
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            fieldEncoding.rawProtoAdapter().encodeWithTag(getUnknownFieldsWriter$wire_runtime(), i, (int) obj);
            return this;
        }

        public final Builder<M, B> addUnknownFields(ByteString byteString) {
            if (byteString.n() > 0) {
                prepareForNewUnknownFields();
                getUnknownFieldsWriter$wire_runtime().writeBytes(byteString);
            }
            return this;
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
            vl8 vl8Var = this.unknownFieldsBuffer;
            if (vl8Var != null) {
                this.unknownFieldsByteString = vl8Var.F0(vl8Var.c);
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            setUnknownFieldsByteString$wire_runtime(ByteString.d);
            if (getUnknownFieldsBuffer$wire_runtime() != null) {
                getUnknownFieldsBuffer$wire_runtime().m();
                setUnknownFieldsBuffer$wire_runtime(null);
            }
            setUnknownFieldsWriter$wire_runtime(null);
            return this;
        }

        public final vl8 getUnknownFieldsBuffer$wire_runtime() {
            return this.unknownFieldsBuffer;
        }

        public final ByteString getUnknownFieldsByteString$wire_runtime() {
            return this.unknownFieldsByteString;
        }

        public final ProtoWriter getUnknownFieldsWriter$wire_runtime() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(vl8 vl8Var) {
            this.unknownFieldsBuffer = vl8Var;
        }

        public final void setUnknownFieldsByteString$wire_runtime(ByteString byteString) {
            this.unknownFieldsByteString = byteString;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    /* compiled from: Message.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(an8 an8Var) throws IOException {
        this.adapter.encode(an8Var, (an8) this);
    }

    public final ByteString encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    public final int getCachedSerializedSize$wire_runtime() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.d : byteString;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.encode(outputStream, (OutputStream) this);
    }
}
