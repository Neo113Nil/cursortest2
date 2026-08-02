package defpackage;

import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class hfa implements KSerializer {

    @NotNull
    private final KClass<Object> baseClass;

    @NotNull
    private final SerialDescriptor descriptor;

    public hfa(KClass kClass) {
        kClass.getClass();
        this.baseClass = kClass;
        this.descriptor = aik.x("JsonContentPolymorphicSerializer<" + kClass.getSimpleName() + '>', zze.g, new SerialDescriptor[0]);
    }

    @Override // defpackage.dy4
    @NotNull
    public final Object deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        mfa j = ufa.j(decoder);
        b j2 = j.j();
        dy4 selectDeserializer = selectDeserializer(j2);
        selectDeserializer.getClass();
        return j.d().a((KSerializer) selectDeserializer, j2);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public abstract dy4 selectDeserializer(b bVar);

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Object obj) {
        encoder.getClass();
        obj.getClass();
        KSerializer i = encoder.a().i(this.baseClass, obj);
        if (i == null) {
            Class<?> cls = obj.getClass();
            fuf fufVar = duf.a;
            KSerializer U = sha.U(fufVar.getOrCreateKotlinClass(cls));
            if (U == null) {
                KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(obj.getClass());
                KClass<Object> kClass = this.baseClass;
                String simpleName = orCreateKotlinClass.getSimpleName();
                if (simpleName == null) {
                    simpleName = String.valueOf(orCreateKotlinClass);
                }
                throw new v5h(bf3.k("Class '", simpleName, "' is not registered for polymorphic serialization ", "in the scope of '" + kClass.getSimpleName() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            }
            i = U;
        }
        i.serialize(encoder, obj);
    }
}
