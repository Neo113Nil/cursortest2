package V0;

import B2.h;
import android.os.Bundle;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.y;
import u0.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12326a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12327b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f12328c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f12329d;

    /* renamed from: e, reason: collision with root package name */
    public final a.b f12330e;

    public b(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f12326a = MapsKt.toMutableMap(initialState);
        this.f12327b = new LinkedHashMap();
        this.f12328c = new LinkedHashMap();
        this.f12329d = new LinkedHashMap();
        this.f12330e = new a.b() { // from class: V0.a
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                Bundle e10;
                e10 = b.e(b.this);
                return e10;
            }
        };
    }

    public static final Bundle e(b bVar) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(bVar.f12329d).entrySet()) {
            bVar.f((String) entry.getKey(), ((y) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.toMap(bVar.f12327b).entrySet()) {
            bVar.f((String) entry2.getKey(), ((a.b) entry2.getValue()).a());
        }
        Map map = bVar.f12326a;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a10 = c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        h.a(a10);
        return a10;
    }

    public final Object b(String key) {
        Object value;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            y yVar = (y) this.f12329d.get(key);
            if (yVar != null && (value = yVar.getValue()) != null) {
                return value;
            }
            return this.f12326a.get(key);
        } catch (ClassCastException unused) {
            d(key);
            return null;
        }
    }

    public final a.b c() {
        return this.f12330e;
    }

    public final Object d(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object remove = this.f12326a.remove(key);
        this.f12328c.remove(key);
        return remove;
    }

    public final void f(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f12326a.put(key, obj);
        y yVar = (y) this.f12328c.get(key);
        if (yVar != null) {
            yVar.setValue(obj);
        }
        y yVar2 = (y) this.f12329d.get(key);
        if (yVar2 != null) {
            yVar2.setValue(obj);
        }
    }

    public /* synthetic */ b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
