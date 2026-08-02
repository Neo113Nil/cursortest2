package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;
import xsna.jgp;
import xsna.sk3;
import xsna.ttp0;

/* compiled from: KotlinConstructorBuilder.kt */
/* loaded from: classes14.dex */
public final class KotlinConstructorBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message.Builder<M, B> {
    private final Map<Integer, Pair<WireField, Object>> fieldValueMap;
    private final Map<Integer, Pair<WireField, Map<?, ?>>> mapFieldKeyValueMap;
    private final Class<M> messageType;
    private final Map<Integer, Pair<WireField, List<?>>> repeatedFieldValueMap;

    /* compiled from: KotlinConstructorBuilder.kt */
    public static final class ProtoField {
        private final Class<?> type;
        private final WireField wireField;

        public ProtoField(Class<?> cls, WireField wireField) {
            this.type = cls;
            this.wireField = wireField;
        }

        public final Class<?> getType() {
            return this.type;
        }

        public final WireField getWireField() {
            return this.wireField;
        }
    }

    public KotlinConstructorBuilder(Class<M> cls) {
        this.messageType = cls;
        int length = cls.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    private final void clobberOtherIsOneOfs(WireField wireField) {
        Collection<Pair<WireField, Object>> values = this.fieldValueMap.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add((WireField) ((Pair) it.next()).i());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            WireField wireField2 = (WireField) obj;
            if (epx.f(wireField2.oneofName(), wireField.oneofName()) && wireField2.tag() != wireField.tag()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.fieldValueMap.remove(Integer.valueOf(((WireField) it2.next()).tag()));
        }
    }

    private final List<ProtoField> declaredProtoFields(Class<M> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            i++;
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : declaredAnnotations) {
                if (WireField.class.isInstance(annotation)) {
                    arrayList2.add(annotation);
                }
            }
            WireField wireField = (WireField) j5g.a0(arrayList2);
            ProtoField protoField = wireField == null ? null : new ProtoField(field.getType(), wireField);
            if (protoField != null) {
                arrayList.add(protoField);
            }
        }
        return arrayList;
    }

    @Override // com.squareup.wire.Message.Builder
    public M build() {
        boolean isMap;
        List<ProtoField> declaredProtoFields = declaredProtoFields(this.messageType);
        sk3 sk3Var = new sk3();
        sk3 sk3Var2 = new sk3();
        for (ProtoField protoField : declaredProtoFields) {
            if (!protoField.getWireField().label().isRepeated()) {
                isMap = KotlinConstructorBuilderKt.isMap(protoField.getWireField());
                if (!isMap) {
                    sk3Var2.add(protoField);
                }
            }
            sk3Var.add(protoField);
        }
        Constructor<?>[] constructors = this.messageType.getConstructors();
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor<?> constructor = constructors[i];
            i++;
            if (constructor.getParameterCount() == declaredProtoFields.size() + 1) {
                Parameter[] parameters = constructor.getParameters();
                ArrayList arrayList = new ArrayList(parameters.length);
                int length2 = parameters.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    Parameter parameter = parameters[i2];
                    i2++;
                    int i4 = i3 + 1;
                    arrayList.add((epx.f(parameter.getType(), List.class) || epx.f(parameter.getType(), Map.class)) ? get(((ProtoField) sk3Var.removeFirst()).getWireField()) : i3 == declaredProtoFields.size() ? buildUnknownFields() : get(((ProtoField) sk3Var2.removeFirst()).getWireField()));
                    i3 = i4;
                }
                Object[] array = arrayList.toArray(new Object[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                Object newInstance = constructor.newInstance(Arrays.copyOf(array, array.length));
                if (newInstance != null) {
                    return (M) newInstance;
                }
                throw new NullPointerException("null cannot be cast to non-null type M of com.squareup.wire.KotlinConstructorBuilder");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final Object get(WireField wireField) {
        boolean isMap;
        Object obj;
        isMap = KotlinConstructorBuilderKt.isMap(wireField);
        if (isMap) {
            Pair<WireField, Map<?, ?>> pair = this.mapFieldKeyValueMap.get(Integer.valueOf(wireField.tag()));
            obj = pair != null ? (Map) pair.j() : null;
            return obj == null ? jgp.b : obj;
        }
        if (wireField.label().isRepeated()) {
            Pair<WireField, List<?>> pair2 = this.repeatedFieldValueMap.get(Integer.valueOf(wireField.tag()));
            obj = pair2 != null ? (List) pair2.j() : null;
            return obj == null ? EmptyList.b : obj;
        }
        Pair<WireField, Object> pair3 = this.fieldValueMap.get(Integer.valueOf(wireField.tag()));
        if (pair3 == null) {
            return null;
        }
        return pair3.j();
    }

    public final void set(WireField wireField, Object obj) {
        boolean isMap;
        isMap = KotlinConstructorBuilderKt.isMap(wireField);
        if (isMap) {
            Map<Integer, Pair<WireField, Map<?, ?>>> map = this.mapFieldKeyValueMap;
            Integer valueOf = Integer.valueOf(wireField.tag());
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            }
            map.put(valueOf, new Pair<>(wireField, ttp0.c(obj)));
            return;
        }
        if (wireField.label().isRepeated()) {
            Map<Integer, Pair<WireField, List<?>>> map2 = this.repeatedFieldValueMap;
            Integer valueOf2 = Integer.valueOf(wireField.tag());
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<*>");
            }
            map2.put(valueOf2, new Pair<>(wireField, ttp0.b(obj)));
            return;
        }
        this.fieldValueMap.put(Integer.valueOf(wireField.tag()), new Pair<>(wireField, obj));
        if (obj == null || !wireField.label().isOneOf()) {
            return;
        }
        clobberOtherIsOneOfs(wireField);
    }
}
