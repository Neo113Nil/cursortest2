package ch;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f27839a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f27840b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Function1 supplier, Function1 close, int i10) {
        super(10, 0.75f, true);
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        this.f27839a = supplier;
        this.f27840b = close;
        this.f27841c = i10;
    }

    public /* bridge */ Set a() {
        return super.entrySet();
    }

    public /* bridge */ Set b() {
        return super.keySet();
    }

    public /* bridge */ int c() {
        return super.size();
    }

    public /* bridge */ Collection d() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (this.f27841c == 0) {
            return this.f27839a.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object invoke = this.f27839a.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry eldest) {
        Intrinsics.checkNotNullParameter(eldest, "eldest");
        boolean z10 = size() > this.f27841c;
        if (z10) {
            this.f27840b.invoke(eldest.getValue());
        }
        return z10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
