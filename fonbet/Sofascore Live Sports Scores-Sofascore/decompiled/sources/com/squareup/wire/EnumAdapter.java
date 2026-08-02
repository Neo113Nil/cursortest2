package com.squareup.wire;

import com.ironsource.U3;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import defpackage.sha;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\t\u0010\rB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000eB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\u000fB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001d\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020 H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010#J\u0017\u0010$\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u0012H$¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"Lcom/squareup/wire/EnumAdapter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/ProtoAdapter;", "type", "Lkotlin/reflect/KClass;", "syntax", "Lcom/squareup/wire/Syntax;", "identity", "<init>", "(Lkotlin/reflect/KClass;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/WireEnum;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/WireEnum;)V", "(Ljava/lang/Class;)V", "(Ljava/lang/Class;Lcom/squareup/wire/Syntax;)V", "(Lkotlin/reflect/KClass;)V", "(Lkotlin/reflect/KClass;Lcom/squareup/wire/Syntax;)V", "encodedSize", "", U3.i.X, "(Lcom/squareup/wire/WireEnum;)I", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "(Lcom/squareup/wire/ProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lcom/squareup/wire/WireEnum;)V", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Lcom/squareup/wire/WireEnum;", "redact", "(Lcom/squareup/wire/WireEnum;)Lcom/squareup/wire/WireEnum;", "fromValue", "(I)Lcom/squareup/wire/WireEnum;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull Class<E> cls, @NotNull Syntax syntax) {
        this((KClass<WireEnum>) sha.A(cls), syntax, Internal.getIdentityOrNull(cls));
        cls.getClass();
        syntax.getClass();
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public E decode(@NotNull ProtoReader reader) throws IOException {
        reader.getClass();
        int readVarint32 = reader.readVarint32();
        E fromValue = fromValue(readVarint32);
        if (fromValue != null) {
            return fromValue;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ProtoWriter writer, @NotNull E value) throws IOException {
        writer.getClass();
        value.getClass();
        writer.writeVarint32(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(@NotNull E value) {
        value.getClass();
        return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value.getValue());
    }

    @Nullable
    public abstract E fromValue(int value);

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public E redact(@NotNull E value) {
        value.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(@NotNull ReverseProtoWriter writer, @NotNull E value) throws IOException {
        writer.getClass();
        value.getClass();
        writer.writeVarint32(value.getValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull Class<E> cls, @NotNull Syntax syntax, @Nullable E e) {
        this(sha.A(cls), syntax, e);
        cls.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull Class<E> cls) {
        this((KClass<WireEnum>) sha.A(cls), Syntax.PROTO_2, Internal.getIdentityOrNull(cls));
        cls.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull KClass<E> kClass, @NotNull Syntax syntax, @Nullable E e) {
        super(FieldEncoding.VARINT, (KClass<?>) kClass, (String) null, syntax, e);
        kClass.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull KClass<E> kClass) {
        this(kClass, Syntax.PROTO_2, Internal.getIdentityOrNull(sha.x(kClass)));
        kClass.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull KClass<E> kClass, @NotNull Syntax syntax) {
        this(kClass, syntax, Internal.getIdentityOrNull(sha.x(kClass)));
        kClass.getClass();
        syntax.getClass();
    }

    @Override // com.squareup.wire.ProtoAdapter
    @NotNull
    public E decode(@NotNull ProtoReader32 reader) throws IOException {
        reader.getClass();
        int readVarint32 = reader.readVarint32();
        E fromValue = fromValue(readVarint32);
        if (fromValue != null) {
            return fromValue;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, getType());
    }
}
