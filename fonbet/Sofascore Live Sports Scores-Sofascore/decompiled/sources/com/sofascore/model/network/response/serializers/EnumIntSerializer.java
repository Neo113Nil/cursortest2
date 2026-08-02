package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import defpackage.aik;
import defpackage.d7f;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0010J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\t\u0010\u0013R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/network/response/serializers/EnumIntSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "Lkotlin/Function1;", "", "serialize", "deserialize", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "Lkotlin/jvm/functions/Function1;", "getSerialize", "()Lkotlin/jvm/functions/Function1;", "getDeserialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class EnumIntSerializer<T extends Enum<?>> implements KSerializer {

    @NotNull
    private final SerialDescriptor descriptor;

    @NotNull
    private final Function1<Integer, T> deserialize;

    @NotNull
    private final Function1<T, Integer> serialize;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumIntSerializer(@NotNull String str, @NotNull Function1<? super T, Integer> function1, @NotNull Function1<? super Integer, ? extends T> function12) {
        str.getClass();
        function1.getClass();
        function12.getClass();
        this.serialize = function1;
        this.deserialize = function12;
        this.descriptor = aik.g(str, d7f.k);
    }

    @Override // defpackage.dy4
    @NotNull
    public T deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        return (T) this.deserialize.invoke(Integer.valueOf(decoder.k()));
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @NotNull
    public final Function1<Integer, T> getDeserialize() {
        return this.deserialize;
    }

    @NotNull
    public final Function1<T, Integer> getSerialize() {
        return this.serialize;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        encoder.getClass();
        value.getClass();
        encoder.B(((Number) this.serialize.invoke(value)).intValue());
    }
}
