package com.facebook.react.bridge;

import android.os.Bundle;
import android.os.Parcelable;
import com.twilio.voice.EventKeys;
import h8.InterfaceC4488a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4488a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0007J\u0018\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0007J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002J \u0010\u0011\u001a\u00020\u000e2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012H\u0007J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0007J\u001d\u0010\u0019\u001a\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0001H\u0007J\u0014\u0010\u001f\u001a\u00020\u00162\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J*\u0010\"\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010#j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0014\u0010'\u001a\u0004\u0018\u00010\u00142\b\u0010(\u001a\u0004\u0018\u00010)H\u0007¨\u0006*"}, d2 = {"Lcom/facebook/react/bridge/Arguments;", "", "<init>", "()V", "makeNativeObject", EventKeys.VALUE_KEY, "makeNativeArray", "Lcom/facebook/react/bridge/WritableNativeArray;", "objects", "", "T", "addEntry", "", "nativeMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "key", "", "makeNativeMap", "", "bundle", "Landroid/os/Bundle;", "createArray", "Lcom/facebook/react/bridge/WritableArray;", "createMap", "Lcom/facebook/react/bridge/WritableMap;", "fromJavaArgs", "args", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableNativeArray;", "fromArray", "array", "fromList", "list", "fromBundle", "toList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "toBundle", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Arguments {

    @NotNull
    public static final Arguments INSTANCE = new Arguments();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Arguments() {
    }

    private final void addEntry(WritableNativeMap nativeMap, String key, Object value) {
        Object makeNativeObject = makeNativeObject(value);
        if (makeNativeObject == null) {
            nativeMap.putNull(key);
            return;
        }
        if (makeNativeObject instanceof Boolean) {
            nativeMap.putBoolean(key, ((Boolean) makeNativeObject).booleanValue());
            return;
        }
        if (makeNativeObject instanceof Integer) {
            nativeMap.putInt(key, ((Number) makeNativeObject).intValue());
            return;
        }
        if (makeNativeObject instanceof Number) {
            nativeMap.putDouble(key, ((Number) makeNativeObject).doubleValue());
            return;
        }
        if (makeNativeObject instanceof String) {
            nativeMap.putString(key, (String) makeNativeObject);
            return;
        }
        if (makeNativeObject instanceof WritableNativeArray) {
            nativeMap.putArray(key, (ReadableArray) makeNativeObject);
            return;
        }
        if (makeNativeObject instanceof WritableNativeMap) {
            nativeMap.putMap(key, (ReadableMap) makeNativeObject);
            return;
        }
        throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
    }

    @JvmStatic
    @NotNull
    public static final WritableArray createArray() {
        return new WritableNativeArray();
    }

    @JvmStatic
    @NotNull
    public static final WritableMap createMap() {
        return new WritableNativeMap();
    }

    @JvmStatic
    @NotNull
    public static final WritableArray fromArray(@NotNull Object array) {
        Intrinsics.checkNotNullParameter(array, "array");
        WritableArray createArray = createArray();
        boolean z10 = array instanceof Object[];
        int i10 = 0;
        if (z10 && (((Object[]) array) instanceof String[])) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            while (i10 < length) {
                createArray.pushString(strArr[i10]);
                i10++;
            }
        } else if (z10 && (((Object[]) array) instanceof Bundle[])) {
            Bundle[] bundleArr = (Bundle[]) array;
            int length2 = bundleArr.length;
            while (i10 < length2) {
                createArray.pushMap(fromBundle(bundleArr[i10]));
                i10++;
            }
        } else if (array instanceof int[]) {
            int[] iArr = (int[]) array;
            int length3 = iArr.length;
            while (i10 < length3) {
                createArray.pushInt(iArr[i10]);
                i10++;
            }
        } else if (array instanceof float[]) {
            int length4 = ((float[]) array).length;
            while (i10 < length4) {
                createArray.pushDouble(r5[i10]);
                i10++;
            }
        } else if (array instanceof double[]) {
            double[] dArr = (double[]) array;
            int length5 = dArr.length;
            while (i10 < length5) {
                createArray.pushDouble(dArr[i10]);
                i10++;
            }
        } else if (array instanceof boolean[]) {
            boolean[] zArr = (boolean[]) array;
            int length6 = zArr.length;
            while (i10 < length6) {
                createArray.pushBoolean(zArr[i10]);
                i10++;
            }
        } else {
            if (!z10 || !(((Object[]) array) instanceof Parcelable[])) {
                throw new IllegalArgumentException("Unknown array type " + array.getClass());
            }
            Parcelable[] parcelableArr = (Parcelable[]) array;
            int length7 = parcelableArr.length;
            while (i10 < length7) {
                Parcelable parcelable = parcelableArr[i10];
                if (!(parcelable instanceof Bundle)) {
                    throw new IllegalArgumentException("Unexpected array member type " + parcelable.getClass());
                }
                createArray.pushMap(fromBundle((Bundle) parcelable));
                i10++;
            }
        }
        return createArray;
    }

    @JvmStatic
    @NotNull
    public static final WritableMap fromBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                Intrinsics.checkNotNull(str);
                createMap.putNull(str);
            } else if (obj.getClass().isArray()) {
                Intrinsics.checkNotNull(str);
                createMap.putArray(str, fromArray(obj));
            } else if (obj instanceof String) {
                Intrinsics.checkNotNull(str);
                createMap.putString(str, (String) obj);
            } else if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    Intrinsics.checkNotNull(str);
                    createMap.putInt(str, ((Number) obj).intValue());
                } else {
                    Intrinsics.checkNotNull(str);
                    createMap.putDouble(str, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof Boolean) {
                Intrinsics.checkNotNull(str);
                createMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Bundle) {
                Intrinsics.checkNotNull(str);
                createMap.putMap(str, fromBundle((Bundle) obj));
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Could not convert " + obj.getClass());
                }
                Intrinsics.checkNotNull(str);
                createMap.putArray(str, fromList((List) obj));
            }
        }
        return createMap;
    }

    @Deprecated(message = "Use fromJavaArgs(Array<Any?>) instead. This method is added only to retain compatibility with Java consumers.")
    @JvmStatic
    @NotNull
    public static final WritableNativeArray fromJavaArgs(@Nullable Object args) {
        Intrinsics.checkNotNull(args, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return fromJavaArgs((Object[]) args);
    }

    @JvmStatic
    @NotNull
    public static final WritableArray fromList(@NotNull List<?> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        WritableArray createArray = createArray();
        for (Object obj : list) {
            if (obj == null) {
                createArray.pushNull();
            } else if (obj.getClass().isArray()) {
                createArray.pushArray(fromArray(obj));
            } else if (obj instanceof Bundle) {
                createArray.pushMap(fromBundle((Bundle) obj));
            } else if (obj instanceof List) {
                createArray.pushArray(fromList((List) obj));
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Number) {
                createArray.pushDouble(((Number) obj).doubleValue());
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Unknown value type " + obj.getClass());
                }
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            }
        }
        return createArray;
    }

    @JvmStatic
    @NotNull
    public static final WritableNativeArray makeNativeArray(@Nullable List<?> objects) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (objects != null) {
            Iterator<?> it = objects.iterator();
            while (it.hasNext()) {
                Object makeNativeObject = INSTANCE.makeNativeObject(it.next());
                if (makeNativeObject == null) {
                    writableNativeArray.pushNull();
                } else if (makeNativeObject instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) makeNativeObject).booleanValue());
                } else if (makeNativeObject instanceof Integer) {
                    writableNativeArray.pushInt(((Number) makeNativeObject).intValue());
                } else if (makeNativeObject instanceof Double) {
                    writableNativeArray.pushDouble(((Number) makeNativeObject).doubleValue());
                } else if (makeNativeObject instanceof String) {
                    writableNativeArray.pushString((String) makeNativeObject);
                } else if (makeNativeObject instanceof WritableNativeArray) {
                    writableNativeArray.pushArray((ReadableArray) makeNativeObject);
                } else {
                    if (!(makeNativeObject instanceof WritableNativeMap)) {
                        throw new IllegalArgumentException("Could not convert " + makeNativeObject.getClass());
                    }
                    writableNativeArray.pushMap((ReadableMap) makeNativeObject);
                }
            }
        }
        return writableNativeArray;
    }

    @JvmStatic
    @InterfaceC4488a
    @NotNull
    public static final WritableNativeMap makeNativeMap(@Nullable Map<String, ? extends Object> objects) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (objects != null) {
            for (Map.Entry<String, ? extends Object> entry : objects.entrySet()) {
                INSTANCE.addEntry(writableNativeMap, entry.getKey(), entry.getValue());
            }
        }
        return writableNativeMap;
    }

    private final Object makeNativeObject(Object value) {
        if (value == null) {
            return null;
        }
        return ((value instanceof Float) || (value instanceof Long) || (value instanceof Byte) || (value instanceof Short)) ? Double.valueOf(((Number) value).doubleValue()) : value.getClass().isArray() ? makeNativeArray(value) : value instanceof List ? makeNativeArray((List<?>) value) : value instanceof Map ? makeNativeMap((Map<String, ? extends Object>) value) : value instanceof Bundle ? makeNativeMap((Bundle) value) : value instanceof JavaOnlyMap ? makeNativeMap(((JavaOnlyMap) value).toHashMap()) : value instanceof JavaOnlyArray ? makeNativeArray((List<?>) ((JavaOnlyArray) value).toArrayList()) : value;
    }

    @JvmStatic
    @Nullable
    public static final Bundle toBundle(@Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    bundle.putString(nextKey, null);
                    break;
                case 2:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
        }
        return bundle;
    }

    @JvmStatic
    @Nullable
    public static final ArrayList<Object> toList(@Nullable ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i10).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i10)));
                    break;
                case 3:
                    double d10 = readableArray.getDouble(i10);
                    if (d10 == Math.rint(d10)) {
                        arrayList.add(Integer.valueOf((int) d10));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d10));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i10));
                    break;
                case 5:
                    arrayList.add(toBundle(readableArray.getMap(i10)));
                    break;
                case 6:
                    arrayList.add(toList(readableArray.getArray(i10)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final WritableNativeArray fromJavaArgs(@NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = args.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = args[i10];
            Class<?> cls = obj != null ? obj.getClass() : null;
            if (cls == null) {
                writableNativeArray.pushNull();
            } else if (Intrinsics.areEqual(cls, Boolean.TYPE) || Intrinsics.areEqual(cls, Boolean.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
                writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (Intrinsics.areEqual(cls, Integer.TYPE) || Intrinsics.areEqual(cls, Integer.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Number");
                writableNativeArray.pushDouble(((Number) obj).doubleValue());
            } else if (Intrinsics.areEqual(cls, Double.TYPE) || Intrinsics.areEqual(cls, Double.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
                writableNativeArray.pushDouble(((Double) obj).doubleValue());
            } else if (Intrinsics.areEqual(cls, Float.TYPE)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
                writableNativeArray.pushDouble(((Float) obj).floatValue());
            } else if (Intrinsics.areEqual(cls, Float.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
                writableNativeArray.pushDouble(((Float) obj).floatValue());
            } else if (Intrinsics.areEqual(cls, String.class)) {
                writableNativeArray.pushString(obj.toString());
            } else if (Intrinsics.areEqual(cls, WritableNativeMap.class)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.react.bridge.WritableNativeMap");
                writableNativeArray.pushMap((WritableNativeMap) obj);
            } else {
                if (!Intrinsics.areEqual(cls, WritableNativeArray.class)) {
                    throw new RuntimeException("Cannot convert argument of type " + cls);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.react.bridge.WritableNativeArray");
                writableNativeArray.pushArray((WritableNativeArray) obj);
            }
        }
        return writableNativeArray;
    }

    @JvmStatic
    @InterfaceC4488a
    @NotNull
    public static final WritableNativeMap makeNativeMap(@Nullable Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Arguments arguments = INSTANCE;
                Intrinsics.checkNotNull(str);
                arguments.addEntry(writableNativeMap, str, bundle.get(str));
            }
        }
        return writableNativeMap;
    }

    @JvmStatic
    @NotNull
    public static final <T> WritableNativeArray makeNativeArray(@Nullable final Object objects) {
        if (objects == null) {
            return new WritableNativeArray();
        }
        return makeNativeArray((List<?>) new AbstractList<Object>() { // from class: com.facebook.react.bridge.Arguments$makeNativeArray$1
            @Override // java.util.AbstractList, java.util.List
            public Object get(int index) {
                return Array.get(objects, index);
            }

            public int getSize() {
                return Array.getLength(objects);
            }

            @Override // java.util.AbstractList, java.util.List
            public final /* bridge */ Object remove(int i10) {
                return removeAt(i10);
            }

            public /* bridge */ Object removeAt(int i10) {
                return super.remove(i10);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ int size() {
                return getSize();
            }
        });
    }
}
