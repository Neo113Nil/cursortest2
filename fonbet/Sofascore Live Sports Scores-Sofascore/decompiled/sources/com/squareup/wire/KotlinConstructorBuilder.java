package com.squareup.wire;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import defpackage.gc2;
import defpackage.i5k;
import defpackage.k13;
import defpackage.k89;
import defpackage.km5;
import defpackage.lm5;
import defpackage.v6a;
import defpackage.vg0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001\u001dB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\rJ\r\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder;", PlayerKt.FOOTBALL_MIDFIELDER, "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "messageType", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "fieldValueMap", "", "", "Lkotlin/Pair;", "Lcom/squareup/wire/WireField;", "", "repeatedFieldValueMap", "", "mapFieldKeyValueMap", "set", "", "field", U3.i.X, "clobberOtherIsOneOfs", "get", "build", "()Lcom/squareup/wire/Message;", "declaredProtoFields", "", "Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "ProtoField", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KotlinConstructorBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message.Builder<M, B> {

    @NotNull
    private final Map<Integer, Pair<WireField, Object>> fieldValueMap;

    @NotNull
    private final Map<Integer, Pair<WireField, Map<?, ?>>> mapFieldKeyValueMap;

    @NotNull
    private final Class<M> messageType;

    @NotNull
    private final Map<Integer, Pair<WireField, List<?>>> repeatedFieldValueMap;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "", "type", "Ljava/lang/Class;", "wireField", "Lcom/squareup/wire/WireField;", "<init>", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)V", "getType", "()Ljava/lang/Class;", "getWireField", "()Lcom/squareup/wire/WireField;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProtoField {

        @NotNull
        private final Class<?> type;

        @NotNull
        private final WireField wireField;

        public ProtoField(@NotNull Class<?> cls, @NotNull WireField wireField) {
            cls.getClass();
            wireField.getClass();
            this.type = cls;
            this.wireField = wireField;
        }

        @NotNull
        public final Class<?> getType() {
            return this.type;
        }

        @NotNull
        public final WireField getWireField() {
            return this.wireField;
        }
    }

    public KotlinConstructorBuilder(@NotNull Class<M> cls) {
        cls.getClass();
        this.messageType = cls;
        int length = cls.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    private final void clobberOtherIsOneOfs(WireField field) {
        Collection<Pair<WireField, Object>> values = this.fieldValueMap.values();
        ArrayList arrayList = new ArrayList(k13.r(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add((WireField) ((Pair) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            WireField wireField = (WireField) obj;
            if (Intrinsics.c(wireField.oneofName(), field.oneofName()) && wireField.tag() != field.tag()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.fieldValueMap.remove(Integer.valueOf(((WireField) it2.next()).tag()));
        }
    }

    private final List<ProtoField> declaredProtoFields(Class<M> cls) {
        ProtoField protoField;
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : declaredAnnotations) {
                if (annotation instanceof WireField) {
                    arrayList2.add(annotation);
                }
            }
            WireField wireField = (WireField) CollectionsKt.firstOrNull(arrayList2);
            if (wireField != null) {
                Class<?> type = field.getType();
                type.getClass();
                protoField = new ProtoField(type, wireField);
            } else {
                protoField = null;
            }
            if (protoField != null) {
                arrayList.add(protoField);
            }
        }
        return CollectionsKt.H0(arrayList, new Comparator() { // from class: com.squareup.wire.KotlinConstructorBuilder$declaredProtoFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t).getWireField().schemaIndex()).compareTo(Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t2).getWireField().schemaIndex()));
            }
        });
    }

    @Override // com.squareup.wire.Message.Builder
    @NotNull
    public M build() {
        List<ProtoField> declaredProtoFields = declaredProtoFields(this.messageType);
        vg0 vg0Var = new vg0();
        Iterator<ProtoField> it = declaredProtoFields.iterator();
        while (it.hasNext()) {
            vg0Var.addLast(it.next());
        }
        ArrayList arrayList = new ArrayList(k13.r(declaredProtoFields, 10));
        Iterator<T> it2 = declaredProtoFields.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProtoField) it2.next()).getType());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<M> cls = this.messageType;
        k89 k89Var = new k89(2);
        k89Var.b(clsArr);
        k89Var.a(gc2.class);
        ArrayList arrayList2 = k89Var.a;
        Constructor<M> declaredConstructor = cls.getDeclaredConstructor((Class[]) arrayList2.toArray(new Class[arrayList2.size()]));
        IntRange intRange = new IntRange(0, clsArr.length, 1);
        ArrayList arrayList3 = new ArrayList(k13.r(intRange, 10));
        v6a it3 = intRange.iterator();
        while (it3.c) {
            arrayList3.add(it3.nextInt() == declaredProtoFields.size() ? buildUnknownFields() : get(((ProtoField) vg0Var.removeFirst()).getWireField()));
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        M newInstance = declaredConstructor.newInstance(Arrays.copyOf(array, array.length));
        newInstance.getClass();
        return newInstance;
    }

    @Nullable
    public final Object get(@NotNull WireField field) {
        boolean isMap;
        List list;
        Map map;
        field.getClass();
        isMap = KotlinConstructorBuilderKt.isMap(field);
        if (!isMap) {
            if (field.label().isRepeated()) {
                Pair<WireField, List<?>> pair = this.repeatedFieldValueMap.get(Integer.valueOf(field.tag()));
                return (pair == null || (list = (List) pair.b) == null) ? km5.a : list;
            }
            Pair<WireField, Object> pair2 = this.fieldValueMap.get(Integer.valueOf(field.tag()));
            Object obj = pair2 != null ? pair2.b : null;
            return (obj == null && field.label() == WireField.Label.OMIT_IDENTITY) ? ProtoAdapter.INSTANCE.get(field.adapter()).getIdentity() : obj;
        }
        Pair<WireField, Map<?, ?>> pair3 = this.mapFieldKeyValueMap.get(Integer.valueOf(field.tag()));
        if (pair3 != null && (map = (Map) pair3.b) != null) {
            return map;
        }
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        return lm5Var;
    }

    public final void set(@NotNull WireField field, @Nullable Object value) {
        boolean isMap;
        field.getClass();
        isMap = KotlinConstructorBuilderKt.isMap(field);
        if (isMap) {
            Map<Integer, Pair<WireField, Map<?, ?>>> map = this.mapFieldKeyValueMap;
            Integer valueOf = Integer.valueOf(field.tag());
            value.getClass();
            map.put(valueOf, new Pair<>(field, i5k.c(value)));
            return;
        }
        if (field.label().isRepeated()) {
            Map<Integer, Pair<WireField, List<?>>> map2 = this.repeatedFieldValueMap;
            Integer valueOf2 = Integer.valueOf(field.tag());
            value.getClass();
            map2.put(valueOf2, new Pair<>(field, i5k.b(value)));
            return;
        }
        this.fieldValueMap.put(Integer.valueOf(field.tag()), new Pair<>(field, value));
        if (value == null || !field.label().isOneOf()) {
            return;
        }
        clobberOtherIsOneOfs(field);
    }
}
