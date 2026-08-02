package com.squareup.wire;

import com.squareup.wire.Message;
import okio.ByteString;
import xsna.epx;
import xsna.fpf0;
import xsna.ozl;
import xsna.rfc;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AnyMessage.kt */
/* loaded from: classes14.dex */
public final class AnyMessage extends Message {
    public static final ProtoAdapter<AnyMessage> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private final String typeUrl;
    private final ByteString value;

    /* compiled from: AnyMessage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final AnyMessage pack(Message<?, ?> message) {
            String typeUrl = message.adapter().getTypeUrl();
            if (typeUrl != null) {
                return new AnyMessage(typeUrl, message.encodeByteString());
            }
            throw new IllegalStateException(("recompile " + fpf0.a(message.getClass()) + " to use it with AnyMessage").toString());
        }

        private Companion() {
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final rfc a = fpf0.a(AnyMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnyMessage>(fieldEncoding, a, syntax) { // from class: com.squareup.wire.AnyMessage$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader protoReader) {
                long beginMessage = protoReader.beginMessage();
                String str = "";
                ByteString byteString = ByteString.d;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessageAndGetUnknownFields(beginMessage);
                        return new AnyMessage(str, byteString);
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        byteString = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnyMessage anyMessage) {
                return ProtoAdapter.BYTES.encodedSizeWithTag(2, anyMessage.getValue()) + ProtoAdapter.STRING.encodedSizeWithTag(1, anyMessage.getTypeUrl());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage redact(AnyMessage anyMessage) {
                return new AnyMessage("square.github.io/wire/redacted", ByteString.d);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, AnyMessage anyMessage) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) anyMessage.getTypeUrl());
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, (int) anyMessage.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, AnyMessage anyMessage) {
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, (int) anyMessage.getValue());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) anyMessage.getTypeUrl());
            }
        };
    }

    public /* synthetic */ AnyMessage(String str, ByteString byteString, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? ByteString.d : byteString);
    }

    public static /* synthetic */ AnyMessage copy$default(AnyMessage anyMessage, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anyMessage.typeUrl;
        }
        if ((i & 2) != 0) {
            byteString = anyMessage.value;
        }
        return anyMessage.copy(str, byteString);
    }

    public final AnyMessage copy(String str, ByteString byteString) {
        return new AnyMessage(str, byteString);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnyMessage)) {
            return false;
        }
        AnyMessage anyMessage = (AnyMessage) obj;
        return epx.f(this.typeUrl, anyMessage.typeUrl) && epx.f(this.value, anyMessage.value);
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final ByteString getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.value.hashCode() + urd0.a(i * 37, 37, this.typeUrl);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m36newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "Any{type_url=" + this.typeUrl + ", value=" + this.value + '}';
    }

    public final <T> T unpack(ProtoAdapter<T> protoAdapter) {
        if (epx.f(this.typeUrl, protoAdapter.getTypeUrl())) {
            return protoAdapter.decode(this.value);
        }
        throw new IllegalStateException(("type mismatch: " + getTypeUrl() + " != " + ((Object) protoAdapter.getTypeUrl())).toString());
    }

    public final <T> T unpackOrNull(ProtoAdapter<T> protoAdapter) {
        if (epx.f(this.typeUrl, protoAdapter.getTypeUrl())) {
            return protoAdapter.decode(this.value);
        }
        return null;
    }

    @ozl
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m36newBuilder() {
        throw new AssertionError();
    }

    public AnyMessage(String str, ByteString byteString) {
        super(ADAPTER, ByteString.d);
        this.typeUrl = str;
        this.value = byteString;
    }
}
