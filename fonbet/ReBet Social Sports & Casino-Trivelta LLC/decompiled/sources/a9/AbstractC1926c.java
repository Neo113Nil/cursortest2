package a9;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.h;
import com.google.gson.n;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1926c {
    public static final WritableArray a(h json) {
        Intrinsics.checkNotNullParameter(json, "json");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (json.i()) {
            Iterator it = json.c().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar.k()) {
                    Intrinsics.checkNotNull(hVar);
                    writableNativeArray.pushMap(b(hVar));
                } else if (hVar.i()) {
                    Intrinsics.checkNotNull(hVar);
                    writableNativeArray.pushArray(a(hVar));
                } else if (hVar.j()) {
                    writableNativeArray.pushNull();
                } else if (hVar.l()) {
                    n f10 = hVar.f();
                    if (f10.o()) {
                        writableNativeArray.pushBoolean(f10.a());
                    } else if (f10.q()) {
                        writableNativeArray.pushDouble(f10.m());
                    } else if (f10.r()) {
                        writableNativeArray.pushString(f10.h());
                    } else {
                        writableNativeArray.pushString(f10.h());
                    }
                } else {
                    writableNativeArray.pushString(hVar.h());
                }
            }
        }
        return writableNativeArray;
    }

    public static final WritableMap b(h json) {
        Intrinsics.checkNotNullParameter(json, "json");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (json.k()) {
            for (Map.Entry entry : json.e().q()) {
                Intrinsics.checkNotNull(entry);
                String str = (String) entry.getKey();
                h hVar = (h) entry.getValue();
                if (hVar.k()) {
                    Intrinsics.checkNotNull(str);
                    Intrinsics.checkNotNull(hVar);
                    writableNativeMap.putMap(str, b(hVar));
                } else if (hVar.i()) {
                    Intrinsics.checkNotNull(str);
                    Intrinsics.checkNotNull(hVar);
                    writableNativeMap.putArray(str, a(hVar));
                } else if (hVar.j()) {
                    Intrinsics.checkNotNull(str);
                    writableNativeMap.putNull(str);
                } else if (hVar.l()) {
                    n f10 = hVar.f();
                    if (f10.o()) {
                        Intrinsics.checkNotNull(str);
                        writableNativeMap.putBoolean(str, f10.a());
                    } else if (f10.q()) {
                        Intrinsics.checkNotNull(str);
                        writableNativeMap.putDouble(str, f10.m());
                    } else if (f10.r()) {
                        Intrinsics.checkNotNull(str);
                        writableNativeMap.putString(str, f10.h());
                    } else {
                        Intrinsics.checkNotNull(str);
                        writableNativeMap.putString(str, f10.h());
                    }
                } else {
                    Intrinsics.checkNotNull(str);
                    writableNativeMap.putString(str, hVar.h());
                }
            }
        }
        return writableNativeMap;
    }
}
