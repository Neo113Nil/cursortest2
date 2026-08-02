package com.zoho.salesiq.core.reactlibrary;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import com.zoho.salesiq.core.reactlibrary.RNZohoSalesIQCore;
import hg.C4507a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.EnumC5584a;
import od.w;
import we.d;
import we.e;

/* loaded from: classes4.dex */
public final class RNZohoSalesIQCore {

    /* renamed from: c, reason: collision with root package name */
    public static ReactApplicationContext f44617c;

    /* renamed from: e, reason: collision with root package name */
    public static RNZohoSalesIQCore f44619e;

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f44615a = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f44616b = LazyKt.lazy(new Function0() { // from class: ig.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Gson e10;
            e10 = RNZohoSalesIQCore.e();
            return e10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final Handler f44618d = new Handler(Looper.getMainLooper());

    public static final class Companion {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC5584a.values().length];
                try {
                    iArr[EnumC5584a.f56601a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5584a.f56602b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            StringBuilder sb2 = new StringBuilder(30);
            if (str != null) {
                char[] charArray = str.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                boolean z10 = false;
                for (char c10 : charArray) {
                    if (c10 == '_') {
                        z10 = true;
                    } else {
                        if (z10) {
                            c10 = Character.toUpperCase(c10);
                        }
                        sb2.append(c10);
                        z10 = false;
                    }
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C4507a b(ReadableMap readableMap) {
            if (readableMap == null) {
                return null;
            }
            C4507a.C0720a c0720a = new C4507a.C0720a();
            String string = readableMap.getString("name");
            if (string != null) {
                c0720a.f(string);
            }
            String string2 = readableMap.getString("additionalInfo");
            if (string2 != null) {
                c0720a.b(string2);
            }
            String string3 = readableMap.getString("displayPicture");
            if (string3 != null) {
                c0720a.e(string3);
            }
            ReadableArray array = readableMap.getArray("departments");
            ArrayList<Object> arrayList = array != null ? array.toArrayList() : null;
            if (arrayList == null) {
                arrayList = null;
            }
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    Map map = (Map) it.next();
                    Object obj = map.get(StackTraceHelper.ID_KEY);
                    String str = obj instanceof String ? (String) obj : null;
                    Object obj2 = map.get("name");
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    Object obj3 = map.get("communicationMode");
                    Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
                    arrayList2.add(new w(str, str2, null, null, false, 0L, 0L, num != null ? (Se.a) Se.a.getEntries().get(num.intValue()) : null, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
                }
                c0720a.d(arrayList2);
            }
            return c0720a.a();
        }

        public final WritableMap c(int i10, String str) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt(EventKeys.ERROR_CODE, i10);
            writableNativeMap.putString("message", str);
            return writableNativeMap;
        }

        public final WritableMap d(String str, ReadableMap readableMap) {
            try {
                Result.Companion companion = Result.INSTANCE;
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("event", str);
                writableNativeMap.putMap("body", readableMap);
                return writableNativeMap;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Object m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                if (Result.m153isFailureimpl(m147constructorimpl)) {
                    m147constructorimpl = null;
                }
                return (WritableMap) m147constructorimpl;
            }
        }

        public final Gson e() {
            return (Gson) RNZohoSalesIQCore.f44616b.getValue();
        }

        public final RNZohoSalesIQCore f() {
            return RNZohoSalesIQCore.f44619e;
        }

        public final void g(e eVar, Promise promise, EnumC5584a resultType) {
            String str;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            Intrinsics.checkNotNullParameter(resultType, "resultType");
            if (promise != null) {
                if (eVar.d() && eVar.b() != null) {
                    int i10 = a.$EnumSwitchMapping$0[resultType.ordinal()];
                    promise.resolve(i10 != 1 ? i10 != 2 ? eVar.b() : RNZohoSalesIQCore.f44615a.l(eVar.b()) : RNZohoSalesIQCore.f44615a.k(eVar.b()));
                    return;
                }
                d c10 = eVar.c();
                if (c10 == null || (str = Integer.valueOf(c10.a()).toString()) == null) {
                    str = "UNKNOWN_ERROR";
                }
                d c11 = eVar.c();
                promise.reject(str, c11 != null ? c11.b() : null, (Throwable) null);
            }
        }

        public final void h(ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            if (f() == null) {
                synchronized (RNZohoSalesIQCore.class) {
                    try {
                        Companion companion = RNZohoSalesIQCore.f44615a;
                        if (companion.f() == null) {
                            companion.i(new RNZohoSalesIQCore(reactContext, null));
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final void i(RNZohoSalesIQCore rNZohoSalesIQCore) {
            RNZohoSalesIQCore.f44619e = rNZohoSalesIQCore;
        }

        public final Map j(ReadableMap readableMap) {
            if (readableMap == null) {
                return null;
            }
            try {
                return (Map) e().n(e().v(readableMap.toHashMap()), new TypeToken<HashMap<String, Object>>() { // from class: com.zoho.salesiq.core.reactlibrary.RNZohoSalesIQCore$Companion$toMap$mapType$1
                }.getType());
            } catch (Exception e10) {
                Log.e("RNZohoSalesIQCore", "Error converting ReadableMap to Map: " + e10.getMessage());
                return null;
            }
        }

        public final WritableArray k(Object obj) {
            if (obj == null) {
                return new WritableNativeArray();
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            Type type = new TypeToken<List<? extends Map<String, ? extends Object>>>() { // from class: com.zoho.salesiq.core.reactlibrary.RNZohoSalesIQCore$Companion$toWritableArray$mapType$1
            }.getType();
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = RNZohoSalesIQCore.f44615a;
                WritableNativeArray makeNativeArray = Arguments.makeNativeArray((List<?>) companion2.e().n(companion2.e().v(obj), type));
                int size = makeNativeArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    writableNativeArray.pushMap(RNZohoSalesIQCore.f44615a.l(makeNativeArray.getMap(i10)));
                }
                Result.m147constructorimpl(Unit.INSTANCE);
                return writableNativeArray;
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m147constructorimpl(ResultKt.createFailure(th2));
                return writableNativeArray;
            }
        }

        public final WritableMap l(Object obj) {
            if (obj == null) {
                return new WritableNativeMap();
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            boolean z10 = obj instanceof ReadableMap;
            Map map = !z10 ? (Map) e().n(e().v(obj), new TypeToken<Map<String, ? extends Object>>() { // from class: com.zoho.salesiq.core.reactlibrary.RNZohoSalesIQCore$Companion$toWritableMap$mapType$1
            }.getType()) : null;
            ReadableMap readableMap = z10 ? (ReadableMap) obj : null;
            if (readableMap == null) {
                readableMap = Arguments.makeNativeMap((Map<String, ? extends Object>) map);
            }
            Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                String a10 = a(next.getKey());
                Object value = next.getValue();
                if (value == null) {
                    writableNativeMap.putNull(a10);
                } else if (value instanceof ReadableArray) {
                    writableNativeMap.putArray(a10, (ReadableArray) value);
                } else if (value instanceof String) {
                    writableNativeMap.putString(a10, (String) value);
                } else if (value instanceof Number) {
                    if (value instanceof Integer) {
                        writableNativeMap.putInt(a10, ((Number) value).intValue());
                    } else {
                        writableNativeMap.putDouble(a10, ((Number) value).doubleValue());
                    }
                } else if (value instanceof Boolean) {
                    writableNativeMap.putBoolean(a10, ((Boolean) value).booleanValue());
                } else if (value instanceof ReadableMap) {
                    writableNativeMap.putMap(a10, l(value));
                }
            }
            return writableNativeMap;
        }

        public Companion() {
        }
    }

    public /* synthetic */ RNZohoSalesIQCore(ReactApplicationContext reactApplicationContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext);
    }

    public static final Gson e() {
        return new Gson();
    }

    public RNZohoSalesIQCore(ReactApplicationContext reactApplicationContext) {
        f44617c = reactApplicationContext;
    }
}
