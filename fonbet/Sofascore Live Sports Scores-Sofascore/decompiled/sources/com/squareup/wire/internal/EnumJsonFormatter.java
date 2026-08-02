package com.squareup.wire.internal;

import com.ironsource.L6;
import com.ironsource.U3;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import defpackage.ph0;
import defpackage.sha;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/internal/EnumJsonFormatter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/internal/JsonFormatter;", L6.G1, "Lcom/squareup/wire/EnumAdapter;", "<init>", "(Lcom/squareup/wire/EnumAdapter;)V", "stringToValue", "", "", "valueToString", "unrecognizedClassConstructor", "Ljava/lang/reflect/Constructor;", "fromString", U3.i.X, "(Ljava/lang/String;)Lcom/squareup/wire/WireEnum;", "toStringOrNumber", "", "(Lcom/squareup/wire/WireEnum;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {

    @NotNull
    private final Map<String, E> stringToValue;

    @Nullable
    private Constructor<E> unrecognizedClassConstructor;

    @NotNull
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.squareup.wire.WireEnum[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.squareup.wire.WireEnum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.annotation.Annotation[]] */
    public EnumJsonFormatter(@NotNull EnumAdapter<E> enumAdapter) {
        WireEnumConstant wireEnumConstant;
        enumAdapter.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        KClass<?> type = enumAdapter.getType();
        type.getClass();
        Class x = sha.x(type);
        ?? r2 = (WireEnum[]) x.getEnumConstants();
        if (r2 == 0) {
            Class<?>[] declaredClasses = x.getDeclaredClasses();
            declaredClasses.getClass();
            for (Class<?> cls : declaredClasses) {
                String simpleName = cls.getSimpleName();
                if (!simpleName.equals("Companion")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    declaredFields.getClass();
                    Field field = (Field) ph0.z(declaredFields);
                    if (Intrinsics.c(field.getName(), "INSTANCE")) {
                        Object obj = field.get(null);
                        obj.getClass();
                        WireEnum wireEnum = (WireEnum) obj;
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        ?? annotations = cls.getAnnotations();
                        annotations.getClass();
                        int length = annotations.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                wireEnumConstant = 0;
                                break;
                            }
                            wireEnumConstant = annotations[i];
                            if (wireEnumConstant instanceof WireEnumConstant) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        WireEnumConstant wireEnumConstant2 = wireEnumConstant instanceof WireEnumConstant ? wireEnumConstant : null;
                        if (wireEnumConstant2 != null && wireEnumConstant2.declaredName().length() > 0) {
                            linkedHashMap.put(wireEnumConstant2.declaredName(), wireEnum);
                            linkedHashMap2.put(wireEnum, wireEnumConstant2.declaredName());
                        }
                    } else {
                        Constructor<?>[] constructors = cls.getConstructors();
                        constructors.getClass();
                        Object z = ph0.z(constructors);
                        z.getClass();
                        this.unrecognizedClassConstructor = (Constructor) z;
                    }
                }
            }
        } else {
            for (?? r5 : r2) {
                r5.getClass();
                String name = ((Enum) r5).name();
                linkedHashMap.put(name, r5);
                linkedHashMap.put(String.valueOf(r5.getValue()), r5);
                linkedHashMap2.put(r5, name);
                WireEnumConstant wireEnumConstant3 = (WireEnumConstant) x.getDeclaredField(name).getAnnotation(WireEnumConstant.class);
                if (wireEnumConstant3 != null && wireEnumConstant3.declaredName().length() > 0) {
                    linkedHashMap.put(wireEnumConstant3.declaredName(), r5);
                    linkedHashMap2.put(r5, wireEnumConstant3.declaredName());
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    @Nullable
    public E fromString(@NotNull String value) {
        value.getClass();
        E e = this.stringToValue.get(value);
        if (e == null) {
            Integer intOrNull = StringsKt.toIntOrNull(value);
            e = null;
            if (intOrNull != null) {
                int intValue = intOrNull.intValue();
                Constructor<E> constructor = this.unrecognizedClassConstructor;
                if (constructor != null) {
                    return constructor.newInstance(Integer.valueOf(intValue));
                }
            }
        }
        return e;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    @NotNull
    public Object toStringOrNumber(@NotNull E value) {
        value.getClass();
        String str = this.valueToString.get(value);
        return str == null ? Integer.valueOf(value.getValue()) : str;
    }
}
