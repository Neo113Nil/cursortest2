package com.facebook.react.bridge;

import android.annotation.SuppressLint;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082 ¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0082 ¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0082 ¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J6\u0010\u001e\u001a\u0002H\u001f\"\u0006\b\u0000\u0010\u001f\u0018\u00012\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"H\u0083\b¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J,\u0010$\u001a\u0002H\u001f\"\u0006\b\u0000\u0010\u001f\u0018\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"H\u0082\b¢\u0006\u0002\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J.\u0010&\u001a\u0004\u0018\u0001H\u001f\"\u0006\b\u0000\u0010\u001f\u0018\u00012\u0006\u0010\u001c\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"H\u0082\b¢\u0006\u0002\u0010%J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u00101\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u00102\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u00103\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020+H\u0016J\u0013\u0010=\u001a\u00020\u001b2\b\u0010>\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J(\u0010?\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0@j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e`AH\u0016R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R&\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e07068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006C"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap;", "Lcom/facebook/react/bridge/NativeMap;", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "()V", "keysStorage", "", "", "[Ljava/lang/String;", "keys", "getKeys", "()[Ljava/lang/String;", "localMapStorage", "", "", "localMap", "getLocalMap", "()Ljava/util/Map;", "localTypeMapStorage", "Lcom/facebook/react/bridge/ReadableType;", "localTypeMap", "getLocalTypeMap", "importKeys", "importValues", "()[Ljava/lang/Object;", "importTypes", "hasKey", "", "name", "isNull", "checkInstance", "T", "instance", "type", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "getValue", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getNullableValue", "getBoolean", "getDouble", "", "getInt", "", "getLong", "", "getString", "getArray", "Lcom/facebook/react/bridge/ReadableArray;", "getMap", "getType", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "entryIterator", "", "", "getEntryIterator", "()Ljava/util/Iterator;", "keySetIterator", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "hashCode", "equals", "other", "toHashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadableNativeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadableNativeMap.kt\ncom/facebook/react/bridge/ReadableNativeMap\n*L\n1#1,225:1\n108#1,4:226\n108#1,4:230\n121#1:234\n108#1,4:235\n121#1:239\n108#1,4:240\n121#1:244\n108#1,4:245\n121#1:249\n108#1,4:250\n126#1,5:254\n108#1,4:259\n126#1,5:263\n108#1,4:268\n126#1,5:272\n108#1,4:277\n*S KotlinDebug\n*F\n+ 1 ReadableNativeMap.kt\ncom/facebook/react/bridge/ReadableNativeMap\n*L\n121#1:226,4\n130#1:230,4\n134#1:234\n134#1:235,4\n136#1:239\n136#1:240,4\n139#1:244\n139#1:245,4\n141#1:249\n141#1:250,4\n143#1:254,5\n143#1:259,4\n146#1:263,5\n146#1:268,4\n149#1:272,5\n149#1:277,4\n*E\n"})
/* loaded from: classes2.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static int jniPassCounter;

    @Nullable
    private String[] keysStorage;

    @Nullable
    private Map<String, ? extends Object> localMapStorage;

    @Nullable
    private Map<String, ? extends ReadableType> localTypeMapStorage;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/bridge/ReadableNativeMap$Companion;", "", "<init>", "()V", EventKeys.VALUE_KEY, "", "jniPassCounter", "getJNIPassCounter", "()I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmName(name = "getJNIPassCounter")
        public final int getJNIPassCounter() {
            return ReadableNativeMap.jniPassCounter;
        }

        private Companion() {
        }
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ReflectionMethodUse"})
    private final /* synthetic */ <T> T checkInstance(String name, Object instance, Class<T> type) {
        Intrinsics.reifiedOperationMarker(2, "T");
        if (instance != 0) {
            return instance;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (instance != 0 ? instance.getClass().getSimpleName() : "NULL") + " to " + type.getSimpleName());
    }

    @JvmStatic
    @JvmName(name = "getJNIPassCounter")
    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    private final String[] getKeys() {
        String[] strArr;
        String[] strArr2 = this.keysStorage;
        if (strArr2 != null) {
            return strArr2;
        }
        synchronized (this) {
            strArr = this.keysStorage;
            if (strArr == null) {
                strArr = importKeys();
                this.keysStorage = strArr;
                jniPassCounter++;
            }
        }
        return strArr;
    }

    private final Map<String, Object> getLocalMap() {
        Map<String, ? extends Object> map;
        Map<String, ? extends Object> map2 = this.localMapStorage;
        if (map2 != null) {
            return map2;
        }
        synchronized (this) {
            try {
                Map<String, ? extends Object> map3 = this.localMapStorage;
                if (map3 == null) {
                    String[] keys = getKeys();
                    int length = keys.length;
                    HashMap hashMap = new HashMap();
                    Object[] importValues = importValues();
                    for (int i10 = 0; i10 < length; i10++) {
                        hashMap.put(keys[i10], importValues[i10]);
                    }
                    this.localMapStorage = hashMap;
                    jniPassCounter++;
                    map3 = hashMap;
                }
                map = map3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    private final Map<String, ReadableType> getLocalTypeMap() {
        Map<String, ReadableType> map;
        Map map2 = this.localTypeMapStorage;
        if (map2 != null) {
            return map2;
        }
        synchronized (this) {
            try {
                Object obj = this.localTypeMapStorage;
                if (obj == null) {
                    String[] keys = getKeys();
                    HashMap hashMap = new HashMap();
                    Object[] importTypes = importTypes();
                    int length = keys.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        String str = keys[i10];
                        Object obj2 = importTypes[i10];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
                        hashMap.put(str, (ReadableType) obj2);
                    }
                    this.localTypeMapStorage = hashMap;
                    jniPassCounter++;
                    obj = hashMap;
                }
                map = (Map) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    private final Object getNullableValue(String name) {
        return getLocalMap().get(name);
    }

    private final Object getValue(String name) {
        if (!hasKey(name)) {
            throw new NoSuchKeyException(name);
        }
        Object c10 = S7.a.c(getLocalMap().get(name));
        Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
        return c10;
    }

    private final native String[] importKeys();

    private final native Object[] importTypes();

    private final native Object[] importValues();

    public boolean equals(@Nullable Object other) {
        if (other instanceof ReadableNativeMap) {
            return Intrinsics.areEqual(getLocalMap(), ((ReadableNativeMap) other).getLocalMap());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableArray getArray(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableArray readableArray = (ReadableArray) (nullableValue instanceof ReadableArray ? nullableValue : null);
        if (readableArray != null) {
            return readableArray;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + nullableValue.getClass().getSimpleName() + " to " + ReadableArray.class.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Boolean bool = (Boolean) (!(value instanceof Boolean) ? null : value);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Boolean.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Double d10 = (Double) (!(value instanceof Double) ? null : value);
        if (d10 != null) {
            return d10.doubleValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Double.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public Dynamic getDynamic(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return DynamicFromMap.INSTANCE.create(this, name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        String[] keys = getKeys();
        Object[] importValues = importValues();
        jniPassCounter++;
        return new ReadableNativeMap$entryIterator$1(keys, importValues);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Double d10 = (Double) (!(value instanceof Double) ? null : value);
        if (d10 != null) {
            return (int) d10.doubleValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Double.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object value = getValue(name);
        Long l10 = (Long) (!(value instanceof Long) ? null : value);
        if (l10 != null) {
            return l10.longValue();
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (value != null ? value.getClass().getSimpleName() : "NULL") + " to " + Long.TYPE.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public String getString(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        String str = (String) (nullableValue instanceof String ? nullableValue : null);
        if (str != null) {
            return str;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + nullableValue.getClass().getSimpleName() + " to " + String.class.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public ReadableType getType(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ReadableType readableType = getLocalTypeMap().get(name);
        if (readableType != null) {
            return readableType;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getLocalMap().containsKey(name);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getLocalMap().containsKey(name)) {
            return getLocalMap().get(name) == null;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public ReadableMapKeySetIterator keySetIterator() {
        final String[] keys = getKeys();
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.ReadableNativeMap$keySetIterator$1
            private int currentIndex;

            public final int getCurrentIndex() {
                return this.currentIndex;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.currentIndex < keys.length;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                String[] strArr = keys;
                int i10 = this.currentIndex;
                this.currentIndex = i10 + 1;
                return strArr[i10];
            }

            public final void setCurrentIndex(int i10) {
                this.currentIndex = i10;
            }
        };
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @NotNull
    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> hashMap = new HashMap<>(getLocalMap());
        for (String str : hashMap.keySet()) {
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = str;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(str2).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    hashMap.put(str2, ((ReadableNativeMap) S7.a.c(getMap(str2))).toHashMap());
                    break;
                case 6:
                    hashMap.put(str2, ((ReadableArray) S7.a.c(getArray(str2))).toArrayList());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return hashMap;
    }

    private final /* synthetic */ <T> T getNullableValue(String name, Class<T> type) {
        T t10 = (T) getNullableValue(name);
        if (t10 == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(2, "T");
        return t10;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    @Nullable
    public ReadableNativeMap getMap(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableNativeMap readableNativeMap = (ReadableNativeMap) (nullableValue instanceof ReadableNativeMap ? nullableValue : null);
        if (readableNativeMap != null) {
            return readableNativeMap;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + nullableValue.getClass().getSimpleName() + " to " + ReadableNativeMap.class.getSimpleName());
    }

    private final /* synthetic */ <T> T getValue(String name, Class<T> type) {
        T t10 = (T) getValue(name);
        Intrinsics.reifiedOperationMarker(2, "T");
        if (t10 != null) {
            return t10;
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + (t10 != null ? t10.getClass().getSimpleName() : "NULL") + " to " + type.getSimpleName());
    }
}
