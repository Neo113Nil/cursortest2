package com.squareup.wire;

import com.ironsource.U3;
import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\u0005\u001a(\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\n\u001a(\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\f\u001aC\u0010\r\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0012H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aC\u0010\r\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00142\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0012H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a \u0010\u0016\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0080\b¢\u0006\u0002\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"commonEncodedSize", "", "E", "Lcom/squareup/wire/WireEnum;", U3.i.X, "(Lcom/squareup/wire/WireEnum;)I", "commonEncode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "(Lcom/squareup/wire/ProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lcom/squareup/wire/WireEnum;)V", "commonDecode", "Lcom/squareup/wire/EnumAdapter;", "reader", "Lcom/squareup/wire/ProtoReader;", "fromValue", "Lkotlin/Function1;", "(Lcom/squareup/wire/EnumAdapter;Lcom/squareup/wire/ProtoReader;Lkotlin/jvm/functions/Function1;)Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/EnumAdapter;Lcom/squareup/wire/ProtoReader32;Lkotlin/jvm/functions/Function1;)Lcom/squareup/wire/WireEnum;", "commonRedact", "(Lcom/squareup/wire/WireEnum;)Lcom/squareup/wire/WireEnum;", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnumAdapterKt {
    @NotNull
    public static final <E extends WireEnum> E commonDecode(@NotNull EnumAdapter<E> enumAdapter, @NotNull ProtoReader protoReader, @NotNull Function1<? super Integer, ? extends E> function1) {
        enumAdapter.getClass();
        protoReader.getClass();
        function1.getClass();
        int readVarint32 = protoReader.readVarint32();
        E e = (E) function1.invoke(Integer.valueOf(readVarint32));
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, enumAdapter.getType());
    }

    public static final <E extends WireEnum> void commonEncode(@NotNull ProtoWriter protoWriter, @NotNull E e) {
        protoWriter.getClass();
        e.getClass();
        protoWriter.writeVarint32(e.getValue());
    }

    public static final <E extends WireEnum> int commonEncodedSize(@NotNull E e) {
        e.getClass();
        return ProtoWriter.INSTANCE.varint32Size$wire_runtime(e.getValue());
    }

    @NotNull
    public static final <E extends WireEnum> E commonRedact(@NotNull E e) {
        e.getClass();
        throw new UnsupportedOperationException();
    }

    public static final <E extends WireEnum> void commonEncode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull E e) {
        reverseProtoWriter.getClass();
        e.getClass();
        reverseProtoWriter.writeVarint32(e.getValue());
    }

    @NotNull
    public static final <E extends WireEnum> E commonDecode(@NotNull EnumAdapter<E> enumAdapter, @NotNull ProtoReader32 protoReader32, @NotNull Function1<? super Integer, ? extends E> function1) {
        enumAdapter.getClass();
        protoReader32.getClass();
        function1.getClass();
        int readVarint32 = protoReader32.readVarint32();
        E e = (E) function1.invoke(Integer.valueOf(readVarint32));
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(readVarint32, enumAdapter.getType());
    }
}
