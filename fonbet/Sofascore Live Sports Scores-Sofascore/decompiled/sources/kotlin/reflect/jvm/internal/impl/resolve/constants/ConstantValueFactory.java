package kotlin.reflect.jvm.internal.impl.resolve.constants;

import defpackage.km5;
import defpackage.ph0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ConstantValueFactory {

    @NotNull
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    private final ArrayValue createArrayValue(List<?> list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List S0 = CollectionsKt.S0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = S0.iterator();
        while (it.hasNext()) {
            ConstantValue createConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (createConstantValue$default != null) {
                arrayList.add(createConstantValue$default);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new ConstantValueFactory$createArrayValue$1(primitiveType));
        }
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        primitiveArrayKotlinType.getClass();
        return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
    }

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i, Object obj2) {
        if ((i & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v33, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    @Nullable
    public final ConstantValue<?> createConstantValue(@Nullable Object obj, @Nullable ModuleDescriptor moduleDescriptor) {
        ?? r0;
        ?? r02;
        ?? r03;
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                r03 = km5.a;
            } else if (length != 1) {
                r03 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    r03.add(Byte.valueOf(bArr[i]));
                    i++;
                }
            } else {
                r03 = a.c(Byte.valueOf(bArr[0]));
            }
            return createArrayValue(r03, moduleDescriptor, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                r02 = km5.a;
            } else if (length3 != 1) {
                r02 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    r02.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                r02 = a.c(Short.valueOf(sArr[0]));
            }
            return createArrayValue(r02, moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(ph0.V((int[]) obj), moduleDescriptor, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(ph0.W((long[]) obj), moduleDescriptor, PrimitiveType.LONG);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return createArrayValue(ph0.U((float[]) obj), moduleDescriptor, PrimitiveType.FLOAT);
            }
            if (obj instanceof double[]) {
                return createArrayValue(ph0.T((double[]) obj), moduleDescriptor, PrimitiveType.DOUBLE);
            }
            if (obj instanceof boolean[]) {
                return createArrayValue(ph0.Y((boolean[]) obj), moduleDescriptor, PrimitiveType.BOOLEAN);
            }
            if (obj == null) {
                return new NullValue();
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length5 = cArr.length;
        if (length5 == 0) {
            r0 = km5.a;
        } else if (length5 != 1) {
            r0 = new ArrayList(cArr.length);
            int length6 = cArr.length;
            while (i < length6) {
                r0.add(Character.valueOf(cArr[i]));
                i++;
            }
        } else {
            r0 = a.c(Character.valueOf(cArr[0]));
        }
        return createArrayValue(r0, moduleDescriptor, PrimitiveType.CHAR);
    }

    @NotNull
    public final ArrayValue createArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull KotlinType kotlinType) {
        list.getClass();
        kotlinType.getClass();
        return new TypedArrayValue(list, kotlinType);
    }
}
