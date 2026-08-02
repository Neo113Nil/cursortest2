package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1 extends xka implements Function1<ProtoBuf.Type, ProtoBuf.Type> {
    final /* synthetic */ TypeDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.this$0 = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ProtoBuf.Type invoke(@NotNull ProtoBuf.Type type) {
        DeserializationContext deserializationContext;
        type.getClass();
        deserializationContext = this.this$0.c;
        return ProtoTypeTableUtilKt.outerType(type, deserializationContext.getTypeTable());
    }
}
