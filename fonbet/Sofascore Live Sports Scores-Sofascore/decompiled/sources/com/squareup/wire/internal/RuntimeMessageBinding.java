package com.squareup.wire.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.Syntax;
import defpackage.gc2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005Bc\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010-R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R2\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/squareup/wire/internal/RuntimeMessageBinding;", "Lcom/squareup/wire/Message;", PlayerKt.FOOTBALL_MIDFIELDER, "Lcom/squareup/wire/Message$Builder;", "B", "Lcom/squareup/wire/internal/MessageBinding;", "Lkotlin/reflect/KClass;", "messageType", "Ljava/lang/Class;", "builderType", "Lkotlin/Function0;", "createBuilder", "", "", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "fields", "", "typeUrl", "Lcom/squareup/wire/Syntax;", "syntax", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;Ljava/util/Map;Ljava/lang/String;Lcom/squareup/wire/Syntax;)V", PglCryptUtils.KEY_MESSAGE, "Lgc2;", "unknownFields", "(Lcom/squareup/wire/Message;)Lgc2;", "getCachedSerializedSize", "(Lcom/squareup/wire/Message;)I", "size", "", "setCachedSerializedSize", "(Lcom/squareup/wire/Message;I)V", "newBuilder", "()Lcom/squareup/wire/Message$Builder;", "builder", "build", "(Lcom/squareup/wire/Message$Builder;)Lcom/squareup/wire/Message;", "tag", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "", U3.i.X, "addUnknownField", "(Lcom/squareup/wire/Message$Builder;ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "clearUnknownFields", "(Lcom/squareup/wire/Message$Builder;)V", "Lkotlin/reflect/KClass;", "getMessageType", "()Lkotlin/reflect/KClass;", "Ljava/lang/Class;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "Lcom/squareup/wire/Syntax;", "getSyntax", "()Lcom/squareup/wire/Syntax;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RuntimeMessageBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> implements MessageBinding<M, B> {

    @NotNull
    private final Class<B> builderType;

    @NotNull
    private final Function0<B> createBuilder;

    @NotNull
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;

    @NotNull
    private final KClass<M> messageType;

    @NotNull
    private final Syntax syntax;

    @Nullable
    private final String typeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeMessageBinding(@NotNull KClass<M> kClass, @NotNull Class<B> cls, @NotNull Function0<? extends B> function0, @NotNull Map<Integer, ? extends FieldOrOneOfBinding<M, B>> map, @Nullable String str, @NotNull Syntax syntax) {
        kClass.getClass();
        cls.getClass();
        function0.getClass();
        map.getClass();
        syntax.getClass();
        this.messageType = kClass;
        this.builderType = cls;
        this.createBuilder = function0;
        this.fields = map;
        this.typeUrl = str;
        this.syntax = syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void addUnknownField(@NotNull B builder, int tag, @NotNull FieldEncoding fieldEncoding, @Nullable Object value) {
        builder.getClass();
        fieldEncoding.getClass();
        builder.addUnknownField(tag, fieldEncoding, value);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    @NotNull
    public M build(@NotNull B builder) {
        builder.getClass();
        return (M) builder.build();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void clearUnknownFields(@NotNull B builder) {
        builder.getClass();
        builder.clearUnknownFields();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public int getCachedSerializedSize(@NotNull M message) {
        message.getClass();
        return message.getCachedSerializedSize();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    @NotNull
    public Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    @NotNull
    public KClass<M> getMessageType() {
        return this.messageType;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    @NotNull
    public Syntax getSyntax() {
        return this.syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    @Nullable
    public String getTypeUrl() {
        return this.typeUrl;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    @NotNull
    public B newBuilder() {
        return (B) this.createBuilder.invoke();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void setCachedSerializedSize(@NotNull M message, int size) {
        message.getClass();
        message.setCachedSerializedSize$wire_runtime(size);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    @NotNull
    public gc2 unknownFields(@NotNull M message) {
        message.getClass();
        return message.unknownFields();
    }
}
