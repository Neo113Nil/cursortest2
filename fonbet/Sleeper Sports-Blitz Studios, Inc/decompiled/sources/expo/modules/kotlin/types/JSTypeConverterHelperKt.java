package expo.modules.kotlin.types;

import android.net.Uri;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.formatters.FormattedRecord;
import expo.modules.kotlin.records.formatters.ValueOrSkip;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.KCallablesJvm;

/* compiled from: JSTypeConverterHelper.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0014\n\u0002\u0010\u0013\n\u0002\u0010\u0018\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004\u001a\u001c\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\b\u001a\u00020\t\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\n\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\n2\u0006\u0010\b\u001a\u00020\t\u001a0\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\f0\u0001\u001a*\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\f0\u00012\u0006\u0010\b\u001a\u00020\t\u001a\u001e\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\r\u001a\u001e\u0010\u0006\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\r2\u0006\u0010\b\u001a\u00020\t\u001a#\u0010\u0006\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0011\u001a\u0012\u0010\u0006\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u0006\u001a\u00020\u000f*\u00020\u00132\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u0006\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u0006\u001a\u00020\u000f*\u00020\u00152\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u0006\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u0017\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0018\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0019\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u001a\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u001b\u001a\u001a\u0010\u0006\u001a\u00020\u000f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001c2\u0006\u0010\b\u001a\u00020\t\u001a\u001e\u0010\u001d\u001a\u00020\u001e*\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0016\u0010\u001d\u001a\u00020\u001e*\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006!"}, d2 = {"toJSValueExperimental", "", "", "", "Lexpo/modules/kotlin/records/Record;", "Lexpo/modules/kotlin/records/formatters/FormattedRecord;", "toJSValue", "Lcom/facebook/react/bridge/WritableMap;", "containerProvider", "Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;", "Landroid/os/Bundle;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/react/bridge/WritableArray;", "", "([Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "", "", "", "", "", "Ljava/net/URL;", "Landroid/net/Uri;", "Ljava/net/URI;", "Ljava/io/File;", "Lkotlin/Pair;", "putGeneric", "", SDKConstants.PARAM_KEY, "value", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JSTypeConverterHelperKt {
    public static final Map<String, Object> toJSValueExperimental(Record record) {
        Object obj;
        Intrinsics.checkNotNullParameter(record, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<KProperty1> memberProperties = KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(record.getClass()));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberProperties, 10));
        for (KProperty1 kProperty1 : memberProperties) {
            Iterator<T> it = kProperty1.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Annotation) obj) instanceof Field) {
                    break;
                }
            }
            Field field = (Field) obj;
            if (field != null) {
                String key = field.key();
                String str = Intrinsics.areEqual(key, "") ? null : key;
                if (str == null) {
                    str = kProperty1.getName();
                }
                KCallablesJvm.setAccessible(kProperty1, true);
                linkedHashMap.put(str, JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, kProperty1.get(record), null, true, 2, null));
            }
            arrayList.add(Unit.INSTANCE);
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> toJSValueExperimental(FormattedRecord<?> formattedRecord) {
        Object obj;
        Object invoke;
        Intrinsics.checkNotNullParameter(formattedRecord, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<KProperty1<Record, ?>> memberProperties = KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(formattedRecord.getRecord$expo_modules_core_release().getClass()));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberProperties, 10));
        for (KProperty1<Record, ?> kProperty1 : memberProperties) {
            Iterator<T> it = kProperty1.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Annotation) obj) instanceof Field) {
                    break;
                }
            }
            Field field = (Field) obj;
            if (field != null) {
                String key = field.key();
                String str = Intrinsics.areEqual(key, "") ? null : key;
                if (str == null) {
                    str = kProperty1.getName();
                }
                KCallablesJvm.setAccessible(kProperty1, true);
                Function2<Record, Object, Object> action$expo_modules_core_release = formattedRecord.getFormatter$expo_modules_core_release().getAction$expo_modules_core_release(kProperty1);
                Object obj2 = kProperty1.get(formattedRecord.getRecord$expo_modules_core_release());
                if (action$expo_modules_core_release != null && (invoke = action$expo_modules_core_release.invoke(formattedRecord.getRecord$expo_modules_core_release(), obj2)) != null) {
                    obj2 = invoke;
                }
                if (obj2 instanceof ValueOrSkip) {
                    ValueOrSkip valueOrSkip = (ValueOrSkip) obj2;
                    if (valueOrSkip instanceof ValueOrSkip.Value) {
                        obj2 = ((ValueOrSkip.Value) obj2).getValue();
                    } else if (!Intrinsics.areEqual(valueOrSkip, ValueOrSkip.Skip.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                linkedHashMap.put(str, JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, obj2, null, true, 2, null));
            }
            arrayList.add(Unit.INSTANCE);
        }
        return linkedHashMap;
    }

    public static final WritableMap toJSValue(Record record, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Object obj;
        Intrinsics.checkNotNullParameter(record, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableMap createMap = containerProvider.createMap();
        Collection<KProperty1> memberProperties = KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(record.getClass()));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberProperties, 10));
        for (KProperty1 kProperty1 : memberProperties) {
            Iterator<T> it = kProperty1.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Annotation) obj) instanceof Field) {
                    break;
                }
            }
            Field field = (Field) obj;
            if (field != null) {
                String key = field.key();
                String str = Intrinsics.areEqual(key, "") ? null : key;
                if (str == null) {
                    str = kProperty1.getName();
                }
                KCallablesJvm.setAccessible(kProperty1, true);
                putGeneric(createMap, str, JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(kProperty1.get(record), containerProvider));
            }
            arrayList.add(Unit.INSTANCE);
        }
        return createMap;
    }

    public static final Map<String, Object> toJSValueExperimental(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            linkedHashMap.put(str, JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, bundle.get(str), null, true, 2, null));
        }
        return linkedHashMap;
    }

    public static final WritableMap toJSValue(Bundle bundle, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableMap createMap = containerProvider.createMap();
        for (String str : bundle.keySet()) {
            Object legacyConvertToJSValue = JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(bundle.get(str), containerProvider);
            Intrinsics.checkNotNull(str);
            putGeneric(createMap, str, legacyConvertToJSValue);
        }
        return createMap;
    }

    public static final <K, V> WritableMap toJSValue(Map<K, ? extends V> map, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableMap createMap = containerProvider.createMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            putGeneric(createMap, String.valueOf(key), JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(entry.getValue(), containerProvider));
        }
        return createMap;
    }

    public static final <T> Collection<Object> toJSValueExperimental(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Collection<? extends T> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, it.next(), null, true, 2, null));
        }
        return arrayList;
    }

    public static final <T> WritableArray toJSValue(Collection<? extends T> collection, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            putGeneric(createArray, JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(it.next(), containerProvider));
        }
        return createArray;
    }

    public static final <T> WritableArray toJSValue(T[] tArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        for (T t : tArr) {
            putGeneric(createArray, JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(t, containerProvider));
        }
        return createArray;
    }

    public static final WritableArray toJSValue(int[] iArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        for (int i : iArr) {
            createArray.pushInt(i);
        }
        return createArray;
    }

    public static final WritableArray toJSValue(long[] jArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        for (long j : jArr) {
            createArray.pushLong(j);
        }
        return createArray;
    }

    public static final WritableArray toJSValue(float[] fArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        for (float f : fArr) {
            createArray.pushDouble(f);
        }
        return createArray;
    }

    public static final WritableArray toJSValue(double[] dArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        for (double d : dArr) {
            createArray.pushDouble(d);
        }
        return createArray;
    }

    public static final WritableArray toJSValue(boolean[] zArr, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        for (boolean z : zArr) {
            createArray.pushBoolean(z);
        }
        return createArray;
    }

    public static final Object toJSValue(Enum<?> r4) {
        Object obj;
        Intrinsics.checkNotNullParameter(r4, "<this>");
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(Reflection.getOrCreateKotlinClass(r4.getClass()));
        if (primaryConstructor == null) {
            throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value".toString());
        }
        if (primaryConstructor.getParameters().isEmpty()) {
            return r4.name();
        }
        if (primaryConstructor.getParameters().size() == 1) {
            String name = ((KParameter) CollectionsKt.first((List) primaryConstructor.getParameters())).getName();
            Intrinsics.checkNotNull(name);
            Iterator it = KClasses.getDeclaredMemberProperties(Reflection.getOrCreateKotlinClass(r4.getClass())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((KProperty1) obj).getName(), name)) {
                    break;
                }
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
            return ((KProperty1) obj).get(r4);
        }
        throw new IllegalStateException("Enum '" + r4.getClass() + "' cannot be used as return type (incompatible with JS)");
    }

    public static final String toJSValue(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        String url2 = url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "toString(...)");
        return url2;
    }

    public static final String toJSValue(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    public static final String toJSValue(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        return uri2;
    }

    public static final String toJSValue(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public static final WritableArray toJSValue(Pair<?, ?> pair, JSTypeConverterProvider.ContainerProvider containerProvider) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Intrinsics.checkNotNullParameter(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        Object legacyConvertToJSValue = JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(pair.getFirst(), containerProvider);
        Object legacyConvertToJSValue2 = JSTypeConverterProvider.INSTANCE.legacyConvertToJSValue(pair.getSecond(), containerProvider);
        putGeneric(createArray, legacyConvertToJSValue);
        putGeneric(createArray, legacyConvertToJSValue2);
        return createArray;
    }

    public static final void putGeneric(WritableMap writableMap, String key, Object obj) {
        Intrinsics.checkNotNullParameter(writableMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj == null || (obj instanceof Unit)) {
            writableMap.putNull(key);
            return;
        }
        if (obj instanceof ReadableArray) {
            writableMap.putArray(key, (ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableMap.putMap(key, (ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableMap.putString(key, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableMap.putInt(key, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableMap.putLong(key, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableMap.putDouble(key, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableMap.putBoolean(key, ((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableMap");
    }

    public static final void putGeneric(WritableArray writableArray, Object obj) {
        Intrinsics.checkNotNullParameter(writableArray, "<this>");
        if (obj == null || (obj instanceof Unit)) {
            writableArray.pushNull();
            return;
        }
        if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
            return;
        }
        if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
            return;
        }
        if (obj instanceof String) {
            writableArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableArray.pushLong(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Number) {
            writableArray.pushDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        throw new IllegalArgumentException("Could not put '" + obj.getClass() + "' to WritableArray");
    }

    public static final <K, V> Map<String, Object> toJSValueExperimental(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(String.valueOf(entry.getKey()), JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, entry.getValue(), null, true, 2, null)));
        }
        return MapsKt.toMap(arrayList);
    }
}
