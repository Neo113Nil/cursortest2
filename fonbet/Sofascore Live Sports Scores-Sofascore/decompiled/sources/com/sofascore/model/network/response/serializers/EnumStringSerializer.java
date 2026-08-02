package com.sofascore.model.network.response.serializers;

import com.ironsource.U3;
import defpackage.aik;
import defpackage.d7f;
import defpackage.fga;
import defpackage.jp5;
import defpackage.k13;
import defpackage.kp5;
import defpackage.q5h;
import defpackage.sub;
import defpackage.v5h;
import java.lang.Enum;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u001c\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/sofascore/model/network/response/serializers/EnumStringSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Ljp5;", "entries", "<init>", "(Ljp5;)V", "Ljava/lang/reflect/Field;", "field", "", "", "getAnnotation", "(Ljava/lang/reflect/Field;)[Ljava/lang/String;", "", U3.i.X, "Lv5h;", "error", "(Ljava/lang/Object;)Lv5h;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "Ljp5;", "", "entriesByName", "Ljava/util/Map;", "", "namesByValue", "valuesByName", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class EnumStringSerializer<T extends Enum<T>> implements KSerializer {

    @NotNull
    private final Class<? extends T> clazz;

    @NotNull
    private final SerialDescriptor descriptor;

    @NotNull
    private final jp5 entries;

    @NotNull
    private final Map<String, T> entriesByName;

    @NotNull
    private final Map<String, String> namesByValue;

    @NotNull
    private final Map<String, String> valuesByName;

    public EnumStringSerializer(@NotNull jp5 jp5Var) {
        String[] annotation;
        jp5Var.getClass();
        this.entries = jp5Var;
        int c = sub.c(k13.r(jp5Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(c < 16 ? 16 : c);
        for (Object obj : jp5Var) {
            linkedHashMap.put(((Enum) obj).name(), obj);
        }
        this.entriesByName = linkedHashMap;
        this.namesByValue = new LinkedHashMap();
        this.valuesByName = new LinkedHashMap();
        Class<? extends T> cls = (Class<? extends T>) ((kp5) this.entries).get(0).getClass();
        this.clazz = cls;
        Field[] fields = cls.getFields();
        fields.getClass();
        for (Field field : fields) {
            if (Intrinsics.c(field.getType(), this.clazz) && (annotation = getAnnotation(field)) != null) {
                getAnnotation(field);
                for (String str : annotation) {
                    this.namesByValue.put(str, field.getName());
                    this.valuesByName.put(field.getName(), str);
                }
            }
        }
        String cls2 = this.clazz.toString();
        cls2.getClass();
        this.descriptor = aik.g(cls2, d7f.n);
    }

    private final v5h error(Object value) {
        return new v5h(value + " is not a valid enum " + getDescriptor().h() + ", must be one of " + this.entries);
    }

    private final String[] getAnnotation(Field field) {
        q5h q5hVar = (q5h) field.getAnnotation(q5h.class);
        if (q5hVar != null) {
            return new String[]{q5hVar.value()};
        }
        fga fgaVar = (fga) field.getAnnotation(fga.class);
        if (fgaVar != null) {
            return fgaVar.names();
        }
        return null;
    }

    @Override // defpackage.dy4
    @Nullable
    public T deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        String str = this.namesByValue.get(decoder.z());
        if (str == null) {
            return null;
        }
        return this.entriesByName.get(str);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @Nullable T value) {
        encoder.getClass();
        if (value == null) {
            return;
        }
        if (((kp5) this.entries).indexOf(value) == -1) {
            throw error(value);
        }
        String str = this.valuesByName.get(value.name());
        if (str == null) {
            return;
        }
        encoder.F(str);
    }
}
