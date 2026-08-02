package com.squareup.wire;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.L6;
import com.ironsource.U3;
import com.squareup.wire.Message;
import defpackage.a70;
import defpackage.dmi;
import defpackage.duf;
import defpackage.gc2;
import defpackage.wx4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/squareup/wire/AnyMessage;", "Lcom/squareup/wire/Message;", "", "", "typeUrl", "Lgc2;", U3.i.X, "<init>", "(Ljava/lang/String;Lgc2;)V", "T", "Lcom/squareup/wire/ProtoAdapter;", L6.G1, "unpack", "(Lcom/squareup/wire/ProtoAdapter;)Ljava/lang/Object;", "unpackOrNull", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lgc2;)Lcom/squareup/wire/AnyMessage;", "Ljava/lang/String;", "getTypeUrl", "Lgc2;", "getValue", "()Lgc2;", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnyMessage extends Message {

    @NotNull
    public static final ProtoAdapter<AnyMessage> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String typeUrl;

    @NotNull
    private final gc2 value;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(AnyMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnyMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.wire.AnyMessage$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader reader) {
                reader.getClass();
                gc2 gc2Var = gc2.d;
                long beginMessage = reader.beginMessage();
                String str = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return new AnyMessage(str, gc2Var);
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        gc2Var = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnyMessage value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTypeUrl());
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnyMessage value) {
                value.getClass();
                return ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getValue()) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTypeUrl());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage redact(AnyMessage value) {
                value.getClass();
                return new AnyMessage("square.github.io/wire/redacted", gc2.d);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnyMessage value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getValue());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTypeUrl());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader32 reader) {
                reader.getClass();
                gc2 gc2Var = gc2.d;
                int beginMessage = reader.beginMessage();
                String str = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        reader.endMessageAndGetUnknownFields(beginMessage);
                        return new AnyMessage(str, gc2Var);
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        gc2Var = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyMessage(@NotNull String str, @NotNull gc2 gc2Var) {
        super(ADAPTER, gc2.d);
        str.getClass();
        gc2Var.getClass();
        this.typeUrl = str;
        this.value = gc2Var;
    }

    public static /* synthetic */ AnyMessage copy$default(AnyMessage anyMessage, String str, gc2 gc2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anyMessage.typeUrl;
        }
        if ((i & 2) != 0) {
            gc2Var = anyMessage.value;
        }
        return anyMessage.copy(str, gc2Var);
    }

    @NotNull
    public final AnyMessage copy(@NotNull String typeUrl, @NotNull gc2 value) {
        typeUrl.getClass();
        value.getClass();
        return new AnyMessage(typeUrl, value);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AnyMessage)) {
            return false;
        }
        AnyMessage anyMessage = (AnyMessage) other;
        return Intrinsics.c(this.typeUrl, anyMessage.typeUrl) && Intrinsics.c(this.value, anyMessage.value);
    }

    @NotNull
    public final String getTypeUrl() {
        return this.typeUrl;
    }

    @NotNull
    public final gc2 getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.value.hashCode() + dmi.c(i * 37, 37, this.typeUrl);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m714newBuilder();
    }

    @Override // com.squareup.wire.Message
    @NotNull
    public String toString() {
        return "Any{type_url=" + this.typeUrl + ", value=" + this.value + '}';
    }

    public final <T> T unpack(@NotNull ProtoAdapter<T> adapter) {
        adapter.getClass();
        if (Intrinsics.c(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        a70.n("type mismatch: ", this.typeUrl, " != ", adapter.getTypeUrl());
        return null;
    }

    @Nullable
    public final <T> T unpackOrNull(@NotNull ProtoAdapter<T> adapter) {
        adapter.getClass();
        if (Intrinsics.c(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        return null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/wire/AnyMessage$Companion;", "", "<init>", "()V", "pack", "Lcom/squareup/wire/AnyMessage;", PglCryptUtils.KEY_MESSAGE, "Lcom/squareup/wire/Message;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AnyMessage pack(@NotNull Message<?, ?> message) {
            message.getClass();
            String typeUrl = message.adapter().getTypeUrl();
            if (typeUrl != null) {
                return new AnyMessage(typeUrl, message.encodeByteString());
            }
            throw new IllegalStateException(("recompile " + duf.a.getOrCreateKotlinClass(message.getClass()) + " to use it with AnyMessage").toString());
        }

        private Companion() {
        }
    }

    @wx4
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m714newBuilder() {
        throw new AssertionError();
    }

    public /* synthetic */ AnyMessage(String str, gc2 gc2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? gc2.d : gc2Var);
    }
}
